package com.lacunasoftware.restpki;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Class containing the ICP-Brasil policy specific certificate fields
 */
public class PkiBrazilCertificateFields {

    private PkiBrazilCertificateTypes certificateType;
    private String cpf;
    private String cnpj;
    private String responsavel;
    private Date dateOfBirth;
    private String companyName;
    private String rgNumero;
    private String rgEmissor;
    private String rgEmissorUF;
    private String oabNumero;
    private String oabUF;

    PkiBrazilCertificateFields(PkiBrazilCertificateModel model) {
        this.certificateType = PkiBrazilCertificateTypes.valueOf(model.getCertificateType().toString());
        this.cpf = model.getCpf();
        this.cnpj = model.getCnpj();
        this.responsavel = model.getResponsavel();
        if (model.getDateOfBirth() != null) {
            try {
                this.dateOfBirth = new SimpleDateFormat("yyyy-MM-dd").parse(model.getDateOfBirth());
            } catch (ParseException e) {
                throw new RuntimeException("Could not parse dateOfBirth: " + model.getDateOfBirth(), e);
            }
        }
        this.companyName = model.getCompanyName();
        this.rgNumero = model.getRgNumero();
        this.rgEmissor = model.getRgEmissor();
        this.rgEmissorUF = model.getRgEmissorUF();
        this.oabNumero = model.getOabNumero();
        this.oabUF = model.getOabUF();
    }

    public PkiBrazilCertificateTypes getCertificateType() {
        return certificateType;
    }

    public String getCpf() {
        return cpf;
    }

    public String getCnpj() {
        return cnpj;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getRGNumero() {
        return rgNumero;
    }

    public String getRGEmissor() {
        return rgEmissor;
    }

    public String getRGEmissorUF() {
        return rgEmissorUF;
    }

    public String getOabNumero() {
        return oabNumero;
    }

    public String getOabUF() {
        return oabUF;
    }
}
