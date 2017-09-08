set names utf8;
set foreign_key_checks=0;


drop database if exists kairakutenichiba;
create database kairakutenichiba;
use kairakutenichiba;

#--------------------------各テーブルの作成--------------------------

create table items(
	item_id int not null primary key,/*商品ID*/
	item_name varchar(100) not null,/*商品名*/
	category_id int not null,/*カテゴリ番号*/
	release_day date not null /*発売日*/
	author varchar(100) not null,/*著者*/
	publisher varchar(100),not null/*出版社*/
	publish_type varchar(100) not null,/*発行形態*/
	pages int not null,/*ページ数*/
	isbn int not null,/*ISBNコード*/
	price decimal(9,2) not null,/*単価*/
	stocks int not null,/*在庫数*/
	sales int,/*売り上げ数*/
	item_datail text not null,/*商品詳細*/
	is_deleted boolean default FALSE,/*商品削除*/
	created_at datetime not null default current_timestamp,/*登録日*/
	updated_at datetime not null default current_timestamp,/*更新日*/

	foreign key(category_id)references categories(category_id)
);

create table categories (
	category_id int not null auto_increment primary key,/*カテゴリ番号*/
	category_name varchar(20) not null,/*カテゴリ名*/
	created_at datetime not null default current_timestamp,/*登録日*/
	updated_at datetime not null default current_timestamp/*更新日*/
);

create table items_images (
	item_id int not null,/*商品ID*/
	img_path1 varchar(255) not null,/*イメージパス(1)*/
	img_path2 varchar(255),/*イメージパス(2)*/
	img_path3 varchar(255),/*イメージパス(3)*/
	img_path4 varchar(255),/*イメージパス(4)*/
	img_path5 varchar(255),/*イメージパス(5)*/
	created_at datetime not null default current_timestamp,/*登録日*/
	updated_at datetime not null default current_timestamp,/*更新日*/

	foreign key(item_id) references items(item_id)
);

create table purchases_outlines (
	purchase_id int not null  auto_increment primary key,/*購入ID*/
	user_id int not null,/*ユーザーID*/
	total_price decimal(9,2) not null,/*価格合計*/
	delivery enum('mail','rapid'),/*配送方法*/
	credit_id int not null,/*クレジットID*/
	purchased_at datetime not null default current_timestamp,/*購入日*/
	created_at datetime not null default current_timestamp,/*登録日*/
	updated_at datetime not null default current_timestamp,/*更新日*/

	foreign key(user_id) references openconnect.users(user_id),
	foreign key(credit_id) reference credit(credit_id)
);

create table purchases_details (
	purchase_id int not null,/*購入ID*/
	purchase_no int not null auto_increment primary key,/*購入NO*/
	user_id int not null,/*ユーザーID*/
	item_id int not null,/*商品ID*/
	quantities int not null default 1,/*数量*/
	multiplied_price decimal(9,2) not null,/*価格計*/
	purchased_at datetime not null default current_timestamp,/*購入日*/
	created_at datetime not null default current_timestamp,/*登録日*/
	updated_at datetime not null default current_timestamp,/*更新日*/

	foreign key(purchase_id) references purchases_outlines(purchase_id),
	foreign key(user_id) references openconnect.users(user_id),
	foreign key(item_id) references items(item_id)
);

create table carts (
	user_id int not null,/*ユーザーID*/
	item_id int not null,/*商品ID*/
	quantities int not null default 1,/*数量*/
	total_price decimal(9,2) not null,/*価格合計*/
	is_deleted boolean default false,/*商品選択削除*/
	created_at datetime not null default current_timestamp,/*登録日*/
	updated_at datetime not null default current_timestamp,/*更新日*/

	foreign key(user_id) references openconnect.users(user_id),
	foreign key(item_id) references items(item_id)
);

create table inquiry_histories (
	inquiry_no int not null auto_increment primary key,/*問い合わせ番号*/
	user_name varchar(50) not null,/*氏名*/
	user_address varchar(255),/*住所*/
	user_telnumber varchar(50) not null,/*電話番号*/
	user_mail varchar(255) not null,/*メールアドレス*/
	category enum('アカウントについて','お支払い方法について','注文内容について','その他') not null,/*問い合わせ種類*/
	title varchar(100) not null,/*問い合わせ題名*/
	comment text not null,/*問い合わせ内容*/
	is_deleted boolean default false,/*問い合わせ削除*/
	inquiried_at datetime not null default current_timestamp,/*問い合わせ日時*/
	created_at datetime not null default current_timestamp,/*登録日*/
	updated_at datetime not null default current_timestamp/*更新日*/
);

use kairakutenichiba;

#--------------------------カテゴリ情報--------------------------
#-----Templete:(ID,"カテゴリ名")
insert into categories(category_id,category_name) values
(1,"少年漫画"),
(2,"少女漫画"),
(3,"ライトノベル"),
(4,"文庫本"),
(5,"雑誌");

#--------------------------商品情報(画像以外)--------------------------
/*
Templete:(商品ID,'商品名','カテゴリ番号','発売日','著者','出版社','発行形態','ページ数','ISBNコード',
単価,在庫数,売り上げ数,"詳細説明文")
*/
insert into items(
item_id,item_name,category_id,release_day,author,publisher,publish_type,pages,isbn,price,stocks,sales,item_detail)
values
(1,'チビモン',1,'20XX年XX月YY日','佐藤次郎','快楽社','漫画','178P','ISBN9784123456789',480,150,50,"商品詳細"),
(2,'メガネ',4,'19XX年XX月YY日','鈴木花子','快楽社','文庫','382P','ISBN9784123789456',650,180,20,"商品詳細"),
(3,'ライオンの飼育方法',3,'20XX年XX月YY日','佐藤次郎','快楽社','文庫','282P','ISBN9784789456123',480,130,70,"商品詳細"),
(4,'ワイルドフラワー',2,'20XX年XX月YY日','山田太郎','快楽社','漫画','180P','ISBN9874159324786',440,160,40,"商品詳細"),
(5,'快楽店市場の歴史',5,'20XX年XX月YY日','山田太郎','快楽社','雑誌','60P','ISBN9874741236985',440,100,100,"商品詳細"),
(6,'世界の絶景',5,'20XX年XX月YY日','山田太郎','快楽社','雑誌','64P','ISBN9874147896325',520,165.35,"商品詳細"),
(7,'正しい寿司の握り方',5,'20XX年XX月YY日','鈴木花子','快楽社','雑誌','45P','ISBN9874852147963',490,177,23,"商品詳細"),
(8,'美しいホネ',3,'20XX年XX月YY日','山田太郎','快楽社','文庫','215050P','ISBN9874963258741',620,146,54,"商品詳細"),
(9,'名探偵コナソ',1,'20XX年XX月YY日','赤山剛昌','快楽社','漫画','186P','ISBN9874147963258',460,152,48,"商品詳細"),
(10,'僕に届け',2,'20XX年XX月YY日','椎名重穂','快楽社','漫画','186P','ISBN9874951463782',460,140,60,"商品情報"),
(11,'ノルウェイの林(上)',4,'20XX年XX月YY日','村上冬樹','快楽社','文庫','300P','ISBN9874456987321',600,100,100,"商品情報"),
(12,'ノルウェイの林(下)',4,'20XX年XX月YY日','村上冬樹','快楽社','文庫','300P','ISBN9874456986321',600,100,100,"商品情報"),
(13,'俺の姉がこんなに可愛いわけがない',3,'20XX年XX月YY日','伏目つかさ','快楽社','文庫','264P','ISBN92874197842136',460,130,70,"商品情報"),
(14,'頭文字C',1,'20XX年XX月YY日','しげの秀二','快楽社','漫画','196P','ISBN9874102365478',420,125,75,"商品情報"),
(15,'ねだめ　カンタービレ',2,'20XX年XX月YY日','三ノ宮知子','快楽社','漫画','192P','ISBN9874102512305',420,136,64,"商品情報");


#--------------------------商品情報(画像パス)--------------------------
/*
Templete:(商品ID,"画像パスその１","その２","その３","その４","その５")
画像パスその２～その５は指定しない場合「default」、下記が最低限
Templete:(商品ID,"画像パスその１",default,default,default,default)
*/
insert into items_images(item_id,img_path1,img_path2,img_path3,img_path4,img_path5) values
(1,"img/items/チビモン.png",default,default,default,default),
(2,"img/items/メガネ.png",default,default,default,default),
(3,"img/items/ライオンの飼育方法.png",default,default,default,default),
(4,"img/items/ワイルドフラワー.png",default,default,default,default),
(5,"img/items/快楽店市場の歴史.png",default,default,default,default),
(6,"img/items/世界の絶景.png",default,default,default,default),
(7,"img/items/正しい寿司の握り方.png",default,default,default,default),
(8,"img/items/美しい骨.png",default,default,default,default),
(9,"img/items/名探偵コナソ.png",default,default,default,default),
(10,"img/items/僕に届け.png",default,default,default,default),
(11,"img/items/ノルウェイの林（上）.png",default,default,default,default),
(12,"img/items/ノルウェイの林（下）.png",default,default,default,default),
(13,"img/items/俺の姉が.png",default,default,default,default),
(14,"img/items/頭文字C.png",default,default,default,default),
(15,"img/items/ねだめ カンタービレ.png",default,default,default,default);
