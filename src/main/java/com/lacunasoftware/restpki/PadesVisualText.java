package com.lacunasoftware.restpki;

/**
 * The text specifications and elements for the PAdES signature visual representation
 */
public class PadesVisualText {

    private Double fontSize;
    private String text;
    private Boolean includeSigningTime;

    public PadesVisualText() {
    }

    /**
     * Creates a Text default specification for PAdES signature visual representation
     * @param text Text to be written on the signature visual representation. The text may contain tags in the format
     *             {{tagName}} which will be substituted with according values. The supported tags are {{signerName}} and
     *             {{signerNationalId}}.
     */
    public PadesVisualText(String text) {
        this.text = text;
    }

    /**
     * Creates a Text specification for PAdES signature visual representation
     * @param text Text to be written on the signature visual representation. The text may contain tags in the format
     *             {{tagName}} which will be substituted with according values. The supported tags are {{signerName}} and
     *             {{signerNationalId}}.
     * @param includeSigningTime Whether or not to include the signing date in the signature representation
     */
    public PadesVisualText(String text, boolean includeSigningTime) {
        this.text = text;
        this.includeSigningTime = includeSigningTime;
    }

    /**
     * Creates a Text specification for PAdES signature visual representation
     * @param text Text to be written on the signature visual representation. The text may contain tags in the format
     *             {{tagName}} which will be substituted with according values. The supported tags are {{signerName}} and
     *             {{signerNationalId}}.
     * @param fontSize The text font size. If not set, default is an auto adjustable font size based on the signature
     *                 rectangle dimensions
     */
    public PadesVisualText(String text, double fontSize) {
        this.text = text;
        this.fontSize = fontSize;
    }

    /**
     * Creates a Text specification for PAdES signature visual representation
     * @param text Text to be written on the signature visual representation. The text may contain tags in the format
     *             {{tagName}} which will be substituted with according values. The supported tags are {{signerName}}
     *             and {{signerNationalId}}.
     * @param includeSigningTime Whether or not to include the signing date in the signature representation
     * @param fontSize The text font size. If not set, default is an auto adjustable font size based on the signature
     *                 rectangle dimensions
     */
    public PadesVisualText(String text, boolean includeSigningTime, double fontSize) {
        this.text = text;
        this.includeSigningTime = includeSigningTime;
        this.fontSize = fontSize;
    }

    public Double getFontSize() {
        return fontSize;
    }

    /**
     * Sets the text font size
     * @param fontSize The text font size. If not set, default is an auto adjustable font size based on the signature
     *                 rectangle dimensions
     */
    public void setFontSize(Double fontSize) {
        this.fontSize = fontSize;
    }

    public String getText() {
        return text;
    }

    /**
     * Sets the text to be written on the signature visual representation.
     * @param text Text to be written on the signature visual representation. The text may contain tags in the format
     *             {{tagName}} which will be substituted with according values. The supported tags are {{signerName}}
     *             and {{signerNationalId}}.
     */
    public void setText(String text) {
        this.text = text;
    }

    public Boolean getIncludeSigningTime() {
        return includeSigningTime;
    }

    /**
     * Sets whether or not to include the signing date in the signature representation
     * @param includeSigningTime Whether or not to include the signing date in the signature representation
     */
    public void setIncludeSigningTime(Boolean includeSigningTime) {
        this.includeSigningTime = includeSigningTime;
    }

    public PadesVisualTextModel toModel() {
        PadesVisualTextModel model = new PadesVisualTextModel();
        model.setFontSize(fontSize);
        model.setText(text);
        model.setIncludeSigningTime(includeSigningTime);
        return model;
    }
}
