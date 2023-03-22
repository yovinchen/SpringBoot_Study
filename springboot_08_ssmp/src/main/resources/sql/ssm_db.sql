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

 Date: 10/05/2023 14:22:37
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for tbl_book
-- ----------------------------
DROP TABLE IF EXISTS `tbl_book`;
CREATE TABLE `tbl_book` (
  `id` int NOT NULL AUTO_INCREMENT,
  `type` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL,
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL,
  `description` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of tbl_book
-- ----------------------------
BEGIN;
INSERT INTO `tbl_book` (`id`, `type`, `name`, `description`) VALUES (1, '计算机理论', 'Spring实战 第五版', 'SpringBoot入门经典教程，深入理解Spring原理技术内幕');
INSERT INTO `tbl_book` (`id`, `type`, `name`, `description`) VALUES (2, '计算机理论', 'Spring 5核心原理与30个类手写实战', '十年沉淀之作，手写Spring精华思想');
INSERT INTO `tbl_book` (`id`, `type`, `name`, `description`) VALUES (3, '计算机理论', 'Spring 5 设计模式', '深入Spring孕妈剖析Spring源码中蕴含的10大设计模式');
INSERT INTO `tbl_book` (`id`, `type`, `name`, `description`) VALUES (4, '计算机理论', 'Spring MVC+MyBatis开发从入门到项目实战', '全方位解析面向Web应用的轻量级框架，带你成为Spring MVC开发高手');
INSERT INTO `tbl_book` (`id`, `type`, `name`, `description`) VALUES (5, '计算机理论', '轻量级Java Web企业应用实战', '源码级剖析Spring框架，适合已掌握Java基础的读者');
INSERT INTO `tbl_book` (`id`, `type`, `name`, `description`) VALUES (6, '计算机理论', 'Java核心技术 卷Ⅰ 基础知识（原书第11版）', 'Core Java第11版，Jolt大奖获奖作品，针对Java SE9、10、11全面更新');
INSERT INTO `tbl_book` (`id`, `type`, `name`, `description`) VALUES (7, '计算机理论', '深入理解Java虚拟机', '5个维度全面剖析JVM，大厂面视知识点全覆盖');
INSERT INTO `tbl_book` (`id`, `type`, `name`, `description`) VALUES (8, '计算机理论', 'Java编程思想（第4版）', 'Java学习必读经典，殿堂级著作！赢得了全球程序员的广泛赞誉');
INSERT INTO `tbl_book` (`id`, `type`, `name`, `description`) VALUES (9, '计算机理论', '零基础学Java（全彩版）', '零基础自学编程的入门图书，由浅入深，详解Java语言的编程思想和核心技术');
INSERT INTO `tbl_book` (`id`, `type`, `name`, `description`) VALUES (10, '市场营销', '直播就该这么做：主播高效沟通实战指南', '李子柒、李佳琦、薇娅成长为网红的秘密都在书中');
INSERT INTO `tbl_book` (`id`, `type`, `name`, `description`) VALUES (11, '市场营销', '直播销讲实战一本通', '和秋叶一起学系列网络营销书籍');
INSERT INTO `tbl_book` (`id`, `type`, `name`, `description`) VALUES (12, '市场营销', '直播带货：淘宝、天猫直播从新手到高手', '一本教你如何玩转直播的书，10堂课轻松实现带货月入3W+');
INSERT INTO `tbl_book` (`id`, `type`, `name`, `description`) VALUES (16, 'test1', 'test1', 'test1');
INSERT INTO `tbl_book` (`id`, `type`, `name`, `description`) VALUES (17, '测试数据123', '测试数据123', '测试数据123');
INSERT INTO `tbl_book` (`id`, `type`, `name`, `description`) VALUES (18, '测试数据123', '测试数据123', '测试数据123');
INSERT INTO `tbl_book` (`id`, `type`, `name`, `description`) VALUES (19, '测试数据123', '测试数', '测试数据123');
INSERT INTO `tbl_book` (`id`, `type`, `name`, `description`) VALUES (21, '测试数据123', '测试数据123', '测试数据123');
INSERT INTO `tbl_book` (`id`, `type`, `name`, `description`) VALUES (22, '测试数据123', '测试数据123', '测试数据123');
INSERT INTO `tbl_book` (`id`, `type`, `name`, `description`) VALUES (23, '测试数据123', '测试数据123', '测试数据123');
INSERT INTO `tbl_book` (`id`, `type`, `name`, `description`) VALUES (24, '测试数据123', '测试数据123', '测试数据123');
INSERT INTO `tbl_book` (`id`, `type`, `name`, `description`) VALUES (25, '测试数据123', '测试数据123', '测试数据123');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
