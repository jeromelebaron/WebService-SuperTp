package fr.afcepf.atod26.ws.supertp.fichier.api;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService(targetNamespace = "http://fichier.supertp.webservice.atod26.afcepf.fr")
public interface IGestionImage {

	@WebMethod(operationName = "recupereImage")
	@WebResult(name = "imageChaine")
	List<String> recupererImage(@WebParam(name = "idMarque") Integer idMarque,
			@WebParam(name = "idProduit") Integer idProduit);

}
