/**
購入履歴画面に必要な情報を取ってくるための Actionクラス
 *
 */
package com.internousdev.kairakutenichiba.action;


import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.kairakutenichiba.dao.HistoryDAO;
import com.internousdev.kairakutenichiba.dto.HistoryDTO;
import com.opensymphony.xwork2.ActionSupport;


public class HistoryAction extends ActionSupport implements SessionAware{

	/**
	 * シリアルID
	 */
	private static final long serialVersionUID = -7129551593360374656L;


	/**
	 * ユーザーID
	 */
	private int userId;


	/**
	 * 商品ID
	 */


	private int itemId;

	/**
	 * 商品名
	 */

	private String itemsName="";

	/**
	 * 単価
	 */


	private float price;

	/**
	 * 数量
	 */


	private int quantities;

	/**
	 * 合計金額
	 */


	public float subtotal;


	/**
	 * 登録日
	 */

	private String createdAt;

	/**
	 * セッション情報（ログインユーザーID）
	 */

	private Map<String,Object> session;



	/**
	 * ユーザーの購入履歴リスト
	 */


	private ArrayList<HistoryDTO> HistoryList = new ArrayList<HistoryDTO>();


	/**
	 *ユーザーの購入履歴リストの生成メソッド
	 */
	public String execute() {
		String result = SUCCESS;
		userId = 0;


//		if (session.containsKey("userId")) {
//			userId = (int) session.get("userId");
//		}
		if (session.containsKey("userId")) {
			userId = (int) session.get("userId");
		}



		ArrayList<HistoryDTO> allList = new ArrayList<HistoryDTO>();
		HistoryDAO dao=new HistoryDAO();
		allList=dao.HistoryList(userId,"");
		int all=allList.size();
		for(int i=0;i<all;i++){
			HistoryDTO dto = new HistoryDTO();
			dto= allList.get(i);
			String str=dto.getItemsName();
			if(str.startsWith(itemsName)){
				HistoryList.add(dto);
			}

		}

		if(HistoryList.size() == 0){
			result=ERROR;
		}
		return result;
	}


	/**
	 * 以下ゲッターセッター部分
	 */


	/**
	 * ユーザーIDを取得するメソッド
	 * @return userId　ユーザーID
	 */
	public int getUserId() {
		return userId;
	}

	/**
	 * 会員IDを格納するメソッド
	 * @param userId セットする userId
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}

	/**
	 * 商品IDを取得するメソッド
	 * @return itemId　商品ID
	 */
	public int getItemId() {
		return itemId;
	}

	/**
	 * 商品IDを格納するメソッド
	 * @param itemId セットする itemId
	 */
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	/**
	 * 商品名を取得するメソッド
	 * @return itemsName　商品名
	 */
	public String getItemsName() {
		return itemsName;
	}

	/**
	 * 商品IDを格納するメソッド
	 * @param itemsName セットする itemsName
	 */
	public void setItemsName(String itemsName) {
		this.itemsName = itemsName;
	}

	/**
	 * 単価を取得するメソッド
	 * @return price　単価
	 */
	public float getPrice() {
		return price;
	}

	/**
	 * 単価を格納するメソッド
	 * @param price セットする price
	 */
	public void setPrice(float price) {
		this.price = price;
	}

	/**
	 * 数量を取得するメソッド
	 * @return quantities 数量
	 */
	public int getQuantities() {
		return quantities;
	}

	/**
	 * 数量を格納するメソッド
	 * @param quantities セットする quantities
	 */
	public void setQuantities(int quantities) {
		this.quantities = quantities;
	}

	/**
	 * 合計金額を取得するメソッド
	 * @return subtotal 合計金額
	 */
	public float getSubtotal() {
		return subtotal;
	}

	/**
	 * 合計金額を格納するメソッド
	 * @param subtotal セットする subtotal
	 */
	public void setSubtotal(float subtotal) {
		this.subtotal = subtotal;
	}

	/**
	 * 登録日を取得するメソッド
	 * @return createdAt 登録日
	 */
	public String getCreatedAt() {
		return createdAt;
	}

	/**
	 * 登録日を格納するメソッド
	 * @param createdAt セットする createdAt
	 */
	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	/**
	 * セッション情報を取得するメソッド
	 * @return session セッション情報
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
	 * ユーザーの購入履歴リストを格納するメソッド
	 * @return HistoryList ユーザーの購入履歴リスト
	 */
	public ArrayList<HistoryDTO> getHistoryList() {
		return HistoryList;
	}

	/**
	 * ユーザーの購入履歴リストを格納するメソッド
	 * @param HistoryList セットする HistoryList
	 */
	public void setHistoryList(ArrayList<HistoryDTO> HistoryList) {
		this.HistoryList = HistoryList;
	}


}
