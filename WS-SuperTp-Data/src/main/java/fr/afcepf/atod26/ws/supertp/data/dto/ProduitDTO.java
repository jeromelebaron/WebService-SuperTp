package fr.afcepf.atod26.ws.supertp.data.dto;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(namespace = "http://ejb.supertp.webservice.atod26.afcepf.fr")
public class ProduitDTO {

	/**
	 * Identifiant du produit.
	 */
	private Integer id_produit;
	/**
	 * Libelle du produit.
	 */
	private String libelle;
	/**
	 * Prix du produit.
	 */
	private double prix;
	/**
	 * Description du produit.
	 */
	private String description;
	/**
	 * {@link MarqueDTO} du produit.
	 */
	private MarqueDTO marque;

	/**
	 * Constructeur vide.
	 */
	public ProduitDTO() {
		// EMPTY
	}

	/**
	 * Constructeur plein.
	 * @param id {@link #id}.
	 * @param libelle {@link #libelle}.
	 * @param prix {@link #prix}.
	 * @param description {@link #description}.
	 * @param marque {@link #marque}.
	 */
	public ProduitDTO(Integer id, String libelle, double prix, String description, MarqueDTO marque) {
		super();
		this.id_produit = id;
		this.libelle = libelle;
		this.prix = prix;
		this.description = description;
		this.marque = marque;
	}

	public Integer getId() {
		return id_produit;
	}

	public void setId(Integer id) {
		this.id_produit = id;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public MarqueDTO getMarque() {
		return marque;
	}

	public void setMarque(MarqueDTO marque) {
		this.marque = marque;
	}

}
