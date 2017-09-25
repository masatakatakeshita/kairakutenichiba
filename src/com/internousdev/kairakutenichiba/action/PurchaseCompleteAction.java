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
	 * 在庫を確認する。0のときは在庫がある。1以上のときは在庫が不足している。
	 */
	private int stockcheck;
	/**
	 * 売上数の更新が正常に行われたかを確認する。
	 */
	private int updatecount;
	

	/**
	 * 決済をするための実行メソッド
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
		    	
		        amountAll=amountAll+cartList.get(i).getSubtotal();
		    	if(cartList.get(i).getQuantities()>stocksdao.stocks(cartList.get(i).getItemId())){
		    		stockcheck++;
		    	}
		    }
		    
		    if(stockcheck==0){
		    	PurchaseIdDAO purchaseiddao=new PurchaseIdDAO();
		    	
		    	PurchaseOutlineDAO outlinedao=new PurchaseOutlineDAO();
		    	if(outlinedao.insert(1+purchaseiddao.count(),userId,amountAll,delivery,creditNumber)>0){
		    		PurchaseDetailDAO detaildao=new PurchaseDetailDAO();
		    		for(int i=0;i<cartList.size();i++){
		    		if(detaildao.insert(1+purchaseiddao.count(), userId,cartList.get(i).getItemId(),cartList.get(i).getQuantities(), cartList.get(i).getPrice())>0){
		    			ItemStocksUpdateDAO stocksupdatedao=new ItemStocksUpdateDAO();
		    			if(stocksupdatedao.itemstocksupdate(cartList.get(i).getItemId(),stocksdao.stocks(cartList.get(i).getItemId())-cartList.get(i).getQuantities())>0){
		    				ItemSalesDAO salesdao=new ItemSalesDAO();
		    				ItemSalesUpdateDAO salesupdatedao=new ItemSalesUpdateDAO();
		    			     updatecount=updatecount+salesupdatedao.itemsalesupdate(cartList.get(i).getItemId(),salesdao.sales(cartList.get(i).getItemId())+cartList.get(i).getQuantities());
		    						    				
		    			}
		    		}
		    		}
		    		if(updatecount==cartList.size()){
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
}


	

