/**
 * 
 */
package com.internousdev.kairakutenichiba.action;

import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.kairakutenichiba.dao.GoCartDAO;
import com.internousdev.kairakutenichiba.dao.PurchaseCompleteDAO;
import com.internousdev.kairakutenichiba.dto.CartDTO;
import com.internousdev.kairakutenichiba.dto.CreditDTO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 決済をするクラス
 */
public class PurchaseCompleteAction extends ActionSupport implements SessionAware {

	/**
	 * シリアルID
	
	 */
	private static final long serialVersionUID = 3692422332609482760L;

	/**
	 * ユーザー（お客様）ID
	 */
	private int userId;
	/**
	 * セッション情報
	 */
	private Map<String, Object> session;
	/**
	 * カード番号
	 */
	private String creditNumber;
	
	/**
	 * 配送方法
	 */
	private String delivery; 
	
	/**
	 * 合計金額
	 */
	private float amountAll;
	/**
	 * 商品名
	 */
	private String itemsName;

	/**
	 * カートのリスト
	 */
	private ArrayList<CartDTO> cartList = new ArrayList<CartDTO>();

	/**
	 * 決済をするための実行メソッド
	 */
	public String execute() {

		String result = ERROR;

		//セッション切れでないか？ＯＫなら次へ進む
		
		if (session.containsKey("userId")) {
			userId = (int)session.get("userId");
			GoCartDAO cart=new GoCartDAO();
			


			
					result = SUCCESS;
				}
		}
		return result;
	}


	/**
	 * ユーザー（お客様）IDを取得するメソッド
	 * @return userId　ユーザー（お客様）ID
	 */
	public int getUserId() {
		return userId;
	}


	/**
	 * ユーザー（お客様）IDを格納するメソッド
	 * @param userId セットする userId
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}


	/**
	 * セッション情報を取得するメソッド
	 * @return session　セッション情報
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
	 * カード番号を取得するメソッド
	 * @return creditNumber　クレジット番号
	 */
	public String getCreditNumber() {
		return creditNumber;
	}


	/**
	 * カード番号を格納するメソッド
	 * @param creditNumber セットする creditNumber
	 */
	public void setCreditNumber(String creditNumber) {
		this.creditNumber = creditNumber;
	}


	/**
	 * カード会社を取得するメソッド
	 * @return creditId　カード会社
	 */
	public int getCreditId() {
		return creditId;
	}


	/**
	 * カード会社を格納するメソッド
	 * @param creditId セットする creditId
	 */
	public void setCreditId(int creditId) {
		this.creditId = creditId;
	}


	/**
	 * カートリストを取得するメソッド
	 * @return cartList　カートリスト
	 */
	public ArrayList<CartDTO> getCartList() {
		return cartList;
	}


	/**
	 * カートリストを格納するメソッド
	 * @param cartList セットする cartList
	 */
	public void setCartList(ArrayList<CartDTO> cartList) {
		this.cartList = cartList;
	}


	/**
	 * 合計金額を取得するメソッド
	 * @return amountAll　合計金額
	 */
	public float getAmountAll() {
		return amountAll;
	}


	/**
	 * 合計金額を格納するメソッド
	 * @param amountAll セットする amountAll
	 */
	public void setAmountAll(float amountAll) {
		this.amountAll = amountAll;
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
	 * クレジットリストを格納するメソッド
	 * @param creditList セットする creditList
	 */
	public void setCreditList(ArrayList<CreditDTO> creditList) {
		this.creditList = creditList;
	}

}