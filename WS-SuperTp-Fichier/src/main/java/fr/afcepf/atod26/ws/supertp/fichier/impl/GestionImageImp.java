package fr.afcepf.atod26.ws.supertp.fichier.impl;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

import org.apache.commons.codec.binary.Base64;
import org.apache.log4j.Logger;

import fr.afcepf.atod26.ws.supertp.fichier.api.IGestionImage;

@WebService(targetNamespace = "http://fichier.supertp.webservice.atod26.afcepf.fr", endpointInterface = "fr.afcepf.atod26.ws.supertp.fichier.api.IGestionImage", serviceName = "gestionImage")
public class GestionImageImp implements IGestionImage {

	private Logger log = Logger.getLogger(GestionImageImp.class);

	@Override
	public List<String> recupererImage(final Integer idMarque, final Integer idProduit) {
		log.info("Méthode recupererImage");
		String pathImage = getClass().getResource("./").getPath();
		pathImage = pathImage.split("/WEB-INF")[0];
		final File dossierImage = new File(pathImage + "/resources/produits/marque-" + idMarque + "/" + idProduit);
		final List<String> lesImages = new ArrayList<>();
		if (dossierImage.exists() && dossierImage.isDirectory()) {
			final File[] lesImagesDuDossier = dossierImage.listFiles();
			for (final File localFichier : lesImagesDuDossier) {
				if (localFichier.isFile() && localFichier.getName().endsWith(".jpg")) {
					try {
						final FileInputStream fichierImage = new FileInputStream(localFichier);
						final byte[] byteImage = new byte[(int) localFichier.length()];
						fichierImage.read(byteImage);
						final String stringImage = Base64.encodeBase64String(byteImage);
						lesImages.add(stringImage);
						fichierImage.close();
					} catch (IOException e) {
						log.error(e);
					}
				}
			}
		}
		return lesImages;
	}

}
