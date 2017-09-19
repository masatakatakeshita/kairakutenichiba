

package com.internousdev.kairakutenichiba.dto;

import java.util.Map;


/**
 * @author junpei koizumi
 *
 */
public class HistoryDTO {
	
	/**
	 * 以下テーブル名:purchases_detail　から取得したデータの保存場所
	 */
	private int item_id;
	
	private int quantities;
	
	private String multiplied_price;	

	private String purchased_day;	//テーブルのpurchased_atフィールド
	
	
	
	/**
	 * 以下テーブル名：items  から取得したデータの保存場所
	 * 
	 * こっちのDTOはDBからの値を繰り返すためにArryaListで配列化
	 * 配列.lengthで商品名の種類個数をforで繰り返す。
	 * 
	 */ 
	private String item_name;
	
	private String release_day;
	
	private String author;
	
	private int price;		//単価
	
	private Map<String, Object> session;

	
//	private String item_image; //画像のURL。煩雑になりそうなので後回し
	
	
	/**
	 * 以下アクセスメソッド。get set
	 */
	public int getItem_id(){
		return item_id;
	}
	public void setItem_id(int Item_id){
		item_id = Item_id;
	}
	
	public int getQuantites(){
		return quantities;
	}
	public void setQuantities(int Quantities){
		quantities = Quantities;
	}
	
	public String getMultplied_price(){
		return multiplied_price;
	}
	public void setMultiplied_price(String Multiplied_price){
		multiplied_price = Multiplied_price;
	}
	
	public String getPurchased_day(){
		return purchased_day;
	}
	public void setPurchased_day(String Purchased_day){
		purchased_day = Purchased_day;
	}
	
	
	//
	public String getItem_name(){
		return item_name;
	}
	public void setItem_name(String Item_name){
		item_name = Item_name;
	}
	
	public String getRelease_day(){
		return release_day;
	}
	public void setRelease_day(String Release_day){
		release_day = Release_day;
	}
	
	public String getAuthor(){
		return author;
	}
	public void setAuthor(String Author){
		author = Author;
	}
	
	public int getPrice(){
		return price;
	}
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
