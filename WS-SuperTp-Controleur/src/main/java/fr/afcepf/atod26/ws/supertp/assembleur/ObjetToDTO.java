package fr.afcepf.atod26.ws.supertp.assembleur;

import org.dozer.DozerBeanMapper;

import fr.afcepf.atod26.ws.supertp.controleur.proxys.daorechercher.MarqueDTO;
import fr.afcepf.atod26.ws.supertp.objets.Marque;

public class ObjetToDTO {

	private static final DozerBeanMapper DOZER_BEAN_MAPPER = new DozerBeanMapper();

	private ObjetToDTO() {
		// EMPTY
	}

	public static MarqueDTO fromMarqueToMarqueDTO(final Marque paramMarque) {
		MarqueDTO marqueDTO = new MarqueDTO();
		DOZER_BEAN_MAPPER.map(paramMarque, marqueDTO);
		return marqueDTO;
	}

}
