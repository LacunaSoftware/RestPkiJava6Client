package com.lacunasoftware.restpki;

public class PadesSignatureFinisher2 extends SignatureFinisher2 {

    /**
     * Create a new instance using the given RestPkiClient.
     *
     * @param client the RestPkiClient which shall be used.
     */
    public PadesSignatureFinisher2(RestPkiClient client) {
        super(client);
    }

    @Override
    protected void checkCompatibility() {
        int apiVersion = client.getApiVersion(Apis.CompletePades);

        if (apiVersion < 2) {
            throw new RuntimeException("The PadesSignatureFinisher2 class can only be used with " +
                    "Rest PKI 1.11 or later. Either update your Rest PKI or use the older PadesSignatureFinisher " +
                    "class.");
        }
    }

    @Override
    protected String getApiRoute() {
        return String.format("Api/v2/PadesSignatures/%s/SignedBytes", token);
    }
}
