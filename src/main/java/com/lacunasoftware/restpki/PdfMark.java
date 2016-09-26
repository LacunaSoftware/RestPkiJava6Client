package com.lacunasoftware.restpki;

import java.util.ArrayList;
import java.util.List;
import java.awt.Color;

public class PdfMark {
    private PadesVisualRectangle container;
    private double borderWidth;
    private Color borderColor;
    private Color backgroundColor;
    private List<PdfMarkElement> elements;

    public PdfMark() {
        borderColor = Color.BLACK;
        backgroundColor = new Color(255, 255, 255, 0);
        elements = new ArrayList<PdfMarkElement>();
    }

    public PdfMarkModel toModel() {
        PdfMarkModel model = new PdfMarkModel();
        model.setContainer(container.toModel());

        model.setBackgroundColor(Util.convertColorToModel(backgroundColor));
        model.setBorderColor(Util.convertColorToModel(borderColor));
        model.setBorderWidth(borderWidth);

        List<PdfMarkElementModel> elementsModels = new ArrayList<PdfMarkElementModel>();
        for(PdfMarkElement element : elements) {
            elementsModels.add(element.toModel());
        }
        model.setElements(elementsModels);

        return model;
    }

    public PadesVisualRectangle getContainer() {
        return container;
    }

    public void setContainer(PadesVisualRectangle container) {
        this.container = container;
    }

    public double getBorderWidth() {
        return borderWidth;
    }

    public void setBorderWidth(double borderWidth) {
        this.borderWidth = borderWidth;
    }

    public Color getBorderColor() {
        return borderColor;
    }

    public void setBorderColor(Color borderColor) {
        this.borderColor = borderColor;
    }

    public Color getBackgroundColor() {
        return backgroundColor;
    }

    public void setBackgroundColor(Color backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    public List<PdfMarkElement> getElements() {
        return elements;
    }

    public void setElements(List<PdfMarkElement> elements) {
        this.elements = elements;
    }

    public void addElement(PdfMarkElement element) {
        this.elements.add(element);
    }
}
