
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
	
	
	/**
	 * シリアルID
	 */
	private static final long serialVersionUID = -6191919096571968987L;

	/**
	 * ユーザーID
	 * session.get("userId")
	 */
	private int userId;
	/**
	 * 商品ID
	 */
	private int item_id;
	/**
	 * 量
	 */
	private int quantities;
	/**
	 * 合計金額
	 */
	private String multiplied_price;	
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
	 * 価格
	 */
	private int price;		
	
//	private String imgPath;		もし画像追加するなら
	
	private Map<String, Object> session;
	
	private ArrayList<HistoryDTO> HisotryList = new ArrayList<HistoryDTO>();
	
	/**
	 * 購入履歴をDBから取得して表示するメソッド
	 * 1:セッションに保存されたuserIDを確認
	 * 2:userIDが存在するなら対応する販売履歴を作成
	 */
	public String execute(){
		String ret = ERROR;		
		
		if(session.containsKey("userId")){
			this.userId = (int) session.get("userId");		
			
			HistoryDAO dao = new HistoryDAO();
			HisotryList = dao.select(userId);
			ret = SUCCESS; 
		}
		return ret;
	}
	
	
	
	
	/**
	 * 商品IDを取得するメソッド
	 * @return　item_id
	 */
	public int getItem_id(){
		return item_id;
	}
	/**
	 * 商品IDを格納するメソッド
	 * @param Item_id
	 */
	public void setItem_id(int Item_id){
		item_id = Item_id;
	}
	/**
	 * 個数を取得するメソッド
	 * @return　quantities
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
	 * 合計金額を取得するメソッド
	 * @return　multiplied_price
	 */
	public String getMultplied_price(){
		return multiplied_price;
	}
	/**
	 * 合計金額を格納するメソッド
	 * @param Multiplied_price
	 */
	public void setMultiplied_price(String Multiplied_price){
		multiplied_price = Multiplied_price;
	}
	/**
	 * 購入日を取得するメソッド
	 * @return　purchased_day
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
	 * @return　item_name
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
	 * @return　author
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
	 * @return　price
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
	/**
	 * セッション情報を取得するメソッド
	 */
	public void setSession(Map<String, Object> session) {
		this.session = session;

	}
	/**
	 * セッション情報を格納するメソッド
	 * @return　session
	 */
	public Map<String, Object> getsession(){
		return session;
	}

	/**
	 * ユーザーIDを取得するメソッド
	 * @return　userId
	 */
	public int getUserId() {
		return userId;
	}
	/**
	 * ユーザーIDを格納するメソッド
	 * @param userId
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}

	/**
	 * HistoryDTOの配列化された情報を取得する
	 * @return　HisotryList
	 */
	public ArrayList<HistoryDTO> getHisotryList() {
		return HisotryList;
	}

	/**
	 * historyListにDTOの値を配列で格納する
	 * @param hisotryList
	 */
	public void setHisotryList(ArrayList<HistoryDTO> hisotryList) {
		HisotryList = hisotryList;
	}


	
	

}
