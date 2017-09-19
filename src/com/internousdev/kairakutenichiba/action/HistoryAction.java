
package com.internousdev.kairakutenichiba.action;

import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.kairakutenichiba.dao.HistoryDAO;
import com.internousdev.kairakutenichiba.dto.HistoryDTO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author junpei koizumi
 *
 */
public class HistoryAction extends ActionSupport implements SessionAware{
	
	

	private static final long serialVersionUID = -6191919096571968987L;


	/**
	 * どんな変数がいるだろう？
	 * userId は session.get("userId");　で最初に取得する必要ある
	 */

	private int userId; //	= session.get("userId");?

	private int item_id;
	
	private int quantities;
	
	private String multiplied_price;	

	private String purchased_day;	

	private String item_name;
	
	private String release_day;
	
	private String author;
	
	private int price;		
	
//	private String imgPath;		もし画像追加するなら
	
	private Map<String, Object> session;
	
	private ArrayList<HistoryDTO> HisotryList = new ArrayList<HistoryDTO>();
		//iterateで表示するためのリスト。オブジェクト作成
	
	
	public String execute(){
		String ret = ERROR;		//エラーなら購入履歴なしの素画面が表示。
		
		if(session.containsKey("userId")){
			this.userId = (int) session.get("userId");		//(int)はobject→int型への変換
			
			HistoryDAO dao = new HistoryDAO();
			HisotryList = dao.select(userId);
			ret = SUCCESS; //ぶっちゃけERRORもSUCCESSも遷移先変わらない。		
		}
		return ret;
	}
	
	
	
	
//下記は何に使ってるのか？
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




	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}




//list
	public ArrayList<HistoryDTO> getHisotryList() {
		return HisotryList;
	}

	public void setHisotryList(ArrayList<HistoryDTO> hisotryList) {
		HisotryList = hisotryList;
	}


	
	

}
