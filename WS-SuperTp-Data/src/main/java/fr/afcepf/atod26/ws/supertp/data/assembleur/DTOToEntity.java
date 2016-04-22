package fr.afcepf.atod26.ws.supertp.data.assembleur;

import org.dozer.DozerBeanMapper;

import fr.afcepf.atod26.ws.supertp.data.dto.MarqueDTO;
import fr.afcepf.atod26.ws.supertp.data.entity.MarqueEntity;

public class DTOToEntity {

	private static final DozerBeanMapper DOZER_BEAN_MAPPER = new DozerBeanMapper();

	private DTOToEntity() {
		// EMPTY
	}

	public static MarqueEntity fromMarqueDTOToMarqueEntity(final MarqueDTO paramMarque) {
		MarqueEntity marqueEntity = new MarqueEntity();
		DOZER_BEAN_MAPPER.map(paramMarque, marqueEntity);
		return marqueEntity;
	}

}
