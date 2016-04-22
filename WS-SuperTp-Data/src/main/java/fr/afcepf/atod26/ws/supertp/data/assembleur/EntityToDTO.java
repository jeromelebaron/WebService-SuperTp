package fr.afcepf.atod26.ws.supertp.data.assembleur;

import org.dozer.DozerBeanMapper;

import fr.afcepf.atod26.ws.supertp.data.dto.MarqueDTO;
import fr.afcepf.atod26.ws.supertp.data.dto.ProduitDTO;
import fr.afcepf.atod26.ws.supertp.data.entity.MarqueEntity;
import fr.afcepf.atod26.ws.supertp.data.entity.ProduitEntity;

public class EntityToDTO {

	private final static DozerBeanMapper DOZER_BEAN_MAPPER = new DozerBeanMapper();

	public static ProduitDTO fromProduitEntityToProduitDTO(final ProduitEntity produitEntity) {
		final ProduitDTO produitDTO = new ProduitDTO();
		DOZER_BEAN_MAPPER.map(produitEntity, produitDTO);
		produitDTO.setMarque(fromMarqueEntityToMarqueDTO(produitEntity.getMarque()));
		return produitDTO;
	}

	public static MarqueDTO fromMarqueEntityToMarqueDTO(MarqueEntity marque) {
		final MarqueDTO marqueDTO = new MarqueDTO();
		DOZER_BEAN_MAPPER.map(marque, marqueDTO);
		return marqueDTO;
	}

}
