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

    private final static QName _MarqueDTO_QNAME = new QName("http://ejb.supertp.webservice.atod26.afcepf.fr", "marqueDTO");
    private final static QName _ProduitDTO_QNAME = new QName("http://ejb.supertp.webservice.atod26.afcepf.fr", "produitDTO");
    private final static QName _RechercherMarques_QNAME = new QName("http://ejb.supertp.webservice.atod26.afcepf.fr", "rechercherMarques");
    private final static QName _RechercherMarquesResponse_QNAME = new QName("http://ejb.supertp.webservice.atod26.afcepf.fr", "rechercherMarquesResponse");
    private final static QName _RechercheDeProduits_QNAME = new QName("http://ejb.supertp.webservice.atod26.afcepf.fr", "rechercheDeProduits");
    private final static QName _RechercheDeProduitsResponse_QNAME = new QName("http://ejb.supertp.webservice.atod26.afcepf.fr", "rechercheDeProduitsResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: fr.afcepf.atod26.webservice.supertp.ejb
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MarqueDTO }
     * 
     */
    public MarqueDTO createMarqueDTO() {
        return new MarqueDTO();
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
     * Create an instance of {@link ProduitDTO }
     * 
     */
    public ProduitDTO createProduitDTO() {
        return new ProduitDTO();
    }

    /**
     * Create an instance of {@link RechercheDeProduitsResponse }
     * 
     */
    public RechercheDeProduitsResponse createRechercheDeProduitsResponse() {
        return new RechercheDeProduitsResponse();
    }

    /**
     * Create an instance of {@link RechercheDeProduits }
     * 
     */
    public RechercheDeProduits createRechercheDeProduits() {
        return new RechercheDeProduits();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ProduitDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb.supertp.webservice.atod26.afcepf.fr", name = "produitDTO")
    public JAXBElement<ProduitDTO> createProduitDTO(ProduitDTO value) {
        return new JAXBElement<ProduitDTO>(_ProduitDTO_QNAME, ProduitDTO.class, null, value);
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

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RechercheDeProduits }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb.supertp.webservice.atod26.afcepf.fr", name = "rechercheDeProduits")
    public JAXBElement<RechercheDeProduits> createRechercheDeProduits(RechercheDeProduits value) {
        return new JAXBElement<RechercheDeProduits>(_RechercheDeProduits_QNAME, RechercheDeProduits.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RechercheDeProduitsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb.supertp.webservice.atod26.afcepf.fr", name = "rechercheDeProduitsResponse")
    public JAXBElement<RechercheDeProduitsResponse> createRechercheDeProduitsResponse(RechercheDeProduitsResponse value) {
        return new JAXBElement<RechercheDeProduitsResponse>(_RechercheDeProduitsResponse_QNAME, RechercheDeProduitsResponse.class, null, value);
    }

}
