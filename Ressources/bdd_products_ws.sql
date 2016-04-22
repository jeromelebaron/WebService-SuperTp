-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.1.31-community


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema ws_products
--

CREATE DATABASE IF NOT EXISTS ws_products;
USE ws_products;

--
-- Definition of table `mark`
--

DROP TABLE IF EXISTS `mark`;
CREATE TABLE `mark` (
  `idmark` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `libellemark` varchar(45) NOT NULL,
  PRIMARY KEY (`idmark`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `mark`
--

/*!40000 ALTER TABLE `mark` DISABLE KEYS */;
INSERT INTO `mark` (`idmark`,`libellemark`) VALUES 
 (1,'Apple'),
 (2,'Samsung'),
 (3,'Asus');
/*!40000 ALTER TABLE `mark` ENABLE KEYS */;


--
-- Definition of table `product`
--

DROP TABLE IF EXISTS `product`;
CREATE TABLE `product` (
  `idproduct` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `libelle` varchar(45) NOT NULL,
  `prix` decimal(8,2) NOT NULL,
  `description` text NOT NULL,
  `idmark` int(10) unsigned NOT NULL,
  PRIMARY KEY (`idproduct`),
  KEY `FK_product_mark` (`idmark`),
  CONSTRAINT `FK_product_mark` FOREIGN KEY (`idmark`) REFERENCES `mark` (`idmark`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `product`
--

/*!40000 ALTER TABLE `product` DISABLE KEYS */;
INSERT INTO `product` (`idproduct`,`libelle`,`prix`,`description`,`idmark`) VALUES 
 (1,'iPhone 6 [s]','699.99','3D Touch. Photos 12 Mpx. Vidéos 4K.\r\nUn seul mot : Hors de prix',1),
 (2,'macbook-pro','3999.99','Chaque Mac est doté d’une collection d’apps remarquables pour tout ce que vous faites au quotidien. Il y a, par exemple, Safari pour surfer sur le Web, Photos pour gérer vos photos et vidéos, Pages et Numbers pour créer des documents et des feuilles de calcul, ou encore Keynote pour réaliser des présentations. Et il y a toutes les autres apps : pour échanger e-mails et textos, prendre des notes, actualiser ses contacts ou gérer son planning. Il existe même une app pour en trouver d’autres : le Mac App Store. Bref, votre Mac a tout ce qu’il lui faut. Et tout ce qu’il vous faut. ',1),
 (3,'Galaxy s7','699.99','3D Touch. Photos 12 Mpx. Vidéos 4K.\r\nUn seul mot : Hors de prix',2),
 (4,'addwash','1239.98','Ajoutez du linge à tout moment en cours de cycle en toute simplicité* grâce au hublot additionnel AddWash. Finie la chaussette oubliée qui doit attendre une seconde lessive pour retrouver sa paire !',2),
 (5,'ROG 752','2380.00','Le dernier ordinateur portable gaming ROG, le G752, incarne l\'évolution de la marque avec son design révolutionnaire : une armure Gris titane avec des finitions Plasma cuivré. Avec Windows 10, un processeur Intel® Skylake Core™ i7 de 6e génération, jusqu\'à 64 Go de RAM DDR4 et la dernière carte graphique NVIDIA® GeForce® GTX™, le ROG G752 vous surprendra par ses performances exceptionnelles. Il intègre même la solution thermique exclusive ROG anti-poussière, qui assure une meilleure stabilité du système, un clavier rétroéclairé et un clavier gaming anti-ghosting acceptant jusqu\'à 30 pressions de touche simultanées.',3),
 (6,'PadFone','315.99','bla bla bla',3);
/*!40000 ALTER TABLE `product` ENABLE KEYS */;




/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
