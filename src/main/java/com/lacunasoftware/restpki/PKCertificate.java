package com.lacunasoftware.restpki;

import java.math.BigInteger;
import java.util.Date;

public class PKCertificate {

    private Name subjectName;
    private String emailAddress;
    private Name issuerName;
    private BigInteger serialNumber;
    private Date validityStart;
    private Date validityEnd;
    private PkiBrazilCertificateFields pkiBrazil;
    private PkiItalyCertificateFields pkiItaly;
    private PKCertificate issuer;

    PKCertificate(CertificateModel model) {
        this.subjectName = new Name(model.getSubjectName());
        this.emailAddress = model.getEmailAddress();
        this.issuerName = new Name(model.getIssuerName());
        this.serialNumber = new BigInteger(model.getSerialNumber());
        this.validityStart = model.getValidityStart();
        this.validityEnd = model.getValidityEnd();
        this.pkiBrazil = new PkiBrazilCertificateFields(model.getPkiBrazil());
        this.pkiItaly = new PkiItalyCertificateFields(model.getPkiItaly());
        if (model.getIssuer() != null) {
            this.issuer = new PKCertificate(model.getIssuer());
        }
    }

    public Name getSubjectName() {
        return subjectName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public Name getIssuerName() {
        return issuerName;
    }

    public BigInteger getSerialNumber() {
        return serialNumber;
    }

    public Date getValidityStart() {
        return validityStart;
    }

    public Date getValidityEnd() {
        return validityEnd;
    }

    public PkiBrazilCertificateFields getPkiBrazil() {
        return pkiBrazil;
    }

    public PkiItalyCertificateFields getPkiItaly() {
        return pkiItaly;
    }

    public PKCertificate getIssuer() {
        return issuer;
    }

}
