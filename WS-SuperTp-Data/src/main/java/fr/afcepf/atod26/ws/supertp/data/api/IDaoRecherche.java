package fr.afcepf.atod26.ws.supertp.data.api;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import fr.afcepf.atod26.ws.supertp.data.dto.MarqueDTO;
import fr.afcepf.atod26.ws.supertp.data.dto.ProduitDTO;

@WebService(targetNamespace = "http://ejb.supertp.webservice.atod26.afcepf.fr")
public interface IDaoRecherche {

	@WebMethod(operationName = "rechercherMarques")
	@WebResult(name = "resultatRechercherMarque")
	List<MarqueDTO> rechercherToutesLesMarques();

	@WebMethod(operationName = "rechercherProduits")
	@WebResult(name = "resultatRechercherProduit")
	List<ProduitDTO> rechercherProduits(@WebParam(name = "paramMarqueDTO") MarqueDTO paramMarque);

}
