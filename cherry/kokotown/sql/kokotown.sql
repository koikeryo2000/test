set names utf8;
set foreign_key_checks=0;
drop database if exists kokotown;

create database if not exists kokotown;
use kokotown;

drop table if exists m_category;

create table m_category(
	id int primary key not null,					/*ID*/
	category_id int not null unique,				/*カテゴリID*/
	category_name varchar(20) not null unique,		/*カテゴリ名*/
	category_description varchar(100),				/*カテゴリ詳細*/
	insert_date datetime not null,					/*登録日*/
	update_date datetime 							/*更新日*/
);

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

drop table if exists product_info;

create table product_info(
	id int primary key not null auto_increment,
	product_id int not null unique,
	product_name varchar(100) not null unique,
	product_name_kana varchar(100) not null unique,
	product_description varchar(255) not null,
	category_id int not null,
	price int,
	image_file_path varchar(100),
	image_file_name varchar(50),
	release_date datetime not null,
	release_company varchar(50),
	status tinyint not null default 0,				/*0=無効 1=有効*/
	regist_date datetime not null,
	update_date datetime,
	foreign key(category_id) references m_category(category_id)
);

drop table if exists cart_info;

create table cart_info(
	id int primary key not null auto_increment,
	user_id varchar(16), 							/*user_infoのuser_idとfk*/
	temp_user_id varchar(128),
	product_id int not null,						/*product_infoのproduct_idとfk*/
	product_count int not null,
	total_price int not null,
	regist_date datetime not null,
	update_date datetime,
	foreign key(user_id)references user_info(user_id),
	foreign key(product_id)references product_info(product_id)
);

drop table if exists purchase_history_info;

create table purchase_history_info(
	id int primary key not null auto_increment,
	user_id varchar(16) not null,					/*user_infoのuser_idとfk*/
	product_id int not null,						/*product_infoのproduct_idとfk*/
	product_count int not null,
	price int not null,
	regist_date datetime not null,
	update_date datetime,
	foreign key(user_id)references user_info(user_id),
	foreign key(product_id)references product_info(product_id)
);

drop table if exists destination_info;

create table destination_info(
	id int primary key not null auto_increment,
	user_id varchar(16) not null unique,
	family_name varchar(32) not null,
	first_name varchar(32) not null,
	family_name_kana varchar(32) not null,
	first_name_kana varchar(32) not null,
	email varchar(32) not null,
	tel_number varchar(13) not null,
	user_address varchar(50) not null,
	regist_date datetime not null,
	update_date datetime
);

INSERT INTO m_category(id,category_id,category_name,category_description,insert_date)
VALUES(1,101,"本","本カテゴリです","2018-01-08 11:10:10");
INSERT INTO product_info(id,product_id,product_name,product_name_kana,product_description,category_id,price,image_file_path,image_file_name,release_company,release_date,regist_date)
VALUES(1,1,"青い本","あおいほん","ぱっと見は緑です。",101,1000,"./img/bookBlue.jpg","bookBlue.jpg","kokotown.co.ltd","2018-01-08 11:10:10","2018-01-08 11:10:10");
INSERT INTO product_info(id,product_id,product_name,product_name_kana,product_description,category_id,price,image_file_path,image_file_name,release_company,release_date,regist_date)
VALUES(2,2,"赤い本","あかいほん","ぱっと見は赤です。",101,1000,"./img/bookBlue.jpg","bookBlue.jpg","kokotown.co.ltd","2018-01-08 11:10:10","2018-01-08 11:10:10");
INSERT INTO product_info(id,product_id,product_name,product_name_kana,product_description,category_id,price,image_file_path,image_file_name,release_company,release_date,regist_date)
VALUES(3,3,"緑の本","みどりのほん","ぱっと見は緑です。",101,1000,"./img/bookBlue.jpg","bookBlue.jpg","kokotown.co.ltd","2018-01-08 11:10:10","2018-01-08 11:10:10");
