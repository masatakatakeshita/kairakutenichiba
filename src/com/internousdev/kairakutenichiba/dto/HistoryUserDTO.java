

package com.internousdev.kairakutenichiba.dto;

import java.util.Map;


/**
 * @author junpei koizumi
 *
 */
public class HistoryUserDTO {
	
//	userIdはセッションで取得するから、ここにはいらないよな？
	/**
	 * 以下テーブル名:purchases_detail　から取得したデータの保存場所
	 */
	private int item_id;
	
	private int quantities;
	
	private String multiplied_price;	 //DBのdecimalのデータ型は無視でいい？

	private String purchased_day;	//テーブルのpurchased_atフィールド
	
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
	
	
	public void setSession(Map<String, Object> session) {
		this.session = session;

	}

	public Map<String, Object> getsession(){
		return session;
	}

	
}
