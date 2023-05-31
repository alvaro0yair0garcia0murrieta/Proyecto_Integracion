//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2023.05.31 a las 03:22:18 PM CST 
//


package com.example.consumingwebservice.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CompaniaDeVuelo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="NombrePasajero" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "companiaDeVuelo",
    "nombrePasajero"
})
@XmlRootElement(name = "ReservaRequest")
public class ReservaRequest {

    @XmlElement(name = "CompaniaDeVuelo", required = true)
    protected String companiaDeVuelo;
    @XmlElement(name = "NombrePasajero", required = true)
    protected String nombrePasajero;

    /**
     * Obtiene el valor de la propiedad companiaDeVuelo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompaniaDeVuelo() {
        return companiaDeVuelo;
    }

    /**
     * Define el valor de la propiedad companiaDeVuelo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompaniaDeVuelo(String value) {
        this.companiaDeVuelo = value;
    }

    /**
     * Obtiene el valor de la propiedad nombrePasajero.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombrePasajero() {
        return nombrePasajero;
    }

    /**
     * Define el valor de la propiedad nombrePasajero.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombrePasajero(String value) {
        this.nombrePasajero = value;
    }

}
