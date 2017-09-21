
package com.internousdev.kairakutenichiba.action;

import com.internousdev.kairakutenichiba.dao.AdminItemInsertDAO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 
 */

/**
 * @author junpeikoizumi
 *JSPでs:textfieldに入力された情報をDBのitemsに追加する。
 *Actionでjspの変数を受ける
 *↓
 *引数にしてDAOを起動
 *↓
 *DAOのString sql=insert into db_name.tbl_name (col_name1, col_name2, ...)
  VALUES (value1, value2, ...);]
 */
public class AdminItemInsertAction extends ActionSupport{

	private int itemId;
	
	private String itemName;
	
	private String category;
	
	private String releaseday;
	
	private String author;
	
	private String publisher;
	
	private String publishtype;
	
	private int page;
	
	private int ISBN;
	
	private int price;
	
	private int stocks;
	
	private int sales;
	
	private String itemdetail;
	
	private String itemimagePass;
	
	private boolean deleteFlag;	//if deleteがtrueかfalseでjspに表示、非表示か判定できるための仕組みだった
	
	private String RegisteredDay;
	
	private String UpdatedDay;
	
	private String duplication;	//重複のための文字判定
	

	public String execute(){
		String result = ERROR;
		AdminItemInsertDAO dao = new AdminItemInsertDAO();
//daoではそうか、すでに存在しているテーブルであったなら削除スべきだな。		
		if(dao.duplication(itemId,itemName) == false){
			setDuplication("エラー：同名の商品と商品IDが存在しています");
		}else{
			dao.insert(itemId,itemName,category,releaseday,author,publisher,publishtype,page,ISBN,price,stocks,sales,itemdetail,itemimagePass,deleteFlag,RegisteredDay,UpdatedDay);	//こいつ実行すればDB書き換わる。
			result = SUCCESS;
		}
		return result;
	}


	private void setDuplication(String duplication) {
		this.duplication = duplication;	
	}
	
	/**
	 * set,getメソッド
	 */
	
	
}
