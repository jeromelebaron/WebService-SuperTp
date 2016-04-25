
package fr.afcepf.atod26.webservice.supertp.controler;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for reponseGetAllMarque complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="reponseGetAllMarque">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="listeDeMarque" type="{http://controler.supertp.webservice.atod26.afcepf.fr}marque" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="token" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reponseGetAllMarque", propOrder = {
    "listeDeMarque",
    "token"
})
public class ReponseGetAllMarque {

    @XmlElement(nillable = true)
    protected List<Marque> listeDeMarque;
    protected String token;

    /**
     * Gets the value of the listeDeMarque property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listeDeMarque property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListeDeMarque().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Marque }
     * 
     * 
     */
    public List<Marque> getListeDeMarque() {
        if (listeDeMarque == null) {
            listeDeMarque = new ArrayList<Marque>();
        }
        return this.listeDeMarque;
    }

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

}
