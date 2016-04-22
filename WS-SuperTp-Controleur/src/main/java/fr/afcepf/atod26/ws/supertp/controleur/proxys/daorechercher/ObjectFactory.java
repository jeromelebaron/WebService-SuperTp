
package fr.afcepf.atod26.ws.supertp.controleur.proxys.daorechercher;

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
    private final static QName _Marque_QNAME = new QName("http://ejb.supertp.webservice.atod26.afcepf.fr", "marque");
    private final static QName _Produit_QNAME = new QName("http://ejb.supertp.webservice.atod26.afcepf.fr", "produit");
    private final static QName _RechercherProduitsResponse_QNAME = new QName("http://ejb.supertp.webservice.atod26.afcepf.fr", "rechercherProduitsResponse");
    private final static QName _RechercherMarques_QNAME = new QName("http://ejb.supertp.webservice.atod26.afcepf.fr", "rechercherMarques");
    private final static QName _RechercherMarquesResponse_QNAME = new QName("http://ejb.supertp.webservice.atod26.afcepf.fr", "rechercherMarquesResponse");

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
     * Create an instance of {@link ProduitDTO }
     * 
     */
    public ProduitDTO createProduitDTO() {
        return new ProduitDTO();
    }

    /**
     * Create an instance of {@link RechercherMarquesResponse }
     * 
     */
    public RechercherMarquesResponse createRechercherMarquesResponse() {
        return new RechercherMarquesResponse();
    }

    /**
     * Create an instance of {@link RechercherMarques }
     * 
     */
    public RechercherMarques createRechercherMarques() {
        return new RechercherMarques();
    }

    /**
     * Create an instance of {@link RechercherProduits }
     * 
     */
    public RechercherProduits createRechercherProduits() {
        return new RechercherProduits();
    }

    /**
     * Create an instance of {@link MarqueDTO }
     * 
     */
    public MarqueDTO createMarqueDTO() {
        return new MarqueDTO();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link MarqueDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb.supertp.webservice.atod26.afcepf.fr", name = "marque")
    public JAXBElement<MarqueDTO> createMarque(MarqueDTO value) {
        return new JAXBElement<MarqueDTO>(_Marque_QNAME, MarqueDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProduitDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb.supertp.webservice.atod26.afcepf.fr", name = "produit")
    public JAXBElement<ProduitDTO> createProduit(ProduitDTO value) {
        return new JAXBElement<ProduitDTO>(_Produit_QNAME, ProduitDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link RechercherMarques }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb.supertp.webservice.atod26.afcepf.fr", name = "rechercherMarques")
    public JAXBElement<RechercherMarques> createRechercherMarques(RechercherMarques value) {
        return new JAXBElement<RechercherMarques>(_RechercherMarques_QNAME, RechercherMarques.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RechercherMarquesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb.supertp.webservice.atod26.afcepf.fr", name = "rechercherMarquesResponse")
    public JAXBElement<RechercherMarquesResponse> createRechercherMarquesResponse(RechercherMarquesResponse value) {
        return new JAXBElement<RechercherMarquesResponse>(_RechercherMarquesResponse_QNAME, RechercherMarquesResponse.class, null, value);
    }

}
