package com.internousdev.kairakutenichiba.action;

import com.internousdev.kairakutenichiba.dao.AdminItemUpdateDAO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 商品情報を更新するためのクラス
 * @author
 *
 */
public class AdminItemUpdateAction extends ActionSupport{

	/**
	 * シリアルID
	 */
	private static final long serialVersionUID = 8523447612582469504L;


	/**
	 * 商品名
	 */
	private String item_name="";


	/**
	 * 商品ID
	 */
	private int item_id;

	/**
	 * カテゴリ
	 */
	private String category;

	/**
     * 発売日
     */
    private int release_day;

    /**
     * 著者
     */
    private String author;

    /**
     * 出版社
     */
    private String publisher;

    /**
     * 発行形態
     */
    private String publish_type;

    /**
     * ページ数
     */
    private int pages;

    /**
     * ISBNコード
     */
    private int isbn;

	/**
	 * 単価
	 */
	private float price;



	/**
     * 商品削除
     */
    private boolean is_deleted;



	/**
	 * イメージファイルパス
	 */
	private String imgPath="";

	/**
	 * 商品詳細
	 */
	private String item_detail="";

	/**
	 * 在庫数
	 */
	private int stocks=0;

	/**
	 * 売上数
	 */
	private int sales;



	/**
	 * 登録日
	 */
	private String created_at;

	/**
	 * 更新日
	 */
	private String updated_at;

	/**
	 * 商品画像01
	 */
	private String item_image;

	/**
	 * 商品画像02
	 */
	private String item_image2;

	/**
	 * 商品名重複時のエラー文
	 */
	private String doubling;

	/**
	 * 商品画像削除フラグ
	 */
	public int imgDel=1;


	/**
	 *商品情報を更新するメソッド
	 *商品名を確認しDBで重複していなければ商品情報を更新する
	 */
	public String execute() {
		String result =ERROR;
		int updated=0;

		AdminItemUpdateDAO dao= new AdminItemUpdateDAO();

		if(dao.doubling(item_id,item_name)){setDoubling("※同名の商品が既に存在します。");}
		else{
			updated=dao.insert(item_id,item_name,category, release_day, author,  publisher,  publish_type,  pages, isbn, is_deleted, created_at, item_detail, updated_at,  price, stocks, sales, imgDel,imgPath);

			if(updated>0){
				result = SUCCESS;
			}
		}

		return result;
	}




	/**
	 * セッターゲッター
	 */



	/**
	 * 商品IDを取得するメソッド
	 * @return itemId　商品ID
	 */


	/**
	 * 単価を取得するメソッド
	 * @return price　単価
	 */
	public float getPrice() {
		return price;
	}


	/**
	 * 単価を格納するメソッド
	 * @param price セットする price
	 */
	public void setPrice(float price) {
		this.price = price;
	}


	/**
	 * イメージパスファイルを取得するメソッド
	 * @return imgPath　イメージファイルパス
	 */
	public String getImgPath() {
		return imgPath;
	}


	/**
	 * イメージパスファイルを格納するメソッド
	 * @param imgPath セットする imgPath
	 */
	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}





	/**
	 * 在庫数を取得するメソッド
	 * @return stock　在庫数
	 */
	public int getStock() {
		return stocks;
	}


	/**
	 * 在庫数を格納するメソッド
	 * @param stock セットする stock
	 */
	public void setStocks(int stocks) {
		this.stocks = stocks;
	}


	/**
	 * 売上数を取得するメソッド
	 * @return sales　売上数
	 */
	public int getSales() {
		return sales;
	}


	/**
	 * 売上数を格納するメソッド
	 * @param sales セットする sales
	 */
	public void setSales(int sales) {
		this.sales = sales;
	}







	/**
	 * 商品名重複時のエラー文を取得するメソッド
	 * @return doubling　商品名重複時のエラー文
	 */
	public String getDoubling() {
		return doubling;
	}



	/**
	 * 商品名重複時のエラー文を格納するメソッド
	 * @param doubling セットする doubling
	 */
	public void setDoubling(String doubling) {
		this.doubling = doubling;
	}


	/**
	 *商品画像削除フラグを取得するメソッド
	 * @return imgDel　商品画像削除フラグ
	 */
	public int getImgDel() {
		return imgDel;
	}


	/**
	 * 商品画像削除フラグを格納するメソッド
	 * @param imgDel セットする imgDel
	 */
	public void setImgDel(int imgDel) {
		this.imgDel = imgDel;
	}

	/**
	 * @return item_name
	 */
	public String getItem_name() {
		return item_name;
	}

	/**
	 * @param item_name セットする item_name
	 */
	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}

	/**
	 * @return item_id
	 */
	public int getItem_id() {
		return item_id;
	}

	/**
	 * @param item_id セットする item_id
	 */
	public void setItem_id(int item_id) {
		this.item_id = item_id;
	}

	/**
	 * @return category
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * @param category セットする category
	 */
	public void setCategory(String category) {
		this.category = category;
	}

	/**
	 * @return release_day
	 */
	public int getRelease_day() {
		return release_day;
	}

	/**
	 * @param release_day セットする release_day
	 */
	public void setRelease_day(int release_day) {
		this.release_day = release_day;
	}

	/**
	 * @return author
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * @param author セットする author
	 */
	public void setAuthor(String author) {
		this.author = author;
	}

	/**
	 * @return publisher
	 */
	public String getPublisher() {
		return publisher;
	}

	/**
	 * @param publisher セットする publisher
	 */
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	/**
	 * @return publish_type
	 */
	public String getPublish_type() {
		return publish_type;
	}

	/**
	 * @param publish_type セットする publish_type
	 */
	public void setPublish_type(String publish_type) {
		this.publish_type = publish_type;
	}

	/**
	 * @return pages
	 */
	public int getPages() {
		return pages;
	}

	/**
	 * @param pages セットする pages
	 */
	public void setPages(int pages) {
		this.pages = pages;
	}

	/**
	 * @return isbn
	 */
	public int getIsbn() {
		return isbn;
	}

	/**
	 * @param isbn セットする isbn
	 */
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	/**
	 * @return item_image
	 */
	public String getItem_image() {
		return item_image;
	}

	/**
	 * @param item_image セットする item_image
	 */
	public void setItem_image(String item_image) {
		this.item_image = item_image;
	}

	/**
	 * @return item_image2
	 */
	public String getItem_image2() {
		return item_image2;
	}

	/**
	 * @param item_image2 セットする item_image2
	 */
	public void setItem_image2(String item_image2) {
		this.item_image2 = item_image2;
	}

	/**
	 * @return item_detail
	 */
	public String getItem_detail() {
		return item_detail;
	}

	/**
	 * @param item_detail セットする item_detail
	 */
	public void setItem_detail(String item_detail) {
		this.item_detail = item_detail;
	}

	/**
	 * @return is_deleted
	 */
	public boolean isIs_deleted() {
		return is_deleted;
	}

	/**
	 * @param is_deleted セットする is_deleted
	 */
	public void setIs_deleted(boolean is_deleted) {
		this.is_deleted = is_deleted;
	}

	/**
	 * @return created_at
	 */
	public String getCreated_at() {
		return created_at;
	}

	/**
	 * @param created_at セットする created_at
	 */
	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}

	/**
	 * @return updated_at
	 */
	public String getUpdated_at() {
		return updated_at;
	}

	/**
	 * @param updated_at セットする updated_at
	 */
	public void setUpdated_at(String updated_at) {
		this.updated_at = updated_at;
	}

}