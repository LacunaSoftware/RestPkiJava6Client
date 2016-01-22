package com.lacunasoftware.restpki;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by BrunoD on 22/01/2016.
 */
public class XmlNamespaceManager {
    private List<NamespaceModel> namespaces;

    public XmlNamespaceManager() {
        this.namespaces = new ArrayList<NamespaceModel>();
    }

    public void addNamespace(String prefix, String uri) throws IllegalArgumentException {
        if (prefix == null || uri == null) {
            throw new IllegalArgumentException("prefix and uri parameters can not be null");
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
