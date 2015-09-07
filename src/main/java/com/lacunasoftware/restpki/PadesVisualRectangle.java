package com.lacunasoftware.restpki;

public class PadesVisualRectangle {

    private Double left;
    private Double top;
    private Double right;
    private Double bottom;
    private Double width;
    private Double height;

    public PadesVisualRectangle() {
    }

    public Double getLeft() {
        return left;
    }

    public void setLeft(Double left) {
        this.left = left;
    }

    public Double getTop() {
        return top;
    }

    public void setTop(Double top) {
        this.top = top;
    }

    public Double getRight() {
        return right;
    }

    public void setRight(Double right) {
        this.right = right;
    }

    public Double getBottom() {
        return bottom;
    }

    public void setBottom(Double bottom) {
        this.bottom = bottom;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public void setWidthCentered(double width) {
        this.width = width;
        this.left = null;
        this.right = null;
    }

    public void setWidthLeftAnchored(double width, double left) {
        this.width = width;
        this.left = left;
        this.right = null;
    }

    public void setWidthRightAnchored(double width, double right) {
        this.width = width;
        this.left = null;
        this.right = right;
    }

    public void setHorizontalStretch(double left, double right) {
        this.width = null;
        this.left = left;
        this.right = right;
    }

    public void setHeightCentered(double height) {
        this.height = height;
        this.top = null;
        this.bottom = null;
    }

    public void setHeightTopAnchored(double height, double top) {
        this.height = height;
        this.top = top;
        this.bottom = null;
    }

    public void setHeightBottomAnchored(double height, double bottom) {
        this.height = height;
        this.top = null;
        this.bottom = bottom;
    }

    public void setVerticalStretch(double top, double bottom) {
        this.height = null;
        this.top = top;
        this.bottom = bottom;
    }

    public PadesVisualRectangleModel toModel() {
        PadesVisualRectangleModel model = new PadesVisualRectangleModel();
        model.setLeft(left);
        model.setTop(top);
        model.setRight(right);
        model.setBottom(bottom);
        model.setWidth(width);
        model.setHeight(height);
        return model;
    }

    static PadesVisualRectangle createFromModel(PadesVisualRectangleModel model) {
        PadesVisualRectangle entity = new PadesVisualRectangle();
        entity.left = model.getLeft();
        entity.top = model.getTop();
        entity.right = model.getRight();
        entity.bottom = model.getBottom();
        entity.width = model.getWidth();
        entity.height = model.getHeight();
        return entity;
    }
}