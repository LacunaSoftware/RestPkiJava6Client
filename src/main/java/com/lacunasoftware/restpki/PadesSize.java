package com.lacunasoftware.restpki;

/**
 * Width and Height sizes for PAdES signature visual representation elements
 */
public class PadesSize {

	private double height;
	private double width;

	public PadesSize(double width, double height) {
		this.height = height;
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public PadesSizeModel toModel() {
		PadesSizeModel model = new PadesSizeModel();
		model.setWidth(width);
		model.setHeight(height);
		return model;
	}
}
