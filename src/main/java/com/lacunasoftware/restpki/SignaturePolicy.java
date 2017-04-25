package com.lacunasoftware.restpki;

/**
 * Reference to a signature policy, used to perform and validate digital signatures.
 */
public class SignaturePolicy {

    /**
     * CAdES Basic Eletronic Signature policy
     */
    public static final SignaturePolicy CadesBes = new SignaturePolicy("a4522485-c9e5-46c3-950b-0d6e951e17d1");

    /**
     * CAdES Basic Eletronic Signature with signing-time and no CRLs
     */
    public static final SignaturePolicy CadesBesWithSigningTimeAndNoCrls = new SignaturePolicy("8108539d-c137-4f45-a1f2-de5305bc0a3");

    /**
     * ICP-Brasil CAdES (AD-RB)  Assinatura Digital com Referencia Básica
     */
    public static final SignaturePolicy PkiBrazilAdrBasica = new SignaturePolicy("3ddd8001-1672-4eb5-a4a2-6e32b17ddc46");

    /**
     * ICP-Brasil CAdES (AD-RT)  Assinatura Digital com Referencia do Tempo
     */
    public static final SignaturePolicy PkiBrazilAdrTempo = new SignaturePolicy("a5332ad1-d105-447c-a4bb-b5d02177e439");

//    /**
//     * ICP-Brasil CAdES (AD-RV)  Assinatura Digital com Referencia para Validacao
//     */
//    public static final SignaturePolicy PkiBrazilAdrValidacao = new SignaturePolicy("92378630-dddf-45eb-8296-8fee0b73d5bb");

    /**
     * ICP-Brasil CAdES (AD-RC)  Assinatura Digital com Referencias Completas
     */
    public static final SignaturePolicy PkiBrazilAdrCompleta = new SignaturePolicy("30d881e7-924a-4a14-b5cc-d5a1717d92f6");

    /**
     * PAdES basic signature policy
     */
    public static final SignaturePolicy PadesBasic = new SignaturePolicy("78d20b33-014d-440e-ad07-929f05d00cdf");

    /**
     * ICP-Brasil PAdES (AD-RB) Assinatura Digital com Referencia Básica
     */
    public static final SignaturePolicy PkiBrazilPadesAdrBasica = new SignaturePolicy("531d5012-4c0d-4b6f-89e8-ebdcc605d7c2");

    /**
     * ICP-Brasil PAdES (AD-RT) Assinatura Digital com Referencia do Tempo
     */
    public static final SignaturePolicy PkiBrazilPadesAdrTempo = new SignaturePolicy("10f0d9a5-a0a9-42e9-9523-e181ce05a25b");

    /**
     * Pades basic with ICP-Brasil certificates
     */
    public static final SignaturePolicy PadesBasicWithPkiBrazilCerts = new SignaturePolicy("3fec800c-366c-49bf-82c5-2e72154e70f6");

    /**
     * PAdES-T with ICP-Brasil certificates
     */
    public static final SignaturePolicy PadesTWithPkiBrazilCerts = new SignaturePolicy("6a39aeea-a2d0-4754-bf8c-19da15296ddb");

    /**
     * XAdES basic signature policy
     */
    public static final SignaturePolicy XadesBes = new SignaturePolicy("1beba282-d1b6-4458-8e46-bd8ad6800b54");

    /**
     * XML-DSig basic signature policy
     */
    public static final SignaturePolicy XmlDSigBasic = new SignaturePolicy("2bb5d8c9-49ba-4c62-8104-8141f6459d08");

    /**
     * ICP-Brasil XAdES (AD-RB) Assinatura Digital com Referencia Básica
     */
    public static final SignaturePolicy PkiBrazilXadesAdrBasica = new SignaturePolicy("1cf5db62-58b6-40ba-88a3-d41bada9b621");

    /**
     * ICP-Brasil XAdES (AD-RT) Assinatura Digital com Referencia do Tempo
     */
    public static final SignaturePolicy PkiBrazilXadesAdrTempo = new SignaturePolicy("5aa2e0af-5269-43b0-8d45-f4ef52921f04");

    /**
     * NFe (Brazilian electronic invoice) signature policy
     */
    public static final SignaturePolicy NFePadraoNacional = new SignaturePolicy("a3c24251-d43a-4ba4-b25d-ee8e2ab24f06");


    private String id;

    /**
     * Creates a reference to a custom signature policy.
     * @param id The id of the signature policy, as given by the REST PKI website.
     */
    public SignaturePolicy(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}
