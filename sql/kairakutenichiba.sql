set names utf8;
set foreign_key_checks=0;


drop database if exists kairakutenichiba;
create database kairakutenichiba;
use kairakutenichiba;

/*--------------------------各テーブルの作成--------------------------
*/
create table items(
	item_id int not null primary key,/*商品ID*/
	item_name varchar(100) not null,/*商品名*/
	category_name varchar(20) not null,/*カテゴリ名*/
	release_day date not null,/*発売日*/
	author varchar(100) not null,/*著者*/
	publisher varchar(100)not null,/*出版社*/
	publish_type varchar(100) not null,/*発行形態*/
	pages int not null,/*ページ数*/
	isbn long not null,/*ISBNコード*/
	price decimal(9,2) not null,/*単価*/
	stocks int not null,/*在庫数*/
	sales int default 0,/*売り上げ数*/
	item_datail text not null,/*商品詳細*/
	item_image varchar(255) not null, /*商品画像*/
	is_deleted boolean default false,/*商品削除*/
	created_at datetime not null default current_timestamp,/*登録日*/
	updated_at datetime not null default current_timestamp/*更新日*/
);


create table purchases_outlines (
	purchase_id int not null  auto_increment primary key,/*購入ID*/
	user_id int not null,/*ユーザーID*/
	total_price decimal(9,2) not null,/*価格合計*/
	delivery enum('mail','home_delivery'),/*配送方法*/
	credit_number int not null,/*クレジットカード番号*/
	purchased_at datetime not null default current_timestamp,/*購入日*/
	created_at datetime not null default current_timestamp,/*登録日*/
	updated_at datetime not null default current_timestamp,/*更新日*/

	foreign key(user_id) references openconnect.users(user_id),
	foreign key(credit_number) references openconnect.credit(credit_number)
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
	user_mail varchar(255) not null,/*メールアドレス*/
	category enum('アカウントについて','お支払い方法について','注文内容について','その他') not null,/*問い合わせ種類*/
	comment text not null,/*問い合わせ内容*/
	is_deleted boolean default false,/*問い合わせ削除*/
	inquiried_at datetime not null default current_timestamp,/*問い合わせ日時*/
	created_at datetime not null default current_timestamp,/*登録日*/
	updated_at datetime not null default current_timestamp/*更新日*/
);

use kairakutenichiba;

/*--------------------------商品情報(画像以外)--------------------------

Templete:(商品ID,'商品名','カテゴリ名','発売日','著者','出版社','発行形態','ページ数','ISBNコード',
単価,在庫数,売り上げ数,"詳細説明文",'商品画像')
*/
insert into items(
item_id,item_name,category_name,release_day,author,publisher,publish_type,pages,isbn,price,stocks,item_datail,item_image)
values
(1,'チビモン','少年漫画','2099-12-31','佐藤次郎','快楽社','漫画',178,9784123456789,480,1000,"商品詳細","img/item/チビモン.png"),
(2,'メガネ','文庫本','2099-12-31','鈴木花子','快楽社','文庫',382,9784123789456,650,1000,"商品詳細","img/item/メガネ.png"),
(3,'ライオンの飼育方法','ライトノベル','2099-12-31','佐藤次郎','快楽社','文庫',282,9784789456123,480,1000,"商品詳細","img/item/ライオンの飼育方法.png"),
(4,'ワイルドフラワー','少女漫画','2099-12-31','山田太郎','快楽社','漫画',180,9874159324786,440,1000,"商品詳細","img/item/ワイルドフラワー.png"),
(5,'快楽店市場の歴史','雑誌','2099-12-31','山田太郎','快楽社','雑誌',60,9874741236985,440,1000,"商品詳細","img/item/快楽店市場の歴史.png"),
(6,'世界の絶景','雑誌','2099-12-31','山田太郎','快楽社','雑誌',64,9874147896325,520,1000,"商品詳細","img/item/世界の絶景.png"),
(7,'正しい寿司の握り方','雑誌','2099-12-31','鈴木花子','快楽社','雑誌',45,9874852147963,490,1000,"商品詳細","img/item/正しい寿司の握り方.png"),
(8,'美しいホネ','ライトノベル','2099-12-31','山田太郎','快楽社','文庫',215,9874963258741,620,1000,"商品詳細","img/item/美しい骨.png"),
(9,'名探偵コナソ','少年漫画','2099-12-31','赤山剛昌','快楽社','漫画',186,9874147963258,460,1000,"商品詳細","img/item/名探偵コナソ.png"),
(10,'僕に届け','少女漫画','2099-12-31','椎名重穂','快楽社','漫画',186,9874951463782,460,1000,"商品情報","img/item/僕に届け.png"),
(11,'ノルウェイの林(上)','文庫本','2099-12-31','村上冬樹','快楽社','文庫',300,9874456987321,600,1000,"商品情報","img/item/ノルウェイの林（上）.png"),
(12,'ノルウェイの林(下)','文庫本','2099-12-31','村上冬樹','快楽社','文庫',300,9874456986321,600,1000,"商品情報","img/item/ノルウェイの林（下）.png"),
(13,'俺の姉がこんなに可愛いわけがない','ライトノベル','2099-12-31','伏目つかさ','快楽社','文庫',264,92874197842136,460,1000,"商品情報","img/item/俺の姉が.png"),
(14,'頭文字C','少年漫画','2099-12-31','しげの秀二','快楽社','漫画',196,9874102365478,420,1000,"商品情報","img/item/頭文字C.png"),
(15,'ねだめ　カンタービレ','少女漫画','2099-12-31','三ノ宮知子','快楽社','漫画',192,9874102512305,420,1000,"商品情報","img/item/ねだめ カンタービレ.png");
