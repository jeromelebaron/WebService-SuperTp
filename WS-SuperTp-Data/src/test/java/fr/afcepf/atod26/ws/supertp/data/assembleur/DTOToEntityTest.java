package fr.afcepf.atod26.ws.supertp.data.assembleur;

import org.junit.Assert;
import org.junit.Test;

import fr.afcepf.atod26.ws.supertp.data.dto.MarqueDTO;
import fr.afcepf.atod26.ws.supertp.data.entity.MarqueEntity;

public class DTOToEntityTest {

	@Test
	public void testFromMarqueDTOToMarqueEntity() {
		MarqueDTO marqueDTO = new MarqueDTO(1, "Apple");
		MarqueEntity marqueEntity = DTOToEntity.fromMarqueDTOToMarqueEntity(marqueDTO);

		Assert.assertEquals(marqueDTO.getId(), marqueEntity.getId());
		Assert.assertEquals(marqueDTO.getLibelle(), marqueEntity.getLibelle());
	}

}
