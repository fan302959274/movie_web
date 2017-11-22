CREATE TABLE `tbl_param` (
  `id` bigint(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `param_type` varchar(100) DEFAULT NULL COMMENT '参数类型:001(视频类型);002(标签)',
  `param_code` varchar(100) DEFAULT NULL COMMENT '参数code',
  `param_value` varchar(256) DEFAULT NULL COMMENT '参数值',
  `param_url` varchar(1024) DEFAULT NULL COMMENT '参数url',
  `param_desc` varchar(256) DEFAULT NULL COMMENT '参数描述',
  `create_date` timestamp DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_date` timestamp DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP  COMMENT '更新时间',
  `creator` varchar(100) DEFAULT NULL COMMENT '创建人',
  `updator` varchar(100) DEFAULT NULL COMMENT '更新人',
  `is_deleted` varchar(2) DEFAULT '0' COMMENT '是否删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='参数表';

CREATE TABLE `tbl_user` (
  `id` bigint(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `user_name` varchar(100) DEFAULT NULL COMMENT '用户名',
  `user_open_id` varchar(100) DEFAULT NULL COMMENT '用户openid',
  `user_nick_name` varchar(100) DEFAULT NULL COMMENT '用户昵称',
  `user_gender` varchar(10) DEFAULT NULL COMMENT '用户性别',
  `user_city` varchar(100) DEFAULT NULL COMMENT '用户所在城市',
  `user_province` varchar(100) DEFAULT NULL COMMENT '用户所在省',
  `user_country` varchar(100) DEFAULT NULL COMMENT '用户所在国家',
  `user_avatar_url` varchar(256) DEFAULT NULL COMMENT '用户微信头像',
  `user_union_id` varchar(100) DEFAULT NULL COMMENT '用户unionid',
  `user_id` varchar(100) DEFAULT NULL COMMENT '用户id',
  `user_wechat` varchar(100) DEFAULT NULL COMMENT '用户微信号',
  `user_mobile` varchar(256) DEFAULT NULL COMMENT '用户手机号',
  `create_date` timestamp DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_date` timestamp DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP   COMMENT '更新时间',
  `creator` varchar(100) DEFAULT NULL COMMENT '创建人',
  `updator` varchar(100) DEFAULT NULL COMMENT '更新人',
  `is_deleted` varchar(2) DEFAULT '0' COMMENT '是否删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='用户表';

CREATE TABLE `tbl_video` (
  `id` bigint(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `video_name` varchar(256) DEFAULT NULL COMMENT '视频名称',
  `video_introduction` varchar(256) DEFAULT NULL COMMENT '视频简介',
  `video_poster` varchar(256) DEFAULT NULL COMMENT '视频封面的图片资源地址',
  `video_type` varchar(100) DEFAULT NULL COMMENT '视频类型(多个类型以逗号分隔)',
  `video_tag` varchar(100) DEFAULT NULL COMMENT '视频标签',
  `video_view_path` varchar(256) DEFAULT NULL COMMENT '视频观看地址',
  `video_down_path` varchar(256) DEFAULT NULL COMMENT '视频下载地址',
  `video_duration` decimal(20,4) DEFAULT NULL COMMENT '视频时长（min）',
  `video_size` decimal(20,4) DEFAULT NULL COMMENT '视频大小（M）',
  `create_date` timestamp DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_date` timestamp DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP   COMMENT '更新时间',
  `creator` varchar(100) DEFAULT NULL COMMENT '创建人',
  `updator` varchar(100) DEFAULT NULL COMMENT '更新人',
  `is_deleted` varchar(2) DEFAULT '0' COMMENT '是否删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='视频表';


CREATE TABLE `tbl_reply` (
  `id` bigint(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `reply_time` timestamp DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '回复时间',
  `reply_user` varchar(100) DEFAULT NULL COMMENT '回复人',
  `reply_content` varchar(100) DEFAULT NULL COMMENT '回复内容',
  `video_id` varchar(100) DEFAULT NULL COMMENT '回复的视频id',
  `reply_id` varchar(100) DEFAULT NULL COMMENT '回复的回复id（只针对回复的回复）',
  `create_date` timestamp DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_date` timestamp DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP   COMMENT '更新时间',
  `creator` varchar(100) DEFAULT NULL COMMENT '创建人',
  `updator` varchar(100) DEFAULT NULL COMMENT '更新人',
  `is_deleted` varchar(2) DEFAULT '0' COMMENT '是否删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='回复表';


CREATE TABLE `tbl_likes` (
  `id` bigint(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `likes_time` timestamp DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '点赞时间',
  `likes_user` varchar(100) DEFAULT NULL COMMENT '点赞人',
  `video_id` varchar(100) DEFAULT NULL COMMENT '点赞的视频id',
  `create_date` timestamp DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_date` timestamp DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP   COMMENT '更新时间',
  `creator` varchar(100) DEFAULT NULL COMMENT '创建人',
  `updator` varchar(100) DEFAULT NULL COMMENT '更新人',
  `is_deleted` varchar(2) DEFAULT '0' COMMENT '是否删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='点赞表';



/*表结构插入*/
DROP TABLE
IF EXISTS `tbl_auth_permission`;

CREATE TABLE `tbl_auth_permission` (
	`id` BIGINT (20) NOT NULL AUTO_INCREMENT,
	`code` VARCHAR (256) DEFAULT NULL COMMENT '权限对应的code',
	`name` VARCHAR (64) DEFAULT NULL COMMENT '权限对应的描述',
	PRIMARY KEY (`id`)
) ENGINE = INNODB AUTO_INCREMENT = 21 DEFAULT CHARSET = utf8;

/*Table structure for table `u_role` */
DROP TABLE
IF EXISTS `tbl_auth_role`;

CREATE TABLE `tbl_auth_role` (
	`id` BIGINT (20) NOT NULL AUTO_INCREMENT,
	`code` VARCHAR (32) DEFAULT NULL COMMENT '角色code',
	`name` VARCHAR (32) DEFAULT NULL COMMENT '角色名称',
	`type` VARCHAR (10) DEFAULT NULL COMMENT '角色类型',
	PRIMARY KEY (`id`)
) ENGINE = INNODB AUTO_INCREMENT = 5 DEFAULT CHARSET = utf8;

/*Table structure for table `u_role_permission` */
DROP TABLE
IF EXISTS `tbl_auth_role_permission`;

CREATE TABLE `tbl_auth_role_permission` (
	`role_id` BIGINT (20) DEFAULT NULL COMMENT '角色ID',
	`permission_id` BIGINT (20) DEFAULT NULL COMMENT '权限ID'
) ENGINE = INNODB DEFAULT CHARSET = utf8;

/*Table structure for table `u_user` */
DROP TABLE
IF EXISTS `tbl_auth_user`;

CREATE TABLE `tbl_auth_user` (
	`id` BIGINT (20) NOT NULL AUTO_INCREMENT,
	`nickname` VARCHAR (20) DEFAULT NULL COMMENT '用户昵称',
	`email` VARCHAR (128) DEFAULT NULL COMMENT '邮箱|登录帐号',
	`pswd` VARCHAR (32) DEFAULT NULL COMMENT '密码',
	`create_time` datetime DEFAULT NULL COMMENT '创建时间',
	`last_login_time` datetime DEFAULT NULL COMMENT '最后登录时间',
	`status` BIGINT (1) DEFAULT '1' COMMENT '1:有效，0:禁止登录',
	PRIMARY KEY (`id`)
) ENGINE = INNODB AUTO_INCREMENT = 15 DEFAULT CHARSET = utf8;

/*Table structure for table `u_user_role` */
DROP TABLE
IF EXISTS `tbl_auth_user_role`;

CREATE TABLE `tbl_auth_user_role` (
	`user_id` BIGINT (20) DEFAULT NULL COMMENT '用户ID',
	`role_id` BIGINT (20) DEFAULT NULL COMMENT '角色ID'
) ENGINE = INNODB DEFAULT CHARSET = utf8;

