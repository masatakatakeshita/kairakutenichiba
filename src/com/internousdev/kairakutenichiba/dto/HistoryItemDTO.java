package com.internousdev.kairakutenichiba.dto;

import java.util.Map;

/**
 * @author Junepikoziumi
 *
 */
public class HistoryItemDTO {

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
	
	
	//別テーブルから取得
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
