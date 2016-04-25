# WebService-SuperTp

##URL 

- URL du service d'authentification : `http://localhost:8080/WS-SuperTP-Authentification/serviceAuthentification/authentificationService?wsdl`
- URL du service de controleur : `http://localhost:18080/WS-SuperTP-Controleur/webServiceControleur?wsdl`
- URL du service de DAO : `http://localhost:18080/WS-SuperTP-Data/daoRecherche/DaoRechercherImpl?wsdl`
- URL du service de gestion des images : `http://localhost:18080/WS-SuperTP-Fichier/gestionImage?wsdl`

##Configuration technique :

- Tomcat 7 avec une configuration standard
- JBoss 7.1 avec tous les ports qui sont préfixé avec un `1` pour éviter les conflits avec Tomcat
- Base de données Mysql
- Java 1.7
- WebService SOAP