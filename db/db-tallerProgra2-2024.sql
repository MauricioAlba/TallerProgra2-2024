-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Versión del servidor:         10.4.32-MariaDB - mariadb.org binary distribution
-- SO del servidor:              Win64
-- HeidiSQL Versión:             12.8.0.6908
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


-- Volcando estructura de base de datos para datosdeprogra
CREATE DATABASE IF NOT EXISTS `datosdeprogra` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_spanish_ci */;
USE `datosdeprogra`;

-- Volcando estructura para tabla datosdeprogra.activity
CREATE TABLE IF NOT EXISTS `activity` (
  `Id_activity` int(11) NOT NULL AUTO_INCREMENT,
  `description` varchar(50) NOT NULL,
  `status` int(11) NOT NULL,
  `Id_user` int(11) NOT NULL,
  `manager` int(11) NOT NULL,
  PRIMARY KEY (`Id_activity`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_spanish_ci;

-- Volcando datos para la tabla datosdeprogra.activity: ~0 rows (aproximadamente)
DELETE FROM `activity`;

-- Volcando estructura para tabla datosdeprogra.equipament
CREATE TABLE IF NOT EXISTS `equipament` (
  `Id_equipament` int(11) NOT NULL AUTO_INCREMENT,
  `code_equipment` varchar(50) DEFAULT NULL,
  `description` varchar(50) DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  `Id_room` int(11) DEFAULT NULL,
  PRIMARY KEY (`Id_equipament`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_spanish_ci;

-- Volcando datos para la tabla datosdeprogra.equipament: ~0 rows (aproximadamente)
DELETE FROM `equipament`;

-- Volcando estructura para tabla datosdeprogra.equipament_userclient
CREATE TABLE IF NOT EXISTS `equipament_userclient` (
  `Id_userEquipment` int(11) NOT NULL AUTO_INCREMENT,
  `description` varchar(50) DEFAULT NULL,
  `observation` varchar(50) DEFAULT NULL,
  `Id_equipament` int(11) DEFAULT NULL,
  `Id_userClient` int(11) DEFAULT NULL,
  PRIMARY KEY (`Id_userEquipment`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_spanish_ci;

-- Volcando datos para la tabla datosdeprogra.equipament_userclient: ~0 rows (aproximadamente)
DELETE FROM `equipament_userclient`;

-- Volcando estructura para tabla datosdeprogra.register
CREATE TABLE IF NOT EXISTS `register` (
  `Id_register` int(11) NOT NULL AUTO_INCREMENT,
  `checkin_time` datetime DEFAULT NULL,
  `checkout_time` datetime DEFAULT NULL,
  `Id_user` int(11) DEFAULT NULL,
  PRIMARY KEY (`Id_register`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_spanish_ci;

-- Volcando datos para la tabla datosdeprogra.register: ~0 rows (aproximadamente)
DELETE FROM `register`;

-- Volcando estructura para tabla datosdeprogra.requesment
CREATE TABLE IF NOT EXISTS `requesment` (
  `Id_requesmenr` int(11) NOT NULL AUTO_INCREMENT,
  `status` int(11) NOT NULL,
  `description` varchar(50) NOT NULL,
  `variante` int(11) NOT NULL,
  `Id_user` int(11) NOT NULL,
  PRIMARY KEY (`Id_requesmenr`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_spanish_ci;

-- Volcando datos para la tabla datosdeprogra.requesment: ~0 rows (aproximadamente)
DELETE FROM `requesment`;

-- Volcando estructura para tabla datosdeprogra.reservation
CREATE TABLE IF NOT EXISTS `reservation` (
  `Id_reservation` int(11) NOT NULL AUTO_INCREMENT,
  `check_in` time DEFAULT NULL,
  `check_out` time DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  `Id_user` int(11) DEFAULT NULL,
  `Id_room` int(11) DEFAULT NULL,
  PRIMARY KEY (`Id_reservation`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_spanish_ci;

-- Volcando datos para la tabla datosdeprogra.reservation: ~0 rows (aproximadamente)
DELETE FROM `reservation`;

-- Volcando estructura para tabla datosdeprogra.room
CREATE TABLE IF NOT EXISTS `room` (
  `Id_room` int(11) NOT NULL AUTO_INCREMENT,
  `name_room` varchar(50) DEFAULT NULL,
  `description` varchar(50) DEFAULT NULL,
  `ammount_max` int(11) DEFAULT NULL,
  PRIMARY KEY (`Id_room`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_spanish_ci;

-- Volcando datos para la tabla datosdeprogra.room: ~0 rows (aproximadamente)
DELETE FROM `room`;

-- Volcando estructura para tabla datosdeprogra.userclient
CREATE TABLE IF NOT EXISTS `userclient` (
  `Id_userClient` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL,
  `room` varchar(50) DEFAULT NULL,
  `equipment` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`Id_userClient`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_spanish_ci;

-- Volcando datos para la tabla datosdeprogra.userclient: ~0 rows (aproximadamente)
DELETE FROM `userclient`;

-- Volcando estructura para tabla datosdeprogra.userpersonal
CREATE TABLE IF NOT EXISTS `userpersonal` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  `rol` varchar(50) NOT NULL,
  `dependence` varchar(50) DEFAULT NULL,
  `level` int(11) DEFAULT NULL,
  `user` varchar(50) DEFAULT NULL,
  `password` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`user_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_spanish_ci;

-- Volcando datos para la tabla datosdeprogra.userpersonal: ~1 rows (aproximadamente)
DELETE FROM `userpersonal`;
INSERT INTO `userpersonal` (`user_id`, `name`, `rol`, `dependence`, `level`, `user`, `password`) VALUES
	(1, 'admin', 'admin', NULL, NULL, 'admin', '123');

/*!40103 SET TIME_ZONE=IFNULL(@OLD_TIME_ZONE, 'system') */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
