package com.lacunasoftware.restpki;

public class PadesVisualAutoPositioning extends PadesVisualPositioning {

    private PadesVisualRectangle container;
    private PadesSize signatureRectangleSize;
    private double rowSpacing;

    public PadesVisualAutoPositioning() {
        super();
    }

    public PadesVisualAutoPositioning(int pageNumber, PadesMeasurementUnits measurementUnits, PadesVisualRectangle container, PadesSize signatureRectangleSize, double rowSpacing) {
        super(pageNumber, measurementUnits);
        this.container = container;
        this.signatureRectangleSize = signatureRectangleSize;
        this.rowSpacing = rowSpacing;
    }

    public PadesVisualRectangle getContainer() {
        return container;
    }

    public void setContainer(PadesVisualRectangle container) {
        this.container = container;
    }

    public PadesSize getSignatureRectangleSize() {
        return signatureRectangleSize;
    }

    public void setSignatureRectangleSize(PadesSize signatureRectangleSize) {
        this.signatureRectangleSize = signatureRectangleSize;
    }

    public double getRowSpacing() {
        return rowSpacing;
    }

    public void setRowSpacing(double rowSpacing) {
        this.rowSpacing = rowSpacing;
    }
    
    @Override
    PadesVisualPositioningModel toModel() {
        PadesVisualPositioningModel model = super.toModel();
        PadesVisualAutoPositioningModel auto = new PadesVisualAutoPositioningModel();
        auto.setContainer(container.toModel());
        auto.setSignatureRectangleSize(signatureRectangleSize.toModel());
        auto.setRowSpacing(rowSpacing);
        model.setAuto(auto);
        return model;
    }
    
}
