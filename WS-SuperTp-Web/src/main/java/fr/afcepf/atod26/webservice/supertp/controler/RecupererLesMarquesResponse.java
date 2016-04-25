
package fr.afcepf.atod26.webservice.supertp.controler;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for recupererLesMarquesResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="recupererLesMarquesResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="resultatRecuperationMarques" type="{http://controler.supertp.webservice.atod26.afcepf.fr}reponseGetAllMarque" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "recupererLesMarquesResponse", propOrder = {
    "resultatRecuperationMarques"
})
public class RecupererLesMarquesResponse {

    protected ReponseGetAllMarque resultatRecuperationMarques;

    /**
     * Gets the value of the resultatRecuperationMarques property.
     * 
     * @return
     *     possible object is
     *     {@link ReponseGetAllMarque }
     *     
     */
    public ReponseGetAllMarque getResultatRecuperationMarques() {
        return resultatRecuperationMarques;
    }

    /**
     * Sets the value of the resultatRecuperationMarques property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReponseGetAllMarque }
     *     
     */
    public void setResultatRecuperationMarques(ReponseGetAllMarque value) {
        this.resultatRecuperationMarques = value;
    }

}
