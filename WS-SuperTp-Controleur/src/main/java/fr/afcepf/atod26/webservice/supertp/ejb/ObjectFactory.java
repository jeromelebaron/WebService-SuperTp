
package fr.afcepf.atod26.webservice.supertp.ejb;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the fr.afcepf.atod26.webservice.supertp.ejb package. 
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

    private final static QName _RechercherProduits_QNAME = new QName("http://ejb.supertp.webservice.atod26.afcepf.fr", "rechercherProduits");
    private final static QName _RechercherToutesLesMarquesResponse_QNAME = new QName("http://ejb.supertp.webservice.atod26.afcepf.fr", "rechercherToutesLesMarquesResponse");
    private final static QName _MarqueDTO_QNAME = new QName("http://ejb.supertp.webservice.atod26.afcepf.fr", "marqueDTO");
    private final static QName _RechercherProduitsResponse_QNAME = new QName("http://ejb.supertp.webservice.atod26.afcepf.fr", "rechercherProduitsResponse");
    private final static QName _ProduitDTO_QNAME = new QName("http://ejb.supertp.webservice.atod26.afcepf.fr", "produitDTO");
    private final static QName _RechercherToutesLesMarques_QNAME = new QName("http://ejb.supertp.webservice.atod26.afcepf.fr", "rechercherToutesLesMarques");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: fr.afcepf.atod26.webservice.supertp.ejb
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RechercherProduitsResponse }
     * 
     */
    public RechercherProduitsResponse createRechercherProduitsResponse() {
        return new RechercherProduitsResponse();
    }

    /**
     * Create an instance of {@link MarqueDTO }
     * 
     */
    public MarqueDTO createMarqueDTO() {
        return new MarqueDTO();
    }

    /**
     * Create an instance of {@link ProduitDTO }
     * 
     */
    public ProduitDTO createProduitDTO() {
        return new ProduitDTO();
    }

    /**
     * Create an instance of {@link RechercherProduits }
     * 
     */
    public RechercherProduits createRechercherProduits() {
        return new RechercherProduits();
    }

    /**
     * Create an instance of {@link RechercherToutesLesMarquesResponse }
     * 
     */
    public RechercherToutesLesMarquesResponse createRechercherToutesLesMarquesResponse() {
        return new RechercherToutesLesMarquesResponse();
    }

    /**
     * Create an instance of {@link RechercherToutesLesMarques }
     * 
     */
    public RechercherToutesLesMarques createRechercherToutesLesMarques() {
        return new RechercherToutesLesMarques();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RechercherProduits }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb.supertp.webservice.atod26.afcepf.fr", name = "rechercherProduits")
    public JAXBElement<RechercherProduits> createRechercherProduits(RechercherProduits value) {
        return new JAXBElement<RechercherProduits>(_RechercherProduits_QNAME, RechercherProduits.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RechercherToutesLesMarquesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb.supertp.webservice.atod26.afcepf.fr", name = "rechercherToutesLesMarquesResponse")
    public JAXBElement<RechercherToutesLesMarquesResponse> createRechercherToutesLesMarquesResponse(RechercherToutesLesMarquesResponse value) {
        return new JAXBElement<RechercherToutesLesMarquesResponse>(_RechercherToutesLesMarquesResponse_QNAME, RechercherToutesLesMarquesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MarqueDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb.supertp.webservice.atod26.afcepf.fr", name = "marqueDTO")
    public JAXBElement<MarqueDTO> createMarqueDTO(MarqueDTO value) {
        return new JAXBElement<MarqueDTO>(_MarqueDTO_QNAME, MarqueDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RechercherProduitsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb.supertp.webservice.atod26.afcepf.fr", name = "rechercherProduitsResponse")
    public JAXBElement<RechercherProduitsResponse> createRechercherProduitsResponse(RechercherProduitsResponse value) {
        return new JAXBElement<RechercherProduitsResponse>(_RechercherProduitsResponse_QNAME, RechercherProduitsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProduitDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb.supertp.webservice.atod26.afcepf.fr", name = "produitDTO")
    public JAXBElement<ProduitDTO> createProduitDTO(ProduitDTO value) {
        return new JAXBElement<ProduitDTO>(_ProduitDTO_QNAME, ProduitDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RechercherToutesLesMarques }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb.supertp.webservice.atod26.afcepf.fr", name = "rechercherToutesLesMarques")
    public JAXBElement<RechercherToutesLesMarques> createRechercherToutesLesMarques(RechercherToutesLesMarques value) {
        return new JAXBElement<RechercherToutesLesMarques>(_RechercherToutesLesMarques_QNAME, RechercherToutesLesMarques.class, null, value);
    }

}
