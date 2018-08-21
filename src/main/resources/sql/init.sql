-- schema =>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
create database if not exists ssm_starter default character set utf8 collate utf8_general_ci;
USE ssm_starter;

SET FOREIGN_KEY_CHECKS = 0;

DROP TABLE IF EXISTS `user`;
CREATE TABLE IF NOT EXISTS `user` (
  `id` VARCHAR(255) NOT NULL,
  `username` VARCHAR(255) NOT NULL,
  `password` VARCHAR(255) NOT NULL,
  `create_at` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `create_by` VARCHAR(255) NULL,
  `update_at` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `update_by` VARCHAR(255) NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `user_username_unique_index` (`username` ASC)
) ENGINE = InnoDB COMMENT = '用户表';


DROP TABLE IF EXISTS `role`;
CREATE TABLE IF NOT EXISTS role (
  id VARCHAR(255),
  name VARCHAR(255)
);

DROP TABLE IF EXISTS `user_role`;
CREATE TABLE if NOT EXISTS `user_role` (
  user_id VARCHAR(255),
  role_id VARCHAR(255)
);

SET FOREIGN_KEY_CHECKS = 1;

-- data =>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
-- INSERT INTO `user`
--  (`id`, `username`, `password`, `create_at`, `create_by`, `update_at`, `update_by`)
-- VALUES
--  ('1', 'admin', '{bcrypt}$2a$10$/EkYUGf3dHiiVHfwzC7nD.sTo3gIBR6NuZasmQC71B0GtOREVLEDm', now(), '1', now(), '1');


INSERT INTO `role` (`id`, `name`)
VALUES  ('1', 'admin');

INSERT INTO `user` (`id`, `username`, `password`, `create_at`, `create_by`, `update_at`, `update_by`)
VALUES ('1', 'admin', '{bcrypt}$2a$10$jiBIKWZ4Ar2d8HMUQvAPx..tASOUDiOr9e/J0Eq0PPvp6iF6bZ6AS', now(), NULL, now(), NULL);

INSERT INTO `user_role` (`user_id`, `role_id`)
VALUES  ('1', '1');