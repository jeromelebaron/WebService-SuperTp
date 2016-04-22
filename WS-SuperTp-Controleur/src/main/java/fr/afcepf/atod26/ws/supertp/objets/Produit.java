package fr.afcepf.atod26.ws.supertp.objets;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(namespace = "http://controler.lebaronjerome.supertp.webservice.atod26.afcepf.fr")
public class Produit {

	/**
	 * Identifiant du produit.
	 */
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
	 * {@link Marque} du produit.
	 */
	private Marque marque;
	/**
	 * La collection d'image du produit.
	 */
	private List<String> lesImages;

	/**
	 * Constructeur vide.
	 */
	public Produit() {
		// EMPTY
	}

	/**
	 * Constructeur plein.
	 * @param id {@link #id}.
	 * @param libelle {@link #libelle}.
	 * @param prix {@link #prix}.
	 * @param description {@link #description}.
	 * @param marque {@link #marque}.
	 * @param lesImages {@link #lesImages}.
	 */
	public Produit(Integer id, String libelle, double prix, String description, Marque marque, List<String> lesImages) {
		super();
		this.id = id;
		this.libelle = libelle;
		this.prix = prix;
		this.description = description;
		this.marque = marque;
		this.lesImages = lesImages;
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

	public Marque getMarque() {
		return marque;
	}

	public void setMarque(Marque marque) {
		this.marque = marque;
	}

	public List<String> getLesImages() {
		return lesImages;
	}

	public void setLesImages(List<String> lesImages) {
		this.lesImages = lesImages;
	}

}
