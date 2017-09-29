/**
 *
 */
package com.internousdev.kairakutenichiba.action;

import java.util.ArrayList;

import com.internousdev.kairakutenichiba.dao.AdminItemDAO;
import com.internousdev.kairakutenichiba.dto.ItemDTO;
import com.opensymphony.xwork2.ActionSupport;

/**
* 商品一覧を表示するクラス
* @version 1.0
*
*/
public class AdminItemAction extends ActionSupport{

	/**
	 * シリアルID
	 */
	private static final long serialVersionUID = -181035513965129116L;

	
	private ArrayList<ItemDTO> itemList;

	/**
	 * 商品リストを取得するメソッド

	 */
	public String execute(){
		String result =ERROR;
System.out.println("さすがに？");
		
		AdminItemDAO dao=new AdminItemDAO();
		itemList=dao.select();
		
		if(itemList.size()>0){
			result=SUCCESS;
		}

		return result;
	}
	
	
	public ArrayList<ItemDTO> getItemList(){
		return itemList;
	}
	
	public void setItemList(ArrayList<ItemDTO> itemList){
		this.itemList=itemList;
	}

}