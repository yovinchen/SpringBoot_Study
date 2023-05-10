/*
 Navicat Premium Data Transfer

 Source Server         : mysql
 Source Server Type    : MySQL
 Source Server Version : 80033 (8.0.33)
 Source Host           : localhost:3306
 Source Schema         : ssm_db

 Target Server Type    : MySQL
 Target Server Version : 80033 (8.0.33)
 File Encoding         : 65001

 Date: 10/05/2023 20:07:12
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for goods
-- ----------------------------
DROP TABLE IF EXISTS `goods`;
CREATE TABLE `goods` (
  `id` int NOT NULL AUTO_INCREMENT,
  `goods_name` varchar(255) DEFAULT NULL,
  `goods_img` varchar(255) DEFAULT NULL,
  `goods_price` int DEFAULT NULL,
  `goods_count` int DEFAULT NULL,
  `goods_state` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of goods
-- ----------------------------
BEGIN;
INSERT INTO `goods` (`id`, `goods_name`, `goods_img`, `goods_price`, `goods_count`, `goods_state`) VALUES (1, '班俏BANQIAO超火ins潮卫衣女士2020秋季新款韩版宽松慵懒风薄款外套带帽上衣', 'https://www.escook.cn/vuebase/pics/1.png', 108, 1, 'true');
INSERT INTO `goods` (`id`, `goods_name`, `goods_img`, `goods_price`, `goods_count`, `goods_state`) VALUES (2, '嘉叶希连帽卫衣女春秋薄款2020新款宽松bf韩版字母印花中长款外套ins潮', 'https://www.escook.cn/vuebase/pics/2.png', 129, 1, 'true');
INSERT INTO `goods` (`id`, `goods_name`, `goods_img`, `goods_price`, `goods_count`, `goods_state`) VALUES (3, '思蜜怡2020休闲运动套装女春秋季新款时尚大码宽松长袖卫衣两件套', 'https://www.escook.cn/vuebase/pics/3.png', 120, 1, 'false');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
