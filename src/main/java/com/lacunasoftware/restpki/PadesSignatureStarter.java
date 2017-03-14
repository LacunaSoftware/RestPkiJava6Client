package com.lacunasoftware.restpki;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * Class used to perform the first of the two steps required to perform a PAdES signature.
 * <p>
 * 		Note on confidentiality: the PDF to be signed is stored on the server between the first and second steps,
 * 		but never unencrypted. The content is encrypted using AES-128 and <b>the key is not stored on the server</b>,
 * 		it is instead mixed into the token that is returned and which is necessary on the second step. In other
 * 		words, the server stores the PDF but is unable to read it on its own, therefore the PDF contents cannot be
 * 		compromised, even in the event of a complete data leakage.
 * </p>
 */
public class PadesSignatureStarter extends SignatureStarter {

	private byte[] pdfContent;
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
	public PadesSignatureStarter(RestPkiClient client) {
		super(client);
		pdfMarks = new ArrayList<PdfMark>();
		bypassMarksIfSigned = true;
		measurementUnits = PadesMeasurementUnits.Centimeters;
	}

	/**
	 * Sets the PDF to be signed
	 *
	 * @param stream a pre-opened InputStream linked to the PDF that will be signed. The stream is NOT closed by this method.
	 * @throws IOException if an error occurs while reading the stream.
	 */
	public void setPdfToSign(InputStream stream) throws IOException {
		this.pdfContent = Util.readStream(stream);
	}

	/**
	 * Sets the PDF to be signed
	 *
	 * @param content Binary content of the PDF
	 */
	public void setPdfToSign(byte[] content) {
		this.pdfContent = content;
	}

	/**
	 * Sets the file path of the PDF to be signed
	 *
	 * @param path File path of the PDF to be signed.
	 * @throws IOException if an error occurs while reading the file.
	 */
	public void setPdfToSign(String path) throws IOException {
		setPdfToSign(Paths.get(path));
	}

	/**
	 * Sets the file path of the PDF to be signed
	 *
	 * @param path File path of the PDF to be signed.
	 * @throws IOException if an error occurs while reading the file.
	 */
	public void setPdfToSign(Path path) throws IOException {
		this.pdfContent = Files.readAllBytes(path);
	}

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
	 * the Web PKI component on the client-side, use the startWithRestPki() method instead.
	 *
	 * @return An instance of ClientSideSignatureInstructions with the information necessary to perform the client-side
	 * signature and later call the server back with the results.
	 * @throws RestException if an error occurs when calling REST PKI
	 */
	@Override
	public ClientSideSignatureInstructions start() throws RestException {

		if (pdfContent == null) {
			throw new RuntimeException("The pdf to sign was not set");
		}
		if (certificate == null) {
			throw new RuntimeException("The certificate was not set");
		}
		if (signaturePolicyId == null) {
			throw new RuntimeException("The signature policy was not set");
		}

		PadesSignaturePostRequest request = new PadesSignaturePostRequest();
		request.setPdfToSign(new ObjectMapper().convertValue(pdfContent, String.class));
		request.setCertificate(certificate);
		request.setSignaturePolicyId(signaturePolicyId);
		request.setSecurityContextId(securityContextId);
		request.setCallbackArgument(callbackArgument);
		request.setBypassMarksIfSigned(bypassMarksIfSigned);
		if (visualRepresentation != null) {
			request.setVisualRepresentation(visualRepresentation.toModel());
		}
		if (measurementUnits != null) {
			request.setMeasurementUnits(PadesSignaturePostRequest.MeasurementUnitsEnum.valueOf(measurementUnits.toString()));
		}
		if (pageOptimization != null) {
			request.setPageOptimization(pageOptimization.toModel());
		}
		List<PdfMarkModel> pdfMarkModels = getPdfMarksModel();
		if (pdfMarkModels != null) {
			request.setPdfMarks(pdfMarkModels);
		}

		PadesSignaturePostResponse response = client.getRestClient().post("Api/PadesSignatures", request, PadesSignaturePostResponse.class);

		if (response.getCertificate() != null) {
			this.certificateInfo = new PKCertificate(response.getCertificate());
		}

		ClientSideSignatureInstructions signatureInstructions = new ClientSideSignatureInstructions(
				response.getToken(),
				response.getToSignData(),
				response.getToSignHash(),
				response.getDigestAlgorithmOid()
		);
		this.done = true;

		return signatureInstructions;
	}

	/**
	 * Performs the first step, should be called after setting the necessary parameters. This method should
	 * be used if the Web PKI component is being used on the client-side.
	 *
	 * @return The token that should be passed on the signWithRestPki method of the Web PKI component
	 * (on the client-side logic).
	 * @throws RestException if an error occurs when calling REST PKI
	 */
	@Override
	public String startWithWebPki() throws RestException {

		if (pdfContent == null) {
			throw new RuntimeException("The pdf to sign was not set");
		}
		if (signaturePolicyId == null) {
			throw new RuntimeException("The signature policy was not set");
		}

		PadesSignaturePostRequest request = new PadesSignaturePostRequest();
		request.setPdfToSign(new ObjectMapper().convertValue(pdfContent, String.class));
		request.setCertificate(certificate); // may be null
		request.setSignaturePolicyId(signaturePolicyId);
		request.setSecurityContextId(securityContextId);
		request.setCallbackArgument(callbackArgument);
		request.setBypassMarksIfSigned(bypassMarksIfSigned);
		if (visualRepresentation != null) {
			request.setVisualRepresentation(visualRepresentation.toModel());
		}
		if (measurementUnits != null) {
			request.setMeasurementUnits(PadesSignaturePostRequest.MeasurementUnitsEnum.valueOf(measurementUnits.toString()));
		}
		if (pageOptimization != null) {
			request.setPageOptimization(pageOptimization.toModel());
		}
		List<PdfMarkModel> pdfMarkModels = getPdfMarksModel();
		if (pdfMarkModels != null) {
			request.setPdfMarks(pdfMarkModels);
		}

		PadesSignaturePostResponse response = client.getRestClient().post("Api/PadesSignatures", request, PadesSignaturePostResponse.class);

		if (response.getCertificate() != null) {
			this.certificateInfo = new PKCertificate(response.getCertificate());
		}
		this.done = true;

		return response.getToken();
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
