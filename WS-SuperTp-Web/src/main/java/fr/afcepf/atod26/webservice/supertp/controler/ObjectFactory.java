
package fr.afcepf.atod26.webservice.supertp.controler;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the fr.afcepf.atod26.webservice.supertp.controler package. 
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

    private final static QName _ConnexionResponse_QNAME = new QName("http://controler.supertp.webservice.atod26.afcepf.fr", "connexionResponse");
    private final static QName _RecupererLesMarques_QNAME = new QName("http://controler.supertp.webservice.atod26.afcepf.fr", "recupererLesMarques");
    private final static QName _Connexion_QNAME = new QName("http://controler.supertp.webservice.atod26.afcepf.fr", "connexion");
    private final static QName _Produit_QNAME = new QName("http://controler.supertp.webservice.atod26.afcepf.fr", "produit");
    private final static QName _RecupererLesMarquesResponse_QNAME = new QName("http://controler.supertp.webservice.atod26.afcepf.fr", "recupererLesMarquesResponse");
    private final static QName _ReponseGetAllMarque_QNAME = new QName("http://controler.supertp.webservice.atod26.afcepf.fr", "reponseGetAllMarque");
    private final static QName _Marque_QNAME = new QName("http://controler.supertp.webservice.atod26.afcepf.fr", "marque");
    private final static QName _RechercherUnProduitResponse_QNAME = new QName("http://controler.supertp.webservice.atod26.afcepf.fr", "rechercherUnProduitResponse");
    private final static QName _ReponseRechercheProduit_QNAME = new QName("http://controler.supertp.webservice.atod26.afcepf.fr", "reponseRechercheProduit");
    private final static QName _WSControlerException_QNAME = new QName("http://controler.supertp.webservice.atod26.afcepf.fr", "WSControlerException");
    private final static QName _RechercherUnProduit_QNAME = new QName("http://controler.supertp.webservice.atod26.afcepf.fr", "rechercherUnProduit");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: fr.afcepf.atod26.webservice.supertp.controler
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RecupererLesMarquesResponse }
     * 
     */
    public RecupererLesMarquesResponse createRecupererLesMarquesResponse() {
        return new RecupererLesMarquesResponse();
    }

    /**
     * Create an instance of {@link Produit }
     * 
     */
    public Produit createProduit() {
        return new Produit();
    }

    /**
     * Create an instance of {@link Connexion }
     * 
     */
    public Connexion createConnexion() {
        return new Connexion();
    }

    /**
     * Create an instance of {@link RecupererLesMarques }
     * 
     */
    public RecupererLesMarques createRecupererLesMarques() {
        return new RecupererLesMarques();
    }

    /**
     * Create an instance of {@link ConnexionResponse }
     * 
     */
    public ConnexionResponse createConnexionResponse() {
        return new ConnexionResponse();
    }

    /**
     * Create an instance of {@link ReponseGetAllMarque }
     * 
     */
    public ReponseGetAllMarque createReponseGetAllMarque() {
        return new ReponseGetAllMarque();
    }

    /**
     * Create an instance of {@link RechercherUnProduitResponse }
     * 
     */
    public RechercherUnProduitResponse createRechercherUnProduitResponse() {
        return new RechercherUnProduitResponse();
    }

    /**
     * Create an instance of {@link Marque }
     * 
     */
    public Marque createMarque() {
        return new Marque();
    }

    /**
     * Create an instance of {@link WSControlerException }
     * 
     */
    public WSControlerException createWSControlerException() {
        return new WSControlerException();
    }

    /**
     * Create an instance of {@link ReponseRechercheProduit }
     * 
     */
    public ReponseRechercheProduit createReponseRechercheProduit() {
        return new ReponseRechercheProduit();
    }

    /**
     * Create an instance of {@link RechercherUnProduit }
     * 
     */
    public RechercherUnProduit createRechercherUnProduit() {
        return new RechercherUnProduit();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConnexionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controler.supertp.webservice.atod26.afcepf.fr", name = "connexionResponse")
    public JAXBElement<ConnexionResponse> createConnexionResponse(ConnexionResponse value) {
        return new JAXBElement<ConnexionResponse>(_ConnexionResponse_QNAME, ConnexionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecupererLesMarques }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controler.supertp.webservice.atod26.afcepf.fr", name = "recupererLesMarques")
    public JAXBElement<RecupererLesMarques> createRecupererLesMarques(RecupererLesMarques value) {
        return new JAXBElement<RecupererLesMarques>(_RecupererLesMarques_QNAME, RecupererLesMarques.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Connexion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controler.supertp.webservice.atod26.afcepf.fr", name = "connexion")
    public JAXBElement<Connexion> createConnexion(Connexion value) {
        return new JAXBElement<Connexion>(_Connexion_QNAME, Connexion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Produit }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controler.supertp.webservice.atod26.afcepf.fr", name = "produit")
    public JAXBElement<Produit> createProduit(Produit value) {
        return new JAXBElement<Produit>(_Produit_QNAME, Produit.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecupererLesMarquesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controler.supertp.webservice.atod26.afcepf.fr", name = "recupererLesMarquesResponse")
    public JAXBElement<RecupererLesMarquesResponse> createRecupererLesMarquesResponse(RecupererLesMarquesResponse value) {
        return new JAXBElement<RecupererLesMarquesResponse>(_RecupererLesMarquesResponse_QNAME, RecupererLesMarquesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReponseGetAllMarque }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controler.supertp.webservice.atod26.afcepf.fr", name = "reponseGetAllMarque")
    public JAXBElement<ReponseGetAllMarque> createReponseGetAllMarque(ReponseGetAllMarque value) {
        return new JAXBElement<ReponseGetAllMarque>(_ReponseGetAllMarque_QNAME, ReponseGetAllMarque.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Marque }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controler.supertp.webservice.atod26.afcepf.fr", name = "marque")
    public JAXBElement<Marque> createMarque(Marque value) {
        return new JAXBElement<Marque>(_Marque_QNAME, Marque.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RechercherUnProduitResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controler.supertp.webservice.atod26.afcepf.fr", name = "rechercherUnProduitResponse")
    public JAXBElement<RechercherUnProduitResponse> createRechercherUnProduitResponse(RechercherUnProduitResponse value) {
        return new JAXBElement<RechercherUnProduitResponse>(_RechercherUnProduitResponse_QNAME, RechercherUnProduitResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReponseRechercheProduit }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controler.supertp.webservice.atod26.afcepf.fr", name = "reponseRechercheProduit")
    public JAXBElement<ReponseRechercheProduit> createReponseRechercheProduit(ReponseRechercheProduit value) {
        return new JAXBElement<ReponseRechercheProduit>(_ReponseRechercheProduit_QNAME, ReponseRechercheProduit.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WSControlerException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controler.supertp.webservice.atod26.afcepf.fr", name = "WSControlerException")
    public JAXBElement<WSControlerException> createWSControlerException(WSControlerException value) {
        return new JAXBElement<WSControlerException>(_WSControlerException_QNAME, WSControlerException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RechercherUnProduit }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controler.supertp.webservice.atod26.afcepf.fr", name = "rechercherUnProduit")
    public JAXBElement<RechercherUnProduit> createRechercherUnProduit(RechercherUnProduit value) {
        return new JAXBElement<RechercherUnProduit>(_RechercherUnProduit_QNAME, RechercherUnProduit.class, null, value);
    }

}
