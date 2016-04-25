package fr.afcepf.atod26.ws.supertp.data.api;

import java.util.List;

import javax.jws.WebParam;
import javax.jws.WebService;

import fr.afcepf.atod26.ws.supertp.data.dto.MarqueDTO;
import fr.afcepf.atod26.ws.supertp.data.dto.ProduitDTO;

@WebService(targetNamespace = "http://ejb.supertp.webservice.atod26.afcepf.fr")
public interface IDaoRecherche {

	List<MarqueDTO> rechercherToutesLesMarques();

	List<ProduitDTO> rechercherProduits(@WebParam(name = "paramMarqueDTO") MarqueDTO paramMarque);

}
