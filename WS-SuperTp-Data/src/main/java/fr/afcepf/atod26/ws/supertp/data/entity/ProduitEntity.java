package fr.afcepf.atod26.ws.supertp.data.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "produit")
public class ProduitEntity {

	/**
	 * Identifiant du produit.
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
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
	 * {@link MarqueEntity} du produit.
	 */
	@ManyToOne
	@JoinColumn(name = "id_marque")
	private MarqueEntity marque;

	/**
	 * Constructeur vide.
	 */
	public ProduitEntity() {
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
	public ProduitEntity(Integer id, String libelle, double prix, String description, MarqueEntity marque) {
		super();
		this.id = id;
		this.libelle = libelle;
		this.prix = prix;
		this.description = description;
		this.marque = marque;
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

	public MarqueEntity getMarque() {
		return marque;
	}

	public void setMarque(MarqueEntity marque) {
		this.marque = marque;
	}

}
