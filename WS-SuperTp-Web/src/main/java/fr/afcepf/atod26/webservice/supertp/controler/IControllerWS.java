
package fr.afcepf.atod26.webservice.supertp.controler;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "IControllerWS", targetNamespace = "http://controler.supertp.webservice.atod26.afcepf.fr")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface IControllerWS {


    /**
     * 
     * @param laMarque
     * @param token
     * @return
     *     returns fr.afcepf.atod26.webservice.supertp.controler.ReponseRechercheProduit
     * @throws WSControlerException_Exception
     */
    @WebMethod
    @WebResult(name = "resultatRechercheProduit", targetNamespace = "")
    @RequestWrapper(localName = "rechercherUnProduit", targetNamespace = "http://controler.supertp.webservice.atod26.afcepf.fr", className = "fr.afcepf.atod26.webservice.supertp.controler.RechercherUnProduit")
    @ResponseWrapper(localName = "rechercherUnProduitResponse", targetNamespace = "http://controler.supertp.webservice.atod26.afcepf.fr", className = "fr.afcepf.atod26.webservice.supertp.controler.RechercherUnProduitResponse")
    public ReponseRechercheProduit rechercherUnProduit(
        @WebParam(name = "token", targetNamespace = "")
        String token,
        @WebParam(name = "laMarque", targetNamespace = "")
        Marque laMarque)
        throws WSControlerException_Exception
    ;

    /**
     * 
     * @param motDePasse
     * @param login
     * @return
     *     returns java.lang.String
     * @throws WSControlerException_Exception
     */
    @WebMethod
    @WebResult(name = "resultatConnexion", targetNamespace = "")
    @RequestWrapper(localName = "connexion", targetNamespace = "http://controler.supertp.webservice.atod26.afcepf.fr", className = "fr.afcepf.atod26.webservice.supertp.controler.Connexion")
    @ResponseWrapper(localName = "connexionResponse", targetNamespace = "http://controler.supertp.webservice.atod26.afcepf.fr", className = "fr.afcepf.atod26.webservice.supertp.controler.ConnexionResponse")
    public String connexion(
        @WebParam(name = "login", targetNamespace = "")
        String login,
        @WebParam(name = "motDePasse", targetNamespace = "")
        String motDePasse)
        throws WSControlerException_Exception
    ;

    /**
     * 
     * @param token
     * @return
     *     returns fr.afcepf.atod26.webservice.supertp.controler.ReponseGetAllMarque
     * @throws WSControlerException_Exception
     */
    @WebMethod
    @WebResult(name = "resultatRecuperationMarques", targetNamespace = "")
    @RequestWrapper(localName = "recupererLesMarques", targetNamespace = "http://controler.supertp.webservice.atod26.afcepf.fr", className = "fr.afcepf.atod26.webservice.supertp.controler.RecupererLesMarques")
    @ResponseWrapper(localName = "recupererLesMarquesResponse", targetNamespace = "http://controler.supertp.webservice.atod26.afcepf.fr", className = "fr.afcepf.atod26.webservice.supertp.controler.RecupererLesMarquesResponse")
    public ReponseGetAllMarque recupererLesMarques(
        @WebParam(name = "token", targetNamespace = "")
        String token)
        throws WSControlerException_Exception
    ;

}