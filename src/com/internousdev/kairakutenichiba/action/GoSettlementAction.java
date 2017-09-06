/**
 *
 */
package com.internousdev.kairakutenichiba.action;


import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.kairakutenichiba.dao.GoCartDAO;
import com.internousdev.kairakutenichiba.dto.CartDTO;

/**決済入力画面に遷移するためのクラス
 * @version 1.0
 */
public class GoSettlementAction extends CartAssist implements SessionAware {

	/**
	 * シリアルID
	 */
	private static final long serialVersionUID = 7888086354836331748L;

	/**
	 * ユーザーID
	 */
	private int userId;

	/**
	 * 合計金額
	 */
	private int payment;

	/**
	 * カート内に入ってる合計商品数
	 */
	private int order;

	/**
	 * エラーメッセージ
	 */
	private String errorMessage;

	/**
	 *カート内情報をリスト化
	 */
	private List<CartDTO> cartList = new ArrayList<>();

	/**
	 * セッション情報
	 */
	private Map<String, Object> session;


	/**
	 * 決済画面の遷移を実行するメソッド
	 * @version 1.0
	 */
	public String execute() throws SQLException{
		String result=ERROR;

		if (session.containsKey("userId")) {
			userId = (int)session.get("userId");

			GoCartDAO dao = new GoCartDAO();
			cartList = dao.selectedItem(userId);
			if(cartList.size() > 0){
			result = SUCCESS;
			}
		}else{
			result = LOGIN;
		}
		return result;
	}

	/**
	 * ユーザーIDを取得するメソッド
	 * @return userId　ユーザーID
	 */
	public int getUserId() {
		return userId;
	}

	/**
	 * ユーザーIDを格納するメソッド
	 * @param userId セットする userId
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}

	/**
	 * 合計金額を取得するメソッド
	 * @return payment　合計金額
	 */
	public int getPayment() {
		return payment;
	}

	/**
	 * 合計金額を格納するメソッド
	 * @param payment セットする payment
	 */
	public void setPayment(int payment) {
		this.payment = payment;
	}

	/**
	 * エラーメッセージを取得するメソッド
	 * @return errorMessage　エラーメッセージ
	 */
	public String getErrorMessage() {
		return errorMessage;
	}

	/**
	 * エラーメッセージを格納するメソッド
	 * @param errorMessage セットする errorMessage
	 */
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	/**
	 * カートの情報リストを取得するメソッド
	 * @return cartList　カート内情報リスト
	 */
	public List<CartDTO> getCartList() {
		return cartList;
	}

	/**
	 * カート内情報リストを格納するメソッド
	 * @param cartList セットする cartList
	 */
	public void setCartList(List<CartDTO> cartList) {
		this.cartList = cartList;
	}

	/**
	 * セッションを取得するメソッド
	 * @return session
	 */
	public Map<String, Object> getSession() {
		return session;
	}

	/**
	 * セッションを格納するメソッド
	 * @param session セットする session
	 */
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	/**
	 * シリアルIDを取得するメソッド
	 * @return serialversionuid　シリアルID
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/**
	 * カート内に入ってる合計商品数を取得するメソッド
	 * @return order　カート内に入ってる合計商品数
	 */
	public int getOrder() {
		return order;
	}

	/**
	 * カート内に入ってる合計商品数を格納するメソッド
	 * @param order セットする order
	 */
	public void setOrder(int order) {
		this.order = order;
	}



	}
