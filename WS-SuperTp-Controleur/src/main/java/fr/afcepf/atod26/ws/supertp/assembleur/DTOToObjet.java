package fr.afcepf.atod26.ws.supertp.assembleur;

import org.dozer.DozerBeanMapper;

import fr.afcepf.atod26.ws.supertp.controleur.proxys.daorechercher.MarqueDTO;
import fr.afcepf.atod26.ws.supertp.controleur.proxys.daorechercher.ProduitDTO;
import fr.afcepf.atod26.ws.supertp.objets.Marque;
import fr.afcepf.atod26.ws.supertp.objets.Produit;

public class DTOToObjet {

	private static final DozerBeanMapper DOZER_BEAN_MAPPER = new DozerBeanMapper();

	private DTOToObjet() {
		// EMTPY
	}

	public static Marque fromMarqueDTOToMarque(final MarqueDTO paramMarqueDTO) {
		final Marque marque = new Marque();
		DOZER_BEAN_MAPPER.map(paramMarqueDTO, marque);
		return marque;
	}

	public static Produit fromProduitDTOToProduit(final ProduitDTO paramProduitDTO) {
		final Produit produit = new Produit();
		DOZER_BEAN_MAPPER.map(paramProduitDTO, produit);
		return produit;
	}

}
