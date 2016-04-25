
package fr.afcepf.atod26.webservice.supertp.controler;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for rechercherUnProduit complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="rechercherUnProduit">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="token" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="laMarque" type="{http://controler.supertp.webservice.atod26.afcepf.fr}marque" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rechercherUnProduit", propOrder = {
    "token",
    "laMarque"
})
public class RechercherUnProduit {

    protected String token;
    protected Marque laMarque;

    /**
     * Gets the value of the token property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToken() {
        return token;
    }

    /**
     * Sets the value of the token property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToken(String value) {
        this.token = value;
    }

    /**
     * Gets the value of the laMarque property.
     * 
     * @return
     *     possible object is
     *     {@link Marque }
     *     
     */
    public Marque getLaMarque() {
        return laMarque;
    }

    /**
     * Sets the value of the laMarque property.
     * 
     * @param value
     *     allowed object is
     *     {@link Marque }
     *     
     */
    public void setLaMarque(Marque value) {
        this.laMarque = value;
    }

}
