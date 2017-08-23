CREATE TABLE `a_upload_file_by_user` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `user_code` VARCHAR(30) DEFAULT NULL,
  `file_path` varchar(100) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='上传文件表';