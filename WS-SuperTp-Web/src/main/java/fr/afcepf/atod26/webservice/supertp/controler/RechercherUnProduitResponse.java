
package fr.afcepf.atod26.webservice.supertp.controler;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for rechercherUnProduitResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="rechercherUnProduitResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="resultatRechercheProduit" type="{http://controler.supertp.webservice.atod26.afcepf.fr}reponseRechercheProduit" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rechercherUnProduitResponse", propOrder = {
    "resultatRechercheProduit"
})
public class RechercherUnProduitResponse {

    protected ReponseRechercheProduit resultatRechercheProduit;

    /**
     * Gets the value of the resultatRechercheProduit property.
     * 
     * @return
     *     possible object is
     *     {@link ReponseRechercheProduit }
     *     
     */
    public ReponseRechercheProduit getResultatRechercheProduit() {
        return resultatRechercheProduit;
    }

    /**
     * Sets the value of the resultatRechercheProduit property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReponseRechercheProduit }
     *     
     */
    public void setResultatRechercheProduit(ReponseRechercheProduit value) {
        this.resultatRechercheProduit = value;
    }

}
