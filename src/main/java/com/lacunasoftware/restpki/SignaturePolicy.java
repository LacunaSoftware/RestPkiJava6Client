package com.lacunasoftware.restpki;

/**
 * Created by desenv on 27/08/2015.
 */
public class SignaturePolicy {

    public static final SignaturePolicy CadesBes = new SignaturePolicy("a4522485-c9e5-46c3-950b-0d6e951e17d1");
    public static final SignaturePolicy PkiBrazilAdrBasica = new SignaturePolicy("3ddd8001-1672-4eb5-a4a2-6e32b17ddc46");
    public static final SignaturePolicy PkiBrazilAdrTempo = new SignaturePolicy("a5332ad1-d105-447c-a4bb-b5d02177e439");
    public static final SignaturePolicy PkiBrazilAdrValidacao = new SignaturePolicy("92378630-dddf-45eb-8296-8fee0b73d5bb");
    public static final SignaturePolicy PkiBrazilAdrCompleta = new SignaturePolicy("30d881e7-924a-4a14-b5cc-d5a1717d92f6");
    public static final SignaturePolicy PadesBasic = new SignaturePolicy("78d20b33-014d-440e-ad07-929f05d00cdf");


    private String id;

    public SignaturePolicy(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}
