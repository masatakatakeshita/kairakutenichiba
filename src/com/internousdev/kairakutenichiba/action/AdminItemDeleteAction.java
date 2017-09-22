package com.internousdev.kairakutenichiba.action;

import java.util.ArrayList;

import com.internousdev.kairakutenichiba.dao.AdminItemDAO;
import com.internousdev.kairakutenichiba.dto.ItemDTO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 商品情報削除画面への遷移時、削除する商品データを取得するクラス
 * @author Ryo Maeda
 * @since 2017/05/15
 * @version 1.0
 */
public class AdminItemDeleteAction extends ActionSupport{

	/**
	 * シリアルID
	 */
	private static final long serialVersionUID = 2281123274036546024L;
	/**
	 *
	 */

	/**
	 * 商品ID
	 */
	private int itemId;

	/**
	 * 商品名
	 */
	private String itemsName="";

	/**
	 * カテゴリ名
	 */
	private String category_name;

	/**
	 * 発売日
	 */
	private String release_day;

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
	 * isbnコード
	 */
	private long isbn;

	/**
	 * 単価
	 */
	private float price;

	/**
	 * 在庫数
	 */
	private int stocks;

	/**
	 * 商品詳細
	 */
	private String itemDetail;

	/**
	 * 商品画像
	 */
	private String item_image;

	/**
	 * 商品リスト
	 */
	public ArrayList<ItemDTO> itemList = new ArrayList<ItemDTO>();



	/**
	 * 実行メソッド
	 * DBのアイテム情報を変更するメソッド
	 * @return result 成功=SUCCESS 失敗=ERROR
	 */

	public String execute(){
		String result=ERROR;
		AdminItemDAO dao = new AdminItemDAO();
		itemList=dao.select(itemsName);
		if(itemList.size()>0){
			result=SUCCESS;
		}
		return result;
	}


	/**
	 * セッターゲッター
	 */

	/**
	 *  商品IDを格納するメソッド
	 *  @param itemId セットする
	 */
	public void setItemId(int itemId){
		this.itemId=itemId;
	}

	/**
	 *  商品IDを取得するメソッド
	 *  @return itemId 商品ID
	 */
	public int getItemId(){
		return itemId;
	}


	/**
	 *  商品名を格納するメソッド
	 *  @param itemsName セットする
	 */
	public void setItemsName(String itemsName){
		this.itemsName = itemsName;
	}

	/**
	 *  商品名を取得するメソッド
	 *  @return itemsName 商品名
	 */
	public String getItemsName(){
		return itemsName;
	}


	/**
	 *  カテゴリ名を取得するメソッド
	 *  @param category_name セットする
	 */
	public void setCategory_name(String category_name){
		this.category_name = category_name;
	}

	/**
	 *  カテゴリ名を格納するメソッド
	 *  @return category_name カテゴリ名
	 */
	public String getCategory_name(){
		return category_name;
	}


	/**
	 *  発売日を格納するメソッド
	 *  @param  release_day セットする
	 */
	public void setRelease_day(String release_day){
		this.release_day=release_day;
	}

	/**
	 *  発売日を取得するメソッド
	 *  @return release_day 発売日
	 */
	public String getRelease_day(){
		return release_day;
	}


	/**
	 *  著者を格納するメソッド
	 *  @param author セットする
	 */
	public void setAuthor(String author){
		this.author=author;
	}

	/**
	 *  著者を取得するメソッド
	 *  @return author 著者
	 */
	public String getAuthor(){
		return author;
	}


	/**
	 *  出版社を格納するメソッド
	 *  @param publisher セットする
	 */
	public void setPublisher(String publisher){
		this.publisher=publisher;
	}

	/**
	 *  出版社を取得するメソッド
	 *  @return publisher 出版社
	 */
	public String getPublisher(){
		return publisher;
	}


	/**
	 *  発行形態を格納するメソッド
	 *  @param publish_type セットする
	 */
	public void setPublish_type(String publish_type){
		this.publish_type=publish_type;
	}

	/**
	 *  発行形態を取得するメソッド
	 *  @return publish_type 発行形態
	 */
	public String getPublish_type(){
		return publish_type;
	}


	/**
	 *  ページ数を格納するメソッド
	 *  @param pages セットする
	 */
	public void setPages(int pages){
		this.pages=pages;
	}

	/**
	 *  ページ数を取得するメソッド
	 *  @return pages ページ数
	 */
	public int getPages(){
		return pages;
	}


	/**
	 *  isbnコードを格納するメソッド
	 *  @param isbn セットする
	 */
	public void setIsbn(long isbn){
		this.isbn=isbn;
	}

	/**
	 *  isbnコードを取得するメソッド
	 *  @return isbn isbnコード
	 */
	public long getIsbn(){
		return isbn;
	}


	/**
	 *  単価を取得するメソッド
	 *  @param price セットする
	 */
	public void setPrice(float price){
		this.price = price;
	}

	/**
	 *  単価を格納するメソッド
	 *  @return price 単価
	 */
	public float getPrice(){
		return price;
	}


	/**
	 *  在庫数を格納するメソッド
	 *  @param stocks セットする
	 */
	public void setStocks(int stocks){
		this.stocks=stocks;
	}

	/**
	 *  在庫数を取得するメソッド
	 *  @return stocks 在庫数
	 */
	public int getstocks(){
		return stocks;
	}


	/**
	 *  商品詳細を格納するメソッド
	 *  @param itemDetail セットする
	 */
	public void setItemDetail(String itemDetail){
		this.itemDetail = itemDetail;
	}

	/**
	 *  商品詳細を取得するメソッド
	 *  @return itemDetail 商品詳細
	 */
	public String getItemDetail(){
		return itemDetail;
	}


	/**
	 *  商品画像を格納するメソッド
	 *  @param item_image セットする
	 */
	public void setItem_image(String item_image){
		this.item_image=item_image;
	}

	/**
	 *  商品画像を取得するメソッド
	 *  @return item_image 商品画像
	 */
	public String getItem_image(){
		return item_image;
	}


}


