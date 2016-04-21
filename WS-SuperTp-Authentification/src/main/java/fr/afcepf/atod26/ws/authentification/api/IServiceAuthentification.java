package fr.afcepf.atod26.ws.authentification.api;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService(targetNamespace = "http://lebaronjerome.supertp.ws.atod26.afcepf.fr")
@SOAPBinding(style = Style.DOCUMENT)
public interface IServiceAuthentification {

	@WebMethod(operationName = "connexion")
	@WebResult(name = "resultatConnexion")
	String connexion(@WebParam(name = "paramLogin") String paramLogin,
			@WebParam(name = "paramMotDePasse") String paramMotDePasse);

	@WebMethod(operationName = "verificationToken")
	@WebResult(name = "resultatVerificationToken")
	String verificationToken(@WebParam(name = "paramToken") String paramToken);

}
