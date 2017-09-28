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
	 * 商品ID
	 */
	private int item_id;


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
		if(displayList.size() > 0) {
			result = SUCCESS;
		}
		return result;
	}
	
	public ArrayList<ItemDTO> getDisplayList(){
		return displayList;
	}
	
	public void setDisplayList(ArrayList<ItemDTO> displayList){
		this.displayList=displayList;
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


}