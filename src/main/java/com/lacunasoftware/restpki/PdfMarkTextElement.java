package com.lacunasoftware.restpki;

import java.util.ArrayList;
import java.util.List;

public class PdfMarkTextElement extends PdfMarkElement {
    private List<PdfTextSection> textSections;

    public PdfMarkTextElement() {
        super(PdfMarkElementType.Text);
        textSections = new ArrayList<PdfTextSection>();
    }

    public PdfMarkTextElement(PadesVisualRectangle relativeContainer, List<PdfTextSection> sections) {
        super(PdfMarkElementType.Text, relativeContainer);
        textSections = sections;
    }

    @Override
    public PdfMarkElementModel toModel() {

        PdfMarkElementModel model = super.toModel();

        List<PdfTextSectionModel> textSectionsModels = new ArrayList<PdfTextSectionModel>();
        for(PdfTextSection section : textSections) {
            textSectionsModels.add(section.toModel());
        }
        model.setTextSections(textSectionsModels);

        return model;
    }

    public List<PdfTextSection> getTextSections() {
        return textSections;
    }

    public void setTextSections(List<PdfTextSection> textSections) {
        this.textSections = textSections;
    }

    public void addTextSection(PdfTextSection textSection) {
        textSections.add(textSection);
    }
}
