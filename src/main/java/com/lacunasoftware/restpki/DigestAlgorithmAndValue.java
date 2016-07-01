package com.lacunasoftware.restpki;

/**
 * Represents a digest algorithm and value.
 */
public class DigestAlgorithmAndValue {

    private DigestAlgorithm algorithm;
    private byte[] value;

    DigestAlgorithmAndValue(DigestAlgorithmAndValueModel model) {
        this.algorithm = DigestAlgorithm.getInstanceByApiModel(model.getAlgorithm());
        this.value = Util.decodeBase64(model.getValue());
    }

    /**
     * Returns the digest algorithm.
     */
    public DigestAlgorithm getAlgorithm() {
        return algorithm;
    }

    /**
     * Returns the digest value.
     */
    public byte[] getValue() {
        return value;
    }
}
