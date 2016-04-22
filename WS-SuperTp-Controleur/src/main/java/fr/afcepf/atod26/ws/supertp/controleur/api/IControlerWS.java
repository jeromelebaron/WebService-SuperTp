package fr.afcepf.atod26.ws.supertp.controleur.api;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import fr.afcepf.atod26.ws.supertp.exception.WSControlerException;
import fr.afcepf.atod26.ws.supertp.objets.Marque;
import fr.afcepf.atod26.ws.supertp.reponses.ReponseGetAllMarque;
import fr.afcepf.atod26.ws.supertp.reponses.ReponseRechercheProduit;

@WebService(targetNamespace = "http://controler.lebaronjerome.supertp.webservice.atod26.afcepf.fr")
public interface IControlerWS {

	@WebMethod(operationName = "connexion")
	@WebResult(name = "resultatConnexion")
	String connect(@WebParam(name = "login") String paramLogin, @WebParam(name = "motDePasse") String paramMotDePasse)
			throws WSControlerException;

	@WebMethod(operationName = "rechercherUnProduit")
	@WebResult(name = "resultatRechercheProduit")
	ReponseRechercheProduit rechercherProduit(@WebParam(name = "marque") Marque paramMarque,
			@WebParam(name = "token") String paramToken) throws WSControlerException;

	@WebMethod(operationName = "recupererLesMarques")
	@WebResult(name = "resultatRecuperationMarques")
	ReponseGetAllMarque recupererToutesLesMarques(@WebParam(name = "token") String paramToken)
			throws WSControlerException;

}