package fr.afcepf.atod26.ws.supertp.data.assembleur;

import org.junit.Assert;
import org.junit.Test;

import fr.afcepf.atod26.ws.supertp.data.dto.MarqueDTO;
import fr.afcepf.atod26.ws.supertp.data.dto.ProduitDTO;
import fr.afcepf.atod26.ws.supertp.data.entity.MarqueEntity;
import fr.afcepf.atod26.ws.supertp.data.entity.ProduitEntity;

public class EntityToDTOTest {

	@Test
	public void testFromProduitEntityToProduitDTO() {
		ProduitEntity produitEntity = new ProduitEntity(1, "iPhone", 499, "Un bel iphone", new MarqueEntity(1, "Apple",
				null));
		ProduitDTO produitDTO = EntityToDTO.fromProduitEntityToProduitDTO(produitEntity);

		Assert.assertEquals(produitEntity.getId(), produitDTO.getId());
		Assert.assertEquals(produitEntity.getLibelle(), produitDTO.getLibelle());
		Assert.assertEquals(produitEntity.getPrix(), produitDTO.getPrix(), 0.000001);
		Assert.assertEquals(produitEntity.getDescription(), produitDTO.getDescription());
	}

	@Test
	public void testFromMarqueEntityToMarqueDTO() {
		MarqueEntity marqueEntity = new MarqueEntity(1, "Apple", null);
		MarqueDTO marqueDTO = EntityToDTO.fromMarqueEntityToMarqueDTO(marqueEntity);

		Assert.assertEquals(marqueEntity.getId(), marqueDTO.getId());
		Assert.assertEquals(marqueEntity.getLibelle(), marqueDTO.getLibelle());
	}

}
