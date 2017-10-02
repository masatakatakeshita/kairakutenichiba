package com.internousdev.kairakutenichiba.action;

import java.util.ArrayList;

import com.internousdev.kairakutenichiba.dao.AdminDeleteDAO;
import com.internousdev.kairakutenichiba.dao.AdminItemDAO;
import com.internousdev.kairakutenichiba.dto.ItemDTO;
import com.opensymphony.xwork2.ActionSupport;


/**
 * 商品情報を削除するクラス
 */
public class AdminItemDeleteAction extends ActionSupport{


	/**
	 * シリアルID
	 */
	private static final long serialVersionUID = 2281123274036546024L;
	/**
	 * 商品ID
     */
	private int item_id;

	private ArrayList<ItemDTO> itemList;



	/**
	 * 商品を削除する
     */
	public String execute() {
		String result =ERROR;
		int deleted=0;

		AdminDeleteDAO dao= new AdminDeleteDAO();	
		deleted=dao.delete(item_id);
		
		if(deleted>0){
			result = SUCCESS;
			
			AdminItemDAO dao2=new AdminItemDAO();
			itemList=dao2.select();
			
			if(itemList.size()>0){
				result=SUCCESS;
			}
		}

		return result;
	}


	  /**
	   * 商品IDを取得するメソッド
       *  @param itemId　セットする　itemId
       */

	  public void setItem_id(int item_id){
		  this.item_id=item_id;
	  }

	  /**
	   *商品IDを格納するメソッド
	   * @return itemId 商品ID
	   */
	  public int getItem_id(){
		  return item_id;
	  }


	/**
	 * @return itemList
	 */
	public ArrayList<ItemDTO> getItemList() {
		return itemList;
	}


	/**
	 * @param itemList セットする itemList
	 */
	public void setItemList(ArrayList<ItemDTO> itemList) {
		this.itemList = itemList;
	}




}
