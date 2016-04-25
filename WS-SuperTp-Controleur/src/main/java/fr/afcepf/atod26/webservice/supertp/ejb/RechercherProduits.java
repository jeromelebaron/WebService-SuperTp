
package fr.afcepf.atod26.webservice.supertp.ejb;

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
 *         &lt;element name="paramMarqueDTO" type="{http://ejb.supertp.webservice.atod26.afcepf.fr}marqueDTO" minOccurs="0"/>
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
    "paramMarqueDTO"
})
public class RechercherProduits {

    protected MarqueDTO paramMarqueDTO;

    /**
     * Gets the value of the paramMarqueDTO property.
     * 
     * @return
     *     possible object is
     *     {@link MarqueDTO }
     *     
     */
    public MarqueDTO getParamMarqueDTO() {
        return paramMarqueDTO;
    }

    /**
     * Sets the value of the paramMarqueDTO property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarqueDTO }
     *     
     */
    public void setParamMarqueDTO(MarqueDTO value) {
        this.paramMarqueDTO = value;
    }

}