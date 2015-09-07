package com.lacunasoftware.restpki;

public abstract class PadesVisualPositioning {

    private int pageNumber;
    private PadesMeasurementUnits measurementUnits;
    private PadesPageOptimization pageOptimization;

    public PadesVisualPositioning() {
    }

    public PadesVisualPositioning(int pageNumber, PadesMeasurementUnits measurementUnits) {
        this.pageNumber = pageNumber;
        this.measurementUnits = measurementUnits;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public PadesMeasurementUnits getMeasurementUnits() {
        return measurementUnits;
    }

    public void setMeasurementUnits(PadesMeasurementUnits measurementUnits) {
        this.measurementUnits = measurementUnits;
    }

    public PadesPageOptimization getPageOptimization() {
        return pageOptimization;
    }

    public void setPageOptimization(PadesPageOptimization pageOptimization) {
        this.pageOptimization = pageOptimization;
    }

    PadesVisualPositioningModel toModel() {
        PadesVisualPositioningModel model = new PadesVisualPositioningModel();
        model.setPageNumber(pageNumber);
        model.setMeasurementUnits(PadesVisualPositioningModel.MeasurementUnitsEnum.valueOf(measurementUnits.toString()));
        if (pageOptimization != null) {
            model.setPageOptimization(pageOptimization.toModel());
        }
        return model;
    }

    static PadesVisualPositioning createFromModel(PadesVisualPositioningModel model) {

        PadesVisualPositioning entity;
        if (model.getAuto() != null) {
            entity = new PadesVisualAutoPositioning();
        } else if (model.getManual() != null) {
            entity = new PadesVisualManualPositioning();
        } else {
            throw new RuntimeException("A PadesVisualPositionModel must have either the field Auto or Manual filled");
        }

        entity.setPageNumber(model.getPageNumber());
        entity.setMeasurementUnits(PadesMeasurementUnits.valueOf(model.getMeasurementUnits().toString()));
        if (model.getPageOptimization() != null) {
            entity.setPageOptimization(PadesPageOptimization.createFromModel(model.getPageOptimization()));
        }

        if (model.getAuto() != null) {

            PadesVisualAutoPositioning autoPos = (PadesVisualAutoPositioning)entity;
            autoPos.setContainer(PadesVisualRectangle.createFromModel(model.getAuto().getContainer()));
            autoPos.setSignatureRectangleSize(new PadesSize(model.getAuto().getSignatureRectangleSize().getWidth(), model.getAuto().getSignatureRectangleSize().getHeight()));
            autoPos.setRowSpacing(model.getAuto().getRowSpacing());

        } else {

            PadesVisualManualPositioning manualPos = (PadesVisualManualPositioning)entity;
            manualPos.setSignatureRectangle(PadesVisualRectangle.createFromModel(model.getManual()));

        }

        return entity;
    }

    public static PadesVisualAutoPositioning getFootnote(RestPkiClient client) throws RestException {
        return getFootnote(client, null, null);
    }

    public static PadesVisualAutoPositioning getFootnote(RestPkiClient client, Integer pageNumber, Integer rows) throws RestException {
        StringBuilder sb = new StringBuilder();
        sb.append("Footnote");
        if (pageNumber != null) {
            sb.append("?pageNumber=" + pageNumber);
        }
        if (rows != null) {
            sb.append("?rows=" + rows);
        }
        PadesVisualPositioning position = getPreset(client, sb.toString());
        return (PadesVisualAutoPositioning)position;
    }

    public static PadesVisualAutoPositioning getNewPage(RestPkiClient client) throws RestException {
        PadesVisualPositioning position = getPreset(client, "NewPage");
        return (PadesVisualAutoPositioning)position;
    }

    private static PadesVisualPositioning getPreset(RestPkiClient client, String urlSegment) throws RestException {
        PadesVisualPositioningModel model = client.getRestClient().get("Api/PadesVisualPositioningPresets/" + urlSegment, PadesVisualPositioningModel.class);
        return createFromModel(model);
    }
}
