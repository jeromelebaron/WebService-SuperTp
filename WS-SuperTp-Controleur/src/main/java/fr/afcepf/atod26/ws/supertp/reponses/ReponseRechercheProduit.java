package fr.afcepf.atod26.ws.supertp.reponses;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import fr.afcepf.atod26.ws.supertp.objets.Produit;

@XmlRootElement(namespace = "http://controler.supertp.webservice.atod26.afcepf.fr")
public class ReponseRechercheProduit {

	/**
	 * Les {@link Produit} trouvés.
	 */
	private List<Produit> lesProduit;
	/**
	 * Le nouveau token.
	 */
	private String token;

	/**
	 * Constructeur vide.
	 */
	public ReponseRechercheProduit() {
		// EMPTY
	}

	/**
	 * Constructeur plein.
	 * @param lesProduit {@link #lesProduit}.
	 * @param token {@link #token}.
	 */
	public ReponseRechercheProduit(List<Produit> lesProduit, String token) {
		super();
		this.lesProduit = lesProduit;
		this.token = token;
	}

	public List<Produit> getLesProduit() {
		return lesProduit;
	}

	public void setLesProduit(List<Produit> lesProduit) {
		this.lesProduit = lesProduit;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

}
