package com.lacunasoftware.restpki;

public class PadesVisualManualPositioning extends PadesVisualPositioning {

    private PadesVisualRectangle signatureRectangle;

    public PadesVisualManualPositioning() {
        super();
    }

    public PadesVisualManualPositioning(int pageNumber, PadesMeasurementUnits measurementUnits, PadesVisualRectangle signatureRectangle) {
        super(pageNumber, measurementUnits);
        this.signatureRectangle = signatureRectangle;
    }

    public PadesVisualRectangle getSignatureRectangle() {
        return signatureRectangle;
    }

    public void setSignatureRectangle(PadesVisualRectangle signatureRectangle) {
        this.signatureRectangle = signatureRectangle;
    }

    @Override
    PadesVisualPositioningModel toModel() {
        PadesVisualPositioningModel model = super.toModel();
        model.setManual(signatureRectangle.toModel());
        return model;
    }

}
