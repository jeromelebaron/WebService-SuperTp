package fr.afcepf.atod26.ws.supertp.web.managedbean;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

import org.apache.log4j.Logger;

import fr.afcepf.atod26.webservice.supertp.controler.IControllerWS;
import fr.afcepf.atod26.webservice.supertp.controler.Marque;
import fr.afcepf.atod26.webservice.supertp.controler.Produit;
import fr.afcepf.atod26.webservice.supertp.controler.ReponseGetAllMarque;
import fr.afcepf.atod26.webservice.supertp.controler.ReponseRechercheProduit;
import fr.afcepf.atod26.webservice.supertp.controler.WSControlerException_Exception;
import fr.afcepf.atod26.webservice.supertp.controler.WebServiceControleur;

@ManagedBean
public class ManagedBeanTp {

	private String login;

	private String motDePasse;

	private String token = "";

	private String idMarqueSelectionnee;

	private List<Marque> lesMarques;

	private List<Produit> lesProduitsDeLaMarque;

	private WebServiceControleur serviceDAO;

	private IControllerWS proxyDAO;

	private Logger log = Logger.getLogger(ManagedBeanTp.class);

	@PostConstruct
	public void init() {
		log.debug("Méthode init");
		serviceDAO = new WebServiceControleur();
		proxyDAO = serviceDAO.getControlerWSImplPort();
	}

	public String connexion() {
		log.info("Méthode connexion");
		try {
			token = proxyDAO.connexion(login, motDePasse);
			ReponseGetAllMarque reponseGetAllMarque = proxyDAO.recupererLesMarques(token);
			lesMarques = reponseGetAllMarque.getListeDeMarque();
		} catch (WSControlerException_Exception e) {
			log.error(e);
		}
		return "";
	}

	public String afficherLesProduits() {
		log.debug("Méthode afficherLesProduits");
		final Marque marqueSelectionnee = new Marque();
		marqueSelectionnee.setId(Integer.parseInt(idMarqueSelectionnee));
		try {
			ReponseRechercheProduit reponseRechercheProduit = proxyDAO.rechercherUnProduit(token, marqueSelectionnee);
			token = reponseRechercheProduit.getToken();
			lesProduitsDeLaMarque = reponseRechercheProduit.getLesProduit();
		} catch (WSControlerException_Exception e) {
			log.error(e);
		}
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

	public String getIdMarqueSelectionnee() {
		return idMarqueSelectionnee;
	}

	public void setIdMarqueSelectionnee(String idMarqueSelectionnee) {
		this.idMarqueSelectionnee = idMarqueSelectionnee;
	}

	public List<Marque> getLesMarques() {
		return lesMarques;
	}

	public void setLesMarques(List<Marque> lesMarques) {
		this.lesMarques = lesMarques;
	}

	public List<Produit> getLesProduitsDeLaMarque() {
		return lesProduitsDeLaMarque;
	}

	public void setLesProduitsDeLaMarque(List<Produit> lesProduitsDeLaMarque) {
		this.lesProduitsDeLaMarque = lesProduitsDeLaMarque;
	}

	public WebServiceControleur getService() {
		return serviceDAO;
	}

	public void setService(WebServiceControleur service) {
		this.serviceDAO = service;
	}

	public IControllerWS getProxy() {
		return proxyDAO;
	}

	public void setProxy(IControllerWS proxy) {
		this.proxyDAO = proxy;
	}

}
