/*
 Navicat Premium Data Transfer

 Source Server         : 1234
 Source Server Type    : MySQL
 Source Server Version : 50725
 Source Host           : localhost:3306
 Source Schema         : mall

 Target Server Type    : MySQL
 Target Server Version : 50725
 File Encoding         : 65001

 Date: 10/05/2019 13:49:27
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for address
-- ----------------------------
DROP TABLE IF EXISTS `address`;
CREATE TABLE `address`  (
  `addressId` int(4) NOT NULL AUTO_INCREMENT,
  `addressrName` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `addressTel` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `addressProvince` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `addressCity` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `addressDistrict` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `addressDetailed` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `userId` int(20) NULL DEFAULT NULL,
  `isDefault` varchar(4) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`addressId`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 20 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of address
-- ----------------------------
INSERT INTO `address` VALUES (1, '妮妮', '12345678910', '浙江省', '温州市', '瑞安区', '你你您', 1, '1');
INSERT INTO `address` VALUES (2, '啦啦', '12345678910', '江苏', '苏州', '姑苏', '高博教育', 1, '1');
INSERT INTO `address` VALUES (14, '哈哈', '14598760211', '江西', '苏州', '姑苏', '年四季度难上加难', 2, '0');
INSERT INTO `address` VALUES (15, '拉拉', '1456987410', '浙江', '南昌', '青山湖', '山东省副省长非常', 2, '1');
INSERT INTO `address` VALUES (16, '防守打法', '12302548965', '湖北省', '温州市', '瑞安区', '是多少', 2, '1');
INSERT INTO `address` VALUES (17, '骡子', '1231653', '浙江省', '南昌市', '瑞安区', '还行', 25, '1');
INSERT INTO `address` VALUES (19, '12', '11', '浙江省', '温州市', '瑞安区', '11', 25, '0');

-- ----------------------------
-- Table structure for admin
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin`  (
  `adminId` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `adminPwd` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '管理员密码',
  PRIMARY KEY (`adminId`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '管理员表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of admin
-- ----------------------------
INSERT INTO `admin` VALUES ('admin', 'admin');

-- ----------------------------
-- Table structure for bagsize
-- ----------------------------
DROP TABLE IF EXISTS `bagsize`;
CREATE TABLE `bagsize`  (
  `bagesizeId` int(10) NOT NULL AUTO_INCREMENT,
  ` bagsize` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '尺寸',
  PRIMARY KEY (`bagesizeId`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '箱包尺寸表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for brand
-- ----------------------------
DROP TABLE IF EXISTS `brand`;
CREATE TABLE `brand`  (
  `brandId` int(10) NOT NULL AUTO_INCREMENT,
  ` brand` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '品牌',
  PRIMARY KEY (`brandId`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '品牌表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for cart
-- ----------------------------
DROP TABLE IF EXISTS `cart`;
CREATE TABLE `cart`  (
  `cartId` int(20) NOT NULL AUTO_INCREMENT,
  `goodsId` int(20) NOT NULL COMMENT '商品id',
  `userId` int(20) NULL DEFAULT NULL,
  `num` int(20) NULL DEFAULT NULL,
  PRIMARY KEY (`cartId`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 241 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '购物车表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of cart
-- ----------------------------
INSERT INTO `cart` VALUES (5, 7, 53, NULL);
INSERT INTO `cart` VALUES (6, 2, 53, NULL);
INSERT INTO `cart` VALUES (10, 12, 1, 4);
INSERT INTO `cart` VALUES (11, 7, 54, 4);
INSERT INTO `cart` VALUES (12, 6, 54, 2);
INSERT INTO `cart` VALUES (13, 5, 54, 1);
INSERT INTO `cart` VALUES (14, 4, 53, 1);
INSERT INTO `cart` VALUES (15, 4, 54, 1);
INSERT INTO `cart` VALUES (41, 2, 1, 2);
INSERT INTO `cart` VALUES (42, 16, 1, 1);
INSERT INTO `cart` VALUES (237, 59, 25, 1);
INSERT INTO `cart` VALUES (240, 173, 25, 4);

-- ----------------------------
-- Table structure for child
-- ----------------------------
DROP TABLE IF EXISTS `child`;
CREATE TABLE `child`  (
  `AgeId` int(10) NOT NULL AUTO_INCREMENT,
  ` age` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '适用年龄',
  PRIMARY KEY (`AgeId`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '童装适用年龄表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for collect
-- ----------------------------
DROP TABLE IF EXISTS `collect`;
CREATE TABLE `collect`  (
  `collectId` int(10) NOT NULL AUTO_INCREMENT,
  `goodsId` int(10) NOT NULL COMMENT '商品id',
  `collectDate` datetime(0) NOT NULL COMMENT '收藏时间',
  `userId` int(10) NOT NULL COMMENT '用户id',
  PRIMARY KEY (`collectId`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 76 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '收藏表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of collect
-- ----------------------------
INSERT INTO `collect` VALUES (50, 2, '2018-11-03 10:03:37', 25);
INSERT INTO `collect` VALUES (64, 5, '2018-11-03 14:21:43', 25);
INSERT INTO `collect` VALUES (66, 15, '2018-11-03 14:21:43', 25);
INSERT INTO `collect` VALUES (71, 12, '2018-11-05 18:51:01', 1);
INSERT INTO `collect` VALUES (73, 8, '2018-11-05 20:01:56', 25);
INSERT INTO `collect` VALUES (74, 144, '2018-11-12 16:30:32', 25);
INSERT INTO `collect` VALUES (75, 173, '2018-11-12 18:04:18', 25);

-- ----------------------------
-- Table structure for color
-- ----------------------------
DROP TABLE IF EXISTS `color`;
CREATE TABLE `color`  (
  `colorId` int(10) NOT NULL AUTO_INCREMENT,
  ` color` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '品牌',
  PRIMARY KEY (`colorId`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '颜色表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for comment
-- ----------------------------
DROP TABLE IF EXISTS `comment`;
CREATE TABLE `comment`  (
  `commentId` int(10) NOT NULL AUTO_INCREMENT,
  `userId` int(10) NOT NULL COMMENT '用户id',
  `goodsId` int(10) NOT NULL COMMENT '商品id',
  `commentleval` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '评论等级（好评，差评）',
  `commentcontent` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '评论内容',
  `commenttime` datetime(0) NOT NULL COMMENT '评论时间',
  PRIMARY KEY (`commentId`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '用户评价表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for evaluate
-- ----------------------------
DROP TABLE IF EXISTS `evaluate`;
CREATE TABLE `evaluate`  (
  `evaluateId` int(5) NOT NULL AUTO_INCREMENT,
  `evaluateText` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '评价内容\r\n',
  `review` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '追评',
  `reply` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '商家回复',
  `goodsId` int(5) NULL DEFAULT NULL,
  `isGood` int(2) NULL DEFAULT NULL COMMENT '是否好评',
  `userId` int(5) NULL DEFAULT NULL,
  `pjTime` datetime(0) NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP(0),
  PRIMARY KEY (`evaluateId`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 47 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of evaluate
-- ----------------------------
INSERT INTO `evaluate` VALUES (1, '真好啊啊啊啊啊', '创新政策支持表单VSX', '是是是', 1, 0, 25, '2018-11-21 10:11:21');
INSERT INTO `evaluate` VALUES (2, '传递出的市场深V发DVD深V谁找到', 'cscsdcsd', '等我晚上是否完善等下完单', 2, 1, 25, '2018-11-09 11:00:29');
INSERT INTO `evaluate` VALUES (4, 'egeddgs', 'scsdvdfvf', 'dsdvfbf', 1, 0, 1, '2018-11-09 13:52:14');
INSERT INTO `evaluate` VALUES (5, '好好好，真的很好\r\n																', '嗯嗯嗯呢', NULL, 201, 0, 25, '2018-11-10 16:10:38');
INSERT INTO `evaluate` VALUES (6, '反反复复\r\n																', '哈哈哈哈', NULL, 2, 0, 25, '2018-11-10 16:12:30');
INSERT INTO `evaluate` VALUES (7, '很好啊\r\n																', '鸟飞绝尼泊尔', NULL, 6, 0, 25, '2018-11-10 16:12:38');
INSERT INTO `evaluate` VALUES (8, '很好啊\r\n																', NULL, NULL, 6, 0, 25, '2018-11-10 13:06:18');
INSERT INTO `evaluate` VALUES (9, '你看看，真的很好\r\n																', NULL, NULL, 5, 0, 25, '2018-11-10 13:06:36');
INSERT INTO `evaluate` VALUES (10, '你看看，真的很好\r\n																', NULL, NULL, 5, 0, 25, '2018-11-10 13:06:40');
INSERT INTO `evaluate` VALUES (11, '这的真的好\r\n																', '好好', NULL, 15, 0, 25, '2018-11-10 16:09:29');
INSERT INTO `evaluate` VALUES (12, '这的真的好\r\n																', NULL, NULL, 15, 0, 25, '2018-11-10 13:06:59');
INSERT INTO `evaluate` VALUES (13, '这的真的好\r\n																', NULL, NULL, 15, 0, 25, '2018-11-10 13:07:03');
INSERT INTO `evaluate` VALUES (14, '好好加\r\n																', NULL, NULL, 6, 0, 25, '2018-11-10 13:35:10');
INSERT INTO `evaluate` VALUES (15, '嗯嗯嗯\r\n																', NULL, NULL, 15, 0, 25, '2018-11-10 13:35:18');
INSERT INTO `evaluate` VALUES (16, '嗯嗯嗯\r\n																', NULL, NULL, 15, 0, 25, '2018-11-10 13:35:51');
INSERT INTO `evaluate` VALUES (17, '好好好\r\n																', NULL, NULL, 6, 0, 25, '2018-11-10 13:38:21');
INSERT INTO `evaluate` VALUES (18, '嗯嗯\r\n																', NULL, NULL, 5, 0, 25, '2018-11-10 13:38:28');
INSERT INTO `evaluate` VALUES (19, '嗯嗯\r\n																', NULL, NULL, 15, 0, 25, '2018-11-10 13:38:33');
INSERT INTO `evaluate` VALUES (20, '天那地方呢\r\n																', NULL, NULL, 6, 1, 25, '2018-11-10 13:43:59');
INSERT INTO `evaluate` VALUES (21, '好好好\r\n																', NULL, NULL, 5, 0, 25, '2018-11-10 13:44:05');
INSERT INTO `evaluate` VALUES (22, '粉底粉彩女孩\r\n																', NULL, NULL, 15, 0, 25, '2018-11-10 13:44:22');
INSERT INTO `evaluate` VALUES (23, '从大V你打吧\r\n																', NULL, NULL, 6, 0, 25, '2018-11-10 13:50:26');
INSERT INTO `evaluate` VALUES (24, '反对市场上\r\n																', NULL, NULL, 5, 0, 25, '2018-11-10 13:50:30');
INSERT INTO `evaluate` VALUES (25, '都是错的VCD\r\n																', NULL, NULL, 15, 0, 25, '2018-11-10 13:50:34');
INSERT INTO `evaluate` VALUES (26, '机拟定\r\n																', NULL, NULL, 6, 0, 25, '2018-11-10 13:53:11');
INSERT INTO `evaluate` VALUES (27, '额凤飞飞\r\n																', NULL, NULL, 5, 0, 25, '2018-11-10 13:53:15');
INSERT INTO `evaluate` VALUES (28, '二分法\r\n																', NULL, NULL, 15, 0, 25, '2018-11-10 13:53:19');
INSERT INTO `evaluate` VALUES (29, '是GV地方\r\n																', NULL, NULL, 6, 0, 25, '2018-11-10 13:55:37');
INSERT INTO `evaluate` VALUES (30, '如果读\r\n																', NULL, NULL, 5, 0, 25, '2018-11-10 13:55:41');
INSERT INTO `evaluate` VALUES (31, '风\r\n																', NULL, NULL, 15, 0, 25, '2018-11-10 13:55:50');
INSERT INTO `evaluate` VALUES (32, '风\r\n																', NULL, NULL, 15, 0, 25, '2018-11-10 13:59:00');
INSERT INTO `evaluate` VALUES (33, '股份大股东\r\n																', NULL, NULL, 6, 0, 25, '2018-11-10 13:59:26');
INSERT INTO `evaluate` VALUES (34, '发热郭德纲\r\n																', NULL, NULL, 5, 0, 25, '2018-11-10 13:59:32');
INSERT INTO `evaluate` VALUES (35, '份额\r\n																', NULL, NULL, 6, 0, 25, '2018-11-10 14:02:05');
INSERT INTO `evaluate` VALUES (36, '人文氛围\r\n																', NULL, NULL, 5, 0, 25, '2018-11-10 14:02:10');
INSERT INTO `evaluate` VALUES (37, '发大V发DVD\r\n																', NULL, NULL, 15, 0, 25, '2018-11-10 14:02:14');
INSERT INTO `evaluate` VALUES (38, '表单vd\r\n																', NULL, NULL, 6, 0, 25, '2018-11-10 14:04:22');
INSERT INTO `evaluate` VALUES (39, 'vdfvdfv\r\n																', NULL, NULL, 5, 0, 25, '2018-11-10 14:04:25');
INSERT INTO `evaluate` VALUES (40, 'ddvdv\r\n																', NULL, NULL, 15, 0, 25, '2018-11-10 14:04:29');
INSERT INTO `evaluate` VALUES (41, '\r\n				还行吧										', NULL, '¿', 2, 0, 25, '2018-11-12 09:19:06');
INSERT INTO `evaluate` VALUES (42, 'jygut\r\n																', NULL, NULL, 6, 0, 25, '2018-11-12 09:21:44');
INSERT INTO `evaluate` VALUES (43, 'ghjff\r\n																', NULL, NULL, 5, 0, 25, '2018-11-12 09:21:49');
INSERT INTO `evaluate` VALUES (44, 'gjtff\r\n																', NULL, NULL, 15, 0, 25, '2018-11-12 09:21:55');
INSERT INTO `evaluate` VALUES (45, '\r\n	还行														', NULL, NULL, 37, 0, 25, '2018-11-12 18:23:18');
INSERT INTO `evaluate` VALUES (46, '\r\n		一般														', NULL, NULL, 39, 1, 25, '2018-11-12 18:23:26');

-- ----------------------------
-- Table structure for garmentsize
-- ----------------------------
DROP TABLE IF EXISTS `garmentsize`;
CREATE TABLE `garmentsize`  (
  `sizeId` int(10) NOT NULL AUTO_INCREMENT,
  ` size` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '衣服尺寸码',
  PRIMARY KEY (`sizeId`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '衣服尺寸表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for goods
-- ----------------------------
DROP TABLE IF EXISTS `goods`;
CREATE TABLE `goods`  (
  `goodsId` bigint(20) NOT NULL AUTO_INCREMENT,
  `goodsMark` int(30) NULL DEFAULT NULL COMMENT '商品所含积分',
  `goodsInt` int(30) NULL DEFAULT NULL COMMENT '商品所需积分',
  `goodsName` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '商品名称',
  `goodsPicId` int(10) NOT NULL COMMENT '商品图片id',
  `goodsPrice` decimal(18, 2) NOT NULL COMMENT '商品价格',
  `goodsSales` int(20) NULL DEFAULT NULL COMMENT '销售量',
  `goodsDiscount` decimal(18, 2) NULL DEFAULT NULL COMMENT '折扣',
  `goodsSum` int(20) NOT NULL COMMENT '库存量',
  `brandId` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '品牌',
  `goodsCreateDate` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `goodsShelf` int(30) NULL DEFAULT NULL COMMENT '是否上架',
  `id_2` int(10) NOT NULL COMMENT '二级类别id',
  `speId` int(10) NOT NULL COMMENT '规格编号',
  `gCommentCount` int(10) NULL DEFAULT NULL COMMENT '好评数',
  `goodsInteder` int(10) NULL DEFAULT NULL COMMENT '是否积分商品',
  `goodsDescribe` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '商品描述',
  `isMiaoSha` int(2) NULL DEFAULT NULL,
  `isYouHui` int(2) NULL DEFAULT NULL,
  `id_1` int(1) NULL DEFAULT NULL,
  `goodsInteger` int(255) UNSIGNED NULL DEFAULT NULL,
  PRIMARY KEY (`goodsId`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 219 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '商品表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of goods
-- ----------------------------
INSERT INTO `goods` VALUES (1, 20, 200, '唐狮2018冬新款外套 男摇粒绒外套 黑色 L', 1, 99.00, 50, 0.90, 20, '唐狮', '2018-10-27 00:00:00', 1, 2, 1, 50, 1, NULL, 0, 1, 1, NULL);
INSERT INTO `goods` VALUES (2, 20, 200, '唐狮2018秋装新款外套 男连帽款暗纹迷彩夹克 黑色 L', 2, 199.00, 15, 0.90, 25, '唐狮', '2018-10-27 00:00:00', 0, 2, 1, 0, 1, NULL, 0, NULL, 1, NULL);
INSERT INTO `goods` VALUES (3, 20, 50, '唐狮春秋季牛仔外套男士韩版原色潮流修身帅气牛仔衣学生牛仔夹克 碳黑/三批 L', 3, 169.00, 11, 0.90, 299, '唐狮', '2018-10-27 00:00:00', 1, 3, 1, 0, 1, NULL, 0, NULL, 1, NULL);
INSERT INTO `goods` VALUES (4, 10, 80, '【3件88折】唐狮新款休闲裤秋季男束脚韩版哈伦小脚九分工装裤子潮 （A款）黑色 L【限时秒杀】部分活动款限时直降+专区3件88折+送20元无门槛优惠券，点击查看详情', 4, 129.00, 10, 0.90, 300, '唐狮', '2018-10-27 00:00:00', 0, 3, 1, 0, 1, NULL, 0, NULL, 1, 0);
INSERT INTO `goods` VALUES (5, 10, 50, '\"【3件88折】唐狮2018秋季新款卫衣  男连帽卫衣 黑色 L\r\n				【限时秒杀】部分活动款限时直降+专区3件88折+送20元无门槛优惠券，点击查看详情\"\r\n', 5, 129.00, 10, 0.90, 300, '唐狮', '2018-10-27 00:00:00', 0, 1, 1, 0, 1, NULL, 0, NULL, 1, 0);
INSERT INTO `goods` VALUES (6, 20, 150, '\"【3件88折】唐狮2018秋季新款休闲韩版外套男连帽运动风款夹克 黑色 L\r\n				【限时秒杀】部分活动款限时直降+专区3件88折+送20元无门槛优惠券，点击查看详情\r\n', 6, 139.00, 11, 0.90, 299, '唐狮', '2018-10-27 00:00:00', 0, 2, 1, 0, 1, NULL, 0, NULL, 1, 0);
INSERT INTO `goods` VALUES (7, 15, 230, '唐狮2018秋装新款休闲裤男加绒运动宽松潮流束脚长裤子 黑色（无绒款） L\r\n				宽松运动裤！加绒更保暖！更多休闲裤\r\n', 7, 236.00, 13, 0.90, 297, '唐狮', '2018-10-27 00:00:00', 0, 3, 1, 0, 1, NULL, 0, NULL, 1, 0);
INSERT INTO `goods` VALUES (8, 17, 300, '唐狮2018秋装新款休闲裤 男港风潮牌迷彩束脚休闲长裤子 黑色(无绒款） M\r\n				现货热卖！加绒款全码预售，11月5日后出货！总有一款你喜欢，更多休闲裤', 8, 100.00, 13, 0.90, 297, '唐狮', '2018-10-27 00:00:00', 0, 3, 1, 0, 1, NULL, 0, NULL, 1, 0);
INSERT INTO `goods` VALUES (9, 18, 500, '唐狮秋季牛仔外套男士水洗韩版潮流宽松款青少年牛仔夹克 中牛仔蓝/A款/无绒款 L\r\n', 9, 100.00, 10, 0.90, 300, '唐狮', '2018-10-27 00:00:00', 0, 2, 1, 0, 1, NULL, 0, NULL, 1, 0);
INSERT INTO `goods` VALUES (10, 17, 300, '【3件88折】唐狮2018冬新款休闲裤男加绒基本束腿休闲长裤 黑色 XXL\r\n				本商品预售到货！加绒款更保暖，现货热卖！更多休闲裤\r\n', 10, 100.00, 11, 0.90, 299, '唐狮', '2018-10-27 00:00:00', 0, 3, 1, 0, 1, NULL, 0, NULL, 1, 0);
INSERT INTO `goods` VALUES (11, 30, 150, 'HLA海澜之家经典摇粒绒夹克2018秋季新品柔软保暖夹克外套男HWJAD3E510A 浅蓝AK 175/92A/L', 11, 198.00, 502, 0.90, 300, '海澜之家', '2018-10-30 08:52:43', 0, 2, 1, 2000, 0, NULL, 0, NULL, 1, 0);
INSERT INTO `goods` VALUES (12, 30, 230, '七匹狼外套男秋季新品商务休闲短款立领夹克男士秋款衣服男装 101藏青色 175/92A(XL)', 12, 419.00, 503, 0.90, 297, '七匹狼', '2018-10-30 08:52:42', 0, 2, 1, 200, 1, NULL, 0, NULL, 1, NULL);
INSERT INTO `goods` VALUES (13, 50, 300, 'A21 2018新款秋季外套男春秋牛仔夹克男工装牛仔外套休闲牛仔上衣4811110004 中蓝 175/88A/L', 13, 239.00, 499, 0.90, 299, '海澜之家', '2018-10-30 08:52:42', 0, 2, 1, 3900, 1, NULL, 0, NULL, 1, 0);
INSERT INTO `goods` VALUES (14, 20, 500, '卡宾男装休闲牛仔夹克衫2018秋季新款青年时尚潮流帅气上衣外套C 煤黑色01 50/175/L', 14, 479.00, 512, 0.90, 299, '海澜之家', '2018-10-30 08:52:42', 0, 2, 1, 200, 1, NULL, 0, NULL, 1, 0);
INSERT INTO `goods` VALUES (15, 15, 300, 'HLA海澜之家时尚纯色款摇粒绒夹克2018秋季新品柔软夹克外套男HWJAW3E512A 黑色AM 175/92A/L', 15, 158.00, 299, 1.00, 299, '海澜之家', '2018-10-30 08:52:42', 0, 2, 1, 500, 1, NULL, 0, NULL, 1, NULL);
INSERT INTO `goods` VALUES (16, 20, 150, 'SH 夹克男2018秋冬季新款男装外套男士圆领韩版休闲夹克衫青年秋装修身短外套褂子男生衣服棒球服上衣 JK520黑色加绒 XL', 16, 138.00, 300, 0.90, 300, '七匹狼', '2018-10-30 08:52:42', 0, 2, 1, 6300, 1, NULL, 0, NULL, 1, 0);
INSERT INTO `goods` VALUES (17, 52, 230, 'INTERIGHT【京东质造】清爽净色棉T恤 白色XL码', 17, 49.00, 300, 0.90, 300, '七匹狼', '2018-10-30 08:52:43', 0, 1, 1, 19000, 1, NULL, 0, NULL, 1, NULL);
INSERT INTO `goods` VALUES (18, 12, 300, '2件装】秋冬男士运动裤休闲裤宽松情侣裤子加绒男韩版潮流小脚修身九分哈伦裤宽松青少年加绒休闲裤男裤子男 GRE+单车款 S', 18, 69.90, 300, 0.90, 300, '海澜之家', '2018-10-30 08:52:43', 0, 3, 1, 6900, 1, NULL, 0, NULL, 1, 0);
INSERT INTO `goods` VALUES (19, 25, 500, 'HLA海澜之家连帽运动款夹克2018秋季新品纯色舒适夹克外套男HWJAJ3E509A 蓝灰AJ 175/92A/L', 19, 459.00, 300, 0.90, 300, '海澜之家', '2018-10-30 08:52:43', 0, 2, 1, 400, 1, NULL, 0, NULL, 1, NULL);
INSERT INTO `goods` VALUES (20, 21, 300, 'A21 2018秋季新品男装可拆帽男夹克时尚撞色简约百搭夹层男生潮外套4831114023 浅灰绿 170/84A/M', 20, 259.00, 300, 1.00, 300, '七匹狼', '2018-10-30 08:52:43', 0, 2, 1, 900, 1, NULL, 0, NULL, 1, 0);
INSERT INTO `goods` VALUES (21, 24, 150, '卡宾男装时尚动物刺绣上衣圆领长袖卫衣秋新款港风无帽套头衣服A 煤黑色01 50/175/L', 21, 369.00, 300, 1.00, 30, '七匹狼', '2018-10-30 08:52:43', 0, 1, 1, 1200, 1, NULL, 0, NULL, 1, NULL);
INSERT INTO `goods` VALUES (22, 30, 230, '(低帮款99元二双)秋冬季男鞋时尚休闲鞋男款韩版高帮简约潮流乐福鞋平板鞋青少年学生帆布鞋子', 22, 99.00, 99, 1.00, 300, 'MIZUNO', '2018-10-30 08:59:43', 0, 4, 1, 55000, 1, NULL, 0, NULL, 2, 0);
INSERT INTO `goods` VALUES (23, 30, 300, '2018春秋季板鞋男士单鞋韩版休闲鞋男时尚运动鞋透气男鞋子', 23, 99.00, 300, 1.00, 300, 'MIZUNO', '2018-10-30 08:59:45', 0, 4, 1, 5500, 1, NULL, 0, NULL, 2, NULL);
INSERT INTO `goods` VALUES (24, 50, 500, 'Mizuno美津浓 缓冲透气跑步鞋运动鞋男 SPARK K1GR160373 黑/银/红 41', 24, 99.00, 300, 1.00, 300, 'MIZUNO', '2018-10-30 09:21:52', 0, 4, 1, 17000, 1, NULL, 0, NULL, 2, 0);
INSERT INTO `goods` VALUES (25, 20, 300, '【预售】Mizuno美津浓缓震轻便跑步鞋运动鞋男女 EZRUN J1GC185501 18秋冬 白 41', 25, 159.00, 300, 1.00, 300, 'MIZUNO', '2018-10-30 09:24:02', 0, 4, 1, 20555, 1, NULL, 0, NULL, 2, 0);
INSERT INTO `goods` VALUES (26, 15, 450, '361 男鞋运动鞋男气垫鞋2018年秋季新款男跑步鞋皮面慢跑休闲鞋男2280 乌黑色（皮面） 42', 26, 149.00, 300, 1.00, 300, '361', '2018-10-30 09:24:34', 0, 4, 1, 20555, 1, NULL, 0, NULL, 2, NULL);
INSERT INTO `goods` VALUES (27, 20, 500, 'ASICS亚瑟士男鞋跑步鞋透气缓冲跑鞋艾斯克斯专业减震运动鞋男GEL-PULSE 橘色/黑色/白色 41.5', 27, 200.00, 300, 1.00, 600, '361', '2018-10-30 09:27:13', 0, 4, 1, 24600, 1, NULL, 0, NULL, 2, 0);
INSERT INTO `goods` VALUES (28, 52, 700, 'dolorcke跑步鞋子运动鞋男运动休闲鞋 男士运动鞋板鞋加绒2018秋上新 蓝灰皮面 42', 28, 178.00, 200, 1.00, 300, '361', '2018-10-30 09:28:44', 0, 4, 1, 231, 1, NULL, 0, NULL, 2, NULL);
INSERT INTO `goods` VALUES (29, 12, 500, 'FILA斐乐官方 MIND BENDER 男子复古跑鞋 2018秋季新款运动休闲时尚男跑鞋 标准白-WT 40.5', 29, 145.00, 3000, 1.00, 300, '361', '2018-10-30 09:29:13', 0, 4, 1, 5644, 1, NULL, 0, NULL, 2, 0);
INSERT INTO `goods` VALUES (30, 25, 700, 'NIKE耐克男鞋 2018秋冬新款运动休闲鞋KWAZI回到未来网面保暖椰子跑步鞋844839-002 844839-002/热卖款 43/275', 30, 145.00, 500, 0.90, 300, '361', '2018-10-30 09:30:47', 0, 4, 1, 56464, 1, NULL, 0, NULL, 2, NULL);
INSERT INTO `goods` VALUES (31, 20, 600, 'NNP 运动鞋男鞋秋季轻便大码跑步鞋男女款板鞋慢跑鞋耐磨学生潮旅游男士休闲鞋子男SS 黑色男女款 41 运动码', 31, 123.00, 500, 1.00, 300, '361', '2018-10-30 09:31:18', 0, 4, 1, 554, 1, NULL, 0, NULL, 2, 0);
INSERT INTO `goods` VALUES (32, 10, 600, 'Zero意大利零度男士皮鞋 秋冬新品休闲百搭男鞋子头层牛皮系带宽脚大头鞋经典商务休闲鞋D83331 黑色偏大一码 40', 32, 135.00, 500, 1.00, 300, '361', '2018-10-30 09:32:38', 0, 4, 1, 5353, 1, NULL, 0, NULL, 2, NULL);
INSERT INTO `goods` VALUES (33, 10, 500, '安踏（ANTA） 男鞋跑步鞋运动鞋男秋季2018新款休闲透气旅游鞋 5521黑/安踏白 42', 33, 99.00, 500, 1.00, 300, '361', '2018-10-30 09:33:19', 0, 4, 1, 2355, 1, NULL, 0, NULL, 2, 0);
INSERT INTO `goods` VALUES (34, 20, 700, '奥康男鞋 正装皮鞋男男士商务正装圆头系带低帮鞋子 黑色173211062 41', 34, 179.00, 500, 1.00, 300, '361', '2018-10-30 09:37:04', 0, 4, 1, 53563, 1, NULL, 0, NULL, 2, NULL);
INSERT INTO `goods` VALUES (35, 15, 600, '北极绒（Beijirong）运动鞋男鞋秋冬加绒可选棉鞋飞织透气网布休闲鞋潮流轻便舒适跑步鞋子 男 ', 35, 100.00, 500, 1.00, 300, '361', '2018-10-30 09:39:35', 0, 5, 1, 222, 1, NULL, 0, NULL, 2, 0);
INSERT INTO `goods` VALUES (36, 17, 500, '北极绒（Beijirong）运动鞋男鞋秋冬加绒可选棉鞋飞织透气网布休闲鞋潮流轻便舒适跑步鞋子 男 ', 36, 124.00, 500, 1.00, 300, '361', '2018-10-30 09:41:45', 0, 5, 1, 565, 1, NULL, 0, NULL, 2, NULL);
INSERT INTO `goods` VALUES (37, 18, 700, '鸿星尔克（ERKE）男鞋运动鞋男女2018秋季新款网布透气轻便老爹鞋旅游休闲鞋子时尚跑步鞋子 正黑/太阳橙 42', 37, 231.00, 5000, 1.00, 300, '361', '2018-10-30 09:42:09', 0, 5, 1, 2332, 1, NULL, 0, NULL, 2, 0);
INSERT INTO `goods` VALUES (38, 17, 600, '鸿星尔克(erke)男鞋运动鞋男网面透气男士跑步鞋女鞋子新款春秋季休闲鞋轻便旅游情侣慢跑鞋 正黑', 38, 210.00, 300, 0.90, 300, 'MIZUNO', '2018-10-30 09:44:47', 0, 5, 1, 232, 1, NULL, 0, NULL, 2, NULL);
INSERT INTO `goods` VALUES (39, 30, 600, '\r\n				【爽11靠谱省钱】鸿星尔克自营11月1号0点准时开抢，前2小时满200-50可叠加平台券199-40，钜惠来袭，不容错过→', 39, 145.00, 300, 1.00, 300, 'MIZUNO', '2018-10-30 09:45:12', 0, 5, 1, 23444, 1, NULL, 0, NULL, 2, NULL);
INSERT INTO `goods` VALUES (40, 30, 320, '鸿星尔克ERKE运动鞋男休闲织面减震轻型跑步鞋2018秋冬季款新品革面男鞋子 正黑/金箔色（秋冬款', 40, 149.00, 300, 1.00, 300, 'MIZUNO', '2018-10-30 09:46:55', 0, 5, 1, 53563, 1, NULL, 0, NULL, 2, 0);
INSERT INTO `goods` VALUES (41, 50, 300, '花花公子男鞋冬季新款加绒棉鞋男韩版男士高帮板鞋保暖潮鞋子男运动休闲鞋 灰色（加绒款） 41', 41, 215.00, 301, 0.55, 299, 'MIZUNO', '2018-10-30 09:47:18', 0, 5, 1, 233, 1, NULL, 0, NULL, 2, NULL);
INSERT INTO `goods` VALUES (42, 20, 450, '回力低帮帆布鞋男女情侣鞋2018春夏新品经典百搭纯色板鞋平底运动鞋透气休闲复古学生鞋潮 WB-1经典白红 40', 42, 175.00, 300, 1.00, 300, 'MIZUNO', '2018-10-30 09:48:49', 0, 5, 1, 25463, 1, NULL, 0, NULL, 2, 0);
INSERT INTO `goods` VALUES (43, 15, 500, '回力官方旗舰店 回天之力 回天之力帆布联名简版off white 爆改国潮鞋ins超火的鞋子男女鞋', 43, 125.00, 300, 1.00, 300, 'MIZUNO', '2018-10-30 09:49:14', 0, 5, 1, 5656, 1, NULL, 0, NULL, 2, NULL);
INSERT INTO `goods` VALUES (44, 20, 700, '回力官方旗舰店 跑步鞋运动鞋男2018秋冬季新款男鞋休闲鞋大码鞋慢跑鞋旅游鞋 全黑男HL6092 42', 44, 127.00, 300, 1.00, 300, 'MIZUNO', '2018-10-30 09:50:51', 0, 5, 1, 5632, 1, NULL, 0, NULL, 2, 0);
INSERT INTO `goods` VALUES (45, 52, 500, '回力休闲帆布鞋男女韩版低帮透气系带秋季板鞋潮鞋男鞋2018学生情侣款女鞋 白色HL709T 41', 45, 127.00, 300, 1.00, 300, 'MIZUNO', '2018-10-30 09:51:15', 0, 5, 1, 33355, 1, NULL, 0, NULL, 2, NULL);
INSERT INTO `goods` VALUES (46, 12, 700, '回力休闲帆布鞋男女韩版低帮透气系带秋季板鞋潮鞋男鞋2018学生情侣款女鞋 白色HL709T 41', 46, 179.00, 300, 1.00, 300, 'MIZUNO', '2018-10-30 09:52:28', 0, 5, 1, 353, 1, NULL, 0, NULL, 2, 0);
INSERT INTO `goods` VALUES (47, 25, 600, '金贝勒运动鞋男女鞋秋冬季新款情侣跑步鞋加绒保暖棉鞋运动休闲低帮板鞋韩版旅游鞋子男女子慢跑鞋717 男款-黑色 41码', 47, 185.00, 300, 1.00, 300, 'MIZUNO', '2018-10-30 09:52:51', 0, 5, 1, 86868, 1, NULL, 0, NULL, 2, NULL);
INSERT INTO `goods` VALUES (48, 21, 600, 'HCollection2018欧美女装秋装新款中长款宽松oversize加绒连衣裙HQ82037 黑色 M', 48, 125.00, 300, 1.00, 300, 'OVBE', '2018-10-30 10:11:54', 0, 6, 1, 5658, 1, NULL, 0, NULL, 3, NULL);
INSERT INTO `goods` VALUES (49, 24, 500, '帛薇儿2018秋冬长袖蕾丝连衣裙喜庆红色裙子宴会礼服修身显瘦收腰长裙 红色 S', 49, 127.00, 300, 1.00, 300, 'OVBE', '2018-10-30 10:12:26', 0, 6, 1, 5656, 1, NULL, 0, NULL, 3, NULL);
INSERT INTO `goods` VALUES (50, 30, 700, '瑚枭雱针织连衣裙2018秋冬季新款女装 韩版大码女装女装连衣裙雪纺性感蕾丝两件套时尚套装女裙子 图片色 L', 50, 145.00, 300, 1.00, 300, 'OVBE', '2018-10-30 10:13:55', 0, 6, 1, 1254, 1, NULL, 0, NULL, 3, NULL);
INSERT INTO `goods` VALUES (51, 20, 600, '颜频女装连衣裙套装女2018秋冬装新款秋天衣服韩版时尚修身长袖裙子大码女装两件套套装裙 粉红色 L', 51, 145.00, 300, 1.00, 300, 'OVBE', '2018-10-30 10:14:27', 0, 6, 1, 8989, 1, NULL, 0, NULL, 3, NULL);
INSERT INTO `goods` VALUES (52, 10, 500, '宿图 毛呢连衣裙2018秋冬新款韩版女装新款无袖背心裙打底裙 单件咖啡色格子 XL(建议116-126斤穿着)', 52, 210.00, 300, 0.75, 300, '曼茵', '2018-10-30 10:16:13', 0, 6, 1, 8645, 1, NULL, 0, NULL, 3, NULL);
INSERT INTO `goods` VALUES (53, 10, 700, '璞衣2018秋装新款 女休闲女装蝙蝠衫毛衣套头宽松薄款韩版长袖上衣针织衫8070 咖啡色 均码', 53, 124.00, 200, 0.90, 300, '曼茵', '2018-10-30 10:16:47', 0, 8, 1, 89664, 1, NULL, 0, NULL, 3, NULL);
INSERT INTO `goods` VALUES (54, 20, 600, 'HCollection欧美女装冬装新款针织网纱两件套a字连衣裙HU84096 灰色 M', 54, 125.00, 201, 1.00, 299, '曼茵', '2018-10-30 10:18:17', 0, 6, 1, 45545, 1, NULL, 0, NULL, 3, NULL);
INSERT INTO `goods` VALUES (55, 15, 500, '恒源祥针织衫2018秋冬季女装新款V领小清新长袖针织衫套头宽松打底上女慵懒风毛衣外套91988 白色', 55, 126.00, 200, 1.00, 300, '曼茵', '2018-10-30 10:18:49', 0, 7, 1, 5323, 1, NULL, 0, NULL, 3, NULL);
INSERT INTO `goods` VALUES (56, 17, 700, 'OVBE 毛呢大衣女格子毛呢外套女2018秋冬新款女装韩版修身显瘦中长款呢子外套女 灰色 M', 56, 217.00, 201, 1.00, 299, 'OVBE', '2018-10-30 10:20:04', 0, 7, 1, 2235, 1, NULL, 0, NULL, 3, NULL);
INSERT INTO `goods` VALUES (57, 18, 600, '茵曼2018秋装新款优雅修身蕾丝收腰长袖毛织连衣裙女【F1883$451936】 焦糖色 S', 57, 149.00, 201, 1.00, 299, '曼茵', '2018-10-30 10:20:28', 0, 6, 1, 5656, 1, NULL, 0, NULL, 3, NULL);
INSERT INTO `goods` VALUES (58, 17, 600, '郁雨 风衣女 2018秋冬季新品女装 简约中长款纯色连帽修身显瘦休闲外套女收腰带大码 卡其 XXL', 58, 179.00, 300, 1.00, 300, '曼茵', '2018-10-30 10:22:01', 0, 7, 1, 5454, 1, NULL, 0, NULL, 3, NULL);
INSERT INTO `goods` VALUES (59, 30, 320, '恒源祥针织衫2018秋冬女装新款韩版长袖宽松打底针织衫上衣百搭显瘦打底衫女毛衣外套潮96783 卡其色', 59, 200.00, 301, 0.90, 299, '曼茵', '2018-10-30 10:22:27', 0, 7, 1, 5656, 1, NULL, 0, NULL, 3, NULL);
INSERT INTO `goods` VALUES (60, 30, 300, 'HCollection2018欧美女装秋新款中长款宽松显瘦连衣裙HQ82122 黑色 L', 60, 129.00, 300, 1.00, 300, '曼茵', '2018-10-30 10:23:34', 0, 6, 1, 566, 1, NULL, 0, NULL, 3, NULL);
INSERT INTO `goods` VALUES (61, 50, 450, 'MOCO圆领无袖印花A摆荷叶边高街酷感星际连衣裙MA154SKT09 M04稚趣图像色 XS', 61, 129.00, 300, 1.00, 300, 'OVBE', '2018-10-30 10:23:57', 0, 6, 1, 231021, 1, NULL, 0, NULL, 3, NULL);
INSERT INTO `goods` VALUES (62, 20, 500, '隆缘裳 针织连衣裙长袖两件套套装裙新品2018秋新款时尚修身裙子女装3051 黑色 L（预售三天）', 62, 159.00, 300, 1.00, 300, 'OVBE', '2018-10-30 10:25:03', 0, 6, 1, 456865, 1, NULL, 0, NULL, 3, NULL);
INSERT INTO `goods` VALUES (63, 15, 700, 'UR2018秋冬新品女装时尚通勤流苏饰都市风格纹连衣裙WE39R9FF2000 正黑 S(155/80A)', 63, 179.00, 300, 1.00, 300, 'OVBE', '2018-10-30 10:25:24', 0, 6, 1, 35235, 1, NULL, 0, NULL, 3, NULL);
INSERT INTO `goods` VALUES (64, 20, 500, '高梵羽绒服女中长款加厚清仓特价2018秋冬新款韩版潮反季外套 黑色', 64, 99.00, 300, 1.00, 300, 'OVBE', '2018-10-30 10:26:39', 0, 8, 1, 45454, 1, NULL, 0, NULL, 3, NULL);
INSERT INTO `goods` VALUES (65, 52, 700, '凤 2018春秋新款女春装格子毛呢短外套女bf原宿宽松秋季短款韩版女装学生 图片色 M', 65, 119.00, 300, 1.00, 300, '曼茵', '2018-10-30 10:28:03', 0, 6, 1, 9686, 1, NULL, 0, NULL, 3, NULL);
INSERT INTO `goods` VALUES (66, 20, 600, '颜域女装2018秋冬季新款通勤复古立领碎花打底假两件长袖连衣裙女20W8324 蓝花【预售11月2号】 ', 66, 147.00, 300, 1.00, 300, '曼茵', '2018-10-30 10:28:50', 0, 8, 1, 898, 1, NULL, 0, NULL, 3, NULL);
INSERT INTO `goods` VALUES (67, 10, 600, 'MOCO2018秋季新品高领开衩蕾丝两件套连衣裙MT183DRS303 摩安珂 黑色 S', 67, 148.00, 300, 1.00, 300, '曼茵', '2018-10-30 10:30:05', 0, 6, 1, 6464, 1, NULL, 0, NULL, 3, NULL);
INSERT INTO `goods` VALUES (68, 10, 600, '茧图 雪纺衫女长袖2018秋冬季加绒加厚新款宽松韩版百搭春装衬衫上衣碎花衬衣打底小衫 花朵粉色常规款 M', 68, 149.00, 300, 1.00, 300, 'OVBE', '2018-10-30 10:31:11', 0, 8, 1, 53643, 1, NULL, 0, NULL, 3, NULL);
INSERT INTO `goods` VALUES (69, 20, 500, '斯凯奇（skechers）秋季新款编织熊猫鞋 轻便绑带运动鞋女 舒适休闲鞋女11955 黑色/白色/BKW 38', 69, 159.00, 300, 1.00, 300, '森马', '2018-10-30 10:52:24', 0, 9, 1, 656, 1, NULL, 0, NULL, 4, NULL);
INSERT INTO `goods` VALUES (70, 15, 700, 'ECCO爱步2018秋季新款SOFT 8简约百搭小白鞋 柔酷8号女鞋系列440503 白色44050301007 36', 70, 147.00, 300, 1.00, 300, '森马', '2018-10-30 10:54:06', 0, 9, 1, 4654, 1, NULL, 0, NULL, 4, NULL);
INSERT INTO `goods` VALUES (71, 17, 600, 'Belle/百丽专柜同款英伦风乐福鞋羊皮马衔扣女单鞋BLNA1AM7 黑色 36', 71, 147.00, 300, 1.00, 300, '森马', '2018-10-30 10:54:49', 0, 9, 1, 56356, 1, NULL, 0, NULL, 4, NULL);
INSERT INTO `goods` VALUES (72, 18, 500, '莱尔斯丹 le saunda 单鞋女 时尚优雅尖头套脚水钻搭扣粗跟低跟 LS 9T10328 米色 38', 72, 121.00, 300, 0.90, 300, '森马', '2018-10-30 10:55:55', 0, 9, 1, 65656, 1, NULL, 0, NULL, 4, NULL);
INSERT INTO `goods` VALUES (73, 17, 700, '翠雅阁 小白鞋女秋冬2018新款韩版休闲鞋女学生百搭厚底板鞋运动皮面女鞋 B86白色 37', 73, 111.00, 300, 0.90, 300, 'ZHR', '2018-10-30 10:56:56', 0, 9, 1, 56353, 1, NULL, 0, NULL, 4, NULL);
INSERT INTO `goods` VALUES (74, 30, 600, '休闲鞋女2018秋冬新款小白鞋女跑步运动休闲鞋女皮面防水休闲旅游慢跑鞋防滑户外登山 白色-四季款 37', 74, 123.00, 300, 0.90, 300, 'ZHR', '2018-10-30 10:58:15', 0, 9, 1, 8686, 1, NULL, 0, NULL, 4, NULL);
INSERT INTO `goods` VALUES (75, 30, 600, '女鞋2018秋冬季女鞋运动风休闲鞋小白女皮面厚底女学生单鞋跑步内增高运动鞋 W029-白色 37', 75, 145.00, 300, 0.90, 300, 'ZHR', '2018-10-30 10:59:13', 0, 9, 1, 89946, 1, NULL, 0, NULL, 4, NULL);
INSERT INTO `goods` VALUES (76, 50, 320, '森马高帮板鞋女2018新款中帮女鞋秋季潮款韩版时尚休闲街舞鞋嘻哈女板鞋情侣 粉色（女款） #37', 76, 79.00, 300, 1.00, 300, 'ZHR', '2018-10-30 10:59:56', 0, 10, 1, 6546, 1, NULL, 0, NULL, 4, NULL);
INSERT INTO `goods` VALUES (77, 20, 300, '步奢(BUSHE)小白鞋女休闲鞋2018冬季新款白色女鞋子韩版加绒保暖板鞋女学生加厚棉鞋潮 粉色(加绒) 37', 77, 145.00, 300, 1.00, 300, 'ZHR', '2018-10-30 11:00:54', 0, 10, 1, 565, 1, NULL, 0, NULL, 4, NULL);
INSERT INTO `goods` VALUES (78, 15, 450, '休闲鞋女鞋秋冬季新款厚底皮面小白鞋女系带时尚女士老爹鞋运动鞋潮鞋厚底 黑色 37', 78, 129.00, 300, 1.00, 300, 'ZHR', '2018-10-30 11:01:37', 0, 10, 1, 54686, 1, NULL, 0, NULL, 4, NULL);
INSERT INTO `goods` VALUES (79, 20, 500, '棉鞋女雪地靴2018冬季学生时尚休闲鞋女鞋加绒加厚加毛保暖厚底增高短靴女 黑色 37', 79, 129.00, 300, 1.00, 300, '森马', '2018-10-30 11:02:28', 0, 10, 1, 5685, 1, NULL, 0, NULL, 4, NULL);
INSERT INTO `goods` VALUES (80, 52, 700, '女鞋小白鞋女秋冬新款韩版休闲鞋板鞋女生皮面时尚内增高系带帆布鞋女学生跑步厚底松糕 四季款-白兰 37', 80, 145.00, 302, 0.90, 298, '森马', '2018-10-30 11:03:10', 0, 10, 1, 8654, 1, NULL, 0, NULL, 4, NULL);
INSERT INTO `goods` VALUES (81, 20, 500, '休闲鞋女2018秋季新款女鞋大码运动跑步单鞋学生平底旅游韩版潮流板鞋子ins保暖加绒 黑色 37', 81, 89.00, 301, 0.90, 299, '森马', '2018-10-30 11:04:25', 0, 10, 1, 865463, 1, NULL, 0, NULL, 4, NULL);
INSERT INTO `goods` VALUES (82, 10, 600, '回力 Warrior 韩版女运动休闲低帮系带小白鞋 WXP-2200 白金 35', 82, 125.00, 300, 1.00, 600, '森马', '2018-10-30 11:05:23', 0, 10, 1, 353656, 1, NULL, 0, NULL, 4, NULL);
INSERT INTO `goods` VALUES (83, 10, 500, 'BETSY 磨砂牛皮复古马丁靴女士短靴秋冬女靴英伦风中跟系带粗跟靴子街头时尚2018秋季 焦糖 37', 83, 145.00, 300, 1.00, 300, '森马', '2018-10-30 11:06:55', 0, 11, 1, 56, 1, NULL, 0, NULL, 4, NULL);
INSERT INTO `goods` VALUES (84, 20, 700, '女鞋2018秋季新品ins袜子鞋女韩版休闲鞋潮流百搭原宿ulzzang冬季加厚高帮帆布鞋小白鞋渔夫鞋 米色 37', 84, 145.00, 300, 1.00, 300, 'ZHR', '2018-10-30 11:08:06', 0, 11, 1, 868, 1, NULL, 0, NULL, 4, NULL);
INSERT INTO `goods` VALUES (85, 15, 600, '女鞋2018秋冬季新品休闲鞋小白鞋女超火厚底松糕老爹鞋学生板鞋 白红 37', 85, 125.00, 300, 1.00, 300, 'ZHR', '2018-10-30 11:09:42', 0, 11, 1, 455, 1, NULL, 0, NULL, 4, NULL);
INSERT INTO `goods` VALUES (86, 17, 500, '翠雅阁 小白鞋女秋冬韩版休闲鞋女学生百搭平底板鞋女系带皮面女鞋 白色-比心 37', 86, 210.00, 300, 0.80, 300, 'ZHR', '2018-10-30 11:10:28', 0, 11, 1, 8986, 1, NULL, 0, NULL, 4, NULL);
INSERT INTO `goods` VALUES (87, 18, 700, '皇美婷（Huangmeiting）休闲女鞋韩版2018秋冬季小白鞋女学生板鞋运动鞋加绒大码 8819黑色 36码', 87, 124.00, 300, 1.00, 300, 'ZHR', '2018-10-30 11:11:09', 0, 11, 1, 8645, 1, NULL, 0, NULL, 4, NULL);
INSERT INTO `goods` VALUES (88, 17, 600, '女鞋2018秋冬新款休闲鞋女皮面小白鞋女内增高透气很火板鞋子女士韩版老爹鞋网面女鞋单鞋 YC221白黑 37', 88, 114.00, 300, 1.00, 300, 'ZHR', '2018-10-30 11:11:49', 0, 11, 1, 564, 1, NULL, 0, NULL, 4, NULL);
INSERT INTO `goods` VALUES (89, 30, 600, '三日晶女鞋秋冬季新品休闲鞋女士韩版学生运动小白鞋无内增高保暖平底板鞋潮流百搭透气ins老爹鞋子 女 粉灰色-秋冬款 37', 89, 124.00, 300, 1.00, 300, 'ZHR', '2018-10-30 11:12:32', 0, 11, 1, 565, 1, NULL, 0, NULL, 4, NULL);
INSERT INTO `goods` VALUES (90, 30, 320, '马克华菲2018秋冬新款小白鞋牛皮休闲鞋女鞋松糕平底厚底百搭单鞋 白色 37', 90, 124.00, 300, 1.00, 300, 'ZHR', '2018-10-30 11:15:21', 0, 9, 1, 56856, 1, NULL, 0, NULL, 4, NULL);
INSERT INTO `goods` VALUES (91, 50, 300, '皇美婷（Huangmeiting）休闲鞋女鞋韩版2018秋冬季新品透气运动鞋女板鞋女学生小白鞋大码 9092白蓝色 36', 91, 114.00, 300, 1.00, 300, '森马', '2018-10-30 11:16:53', 0, 9, 1, 5654, 1, NULL, 0, NULL, 4, NULL);
INSERT INTO `goods` VALUES (92, 20, 450, '意维豪 内增高女鞋松糕厚底小白鞋2018秋季新款皮面时尚韩版单鞋防滑透气运动休闲鞋女子学生鞋 白色 37', 92, 213.00, 300, 1.00, 300, '森马', '2018-10-30 11:17:41', 0, 10, 1, 54554, 1, NULL, 0, NULL, 4, NULL);
INSERT INTO `goods` VALUES (93, 15, 500, '\r\n				偏小半码 偏小半码 满199减20 送运费险 支持货到付款  特惠价专区请点击首页→', 93, 119.00, 300, 1.00, 300, '森马', '2018-10-30 11:18:19', 0, 10, 1, 7976, 1, NULL, 0, NULL, 4, 0);
INSERT INTO `goods` VALUES (94, 20, 700, '卡帝乐鳄鱼 CARTELO 休闲鞋女马丁靴高帮粗跟圆头系带英伦反绒皮 KDLZB518 黑色 37', 94, 119.00, 300, 1.00, 300, '森马', '2018-10-30 11:19:11', 0, 11, 1, 5634564, 1, NULL, 0, NULL, 4, NULL);
INSERT INTO `goods` VALUES (95, 52, 500, '骆驼（CAMEL）女鞋 秋季时尚英伦马丁靴牛皮休闲靴子方跟系带女短靴 A84179630 黑色 39', 95, 159.00, 300, 1.00, 300, '森马', '2018-10-30 11:19:47', 0, 11, 1, 896, 1, NULL, 0, NULL, 4, NULL);
INSERT INTO `goods` VALUES (96, 12, 700, '361° 361度童鞋 男童足训鞋儿童运动鞋中大童足球鞋K79420011 深蓝/橙 38', 96, 96.00, 300, 1.00, 300, '361', '2018-10-30 11:30:34', 0, 15, 1, 564, 1, NULL, 0, NULL, 6, NULL);
INSERT INTO `goods` VALUES (97, 25, 600, '361童鞋男童2018秋冬季新款跑鞋 儿童男童中大童运动鞋 碳黑 33', 97, 115.00, 300, 1.00, 300, '361', '2018-10-30 11:31:28', 0, 15, 1, 564, 1, NULL, 0, NULL, 6, NULL);
INSERT INTO `goods` VALUES (98, 20, 600, '安踏（ANTA） 男童鞋儿童运动鞋2018秋冬季儿童篮球鞋皮面保暖大童球鞋 【热卖】大红/黑/白（皮面） 37', 98, 117.00, 300, 1.00, 300, '安踏', '2018-10-30 11:32:17', 0, 15, 1, 86745, 1, NULL, 0, NULL, 6, 0);
INSERT INTO `goods` VALUES (99, 10, 500, '好孩子（gb）童鞋学步鞋儿童鞋婴儿软底防滑宝宝鞋 17FW001 藏青 21码/鞋内长130', 99, 112.00, 300, 1.00, 300, '安踏', '2018-10-30 11:33:07', 0, 14, 1, 54646, 1, NULL, 0, NULL, 6, 0);
INSERT INTO `goods` VALUES (100, 10, 700, '361度童鞋 男女童运动鞋2018新款鞋男中大童休闲鞋男童鞋儿童跑鞋K78410671 蓝/白（网面） 35', 100, 98.00, 300, 1.00, 300, '361', '2018-10-30 11:33:57', 0, 14, 1, 546546, 1, NULL, 0, NULL, 6, 0);
INSERT INTO `goods` VALUES (101, 20, 600, '童鞋男儿童运动鞋2018秋冬新款男童女童皮面超轻板鞋拼色休闲鞋秋季中大童透气网面篮球鞋子潮 宝蓝色#皮面 35码(内长约22.7CM)', 101, 115.00, 300, 1.00, 300, '安踏', '2018-10-30 11:34:39', 0, 15, 1, 1335, 1, NULL, 0, NULL, 6, NULL);
INSERT INTO `goods` VALUES (102, 15, 500, '特步 XTEP 特步童鞋男童休闲鞋2017年秋季新款中大童时尚防滑耐磨小白鞋滑板鞋 683315319962 白金 36码', 102, 125.00, 300, 1.00, 300, '安踏', '2018-10-30 11:35:22', 0, 15, 1, 53435, 1, NULL, 0, NULL, 6, 0);
INSERT INTO `goods` VALUES (103, 17, 700, 'NIKE耐克童鞋儿童2018新款毛毛虫缓震运动鞋男女婴童小童跑步鞋 620 07C 23.5码/内长13cm', 103, 114.00, 300, 1.00, 300, '361', '2018-10-30 11:37:34', 0, 14, 1, 2353, 1, NULL, 0, NULL, 6, NULL);
INSERT INTO `goods` VALUES (104, 18, 600, '361童鞋男童运动鞋2018秋冬皮面新款跑鞋中大童儿童运动鞋男防滑休闲儿童鞋 碳黑514 37', 104, 125.00, 300, 1.00, 200, '361', '2018-10-30 11:38:23', 0, 15, 1, 986899, 1, NULL, 0, NULL, 6, 0);
INSERT INTO `goods` VALUES (105, 17, 500, '361度 童鞋男女童小白鞋运动鞋2018年秋冬季儿童滑板鞋 K89430051 本白 35', 105, 119.00, 300, 1.00, 300, '361', '2018-10-30 11:39:11', 0, 14, 1, 8645, 1, NULL, 0, NULL, 6, 0);
INSERT INTO `goods` VALUES (106, 30, 700, '安踏童鞋 男童鞋运动鞋2018春秋季男童板鞋白鞋儿童白色运动鞋中大童休闲鞋学生鞋 安踏白-3 38', 106, 145.00, 300, 0.80, 300, '安踏', '2018-10-30 11:40:05', 0, 15, 1, 5336, 1, NULL, 0, NULL, 6, NULL);
INSERT INTO `goods` VALUES (107, 30, 600, '史努比童鞋2018秋季男女童鞋网面透气儿童运动鞋防滑减震气垫鞋中小童跑步休闲鞋子 黑色（双网） 30/鞋内长19cm', 107, 98.00, 300, 1.00, 300, '安踏', '2018-10-30 11:40:51', 0, 14, 1, 23545, 1, NULL, 0, NULL, 6, 0);
INSERT INTO `goods` VALUES (108, 50, 600, '芭比嘟品牌童鞋儿童休闲鞋2018秋冬新品小中大男女儿童运动鞋学生鞋加绒保暖棉鞋跑步鞋 A10灰宝蓝（皮面） 35码/内长22.1cm', 108, 116.00, 300, 1.00, 300, '361', '2018-10-30 11:41:32', 0, 14, 1, 86976, 1, NULL, 0, NULL, 6, 0);
INSERT INTO `goods` VALUES (109, 20, 320, '巴喜尼儿机能鞋童鞋男女童秋冬新款宝宝鞋运动鞋儿童防滑小白鞋软底学步鞋 白色 （春秋） 9码内长16.8cm适合脚长15.8cm', 109, 146.00, 300, 1.00, 300, '安踏', '2018-10-30 11:42:49', 0, 15, 1, 5356, 1, NULL, 0, NULL, 6, NULL);
INSERT INTO `goods` VALUES (110, 15, 300, 'CROWN/皇冠旅行箱 万向轮托运箱 行李箱 拉杆箱 男女箱密码箱5161-26-深兰', 110, 200.00, 300, 1.00, 300, '爱华仕', '2018-10-30 13:34:19', 0, 21, 1, 865, 1, NULL, 0, NULL, 9, 0);
INSERT INTO `goods` VALUES (111, 20, 450, '\r\n				【关注有礼】24英寸热卖爆款，大容量、顺滑万向轮，防撞护角！15万+好评，口碑甄选！点击查看瑞动新款拉杆箱', 111, 210.00, 300, 1.00, 300, '爱华仕', '2018-10-30 13:35:58', 0, 21, 1, 54134, 1, NULL, 0, NULL, 9, 0);
INSERT INTO `goods` VALUES (112, 10, 500, '小米（MI）90分旅行箱拉杆箱1A 男女万向轮登机行李箱 20英寸 星空灰', 112, 198.00, 300, 1.00, 300, '小米', '2018-10-30 13:36:52', 0, 21, 1, 5656, 1, NULL, 0, NULL, 9, 0);
INSERT INTO `goods` VALUES (113, 10, 700, '瑞士军刀威戈（Wenger）拉杆箱 男女商务休闲ABS22英寸万向轮行李箱旅行箱 黑色 SAX631115109058', 113, 199.00, 300, 1.00, 300, '爱华仕', '2018-10-30 13:37:46', 0, 21, 1, 5634, 1, NULL, 0, NULL, 9, 0);
INSERT INTO `goods` VALUES (114, 20, 500, '爱华仕（OIWAS）飞机轮拉杆箱6182 商务出差旅行箱 男女休闲旅游登机箱20英寸灰色', 114, 199.00, 300, 1.00, 300, '爱华仕', '2018-10-30 13:38:24', 0, 21, 1, 15365, 1, NULL, 0, NULL, 9, 0);
INSERT INTO `goods` VALUES (115, 15, 700, '瑞动（SWISSMOBILITY）行李箱20英寸时尚轻盈拉杆箱 男女万向轮登机旅行箱 5286月光石灰', 115, 299.00, 300, 1.00, 300, '小米', '2018-10-30 13:39:15', 0, 21, 1, 8644, 1, NULL, 0, NULL, 9, 0);
INSERT INTO `goods` VALUES (116, 17, 600, '外交官（Diplomat）磨砂箱子拉杆箱行李箱万向轮男女旅行箱密码箱箱包TC-15173 24英寸 黑色', 116, 299.00, 300, 1.00, 300, '小米', '2018-10-30 13:40:21', 0, 21, 1, 5644, 1, NULL, 0, NULL, 9, 0);
INSERT INTO `goods` VALUES (117, 18, 600, '复古全金属铝镁合金拉杆箱女20 26 29寸行李箱万向轮旅行箱男登机箱20寸硬箱小清新 黑色复古全铝镁合金 26英寸', 117, 179.00, 300, 1.00, 3001, '爱华仕', '2018-10-30 13:41:02', 0, 21, 1, 56345, 1, NULL, 0, NULL, 9, 0);
INSERT INTO `goods` VALUES (118, 17, 500, '万向轮拉杆箱耐磨抗摔24英寸旅行箱男女行李箱登机箱 银色', 118, 259.00, 300, 1.00, 300, '爱华仕', '2018-10-30 13:42:38', 0, 21, 1, 564545, 1, NULL, 0, NULL, 9, NULL);
INSERT INTO `goods` VALUES (119, 30, 700, '小米（MI）米家90分轻商务旅行箱拉杆箱 男女万向轮登机行李箱 钛金灰 20英寸 前开盖 双密码锁', 119, 259.00, 300, 1.00, 300, '小米', '2018-10-30 13:43:24', 0, 21, 1, 235234, 1, NULL, 0, NULL, 9, 0);
INSERT INTO `goods` VALUES (120, 30, 600, '网易严选 28寸 纯PC“铝框”（非全铝）拉杆箱 神秘灰', 120, 299.00, 300, 1.00, 300, '小米', '2018-10-30 13:44:22', 0, 21, 1, 1345, 1, NULL, 0, NULL, 9, 0);
INSERT INTO `goods` VALUES (121, 50, 500, '稻草人(MEXICAN)行李箱男女 24英寸大容量拉杆箱 德国拜耳PC材质万向轮静音海关密码锁旅行箱 商务黑', 121, 199.00, 300, 1.00, 300, '爱华仕', '2018-10-30 13:45:10', 0, 21, 1, 65455, 1, NULL, 0, NULL, 9, NULL);
INSERT INTO `goods` VALUES (122, 20, 700, 'ALLANT拉杆箱万向轮 24英寸行李箱男旅行箱 ABS时尚轻盈 AL-8503 黑色', 122, 170.00, 300, 0.80, 300, '小米', '2018-10-30 13:46:06', 0, 21, 1, 65445, 1, NULL, 0, NULL, 9, NULL);
INSERT INTO `goods` VALUES (123, 15, 600, '意酷(YKOO)铝框拉杆箱万向轮行李箱学生旅行箱20/24/26/29英寸男女士登机箱子 科技银 20英寸登机箱', 123, 159.00, 300, 0.90, 300, '小米', '2018-10-30 13:46:55', 0, 21, 1, 2334, 1, NULL, 0, NULL, 9, NULL);
INSERT INTO `goods` VALUES (124, 20, 500, '黑沙 拉杆箱 行李箱 拉链TSA海关密码锁登机箱学生箱时尚男女万向轮旅行箱子20/24/28英寸 H801-01拉丝银 20英寸', 124, 99.00, 300, 0.60, 300, '爱华仕', '2018-10-30 13:48:28', 0, 21, 1, 5645, 1, NULL, 0, NULL, 9, NULL);
INSERT INTO `goods` VALUES (125, 52, 700, '行舍（Sincer）拉杆箱 万向轮商务登机箱 蓝色16英寸', 125, 199.00, 300, 1.00, 300, '小米', '2018-10-30 13:49:07', 0, 21, 1, 3564, 1, NULL, 0, NULL, 9, NULL);
INSERT INTO `goods` VALUES (126, 12, 600, '卡蒂罗幸福四叶草925银手链女首饰品配饰生日礼物送女友', 126, 79.00, 300, 1.00, 300, '卡蒂罗', '2018-10-30 14:03:12', 0, 17, 1, 21345, 1, NULL, 0, NULL, 7, NULL);
INSERT INTO `goods` VALUES (127, 25, 600, '羽兰JOLEE 项链S925银爱心吊坠天然水晶日韩版气质款彩色宝石锁骨链配饰品送女友老婆生日礼品礼物', 127, 129.00, 300, 1.00, 300, '依恋', '2018-10-30 14:04:17', 0, 16, 1, 56645, 1, NULL, 0, NULL, 7, NULL);
INSERT INTO `goods` VALUES (128, 21, 320, '项链女S925纯银学生情侣日韩时尚简约吊坠女式锁骨链礼物配饰品 环绕星球+O型链/十字链', 128, 119.00, 300, 0.65, 300, '依恋', '2018-10-30 14:04:56', 0, 16, 1, 5644, 1, NULL, 0, NULL, 7, NULL);
INSERT INTO `goods` VALUES (129, 24, 300, '时尚饰品潮流长款项链个性仿钻毛衣链配饰女猫头鹰项链女小天使项链配饰女服饰链脖链女颈链小饰品 17#（X305-2#银色）', 129, 119.00, 300, 0.90, 300, '卡蒂罗', '2018-10-30 14:06:23', 0, 16, 1, 564, 1, NULL, 0, NULL, 7, NULL);
INSERT INTO `goods` VALUES (130, 20, 450, '银千惠银手链女款学生情侣手链韩版s925纯银饰品首饰手饰闺蜜女士女生配饰 镶施华洛世奇锆 生日礼物 京东自营配送+心形礼盒+钻石白 配桃心片', 130, 99.00, 300, 1.00, 300, '依恋', '2018-10-30 14:07:11', 0, 17, 1, 877, 1, NULL, 0, NULL, 7, NULL);
INSERT INTO `goods` VALUES (131, 10, 500, '七洋首饰 情侣手链一对免费刻字 日韩版手链男女款简约个性创意手镯手表配饰情人节礼物 情侣款一对', 131, 88.00, 300, 1.00, 300, '依恋', '2018-10-30 14:08:06', 0, 17, 1, 13, 1, NULL, 0, NULL, 7, NULL);
INSERT INTO `goods` VALUES (132, 10, 700, ' 施华洛世奇 新品 DUO优雅月亮星星元素可调手镯女手链百搭配饰  项链女 镀玫瑰金色  5429729', 132, 99.00, 300, 0.50, 300, '卡蒂罗', '2018-10-30 14:08:54', 0, 17, 1, 1, 1, NULL, 0, NULL, 7, NULL);
INSERT INTO `goods` VALUES (133, 20, 500, '网红饰品项链女韩版简约清新学生配饰简约冷淡风黑色月亮星星项链女 短款锁骨链首饰品生日礼物 玫瑰金色', 133, 128.00, 300, 1.00, 300, '依恋', '2018-10-30 14:09:41', 0, 16, 1, 12, 1, NULL, 0, NULL, 7, NULL);
INSERT INTO `goods` VALUES (134, 15, 700, 'MyMiss项链女 925银镀铂金吊坠 锁骨链配饰品女 镶嵌施华洛世奇合成立方氧化锆 情人节礼物 小天鹅', 134, 119.00, 300, 1.00, 300, '卡蒂罗', '2018-10-30 14:10:25', 0, 16, 1, 10, 1, NULL, 0, NULL, 7, NULL);
INSERT INTO `goods` VALUES (135, 17, 600, '卡蒂罗925银手链女甜美首饰配饰品生日礼物送女友  枝蔓之恋', 135, 129.00, 300, 1.00, 300, '卡蒂罗', '2018-10-30 14:11:36', 0, 17, 1, 5, 1, NULL, 0, NULL, 7, NULL);
INSERT INTO `goods` VALUES (136, 18, 600, '925纯银项链女款银饰品劲链简约月光石幸运七星吊坠女 短款锁骨链学生配饰 首饰生日礼物送女友 项链', 136, 139.00, 300, 1.00, 300, '卡蒂罗', '2018-10-30 14:12:15', 0, 16, 1, 9, 1, NULL, 0, NULL, 7, 0);
INSERT INTO `goods` VALUES (137, 17, 600, '卡蒂罗四叶草S925银手链女首饰配饰品生日礼物送女友', 137, 124.00, 300, 1.00, 300, '卡蒂罗', '2018-10-30 14:12:53', 0, 17, 1, 5, 1, NULL, 0, NULL, 7, 0);
INSERT INTO `goods` VALUES (138, 30, 500, '单颗珍珠项链女锁骨链925银饰品chic简约日韩学生潮人吊坠配饰 母贝单珍珠', 138, 135.00, 300, 1.00, 300, '依恋', '2018-10-30 14:13:40', 0, 16, 1, 4, 1, NULL, 0, NULL, 7, NULL);
INSERT INTO `goods` VALUES (139, 30, 700, '茵曼 锁骨项链女简约日韩版银吊坠配饰品颈链百搭吊坠  送女友情人节生日礼物', 139, 159.00, 300, 1.00, 300, '依恋', '2018-10-30 14:14:23', 0, 16, 1, 14, 1, NULL, 0, NULL, 7, 0);
INSERT INTO `goods` VALUES (140, 50, 600, '【免费刻字】手链 北欧潮流风格玫瑰金情侣手链 简约手镯男女款原创学生手环手表配饰生日情人节礼物 玫瑰金情侣款一对', 140, 115.00, 300, 1.00, 300, '依恋', '2018-10-30 14:15:09', 0, 17, 1, 2, 1, NULL, 0, NULL, 7, 0);
INSERT INTO `goods` VALUES (141, 20, 500, '茵曼 925银项链女款锁骨链 情侣吊坠首饰品 女士颈链 韩版配饰闺蜜生日礼物 四叶草项链 链长40CM', 141, 117.00, 300, 1.00, 300, '卡蒂罗', '2018-10-30 14:15:50', 0, 16, 1, 6, 1, NULL, 0, NULL, 7, NULL);
INSERT INTO `goods` VALUES (142, 15, 700, '妮洛雅 925银饰品项链锁骨链女 短款银链女士银链子细水波链时尚配饰颈链单链无吊坠 925银不过敏 40CM元宝链', 142, 98.00, 300, 1.00, 300, '依恋', '2018-10-30 14:16:44', 0, 16, 1, 12, 1, NULL, 0, NULL, 7, 0);
INSERT INTO `goods` VALUES (143, 20, 600, 'ilovepo/爱拉菲 小清新925银手链女首饰品配饰升级珠宝玫瑰花礼盒 生日礼物送女友', 143, 119.00, 300, 1.00, 200, '依恋', '2018-10-30 14:18:04', 0, 17, 1, 12, 1, NULL, 0, NULL, 7, NULL);
INSERT INTO `goods` VALUES (144, 52, 600, '项链女锁骨链短款简约花朵吊坠耳环女气质韩国个性套装配饰品 金色【仅项链】BT2', 144, 129.00, 300, 1.00, 300, '依恋', '2018-10-30 14:18:53', 0, 16, 1, 14, 1, NULL, 0, NULL, 7, 0);
INSERT INTO `goods` VALUES (145, 12, 320, '法蔻farcoko轻奢品牌手链女款幸运四叶草饰品日韩版时尚简约优雅手饰配饰七夕生日送女友 双面四叶草手链', 145, 75.00, 300, 1.00, 300, '卡蒂罗', '2018-10-30 14:19:39', 0, 17, 1, 2, 1, NULL, 0, NULL, 7, NULL);
INSERT INTO `goods` VALUES (146, 25, 300, '正锦 春秋季 薄款莱卡棉质 男士睡衣长袖长裤家居服套装 青年居家品牌 舒适高弹力优质面料 深灰一套 3XL', 146, 79.00, 301, 1.00, 299, '南极人', '2018-10-30 14:33:26', 0, 18, 1, 5, 1, NULL, 0, NULL, 8, 0);
INSERT INTO `goods` VALUES (147, 20, 450, '南极人 睡衣男秋冬长袖可外穿法兰绒睡衣家居服男加厚珊瑚绒翻领开衫套装 男经典纯色(上衣+裤子) XL', 147, 119.00, 300, 1.00, 300, '南极人', '2018-10-30 14:35:07', 0, 18, 1, 5, 1, NULL, 0, NULL, 8, NULL);
INSERT INTO `goods` VALUES (148, 10, 500, '拉可莉卡连帽纯色睡衣秋冬女士长袖加厚长款羽毛纱法式睡袍软绵绵家居服睡裙 浅蓝 均码', 148, 89.00, 300, 1.00, 300, '北极绒', '2018-10-30 14:36:01', 0, 19, 1, 5, 1, NULL, 0, NULL, 8, 0);
INSERT INTO `goods` VALUES (149, 10, 700, '北极绒睡衣男 家居服男士长袖睡衣秋冬运动可外穿纯色法兰绒套头加厚珊蝴绒套装 深空灰 XL', 149, 119.00, 300, 1.00, 300, '北极绒', '2018-10-30 14:36:40', 0, 18, 1, 5, 1, NULL, 0, NULL, 8, NULL);
INSERT INTO `goods` VALUES (150, 20, 500, '京东超市俞兆林睡衣男秋冬法兰绒情侣睡衣女士开衫印花珊瑚绒家居服套装 男咖啡纯色 XL', 150, 159.00, 300, 1.00, 300, '北极绒', '2018-10-30 14:37:36', 0, 20, 1, 11, 1, NULL, 0, NULL, 8, 0);
INSERT INTO `goods` VALUES (151, 15, 700, '特丝格斯 秋冬加厚情侣睡衣睡袍法兰绒男女浴袍珊瑚绒家居服 奶白(男女各一件) 均码', 151, 159.00, 300, 1.00, 300, '北极绒', '2018-10-30 14:38:13', 0, 20, 1, 12, 1, NULL, 0, NULL, 8, NULL);
INSERT INTO `goods` VALUES (152, 17, 600, '集倩（JIQIAN）春秋冬季睡衣女长袖纯棉休闲韩版可爱可外穿家居服套装 爆款JQ011 女M(80-110斤)', 152, 117.00, 300, 1.00, 300, '南极人', '2018-10-30 14:38:52', 0, 19, 1, 12, 1, NULL, 0, NULL, 8, 0);
INSERT INTO `goods` VALUES (153, 18, 600, '南极人 睡衣家居服加厚法兰绒长袖情侣睡衣男女士秋冬纯色可外穿翻领开衫套装N675X21031-1 男藏青XL', 153, 119.00, 301, 1.00, 299, '南极人', '2018-10-30 14:39:34', 0, 20, 1, 12, 1, NULL, 0, NULL, 8, NULL);
INSERT INTO `goods` VALUES (154, 17, 600, '秋鹿春秋季家居服纯棉长袖圆领套头睡衣女士卡通印花长裤可外穿QHGI2101 豆沙红（38） L(160)', 154, 109.00, 300, 1.00, 300, '北极绒', '2018-10-31 14:40:44', 0, 19, 1, 11, 1, NULL, 0, NULL, 8, 0);
INSERT INTO `goods` VALUES (155, 30, 500, '拉可莉卡新品纯色睡衣女秋长袖家居服套装 白色 M码', 155, 109.00, 300, 1.00, 200, '南极人', '2018-10-30 14:41:32', 0, 19, 1, 1, 1, NULL, 0, NULL, 8, NULL);
INSERT INTO `goods` VALUES (156, 30, 700, '衣之澳 睡衣女冬季加厚珊瑚绒韩版开衫长袖秋款法兰绒家居服保暖秋冬套装 休闲女套装 L', 156, 119.00, 300, 1.00, 200, '南极人', '2018-10-30 14:42:29', 0, 19, 1, 11, 1, NULL, 0, NULL, 8, 0);
INSERT INTO `goods` VALUES (157, 50, 600, '京东超市阿丽雅睡衣男冬加厚法兰绒情侣睡衣女秋冬季珊瑚绒甜美学生韩版女士家居服套装ALY21011JD-23男蓝灰方格XL', 156, 119.00, 300, 1.00, 300, '北极绒', '2018-10-30 14:43:11', 0, 20, 1, 12, 1, NULL, 0, NULL, 8, NULL);
INSERT INTO `goods` VALUES (158, 20, 500, '可人儿冬季男士珊瑚绒睡衣韩版卡通保暖加厚法兰绒冬天家居服套装 灰色男款 M', 157, 105.00, 300, 1.00, 300, '南极人', '2018-10-30 14:43:51', 0, 18, 1, 11, 1, NULL, 0, NULL, 8, 0);
INSERT INTO `goods` VALUES (159, 15, 700, '諾盾睡衣男秋季法兰绒保暖加厚冬天家居服长袖翻领珊瑚绒新款衣裤两件套装 11031深蓝 XL码170-180cm 125-150斤', 158, 99.00, 300, 1.00, 300, '南极人', '2018-10-31 14:44:41', 0, 18, 1, 1, 1, NULL, 0, NULL, 8, NULL);
INSERT INTO `goods` VALUES (160, 20, 600, '南极人 睡衣男加厚可外穿法兰绒秋冬长袖睡衣家居服男翻领珊瑚绒开衫套装 男藏青剪花(上衣+裤子) XL', 159, 99.00, 300, 1.00, 300, '北极绒', '2018-10-30 14:45:24', 0, 18, 1, 1, 1, NULL, 0, NULL, 8, 0);
INSERT INTO `goods` VALUES (161, 52, 600, '衣之澳睡衣女秋冬季卡通睡衣男士法兰绒加绒加厚连体家居服 绿色恐龙 S（身高140--155穿）', 160, 129.00, 300, 1.00, 300, '北极绒', '2018-10-30 14:46:07', 0, 20, 1, 2, 1, NULL, 0, NULL, 8, NULL);
INSERT INTO `goods` VALUES (162, 12, 320, '爱心东东沫沫家睡衣男士秋冬季棉质套装长袖长裤睡衣大码男式休闲套头情侣家居服套装衣服 QFA01 L码(建议100-130斤)', 161, 119.00, 300, 1.00, 300, '北极绒', '2018-10-31 14:46:56', 0, 18, 1, 6, 1, NULL, 0, NULL, 8, 0);
INSERT INTO `goods` VALUES (163, 25, 300, '京东超市俞兆林睡衣女秋冬法兰绒情侣睡衣男士套头珊瑚绒家居服套装 女格子 L', 162, 119.00, 300, 1.00, 300, '北极绒', '2018-10-31 14:48:27', 0, 20, 1, 1, 1, NULL, 0, NULL, 8, NULL);
INSERT INTO `goods` VALUES (164, 21, 450, '南极人 睡衣女长袖秋冬可外穿法兰绒睡衣家居服女加厚珊瑚绒翻领开衫套装 女经典纯色(上衣+裤子) L', 163, 119.00, 300, 1.00, 300, '南极人', '2018-10-31 14:49:20', 0, 19, 1, 12, 1, NULL, 0, NULL, 8, 0);
INSERT INTO `goods` VALUES (165, 24, 500, '爱心东东Sunny ju睡衣女秋冬季韩版长袖长裤棉质开衫简约休闲女士套装家居服长款睡裙性感情侣男女可外穿衣服 QFK01 L码(建议100-120斤)', 164, 119.00, 300, 1.00, 300, '北极绒', '2018-10-31 14:49:59', 0, 20, 1, 1, 1, NULL, 0, NULL, 8, NULL);
INSERT INTO `goods` VALUES (166, 30, 700, '南极人睡衣女冬季珊瑚绒三层夹棉睡衣男冬季加厚法兰绒学生情侣睡衣女士家居服保暖套装 女夹棉粉色 XL码', 165, 107.00, 300, 1.00, 300, '南极人', '2018-10-31 14:51:19', 0, 19, 1, 1, 1, NULL, 0, NULL, 8, 0);
INSERT INTO `goods` VALUES (167, 30, 500, '猫人儿童保暖内衣套装弹力棉家居服男女中大童秋衣秋裤睡衣 波浪花环（男）-深兰 140(包邮免费试穿)', 167, 98.00, 300, 1.00, 300, '361', '2018-10-31 15:15:27', 0, 13, 1, 12, 1, NULL, 0, NULL, 5, NULL);
INSERT INTO `goods` VALUES (168, 20, 700, '安踏儿童童裤男童 秋冬款针织运动长裤儿童休闲裤男大童裤子6岁以上', 168, 98.00, 300, 1.00, 300, '安踏', '2018-10-31 15:16:47', 0, 13, 1, 23, 1, NULL, 0, NULL, 5, 0);
INSERT INTO `goods` VALUES (169, 10, 600, '贴心熊儿童睡衣男童装家居服宝宝小孩纯棉长袖2018夏季春秋新品t恤套装 80101男童 20码(身高154-158cm)', 169, 119.00, 300, 1.00, 300, '安踏', '2018-10-31 15:17:26', 0, 13, 1, 23, 1, NULL, 0, NULL, 5, NULL);
INSERT INTO `goods` VALUES (170, 10, 600, '七范童装男童套装冬装2018新款儿童加绒加厚中大童男孩秋冬季韩版潮衣三件套 红色【金丝绒套装】 150（建议身高140cm左右）', 170, 120.00, 3003, 1.00, 28, '安踏', '2018-10-31 15:18:16', 0, 13, 1, 23, 1, NULL, 0, NULL, 5, 0);
INSERT INTO `goods` VALUES (171, 20, 500, '361度男童装 男童轻薄保暖羽绒服2018秋冬新品 N51842922 碳黑 160', 171, 102.00, 201, 1.00, 199, '361', '2018-10-31 15:19:01', 0, 13, 1, 45, 1, NULL, 0, NULL, 5, NULL);
INSERT INTO `goods` VALUES (172, 15, 600, '南极人童装女童套装男童2018新款秋冬季金丝绒运动套装中大童两件套儿童秋冬装女孩保暖加厚运动服 皮粉色 120cm丨身高建议110-120cm', 172, 100.00, 200, 0.90, 200, '361', '2018-10-31 15:20:20', 0, 13, 1, 46, 1, NULL, 0, NULL, 5, 0);
INSERT INTO `goods` VALUES (173, 17, 500, '童装男童秋装套装2018新款儿童秋冬季中大童韩版金丝绒男孩潮衣服 TZ1248-2-灰色 130建议身高1米15-1米25', 173, 119.00, 302, 1.00, 198, '361', '2018-10-31 15:21:08', 0, 13, 1, 46, 1, NULL, 0, NULL, 5, NULL);
INSERT INTO `goods` VALUES (174, 18, 700, '童装男童外套冬装儿童外套加绒加厚保暖外套中大童新款男秋冬款大童冬季新款3-14岁男孩子中长款外套 迷彩 150(建议身高140cm左右)', 174, 99.00, 301, 1.00, 199, '安踏', '2018-10-31 15:22:01', 0, 13, 1, 23, 1, NULL, 0, NULL, 5, NULL);
INSERT INTO `goods` VALUES (175, 17, 600, '好孩童男童金丝绒套装秋冬季2018新款儿童中大童加绒连帽两件套洋气韩版 藏青色 140建议身高1米25到1米35', 175, 80.00, 300, 0.90, 200, '安踏', '2018-10-31 15:22:35', 0, 13, 1, 12, 1, NULL, 0, NULL, 5, NULL);
INSERT INTO `goods` VALUES (176, 30, 500, '童装男童秋装套装2018新款儿童韩版加绒加厚两件套中大童冬季潮衣 连帽卫衣套装-绿色 130建议身高1米2到1米3', 176, 90.00, 3010, 0.90, 299, '361', '2018-10-31 15:23:23', 0, 13, 1, 45, 1, NULL, 0, NULL, 5, NULL);
INSERT INTO `goods` VALUES (177, 30, 700, '品牌童装男童套装儿童套装秋冬新款装加厚加绒中大童男孩运动时尚休闲小初中学生马甲外套卫衣上衣裤子三件套 咖啡色 160（建议身高155cm）', 177, 100.00, 300, 0.90, 300, '361', '2018-10-31 15:24:10', 0, 13, 1, 89, 1, NULL, 0, NULL, 5, NULL);
INSERT INTO `goods` VALUES (178, 50, 600, '【三件套】谜康童装男女童套装儿童秋冬装加厚保暖长袖卫衣马甲休闲长裤三件套大童运动服小孩衣服小学生校服 灰色 160码建议身高150CM左右', 178, 100.00, 300, 0.90, 300, '361', '2018-10-31 15:24:56', 0, 13, 1, 85, 1, NULL, 0, NULL, 5, NULL);
INSERT INTO `goods` VALUES (179, 20, 600, '童装男儿童套装男童冬装2018新款加绒中大儿童卫衣三件套 虎头金丝绒三件套-黑色 130建议身高1米15-1米25', 179, 119.00, 300, 1.00, 3000, '安踏', '2018-10-31 15:25:41', 0, 13, 1, 35, 1, NULL, 0, NULL, 5, NULL);
INSERT INTO `goods` VALUES (180, 15, 320, '【两件套】 谜康童装女童套装冬装儿童加厚棉衣加绒皮裤两件套女孩大童棉服外套小孩衣服 紫色棉衣+皮裤 150码 建议身高140厘米左右', 180, 119.00, 300, 1.00, 300, '361', '2018-10-31 15:26:19', 0, 12, 1, 46, 1, NULL, 0, NULL, 5, NULL);
INSERT INTO `goods` VALUES (181, 20, 300, '童装女童外套儿童外套新款秋冬装儿童呢子加棉外套女孩中大童小初中学生时尚羊羔绒洋气上衣休闲时大衣风衣 咖啡色 130（建议身高125cm)', 181, 99.00, 300, 1.00, 300, '安踏', '2018-10-31 15:27:32', 0, 12, 1, 12, 1, NULL, 0, NULL, 5, NULL);
INSERT INTO `goods` VALUES (182, 52, 450, '七范童装男童套装2018新款运动蝙蝠套装春装儿童套装休闲卫衣两件套秋装男孩中大童韩版童装 黑色【蝙蝠套装】 150码建议身高140cm左右', 182, 129.00, 300, 1.00, 300, '安踏', '2018-10-31 15:28:35', 0, 13, 1, 20, 1, NULL, 0, NULL, 5, NULL);
INSERT INTO `goods` VALUES (183, 12, 500, '童装女童冬装套装加绒加厚保暖三件套外套+裤子儿童运动服饰中大童4-12岁女孩子中学生衣服 卡其色 140码建议身高140cm', 183, 129.00, 300, 1.00, 300, '安踏', '2018-10-31 15:30:26', 0, 12, 1, 20, 1, NULL, 0, NULL, 5, NULL);
INSERT INTO `goods` VALUES (184, 25, 700, '安踏童装 男女童加绒套装2018冬季新款运动休闲外套裤子 中大童男女套装 A37848793 肉植粉/BC19深花灰-1 150cm', 184, 139.00, 300, 1.00, 300, '安踏', '2018-10-31 15:31:01', 0, 12, 1, 23, 1, NULL, 0, NULL, 5, 0);
INSERT INTO `goods` VALUES (185, 21, 500, '361度 童装女童套装2018年冬季男女大童针织卫衣裤子两件套儿童运动套装T61841R 梅红色 140', 185, 115.00, 300, 1.00, 300, '361', '2018-10-31 15:31:51', 0, 12, 1, 52, 1, NULL, 0, NULL, 5, NULL);
INSERT INTO `goods` VALUES (186, 24, 700, '谜康童装女童套装2018秋装新款长袖T恤外套裤子三件套儿童春秋运动套装女孩大童韩版少女小学生衣服 粉色 150码 建议身高140厘米左右', 186, 110.00, 300, 0.90, 300, '361', '2018-10-31 15:32:27', 0, 12, 1, 45, 1, NULL, 0, NULL, 5, 0);
INSERT INTO `goods` VALUES (187, 30, 600, '妙乐熊童装女童套装秋装2018新款韩版中大童儿童小女孩长袖外套裤子金丝绒两件套休闲时尚运动套装学生装 紫色  加厚款 150  建议身高1米45左右', 187, 113.00, 300, 0.90, 300, '361', '2018-10-31 15:33:04', 0, 12, 1, 465, 1, NULL, 0, NULL, 5, 0);
INSERT INTO `goods` VALUES (188, 20, 600, '圣笑 童装女童套装加厚冬款2018新品中大儿童加绒灯芯绒上衣+裤子两件套毛领款 粉红色 140码建议身高130cm', 188, 119.00, 300, 1.00, 300, '361', '2018-10-31 15:33:42', 0, 12, 1, 32, 1, NULL, 0, NULL, 5, 0);
INSERT INTO `goods` VALUES (189, 10, 500, '迪士尼 Disney 自营童装女童中小童不倒绒保暖长裤加厚加绒裤子2018秋冬新款 DA831ME07 藏青细白条 100', 189, 109.00, 300, 1.00, 300, '361', '2018-10-31 15:34:18', 0, 12, 1, 45, 1, NULL, 0, NULL, 5, 0);
INSERT INTO `goods` VALUES (190, 10, 700, '三件套 毛毛逗童装女童套装儿童春秋装新款休闲小学生中大童开衫T恤打底裤少女装小女孩衣服 图片色 160码 建议身高150cm左右穿', 190, 110.00, 300, 0.90, 300, '安踏', '2018-10-31 15:35:10', 0, 12, 1, 33, 1, NULL, 0, NULL, 5, NULL);
INSERT INTO `goods` VALUES (191, 20, 600, '麦米尚品童装女童秋冬装套装金丝绒加绒儿童运动休闲两件套长袖裤子新品中大童4-12岁女孩中小学生衣服 （三件套）28英文款焦糖色 150码建议身高140cm', 191, 110.00, 300, 1.00, 300, '安踏', '2018-10-31 15:35:59', 0, 12, 1, 22, 1, NULL, 0, NULL, 5, NULL);
INSERT INTO `goods` VALUES (192, 15, 500, '贝介 童装女童儿童运动套装女 2018秋装新款韩版中大童卫衣T恤+短裙打底裤两件套校服 红色 120', 192, 119.00, 300, 1.00, 300, '安踏', '2018-10-31 15:36:54', 0, 12, 1, 44, 1, NULL, 0, NULL, 5, NULL);
INSERT INTO `goods` VALUES (193, 17, 700, '童装女童套装秋装冬装2018新款加绒加厚金丝绒两件套儿童运动套装 粉色 140码适合135cm身高', 193, 139.00, 300, 1.00, 300, '361', '2018-10-31 15:37:40', 0, 12, 1, 11, 1, NULL, 0, NULL, 5, 0);
INSERT INTO `goods` VALUES (194, 18, 600, '【两件套】谜康童装女童套装秋冬款2018儿童新品加绒加厚女孩长袖卫衣休闲长裤两件套中大童小学生衣服 粉红色 140码建议身高130CM左右', 194, 159.00, 300, 1.00, 300, '361', '2018-10-31 15:38:16', 0, 12, 1, 33, 1, NULL, 0, NULL, 5, NULL);
INSERT INTO `goods` VALUES (195, 17, 500, '朵比熊童装女童儿童套装2018冬季新款中大女童加绒加厚保暖卫衣三件套 G9968粉色 140', 195, 129.00, 300, 1.00, 300, '361', '2018-10-31 15:38:51', 0, 12, 1, 78, 1, NULL, 0, NULL, 5, NULL);
INSERT INTO `goods` VALUES (196, 30, 700, '休闲潮流衬衣', 204, 13.80, 200, 1.00, 200, '', '2018-10-31 15:51:53', 0, 7, 1, 23, 1, NULL, 0, NULL, 3, NULL);
INSERT INTO `goods` VALUES (197, 30, 600, '时尚风潮卫衣', 205, 13.80, 200, 1.00, 200, NULL, '2018-10-31 15:53:02', 0, 7, 1, 33, 1, NULL, 0, NULL, 3, 0);
INSERT INTO `goods` VALUES (198, 50, 600, '魅力风衣', 206, 4.80, 200, 1.00, 200, NULL, '2018-10-31 15:53:41', 0, 7, 1, 34, 1, NULL, 0, NULL, 3, NULL);
INSERT INTO `goods` VALUES (199, 20, 320, '前卫T恤', 207, 4.80, 300, 1.00, 200, NULL, '2018-10-31 15:54:52', 0, 7, 1, 22, 1, NULL, 0, NULL, 3, 0);
INSERT INTO `goods` VALUES (200, 15, 300, '精选夹克', 208, 4.80, 300, 1.00, 300, NULL, '2018-10-31 15:56:56', 0, 1, 1, 22, 1, NULL, 0, NULL, 1, 0);
INSERT INTO `goods` VALUES (201, 20, 450, '潮流长袖', 209, 4.80, 300, 1.00, 300, NULL, '2018-10-31 15:57:40', 0, 1, 1, 1, 1, NULL, 0, NULL, 1, NULL);
INSERT INTO `goods` VALUES (202, 52, 500, '七彩炫彩板鞋', 197, 13.80, 300, 1.00, 300, NULL, '2018-10-31 15:59:31', 0, 4, 1, 1, 1, NULL, 0, NULL, 2, 0);
INSERT INTO `goods` VALUES (203, 12, 700, '时尚热卖休闲鞋', 198, 13.80, 300, 1.00, 300, NULL, '2018-10-31 16:00:21', 0, 4, 1, 1, 1, NULL, 0, NULL, 2, 0);
INSERT INTO `goods` VALUES (204, 25, 500, '魅力诱惑厚底鞋', 199, 4.80, 300, 1.00, 300, NULL, '2018-10-31 16:01:04', 0, 4, 1, 1, 1, NULL, 0, NULL, 2, 0);
INSERT INTO `goods` VALUES (205, 21, 700, '经典三条杠运动鞋', 200, 4.80, 200, 1.00, 300, NULL, '2018-10-31 16:01:32', 0, 4, 4, 4, 1, NULL, 0, NULL, 2, NULL);
INSERT INTO `goods` VALUES (206, 24, 600, '成熟风度皮鞋', 201, 4.80, 200, 1.00, 300, NULL, '2018-10-31 16:01:32', 0, 4, 4, 4, 1, NULL, 0, NULL, 2, 0);
INSERT INTO `goods` VALUES (207, 30, 600, '嘻哈风格', 202, 4.80, 200, 1.00, 300, NULL, '2018-10-31 16:01:32', 0, 4, 4, 4, 1, NULL, 0, NULL, 2, NULL);
INSERT INTO `goods` VALUES (217, 1000, 6000, '百搭好衣', 223, 1300.00, NULL, 0.80, 560, '唐狮', '2018-11-10 14:48:31', 0, 1, 1, NULL, 1, 'good', 1, 1, 1, NULL);
INSERT INTO `goods` VALUES (218, 100, 600, '一件好衣服', 226, 500.00, NULL, 0.80, 56, '唐狮', '2018-11-14 09:06:35', 0, 1, 1, NULL, 1, '好东西', 1, 1, 1, NULL);

-- ----------------------------
-- Table structure for goodsbuy
-- ----------------------------
DROP TABLE IF EXISTS `goodsbuy`;
CREATE TABLE `goodsbuy`  (
  `goodsbuyId` int(20) NOT NULL AUTO_INCREMENT,
  `userId` int(20) NULL DEFAULT NULL,
  `orderId` int(20) NULL DEFAULT NULL,
  `goodsbuydate` datetime(0) NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP(0),
  PRIMARY KEY (`goodsbuyId`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 18 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of goodsbuy
-- ----------------------------
INSERT INTO `goodsbuy` VALUES (1, 1, 1, '2018-05-07 09:35:10');
INSERT INTO `goodsbuy` VALUES (2, 25, 123, '2018-11-07 20:00:27');
INSERT INTO `goodsbuy` VALUES (3, 25, 124, '2018-11-07 20:04:49');
INSERT INTO `goodsbuy` VALUES (4, 25, 126, '2018-11-07 20:11:26');
INSERT INTO `goodsbuy` VALUES (5, 25, 127, '2018-11-08 15:47:42');
INSERT INTO `goodsbuy` VALUES (6, 25, 128, '2018-11-08 15:50:43');
INSERT INTO `goodsbuy` VALUES (7, 25, 30, '2018-11-08 15:53:38');
INSERT INTO `goodsbuy` VALUES (8, 25, 131, '2018-11-08 16:09:43');
INSERT INTO `goodsbuy` VALUES (9, 25, 132, '2018-11-08 16:12:04');
INSERT INTO `goodsbuy` VALUES (10, 25, 133, '2018-11-08 16:13:23');
INSERT INTO `goodsbuy` VALUES (11, 25, 36, '2018-11-08 16:19:20');
INSERT INTO `goodsbuy` VALUES (12, 25, 134, '2018-11-08 16:23:27');
INSERT INTO `goodsbuy` VALUES (13, 25, 135, '2018-11-08 16:25:41');
INSERT INTO `goodsbuy` VALUES (14, 25, 136, '2018-11-08 16:28:10');
INSERT INTO `goodsbuy` VALUES (15, 25, 137, '2018-11-08 16:29:48');
INSERT INTO `goodsbuy` VALUES (16, 25, 138, '2018-11-08 16:33:30');
INSERT INTO `goodsbuy` VALUES (17, 25, 139, '2018-11-08 16:39:21');

-- ----------------------------
-- Table structure for goodsclass1
-- ----------------------------
DROP TABLE IF EXISTS `goodsclass1`;
CREATE TABLE `goodsclass1`  (
  `id_1` int(10) NOT NULL AUTO_INCREMENT,
  `className1` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '大类别名称',
  PRIMARY KEY (`id_1`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 10 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '商品一级类别表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of goodsclass1
-- ----------------------------
INSERT INTO `goodsclass1` VALUES (1, '男装');
INSERT INTO `goodsclass1` VALUES (2, '男鞋');
INSERT INTO `goodsclass1` VALUES (3, '女装');
INSERT INTO `goodsclass1` VALUES (4, '女鞋');
INSERT INTO `goodsclass1` VALUES (5, '童装');
INSERT INTO `goodsclass1` VALUES (6, '童鞋');
INSERT INTO `goodsclass1` VALUES (7, '配饰');
INSERT INTO `goodsclass1` VALUES (8, '睡衣');
INSERT INTO `goodsclass1` VALUES (9, '箱包');

-- ----------------------------
-- Table structure for goodsclass2
-- ----------------------------
DROP TABLE IF EXISTS `goodsclass2`;
CREATE TABLE `goodsclass2`  (
  `id_2` int(10) NOT NULL AUTO_INCREMENT,
  `className2` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '二级类别名称',
  `id_1` int(10) NOT NULL COMMENT '一级类别id',
  PRIMARY KEY (`id_2`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 22 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '商品二级类别表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of goodsclass2
-- ----------------------------
INSERT INTO `goodsclass2` VALUES (1, '卫衣', 1);
INSERT INTO `goodsclass2` VALUES (2, '外套男', 1);
INSERT INTO `goodsclass2` VALUES (3, '裤子', 1);
INSERT INTO `goodsclass2` VALUES (4, '运动鞋男', 2);
INSERT INTO `goodsclass2` VALUES (5, '皮鞋男', 2);
INSERT INTO `goodsclass2` VALUES (6, '连衣裙', 3);
INSERT INTO `goodsclass2` VALUES (7, '外套女', 3);
INSERT INTO `goodsclass2` VALUES (8, '棉袄', 3);
INSERT INTO `goodsclass2` VALUES (9, '运动鞋女', 4);
INSERT INTO `goodsclass2` VALUES (10, '皮鞋女', 4);
INSERT INTO `goodsclass2` VALUES (11, '平底鞋', 4);
INSERT INTO `goodsclass2` VALUES (12, '女童', 5);
INSERT INTO `goodsclass2` VALUES (13, '男童', 5);
INSERT INTO `goodsclass2` VALUES (14, '童鞋女', 6);
INSERT INTO `goodsclass2` VALUES (15, '童鞋男', 6);
INSERT INTO `goodsclass2` VALUES (16, '项链', 7);
INSERT INTO `goodsclass2` VALUES (17, '手链', 7);
INSERT INTO `goodsclass2` VALUES (18, '男士', 8);
INSERT INTO `goodsclass2` VALUES (19, '女士', 8);
INSERT INTO `goodsclass2` VALUES (20, '情侣装', 8);
INSERT INTO `goodsclass2` VALUES (21, '旅行箱', 9);

-- ----------------------------
-- Table structure for image
-- ----------------------------
DROP TABLE IF EXISTS `image`;
CREATE TABLE `image`  (
  `goodsPicId` int(10) NOT NULL AUTO_INCREMENT,
  `goodsPicMaster` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '主图片',
  `goodsPic1` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '缩略图1',
  `goodsPic2` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '缩略图2',
  `goodsPic3` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '缩略图3',
  `goodsPic4` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '缩略图4',
  PRIMARY KEY (`goodsPicId`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 228 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '图片表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of image
-- ----------------------------
INSERT INTO `image` VALUES (1, 'http://pqz3l17rl.bkt.clouddn.com/s1-1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/s1-2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/s1-3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/s1-4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/s1-5.jpg');
INSERT INTO `image` VALUES (2, 'http://pqz3l17rl.bkt.clouddn.com/s2-1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/s2-2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/s2-3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/s2-4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/s2-5.jpg');
INSERT INTO `image` VALUES (3, 'http://pqz3l17rl.bkt.clouddn.com/s3-1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/s3-2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/s3-3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/s3-4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/s3-5.jpg');
INSERT INTO `image` VALUES (4, 'http://pqz3l17rl.bkt.clouddn.com/s4-1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/s4-2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/s4-3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/s4-4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/s4-5.jpg');
INSERT INTO `image` VALUES (5, 'http://pqz3l17rl.bkt.clouddn.com/s5-1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/s5-2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/s5-3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/s5-4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/s5-5.jpg');
INSERT INTO `image` VALUES (6, 'http://pqz3l17rl.bkt.clouddn.com/s6-1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/s6-2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/s6-3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/s6-4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/s6-5.jpg');
INSERT INTO `image` VALUES (7, 'http://pqz3l17rl.bkt.clouddn.com/s7-1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/s7-2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/s7-3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/s7-4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/s7-5.jpg');
INSERT INTO `image` VALUES (8, 'http://pqz3l17rl.bkt.clouddn.com/s8-1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/s8-2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/s8-3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/s8-4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/s8-5.jpg');
INSERT INTO `image` VALUES (9, 'http://pqz3l17rl.bkt.clouddn.com/s9-1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/s9-2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/s9-3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/s9-4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/s9-5.jpg');
INSERT INTO `image` VALUES (10, 'http://pqz3l17rl.bkt.clouddn.com/s10-1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/s10-2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/s10-3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/s10-4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/s10-5.jpg');
INSERT INTO `image` VALUES (11, 'http://pqz3l17rl.bkt.clouddn.com/nan1.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nan1.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nan1.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nan1.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nan1.5.jpg');
INSERT INTO `image` VALUES (12, 'http://pqz3l17rl.bkt.clouddn.com/nan2.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nan2.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nan2.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nan2.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nan2.5.jpg');
INSERT INTO `image` VALUES (13, 'http://pqz3l17rl.bkt.clouddn.com/nan3.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nan3.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nan3.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nan3.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nan3.5.jpg');
INSERT INTO `image` VALUES (14, 'http://pqz3l17rl.bkt.clouddn.com/nan4.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nan4.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nan4.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nan4.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nan4.5.jpg');
INSERT INTO `image` VALUES (15, 'http://pqz3l17rl.bkt.clouddn.com/nan5.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nan5.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nan5.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nan5.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nan5.5.jpg');
INSERT INTO `image` VALUES (16, 'http://pqz3l17rl.bkt.clouddn.com/nan6.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nan6.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nan6.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nan6.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nan6.5.jpg');
INSERT INTO `image` VALUES (17, 'http://pqz3l17rl.bkt.clouddn.com/nan7.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nan7.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nan7.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nan7.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nan7.5.jpg');
INSERT INTO `image` VALUES (18, 'http://pqz3l17rl.bkt.clouddn.com/nan8.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nan8.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nan8.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nan8.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nan8.5.jpg');
INSERT INTO `image` VALUES (19, 'http://pqz3l17rl.bkt.clouddn.com/nan9.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nan9.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nan9.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nan9.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nan9.5.jpg');
INSERT INTO `image` VALUES (20, 'http://pqz3l17rl.bkt.clouddn.com/nan10.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nan10.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nan10.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nan10.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nan10.5.jpg');
INSERT INTO `image` VALUES (21, 'http://pqz3l17rl.bkt.clouddn.com/nan11.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nan11.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nan11.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nan11.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nan11.5.jpg');
INSERT INTO `image` VALUES (22, 'http://pqz3l17rl.bkt.clouddn.com/nx1.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nx1.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nx1.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nx1.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nx1.5.jpg');
INSERT INTO `image` VALUES (23, 'http://pqz3l17rl.bkt.clouddn.com/nx2.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nx2.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nx2.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nx2.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nx2.5.jpg');
INSERT INTO `image` VALUES (24, 'http://pqz3l17rl.bkt.clouddn.com/nx3.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nx3.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nx3.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nx3.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nx3.5.jpg');
INSERT INTO `image` VALUES (25, 'http://pqz3l17rl.bkt.clouddn.com/nx4.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nx4.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nx4.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nx4.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nx4.5.jpg');
INSERT INTO `image` VALUES (26, 'http://pqz3l17rl.bkt.clouddn.com/nx5.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nx5.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nx5.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nx5.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nx5.5.jpg');
INSERT INTO `image` VALUES (27, 'http://pqz3l17rl.bkt.clouddn.com/nx6.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nx6.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nx6.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nx6.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nx6.5.jpg');
INSERT INTO `image` VALUES (28, 'http://pqz3l17rl.bkt.clouddn.com/nx7.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nx7.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nx7.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nx7.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nx7.5.jpg');
INSERT INTO `image` VALUES (29, 'http://pqz3l17rl.bkt.clouddn.com/nx8.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nx8.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nx8.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nx8.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nx8.5.jpg');
INSERT INTO `image` VALUES (30, 'http://pqz3l17rl.bkt.clouddn.com/nx9.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nx9.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nx9.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nx9.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nx9.5.jpg');
INSERT INTO `image` VALUES (31, 'http://pqz3l17rl.bkt.clouddn.com/nx10.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nx10.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nx10.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nx10.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nx10.5.jpg');
INSERT INTO `image` VALUES (32, 'http://pqz3l17rl.bkt.clouddn.com/nx11.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nx11.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nx11.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nx11.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nx11.5.jpg');
INSERT INTO `image` VALUES (33, 'http://pqz3l17rl.bkt.clouddn.com/nx12.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nx12.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nx12.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nx12.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nx12.5.jpg');
INSERT INTO `image` VALUES (34, 'http://pqz3l17rl.bkt.clouddn.com/nx13.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nx13.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nx13.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nx13.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nx13.5.jpg');
INSERT INTO `image` VALUES (35, 'http://pqz3l17rl.bkt.clouddn.com/nx14.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nx14.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nx14.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nx14.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nx14.5.jpg');
INSERT INTO `image` VALUES (36, 'http://pqz3l17rl.bkt.clouddn.com/nx15.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nx15.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nx15.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nx15.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nx15.5.jpg');
INSERT INTO `image` VALUES (37, 'http://pqz3l17rl.bkt.clouddn.com/nx16.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nx16.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nx16.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nx16.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nx16.5.jpg');
INSERT INTO `image` VALUES (38, 'http://pqz3l17rl.bkt.clouddn.com/nx17.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nx17.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nx17.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nx17.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nx17.5.jpg');
INSERT INTO `image` VALUES (39, 'http://pqz3l17rl.bkt.clouddn.com/nx18.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nx18.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nx18.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nx18.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nx18.5.jpg');
INSERT INTO `image` VALUES (40, 'http://pqz3l17rl.bkt.clouddn.com/nx19.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nx19.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nx19.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nx19.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nx19.5.jpg');
INSERT INTO `image` VALUES (41, 'http://pqz3l17rl.bkt.clouddn.com/nx20.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nx20.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nx20.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nx20.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nx20.5.jpg');
INSERT INTO `image` VALUES (42, 'http://pqz3l17rl.bkt.clouddn.com/nx21.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nx21.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nx21.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nx21.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nx21.5.jpg');
INSERT INTO `image` VALUES (43, 'http://pqz3l17rl.bkt.clouddn.com/nx22.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nx22.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nx22.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nx22.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nx22.5.jpg');
INSERT INTO `image` VALUES (44, 'http://pqz3l17rl.bkt.clouddn.com/nx23.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nx23.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nx23.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nx23.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nx23.5.jpg');
INSERT INTO `image` VALUES (45, 'http://pqz3l17rl.bkt.clouddn.com/nx24.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nx24.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nx24.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nx24.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nx24.5.jpg');
INSERT INTO `image` VALUES (46, 'http://pqz3l17rl.bkt.clouddn.com/nx25.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nx25.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nx25.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nx25.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nx25.5.jpg');
INSERT INTO `image` VALUES (47, 'http://pqz3l17rl.bkt.clouddn.com/nx26.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nx26.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nx26.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nx26.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nx26.5.jpg');
INSERT INTO `image` VALUES (48, 'http://pqz3l17rl.bkt.clouddn.com/nv1.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nv1.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nv1.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nv1.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nv1.5.jpg');
INSERT INTO `image` VALUES (49, 'http://pqz3l17rl.bkt.clouddn.com/nv2.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nv2.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nv2.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nv2.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nv2.5.jpg');
INSERT INTO `image` VALUES (50, 'http://pqz3l17rl.bkt.clouddn.com/nv3.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nv3.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nv3.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nv3.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nv3.5.jpg');
INSERT INTO `image` VALUES (51, 'http://pqz3l17rl.bkt.clouddn.com/nv4.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nv4.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nv4.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nv4.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nv4.5.jpg');
INSERT INTO `image` VALUES (52, 'http://pqz3l17rl.bkt.clouddn.com/nv5.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nv5.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nv5.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nv5.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nv5.5.jpg');
INSERT INTO `image` VALUES (53, 'http://pqz3l17rl.bkt.clouddn.com/nv6.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nv6.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nv6.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nv6.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nv6.5.jpg');
INSERT INTO `image` VALUES (54, 'http://pqz3l17rl.bkt.clouddn.com/nv7.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nv7.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nv7.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nv7.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nv7.5.jpg');
INSERT INTO `image` VALUES (55, 'http://pqz3l17rl.bkt.clouddn.com/nv8.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nv8.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nv8.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nv8.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nv8.5.jpg');
INSERT INTO `image` VALUES (56, 'http://pqz3l17rl.bkt.clouddn.com/nv9.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nv9.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nv9.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nv9.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nv9.5.jpg');
INSERT INTO `image` VALUES (57, 'http://pqz3l17rl.bkt.clouddn.com/nv10.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nv10.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nv10.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nv10.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nv10.5.jpg');
INSERT INTO `image` VALUES (58, 'http://pqz3l17rl.bkt.clouddn.com/nv11.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nv11.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nv11.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nv11.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nv11.5.jpg');
INSERT INTO `image` VALUES (59, 'http://pqz3l17rl.bkt.clouddn.com/nv12.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nv12.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nv12.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nv12.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nv12.5.jpg');
INSERT INTO `image` VALUES (60, 'http://pqz3l17rl.bkt.clouddn.com/nv13.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nv13.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nv13.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nv13.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nv13.5.jpg');
INSERT INTO `image` VALUES (61, 'http://pqz3l17rl.bkt.clouddn.com/nv14.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nv14.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nv14.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nv14.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nv14.5.jpg');
INSERT INTO `image` VALUES (62, 'http://pqz3l17rl.bkt.clouddn.com/nv15.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nv15.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nv15.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nv15.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nv15.5.jpg');
INSERT INTO `image` VALUES (63, 'http://pqz3l17rl.bkt.clouddn.com/nv16.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nv16.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nv16.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nv16.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nv16.5.jpg');
INSERT INTO `image` VALUES (64, 'http://pqz3l17rl.bkt.clouddn.com/nv17.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nv17.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nv17.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nv17.5.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nv17.5.1.jpg');
INSERT INTO `image` VALUES (65, 'http://pqz3l17rl.bkt.clouddn.com/nv18.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nv18.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nv18.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nv18.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nv18.5.jpg');
INSERT INTO `image` VALUES (66, 'http://pqz3l17rl.bkt.clouddn.com/nv19.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nv19.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nv19.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nv19.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nv19.5.jpg');
INSERT INTO `image` VALUES (67, 'http://pqz3l17rl.bkt.clouddn.com/nv20.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nv20.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nv20.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nv20.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nv20.5.jpg');
INSERT INTO `image` VALUES (68, 'http://pqz3l17rl.bkt.clouddn.com/nv21.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nv21.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nv21.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nv21.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/nv21.5.jpg');
INSERT INTO `image` VALUES (69, 'http://pqz3l17rl.bkt.clouddn.com/vx1.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/vx1.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/vx1.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/vx1.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/vx1.5.jpg');
INSERT INTO `image` VALUES (70, 'http://pqz3l17rl.bkt.clouddn.com/vx2.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/vx2.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/vx2.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/vx2.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/vx2.5.jpg');
INSERT INTO `image` VALUES (71, 'http://pqz3l17rl.bkt.clouddn.com/vx3.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/vx3.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/vx3.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/vx3.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/vx3.5.jpg');
INSERT INTO `image` VALUES (72, 'http://pqz3l17rl.bkt.clouddn.com/vx4.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/vx4.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/vx4.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/vx4.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/vx4.5.jpg');
INSERT INTO `image` VALUES (73, 'http://pqz3l17rl.bkt.clouddn.com/vx5.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/vx5.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/vx5.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/vx5.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/vx5.5.jpg');
INSERT INTO `image` VALUES (74, 'http://pqz3l17rl.bkt.clouddn.com/vx6.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/vx6.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/vx6.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/vx6.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/vx6.5.jpg');
INSERT INTO `image` VALUES (75, 'http://pqz3l17rl.bkt.clouddn.com/vx7.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/vx7.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/vx7.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/vx7.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/vx7.5.jpg');
INSERT INTO `image` VALUES (76, 'http://pqz3l17rl.bkt.clouddn.com/vx8.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/vx8.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/vx8.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/vx8.5.jpg', 'http://pqz3l17rl.bkt.clouddn.com/vx8.5.jpg');
INSERT INTO `image` VALUES (77, 'http://pqz3l17rl.bkt.clouddn.com/vx9.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/vx9.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/vx9.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/vx9.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/vx9.5.jpg');
INSERT INTO `image` VALUES (78, 'http://pqz3l17rl.bkt.clouddn.com/vx10.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/vx10.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/vx10.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/vx10.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/vx10.5.jpg');
INSERT INTO `image` VALUES (79, 'http://pqz3l17rl.bkt.clouddn.com/vx11.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/vx11.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/vx11.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/vx11.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/vx11.5.jpg');
INSERT INTO `image` VALUES (80, 'http://pqz3l17rl.bkt.clouddn.com/vx12.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/vx12.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/vx12.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/vx12.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/vx12.5.jpg');
INSERT INTO `image` VALUES (81, 'http://pqz3l17rl.bkt.clouddn.com/vx13.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/vx13.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/vx13.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/vx13.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/vx13.5.jpg');
INSERT INTO `image` VALUES (82, 'http://pqz3l17rl.bkt.clouddn.com/vx14.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/vx14.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/vx14.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/vx14.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/vx14.5.jpg');
INSERT INTO `image` VALUES (83, 'http://pqz3l17rl.bkt.clouddn.com/vx15.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/vx15.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/vx15.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/vx15.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/vx15.5.jpg');
INSERT INTO `image` VALUES (84, 'http://pqz3l17rl.bkt.clouddn.com/vx16.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/vx16.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/vx16.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/vx16.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/vx16.5.jpg');
INSERT INTO `image` VALUES (85, 'http://pqz3l17rl.bkt.clouddn.com/vx17.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/vx17.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/vx17.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/vx17.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/vx17.5.jpg');
INSERT INTO `image` VALUES (86, 'http://pqz3l17rl.bkt.clouddn.com/vx18.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/vx18.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/vx18.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/vx18.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/vx18.5.jpg');
INSERT INTO `image` VALUES (87, 'http://pqz3l17rl.bkt.clouddn.com/vx19.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/vx19.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/vx19.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/vx19.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/vx19.5.jpg');
INSERT INTO `image` VALUES (88, 'http://pqz3l17rl.bkt.clouddn.com/vx20.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/vx20.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/vx20.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/vx20.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/vx20.5.jpg');
INSERT INTO `image` VALUES (89, 'http://pqz3l17rl.bkt.clouddn.com/vx21.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/vx21.2http://pqz3l17rl.bkt.clouddn.com/vx21.1.jpg.jpg', 'http://pqz3l17rl.bkt.clouddn.com/vx21.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/vx21.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/vx21.5.jpg');
INSERT INTO `image` VALUES (90, 'http://pqz3l17rl.bkt.clouddn.com/vx22.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/vx22.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/vx22.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/vx22.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/vx22.5.jpg');
INSERT INTO `image` VALUES (91, 'http://pqz3l17rl.bkt.clouddn.com/vx23.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/vx23.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/vx23.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/vx23.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/vx23.5.jpg');
INSERT INTO `image` VALUES (92, 'http://pqz3l17rl.bkt.clouddn.com/vx24.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/vx24.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/vx24.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/vx24.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/vx24.5.jpg');
INSERT INTO `image` VALUES (93, 'http://pqz3l17rl.bkt.clouddn.com/vx25.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/vx25.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/vx25.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/vx25.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/vx25.5.jpg');
INSERT INTO `image` VALUES (94, 'http://pqz3l17rl.bkt.clouddn.com/vx26.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/vx26.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/vx26.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/vx26.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/vx26.5.jpg');
INSERT INTO `image` VALUES (95, 'http://pqz3l17rl.bkt.clouddn.com/vx27.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/vx27.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/vx27.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/vx27.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/vx27.5.jpg');
INSERT INTO `image` VALUES (96, 'http://pqz3l17rl.bkt.clouddn.com/tx1.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/tx1.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/tx1.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/tx1.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/tx1.5.jpg');
INSERT INTO `image` VALUES (97, 'http://pqz3l17rl.bkt.clouddn.com/tx2.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/tx2.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/tx2.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/tx2.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/tx2.5.jpg');
INSERT INTO `image` VALUES (98, 'http://pqz3l17rl.bkt.clouddn.com/tx3.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/tx3.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/tx3.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/tx3.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/tx3.5.jpg');
INSERT INTO `image` VALUES (99, 'http://pqz3l17rl.bkt.clouddn.com/tx4.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/tx4.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/tx4.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/tx4.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/tx4.5.jpg');
INSERT INTO `image` VALUES (100, 'http://pqz3l17rl.bkt.clouddn.com/tx5.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/tx5.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/tx5.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/tx5.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/tx5.5.jpg');
INSERT INTO `image` VALUES (101, 'http://pqz3l17rl.bkt.clouddn.com/tx6.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/tx6.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/tx6.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/tx6.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/tx6.5.jpg');
INSERT INTO `image` VALUES (102, 'http://pqz3l17rl.bkt.clouddn.com/tx7.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/tx7.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/tx7.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/tx7.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/tx7.5.jpg');
INSERT INTO `image` VALUES (103, 'http://pqz3l17rl.bkt.clouddn.com/tx8.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/tx8.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/tx8.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/tx8.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/tx8.5.jpg');
INSERT INTO `image` VALUES (104, 'http://pqz3l17rl.bkt.clouddn.com/tx9.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/tx9.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/tx9.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/tx9.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/tx9.5.jpg');
INSERT INTO `image` VALUES (105, 'http://pqz3l17rl.bkt.clouddn.com/tx10.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/tx10.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/tx10.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/tx10.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/tx10.5.jpg');
INSERT INTO `image` VALUES (106, 'http://pqz3l17rl.bkt.clouddn.com/tx11.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/tx11.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/tx11.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/tx11.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/tx11.5.jpg');
INSERT INTO `image` VALUES (107, 'http://pqz3l17rl.bkt.clouddn.com/tx12.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/tx12.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/tx12.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/tx12.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/tx12.5.jpg');
INSERT INTO `image` VALUES (108, 'http://pqz3l17rl.bkt.clouddn.com/tx13.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/tx13.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/tx13.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/tx13.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/tx13.5.jpg');
INSERT INTO `image` VALUES (109, 'http://pqz3l17rl.bkt.clouddn.com/tx14.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/tx14.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/tx14.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/tx14.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/tx14.5.jpg');
INSERT INTO `image` VALUES (110, 'http://pqz3l17rl.bkt.clouddn.com/xb1.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/xb1.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/xb1.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/xb1.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/xb1.5.jpg');
INSERT INTO `image` VALUES (111, 'http://pqz3l17rl.bkt.clouddn.com/xb2.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/xb2.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/xb2.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/xb2.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/xb2.5.jpg');
INSERT INTO `image` VALUES (112, 'http://pqz3l17rl.bkt.clouddn.com/xb3.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/xb3.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/xb3.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/xb3.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/xb3.5.jpg');
INSERT INTO `image` VALUES (113, 'http://pqz3l17rl.bkt.clouddn.com/xb4.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/xb4.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/xb4.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/xb4.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/xb4.5.jpg');
INSERT INTO `image` VALUES (114, 'http://pqz3l17rl.bkt.clouddn.com/xb5.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/xb5.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/xb5.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/xb5.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/xb5.5.jpg');
INSERT INTO `image` VALUES (115, 'http://pqz3l17rl.bkt.clouddn.com/xb6.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/xb6.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/xb6.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/xb6.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/xb6.6.jpg');
INSERT INTO `image` VALUES (116, 'http://pqz3l17rl.bkt.clouddn.com/xb7.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/xb7.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/xb7.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/xb7.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/xb7.5.jpg');
INSERT INTO `image` VALUES (117, 'http://pqz3l17rl.bkt.clouddn.com/xb8.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/xb8.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/xb8.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/xb8.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/xb8.5.jpg');
INSERT INTO `image` VALUES (118, 'http://pqz3l17rl.bkt.clouddn.com/xb9.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/xb9.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/xb9.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/xb9.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/xb9.5.jpg');
INSERT INTO `image` VALUES (119, 'http://pqz3l17rl.bkt.clouddn.com/xb10.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/xb10.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/xb10.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/xb10.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/xb10.5.jpg');
INSERT INTO `image` VALUES (120, 'http://pqz3l17rl.bkt.clouddn.com/xb11.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/xb11.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/xb11.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/xb11.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/xb11.5.jpg');
INSERT INTO `image` VALUES (121, 'http://pqz3l17rl.bkt.clouddn.com/xb12.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/xb12.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/xb12.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/xb12.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/xb12.5.jpg');
INSERT INTO `image` VALUES (122, 'http://pqz3l17rl.bkt.clouddn.com/xb13.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/xb13.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/xb13.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/xb13.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/xb13.5.jpg');
INSERT INTO `image` VALUES (123, 'http://pqz3l17rl.bkt.clouddn.com/xb14.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/xb14.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/xb14.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/xb14.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/xb14.5.jpg');
INSERT INTO `image` VALUES (124, 'http://pqz3l17rl.bkt.clouddn.com/xb15.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/xb15.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/xb15.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/xb15.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/xb15.5.jpg');
INSERT INTO `image` VALUES (125, 'http://pqz3l17rl.bkt.clouddn.com/xb16.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/xb16.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/xb16.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/xb16.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/xb16.5.jpg');
INSERT INTO `image` VALUES (126, 'http://pqz3l17rl.bkt.clouddn.com/ps1.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/ps1.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/ps1.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/ps1.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/ps1.5.jpg');
INSERT INTO `image` VALUES (127, 'http://pqz3l17rl.bkt.clouddn.com/ps2.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/ps2.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/ps2.5.jpg', 'http://pqz3l17rl.bkt.clouddn.com/ps2.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/ps2.5.jpg');
INSERT INTO `image` VALUES (128, 'http://pqz3l17rl.bkt.clouddn.com/ps3.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/ps3.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/ps3.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/ps3.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/ps3.5.jpg');
INSERT INTO `image` VALUES (129, 'http://pqz3l17rl.bkt.clouddn.com/ps4.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/ps4.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/ps4.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/ps4.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/ps4.5.jpg');
INSERT INTO `image` VALUES (130, 'http://pqz3l17rl.bkt.clouddn.com/ps5.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/ps5.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/ps5.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/ps5.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/ps5.5.jpg');
INSERT INTO `image` VALUES (131, 'http://pqz3l17rl.bkt.clouddn.com/ps6.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/ps6.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/ps6.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/ps6.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/ps6.5.jpg');
INSERT INTO `image` VALUES (132, 'http://pqz3l17rl.bkt.clouddn.com/ps7.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/ps7.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/ps7.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/ps7.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/ps7.5.jpg');
INSERT INTO `image` VALUES (133, 'http://pqz3l17rl.bkt.clouddn.com/ps8.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/ps8.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/ps8.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/ps8.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/ps8.5.jpg');
INSERT INTO `image` VALUES (134, 'http://pqz3l17rl.bkt.clouddn.com/ps9.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/ps9.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/ps9.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/ps9.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/ps9.5.jpg');
INSERT INTO `image` VALUES (135, 'http://pqz3l17rl.bkt.clouddn.com/ps10.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/ps10.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/ps10.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/ps10.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/ps10.5.jpg');
INSERT INTO `image` VALUES (136, 'http://pqz3l17rl.bkt.clouddn.com/ps11.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/ps11.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/ps11.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/ps11.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/ps11.5.jpg');
INSERT INTO `image` VALUES (137, 'http://pqz3l17rl.bkt.clouddn.com/ps12.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/ps12.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/ps12.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/ps12.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/ps12.5.jpg');
INSERT INTO `image` VALUES (138, 'http://pqz3l17rl.bkt.clouddn.com/ps13.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/ps13.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/ps13.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/ps13.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/ps13.5.jpg');
INSERT INTO `image` VALUES (139, 'http://pqz3l17rl.bkt.clouddn.com/ps14.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/ps14.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/ps14.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/ps14.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/ps14.5.jpg');
INSERT INTO `image` VALUES (140, 'http://pqz3l17rl.bkt.clouddn.com/ps15.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/ps15.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/ps15.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/ps15.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/ps15.5.jpg');
INSERT INTO `image` VALUES (141, 'http://pqz3l17rl.bkt.clouddn.com/ps16.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/ps16.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/ps16.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/ps16.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/ps16.5.jpg');
INSERT INTO `image` VALUES (142, 'http://pqz3l17rl.bkt.clouddn.com/ps17.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/ps17.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/ps17.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/ps17.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/ps17.5.jpg');
INSERT INTO `image` VALUES (143, 'http://pqz3l17rl.bkt.clouddn.com/ps18.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/ps18.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/ps18.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/ps18.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/ps18.5.jpg');
INSERT INTO `image` VALUES (144, 'http://pqz3l17rl.bkt.clouddn.com/ps19.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/ps19.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/ps19.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/ps19.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/ps19.5.jpg');
INSERT INTO `image` VALUES (145, 'http://pqz3l17rl.bkt.clouddn.com/ps20.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/ps20.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/ps20.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/ps20.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/ps20.5.jpg');
INSERT INTO `image` VALUES (146, 'http://pqz3l17rl.bkt.clouddn.com/sy1.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/sy1.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/sy1.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/sy1.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/sy1.5.jpg');
INSERT INTO `image` VALUES (147, 'http://pqz3l17rl.bkt.clouddn.com/sy2.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/sy2.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/sy2.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/sy2.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/sy2.5.jpg');
INSERT INTO `image` VALUES (148, 'http://pqz3l17rl.bkt.clouddn.com/sy3.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/sy3.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/sy3.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/sy3.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/sy3.5.jpg');
INSERT INTO `image` VALUES (149, 'http://pqz3l17rl.bkt.clouddn.com/sy4.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/sy4.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/sy4.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/sy4.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/sy4.5.jpg');
INSERT INTO `image` VALUES (150, 'http://pqz3l17rl.bkt.clouddn.com/sy5.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/sy5.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/sy5.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/sy5.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/sy5.5.jpg');
INSERT INTO `image` VALUES (151, 'http://pqz3l17rl.bkt.clouddn.com/sy6.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/sy6.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/sy6.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/sy6.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/sy6.5.jpg');
INSERT INTO `image` VALUES (152, 'http://pqz3l17rl.bkt.clouddn.com/sy7.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/sy7.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/sy7.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/sy7.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/sy7.5.jpg');
INSERT INTO `image` VALUES (153, 'http://pqz3l17rl.bkt.clouddn.com/sy8.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/sy8.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/sy8.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/sy8.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/sy8.5.jpg');
INSERT INTO `image` VALUES (154, 'http://pqz3l17rl.bkt.clouddn.com/sy9.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/sy9.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/sy9.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/sy9.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/sy9.5.jpg');
INSERT INTO `image` VALUES (155, 'http://pqz3l17rl.bkt.clouddn.com/sy10.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/sy10.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/sy10.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/sy10.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/sy10.5.jpg');
INSERT INTO `image` VALUES (156, 'http://pqz3l17rl.bkt.clouddn.com/sy11.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/sy11.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/sy11.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/sy11.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/sy11.5.jpg');
INSERT INTO `image` VALUES (157, 'http://pqz3l17rl.bkt.clouddn.com/sy12.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/sy12.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/sy12.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/sy12.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/sy12.5.jpg');
INSERT INTO `image` VALUES (158, 'http://pqz3l17rl.bkt.clouddn.com/sy13.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/sy13.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/sy13.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/sy13.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/sy13.5.jpg');
INSERT INTO `image` VALUES (159, 'http://pqz3l17rl.bkt.clouddn.com/sy14.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/sy14.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/sy14.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/sy14.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/sy14.5.jpg');
INSERT INTO `image` VALUES (160, 'http://pqz3l17rl.bkt.clouddn.com/sy15.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/sy15.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/sy15.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/sy15.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/sy15.5.jpg');
INSERT INTO `image` VALUES (161, 'http://pqz3l17rl.bkt.clouddn.com/sy16.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/sy16.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/sy16.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/sy16.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/sy16.5.jpg');
INSERT INTO `image` VALUES (162, 'http://pqz3l17rl.bkt.clouddn.com/sy17.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/sy17.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/sy17.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/sy17.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/sy17.5.jpg');
INSERT INTO `image` VALUES (163, 'http://pqz3l17rl.bkt.clouddn.com/sy18.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/sy18.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/sy18.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/sy18.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/sy18.5.jpg');
INSERT INTO `image` VALUES (164, 'http://pqz3l17rl.bkt.clouddn.com/sy19.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/sy19.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/sy19.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/sy19.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/sy19.5.jpg');
INSERT INTO `image` VALUES (165, 'http://pqz3l17rl.bkt.clouddn.com/sy20.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/sy20.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/sy20.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/sy20.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/sy20.5.jpg');
INSERT INTO `image` VALUES (167, 'http://pqz3l17rl.bkt.clouddn.com/tz1.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/tz1.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/tz1.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/tz1.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/tz1.5.jpg');
INSERT INTO `image` VALUES (168, 'http://pqz3l17rl.bkt.clouddn.com/tz2.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/tz2.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/tz2.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/tz2.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/tz2.5.jpg');
INSERT INTO `image` VALUES (169, 'http://pqz3l17rl.bkt.clouddn.com/tz3.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/tz3.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/tz3.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/tz3.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/tz3.5.jpg');
INSERT INTO `image` VALUES (170, 'http://pqz3l17rl.bkt.clouddn.com/tz4.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/tz4.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/tz4.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/tz4.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/tz4.5.jpg');
INSERT INTO `image` VALUES (171, 'http://pqz3l17rl.bkt.clouddn.com/tz5.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/tz5.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/tz5.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/tz5.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/tz5.5.jpg');
INSERT INTO `image` VALUES (172, 'http://pqz3l17rl.bkt.clouddn.com/tz12.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/tz12.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/tz12.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/tz12.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/tz12.5.jpg');
INSERT INTO `image` VALUES (173, 'http://pqz3l17rl.bkt.clouddn.com/tz13.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/tz13.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/tz13.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/tz13.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/tz13.5.jpg');
INSERT INTO `image` VALUES (174, 'http://pqz3l17rl.bkt.clouddn.com/tz14.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/tz14.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/tz14.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/tz14.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/tz14.5.jpg');
INSERT INTO `image` VALUES (175, 'http://pqz3l17rl.bkt.clouddn.com/tz15.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/tz15.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/tz15.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/tz15.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/tz15.5.jpg');
INSERT INTO `image` VALUES (176, 'http://pqz3l17rl.bkt.clouddn.com/tz16.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/tz16.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/tz16.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/tz16.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/tz16.5.jpg');
INSERT INTO `image` VALUES (177, 'http://pqz3l17rl.bkt.clouddn.com/tz17.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/tz17.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/tz17.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/tz17.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/tz17.5.jpg');
INSERT INTO `image` VALUES (178, 'http://pqz3l17rl.bkt.clouddn.com/tz18.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/tz18.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/tz18.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/tz18.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/tz18.5.jpg');
INSERT INTO `image` VALUES (179, 'http://pqz3l17rl.bkt.clouddn.com/tz19.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/tz19.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/tz19.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/tz19.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/tz19.5.jpg');
INSERT INTO `image` VALUES (180, 'http://pqz3l17rl.bkt.clouddn.com/tz20.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/tz20.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/tz20.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/tz20.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/tz20.5.jpg');
INSERT INTO `image` VALUES (181, 'http://pqz3l17rl.bkt.clouddn.com/tz21.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/tz21.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/tz21.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/tz21.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/tz21.5.jpg');
INSERT INTO `image` VALUES (182, 'http://pqz3l17rl.bkt.clouddn.com/tz22.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/tz22.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/tz22.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/tz22.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/tz22.5.jpg');
INSERT INTO `image` VALUES (183, 'http://pqz3l17rl.bkt.clouddn.com/tz23.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/tz23.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/tz23.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/tz23.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/tz23.5.jpg');
INSERT INTO `image` VALUES (184, 'http://pqz3l17rl.bkt.clouddn.com/tz24.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/tz24.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/tz24.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/tz24.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/tz24.5.jpg');
INSERT INTO `image` VALUES (185, 'http://pqz3l17rl.bkt.clouddn.com/tz25.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/tz25.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/tz25.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/tz25.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/tz25.5.jpg');
INSERT INTO `image` VALUES (186, 'http://pqz3l17rl.bkt.clouddn.com/tz26.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/tz26.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/tz26.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/tz26.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/tz26.5.jpg');
INSERT INTO `image` VALUES (187, 'http://pqz3l17rl.bkt.clouddn.com/tz27.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/tz27.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/tz27.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/tz27.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/tz27.5.jpg');
INSERT INTO `image` VALUES (188, 'http://pqz3l17rl.bkt.clouddn.com/tz28.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/tz28.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/tz28.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/tz28.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/tz28.5.jpg');
INSERT INTO `image` VALUES (189, 'http://pqz3l17rl.bkt.clouddn.com/tz29.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/tz29.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/tz29.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/tz29.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/tz29.5.jpg');
INSERT INTO `image` VALUES (190, 'http://pqz3l17rl.bkt.clouddn.com/tz30.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/tz30.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/tz30.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/tz30.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/tz30.5.jpg');
INSERT INTO `image` VALUES (191, 'http://pqz3l17rl.bkt.clouddn.com/tz31.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/tz31.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/tz31.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/tz31.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/tz31.5.jpg');
INSERT INTO `image` VALUES (192, 'http://pqz3l17rl.bkt.clouddn.com/tz32.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/tz32.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/tz32.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/tz32.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/tz32.5.jpg');
INSERT INTO `image` VALUES (193, 'http://pqz3l17rl.bkt.clouddn.com/tz33.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/tz33.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/tz33.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/tz33.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/tz33.5.jpg');
INSERT INTO `image` VALUES (194, 'http://pqz3l17rl.bkt.clouddn.com/tz34.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/tz34.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/tz34.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/tz34.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/tz34.5.jpg');
INSERT INTO `image` VALUES (195, 'http://pqz3l17rl.bkt.clouddn.com/tz35.1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/tz35.2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/tz35.3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/tz35.4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/tz35.5.jpg');
INSERT INTO `image` VALUES (196, 'http://pqz3l17rl.bkt.clouddn.com/shoe1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/shoe1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/shoe1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/shoe1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/shoe1.jpg');
INSERT INTO `image` VALUES (197, 'http://pqz3l17rl.bkt.clouddn.com/shoe2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/shoe2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/shoe2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/shoe2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/shoe2.jpg');
INSERT INTO `image` VALUES (198, 'http://pqz3l17rl.bkt.clouddn.com/shoe3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/shoe3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/shoe3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/shoe3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/shoe3.jpg');
INSERT INTO `image` VALUES (199, 'http://pqz3l17rl.bkt.clouddn.com/shoe4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/shoe4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/shoe4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/shoe4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/shoe4.jpg');
INSERT INTO `image` VALUES (200, 'http://pqz3l17rl.bkt.clouddn.com/shoe5.jpg', 'http://pqz3l17rl.bkt.clouddn.com/shoe5.jpg', 'http://pqz3l17rl.bkt.clouddn.com/shoe5.jpg', 'http://pqz3l17rl.bkt.clouddn.com/shoe5.jpg', 'http://pqz3l17rl.bkt.clouddn.com/shoe5.jpg');
INSERT INTO `image` VALUES (201, 'http://pqz3l17rl.bkt.clouddn.com/shoe6.jpg', 'http://pqz3l17rl.bkt.clouddn.com/shoe6.jpg', 'http://pqz3l17rl.bkt.clouddn.com/shoe6.jpg', 'http://pqz3l17rl.bkt.clouddn.com/shoe6.jpg', 'http://pqz3l17rl.bkt.clouddn.com/shoe6.jpg');
INSERT INTO `image` VALUES (202, 'http://pqz3l17rl.bkt.clouddn.com/shoe7.jpg', 'http://pqz3l17rl.bkt.clouddn.com/shoe7.jpg', 'http://pqz3l17rl.bkt.clouddn.com/shoe7.jpg', 'http://pqz3l17rl.bkt.clouddn.com/shoe7.jpg', 'http://pqz3l17rl.bkt.clouddn.com/shoe7.jpg');
INSERT INTO `image` VALUES (203, 'http://pqz3l17rl.bkt.clouddn.com/cloth1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/cloth1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/cloth1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/cloth1.jpg', 'http://pqz3l17rl.bkt.clouddn.com/cloth1.jpg');
INSERT INTO `image` VALUES (204, 'http://pqz3l17rl.bkt.clouddn.com/cloth2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/cloth2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/cloth2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/cloth2.jpg', 'http://pqz3l17rl.bkt.clouddn.com/cloth2.jpg');
INSERT INTO `image` VALUES (205, 'http://pqz3l17rl.bkt.clouddn.com/cloth3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/cloth3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/cloth3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/cloth3.jpg', 'http://pqz3l17rl.bkt.clouddn.com/cloth3.jpg');
INSERT INTO `image` VALUES (206, 'http://pqz3l17rl.bkt.clouddn.com/cloth4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/cloth4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/cloth4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/cloth4.jpg', 'http://pqz3l17rl.bkt.clouddn.com/cloth4.jpg');
INSERT INTO `image` VALUES (207, 'http://pqz3l17rl.bkt.clouddn.com/cloth5.jpg', 'http://pqz3l17rl.bkt.clouddn.com/cloth5.jpg', 'http://pqz3l17rl.bkt.clouddn.com/cloth5.jpg', 'http://pqz3l17rl.bkt.clouddn.com/cloth5.jpg', 'http://pqz3l17rl.bkt.clouddn.com/cloth5.jpg');
INSERT INTO `image` VALUES (208, 'http://pqz3l17rl.bkt.clouddn.com/cloth6.jpg', 'http://pqz3l17rl.bkt.clouddn.com/cloth6.jpg', 'http://pqz3l17rl.bkt.clouddn.com/cloth6.jpg', 'http://pqz3l17rl.bkt.clouddn.com/cloth6.jpg', 'http://pqz3l17rl.bkt.clouddn.com/cloth6.jpg');
INSERT INTO `image` VALUES (209, 'http://pqz3l17rl.bkt.clouddn.com/cloth7.jpg', 'http://pqz3l17rl.bkt.clouddn.com/cloth7.jpg', 'http://pqz3l17rl.bkt.clouddn.com/cloth7.jpg', 'http://pqz3l17rl.bkt.clouddn.com/cloth7.jpg', 'http://pqz3l17rl.bkt.clouddn.com/cloth7.jpg');
INSERT INTO `image` VALUES (220, 'http://pqz3l17rl.bkt.clouddn.com/FgNps9U33nYmsC7lYcg72oPk3wBe', 'http://pqz3l17rl.bkt.clouddn.com/FmFuWfJjrF_XweJISNPA8ntELzIJ', 'http://pqz3l17rl.bkt.clouddn.com/FuoJHa5VnNMjRjOD_Kjap-un69Jz', 'http://pqz3l17rl.bkt.clouddn.com/Ft2rwLjITRa44S5yASQmmSSlls1r', 'http://pqz3l17rl.bkt.clouddn.com/Fi7DlYtIFkcoJjqAzI2xN3wdFixG');
INSERT INTO `image` VALUES (221, 'http://pqz3l17rl.bkt.clouddn.com/Fv9I7jKe34HUzB3oq48w3a8PLjAe', 'http://pqz3l17rl.bkt.clouddn.com/FkfllkfHgUDqM8ud-6frV-vY2wT2', 'http://pqz3l17rl.bkt.clouddn.com/FtFu9gJ8t8Pa4Lf9OZVCksmXkoXy', 'http://pqz3l17rl.bkt.clouddn.com/Fg7jAfxIC10ltXoDzrfYbxX_IQr_', 'http://pqz3l17rl.bkt.clouddn.com/Fo2Pk_Ov4LHShT-Qaaxqhx0xUIka');
INSERT INTO `image` VALUES (222, 'http://pqz3l17rl.bkt.clouddn.com/Fr8tGsniFSBWRsbDJkA3fEbJ5qL1', 'http://pqz3l17rl.bkt.clouddn.com/FkCNwk0Awc6X2fST0f-4av5p7CC2', 'http://pqz3l17rl.bkt.clouddn.com/FjljMscw5SzAn_ovTb6QK74RLhS8', 'http://pqz3l17rl.bkt.clouddn.com/Fg7jAfxIC10ltXoDzrfYbxX_IQr_', 'http://pqz3l17rl.bkt.clouddn.com/FkL5bKcWlw7LFugH-RnIN9xPkn2d');
INSERT INTO `image` VALUES (223, 'http://pqz3l17rl.bkt.clouddn.com/Fqbd-gvbTSPHbai8J6jY1aFps165', 'http://pqz3l17rl.bkt.clouddn.com/FjhgFbmEgVnWZUF2eitM7DJVUlzQ', 'http://pqz3l17rl.bkt.clouddn.com/FvTZDS8QzmsTZbevPjiPrazxI7na', 'http://pqz3l17rl.bkt.clouddn.com/Fm57mP_Kdn1rydNOy5Dzn_QF-9Vh', 'http://pqz3l17rl.bkt.clouddn.com/FuvxdTO-SBT1c4izCQ33J188LY-p');
INSERT INTO `image` VALUES (224, 'http://pqz3l17rl.bkt.clouddn.com/Fj8TA6ye3nIJO1XsOMCoHO4_gsBz', NULL, NULL, NULL, NULL);
INSERT INTO `image` VALUES (226, 'http://pqz3l17rl.bkt.clouddn.com/FhNdWyyc1c7t5B_rex_c6r2o_dKL', 'http://pqz3l17rl.bkt.clouddn.com/FlBG76skEcYfvKEqUQlwYNdoiU74', 'http://pqz3l17rl.bkt.clouddn.com/FvxHO7c1zqCiWrOj8wncdCo3iu1n', 'http://pqz3l17rl.bkt.clouddn.com/FiLYi2wT-FjHG5hjqJQ3dY_BxjEx', 'http://pqz3l17rl.bkt.clouddn.com/Fgl_Kf-99RnXzRmVSslB3SwL1tpD');
INSERT INTO `image` VALUES (227, 'http://pqz3l17rl.bkt.clouddn.com/FmBH4AGU2WhooaqqNyD1Bp0Ppqr6', NULL, NULL, NULL, NULL);

-- ----------------------------
-- Table structure for markbuy
-- ----------------------------
DROP TABLE IF EXISTS `markbuy`;
CREATE TABLE `markbuy`  (
  `markId` int(11) NOT NULL AUTO_INCREMENT,
  `userId` int(11) NULL DEFAULT NULL,
  `goodsId` int(11) NULL DEFAULT NULL,
  `num` int(11) NULL DEFAULT NULL,
  `markdate` datetime(0) NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP(0),
  `marks` int(20) NULL DEFAULT NULL,
  PRIMARY KEY (`markId`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 8 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of markbuy
-- ----------------------------
INSERT INTO `markbuy` VALUES (4, 25, 18, 1, '2018-11-11 21:42:12', -300);
INSERT INTO `markbuy` VALUES (5, 25, 41, 2, '2018-11-11 21:42:12', 100);
INSERT INTO `markbuy` VALUES (6, 25, 146, 3, '2018-11-11 21:42:12', 75);
INSERT INTO `markbuy` VALUES (7, 25, 80, 3, '2018-11-12 09:15:04', 156);

-- ----------------------------
-- Table structure for mater
-- ----------------------------
DROP TABLE IF EXISTS `mater`;
CREATE TABLE `mater`  (
  `materId` int(10) NOT NULL AUTO_INCREMENT,
  ` mater` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '材质',
  PRIMARY KEY (`materId`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '材质表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for myfoot
-- ----------------------------
DROP TABLE IF EXISTS `myfoot`;
CREATE TABLE `myfoot`  (
  `footId` int(10) NOT NULL AUTO_INCREMENT,
  `userId` int(10) NOT NULL COMMENT '用户id',
  `goodsId` int(10) NOT NULL COMMENT '商品id',
  `footdate` datetime(0) NOT NULL COMMENT '创建时间',
  PRIMARY KEY (`footId`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 43 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '我的足迹表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of myfoot
-- ----------------------------
INSERT INTO `myfoot` VALUES (1, 2, 1, '2018-11-28 14:24:03');
INSERT INTO `myfoot` VALUES (19, 25, 19, '2018-11-03 11:17:50');
INSERT INTO `myfoot` VALUES (20, 25, 14, '2018-11-12 15:28:20');
INSERT INTO `myfoot` VALUES (21, 25, 20, '2018-11-12 16:22:24');
INSERT INTO `myfoot` VALUES (22, 25, 15, '2018-11-11 19:39:58');
INSERT INTO `myfoot` VALUES (40, 25, 174, '2018-11-11 18:49:59');
INSERT INTO `myfoot` VALUES (41, 25, 117, '2018-11-11 18:50:39');
INSERT INTO `myfoot` VALUES (42, 25, 5, '2019-05-07 10:54:25');

-- ----------------------------
-- Table structure for myvolume
-- ----------------------------
DROP TABLE IF EXISTS `myvolume`;
CREATE TABLE `myvolume`  (
  `myvolumeid` int(10) NOT NULL AUTO_INCREMENT COMMENT '我的优惠券id',
  `Volumeid` int(10) NULL DEFAULT NULL COMMENT '优惠券id',
  `userId` int(20) NULL DEFAULT NULL COMMENT '用户id',
  PRIMARY KEY (`myvolumeid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 74 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '我的优惠券' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of myvolume
-- ----------------------------
INSERT INTO `myvolume` VALUES (22, 22, 25);
INSERT INTO `myvolume` VALUES (55, 10, 25);
INSERT INTO `myvolume` VALUES (59, 14, 25);
INSERT INTO `myvolume` VALUES (61, 27, 25);
INSERT INTO `myvolume` VALUES (63, 1, 25);
INSERT INTO `myvolume` VALUES (64, 2, 25);
INSERT INTO `myvolume` VALUES (65, 5, 25);
INSERT INTO `myvolume` VALUES (66, 6, 25);
INSERT INTO `myvolume` VALUES (67, 8, 25);
INSERT INTO `myvolume` VALUES (68, 9, 25);
INSERT INTO `myvolume` VALUES (69, 7, 25);
INSERT INTO `myvolume` VALUES (70, 21, 25);
INSERT INTO `myvolume` VALUES (71, 13, 25);
INSERT INTO `myvolume` VALUES (72, 19, 25);
INSERT INTO `myvolume` VALUES (73, 20, 25);

-- ----------------------------
-- Table structure for order
-- ----------------------------
DROP TABLE IF EXISTS `order`;
CREATE TABLE `order`  (
  `orderId` int(10) NOT NULL AUTO_INCREMENT,
  `userId` int(10) NOT NULL COMMENT '用户id',
  `orderState` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '订单状态',
  `addressId` int(10) NULL DEFAULT NULL COMMENT '地址编号',
  `orderNum` int(18) NULL DEFAULT NULL,
  `volumeid` int(255) NULL DEFAULT NULL,
  `ordermark` int(50) NULL DEFAULT NULL,
  `orderCreateTime` datetime(0) NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP(0),
  PRIMARY KEY (`orderId`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 215 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '订单' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of order
-- ----------------------------
INSERT INTO `order` VALUES (1, 1, '待付款', 1, 0, NULL, 1, '2018-10-20 00:00:00');
INSERT INTO `order` VALUES (2, 1, '待收货', 1, 1, NULL, 5, '2018-11-12 09:17:42');
INSERT INTO `order` VALUES (3, 1, '待收货', 1, 2, NULL, NULL, '2018-10-20 00:00:00');
INSERT INTO `order` VALUES (4, 1, '待评价', 1, 3, NULL, 5, '2018-10-20 00:00:00');
INSERT INTO `order` VALUES (5, 1, '待付款', 1, 4, NULL, 4455, '2018-10-20 00:00:00');
INSERT INTO `order` VALUES (149, 25, '待发货', 17, 71228, 7, 20, '2018-10-20 00:00:00');
INSERT INTO `order` VALUES (150, 25, '待付款', 17, 29763, 19, 20, '2018-10-20 00:00:00');
INSERT INTO `order` VALUES (152, 25, '退货完成', 17, 54352, NULL, 20, '2018-11-10 15:17:53');
INSERT INTO `order` VALUES (154, 25, '待付款', 17, 38011, 5, 10, '2018-10-20 00:00:00');
INSERT INTO `order` VALUES (175, 25, '待发货', 19, 84542, 2, 35, '2018-11-10 10:00:36');
INSERT INTO `order` VALUES (212, 25, '待付款', 17, 97875, 26, NULL, '2018-11-12 18:08:10');
INSERT INTO `order` VALUES (213, 25, '待发货', 19, 75148, 25, NULL, '2018-11-12 18:18:02');
INSERT INTO `order` VALUES (214, 25, '待付款', 19, 4546, 3, NULL, '2018-11-14 15:06:50');

-- ----------------------------
-- Table structure for orderaddress
-- ----------------------------
DROP TABLE IF EXISTS `orderaddress`;
CREATE TABLE `orderaddress`  (
  `orderAddressId` int(1) NOT NULL,
  `address` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `orderId` int(10) NULL DEFAULT NULL,
  PRIMARY KEY (`orderAddressId`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of orderaddress
-- ----------------------------
INSERT INTO `orderaddress` VALUES (1, '上海东方明珠塔', 1);
INSERT INTO `orderaddress` VALUES (2, '苏州', 2);
INSERT INTO `orderaddress` VALUES (3, '上海', 6);
INSERT INTO `orderaddress` VALUES (4, '上海', 3);

-- ----------------------------
-- Table structure for orderdetails
-- ----------------------------
DROP TABLE IF EXISTS `orderdetails`;
CREATE TABLE `orderdetails`  (
  `orderDetailId` int(10) NOT NULL AUTO_INCREMENT,
  `orderId` int(10) NOT NULL COMMENT '订单id',
  `goodsid` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '商品id',
  `orderGoodsNum` int(10) NULL DEFAULT NULL COMMENT '数量',
  `isEvaluate` int(20) NULL DEFAULT 1,
  PRIMARY KEY (`orderDetailId`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 268 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '订单详情' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of orderdetails
-- ----------------------------
INSERT INTO `orderdetails` VALUES (1, 1, '1', 1, 1);
INSERT INTO `orderdetails` VALUES (2, 1, '6', 1, 1);
INSERT INTO `orderdetails` VALUES (3, 2, '2', 2, 1);
INSERT INTO `orderdetails` VALUES (4, 1, '5', 1, 1);
INSERT INTO `orderdetails` VALUES (5, 1, '8', 1, 1);
INSERT INTO `orderdetails` VALUES (6, 1, '9', 4, 1);
INSERT INTO `orderdetails` VALUES (7, 1, '22', 9, 1);
INSERT INTO `orderdetails` VALUES (8, 2, '45', 1, 1);
INSERT INTO `orderdetails` VALUES (46, 25, '13', 4, 1);
INSERT INTO `orderdetails` VALUES (47, 25, '15', 3, 1);
INSERT INTO `orderdetails` VALUES (48, 26, '13', 4, 1);
INSERT INTO `orderdetails` VALUES (49, 26, '15', 3, 1);
INSERT INTO `orderdetails` VALUES (50, 27, '10', 5, 1);
INSERT INTO `orderdetails` VALUES (51, 28, '3', 1, 1);
INSERT INTO `orderdetails` VALUES (52, 29, '8', 7, 1);
INSERT INTO `orderdetails` VALUES (53, 30, '2', 1, 0);
INSERT INTO `orderdetails` VALUES (54, 31, '6', 1, 0);
INSERT INTO `orderdetails` VALUES (55, 31, '5', 1, 0);
INSERT INTO `orderdetails` VALUES (56, 31, '15', 1, 0);
INSERT INTO `orderdetails` VALUES (57, 32, '134', 1, 1);
INSERT INTO `orderdetails` VALUES (58, 32, '155', 1, 1);
INSERT INTO `orderdetails` VALUES (59, 33, '24', 1, 1);
INSERT INTO `orderdetails` VALUES (60, 33, '22', 1, 1);
INSERT INTO `orderdetails` VALUES (61, 34, '6', 1, 1);
INSERT INTO `orderdetails` VALUES (62, 35, '197', 1, 1);
INSERT INTO `orderdetails` VALUES (63, 35, '196', 1, 1);
INSERT INTO `orderdetails` VALUES (64, 36, '59', 1, 1);
INSERT INTO `orderdetails` VALUES (65, 36, '8', 3, 1);
INSERT INTO `orderdetails` VALUES (66, 36, '10', 2, 1);
INSERT INTO `orderdetails` VALUES (67, 37, '11', 2, 1);
INSERT INTO `orderdetails` VALUES (68, 37, '10', 3, 1);
INSERT INTO `orderdetails` VALUES (69, 37, '80', 2, 1);
INSERT INTO `orderdetails` VALUES (70, 38, '6', 1, 1);
INSERT INTO `orderdetails` VALUES (71, 39, '9', 5, 1);
INSERT INTO `orderdetails` VALUES (72, 40, '9', 3, 1);
INSERT INTO `orderdetails` VALUES (73, 41, '8', 3, 1);
INSERT INTO `orderdetails` VALUES (74, 42, '10', 5, 1);
INSERT INTO `orderdetails` VALUES (75, 43, '10', 6, 1);
INSERT INTO `orderdetails` VALUES (76, 43, '12', 1, 1);
INSERT INTO `orderdetails` VALUES (77, 44, '8', 3, 1);
INSERT INTO `orderdetails` VALUES (78, 45, '14', 1, 1);
INSERT INTO `orderdetails` VALUES (79, 46, '12', 1, 1);
INSERT INTO `orderdetails` VALUES (80, 47, '111', 6, 1);
INSERT INTO `orderdetails` VALUES (81, 48, '201', 6, 1);
INSERT INTO `orderdetails` VALUES (82, 49, '15', 1, 1);
INSERT INTO `orderdetails` VALUES (83, 50, '169', 5, 1);
INSERT INTO `orderdetails` VALUES (84, 51, '181', 1, 1);
INSERT INTO `orderdetails` VALUES (85, 52, '185', 1, 1);
INSERT INTO `orderdetails` VALUES (86, 53, '184', 4, 1);
INSERT INTO `orderdetails` VALUES (87, 54, '26', 4, 1);
INSERT INTO `orderdetails` VALUES (88, 55, '23', 4, 1);
INSERT INTO `orderdetails` VALUES (89, 56, '19', 2, 1);
INSERT INTO `orderdetails` VALUES (90, 57, '12', 2, 1);
INSERT INTO `orderdetails` VALUES (91, 58, '183', 1, 1);
INSERT INTO `orderdetails` VALUES (92, 59, '112', 2, 1);
INSERT INTO `orderdetails` VALUES (93, 61, '25', 3, 1);
INSERT INTO `orderdetails` VALUES (94, 62, '79', 1, 1);
INSERT INTO `orderdetails` VALUES (95, 62, '78', 1, 1);
INSERT INTO `orderdetails` VALUES (96, 63, '183', 1, 1);
INSERT INTO `orderdetails` VALUES (97, 64, '37', 1, 1);
INSERT INTO `orderdetails` VALUES (98, 65, '184', 3, 1);
INSERT INTO `orderdetails` VALUES (99, 66, '92', 1, 1);
INSERT INTO `orderdetails` VALUES (100, 67, '28', 3, 1);
INSERT INTO `orderdetails` VALUES (101, 68, '86', 1, 1);
INSERT INTO `orderdetails` VALUES (102, 69, '132', 1, 1);
INSERT INTO `orderdetails` VALUES (103, 70, '170', 1, 1);
INSERT INTO `orderdetails` VALUES (104, 71, '25', 3, 1);
INSERT INTO `orderdetails` VALUES (105, 72, '2', 3, 1);
INSERT INTO `orderdetails` VALUES (106, 73, '6', 3, 1);
INSERT INTO `orderdetails` VALUES (107, 74, '7', 3, 1);
INSERT INTO `orderdetails` VALUES (108, 75, '4', 3, 1);
INSERT INTO `orderdetails` VALUES (109, 76, '5', 3, 1);
INSERT INTO `orderdetails` VALUES (110, 77, '1', 3, 1);
INSERT INTO `orderdetails` VALUES (111, 78, '2', 3, 1);
INSERT INTO `orderdetails` VALUES (112, 79, '1', 3, 1);
INSERT INTO `orderdetails` VALUES (113, 80, '25', 3, 1);
INSERT INTO `orderdetails` VALUES (114, 81, '4', 3, 1);
INSERT INTO `orderdetails` VALUES (115, 82, '5', 3, 1);
INSERT INTO `orderdetails` VALUES (116, 83, '7', 3, 1);
INSERT INTO `orderdetails` VALUES (117, 84, '6', 3, 1);
INSERT INTO `orderdetails` VALUES (118, 85, '4', 3, 1);
INSERT INTO `orderdetails` VALUES (119, 86, '5', 3, 1);
INSERT INTO `orderdetails` VALUES (120, 87, '6', 3, 1);
INSERT INTO `orderdetails` VALUES (121, 88, '7', 3, 1);
INSERT INTO `orderdetails` VALUES (122, 89, '2', 3, 1);
INSERT INTO `orderdetails` VALUES (123, 90, '25', 4, 1);
INSERT INTO `orderdetails` VALUES (124, 91, '1', 4, 1);
INSERT INTO `orderdetails` VALUES (125, 92, '2', 3, 1);
INSERT INTO `orderdetails` VALUES (126, 93, '25', 3, 1);
INSERT INTO `orderdetails` VALUES (127, 93, '4', 4, 1);
INSERT INTO `orderdetails` VALUES (128, 94, '5', 3, 1);
INSERT INTO `orderdetails` VALUES (129, 95, '7', 3, 1);
INSERT INTO `orderdetails` VALUES (130, 96, '6', 3, 1);
INSERT INTO `orderdetails` VALUES (131, 84, '6', 3, 1);
INSERT INTO `orderdetails` VALUES (132, 85, '4', 3, 1);
INSERT INTO `orderdetails` VALUES (133, 86, '5', 3, 1);
INSERT INTO `orderdetails` VALUES (134, 87, '6', 3, 1);
INSERT INTO `orderdetails` VALUES (135, 88, '7', 3, 1);
INSERT INTO `orderdetails` VALUES (136, 89, '2', 3, 1);
INSERT INTO `orderdetails` VALUES (137, 90, '25', 4, 1);
INSERT INTO `orderdetails` VALUES (138, 91, '1', 4, 1);
INSERT INTO `orderdetails` VALUES (139, 92, '2', 3, 1);
INSERT INTO `orderdetails` VALUES (140, 93, '25', 3, 1);
INSERT INTO `orderdetails` VALUES (141, 93, '4', 4, 1);
INSERT INTO `orderdetails` VALUES (142, 97, '23', 3, 1);
INSERT INTO `orderdetails` VALUES (143, 98, '79', 3, 1);
INSERT INTO `orderdetails` VALUES (144, 99, '9', 1, 1);
INSERT INTO `orderdetails` VALUES (145, 101, '11', 3, 1);
INSERT INTO `orderdetails` VALUES (146, 101, '168', 3, 1);
INSERT INTO `orderdetails` VALUES (147, 102, '169', 4, 1);
INSERT INTO `orderdetails` VALUES (148, 103, '77', 3, 1);
INSERT INTO `orderdetails` VALUES (149, 104, '183', 4, 1);
INSERT INTO `orderdetails` VALUES (150, 105, '3', 3, 1);
INSERT INTO `orderdetails` VALUES (151, 106, '3', 1, 1);
INSERT INTO `orderdetails` VALUES (152, 107, '6', 4, 1);
INSERT INTO `orderdetails` VALUES (153, 108, '79', 4, 1);
INSERT INTO `orderdetails` VALUES (154, 109, '86', 4, 1);
INSERT INTO `orderdetails` VALUES (155, 110, '72', 4, 1);
INSERT INTO `orderdetails` VALUES (156, 111, '169', 5, 1);
INSERT INTO `orderdetails` VALUES (157, 112, '37', 4, 1);
INSERT INTO `orderdetails` VALUES (158, 113, '2', 1, 1);
INSERT INTO `orderdetails` VALUES (159, 114, '7', 1, 1);
INSERT INTO `orderdetails` VALUES (160, 115, '7', 1, 1);
INSERT INTO `orderdetails` VALUES (161, 116, '12', 3, 1);
INSERT INTO `orderdetails` VALUES (162, 117, '24', 5, 1);
INSERT INTO `orderdetails` VALUES (163, 118, '178', 5, 1);
INSERT INTO `orderdetails` VALUES (164, 119, '171', 3, 1);
INSERT INTO `orderdetails` VALUES (165, 120, '173', 5, 1);
INSERT INTO `orderdetails` VALUES (166, 121, '37', 2, 0);
INSERT INTO `orderdetails` VALUES (167, 121, '39', 1, 0);
INSERT INTO `orderdetails` VALUES (168, 122, '84', 3, 1);
INSERT INTO `orderdetails` VALUES (169, 123, '173', 4, 1);
INSERT INTO `orderdetails` VALUES (170, 124, '173', 3, 1);
INSERT INTO `orderdetails` VALUES (171, 125, '104', 4, 1);
INSERT INTO `orderdetails` VALUES (172, 126, '12', 1, 1);
INSERT INTO `orderdetails` VALUES (173, 127, '171', 4, 1);
INSERT INTO `orderdetails` VALUES (174, 128, '176', 7, 1);
INSERT INTO `orderdetails` VALUES (175, 129, '169', 4, 1);
INSERT INTO `orderdetails` VALUES (176, 130, '81', 1, 1);
INSERT INTO `orderdetails` VALUES (177, 131, '174', 8, 1);
INSERT INTO `orderdetails` VALUES (178, 132, '81', 15, 1);
INSERT INTO `orderdetails` VALUES (179, 133, '12', 2, 1);
INSERT INTO `orderdetails` VALUES (180, 134, '170', 5, 1);
INSERT INTO `orderdetails` VALUES (181, 135, '54', 5, 1);
INSERT INTO `orderdetails` VALUES (182, 136, '170', 4, 1);
INSERT INTO `orderdetails` VALUES (183, 137, '56', 2, 1);
INSERT INTO `orderdetails` VALUES (184, 138, '2', 3, 1);
INSERT INTO `orderdetails` VALUES (185, 139, '3', 3, 1);
INSERT INTO `orderdetails` VALUES (186, 140, '2', 3, 1);
INSERT INTO `orderdetails` VALUES (187, 141, '9', 5, 1);
INSERT INTO `orderdetails` VALUES (188, 142, '8', 5, 1);
INSERT INTO `orderdetails` VALUES (189, 143, '7', 2, 1);
INSERT INTO `orderdetails` VALUES (190, 144, '3', 3, 1);
INSERT INTO `orderdetails` VALUES (191, 145, '8', 5, 1);
INSERT INTO `orderdetails` VALUES (192, 146, '4', 9, 1);
INSERT INTO `orderdetails` VALUES (193, 147, '7', 3, 1);
INSERT INTO `orderdetails` VALUES (194, 148, '8', 5, 1);
INSERT INTO `orderdetails` VALUES (195, 149, '6', 4, 1);
INSERT INTO `orderdetails` VALUES (196, 150, '6', 4, 1);
INSERT INTO `orderdetails` VALUES (197, 151, '7', 3, 1);
INSERT INTO `orderdetails` VALUES (198, 152, '6', 3, 1);
INSERT INTO `orderdetails` VALUES (199, 153, '11', 3, 1);
INSERT INTO `orderdetails` VALUES (200, 154, '4', 4, 1);
INSERT INTO `orderdetails` VALUES (201, 155, '12', 2, 1);
INSERT INTO `orderdetails` VALUES (202, 156, '6', 4, 1);
INSERT INTO `orderdetails` VALUES (203, 157, '1', 1, 1);
INSERT INTO `orderdetails` VALUES (204, 158, '6', 4, 1);
INSERT INTO `orderdetails` VALUES (205, 159, '6', 3, 1);
INSERT INTO `orderdetails` VALUES (206, 160, '5', 3, 1);
INSERT INTO `orderdetails` VALUES (207, 161, '8', 4, 1);
INSERT INTO `orderdetails` VALUES (208, 162, '10', 5, 1);
INSERT INTO `orderdetails` VALUES (209, 163, '8', 5, 1);
INSERT INTO `orderdetails` VALUES (210, 164, '12', 2, 1);
INSERT INTO `orderdetails` VALUES (211, 165, '11', 8, 1);
INSERT INTO `orderdetails` VALUES (212, 165, '16', 13, 1);
INSERT INTO `orderdetails` VALUES (213, 165, '182', 11, 1);
INSERT INTO `orderdetails` VALUES (214, 166, '115', 1, 1);
INSERT INTO `orderdetails` VALUES (215, 167, '58', 10, 1);
INSERT INTO `orderdetails` VALUES (216, 168, '2', 1, 1);
INSERT INTO `orderdetails` VALUES (217, 169, '7', 1, 1);
INSERT INTO `orderdetails` VALUES (218, 170, '2', 3, 1);
INSERT INTO `orderdetails` VALUES (219, 171, '2', 1, 1);
INSERT INTO `orderdetails` VALUES (220, 172, '2', 1, 1);
INSERT INTO `orderdetails` VALUES (221, 173, '2', 1, 1);
INSERT INTO `orderdetails` VALUES (222, 174, '2', 4, 1);
INSERT INTO `orderdetails` VALUES (223, 174, '3', 1, 1);
INSERT INTO `orderdetails` VALUES (224, 175, '7', 2, 1);
INSERT INTO `orderdetails` VALUES (225, 175, '2', 3, 1);
INSERT INTO `orderdetails` VALUES (226, 176, '7', 4, 1);
INSERT INTO `orderdetails` VALUES (227, 176, '8', 3, 1);
INSERT INTO `orderdetails` VALUES (228, 177, '2', 1, 1);
INSERT INTO `orderdetails` VALUES (229, 178, '16', 5, 1);
INSERT INTO `orderdetails` VALUES (230, 179, '2', 4, 1);
INSERT INTO `orderdetails` VALUES (231, 180, '1', 4, 1);
INSERT INTO `orderdetails` VALUES (232, 181, '36', 1, 1);
INSERT INTO `orderdetails` VALUES (233, 182, '11', 1, 1);
INSERT INTO `orderdetails` VALUES (234, 183, '16', 1, 1);
INSERT INTO `orderdetails` VALUES (235, 183, '36', 1, 1);
INSERT INTO `orderdetails` VALUES (236, 184, '64', 3, 1);
INSERT INTO `orderdetails` VALUES (237, 185, '52', 1, 1);
INSERT INTO `orderdetails` VALUES (238, 186, '52', 4, 1);
INSERT INTO `orderdetails` VALUES (239, 187, '136', 1, 1);
INSERT INTO `orderdetails` VALUES (240, 188, '174', 1, 1);
INSERT INTO `orderdetails` VALUES (241, 189, '117', 1, 1);
INSERT INTO `orderdetails` VALUES (242, 190, '6', 3, 1);
INSERT INTO `orderdetails` VALUES (243, 191, '153', 2, 1);
INSERT INTO `orderdetails` VALUES (244, 192, '14', 2, 1);
INSERT INTO `orderdetails` VALUES (245, 193, '46', 1, 1);
INSERT INTO `orderdetails` VALUES (246, 194, '199', 1, 1);
INSERT INTO `orderdetails` VALUES (247, 195, '80', 4, 1);
INSERT INTO `orderdetails` VALUES (248, 196, '14', 2, 1);
INSERT INTO `orderdetails` VALUES (249, 197, '15', 1, 1);
INSERT INTO `orderdetails` VALUES (250, 198, '7', 1, 1);
INSERT INTO `orderdetails` VALUES (251, 199, '18', 1, 1);
INSERT INTO `orderdetails` VALUES (252, 200, '41', 2, 1);
INSERT INTO `orderdetails` VALUES (253, 200, '146', 3, 1);
INSERT INTO `orderdetails` VALUES (254, 201, '80', 3, 1);
INSERT INTO `orderdetails` VALUES (255, 202, '18', 4, 1);
INSERT INTO `orderdetails` VALUES (256, 203, '16', 6, 1);
INSERT INTO `orderdetails` VALUES (257, 204, '57', 1, 1);
INSERT INTO `orderdetails` VALUES (258, 205, '37', 1, 1);
INSERT INTO `orderdetails` VALUES (259, 206, '176', 1, 1);
INSERT INTO `orderdetails` VALUES (260, 207, '14', 1, 1);
INSERT INTO `orderdetails` VALUES (261, 208, '37', 1, 1);
INSERT INTO `orderdetails` VALUES (262, 209, '96', 2, 1);
INSERT INTO `orderdetails` VALUES (263, 210, '132', 1, 1);
INSERT INTO `orderdetails` VALUES (264, 211, '150', 4, 1);
INSERT INTO `orderdetails` VALUES (265, 212, '21', 3, 1);
INSERT INTO `orderdetails` VALUES (266, 213, '7', 1, 1);
INSERT INTO `orderdetails` VALUES (267, 214, '56', 3, 1);

-- ----------------------------
-- Table structure for preferentialcategories
-- ----------------------------
DROP TABLE IF EXISTS `preferentialcategories`;
CREATE TABLE `preferentialcategories`  (
  `VolumeClassid` int(10) NOT NULL AUTO_INCREMENT,
  `volumeClass` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '优惠券类别',
  PRIMARY KEY (`VolumeClassid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '优惠类别表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for shoesize
-- ----------------------------
DROP TABLE IF EXISTS `shoesize`;
CREATE TABLE `shoesize`  (
  `shoessizeId` int(10) NOT NULL AUTO_INCREMENT,
  ` shoesize` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '鞋子尺寸',
  PRIMARY KEY (`shoessizeId`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '鞋子尺寸表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for specifications
-- ----------------------------
DROP TABLE IF EXISTS `specifications`;
CREATE TABLE `specifications`  (
  `sperId` int(10) NOT NULL AUTO_INCREMENT,
  `colorId` int(10) NOT NULL COMMENT '颜色编号',
  `sizeId` int(10) NOT NULL COMMENT '尺寸编号',
  `shoesizeId` int(10) NOT NULL COMMENT '鞋子尺寸编号',
  `bagesizeId` int(10) NOT NULL COMMENT '箱包尺寸编号',
  `ageid` int(10) NOT NULL COMMENT '童装适配年龄编号',
  `materId` int(10) NOT NULL COMMENT '材质编号',
  PRIMARY KEY (`sperId`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '规格表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for useadress
-- ----------------------------
DROP TABLE IF EXISTS `useadress`;
CREATE TABLE `useadress`  (
  `addressId` bigint(20) NOT NULL COMMENT '地址Id',
  `address` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户地址',
  `addressPhone` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '该地址收货电话',
  `adddressPer` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '收货人',
  `useid` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户Id',
  PRIMARY KEY (`addressId`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '用户地址表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `userId` int(20) NOT NULL AUTO_INCREMENT COMMENT '用户id',
  `userAccount` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户账号',
  `userPwd` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '密码',
  `userVip` int(15) NULL DEFAULT NULL COMMENT 'vip',
  `userCreateTime` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `userName` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '姓名',
  `userSex` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '性别',
  `userEmall` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '邮箱',
  `userBir` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '生日',
  `userTel` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '电话',
  `userPws` int(30) NULL DEFAULT NULL COMMENT '支付密码',
  `userNick` char(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '昵称',
  `userMoney` decimal(18, 2) NULL DEFAULT NULL COMMENT '余额',
  `userinit` int(50) NULL DEFAULT NULL,
  `goodsPicId` int(11) NULL DEFAULT NULL,
  `isJY` int(2) NULL DEFAULT 1,
  PRIMARY KEY (`userId`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 69 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '用户信息表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (1, 'wwwww', '12345', 1, NULL, '张晨雨', '男', '132@qq.com', '2018-10-17', '110', NULL, '张晨雨', NULL, NULL, NULL, 1);
INSERT INTO `user` VALUES (2, NULL, NULL, 0, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 0);
INSERT INTO `user` VALUES (3, NULL, '45432', 1, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 1);
INSERT INTO `user` VALUES (4, NULL, NULL, 1, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 1);
INSERT INTO `user` VALUES (5, 'param', 'param2', 1, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 1);
INSERT INTO `user` VALUES (25, '999999', '999999', 0, NULL, '最终', '男', '12531351351532@qq.con', '2018-10-19', '12342525423', NULL, '固定', NULL, 3762, 224, 1);
INSERT INTO `user` VALUES (68, 'jkl', '111', 1, NULL, NULL, NULL, NULL, NULL, '18379323766', NULL, NULL, NULL, NULL, NULL, 1);

-- ----------------------------
-- Table structure for volume
-- ----------------------------
DROP TABLE IF EXISTS `volume`;
CREATE TABLE `volume`  (
  `Volumeid` int(20) NOT NULL AUTO_INCREMENT,
  `volumeClass` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '优惠卷类别编号',
  `hMoney` int(18) NULL DEFAULT NULL COMMENT '优惠额度',
  `hMoneys` int(18) NULL DEFAULT NULL COMMENT '优惠额度所需金额',
  `hNum` int(18) NULL DEFAULT NULL COMMENT '数量',
  `VolumeDate` datetime(0) NULL DEFAULT NULL COMMENT '截止日期',
  `volumePicId` int(10) NULL DEFAULT NULL,
  PRIMARY KEY (`Volumeid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 34 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '优惠卷表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of volume
-- ----------------------------
INSERT INTO `volume` VALUES (1, '全品类', 3, 39, 32, '2018-11-04 00:00:00', 110);
INSERT INTO `volume` VALUES (2, '全品类', 4, 49, 10, '2018-11-02 14:17:55', 14);
INSERT INTO `volume` VALUES (3, '全品类', 5, 59, 30, '2018-12-30 11:18:10', 45);
INSERT INTO `volume` VALUES (4, '全品类', 8, 69, 32, '2018-11-04 14:18:38', 139);
INSERT INTO `volume` VALUES (5, '全品类', 10, 90, 12, '2018-10-28 14:18:52', 67);
INSERT INTO `volume` VALUES (6, '全品类', 20, 99, 89, '2018-11-01 11:09:52', 140);
INSERT INTO `volume` VALUES (7, '全品类', 20, 99, 67, '2018-11-06 11:11:43', 11);
INSERT INTO `volume` VALUES (8, '全品类', 39, 139, 45, '2018-11-06 11:11:43', 14);
INSERT INTO `volume` VALUES (9, '全品类', 49, 159, 32, '2018-11-06 11:11:43', 45);
INSERT INTO `volume` VALUES (10, '全品类', 55, 169, 43, '2018-11-06 11:11:43', 50);
INSERT INTO `volume` VALUES (11, '全品类', 60, 189, 66, '2018-11-06 11:11:43', 67);
INSERT INTO `volume` VALUES (12, '全品类', 20, 100, 12, '2018-10-08 11:13:39', 51);
INSERT INTO `volume` VALUES (13, '全品类', 66, 259, 32, '2018-11-04 14:17:41', 110);
INSERT INTO `volume` VALUES (14, '全品类', 88, 480, 10, '2018-11-02 14:17:55', 111);
INSERT INTO `volume` VALUES (15, '全品类', 90, 499, 30, '2018-12-30 11:18:10', 123);
INSERT INTO `volume` VALUES (16, '全品类', 99, 699, 12, '2018-10-28 14:18:52', 114);
INSERT INTO `volume` VALUES (17, '全品类', 111, 888, 89, '2018-11-01 11:09:52', 116);
INSERT INTO `volume` VALUES (18, '全品类', 199, 999, 56, '2018-10-31 11:09:52', 117);
INSERT INTO `volume` VALUES (19, '全品类', 222, 1024, 66, '2018-11-06 11:11:43', 130);
INSERT INTO `volume` VALUES (20, '全品类', 259, 1666, 56, '2018-10-29 11:11:43', 144);
INSERT INTO `volume` VALUES (21, '全品类', 299, 1888, 123, '2018-10-31 11:11:43', 141);
INSERT INTO `volume` VALUES (22, '全品类', 310, 2360, 24, '2018-10-30 11:11:43', 137);
INSERT INTO `volume` VALUES (23, '全品类', 388, 2100, 46, '2018-11-06 11:11:43', 139);
INSERT INTO `volume` VALUES (24, '全品类', 33, 1999, 65, '2018-10-27 11:39:35', 140);
INSERT INTO `volume` VALUES (25, '全品类', 50, 200, 24, '2018-10-30 11:11:43', 137);
INSERT INTO `volume` VALUES (26, '全品类', 70, 250, 24, '2018-10-30 11:11:43', 137);
INSERT INTO `volume` VALUES (27, '全品类', 100, 300, 24, '2018-10-30 11:11:43', 137);
INSERT INTO `volume` VALUES (33, '全品类', 50, 250, 55, '2018-11-13 00:00:00', 227);

-- ----------------------------
-- Table structure for weight
-- ----------------------------
DROP TABLE IF EXISTS `weight`;
CREATE TABLE `weight`  (
  `weightId` int(10) NOT NULL AUTO_INCREMENT,
  ` weight` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '重量',
  PRIMARY KEY (`weightId`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '重量表' ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
