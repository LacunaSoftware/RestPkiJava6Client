REST PKI client package for Java
====================================
**Legacy version for Java 6**

This package contains classes that encapsulate the calls to the REST PKI API.

The **Rest PKI Client package** is distributed by [Bintray](https://bintray.com/lacunasoftware/maven/restpki-client-java6)

The recommended way to install is with Gradle:

    repositories {
        mavenCentral()
        maven {
            url  "http://dl.bintray.com/lacunasoftware/maven"
        }
    }

    dependencies {
        compile("com.lacunasoftware.restpki:restpki-client-java6:1.8.1")
    }
    
Or with Maven:

    <dependency>
      <groupId>com.lacunasoftware.restpki</groupId>
      <artifactId>restpki-client-java6</artifactId>
      <version>1.8.1</version>
      <type>pom</type>
    </dependency>
    
If you use Java 7 and greater, please see the package [restpki-client](https://bitbucket.org/Lacunas/restpki-java-client).

Samples
-------

Please visit the [REST PKI samples repository](https://github.com/LacunaSoftware/RestPkiSamples/tree/master/Java)
for examples on how to use this library.
