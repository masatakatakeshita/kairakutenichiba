

package com.internousdev.kairakutenichiba.dto;

import java.util.Map;


/**
 * 購入履歴を格納するためのDTOクラス
 * @author junpei koizumi
 *
 */
public class HistoryDTO {

	/**
	 * 商品ID
	 */
	private int item_id;
	/**
	 * 個数
	 */
	private int quantities;
	/**
	 * 購入日
	 */
	private String purchased_day;



	/**
	 * 商品名
	 */
	private String item_name;
	/**
	 * 販売日
	 */
	private String release_day;
	/**
	 * 著者
	 */
	private String author;
	/**
	 * 値段
	 */
	private int price;		//単価

	private Map<String, Object> session;




	/**
	 * 以下アクセスメソッド。get set
	 */
	/**
	 * アイテムIDを取得するメソッド
	 * @return item_id
	 */
	public int getItem_id(){
		return item_id;
	}
	/**
	 * アイテムIDをカクノウスルメソッド
	 * @param Item_id
	 */
	public void setItem_id(int Item_id){
		item_id = Item_id;
	}
	/**
	 * 個数を取得するメソッド
	 * @return quantities
	 */
	public int getQuantites(){
		return quantities;
	}
	/**
	 * 個数を格納するメソッド
	 * @param Quantities
	 */
	public void setQuantities(int Quantities){
		quantities = Quantities;
	}
	/**
	 * 購入日を取得するメソッド
	 * @return purchased_day
	 */
	public String getPurchased_day(){
		return purchased_day;
	}
	/**
	 * 購入日を格納するメソッド
	 * @param Purchased_day
	 */
	public void setPurchased_day(String Purchased_day){
		purchased_day = Purchased_day;
	}


	/**
	 * 商品名を取得するメソッド
	 * @return item_name
	 */
	public String getItem_name(){
		return item_name;
	}
	/**
	 * 商品名を格納するメソッド
	 * @param Item_name
	 */
	public void setItem_name(String Item_name){
		item_name = Item_name;
	}
	/**
	 * 販売日を取得するメソッド
	 * @return　release_day
	 */
	public String getRelease_day(){
		return release_day;
	}
	/**
	 * 販売日を格納するメソッド
	 * @param Release_day
	 */
	public void setRelease_day(String Release_day){
		release_day = Release_day;
	}
	/**
	 * 著者を取得するメソッド
	 * @return author
	 */
	public String getAuthor(){
		return author;
	}
	/**
	 * 著者を格納するメソッド
	 * @param Author
	 */
	public void setAuthor(String Author){
		author = Author;
	}
	/**
	 * 値段を取得するメソッド
	 * @return price
	 */
	public int getPrice(){
		return price;
	}
	/**
	 * 値段を格納するメソッド
	 * @param Price
	 */
	public void setPrice(int Price){
		price = Price;
	}


	public void setSession(Map<String, Object> session) {
		this.session = session;

	}
	public Map<String, Object> getsession(){
		return session;
	}


}
