DROP TABLE IF EXISTS `mh_user`;
CREATE TABLE `mh_user`
(
    `id` int(11) NOT NULL AUTO_INCREMENT,
    `account` char(16) NOT NULL UNIQUE COMMENT '账户.',
    `password` char(16)  NOT NULL COMMENT '密码.',
    `phone` char(16) COMMENT '电话',
    `address` char(100) COMMENT '地址',
    `gender` char(4) COMMENT '性别',
    `remark` char(50) COMMENT '备注',
    `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `updated_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    PRIMARY KEY (`id`),
    UNIQUE INDEX `unique_account` (`account`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8 COMMENT ='用户表';

DROP TABLE IF EXISTS `mh_ruleUser`;
CREATE TABLE `mh_ruleUser`
(
    `id` int(11) NOT NULL AUTO_INCREMENT,
    `account` char(16) NOT NULL UNIQUE COMMENT '账户.',
    `password` char(16)  NOT NULL COMMENT '密码.',
    `remark` char(50) COMMENT '备注',
    `power` int(11) not null COMMENT '权限',
    `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `updated_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    PRIMARY KEY (`id`),
    UNIQUE INDEX `unique_account` (`account`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8 COMMENT ='管理员表';


DROP TABLE IF EXISTS `mh_userMassage`;
CREATE TABLE `mh_userMassage`
(
    `id` int(11) NOT NULL AUTO_INCREMENT,
    `user_id` int(11)  NOT NULL COMMENT '用户主键.',
    `height` double not null COMMENT '身高',
    `weight` double not null COMMENT '体重',
    `bust` double not null COMMENT '胸围',
    `waist_line` double not null COMMENT '腰围',
    `hip_line` double not null COMMENT '臀围',
    `shoulder_width` double not null COMMENT '肩宽',
    `sleeve_length` double not null COMMENT '袖长',
    `clothing_length` double not null COMMENT '衣长',
    `trousers_length` double not null COMMENT '裤长',
    `updated_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8 COMMENT ='用户信息表';

DROP TABLE IF EXISTS `mh_navbar`;
CREATE TABLE `mh_navbar`
(
    `id` int(11) NOT NULL AUTO_INCREMENT,
    `title` char(12)  NOT NULL COMMENT '标题.',
    `parent_id` int(11) not null default 0 COMMENT '父标题',
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8 COMMENT ='导航栏表';

DROP TABLE IF EXISTS `mh_classification`;
CREATE TABLE `mh_classification`
(
    `id` int(11) NOT NULL AUTO_INCREMENT,
    `nav_id` int(11) not null comment '导航栏关联',
    `title` char(12)  NOT NULL COMMENT '标题.',
    `remark` char(12) not null COMMENT '备注',
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8 COMMENT ='类别导航';

#new
DROP TABLE IF EXISTS `mh_photolocation`;
CREATE TABLE `mh_photolocation`
(
    `id` int(11) NOT NULL AUTO_INCREMENT,
    `class_id` int(11) not null comment '类别关联',
    `location` char(100)  NOT NULL COMMENT '地址.',
    `massage` char(12) not null COMMENT '备注',
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8 COMMENT ='类别图片地址';

DROP TABLE IF EXISTS `mh_homephoto`;
CREATE TABLE `mh_homephoto`
(
    `id` int(11) NOT NULL AUTO_INCREMENT,
    `massage` char(50) not null comment '图片信息',
    `sign` int(11)  NOT NULL COMMENT '图片标识.',
    `location` char(100) not null COMMENT '地址',
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8 COMMENT ='首页图片';

DROP TABLE IF EXISTS `mh_store`;
CREATE TABLE `mh_store`
(
    `id` int(11) NOT NULL AUTO_INCREMENT,
    `name` char(12) not null comment '图片信息',
    `address` char(50) not null comment '地址',
    `address_clear` char(100) not null comment '详细地址',
    `introduction` char(100)  NOT NULL COMMENT '简介.',
    `img_location` char(100) not null COMMENT '图片地址',
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8 COMMENT ='线下门店';

DROP TABLE IF EXISTS `mh_articleclass`;
CREATE TABLE `mh_articleclass`
(
    `id` int(11) NOT NULL AUTO_INCREMENT,
    `class` char(20) not null comment '文章类型',
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8 COMMENT ='文章类型';

DROP TABLE IF EXISTS `mh_article`;
CREATE TABLE `mh_article`
(
    `id` int(11) NOT NULL AUTO_INCREMENT,
    `class_id` int(11) not null comment '文章类型关联',
    `title` char(26) not null comment '文章标题',
    `content` text not null comment '文章内容',
    `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8 COMMENT ='文章';

# 启动外键约束.
SET FOREIGN_KEY_CHECKS = 1;