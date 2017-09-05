/**
 *
 */
package com.internousdev.kairakutenichiba.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.kairakutenichiba.dao.AdminDeleteDAO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author internousdev
 *商品情報を削除するクラス
 */
public class AdminDeleteAction extends ActionSupport implements SessionAware{

	/**
	 * シリアルID
	 *
     *
     * @version 1.0
     */
	private static final long serialVersionUID = -77673208310376350L;

	/**
	 * 商品ID
	 *
     *
     * @version 1.0
     */

	private int itemId;

	/**
	 * デリートキー
	 *
     *
     * @version 1.0
     */

	private int delete=0;

	/**
	 * 商品のデリートキーをtrueにするクラス
	 *
     *
     * @version 1.0
     */
	public String execute() {
		String result =ERROR;
		int deleted=0;

		AdminDeleteDAO dao= new AdminDeleteDAO();

		if(delete==1){
			deleted=dao.delete(itemId);
		}
		if(deleted>0){
			result = SUCCESS;
		}

		return result;
	}


	  /**
	   * 商品IDを取得するメソッド
       *  @param itemId　セットする　itemId
       */

	  public void setItemId(int itemId){this.itemId=itemId;}

	  /**
	   *商品IDを格納するメソッド
	   * @return itemId 商品ID
	   */
	  public int getItemId(){return itemId;}


	  /**
	   * 削除を格納するメソッド
       *  @param delete　セットする delete
       */

	  public void setDelete(int delete){this.delete = delete;}

	  /**
	   * 削除を取得するメソッド
	   * @return delete 削除
	   */
	  public int getDelete(){return delete;
	  }


	@Override
	public void setSession(Map<String, Object> arg0) {
		// TODO 自動生成されたメソッド・スタブ

	}
}