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
}
