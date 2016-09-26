package com.lacunasoftware.restpki;

import java.util.ArrayList;
import java.util.List;

public abstract class PdfMarkElement {

    protected PdfMarkElementType elementType;
    protected PadesVisualRectangle relativeContainer;
    protected Integer rotation;

    public PdfMarkElement(PdfMarkElementType type) {
        elementType = type;
    }

    public PdfMarkElement(PdfMarkElementType type, PadesVisualRectangle relativeContainer) {
        this(type);
        this.relativeContainer = relativeContainer;
    }

    public PdfMarkElementModel toModel() {
        PdfMarkElementModel model = new PdfMarkElementModel();
        model.setElementType(PdfMarkElementModel.ElementTypeEnum.valueOf(elementType.toString()));
        if (relativeContainer != null) {
            model.setRelativeContainer(relativeContainer.toModel());
        }
        model.setRotation(rotation);

        return model;
    }

    public PdfMarkElementType getElementType() {
        return elementType;
    }

    public void setElementType(PdfMarkElementType elementType) {
        this.elementType = elementType;
    }

    public PadesVisualRectangle getRelativeContainer() {
        return relativeContainer;
    }

    public void setRelativeContainer(PadesVisualRectangle relativeContainer) {
        this.relativeContainer = relativeContainer;
    }

    public Integer getRotation() {
        return rotation;
    }

    public void setRotation(Integer rotation) {
        this.rotation = rotation;
    }

}
