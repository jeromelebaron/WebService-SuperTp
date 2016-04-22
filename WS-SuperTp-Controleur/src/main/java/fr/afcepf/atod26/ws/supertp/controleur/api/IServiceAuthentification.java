package fr.afcepf.atod26.ws.supertp.controleur.api;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

/**
 * Concerne les différents traitements nécessaires à l'authentification pour l'accès au webservice.
 * @author Jérome.
 */
@WebService(targetNamespace = "http://lebaronjerome.supertp.ws.atod26.afcepf.fr")
@SOAPBinding(style = Style.DOCUMENT)
public interface IServiceAuthentification {

	/**
	 * Pour s'authentifier et avoir accès aux méthodes du webservice.
	 * @param paramLogin le login de connexion.
	 * @param paramMotDePasse le mot de passe de connexion.
	 * @return un token si la connexion est valide.
	 */
	@WebMethod(operationName = "connexion")
	@WebResult(name = "resultatConnexion")
	String connexion(@WebParam(name = "paramLogin") String paramLogin,
			@WebParam(name = "paramMotDePasse") String paramMotDePasse);

	/**
	 * Pour vérifier le token.
	 * @param paramToken le token à vérifier.
	 * @return le token.
	 */
	@WebMethod(operationName = "verificationToken")
	@WebResult(name = "resultatVerificationToken")
	String verificationToken(@WebParam(name = "paramToken") String paramToken);

}
