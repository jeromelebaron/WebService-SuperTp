package fr.afcepf.atod26.ws.supertp.data.api;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import fr.afcepf.atod26.ws.supertp.data.entity.MarqueEntity;
import fr.afcepf.atod26.ws.supertp.data.entity.ProduitEntity;

@WebService(targetNamespace = "http://ejb.supertp.webservice.atod26.afcepf.fr")
public interface IDaoRecherche {

	@WebMethod(operationName = "rechercherMarques")
	@WebResult(name = "resultatRechercherMarque")
	List<MarqueEntity> rechercherToutesLesMarques();

	@WebMethod(operationName = "rechercherProduits")
	@WebResult(name = "resultatRechercherProduit")
	List<ProduitEntity> rechercherProduits(@WebParam(name = "marque") MarqueEntity paramMarque);

}
