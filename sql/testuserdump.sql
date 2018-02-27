-- MySQL dump 10.13  Distrib 5.7.17, for macos10.12 (x86_64)
--
-- Host: 127.0.0.1    Database: testuser
-- ------------------------------------------------------
-- Server version	5.7.17

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(15) NOT NULL,
  `last_name` varchar(15) NOT NULL,
  `address` varchar(15) DEFAULT NULL,
  `city` varchar(20) DEFAULT NULL,
  `state` varchar(2) DEFAULT NULL,
  `zipcode` int(11) DEFAULT NULL,
  `areacode` int(11) DEFAULT NULL,
  `phone` int(11) DEFAULT NULL,
  `user_name` varchar(20) NOT NULL,
  `user_pass` varchar(255) NOT NULL,
  `registered_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `birthday` date DEFAULT NULL,
  `email` varchar(50) NOT NULL,
  `user_roles` enum('PENDING','ADMIN','TEACHER','STUDENT') DEFAULT NULL,
  `last_updated` date DEFAULT NULL,
  `user_photo_link` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `user_user_name_uindex` (`user_name`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` (`id`, `first_name`, `last_name`, `address`, `city`, `state`, `zipcode`, `areacode`, `phone`, `user_name`, `user_pass`, `registered_date`, `birthday`, `email`, `user_roles`, `last_updated`, `user_photo_link`) VALUES (1,'Paul','Manafort',NULL,NULL,NULL,NULL,NULL,NULL,'paul','password1','2018-02-19 06:00:00',NULL,'paul@trump.com','PENDING','2018-02-19',NULL),(2,'George','apadopoulos',NULL,NULL,NULL,NULL,NULL,NULL,'george','password2','2018-02-19 06:00:00',NULL,'george@trump.com','PENDING','2018-02-19',NULL),(3,'Carter','Page',NULL,NULL,NULL,NULL,NULL,NULL,'carter','password3','2018-02-19 06:00:00',NULL,'carter@trump.com','PENDING','2018-02-19',NULL),(4,'Roger','Stone',NULL,NULL,NULL,NULL,NULL,NULL,'roger','password4','2018-02-19 06:00:00',NULL,'roger@trump.com','PENDING','2018-02-19',NULL),(5,'Michael','Flynn',NULL,NULL,NULL,NULL,NULL,NULL,'mflynn','password5','2018-02-19 06:00:00',NULL,'mflynn@trump.com','PENDING','2018-02-19',NULL);
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-02-26 16:17:45
