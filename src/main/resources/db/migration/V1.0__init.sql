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


# 启动外键约束.
SET FOREIGN_KEY_CHECKS = 1;