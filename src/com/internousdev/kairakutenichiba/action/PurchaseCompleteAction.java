/**
 * 
 */
package com.internousdev.kairakutenichiba.action;

import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.kairakutenichiba.dao.CreditInsertDAO;
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
	 * カード会社
	 */
	private int creditId;
	/**
	 * 合計金額
	 */
	private float amountAll;
	/**
	 * 商品名
	 */
	private String itemsName;

	/**
	 * カート、クレジットのリスト
	 */
	private ArrayList<CartDTO> cartList = new ArrayList<CartDTO>();
	private ArrayList<CreditDTO> creditList = new ArrayList<CreditDTO>();

	/**
	 * 決済をするための実行メソッド
	 */
	public String execute() {

		String result = LOGIN;

		//セッション切れでないか？ＯＫなら次へ進む
		
		if (session.containsKey("userId")) {
			userId = (int)session.get("userId");


			PurchaseCompleteDAO dao = new PurchaseCompleteDAO();
			CreditInsertDAO creDao = new CreditInsertDAO();
			GoCartDAO dao3 = new GoCartDAO();

			cartList = dao3.selectedItem(userId);
			creditList = creDao.selectCredit(userId);

				if (dao.stockCheck(cartList)=="OK") { //在庫切れでないか？ＯＫなら次へ進む
					dao.purchase(userId); //購入情報をインサート
					dao.stockUpdate(userId); //商品情報の在庫を減少
					dao.salesUpdate(userId); //商品情報の売り上げを増加
					dao.clean(userId); //カート情報を削除
					for (int i = 0; i < cartList.size(); i++) {
						amountAll += (cartList.get(i).getPrice()) * (cartList.get(i).getQuantities());
					}

					creDao.selectInsert(creditList.get(0).getCreditType(), creditList.get(0).getCreditNumber(), (int)amountAll); //オープンコネクトの購入お支払履歴に情報をインサート
					creDao.cleanCredit(userId); //クレジットカード情報を削除
					result = SUCCESS;
				}else if(dao.stockCheck(cartList)=="NG"){
					}else{
						itemsName = dao.stockCheck(cartList);
						System.out.println(dao.stockCheck(cartList));
					result = ERROR;
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
	 * クレジットリストを取得するメソッド
	 * @return creditList　クレジットリスト
	 */
	public ArrayList<CreditDTO> getCreditList() {
		return creditList;
	}


	/**
	 * クレジットリストを格納するメソッド
	 * @param creditList セットする creditList
	 */
	public void setCreditList(ArrayList<CreditDTO> creditList) {
		this.creditList = creditList;
	}

}