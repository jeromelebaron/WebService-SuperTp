
package fr.afcepf.atod26.ws.supertp.controleur.proxys.daorechercher;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for rechercherProduits complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="rechercherProduits">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="marque" type="{http://ejb.supertp.webservice.atod26.afcepf.fr}marqueEntity" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rechercherProduits", propOrder = {
    "marque"
})
public class RechercherProduits {

    protected MarqueEntity marque;

    /**
     * Gets the value of the marque property.
     * 
     * @return
     *     possible object is
     *     {@link MarqueEntity }
     *     
     */
    public MarqueEntity getMarque() {
        return marque;
    }

    /**
     * Sets the value of the marque property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarqueEntity }
     *     
     */
    public void setMarque(MarqueEntity value) {
        this.marque = value;
    }

}
