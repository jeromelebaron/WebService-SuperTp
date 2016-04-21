package fr.afcepf.atod26.ws.authentification.impl;

import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Calendar;
import java.util.Date;

import javax.jws.WebService;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import fr.afcepf.atod26.ws.authentification.api.IServiceAuthentification;
import fr.afcepf.atod26.ws.authentification.entity.User;

@WebService(serviceName = "serviceAuthentification", targetNamespace = "http://lebaronjerome.supertp.ws.atod26.afcepf.fr", endpointInterface = "fr.afcepf.atod26.ws.authentification.api.IServiceAuthentification")
public class ServiceAuthentificationImpl implements IServiceAuthentification {

	private Logger log = Logger.getLogger(ServiceAuthentificationImpl.class);

	private SessionFactory sessionFactory;

	private static final String REQUETE_CONNEXION = "FROM users U WHERE u.login = :login "
			+ "AND u.motDePasse = SHA256(:motDePasse)";

	private static final String REQUETE_TOKEN = "FROM users U WHERE u.token = :token";
	
	private static final String REQUETE_SUPPRESSION_TOKEN = "UPDATE User u SET u.token = null, u.dateDeDerniereConnexion = null "
			+ "WHERE u.dateDeDerniereConnexion < :date";

	@Transactional
	@Override
	public String connexion(String paramLogin, String paramMotDePasse) {
		log.info("Méthode connexion");
		Session session = sessionFactory.getCurrentSession();
		Query queryConnexion = session.createQuery(REQUETE_CONNEXION);
		queryConnexion.setParameter("login", paramLogin);
		queryConnexion.setParameter("motDePasse", paramMotDePasse);
		User user = new User();
		try {
			user = (User) queryConnexion.uniqueResult();
			if (user != null) {
				user.setToken(generateToken(user.getIdUser()));
			}
		} catch (Exception e) {
			log.error(e);
		}
		return user.getToken();
	}

	@Override
	public String verificationToken(String paramToken) {
		log.info("Méthode verificationToken");
		Session session = sessionFactory.getCurrentSession();
		Query queryToken = session.createQuery(REQUETE_TOKEN);
		queryToken.setParameter("token", paramToken);
		return null;
	}

	private void suppressionToken() {
		log.info("Méthode suppressionToken");
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.MINUTE, -30);
		Query querySuppressionToken = sessionFactory.getCurrentSession().createQuery(REQUETE_SUPPRESSION_TOKEN);
		querySuppressionToken.setParameter("date", calendar);
	}

	@Transactional
	private String generateToken(final int idUser) {
		log.info("Méthode generateToken");
		String token;
		token = DigestUtils.sha256Hex(new BigInteger(130, new SecureRandom())
				.toString(32));
		Session session = sessionFactory.getCurrentSession();
		User utilisateur = (User) session.get(User.class, idUser);
		utilisateur.setToken(token);
		utilisateur.setDateDeDerniereConnexion(new Date());
		suppressionToken();
		return token;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

}
