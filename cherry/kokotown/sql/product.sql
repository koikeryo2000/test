set names utf8;
set foreign_key_checks=0;

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

INSERT INTO m_category(id,category_id,category_name,category_description,insert_date)
VALUES(1,101,"本","本カテゴリです","2018-01-08 11:10:10");
INSERT INTO m_category(id,category_id,category_name,category_description,insert_date)
VALUES(2,102,"家電・パソコン","家電・パソコンカテゴリです","2018-01-08 11:10:10");
INSERT INTO m_category(id,category_id,category_name,category_description,insert_date)
VALUES(3,103,"おもちゃ・ゲーム","あおもちゃ・ゲームカテゴリです","2018-01-08 11:10:10");



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

INSERT INTO product_info(id,product_id,product_name,product_name_kana,product_description,category_id,price,image_file_path,image_file_name,release_company,release_date,regist_date)
VALUES(1,1,"青い本","あおいほん","ぱっと見は緑です。",101,10,"./img/bookBlue.jpg","bookBlue.jpg","kokotown.co.ltd","2018-01-08 11:10:10","2018-01-08 11:10:10");
INSERT INTO product_info(id,product_id,product_name,product_name_kana,product_description,category_id,price,image_file_path,image_file_name,release_company,release_date,regist_date)
VALUES(2,2,"赤い本","あかいほん","ぱっと見は赤です。",101,100,"./img/bookBlue.jpg","bookBlue.jpg","kokotown.co.ltd","2018-01-08 11:10:10","2018-01-09 11:10:10");
INSERT INTO product_info(id,product_id,product_name,product_name_kana,product_description,category_id,price,image_file_path,image_file_name,release_company,release_date,regist_date)
VALUES(3,3,"緑の本","みどりのほん","ぱっと見は緑です。",101,1000,"./img/bookBlue.jpg","bookBlue.jpg","kokotown.co.ltd","2018-01-08 11:10:10","2018-01-10 11:10:10");
INSERT INTO product_info(id,product_id,product_name,product_name_kana,product_description,category_id,price,image_file_path,image_file_name,release_company,release_date,regist_date)
VALUES(4,4,"青いパソコン","あおいぱそこん","ぱっと見は青です。",102,10000,"./img/bookBlue.jpg","bookBlue.jpg","kokotown.co.ltd","2018-01-08 11:10:10","2018-01-11 11:10:10");
INSERT INTO product_info(id,product_id,product_name,product_name_kana,product_description,category_id,price,image_file_path,image_file_name,release_company,release_date,regist_date)
VALUES(5,5,"赤いパソコン","あかいぱそこん","ぱっと見は赤です。",102,25000,"./img/bookBlue.jpg","bookBlue.jpg","kokotown.co.ltd","2018-01-08 11:10:10","2018-01-12 11:10:10");
INSERT INTO product_info(id,product_id,product_name,product_name_kana,product_description,category_id,price,image_file_path,image_file_name,release_company,release_date,regist_date)
VALUES(6,6,"緑のパソコン","みどりのぱそこん","ぱっと見は緑です。",102,50000,"./img/bookBlue.jpg","bookBlue.jpg","kokotown.co.ltd","2018-01-08 11:10:10","2018-02-08 11:10:10");
INSERT INTO product_info(id,product_id,product_name,product_name_kana,product_description,category_id,price,image_file_path,image_file_name,release_company,release_date,regist_date)
VALUES(7,7,"青いゲーム","あおいげーむ","ぱっと見は青です。",103,9800,"./img/bookBlue.jpg","bookBlue.jpg","kokotown.co.ltd","2018-01-08 11:10:10","2018-03-08 11:10:10");
INSERT INTO product_info(id,product_id,product_name,product_name_kana,product_description,category_id,price,image_file_path,image_file_name,release_company,release_date,regist_date)
VALUES(8,8,"赤いゲーム","あかいゲーム","ぱっと見は赤です。",103,4800,"./img/bookBlue.jpg","bookBlue.jpg","kokotown.co.ltd","2018-01-08 11:10:10","2018-04-08 11:10:10");
INSERT INTO product_info(id,product_id,product_name,product_name_kana,product_description,category_id,price,image_file_path,image_file_name,release_company,release_date,regist_date)
VALUES(9,9,"緑のゲーム","みどりのげーむ","ぱっと見は緑です。",103,7000,"./img/bookBlue.jpg","bookBlue.jpg","kokotown.co.ltd","2018-01-08 11:10:10","2018-05-08 11:10:10");
INSERT INTO product_info(id,product_id,product_name,product_name_kana,product_description,category_id,price,image_file_path,image_file_name,release_company,release_date,regist_date)
VALUES(10,10,"blueGame","ぶるーげーむ","ぱっと見は青です。",103,10000,"./img/bookBlue.jpg","bookBlue.jpg","kokotown.co.ltd","2018-01-08 11:10:10","2019-01-08 11:10:10");
INSERT INTO product_info(id,product_id,product_name,product_name_kana,product_description,category_id,price,image_file_path,image_file_name,release_company,release_date,regist_date)
VALUES(11,11,"redGame","れっどゲーム","ぱっと見は赤です。",103,14000,"./img/bookBlue.jpg","bookBlue.jpg","kokotown.co.ltd","2018-01-08 11:10:10","2020-01-08 11:10:10");
INSERT INTO product_info(id,product_id,product_name,product_name_kana,product_description,category_id,price,image_file_path,image_file_name,release_company,release_date,regist_date)
VALUES(12,12,"greenGame","ぐりーんげーむ","ぱっと見は緑です。",103,75000,"./img/bookBlue.jpg","bookBlue.jpg","kokotown.co.ltd","2018-01-08 11:10:10","2021-01-08 11:10:10");
INSERT INTO product_info(id,product_id,product_name,product_name_kana,product_description,category_id,price,image_file_path,image_file_name,release_company,release_date,regist_date)
VALUES(13,13,"いちご100%","いちごひゃくぱーせんと","ぱっと見は緑です。",101,400,"./img/bookBlue.jpg","bookBlue.jpg","kokotown.co.ltd","2018-01-08 11:10:10","2022-01-08 11:10:10");
INSERT INTO product_info(id,product_id,product_name,product_name_kana,product_description,category_id,price,image_file_path,image_file_name,release_company,release_date,regist_date)
VALUES(14,14,"100の方法","ひゃくのほうほう","ぱっと見は緑です。",101,800,"./img/bookBlue.jpg","bookBlue.jpg","kokotown.co.ltd","2018-01-08 11:10:10","2023-01-08 11:10:10");
INSERT INTO product_info(id,product_id,product_name,product_name_kana,product_description,category_id,price,image_file_path,image_file_name,release_company,release_date,regist_date)
VALUES(15,15,"100%マスカット","ひゃくぱーせんとマスカット","ぱっと見は緑です。",101,700,"./img/bookBlue.jpg","bookBlue.jpg","kokotown.co.ltd","2018-01-08 11:10:10","2024-01-08 11:10:10");
INSERT INTO product_info(id,product_id,product_name,product_name_kana,product_description,category_id,price,image_file_path,image_file_name,release_company,release_date,regist_date)
VALUES(16,16,"青い青本","あおいあおほん","ぱっと見は緑です。",101,600,"./img/bookBlue.jpg","bookBlue.jpg","kokotown.co.ltd","2018-01-08 11:10:10","2025-01-08 11:10:10");