package fr.afcepf.atod26.ws.supertp.web.managedbean;

import java.util.List;

import javax.faces.bean.ManagedBean;

import org.apache.log4j.Logger;

import fr.afcepf.atod26.webservice.supertp.controler.IControllerWS;
import fr.afcepf.atod26.webservice.supertp.controler.Marque;
import fr.afcepf.atod26.webservice.supertp.controler.ReponseGetAllMarque;
import fr.afcepf.atod26.webservice.supertp.controler.WSControlerException_Exception;
import fr.afcepf.atod26.webservice.supertp.controler.WebServiceControleur;

@ManagedBean
public class ManagedBeanTp {

	private String login;

	private String motDePasse;

	private String token = "";

	private String marqueSelectionnee;

	private List<Marque> lesMarques;

	private Logger log = Logger.getLogger(ManagedBeanTp.class);

	public String connexion() {
		log.info("Méthode connexion");
		WebServiceControleur service = new WebServiceControleur();
		IControllerWS proxy = service.getControlerWSImplPort();
		try {
			token = proxy.connexion(login, motDePasse);
			ReponseGetAllMarque reponseGetAllMarque = proxy.recupererLesMarques(token);
			lesMarques = reponseGetAllMarque.getListeDeMarque();
		} catch (WSControlerException_Exception e) {
			log.error(e);
		}
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

	public List<Marque> getLesMarques() {
		return lesMarques;
	}

	public void setLesMarques(List<Marque> lesMarques) {
		this.lesMarques = lesMarques;
	}

}
