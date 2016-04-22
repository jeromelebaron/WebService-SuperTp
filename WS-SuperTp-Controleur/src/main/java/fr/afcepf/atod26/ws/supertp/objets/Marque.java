package fr.afcepf.atod26.ws.supertp.objets;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(namespace = "http://controler.lebaronjerome.supertp.webservice.atod26.afcepf.fr")
public class Marque {

	/**
	 * Identifiant de la marque
	 */
	private Integer id;
	/**
	 * Libellé de la marque
	 */
	private String libelle;

	/**
	 * Constructeur vide.
	 */
	public Marque() {
		// EMPTY
	}

	/**
	 * Constructeur plein.
	 * @param id
	 * @param libelle
	 */
	public Marque(Integer id, String libelle) {
		super();
		this.id = id;
		this.libelle = libelle;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

}
