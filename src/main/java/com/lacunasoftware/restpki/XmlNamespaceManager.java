package com.lacunasoftware.restpki;

import java.util.ArrayList;
import java.util.List;

/**
 * Class for setting namespaces used in a xpath
 */
public class XmlNamespaceManager {
    private List<NamespaceModel> namespaces;

    /**
     * Instatiates a manager for adding namespaces
     */
    public XmlNamespaceManager() {
        this.namespaces = new ArrayList<NamespaceModel>();
    }

    /**
     *
     * @param prefix Namespace prefix
     * @param uri Namespace URI
     */
    public void addNamespace(String prefix, String uri) {
        if (prefix == null || uri == null) {
            throw new RuntimeException("prefix and uri parameters can not be null");
        }
        NamespaceModel model = new NamespaceModel();
        model.setPrefix(prefix);
        model.setUri(uri);
        this.namespaces.add(model);
    }

    List<NamespaceModel> getNamespaces() {
        return this.namespaces;
    }
}
