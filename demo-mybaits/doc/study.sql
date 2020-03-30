/*
Navicat MySQL Data Transfer

Source Server         : 127.0.0.1
Source Server Version : 50726
Source Host           : localhost:3306
Source Database       : study

Target Server Type    : MYSQL
Target Server Version : 50726
File Encoding         : 65001

Date: 2020-03-30 15:04:41
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for course
-- ----------------------------
DROP TABLE IF EXISTS `course`;
CREATE TABLE `course` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id编号',
  `org` varchar(255) DEFAULT NULL COMMENT '培训机构',
  `name` varchar(255) DEFAULT NULL COMMENT '课程名字',
  `url` varchar(255) DEFAULT NULL COMMENT '百度盘链接',
  `code` varchar(20) DEFAULT NULL COMMENT '提取码',
  `update_time` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `create_time` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `type_id` int(11) DEFAULT NULL COMMENT '类别',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of course
-- ----------------------------
INSERT INTO `course` VALUES ('1', 'TEST', '后端', '/baidu/test', '124', '2020-03-30 14:59:18', '2020-03-18 14:59:20', '1');

-- ----------------------------
-- Table structure for type
-- ----------------------------
DROP TABLE IF EXISTS `type`;
CREATE TABLE `type` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL COMMENT '类别',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of type
-- ----------------------------
INSERT INTO `type` VALUES ('1', 'springboot');
INSERT INTO `type` VALUES ('2', 'kafka');
INSERT INTO `type` VALUES ('3', 'springcloud');
INSERT INTO `type` VALUES ('4', 'redis');
INSERT INTO `type` VALUES ('5', 'nginx');
INSERT INTO `type` VALUES ('6', 'docker');
INSERT INTO `type` VALUES ('7', 'k8s');
INSERT INTO `type` VALUES ('8', 'elasticesearch');
INSERT INTO `type` VALUES ('9', 'hbase');
INSERT INTO `type` VALUES ('10', '多线程');
INSERT INTO `type` VALUES ('11', 'DevOps');
INSERT INTO `type` VALUES ('12', 'dubbo');
INSERT INTO `type` VALUES ('13', 'zookeeper');
INSERT INTO `type` VALUES ('14', 'docker-compose');
INSERT INTO `type` VALUES ('15', 'jvm');
INSERT INTO `type` VALUES ('16', 'mysql');
INSERT INTO `type` VALUES ('17', 'tomcat');
INSERT INTO `type` VALUES ('18', 'elk');
