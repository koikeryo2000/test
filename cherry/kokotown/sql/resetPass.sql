set names utf8;
set foreign_key_checks=0;
drop database if exists kokotown;

create database if not exists kokotown;
use kokotown;

drop table if exists user_info;

create table user_info(
	id int not null primary key auto_increment,		/*ID*/
	user_id varchar(16) not null unique,			/*ユーザーID*/
	password varchar(16) not null,					/*パスワード*/
	family_name varchar(32) not null,				/*姓*/
	first_name varchar(32) not null,				/*名*/
	family_name_kana varchar(32) not null,			/*姓 かな*/
	first_name_kana varchar(32) not null,			/*名 かな*/
	sex tinyint not null default 0,					/*性別 0=男性 1=女性*/
	email varchar(32) not null,
	status tinyint not null default 0,				/*0=無効 1=有効*/
	logined tinyint not null default 0,				/*0=未ログイン 1=ログイン*/
	regist_date datetime not null,
	update_time datetime
);
INSERT INTO user_info(id,user_id,password,family_name,first_name,family_name_kana,first_name_kana,sex,email,status,logined,regist_date)
VALUES(1,"test","pass","test","test","てすと","てすと",0,"test@test.com",0,1,"2018-01-10 10:17:10");
