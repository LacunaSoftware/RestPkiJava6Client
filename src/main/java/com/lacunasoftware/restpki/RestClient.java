package com.lacunasoftware.restpki;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.rmi.server.ExportException;

class RestClient {

    private String endpointUri;
    private String authToken;

    public RestClient(String endpointUri) {
        this.endpointUri = endpointUri;
    }

    public RestClient(String endpointUri, String authToken) {
        this.endpointUri = endpointUri;
        this.authToken = authToken;
    }

    public <TResponse> TResponse get(String requestUri, Class<TResponse> responseType) throws RestException {

        String verb = "GET";
        String url = endpointUri + requestUri;
        HttpURLConnection conn;

        try {

            URL urlObj = new URL(url);
            conn = (HttpURLConnection) urlObj.openConnection();
            conn.setRequestMethod(verb);
            conn.setRequestProperty("Accept", "application/json");
            if (authToken != null) {
                conn.setRequestProperty("Authorization", "Bearer " + authToken);
            }

        } catch (Exception e) {
            throw new RestUnreachableException(verb, url, e);
        }

        checkResponse(verb, url, conn);

        TResponse response;

        try {
            InputStream inStream = conn.getInputStream();
            response = new ObjectMapper().readValue(inStream, responseType);
            inStream.close();
        } catch (Exception e) {
            throw new RestDecodeException(verb, url, e);
        }

        conn.disconnect();
        return response;
    }

    public <TRequest, TResponse> TResponse post(String requestUri, TRequest request, Class<TResponse> responseType) throws RestException {

        String verb = "POST";
        String url = endpointUri + requestUri;
        HttpURLConnection conn;

        try {

            URL urlObj = new URL(url);
            conn = (HttpURLConnection) urlObj.openConnection();
            conn.setDoOutput(true);
            conn.setRequestMethod(verb);
            conn.setRequestProperty("Content-Type", "application/json");
            conn.setRequestProperty("Accept", "application/json");
            if (authToken != null) {
                conn.setRequestProperty("Authorization", "Bearer " + authToken);
            }

            OutputStream outStream = conn.getOutputStream();
            new ObjectMapper().writeValue(outStream, request);
            outStream.close();

        } catch (Exception e) {
            throw new RestUnreachableException(verb, url, e);
        }

        checkResponse(verb, url, conn);

        TResponse response;

        try {
            InputStream inStream = conn.getInputStream();
            response = new ObjectMapper().readValue(inStream, responseType);
            inStream.close();
        } catch (Exception e) {
            throw new RestDecodeException(verb, url, e);
        }

        conn.disconnect();
        return response;
    }

    private void checkResponse(String verb, String url, HttpURLConnection conn) throws RestException {

        int statusCode;

        try {
            statusCode = conn.getResponseCode();
        } catch (Exception e) {
            throw new RestUnreachableException(verb, url, e);
        }

        if (statusCode < 200 || statusCode > 299) {

            RestException ex = null;

            try {

                if (statusCode == 404) {

                    RestResourceNotFoundModel model = readErrorResponse(conn, RestResourceNotFoundModel.class);
                    if (model != null) {
                        if (!Util.isNullOrEmpty(model.resourceName) && !Util.isNullOrEmpty(model.resourceId)) {
                            ex = new RestResourceNotFoundException(verb, url, model.resourceName, model.resourceId);
                        } else {
                            ex = new RestErrorException(verb, url, statusCode, model.message);
                        }
                    }

                } else if (statusCode == 422) {

                    ErrorModel errorModel = readErrorResponse(conn, ErrorModel.class);
                    ErrorCodes errorCode = ErrorCodes.valueOf(errorModel.code);
                    if (errorCode.equals(ErrorCodes.ValidationError)) {
                        ex = new ValidationException(verb, url, new ValidationResults(errorModel.validationResults));
                    } else {
                        ex = new RestPkiException(verb, url, errorCode, errorModel.detail);
                    }

                } else {

                    RestGeneralErrorModel model = readErrorResponse(conn, RestGeneralErrorModel.class);
                    if (model != null && !Util.isNullOrEmpty(model.message)) {
                        ex = new RestErrorException(verb, url, statusCode, model.message);
                    }

                }

            } catch (Exception e) {
                // do nothing
                //throw new RuntimeException("Error decoding error", e);
            }

            if (ex == null) {
                ex = new RestErrorException(verb, url, statusCode);
            }
            throw ex;
        }
    }

    private <T> T readResponse(HttpURLConnection conn, Class<T> valueType) throws IOException {
        InputStream inStream = conn.getInputStream();
        T response = new ObjectMapper().readValue(inStream, valueType);
        inStream.close();
        return response;
    }

    private <T> T readErrorResponse(HttpURLConnection conn, Class<T> valueType) throws IOException {
        InputStream inStream = conn.getErrorStream();
        T response = new ObjectMapper().readValue(inStream, valueType);
        inStream.close();
        return response;
    }
}
