package com.lacunasoftware.restpki;

import java.util.ArrayList;
import java.util.List;

/**
 * Class for defining element ID rules in a XML
 */
public class XmlIdResolutionTable {

    private boolean includeXmlIdAttribute;
    private List<XmlIdAttributeModel> elementIdAttributes;
    private List<XmlNodeNameModel> globalIdAttributes;

    public XmlIdResolutionTable(boolean includeXmlIdGlobalAttribute) {
        this.includeXmlIdAttribute = includeXmlIdGlobalAttribute;
        this.elementIdAttributes = new ArrayList<XmlIdAttributeModel>();
        this.globalIdAttributes = new ArrayList<XmlNodeNameModel>();
    }

    public XmlIdResolutionTable() {
        this(true);
    }

    /**
     * Specify an attribute to be globally considered as the ID attribute. This rule has less precedence than rules
     * set with the SetElementIdAttribute method.
     * @param idAttributeLocalName Name of the attribute (e.g.: "id")
     * @param idAttributeNamespace Namespace URI of the attribute. If null, the attribute is regarded as having no
     *                             namespace. The special value "xml" may be used to represent the http://www.w3.org/XML/1998/namespace namespace.
     */
    public void addGlobalIdAttribute(String idAttributeLocalName, String idAttributeNamespace) {
        XmlNodeNameModel att = new XmlNodeNameModel();
        att.setLocalName(idAttributeLocalName);
        att.setNamespace(idAttributeNamespace);
        this.globalIdAttributes.add(att);
    }

    /**
     * Specify an attribute to be globally considered as the ID attribute. This rule has less precedence than rules
     * set with the SetElementIdAttribute method.
     * @param idAttributeLocalName Name of the attribute (e.g.: "id")
     */
    public void addGlobalIdAttribute(String idAttributeLocalName) {
        addGlobalIdAttribute(idAttributeLocalName, null);
    }

    /**
     * Specify the attribute to be considered as the ID attribute for a certain element. This rule takes precedence over a global ID attribute specified
     * with the SetGlobalIdAttribute method.
     * @param elementLocalName
     * @param elementNamespace
     * @param idAttributeLocalName
     * @param idAttributeNamespace
     */
    public void setElementIdAttribute(String elementLocalName, String elementNamespace, String idAttributeLocalName, String idAttributeNamespace) {
        XmlIdAttributeModel idAtt = new XmlIdAttributeModel();

        XmlNodeNameModel att = new XmlNodeNameModel();
        att.setLocalName(idAttributeLocalName);
        att.setNamespace(idAttributeNamespace);

        XmlNodeNameModel element = new XmlNodeNameModel();
        element.setLocalName(elementLocalName);
        element.setNamespace(elementNamespace);

        idAtt.setAttribute(att);
        idAtt.setElement(element);

        this.elementIdAttributes.add(idAtt);
    }

    /**
     * Specify the attribute to be considered as the ID attribute for a certain element. This rule takes precedence over a global ID attribute specified
     * with the SetGlobalIdAttribute method.
     * @param elementLocalName
     * @param elementNamespace
     * @param idAttributeLocalName
     */
    public void setElementIdAttribute(String elementLocalName, String elementNamespace, String idAttributeLocalName) {
        setElementIdAttribute(elementLocalName, elementNamespace, idAttributeLocalName, null);
    }


    XmlIdResolutionTableModel toModel() {
        XmlIdResolutionTableModel model = new XmlIdResolutionTableModel();
        model.setElementIdAttributes(this.elementIdAttributes);
        model.setGlobalIdAttributes(this.globalIdAttributes);
        model.setIncludeXmlIdAttribute(this.includeXmlIdAttribute);
        return model;
    }
}
