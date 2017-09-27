/**
 * 
 */
package com.internousdev.kairakutenichiba.action;

import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.kairakutenichiba.dao.GoItemDetailDAO;
import com.internousdev.kairakutenichiba.dto.ItemDTO;
import com.opensymphony.xwork2.ActionSupport;
/**
* 商品詳細を表示するクラス
*/
public class GoItemDetailAction extends ActionSupport {


	/**
	 * シリアルID
	 */
	private static final long serialVersionUID = 265702236011588767L;
	/**
	 * 商品名
	 */
	private String item_name;

	/**
	 * 商品ID
	 */
	private int item_id;

	/**
	 * 単価
	 */
	private float price;

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
	 * コード
	 */
	private long isbn;

    /**
     * イメージパス
	 */
	private String item_image;

	/**
	 * 在庫数
	 */
	private int stocks;

	/**
	 * DBから表示するための情報をリスト化している
	 */
	private ArrayList<ItemDTO> displayList = new ArrayList<ItemDTO>();


	/**
	 * 商品情報表示用リストの生成
	 * 1：テーブル名itemsのひつ情報をdisplayListに格納して表示する
    */
	public String execute() throws SQLException {
		String result = ERROR;
		GoItemDetailDAO dao = new GoItemDetailDAO();
		displayList = dao.select(item_id);
		if(displayList.size() != 0) {
			result = SUCCESS;
		}
		return result;
	}
	
	public ArrayList<ItemDTO> getdisplayList(){
		return displayList;
	}
	
	public void setdisplayList(ArrayList<ItemDTO> displayList){
		this.displayList=displayList;
	}



	/**
	 * 商品名を取得するメソッド
	 * @return item_name
	 */
	public String getItem_name() {
		return item_name;
	}

	/**
	 * 商品名を格納するメソッド
	 * @param item_name セットする item_name
	 */
	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}

	/**
	 * アイテムIDを取得するメソッド
	 * @return item_id
	 */
	public int getItem_id() {
		return item_id;
	}

	/**
	 * アイテムIDを格納するメソッド
	 * @param item_id セットする item_id
	 */
	public void setItem_id(int item_id) {
		this.item_id = item_id;
	}

	/**
	 * 単価を取得するメソッド
	 * @return price
	 */
	public float getPrice() {
		return price;
	}

	/**
	 * 発売日を取得するメソッド
	 * @return release_day
	 */
	public String getRelease_day() {
		return release_day;
	}

	/**
	 * 発売日を格納するメソッド
	 */
	public void setRelease_day(String release_day) {
		this.release_day = release_day;
	}

	/**
	 * 著者名を取得するメソッド
	 * @return author
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * 著者名を格納するメソッド
	 * @param price セットする price
	 */
	public void setAuthor(String author) {
		this.author = author;
	}

	/**
	 * 出版社を取得するメソッド
	 * @return publisher
	 */
	public String getPublisher(){
		return publisher;
	}
	/**
	 * 出版社を格納するメソッド
	 * @param publisher
	 */
	public void setPublisher(String publisher){
		this.publisher = publisher;
	}

	/**
	 * 発行形態を取得するメソッド
	 * @return publish_type
	 */
	public String getpublish_type(){
		return publish_type;
	}
	/**
	 * 発行形態を格納するメソッド
	 * @param publish_type
	 */
	public void setPublish_type(String publish_type){
		this.publish_type = publish_type;
	}

	/**
	 * ページ数を取得するメソッド
	 * @return publish_type
	 */
	public int getPages(){
		return pages;
	}
	/**
	 * ページ数を格納するメソッド
	 * @param publish_type
	 */
	public void setPages(int pages){
		this.pages = pages;
	}

	/**
	 * コードを取得するメソッド
	 * @return publish_type
	 */
	public long getIsbn(){
		return isbn;
	}
	/**
	 * コードを格納するメソッド
	 * @param publish_type
	 */
	public void setIsbn(long isbn){
		this.isbn = isbn;
	}

	/**
	 * 単価を格納するメソッド
	 * @param price セットする price
	 */
	public void setPrice(float price) {
		this.price = price;
	}

	/**
	 * イメージパスを取得するメソッド
	 * @return item_image
	 */
	public String getitem_image() {
		return item_image;
	}

	/**
	 * イメージパスを格納するメソッド
	 * @param item_image セットする item_image
	 */
	public void setitem_image(String item_image) {
		this.item_image = item_image;
	}

	/**
	 * 在庫数を取得するメソッド
	 * @return stocks
	 */
	public int getStocks() {
		return stocks;
	}

	/**
	 * 在庫数を格納するメソッド
	 * @param stocks セットする stocks
	 */
	public void setStocks(int stocks) {
		this.stocks = stocks;
	}

}