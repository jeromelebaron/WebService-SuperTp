package fr.afcepf.atod26.ws.supertp.data.assembleur;

import fr.afcepf.atod26.ws.supertp.data.dto.MarqueDTO;
import fr.afcepf.atod26.ws.supertp.data.dto.ProduitDTO;
import fr.afcepf.atod26.ws.supertp.data.entity.MarqueEntity;
import fr.afcepf.atod26.ws.supertp.data.entity.ProduitEntity;

public class EntityToDTO {

	private EntityToDTO() {
		// EMPTY
	}

	public static ProduitDTO fromProduitEntityToProduitDTO(final ProduitEntity produitEntity) {
		final ProduitDTO produitDTO = new ProduitDTO();
		produitDTO.setId(produitEntity.getId());
		produitDTO.setLibelle(produitEntity.getLibelle());
		produitDTO.setPrix(produitEntity.getPrix());
		produitDTO.setDescription(produitEntity.getDescription());
		produitDTO.setMarque(fromMarqueEntityToMarqueDTO(produitEntity.getMarque()));
		return produitDTO;
	}

	public static MarqueDTO fromMarqueEntityToMarqueDTO(final MarqueEntity marqueEntity) {
		final MarqueDTO marqueDTO = new MarqueDTO();
		marqueDTO.setId(marqueEntity.getId());
		marqueDTO.setLibelle(marqueEntity.getLibelle());
		return marqueDTO;
	}

}
