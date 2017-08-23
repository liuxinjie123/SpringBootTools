 CREATE TABLE `a_create_code` (
  `id` INT(30) NOT NULL AUTO_INCREMENT,
  `type` INT(6) NOT NULL,
  `name` VARCHAR(10) DEFAULT NULL,
  KEY `type` (`type`,`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COMMENT='generate Code 表';