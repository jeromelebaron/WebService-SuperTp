package fr.afcepf.atod26.ws.authentification.impl;

import javax.jws.WebService;

import org.apache.log4j.Logger;

import fr.afcepf.atod26.ws.authentification.api.IServiceAuthentification;

@WebService(serviceName = "serviceAuthentification", targetNamespace = "http://lebaronjerome.supertp.ws.atod26.afcepf.fr", endpointInterface = "fr.afcepf.atod26.ws.authentification.api.IServiceAuthentification")
public class ServiceAuthentificationImpl implements IServiceAuthentification {

	private Logger log = Logger.getLogger(ServiceAuthentificationImpl.class);

	private static final String REQUETE_CONNEXION = "FROM users U WHERE u.login = :login AND u.motDePasse = :motDePasse";

	@Override
	public String connexion(String paramLogin, String paramMotDePasse) {
		log.info("Méthode connexion");
		return null;
	}

	@Override
	public String verificationToken(String paramToken) {
		log.info("Méthode verificationToken");
		return null;
	}

	private String getToken() {
		log.info("Méthode getToken");
	}

	private String generateToken() {
		log.info("Méthode generateToken");
	}
}
