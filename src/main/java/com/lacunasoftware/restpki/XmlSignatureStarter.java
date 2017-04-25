package com.lacunasoftware.restpki;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/**
 * Base class for XmlSignatureStarter
 */
public abstract class XmlSignatureStarter extends SignatureStarter {

    protected byte[] xml;
    protected String signatureElementId;
    protected XmlElementLocationModel signatureElementLocation;

    /**
     * Create a new instance using the given RestPkiClient.
     *
     * @param client the RestPkiClient which shall be used.
     */
    public XmlSignatureStarter(RestPkiClient client) {
        super(client);
    }

    /**
     * Sets the XML document bytes
     * @param content
     */
    public void setXml(byte[] content) {
        this.xml = content;
    }

    /**
     * Sets the XML document stream
     * @param stream
     * @throws IOException
     */
    public void setXml(InputStream stream) throws IOException {
        this.xml = Storage.readStream(stream);
    }

    /**
     * Sets the XML document path
     * @param path
     * @throws IOException
     */
    public void setXml(String path) throws IOException {
        setXml(new File(path));
    }

    /**
     * Sets the XML document path
     * @param file
     * @throws IOException
     */
    public void setXml(File file) throws IOException {
        this.xml = Storage.readFile(file);
    }

    /**
     * Sets the computed signature element ID
     * @param id
     */
    public void setSignatureElementId(String id) {
        this.signatureElementId = id;
    }

    /**
     * Sets the location of the computed signature element to be inserted in the XML document
     * @param xpath The xpath to select the target element which the insertion will be related to. If null, XML root element will be selected.
     * @param nsm The namespaces and prefixes of the XML used in the xpath
     * @param insertionOption The insertion option that will be applied over the target element define by xpath
     */
    public void setSignatureElementLocation(String xpath, XmlNamespaceManager nsm, XmlInsertionOptions insertionOption) {
        signatureElementLocation = new XmlElementLocationModel();
        signatureElementLocation.setInsertionOption(XmlElementLocationModel.InsertionOptionEnum.valueOf(insertionOption.toString()));
        signatureElementLocation.setXPath(xpath);
        signatureElementLocation.setNamespaces(nsm.getNamespaces());
    }
}
