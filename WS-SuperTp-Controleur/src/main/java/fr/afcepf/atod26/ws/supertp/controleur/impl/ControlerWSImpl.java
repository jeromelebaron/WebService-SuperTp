package fr.afcepf.atod26.ws.supertp.controleur.impl;

import java.net.MalformedURLException;
import java.net.URL;

import javax.jws.WebService;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import org.apache.log4j.Logger;

import fr.afcepf.atod26.ws.supertp.controleur.api.IControllerWS;
import fr.afcepf.atod26.ws.supertp.controleur.api.IServiceAuthentification;
import fr.afcepf.atod26.ws.supertp.exception.WSControlerException;
import fr.afcepf.atod26.ws.supertp.objets.Marque;
import fr.afcepf.atod26.ws.supertp.reponses.ReponseGetAllMarque;
import fr.afcepf.atod26.ws.supertp.reponses.ReponseRechercheProduit;

@WebService(targetNamespace = "http://controler.supertp.webservice.atod26.afcepf.fr", endpointInterface = "fr.afcepf.atod26.ws.supertp.controleur.api.IControllerWS", serviceName = "webServiceControleur")
public class ControlerWSImpl implements IControllerWS {

	private Logger log = Logger.getLogger(ControlerWSImpl.class);

	private IServiceAuthentification proxyServiceAuthentification;

	public ControlerWSImpl() {
		log.info("Constructeur ControlerWSImpl");
		try {
			final URL url = new URL(
					"http://localhost:8080/WS-SuperTP-Authentification/serviceAuthentification/authentificationService?wsdl");
			final QName qName = new QName("http://lebaronjerome.supertp.ws.atod26.afcepf.fr", "serviceAuthentification");
			final Service service = Service.create(url, qName);
			proxyServiceAuthentification = service.getPort(IServiceAuthentification.class);
		} catch (MalformedURLException e) {
			log.error(e);
		}
	}

	@Override
	public String connect(final String paramLogin, final String paramMotDePasse) throws WSControlerException {
		log.info("Méthode connect");
		final String token = proxyServiceAuthentification.connexion(paramLogin, paramMotDePasse);
		if (token == null) {
			throw new WSControlerException("Erreur d'authentification");
		}
		return token;
	}

	@Override
	public ReponseRechercheProduit rechercherProduit(final String paramToken, final Marque paramMarque) throws WSControlerException {
		log.info("Méthode rechercherProduit");
		final ReponseRechercheProduit reponseRechercheProduit = new ReponseRechercheProduit();
		final String tokenVerifie = verificationToken(paramToken);
		reponseRechercheProduit.setToken(tokenVerifie);
		// TODO Finir l'implémentation : appeler le Dao et faire la recherche
		return reponseRechercheProduit;
	}

	@Override
	public ReponseGetAllMarque recupererToutesLesMarques(final String paramToken) throws WSControlerException {
		log.info("Méthode recupererToutesLesMarques");
		final ReponseGetAllMarque reponseGetAllMarque = new ReponseGetAllMarque();
		final String tokenVerifie = verificationToken(paramToken);
		reponseGetAllMarque.setToken(tokenVerifie);
		// TODO Finir l'implémentation
		return reponseGetAllMarque;
	}

	private String verificationToken(final String paramToken) throws WSControlerException {
		log.info("Méthode privée verificationToken");
		final String tokenVerifie = proxyServiceAuthentification.verificationToken(paramToken);
		if (tokenVerifie == null) {
			throw new WSControlerException("Token invalide");
		}
		return tokenVerifie;
	}

}
