package fr.afcepf.atod26.ws.supertp.controleur.impl;

import java.net.MalformedURLException;
import java.net.URL;

import javax.jws.WebService;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import org.apache.log4j.Logger;

import fr.afcepf.atod26.ws.supertp.controleur.api.IControlerWS;
import fr.afcepf.atod26.ws.supertp.controleur.api.IServiceAuthentification;
import fr.afcepf.atod26.ws.supertp.exception.WSControlerException;
import fr.afcepf.atod26.ws.supertp.objets.Marque;
import fr.afcepf.atod26.ws.supertp.reponses.ReponseGetAllMarque;
import fr.afcepf.atod26.ws.supertp.reponses.ReponseRechercheProduit;

@WebService(targetNamespace = "http://controler.lebaronjerome.supertp.webservice.atod26.afcepf.fr", endpointInterface = "fr.afcepf.atod26.ws.supertp.controleur.api.IControlerWS", serviceName = "webServiceControleur")
public class ControlerWSImpl implements IControlerWS {

	private Logger log = Logger.getLogger(ControlerWSImpl.class);

	private IServiceAuthentification proxyServiceAuthentification;

	public ControlerWSImpl() {
		try {
			URL url = new URL(
					"http://localhost:8080/WS-SuperTP-Authentification/serviceAuthentification/authentificationService?wsdl");
			QName qName = new QName("http://lebaronjerome.supertp.ws.atod26.afcepf.fr",
					"ServiceAuthentificationImplPort");
			Service service = Service.create(url, qName);
			proxyServiceAuthentification = service.getPort(IServiceAuthentification.class);
		} catch (MalformedURLException e) {
			log.error(e);
		}
	}

	@Override
	public String connect(String paramLogin, String paramMotDePasse) throws WSControlerException {
		log.info("Méthode connect");
		return null;
	}

	@Override
	public ReponseRechercheProduit rechercherProduit(Marque paramMarque, String paramToken) throws WSControlerException {
		log.info("Méthode rechercherProduit");
		return null;
	}

	@Override
	public ReponseGetAllMarque recupererToutesLesMarques(String paramToken) throws WSControlerException {
		log.info("Méthode recupererToutesLesMarques");
		return null;
	}

}
