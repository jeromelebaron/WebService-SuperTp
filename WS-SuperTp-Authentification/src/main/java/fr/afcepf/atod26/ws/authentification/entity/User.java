package fr.afcepf.atod26.ws.authentification.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "users")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_user")
	private int idUser;

	@Column(nullable = false)
	private String login;

	@Column(name = "mot_de_passe", nullable = false)
	private String motDePasse;

	private String token;

	@Column(name = "date_derniere_connexion")
	private Date dateDeDerniereConnexion;

	public User() {
		// EMPTY
	}

	public User(int idUser, String login, String motDePasse, String token,
			Date dateDeDerniereConnexion) {
		this.idUser = idUser;
		this.login = login;
		this.motDePasse = motDePasse;
		this.token = token;
		this.dateDeDerniereConnexion = dateDeDerniereConnexion;
	}

	public int getIdUser() {
		return idUser;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
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

	public Date getDateDeDerniereConnexion() {
		return dateDeDerniereConnexion;
	}

	public void setDateDeDerniereConnexion(Date dateDeDerniereConnexion) {
		this.dateDeDerniereConnexion = dateDeDerniereConnexion;
	}

}
