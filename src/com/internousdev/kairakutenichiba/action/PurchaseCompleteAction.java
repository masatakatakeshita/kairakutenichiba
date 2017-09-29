/**
 * 
 */
package com.internousdev.kairakutenichiba.action;

import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.kairakutenichiba.dao.CartDeleteDAO;
import com.internousdev.kairakutenichiba.dao.GoCartDAO;
import com.internousdev.kairakutenichiba.dao.ItemSalesDAO;
import com.internousdev.kairakutenichiba.dao.ItemSalesUpdateDAO;
import com.internousdev.kairakutenichiba.dao.ItemStocksDAO;
import com.internousdev.kairakutenichiba.dao.ItemStocksUpdateDAO;
import com.internousdev.kairakutenichiba.dao.PurchaseDetailDAO;
import com.internousdev.kairakutenichiba.dao.PurchaseIdDAO;
import com.internousdev.kairakutenichiba.dao.PurchaseOutlineDAO;
import com.internousdev.kairakutenichiba.dto.CartDTO;
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
	 * ユーザーID
	 */
	private int userId;
	/**
	 * セッション情報
	 */
	private Map<String, Object> session;
	/**
	 * カード番号
	 */
	private String str;
	
	/**
	 * 配送方法
	 */
	private String delivery; 
	
	/**
	 * 合計金額
	 */
	private int amountAll;


	/**
	 * カートのリスト
	 */
	private ArrayList<CartDTO> cartList = new ArrayList<CartDTO>();
	
	
	/**
	 * 在庫を確認する。0のときは在庫がある。1以上のときは在庫が不足している。
	 */
	private int stockcheck;
	
	/**
	 * 売上数の更新が正常に行われたかを確認する。
	 */
	private int updatecount;
	

	/**
	 * @author shoji hayato
	 * @since 170922
	 * @version 1.0
	 * 
	 * 決済をするための実行メソッド
	 * 1:セッションを持っているか確認する
	 * 2:userIdにセッションのuserIdを格納する
	 * 3:cartListにカートの情報を格納する
	 * 4:cartListを元に、カート内の合計金額を算出する
	 * 5:4のついでに、在庫を確認する
	 * 6:購入情報（大）のデータの数を調べ、購入情報（大）、購入情報（詳細）を登録する際の購入IDを決める。
	 * 7:購入情報（大）を登録する
	 * 8:購入情報（詳細）を登録する
	 * 9:商品の在庫を減らし、商品の売上を増やす
	 * 10:カートを空にする
	 */
	public String execute() {

		String result = ERROR;
		amountAll=0;
		stockcheck=0;
		updatecount=0;

		if (session.containsKey("userId")) {
			result="other";
			userId = (int)session.get("userId");
			GoCartDAO cartdao=new GoCartDAO();
		    cartList=cartdao.selectedItem(userId);
		    ItemStocksDAO stocksdao=new ItemStocksDAO();
		    for(int i=0;i<cartList.size();i++){
		    	
		        amountAll=amountAll+cartList.get(i).getSubtotalyen();
		    	if(cartList.get(i).getQuantities()>stocksdao.stocks(cartList.get(i).getItemId())){
		    		stockcheck++;
		    	}
		    }
		    if(stockcheck==0){
		    	PurchaseIdDAO purchaseiddao=new PurchaseIdDAO();
		    	int newPurchaseId=1+purchaseiddao.count();
		    	PurchaseOutlineDAO outlinedao=new PurchaseOutlineDAO();
		    	if(outlinedao.insert(newPurchaseId,userId,amountAll,delivery,str)>0){
		    		PurchaseDetailDAO detaildao=new PurchaseDetailDAO();
		    		for(int i=0;i<cartList.size();i++){
		    		if(detaildao.insert(newPurchaseId, userId,cartList.get(i).getItemId(),cartList.get(i).getQuantities(), cartList.get(i).getPriceyen())>0){
		    			ItemStocksUpdateDAO stocksupdatedao=new ItemStocksUpdateDAO();
		    			if(stocksupdatedao.itemstocksupdate(cartList.get(i).getItemId(),stocksdao.stocks(cartList.get(i).getItemId())-cartList.get(i).getQuantities())>0){
		    				ItemSalesDAO salesdao=new ItemSalesDAO();
		    				ItemSalesUpdateDAO salesupdatedao=new ItemSalesUpdateDAO();
		    			     updatecount=updatecount+salesupdatedao.itemsalesupdate(cartList.get(i).getItemId(),salesdao.sales(cartList.get(i).getItemId())+cartList.get(i).getQuantities());
		    						    				
		    			}
		    		}
		    		}
		    		if(updatecount==cartList.size()){
		   System.out.println("eeee"); 
		    			CartDeleteDAO delete=new CartDeleteDAO();
		    			if(delete.delete(userId)>0){
		    		result=SUCCESS;
		    			}
		    		}
		    	}
		    	
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
	public String getStr() {
		return str;
	}


	/**
	 * カード番号を格納するメソッド
	 * @param creditNumber セットする creditNumber
	 */
	public void setStr(String str) {
		this.str = str;
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
	public int getAmountAll() {
		return amountAll;
	}


	/**
	 * 合計金額を格納するメソッド
	 * @param amountAll セットする amountAll
	 */
	public void setAmountAll(int amountAll) {
		this.amountAll = amountAll;
	}
	
	public String getDelivery(){
		return delivery;
	}
	
	public void setDelivery(String delivery){
		this.delivery=delivery;
	}


}


	

