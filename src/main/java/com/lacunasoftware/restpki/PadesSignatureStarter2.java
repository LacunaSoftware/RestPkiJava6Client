package com.lacunasoftware.restpki;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class PadesSignatureStarter2 extends SignatureStarter2 {

    private FileReference pdfToSign;
    private PadesVisualRepresentation visualRepresentation;
    private List<PdfMark> pdfMarks;
    private boolean bypassMarksIfSigned;
    private PadesPageOptimization pageOptimization;
    private PadesMeasurementUnits measurementUnits;

    /**
     * Create a new instance using the given RestPkiClient.
     *
     * @param client the RestPkiClient which shall be used.
     */
    public PadesSignatureStarter2(RestPkiClient client) {
        super(client);
        pdfMarks = new ArrayList<PdfMark>();
        bypassMarksIfSigned = true;
        measurementUnits = PadesMeasurementUnits.Centimeters;
    }

    //region setPdfToSign

    /**
     * Sets the PDF to be signed via a stream object
     *
     * @param stream a pre-opened InputStream linked to the PDF that will be signed. The stream is NOT closed by this
     * method.
     */
    public void setPdfToSign(InputStream stream) {
        this.pdfToSign = FileReference.fromStream(stream);
    }

    /**
     * Sets the PDF to be signed via a byte array
     *
     * @param content Binary content of the PDF
     */
    public void setPdfToSign(byte[] content) {
        this.pdfToSign = FileReference.fromContent(content);
    }

    /**
     * Sets the file path of the PDF to be signed
     *
     * @param path File path of the PDF to be signed.
     */
    public void setPdfToSign(String path) {
        setPdfToSign(new File(path));
    }

    /**
     * Sets the PDF to be signed
     *
     * @param file The PDF to be signed.
     */
    public void setPdfToSign(File file) {
        this.pdfToSign = FileReference.fromFile(file);
    }

    /**
     * Sets the PDF to be signed from a previous signature's result to be co-signed
     *
     * @param fileResult FileResult from previous signature with Rest PKI
     */
    public void setPdfToSign(FileResult fileResult) {
        this.pdfToSign = FileReference.fromResult(fileResult);
    }

    //endregion

    /**
     * Denotes whether to bypass the PDF marks if the PDF is already signed (default true). PDF marks can
     * only be added if the PDF has no previous signatures. This property controls the behavior when
     * PDF marks are requested but the PDF already contains signatures. If true (default), the marks are
     * simply bypassed. If false, an error is returned.
     * @param bypassMarksIfSigned Chosen behavior
     */
    public void setBypassMarksIfSigned(boolean bypassMarksIfSigned) {
        this.bypassMarksIfSigned = bypassMarksIfSigned;
    }

    /**
     * Optional, sets the page size used to calculate the conversion between centimeter measurements
     * and PDF points. If omitted, the page size is automatically detected between A4, Legal or Letter.
     * @param pageOptimization Page size and orientation
     */
    public void setPageOptimization(PadesPageOptimization pageOptimization) {
        this.pageOptimization = pageOptimization;
    }

    /**
     * Optional, sets the unit of measurement used to edit the pdf marks and visual representations
     * @param measurementUnits Unit of Measurement
     */
    public void setMeasurementUnits(PadesMeasurementUnits measurementUnits) {
        this.measurementUnits = measurementUnits;
    }

    /**
     * Optional, sets the settings for the signature's visual representation.
     *
     * @param visualRepresentation The visual representation's settings.
     */
    public void setVisualRepresentation(PadesVisualRepresentation visualRepresentation) {
        this.visualRepresentation = visualRepresentation;
    }

    /**
     * Optional, sets the setting to mark the pdf with the signature
     *
     * @param pdfMarks List with PDF marks
     */
    public void setPdfMarks(List<PdfMark> pdfMarks) {
        this.pdfMarks = pdfMarks;
    }

    /**
     * Adds a new PDF mark to the list
     *
     * @param pdfMark PDF mark
     */
    public void addPdfMark(PdfMark pdfMark) {
        if (pdfMarks == null) {
            setPdfMarks(new ArrayList<PdfMark>());
        }
        pdfMarks.add(pdfMark);
    }

    /**
     * Performs the first step, should be called after setting the necessary parameters. If you intend to use
     * the Web PKI component on the client-side, use the startWithWebPki() method instead.
     *
     * @return An instance of SignatureStartResult with the information necessary to perform the client-side
     * signature and later call the server back with the results.
     * @throws RestException if an error occurs when calling REST PKI.
     * @throws IOException if an error occurs when trying to obtain the file to be signed or be cosign or when trying
     * to compute all hashes from this file, both files had to be provided before this method is called.
     */
    @Override
    public SignatureStartResult start() throws RestException, IOException {

        if (certificate == null) {
            throw new RuntimeException("The certificate was not set");
        }

        PadesSignaturePostResponse response = startCommon();

        return new SignatureStartResult(
            response.getToken(),
            response.getCertificate(),
            response.getToSignData(),
            response.getToSignHash(),
            response.getDigestAlgorithmOid()
        );
    }

    /**
     * Performs the first step, should be called after setting the necessary parameters. This method should
     * be used if the Web PKI component is being used on the client-side.
     *
     * @return An instance of SignatureStartWithWebPkiResult containing the token that should be passed on the
     * signWithRestPki() method of the Web PKI component (on the client-side logic) and the signer's certificate.
     * @throws RestException if an error occurs when calling REST PKI.
     * @throws IOException if an error occurs when trying to obtain the file to be signed or be cosign or when trying
     * to compute all hashes from this file, both files had to be provided before this method is called.
     */
    @Override
    public SignatureStartWithWebPkiResult startWithWebPki() throws RestException, IOException {

        PadesSignaturePostResponse response = startCommon();

        return new SignatureStartWithWebPkiResult(
            response.getToken(),
            response.getCertificate()
        );
    }

    private PadesSignaturePostResponse startCommon() throws RestException, IOException {

        if (pdfToSign == null) {
            throw new RuntimeException("The pdf to sign was not set");
        }
        if (signaturePolicyId == null) {
            throw new RuntimeException("The signature policy was not set");
        }

        int apiVersion = client.getApiVersion(Apis.StartPades);
        switch (apiVersion) {
            case 1:
                return startCommonV1();
            default:
                return startCommonV2();
        }
    }

    private PadesSignaturePostResponse startCommonV2() throws RestException, IOException {

        PadesSignaturePostRequestV2 request = new PadesSignaturePostRequestV2();
        request.setCertificate(certificate); // may be null
        request.setSignaturePolicyId(signaturePolicyId);
        request.setSecurityContextId(securityContextId);
        request.setCallbackArgument(callbackArgument);
        request.setBypassMarksIfSigned(bypassMarksIfSigned);
        request.setIgnoreRevocationStatusUnknown(ignoreRevocationStatusUnknown);
        if (visualRepresentation != null) {
            request.setVisualRepresentation(visualRepresentation.toModel());
        }
        if (measurementUnits != null) {
            request.setMeasurementUnits(PadesSignaturePostRequestV2.MeasurementUnitsEnum.valueOf(measurementUnits.toString()));
        }
        if (pageOptimization != null) {
            request.setPageOptimization(pageOptimization.toModel());
        }
        List<PdfMarkModel> pdfMarkModels = getPdfMarksModel();
        if (pdfMarkModels != null) {
            request.setPdfMarks(pdfMarkModels);
        }

        request.setPdfToSign(pdfToSign.uploadOrReference(client));

        return client.getRestClient().post("Api/v2/PadesSignatures", request, PadesSignaturePostResponse.class);
    }

    private PadesSignaturePostResponse startCommonV1() throws RestException, IOException {

        PadesSignaturePostRequestV1 request = new PadesSignaturePostRequestV1();
        request.setCertificate(certificate); // may be null
        request.setSignaturePolicyId(signaturePolicyId);
        request.setSecurityContextId(securityContextId);
        request.setCallbackArgument(callbackArgument);
        request.setBypassMarksIfSigned(bypassMarksIfSigned);
        request.setIgnoreRevocationStatusUnknown(ignoreRevocationStatusUnknown);
        if (visualRepresentation != null) {
            request.setVisualRepresentation(visualRepresentation.toModel());
        }
        if (measurementUnits != null) {
            request.setMeasurementUnits(PadesSignaturePostRequestV1.MeasurementUnitsEnum.valueOf(measurementUnits.toString()));
        }
        if (pageOptimization != null) {
            request.setPageOptimization(pageOptimization.toModel());
        }
        List<PdfMarkModel> pdfMarkModels = getPdfMarksModel();
        if (pdfMarkModels != null) {
            request.setPdfMarks(pdfMarkModels);
        }

        request.setPdfToSign(pdfToSign.getContentBase64());

        return client.getRestClient().post("Api/PadesSignatures", request, PadesSignaturePostResponse.class);
    }

    private List<PdfMarkModel> getPdfMarksModel() {
        if (pdfMarks == null || pdfMarks.size() == 0) {
            return null;
        } else {
            List<PdfMarkModel> pdfMarkModels = new ArrayList<PdfMarkModel>();
            for(PdfMark mark : pdfMarks) {
                pdfMarkModels.add(mark.toModel());
            }
            return pdfMarkModels;
        }
    }
}
