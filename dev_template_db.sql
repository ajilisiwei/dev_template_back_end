create database `dev_template_db`;
use `dev_template_db`;
DROP TABLE IF EXISTS  `t_city`;
CREATE TABLE `t_city` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT COMMENT '城市编号',
  `province_id` int(10) unsigned  NOT NULL COMMENT '省份编号',
  `city_name` varchar(25) DEFAULT NULL COMMENT '城市名称',
  `description` varchar(25) DEFAULT NULL COMMENT '描述',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

INSERT t_city VALUES (1 ,1,'深圳市','a goog place');


drop table if exists `t_water`;
create table `t_water`(
	`id` int(10) unsigned not null auto_increment comment '降雨量/蒸发量编号',
    `city_id` int(10) unsigned not null comment '城市id',
    `type` int(1) unsigned not null comment '降雨量：1/蒸发量：2',
    `description` varchar(25) default null comment '描述',
    `year` int(6) unsigned not null comment '年份',
    `month` int(2) unsigned not null comment '月份',
    `count` float(8,2) null comment '总量',
    primary key(`id`)
) engine=InnoDB auto_increment=1 default charset=utf8;


insert into dev_template_db.t_water values(1,1,1,'月份降雨量',2017,1,2.3);
insert into dev_template_db.t_water values(2,1,1,'月份降雨量',2017,2,3.4);
insert into dev_template_db.t_water values(3,1,1,'月份降雨量',2017,3,3.5);
insert into dev_template_db.t_water values(4,1,1,'月份降雨量',2017,4,4.0);
insert into dev_template_db.t_water values(5,1,1,'月份降雨量',2017,5,4.3);
insert into dev_template_db.t_water values(6,1,1,'月份降雨量',2017,6,3.4);
insert into dev_template_db.t_water values(7,1,1,'月份降雨量',2017,7,4.9);
insert into dev_template_db.t_water values(8,1,1,'月份降雨量',2017,8,2.3);
insert into dev_template_db.t_water values(9,1,1,'月份降雨量',2017,9,4.3);
insert into dev_template_db.t_water values(10,1,1,'月份降雨量',2017,10,4.5);
insert into dev_template_db.t_water values(11,1,1,'月份降雨量',2017,11,3.5);
insert into dev_template_db.t_water values(12,1,1,'月份降雨量',2017,12,4.5);

insert into dev_template_db.t_water values(13,1,2,'月份蒸发量',2017,1,2.0);
insert into dev_template_db.t_water values(14,1,2,'月份蒸发量',2017,2,2.8);
insert into dev_template_db.t_water values(15,1,2,'月份蒸发量',2017,3,3.0);
insert into dev_template_db.t_water values(16,1,2,'月份蒸发量',2017,4,3.2);
insert into dev_template_db.t_water values(17,1,2,'月份蒸发量',2017,5,3.0);
insert into dev_template_db.t_water values(18,1,2,'月份蒸发量',2017,6,4.3);
insert into dev_template_db.t_water values(19,1,2,'月份蒸发量',2017,7,2.3);
insert into dev_template_db.t_water values(20,1,2,'月份蒸发量',2017,8,4.0);
insert into dev_template_db.t_water values(21,1,2,'月份蒸发量',2017,9,2.3);
insert into dev_template_db.t_water values(22,1,2,'月份蒸发量',2017,10,3.0);
insert into dev_template_db.t_water values(23,1,2,'月份蒸发量',2017,11,3.4);
insert into dev_template_db.t_water values(24,1,2,'月份蒸发量',2017,12,2.3);