/*
 Navicat Premium Data Transfer

 Source Server         : Ispit
 Source Server Type    : MySQL
 Source Server Version : 100136
 Source Host           : localhost:3306
 Source Schema         : ispit

 Target Server Type    : MySQL
 Target Server Version : 100136
 File Encoding         : 65001

 Date: 06/05/2019 22:27:47
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for predmet
-- ----------------------------
DROP TABLE IF EXISTS `predmet`;
CREATE TABLE `predmet`  (
  `predmet_id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `naziv` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `opis` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `profesor_id` int(10) UNSIGNED NOT NULL,
  PRIMARY KEY (`predmet_id`) USING BTREE,
  INDEX `fk_predmet_profesor_id`(`profesor_id`) USING BTREE,
  CONSTRAINT `fk_predmet_profesor_id` FOREIGN KEY (`profesor_id`) REFERENCES `profesor` (`profesor_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE = InnoDB AUTO_INCREMENT = 11 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of predmet
-- ----------------------------
INSERT INTO `predmet` VALUES (1, 'PrviPredmet', 'Ovo je PrviPredmet, na kojem se izucavaju prve stvari.', 1);
INSERT INTO `predmet` VALUES (2, 'DrugiPredmet', 'Ovo je DrugiPredmet, na kojem se izucavaju druge stvari.', 2);
INSERT INTO `predmet` VALUES (3, 'TreciPredmet', 'Ovo je TreciPredmet, na kojem se izucavaju trece stvari.', 3);
INSERT INTO `predmet` VALUES (4, 'CetvrtiPredmet', 'Ovo je  CetvrtiPredmet, na kojem se izucavaju cetvrte stvari.', 4);
INSERT INTO `predmet` VALUES (5, 'PetiPredmet', 'Ovo je PetiPredmet, na kojem se izucavaju pete stvari.', 5);
INSERT INTO `predmet` VALUES (6, 'SestiPredmet', 'Ovo je SestiPredmet, na kojem se izucavaju seste stvari.', 1);
INSERT INTO `predmet` VALUES (7, 'SedmiPredmet', 'Ovo je SedmiPredmet, na kojem se izucavaju sedme stvari.', 2);
INSERT INTO `predmet` VALUES (8, 'OsmiPredmet', 'Ovo je OsmiPredmet, na kojem se izucavaju osme stvari.', 3);
INSERT INTO `predmet` VALUES (9, 'DevetiPredmet', 'Ovo je DevetiPredmet, na kojem se izucavaju devete stvari.', 4);
INSERT INTO `predmet` VALUES (10, 'DesetiPredmet', 'Ovo je DesetiPredmet, na kojem se izucavaju inforamaticke umetnosti.', 5);

-- ----------------------------
-- Table structure for profesor
-- ----------------------------
DROP TABLE IF EXISTS `profesor`;
CREATE TABLE `profesor`  (
  `profesor_id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `ime` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `prezime` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `email` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`profesor_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of profesor
-- ----------------------------
INSERT INTO `profesor` VALUES (1, 'PrvoIme', 'PrvoPrezime', 'prvoime@prvoprezime.com');
INSERT INTO `profesor` VALUES (2, 'DrugoIme', 'DrugoPrezime', 'drugoime@drugoprezime.com');
INSERT INTO `profesor` VALUES (3, 'TreceIme', 'TrecePrezime', 'treceime@treceprezime.com');
INSERT INTO `profesor` VALUES (4, 'CetvrtoIme', 'CetvrtoPrezime', 'cetvrtoime@cetvrtoprezime.com');
INSERT INTO `profesor` VALUES (5, 'PetoIme', 'PetroPrezime', 'prvoime@prvoprezime.com');

SET FOREIGN_KEY_CHECKS = 1;
