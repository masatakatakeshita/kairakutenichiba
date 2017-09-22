package com.internousdev.kairakutenichiba.action;

import com.internousdev.kairakutenichiba.dao.AdminDeleteDAO;
import com.opensymphony.xwork2.ActionSupport;

/**
<<<<<<< HEAD
 * 商品情報削除画面への遷移時、削除する商品データを取得するクラス
 * @author
=======
 * 商品情報を削除するクラス
 * @author
 * @since
 * @version
>>>>>>> branch 'master' of https://github.com/internousdevwork/kairakutenichiba
 */
public class AdminItemDeleteAction extends ActionSupport{

<<<<<<< HEAD
	/**
	 * シリアルID
	 */
	private static final long serialVersionUID = 2281123274036546024L;
=======
	private static final long serialVersionUID = 8523447612582469504L;

>>>>>>> branch 'master' of https://github.com/internousdevwork/kairakutenichiba


	/**
	 * 商品ID
     */

	private int itemId;

	/**
	 * デリートキー
     */

	private int delete=0;




	/**
	 * 商品のデリートキーをtrueにするクラス
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
	  public int getDelete(){return delete;}






}
