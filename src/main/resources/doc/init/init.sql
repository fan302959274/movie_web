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




-- used in tests that use HSQL
create table oauth_client_details (
  client_id VARCHAR(256) PRIMARY KEY,
  resource_ids VARCHAR(256),
  client_secret VARCHAR(256),
  scope VARCHAR(256),
  authorized_grant_types VARCHAR(256),
  web_server_redirect_uri VARCHAR(256),
  authorities VARCHAR(256),
  access_token_validity INTEGER,
  refresh_token_validity INTEGER,
  additional_information VARCHAR(4096),
  autoapprove VARCHAR(256)
);

create table oauth_client_token (
  token_id VARCHAR(256),
  token blob,
  authentication_id VARCHAR(256) PRIMARY KEY,
  user_name VARCHAR(256),
  client_id VARCHAR(256)
);

create table oauth_access_token (
  token_id VARCHAR(256),
  token blob,
  authentication_id VARCHAR(256) PRIMARY KEY,
  user_name VARCHAR(256),
  client_id VARCHAR(256),
  authentication blob,
  refresh_token VARCHAR(256)
);

create table oauth_refresh_token (
  token_id VARCHAR(256),
  token blob,
  authentication blob
);

create table oauth_code (
  code VARCHAR(256), authentication blob
);

create table oauth_approvals (
  userId VARCHAR(256),
  clientId VARCHAR(256),
  scope VARCHAR(256),
  status VARCHAR(10),
  expiresAt TIMESTAMP,
  lastModifiedAt TIMESTAMP
);


-- customized oauth_client_details table
create table ClientDetails (
  appId VARCHAR(256) PRIMARY KEY,
  resourceIds VARCHAR(256),
  appSecret VARCHAR(256),
  scope VARCHAR(256),
  grantTypes VARCHAR(256),
  redirectUrl VARCHAR(256),
  authorities VARCHAR(256),
  access_token_validity INTEGER,
  refresh_token_validity INTEGER,
  additionalInformation VARCHAR(4096),
  autoApproveScopes VARCHAR(256)
);

