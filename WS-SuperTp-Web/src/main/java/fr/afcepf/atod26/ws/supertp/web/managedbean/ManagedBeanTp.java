package fr.afcepf.atod26.ws.supertp.web.managedbean;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class ManagedBeanTp {

	private String login;

	private String motDePasse;

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

}
