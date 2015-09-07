package com.lacunasoftware.restpki;

public class PadesVisualRepresentation {

    private PadesVisualText text;
    private PadesVisualImage image;
    private PadesVisualPositioning position;

    public PadesVisualRepresentation() {
    }

    public PadesVisualRepresentation(PadesVisualText text, PadesVisualImage image, PadesVisualPositioning position) {
        this.text = text;
        this.image = image;
        this.position = position;
    }

    public PadesVisualText getText() {
        return text;
    }

    public void setText(PadesVisualText text) {
        this.text = text;
    }

    public PadesVisualImage getImage() {
        return image;
    }

    public void setImage(PadesVisualImage image) {
        this.image = image;
    }

    public PadesVisualPositioning getPosition() {
        return position;
    }

    public void setPosition(PadesVisualPositioning position) {
        this.position = position;
    }

    PadesVisualRepresentationModel toModel() {
        PadesVisualRepresentationModel model = new PadesVisualRepresentationModel();
        model.setText(text.toModel());
        model.setImage(image.toModel());
        model.setPosition(position.toModel());
        return model;
    }
}
