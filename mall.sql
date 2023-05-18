/*
 Navicat Premium Data Transfer

 Source Server         : cstate
 Source Server Type    : MySQL
 Source Server Version : 80023
 Source Host           : localhost:3306
 Source Schema         : mall

 Target Server Type    : MySQL
 Target Server Version : 80023
 File Encoding         : 65001

 Date: 18/05/2023 16:55:00
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for role_menu
-- ----------------------------
DROP TABLE IF EXISTS `role_menu`;
CREATE TABLE `role_menu` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `role_id` int DEFAULT NULL COMMENT '角色id',
  `menu_id` int DEFAULT NULL COMMENT '菜单id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of role_menu
-- ----------------------------
BEGIN;
INSERT INTO `role_menu` VALUES (1, 1, 1);
INSERT INTO `role_menu` VALUES (2, 1, 2);
INSERT INTO `role_menu` VALUES (3, 1, 3);
INSERT INTO `role_menu` VALUES (4, 1, 4);
INSERT INTO `role_menu` VALUES (5, 1, 5);
INSERT INTO `role_menu` VALUES (6, 1, 6);
INSERT INTO `role_menu` VALUES (7, 1, 7);
INSERT INTO `role_menu` VALUES (8, 1, 8);
INSERT INTO `role_menu` VALUES (9, 1, 9);
INSERT INTO `role_menu` VALUES (10, 1, 10);
INSERT INTO `role_menu` VALUES (11, 1, 11);
INSERT INTO `role_menu` VALUES (12, 1, 12);
INSERT INTO `role_menu` VALUES (13, 1, 13);
INSERT INTO `role_menu` VALUES (14, 1, 14);
INSERT INTO `role_menu` VALUES (15, 1, 15);
INSERT INTO `role_menu` VALUES (16, 2, 1);
INSERT INTO `role_menu` VALUES (17, 2, 3);
INSERT INTO `role_menu` VALUES (18, 2, 2);
INSERT INTO `role_menu` VALUES (19, 2, 4);
INSERT INTO `role_menu` VALUES (20, 2, 5);
INSERT INTO `role_menu` VALUES (21, 2, 5);
INSERT INTO `role_menu` VALUES (24, 2, 9);
INSERT INTO `role_menu` VALUES (26, 2, 10);
COMMIT;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `user_name` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '用户名',
  `mobile` varchar(100) DEFAULT NULL COMMENT '手机号码',
  `address` varchar(255) DEFAULT NULL COMMENT '家庭住址',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of user
-- ----------------------------
BEGIN;
INSERT INTO `user` VALUES (1, '张三', '18692332325', '宝山');
INSERT INTO `user` VALUES (2, '李四', '13016122387', '浦东新区');
INSERT INTO `user` VALUES (3, '赵六', '18692442328', '徐汇区');
INSERT INTO `user` VALUES (4, '王五', '1933333333', '嘉定');
COMMIT;

-- ----------------------------
-- Table structure for user_menu
-- ----------------------------
DROP TABLE IF EXISTS `user_menu`;
CREATE TABLE `user_menu` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `menu_name` varchar(255) DEFAULT NULL COMMENT '菜单名称',
  `parent_id` int DEFAULT NULL COMMENT '父级id',
  `level` int DEFAULT NULL COMMENT '层级',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of user_menu
-- ----------------------------
BEGIN;
INSERT INTO `user_menu` VALUES (1, '计划管理', NULL, 1);
INSERT INTO `user_menu` VALUES (2, '供应商管理', NULL, 1);
INSERT INTO `user_menu` VALUES (3, '开发管理', NULL, 1);
INSERT INTO `user_menu` VALUES (4, '工程项目管理', 1, 2);
INSERT INTO `user_menu` VALUES (5, '采购目录管理', 1, 2);
INSERT INTO `user_menu` VALUES (6, '需求计划管理', 1, 2);
INSERT INTO `user_menu` VALUES (7, '工程项目管理', 4, 3);
INSERT INTO `user_menu` VALUES (8, '采购目录维护', 5, 3);
INSERT INTO `user_menu` VALUES (9, '需求计划接收', 6, 3);
INSERT INTO `user_menu` VALUES (10, '需求计划编制', 6, 3);
INSERT INTO `user_menu` VALUES (11, '采购计划编制', 12, 3);
INSERT INTO `user_menu` VALUES (12, '采购计划管理', 1, 2);
INSERT INTO `user_menu` VALUES (13, '采购计划联查', 12, 3);
INSERT INTO `user_menu` VALUES (14, '基础管理', 2, 2);
INSERT INTO `user_menu` VALUES (15, '注册供应商', 14, 3);
COMMIT;

-- ----------------------------
-- Table structure for user_role
-- ----------------------------
DROP TABLE IF EXISTS `user_role`;
CREATE TABLE `user_role` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `role_id` bigint DEFAULT NULL COMMENT '角色id',
  `role_name` varchar(255) DEFAULT NULL COMMENT '角色名称',
  `usr_id` bigint DEFAULT NULL COMMENT '用户id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of user_role
-- ----------------------------
BEGIN;
INSERT INTO `user_role` VALUES (1, 1, '管理员', 1);
INSERT INTO `user_role` VALUES (2, 2, '审核员', 2);
INSERT INTO `user_role` VALUES (3, 3, '用户', 3);
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
