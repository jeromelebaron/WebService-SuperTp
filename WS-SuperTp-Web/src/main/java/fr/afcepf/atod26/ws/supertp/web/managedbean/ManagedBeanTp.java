package fr.afcepf.atod26.ws.supertp.web.managedbean;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

@ManagedBean
public class ManagedBeanTp {

	private String login;

	private String motDePasse;

	private String token;

	private String marqueSelectionnee;

	private List<String> lesMarques;

	@PostConstruct
	public void init() {
		// TODO Charger la liste des marques.
		lesMarques = new ArrayList<>();
		lesMarques.add("Apple");
	}

	public String connexion() {
		return "";
	}

	public String afficherLesProduits(final String marque) {
		return "";
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getMotDePasse() {
		return motDePasse;
	}

	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getMarqueSelectionnee() {
		return marqueSelectionnee;
	}

	public void setMarqueSelectionnee(String marqueSelectionnee) {
		this.marqueSelectionnee = marqueSelectionnee;
	}

	public List<String> getLesMarques() {
		return lesMarques;
	}

	public void setLesMarques(List<String> lesMarques) {
		this.lesMarques = lesMarques;
	}

}
