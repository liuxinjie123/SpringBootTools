ALTER TABLE a_upload_file_by_user ADD COLUMN code VARCHAR(30) NOT NULL COMMENT '文件code' AFTER id;
ALTER TABLE a_upload_file_by_user ADD COLUMN name VARCHAR(100) NOT NULL COMMENT '文件名字' AFTER code;
ALTER TABLE a_upload_file_by_user ADD COLUMN file_orig_name VARCHAR(100) NOT NULL COMMENT '文件原名' AFTER name;