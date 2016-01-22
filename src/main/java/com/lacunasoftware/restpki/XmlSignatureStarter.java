package com.lacunasoftware.restpki;

import jdk.internal.util.xml.impl.Input;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by BrunoD on 22/01/2016.
 */
public abstract class XmlSignatureStarter extends SignatureStarter {

    protected byte[] xml;
    protected String signatureElementId;
    protected XmlElementLocationModel signatureElementLocation;

    public XmlSignatureStarter(RestPkiClient client) {
        super(client);
    }

    public void setXml(byte[] content) {
        this.xml = content;
    }

    public void setXml(InputStream stream) throws IOException {
        this.xml = Util.readStream(stream);
    }

    public void setXml(String path) throws IOException {
        setXml(Paths.get(path));
    }

    public void setXml(Path path) throws IOException {
        this.xml = Files.readAllBytes(path);
    }

    public void setSignatureElementId(String elementId) {
        this.signatureElementId = elementId;
    }

    public void setSignatureElementLocation(String xpath, XmlNamespaceManager nsm, XmlInsertionOptions insertionOption) {
        signatureElementLocation = new XmlElementLocationModel();
        signatureElementLocation.setInsertionOption(XmlElementLocationModel.InsertionOptionEnum.valueOf(insertionOption.toString()));
        signatureElementLocation.setXPath(xpath);
        signatureElementLocation.setNamespaces(nsm.getNamespaces());
    }
}
