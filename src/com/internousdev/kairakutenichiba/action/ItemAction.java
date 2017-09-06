/**
 * 
 */
package com.internousdev.kairakutenichiba.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.kairakutenichiba.dao.ItemDAO;
import com.internousdev.kairakutenichiba.dto.ItemDTO;
import com.opensymphony.xwork2.ActionSupport;


/**
* 商品一覧から商品の詳細情報を取得するクラス
*
* @author JUN KIKUCHI
* @since 2017/05/08
* @version 1.0
**/



public class ItemAction extends ActionSupport implements SessionAware{


/**
*シリアルID
*/
private static final long serialVersionUID = 1265651996185917162L;
/**
* 商品名
*/
 private String itemsName;
 /**
 * 商品ID
 */
 private int itemID;
 /**
  * 単価
  */
 private float price;
 /**
  * イメージファイルパス
  */
 private String imgPath;
 /**
  * 在庫数
  */
 private int stocks;
 /**
  * 商品詳細
  */
 private String itemDetail;
 /**
  * 売上数
  */
 private int sales;
 /**
  * 種類ID
  */
 private int sortId;
 /**
  * ジャンル
  */
 private String itemGenre;




 /**
  * 商品リスト
  */
 public ArrayList<ItemDTO> Item = new ArrayList<ItemDTO>();
/**
 * セッション情報
 */
 private Map<String,Object> session;


 /**
  * 商品情報を取得するメソッド
  */



 public String execute()throws SQLException{

	     String result=ERROR;
	     ItemDAO dao= new ItemDAO();
	     Item = dao.select();
	     if (Item.size()>0){

	    	 result = SUCCESS;
	     }
	     return result;
 }


/**
* 商品名を取得するメソッド
* @return itemsName　商品名
*/
public String getItemsName() {
	return itemsName;
}


/**
* 商品名を格納するメソッド
* @param itemsName セットする itemsName
*/
public void setItemsName(String itemsName) {
	this.itemsName = itemsName;
}


/**
* 商品IDを取得するメソッド
* @return itemID
*/
public int getItemID() {
	return itemID;
}


/**
* 商品IDを格納するメソッド
* @param itemID セットする itemID
*/
public void setItemID(int itemID) {
	this.itemID = itemID;
}


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
* イメージファイルパスを取得するメソッド
* @return imgPath　イメージファイルパス
*/
public String getImgPath() {
	return imgPath;
}


/**
* イメージファイルパスを格納するメソッド
* @param imgPath セットする imgPath
*/
public void setImgPath(String imgPath) {
	this.imgPath = imgPath;
}


/**
* 在庫数を取得するメソッド
* @return stocks　在庫数
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


/**
* 商品詳細を取得するメソッド
* @return itemDetail　商品詳細
*/
public String getItemDetail() {
	return itemDetail;
}


/**
* 商品詳細を格納するメソッド
* @param itemDetail セットする itemDetail
*/
public void setItemDetail(String itemDetail) {
	this.itemDetail = itemDetail;
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
* 種類IDを取得するメソッド
* @return sortId　種類ID
*/
public int getSortId() {
	return sortId;
}


/**
* 種類IDを格納するメソッド
* @param sortId セットする sortId
*/
public void setSortId(int sortId) {
	this.sortId = sortId;
}


/**
* 商品リストを取得するメソッド
* @return item　商品リスト
*/
public ArrayList<ItemDTO> getItem() {
	return Item;
}


/**
* 商品リストを格納するメソッド
* @param item セットする item
*/
public void setItem(ArrayList<ItemDTO> item) {
	Item = item;
}


/**
* セッション情報を取得するメソッド
* @return session　セッション
*/
public Map<String, Object> getSession() {
	return session;
}


/**
* セッション情報を格納するメソッド
* @param session セットする session
*/
public void setSession(Map<String, Object> session) {
	this.session = session;
}


/**
* ジャンルを取得するメソッド
* @return　itemGenre　ジャンル
*/
public String getItemGenre() {
	return itemGenre;
}


/**
* ジャンルを格納するメソッド
* @param itemGenre セットする itemGenre
*/
public void setItemGenre(String itemGenre) {
	this.itemGenre = itemGenre;
}


}
