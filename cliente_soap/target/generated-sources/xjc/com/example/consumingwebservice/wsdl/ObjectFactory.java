//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2023.05.31 a las 03:25:54 PM CST 
//


package com.example.consumingwebservice.wsdl;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.example.consumingwebservice.wsdl package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.example.consumingwebservice.wsdl
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EstadoRequest }
     * 
     */
    public EstadoRequest createEstadoRequest() {
        return new EstadoRequest();
    }

    /**
     * Create an instance of {@link EstadoResponse }
     * 
     */
    public EstadoResponse createEstadoResponse() {
        return new EstadoResponse();
    }

    /**
     * Create an instance of {@link ReservaRequest }
     * 
     */
    public ReservaRequest createReservaRequest() {
        return new ReservaRequest();
    }

    /**
     * Create an instance of {@link ReservaResponse }
     * 
     */
    public ReservaResponse createReservaResponse() {
        return new ReservaResponse();
    }

}
