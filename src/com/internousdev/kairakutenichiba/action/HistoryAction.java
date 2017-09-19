
package com.internousdev.kairakutenichiba.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.kairakutenichiba.dao.HistoryUserDAO;
import com.internousdev.kairakutenichiba.dao.HistroyItemDAO;
import com.internousdev.kairakutenichiba.dto.HistoryItemDTO;
import com.internousdev.kairakutenichiba.dto.HistoryUserDTO;
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
	//sessionから取得	itemDAOの引数に使う。
	private Object userId;
	//execute内部で下記をぶち込むようにする。
//	= session.get("userId");
		
	
	//UserDTO
	private int item_id;
	
	private int quantities;
	
	private String multiplied_price;	 //DBのdecimalのデータ型は無視でいい？

	private String purchased_day;	//テーブルのpurchased_atフィールド
	
	//ItemDTO
	private String item_name;
	
	private String release_day;
	
	private String author;
	
	private int price;		
	
	
	private Map<String, Object> session;
	
	
	
	public String execute(){
		String ret = ERROR;		//エラーなら購入履歴なしの素画面が表示。
		HistoryUserDAO userdao = new HistoryUserDAO();
		HistroyItemDAO itemdao = new HistroyItemDAO();
		HistoryUserDTO userdto = new HistoryUserDTO();
		HistoryItemDTO itemdto = new HistoryItemDTO();
		
		//先にuserdao.selectの実行。item_idを探してくる。
		//ここは普通にjspにs:propertyで追加する。
		userdto = userdao.select(userId);
		this.item_id = userdto.getItem_id();
		this.quantities = userdto.getQuantites();
		this.multiplied_price = userdto.getMultplied_price();
		this.purchased_day = userdto.getPurchased_day();
		
		/**
		 * item_idを複数獲得したあとどうすればいい？
		 * そもそもdtoの時点でitem_idを配列にしないとだめか？
		 * quantitiesもarraylist.addしなきゃならん？
		 */
		//商品情報のメソッド。
		itemdto = itemdao.select(item_id);
		this.item_name = itemdto.getItem_name();
		this.release_day = itemdto.getRelease_day();
		this.author = itemdto.getAuthor();
		this.price = itemdto.getPrice();

		
		ret = SUCCESS; //ぶっちゃけERRORもSUCCESSも遷移先変わらない。
		return ret;
	}
	
	
	
	
//下記は何に使ってるのか？
	//UserDTO set・getメソッド	
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
	
	
	//ItemDTO　　set・getメソッド
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
