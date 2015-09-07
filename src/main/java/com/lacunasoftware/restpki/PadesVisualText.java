package com.lacunasoftware.restpki;

public class PadesVisualText {

    private Double fontSize;
    private String text;
    private Boolean includeSigningTime;

    public PadesVisualText() {
    }

    public PadesVisualText(String text) {
        this.text = text;
    }

    public PadesVisualText(String text, boolean includeSigningTime) {
        this.text = text;
        this.includeSigningTime = includeSigningTime;
    }

    public PadesVisualText(String text, double fontSize) {
        this.text = text;
        this.fontSize = fontSize;
    }

    public PadesVisualText(String text, boolean includeSigningTime, double fontSize) {
        this.text = text;
        this.includeSigningTime = includeSigningTime;
        this.fontSize = fontSize;
    }

    public Double getFontSize() {
        return fontSize;
    }

    public void setFontSize(Double fontSize) {
        this.fontSize = fontSize;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Boolean getIncludeSigningTime() {
        return includeSigningTime;
    }

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
