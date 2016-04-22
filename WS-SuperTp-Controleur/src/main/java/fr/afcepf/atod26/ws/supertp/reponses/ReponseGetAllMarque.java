package fr.afcepf.atod26.ws.supertp.reponses;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import fr.afcepf.atod26.ws.supertp.objets.Marque;

@XmlRootElement(namespace = "http://controler.lebaronjerome.supertp.webservice.atod26.afcepf.fr")
public class ReponseGetAllMarque {

	/**
	 * La liste des {@link Marque}.
	 */
	private List<Marque> listeDeMarque;
	/**
	 * Le nouveau token.
	 */
	private String token;

	public ReponseGetAllMarque() {
		// EMPTY
	}

	public ReponseGetAllMarque(List<Marque> listeDeMarque, String token) {
		super();
		this.listeDeMarque = listeDeMarque;
		this.token = token;
	}

	public List<Marque> getListeDeMarque() {
		return listeDeMarque;
	}

	public void setListeDeMarque(List<Marque> listeDeMarque) {
		this.listeDeMarque = listeDeMarque;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

}
