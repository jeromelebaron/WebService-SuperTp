package fr.afcepf.atod26.ws.authentification.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "users")
public class User {

	/**
	 * L'identifiant unique du user.
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_users")
	private int idUser;

	/**
	 * Le login de connexion.
	 */
	@Column(nullable = false)
	private String login;

	/**
	 * Le mot de passe pour la connexion (encrypté en SHA1).
	 */
	@Column(name = "mot_de_passe", nullable = false)
	private String motDePasse;

	/**
	 * Le token aléatoire nécessaire pour sécuriser la connexion.
	 */
	private String token;

	/**
	 * La date de dernière connexion : si elle date de plus de 30 minutes, un nouveau token doit être généré.
	 */
	@Column(name = "date_derniere_connexion")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateDeDerniereConnexion;

	/**
	 * Constructeur vide.
	 */
	public User() {
		// EMPTY
	}

	/**
	 * Constructeur plein
	 * @param idUser {@link #idUser}.
	 * @param login {@link #login}.
	 * @param motDePasse {@link #motDePasse}.
	 * @param token {@link #token}.
	 * @param dateDeDerniereConnexion {@link #dateDeDerniereConnexion}.
	 */
	public User(int idUser, String login, String motDePasse, String token, Date dateDeDerniereConnexion) {
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
