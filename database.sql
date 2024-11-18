-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               8.0.30 - MySQL Community Server - GPL
-- Server OS:                    Win64
-- HeidiSQL Version:             12.1.0.6537
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


-- Dumping database structure for db_laundry
CREATE DATABASE IF NOT EXISTS `db_laundry` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `db_laundry`;

-- Dumping structure for table db_laundry.admin
CREATE TABLE IF NOT EXISTS `admin` (
  `id` int NOT NULL AUTO_INCREMENT,
  `username` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `password` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `is_owner` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Dumping data for table db_laundry.admin: ~2 rows (approximately)
REPLACE INTO `admin` (`id`, `username`, `password`, `is_owner`) VALUES
	(1, 'aqul', '123', 0),
	(2, 'admin', 'admin', 1);

-- Dumping structure for table db_laundry.orders
CREATE TABLE IF NOT EXISTS `orders` (
  `order_id` varchar(18) NOT NULL,
  `user_id` int DEFAULT NULL,
  `service_id` int DEFAULT NULL,
  `admin_id` int DEFAULT NULL,
  `status` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `amount` float DEFAULT NULL,
  `order_date` datetime DEFAULT NULL,
  `total_price` bigint DEFAULT NULL,
  `customer_name` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`order_id`) USING BTREE,
  KEY `user_id` (`user_id`) USING BTREE,
  KEY `service_id` (`service_id`) USING BTREE,
  KEY `admin_id` (`admin_id`) USING BTREE,
  CONSTRAINT `orders_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`),
  CONSTRAINT `orders_ibfk_2` FOREIGN KEY (`service_id`) REFERENCES `service` (`id`),
  CONSTRAINT `orders_ibfk_3` FOREIGN KEY (`admin_id`) REFERENCES `admin` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Dumping data for table db_laundry.orders: ~11 rows (approximately)
REPLACE INTO `orders` (`order_id`, `user_id`, `service_id`, `admin_id`, `status`, `amount`, `order_date`, `total_price`, `customer_name`) VALUES
	('ORD241106122529129', 1, 4, 1, 'Received', 5, '2024-11-06 12:25:29', 40000, 'Aqul'),
	('ORD241106124530990', 2, 3, 1, 'Received', 4.2, '2024-11-06 12:45:30', 21000, 'Ferry'),
	('ORD241106124715266', 3, 4, 1, 'Received', 8, '2024-11-06 12:47:15', 64000, 'ewbid'),
	('ORD241106124937674', 3, 3, 1, 'Completed', 2.6, '2024-11-06 12:49:37', 13000, 'Ewbid'),
	('ORD241107094353914', 1, 3, 1, 'Completed', 5.7, '2024-11-07 09:43:53', 28500, 'Aqul'),
	('ORD241107094434093', 2, 3, 1, 'Received', 3.5, '2024-11-07 09:44:34', 17500, 'Ferry'),
	('ORD241112133947728', 1, 3, 2, 'Received', 3.5, '2024-11-12 13:39:47', 17500, 'Aqul'),
	('ORD241112160003629', 4, 3, 1, 'Completed', 5, '2024-11-12 16:00:03', 25000, 'Dhinda'),
	('ORD241117021337581', 1, 3, 1, 'Received', 5.3, '2024-11-17 02:13:37', 26500, 'Aqul'),
	('ORD241117022357596', 1, 3, 1, 'Received', 2.5, '2024-11-17 02:23:57', 12500, 'test'),
	('ORD241117024833502', 1, 3, 2, 'Received', 3.56, '2024-11-17 02:48:33', 17800, 'Aqul');

-- Dumping structure for table db_laundry.service
CREATE TABLE IF NOT EXISTS `service` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(150) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `price` bigint DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Dumping data for table db_laundry.service: ~4 rows (approximately)
REPLACE INTO `service` (`id`, `name`, `price`) VALUES
	(1, 'Cuci', 3000),
	(2, 'Gosok', 3000),
	(3, 'Cuci Gosok', 5000),
	(4, 'Cuci Gosok Express', 8000);

-- Dumping structure for table db_laundry.service_order
CREATE TABLE IF NOT EXISTS `service_order` (
  `service_id` int NOT NULL,
  `order_service_id` varchar(50) NOT NULL,
  PRIMARY KEY (`service_id`,`order_service_id`) USING BTREE,
  KEY `order_service_id` (`order_service_id`) USING BTREE,
  CONSTRAINT `service_order_ibfk_1` FOREIGN KEY (`service_id`) REFERENCES `service` (`id`),
  CONSTRAINT `service_order_ibfk_2` FOREIGN KEY (`order_service_id`) REFERENCES `orders` (`order_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Dumping data for table db_laundry.service_order: ~0 rows (approximately)

-- Dumping structure for table db_laundry.user
CREATE TABLE IF NOT EXISTS `user` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nama` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `phone_number` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `point` int NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE KEY `phone_number` (`phone_number`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Dumping data for table db_laundry.user: ~5 rows (approximately)
REPLACE INTO `user` (`id`, `nama`, `phone_number`, `point`) VALUES
	(1, 'Aqul', '085157226383', 28),
	(2, 'Ferry', '081378086874', 0),
	(3, 'ewbid', '085162575599', 0),
	(4, 'Dhinda', '083186930088', 25);

/*!40103 SET TIME_ZONE=IFNULL(@OLD_TIME_ZONE, 'system') */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
