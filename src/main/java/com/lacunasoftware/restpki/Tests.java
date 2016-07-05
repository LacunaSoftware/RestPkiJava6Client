package com.lacunasoftware.restpki;

/**
 * Created by LeonardoP on 05/07/2016.
 */
public class Tests {

    public static void main(String[] args) {

        try {

            String endpointUrl = "http://localhost:8632/";
            String authToken = "jr7pTf12h_bKakueepFlQctRwpm8d0IiF-Up4gDNQvhyP3lDQRW9qnkPK7vXPHvMCpYIEthefMNpWFctDoZTJ4ipKYAolglcm5gO8iKywzxjPLQESKr8YsVdlMy4wDmZfAkiSpeLpYU-dsUqxVHAcRy6whD-OzQtE9lIaTS_TKC-9lZOHS90LzK-kfU6RzQFZbnTaC-TiFP6EJFsTQsFeKXncneL70zCBoEW7C-owo8ius8TUUZvkASFRFKjcIeKWi7I9DqTCZFSiEztvRgk1C2cUmBvfT0YxGG1bBSGhaW8FblIkF8NElo_xekWBoKOUx0JHwe2rU0pCbtW72PWyYQ9yeh0pod4sgh4MHlYhCOgHal3DZhYmNKpia7fQqk1CY-T_zk9_o1h-cJzH355kMLtv05nljoVxm6UERAb7eK9ZxVUXDGAXASU5RVvc-AEXqk9Wwpe1exxYRXc3M8RQBE84i7yI6cr7O7sQdkk1i2KKjNvLi0uTtivOECe9RZFXCK2fw";
            RestPkiClient client = new RestPkiClient(endpointUrl, authToken);

            CadesSignatureExplorer sigExplorer = new CadesSignatureExplorer(client);
            sigExplorer.setValidate(true);
            sigExplorer.setAcceptableExplicitPolicies(SignaturePolicyCatalog.getPkiBrazilCadesWithSignerCertificateProtection());
            sigExplorer.setSignatureFile("C:\\Users\\LeonardoP\\Downloads\\55523574-3821-4a3d-a652-6989a42f31f0.p7s");
            CadesSignature signature = sigExplorer.open();

            System.out.print(signature);

        } catch (Exception e) {

            e.printStackTrace();

        }

    }

}
