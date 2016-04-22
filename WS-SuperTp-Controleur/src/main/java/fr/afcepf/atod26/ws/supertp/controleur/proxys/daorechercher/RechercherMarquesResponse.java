
package fr.afcepf.atod26.ws.supertp.controleur.proxys.daorechercher;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for rechercherMarquesResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="rechercherMarquesResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="resultatRechercherMarque" type="{http://ejb.supertp.webservice.atod26.afcepf.fr}marqueDTO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rechercherMarquesResponse", propOrder = {
    "resultatRechercherMarque"
})
public class RechercherMarquesResponse {

    protected List<MarqueDTO> resultatRechercherMarque;

    /**
     * Gets the value of the resultatRechercherMarque property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resultatRechercherMarque property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResultatRechercherMarque().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MarqueDTO }
     * 
     * 
     */
    public List<MarqueDTO> getResultatRechercherMarque() {
        if (resultatRechercherMarque == null) {
            resultatRechercherMarque = new ArrayList<MarqueDTO>();
        }
        return this.resultatRechercherMarque;
    }

}
