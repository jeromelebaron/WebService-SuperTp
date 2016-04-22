package fr.afcepf.atod26.ws.supertp.data.impl;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.jws.WebService;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceUnit;

import fr.afcepf.atod26.ws.supertp.data.api.IDaoRecherche;
import fr.afcepf.atod26.ws.supertp.data.assembleur.DTOToEntity;
import fr.afcepf.atod26.ws.supertp.data.assembleur.EntityToDTO;
import fr.afcepf.atod26.ws.supertp.data.dto.MarqueDTO;
import fr.afcepf.atod26.ws.supertp.data.dto.ProduitDTO;
import fr.afcepf.atod26.ws.supertp.data.entity.MarqueEntity;
import fr.afcepf.atod26.ws.supertp.data.entity.ProduitEntity;

@WebService(targetNamespace = "http://ejb.supertp.webservice.atod26.afcepf.fr", endpointInterface = "fr.afcepf.atod26.ws.supertp.data.api.IDaoRecherche", serviceName = "daoRecherche")
@Remote
@Stateless
public class DaoRechercherImpl implements IDaoRecherche {

	@PersistenceUnit(unitName = "WS-SuperTP-Data")
	private EntityManager entityManager;

	private static final String REQUETE_FIND_ALL_MARQUE = "FROM MarqueEntity m";

	private static final String REQUETE_FIND_PRODUIT_BY_MARQUE = "FROM ProduitEntity p WHERE p.marque = :marque";

	@Override
	public List<MarqueDTO> rechercherToutesLesMarques() {
		List<MarqueEntity> lesMarqueEntity = entityManager.createQuery(REQUETE_FIND_ALL_MARQUE, MarqueEntity.class)
				.getResultList();
		List<MarqueDTO> lesMarqueDTO = new ArrayList<>();
		for (MarqueEntity localMarqueEntity : lesMarqueEntity) {
			lesMarqueDTO.add(EntityToDTO.fromMarqueEntityToMarqueDTO(localMarqueEntity));
		}
		return lesMarqueDTO;
	}

	@Override
	public List<ProduitDTO> rechercherProduits(final MarqueDTO paramMarque) {
		final MarqueEntity marqueEntity = DTOToEntity.fromMarqueDTOToMarqueEntity(paramMarque);
		List<ProduitEntity> lesProduitEntities = entityManager
				.createQuery(REQUETE_FIND_PRODUIT_BY_MARQUE, ProduitEntity.class).setParameter("marque", marqueEntity)
				.getResultList();
		List<ProduitDTO> lesProduitDTOs = new ArrayList<>();
		for (ProduitEntity localProduitEntity : lesProduitEntities) {
			lesProduitDTOs.add(EntityToDTO.fromProduitEntityToProduitDTO(localProduitEntity));
		}
		return lesProduitDTOs;
	}
}
