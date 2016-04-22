package fr.afcepf.atod26.ws.supertp.controleur.proxys.daorechercher;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for rechercheDeProduits complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="rechercheDeProduits">
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
@XmlType(name = "rechercheDeProduits", propOrder = {
    "paramMarqueDTO"
})
public class RechercheDeProduits {

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
