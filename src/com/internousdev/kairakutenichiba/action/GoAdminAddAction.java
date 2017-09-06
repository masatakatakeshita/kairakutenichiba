/**
 * 
 */
package com.internousdev.kairakutenichiba.action;
import java.util.ArrayList;

import com.internousdev.kairakutenichiba.dao.AdminItemDAO;
import com.internousdev.kairakutenichiba.dto.ItemDTO;
import com.opensymphony.xwork2.ActionSupport;

/**
* 商品追加画面へ移る時に新しい商品IDを取得してくるクラス
* @author Ryo Maeda
* @since 5/19
* @version 1.0
**/
public class GoAdminAddAction extends ActionSupport{


	/**
	 * シリアルID
	 */
	private static final long serialVersionUID = -3761377273662214412L;

	/**
	 *新商品ID
	 */
	private int newItemId;

	/**
	 *商品リスト
	 */
	public ArrayList<ItemDTO> itemList = new ArrayList<ItemDTO>();

	/**
	 *新商品IDを取得するメソッド
	 */
	public String execute() {
		AdminItemDAO dao = new AdminItemDAO();
		itemList=dao.select("");
		newItemId=itemList.size()+1;

		return SUCCESS;


	}

	/**
	 * 新商品IDを格納するメソッド
	 * @param newItemId　セットする newItemId
	 */
	public void setNewItemId(int newItemId){
		this.newItemId=newItemId;
	}

	/**
	 * 新商品を取得するメソッド
	 * @return　newItemId　新商品ID
	 */
	public int getNewItemId(){
		return newItemId;
	}
}
