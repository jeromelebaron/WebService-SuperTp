package fr.afcepf.atod26.ws.supertp.data.assembleur;

import fr.afcepf.atod26.ws.supertp.data.dto.MarqueDTO;
import fr.afcepf.atod26.ws.supertp.data.entity.MarqueEntity;

public class DTOToEntity {

	private DTOToEntity() {
		// EMPTY
	}

	public static MarqueEntity fromMarqueDTOToMarqueEntity(final MarqueDTO paramMarque) {
		MarqueEntity marqueEntity = new MarqueEntity();
		marqueEntity.setId(paramMarque.getId());
		marqueEntity.setLibelle(paramMarque.getLibelle());
		return marqueEntity;
	}

}
