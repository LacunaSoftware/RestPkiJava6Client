package com.lacunasoftware.restpki;

public class PdfMarkImageElement extends PdfMarkElement {
    private PdfMarkImage image;

    public PdfMarkImageElement() { super(PdfMarkElementType.Image); }

    public PdfMarkImageElement(PadesVisualRectangle relativeContainer, PdfMarkImage image) {
        super(PdfMarkElementType.Image, relativeContainer);
        this.image = image;
    }

    @Override
    public PdfMarkElementModel toModel() {
        PdfMarkElementModel model = super.toModel();
        model.setImage(image.toModel());
        return model;
    }

    public PdfMarkImage getImage() {
        return image;
    }

    public void setImage(PdfMarkImage image) {
        this.image = image;
    }
}
