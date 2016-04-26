package fr.afcepf.atod26.ws.supertp.data.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "marque")
public class MarqueEntity {

	/**
	 * Identifiant de la marque
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_marque")
	private Integer id;
	/**
	 * Libellé de la marque
	 */
	private String libelle;

	@OneToMany(mappedBy = "marque")
	private List<ProduitEntity> lesProduits;

	/**
	 * Constructeur vide.
	 */
	public MarqueEntity() {
		// EMPTY
	}

	/**
	 * Constructeur plein.
	 * @param id
	 * @param libelle
	 */
	public MarqueEntity(Integer id, String libelle, List<ProduitEntity> lesProduits) {
		super();
		this.id = id;
		this.libelle = libelle;
		this.lesProduits = lesProduits;
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

	public List<ProduitEntity> getLesProduits() {
		return lesProduits;
	}

	public void setLesProduits(List<ProduitEntity> lesProduits) {
		this.lesProduits = lesProduits;
	}

}
