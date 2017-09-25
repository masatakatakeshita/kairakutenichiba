package com.internousdev.kairakutenichiba.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.kairakutenichiba.dao.CartItemDeleteDAO;
import com.internousdev.kairakutenichiba.dao.GoCartDAO;
import com.internousdev.kairakutenichiba.dto.CartDTO;
import com.internousdev.kairakutenichiba.util.CartAssist;

/**
 *  カート内の商品を削除するクラス
 * @author　shoji hayato
 */

public class CartItemDeleteAction extends CartAssist implements SessionAware {

    /**
     * シリアルID
     */
    private static final long serialVersionUID = -1599187507724872727L;

    /**
     * 合計金額
     */
    private float amountAll;

    /**
     * 数量
     */
    private int quantities;

    /**
     * ユーザーID
     */
    private int userId;

    /**
     * 商品ID
     */
    private int itemId;

   
    /**
     * 　セッション情報
     */
    private Map<String, Object> session;

    /**
     * 　検索したカート内の商品の情報を入れるリスト
     */
    private List<CartDTO> cartList = new ArrayList<>();
   

    /**
     * カート内の商品を削除するメソッド
     * @author　shoji hayato
     * @since 17/09/25
     * @version 1.0
     */

     /**
     * 実行メソッド 処理内容と順番 
     * 1：ログインしているかを確認
     * 2：カートからその商品のデータを削除
     * 3：カートの情報を取得
     */
    
    
    public String execute(){
        String result = ERROR;
        amountAll=0;

        if (session.containsKey("userId")) {
            userId = (int) session.get("userId");
            CartItemDeleteDAO deletedao=new CartItemDeleteDAO();
            if(deletedao.delete(userId,itemId)>0){
            	result=SUCCESS;
            }
            
            GoCartDAO cartdao= new GoCartDAO();
            cartList=cartdao.selectedItem(userId);
            for(int i=0;i<cartList.size();i++){
            	amountAll += (cartList.get(i).getPrice()*cartList.get(i).getQuantities());
            }
            

        }
        return result;
    }

    /**
     * ユーザーIDを取得するためのメソッド
     * @return userId ユーザーID
     */
    public int getUserId() {
        return userId;
    }

    /**
     * ユーザーIDを格納するためのメソッド
     * @param userId セットする userId
     */
    public void setUserId(int userId) {
        this.userId = userId;
    }

    /**
     * セッションを取得するためのメソッド
     * @return session セッション情報
     */
    public Map<String, Object> getSession() {
        return session;
    }

    /**
     * セッションを格納するためのメソッド
     * @param session セットする session
     */
    public void setSession(Map<String, Object> session) {
        this.session = session;
    }

    /**
     * カート内の商品情報を取得するためのメソッド
     * @return cartList カート内の商品情報
     */
    public List<CartDTO> getCartList() {
        return cartList;
    }

    /**
     * カート内の商品情報を格納するためのメソッド
     * @param cartList セットする cartList
     */
    public void setCartList(List<CartDTO> cartList) {
        this.cartList = cartList;
    }

    /**
     * シリアルIDを取得するメソッド
     * @return serialversionuid シリアルID
     */
    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    /**
     * 合計金額を取得するメソッド
     * @return amountAll 合計金額
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
     * 数量を取得するメソッド
     * @return quantities 数量
     */
    public int getQuantities() {
        return quantities;
    }

    /**
     * カート内の商品数を格納するメソッド
     * @param quantities セットする quantities
     */
    public void setQuantities(int quantities) {
        this.quantities = quantities;
    }

   


}
