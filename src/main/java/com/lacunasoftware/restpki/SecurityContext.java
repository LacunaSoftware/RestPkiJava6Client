package com.lacunasoftware.restpki;

/**
 * Created by desenv on 27/08/2015.
 */
public class SecurityContext {

    public static final SecurityContext pkiBrazil = new SecurityContext("201856ce-273c-4058-a872-8937bd547d36");
    public static final SecurityContext pkiItaly = new SecurityContext("c438b17e-4862-446b-86ad-6f85734f0bfe");
    public static final SecurityContext windowsServer = new SecurityContext("3881384c-a54d-45c5-bbe9-976b674f5ec7");

    private String id;

    public SecurityContext(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}
