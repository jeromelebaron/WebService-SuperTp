package fr.afcepf.atod26.ws.authentification.api;

public interface IServiceAuthentification {

	String connexion(String paramLogin, String paramMotDePasse);

	String verificationToken(String paramToken);

}
