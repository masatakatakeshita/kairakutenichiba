/**
 *
 */
package com.internousdev.kairakutenichiba.action;

import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.kairakutenichiba.dao.CreditCheckDAO;
import com.internousdev.kairakutenichiba.dao.CreditInsertDAO;
import com.internousdev.kairakutenichiba.dao.GoCartDAO;
import com.internousdev.kairakutenichiba.dao.MyPageDAO;
import com.internousdev.kairakutenichiba.dto.CartDTO;
import com.internousdev.kairakutenichiba.dto.CreditDTO;
import com.internousdev.kairakutenichiba.dto.MyPageDTO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * クレジットの情報を照合し、情報を格納するクラス
 * @version 1.0
 */

public class PaymentAction extends ActionSupport implements SessionAware{

	/**
	 * シリアルID
	 *
	 *
	 * @version 1.0
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * ユーザーID
	 *
	 *
	 * @version 1.0
	 */
	private int userId;
	/**
	 * クレジット種類
	 *
	 *
	 * @version 1.0
	 */
	private int creditId;
	/**
	 * クレジット番号
	 *
	 *
	 * @version 1.0
	 */
	private String creditNumber;
	/**
	 * クレジット名義
	 *
	 *
	 * @version 1.0
	 */
	private String nameE;
	/**
	 * セキュリティコード
	 *
	 *
	 * @version 1.0
	 */
	private String securityCode;
	/**
	 * 有効期限（月）
	 *
	 *
	 * @version 1.0
	 */
	private int expirationMonth;
	/**
	 * 有効期限（年）
	 *
	 *
	 * @version 1.0
	 */
	private int expirationYear;
	/**
	 * セッション情報
	 *
	 *
	 * @version 1.0
	 */
	private Map<String,Object>session;
	/**
	 * カード番号上6ケタ
	 *
	 *
	 * @version 1.0
	 */
	private String checkNumber;
	/**
	 * 合計金額
	 *
	 *
	 * @version 1.0
	 */
	private float amountAll;

	/**
	 * 上からユーザー情報、クレジット情報、カート情報を入れるアレイリストたち
	 *
	 *
	 * @version 1.0
	 */
	public ArrayList<MyPageDTO> usersList = new ArrayList<MyPageDTO>();
	private ArrayList<CreditDTO> creditList = new ArrayList<CreditDTO>();
	private ArrayList<CartDTO> cartList = new ArrayList<CartDTO>();


	/**
	 * クレジットカード情報の照合、格納を実行するメソッド
	 *
	 *
	 * @version 1.0
	 */
	public String execute() {

		String result = ERROR;
		Boolean loginFlg = false;
		Boolean creditFlg = false;
		CreditDTO userInfoDto = null;
		MyPageDAO myDao = new MyPageDAO();
		GoCartDAO goCartDao = new GoCartDAO();

		CreditCheckDAO daoC = new CreditCheckDAO();

	/*** ログアウトしてないかの確認。すべてＯＫだったらloginFlgをtrue ***/
		if(session.get("userId") != null){
			userId = (int)session.get("userId");
			loginFlg = true;
		}



	/*** 入力されたカード情報の確認。すべてＯＫだったらcreditFlgをtrue ***/

		//カード番号上6ケタがm_creditcard_typeのテーブル内にあるか
		checkNumber = getCreditNumber().substring(0, 6);
		if (daoC.select(creditId, checkNumber)) {

			//カード番号16ケタとセキュリティコードに間違いがないか
			userInfoDto = daoC.selectUserInfo(creditId, creditNumber);
			if(creditNumber.equals(userInfoDto.getCreditNumber())){
				if(Integer.parseInt(securityCode) == userInfoDto.getSecurityCode()){

					//有効期限に間違えがないか
					//visaのDBに有効期限が見当たらないので、visaは問答無用でtrue
					if(creditId==1){
						creditFlg = true;
					}else{
						if(expirationYear ==userInfoDto.getExpirationYear()){
							if(expirationMonth ==userInfoDto.getExpirationMonth()){
								creditFlg = true;
							}
						}
					}
				}
			}

		}

	/*** フラグの確認 ***/
		if(loginFlg == true){
			if(creditFlg == true){

				/*** すべてのフラグがＯＮだったので、諸々の処理をする ***/
				CreditInsertDAO creInsertDao = new CreditInsertDAO();

				//クレジットテーブルに情報を入れる
				if (creInsertDao.search(userId) == false) {
					creInsertDao.insert(userId, creditId, creditNumber, nameE, securityCode, expirationMonth,expirationYear);
					result = SUCCESS;
					}else{
						//すでに同じユーザーＩＤでクレジット情報が入っていたら、古いのを消して新しいのを入れる
						creInsertDao.cleanCredit(userId);
						creInsertDao.insert(userId, creditId, creditNumber, nameE, securityCode, expirationMonth,expirationYear);
						result = SUCCESS;
					}
				//アレイリストに情報を入れる
				usersList = myDao.select(userId);
				cartList = goCartDao.selectedItem(userId);
				creditList = creInsertDao.selectCredit(userId);
				//合計金額の計算
				for (int i = 0; i < cartList.size(); i++) {
					amountAll += (cartList.get(i).getPrice()) * (cartList.get(i).getQuantities());
					}
			}
		}else{
	/*** セッション切れだった場合の処理 ***/
			result = LOGIN;
		}
		return result;
	}




	/**
	 * ユーザIDを取得するメソッド
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
	 * クレジットIDを取得するメソッド
	 * @return creditId　クレジットID
	 */
	public int getCreditId() {
		return creditId;
	}

	/**
	 * クレジットIDを格納するメソッド
	 * @param creditId セットする creditId
	 */
	public void setCreditId(int creditId) {
		this.creditId = creditId;
	}

	/**
	 * クレジット番号を取得するメソッド
	 * @return creditNumber　クレジット番号
	 */
	public String getCreditNumber() {
		return creditNumber;
	}

	/**
	 * クレジット番号を格納するメソッド
	 * @param creditNumber セットする creditNumber
	 */
	public void setCreditNumber(String creditNumber) {
		this.creditNumber = creditNumber;
	}

	/**
	 * クレジット名義を取得するメソッド
	 * @return nameE　クレジット名義
	 */
	public String getNameE() {
		return nameE;
	}

	/**
	 * クレジット名義を格納するメソッド
	 * @param nameE セットする nameE
	 */
	public void setNameE(String nameE) {
		this.nameE = nameE;
	}

	/**
	 * セキュリティコードを取得するメソッド
	 * @return securityCode　セキュリティコード
	 */
	public String getSecurityCode() {
		return securityCode;
	}

	/**
	 * セキュリティコードを格納するメソッド
	 * @param securityCode セットする securityCode
	 */
	public void setSecurityCode(String securityCode) {
		this.securityCode = securityCode;
	}

	/**
	 * 有効期限（月）を取得するメソッド
	 * @return expirationMonth　有効期限（月）
	 */
	public int getExpirationMonth() {
		return expirationMonth;
	}

	/**
	 * 有効期限（月）を格納するメソッド
	 * @param expirationMonth セットする expirationMonth
	 */
	public void setExpirationMonth(int expirationMonth) {
		this.expirationMonth = expirationMonth;
	}

	/**
	 * 有効期限（年）を取得するメソッド
	 * @return expirationYear　有効期限（年）
	 */
	public int getExpirationYear() {
		return expirationYear;
	}

	/**
	 * 有効期限（年）を格納するメソッド
	 * @param expirationYear セットする expirationYear
	 */
	public void setExpirationYear(int expirationYear) {
		this.expirationYear = expirationYear;
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
	 * カード番号上6桁を取得するメソッド
	 * @return checkNumber　カード番号上6桁
	 */
	public String getCheckNumber() {
		return checkNumber;
	}

	/**
	 * カード番号上6桁を格納するメソッド
	 * @param checkNumber セットする checkNumber
	 */
	public void setCheckNumber(String checkNumber) {
		this.checkNumber = checkNumber;
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
	 * ユーザー情報リストを取得するメソッド
	 * @return usersList　ユーザー情報リスト
	 */
	public ArrayList<MyPageDTO> getUsersList() {
		return usersList;
	}

	/**
	 * ユーザー情報リストを格納するメソッド
	 * @param usersList セットする usersList
	 */
	public void setUsersList(ArrayList<MyPageDTO> usersList) {
		this.usersList = usersList;
	}

	/**
	 * クレジット情報リストを取得するメソッド
	 * @return creditList　クレジット情報リスト
	 */
	public ArrayList<CreditDTO> getCreditList() {
		return creditList;
	}

	/**
	 * クレジット情報リストを格納するメソッド
	 * @param creditList セットする creditList
	 */
	public void setCreditList(ArrayList<CreditDTO> creditList) {
		this.creditList = creditList;
	}

	/**
	 * カード情報リストを取得するメソッド
	 * @return cartList　カード情報リスト
	 */
	public ArrayList<CartDTO> getCartList() {
		return cartList;
	}

	/**
	 * カード情報リストを格納するメソッド
	 * @param cartList セットする cartList
	 */
	public void setCartList(ArrayList<CartDTO> cartList) {
		this.cartList = cartList;
	}

}