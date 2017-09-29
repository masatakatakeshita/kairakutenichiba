package com.internousdev.kairakutenichiba.action;

import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.kairakutenichiba.dao.GoCartDAO;
import com.internousdev.kairakutenichiba.dao.paymentDAO;
import com.internousdev.kairakutenichiba.dto.CartDTO;
import com.internousdev.kairakutenichiba.dto.paymentDTO;
import com.opensymphony.xwork2.ActionSupport;
/**
 * @author koizumi junpei
 * 2017/09/13
 */

public class PaymentAction extends ActionSupport implements SessionAware{


	/**
	 * シリアルID
	 */
	private static final long serialVersionUID = -6483616756501565137L;

	/**
	 * ユーザーID
	 */
	private int userId;
	/**
	 * visa,master,americanの場合分けの変数
	 */
	private String creditType;	//visa ,master, Americanの場合分け
	/**
	 * クレジットカードナンバー1
	 */
	private String creditNumber;

	private String card_no2;

	private String card_no3;

	private String card_no4;
	
	private String str;
//	StringBuilder buf = new StringBuilder();
//	buf.append(creditNumber);
//	buf.append(card_no2);
//	buf.append(card_no3);
//	buf.append(card_no4);
//	String str = buf.toString();


	
	/**
	 * クレジットカード名義
	 */
	private String nameHolder;
	/**
	 * セキュリティコード
	 */
	private String securityCode;
	/**
	 * 期限月
	 */
	private String expirationMonth; 
	/**
	 * 年
	 */
	private String expirationYear; 
	
	/**
	 * 配送方法
	 */
    private String deliverySelect;
	/**
	 * 配送日
	 */
	private String deliveryMonth;
	/**
	 * 配送時間
	 */
	private String deliveryTime;
	/**
	 * エラー
	 */
	private int whaterror;
	/**
	 * 金額合計
	 */
	private int amountAll;


	private Map<String, Object> session; 
	
	private ArrayList<CartDTO> cartList= new ArrayList<CartDTO>();
	


	/**
	 * DBのテーブルの値を入力値を比較。
	 * 配送方法も選択し、合計金額を算出し表示する
	 */
	public String execute(){
	str = creditNumber + card_no2 + card_no3 + card_no4;
		String ret = ERROR;
		paymentDAO dao = new paymentDAO();
		paymentDTO dto = new paymentDTO();
		
		amountAll=0;
		dto  = dao.select(nameHolder, str, expirationMonth, expirationYear, securityCode, creditType);
		if(session.containsKey("userId")){
			if(nameHolder.equals(dto.getNameHolder())){
				if(str.equals(dto.getCreditNumber())){
					if(expirationMonth.equals(dto.getExpirationMonth())){
						if(expirationYear.equals(dto.getExpirationYear())){
							if(securityCode.equals(dto.getSecurityCode())){
								GoCartDAO cart= new GoCartDAO();
								cartList= cart.selectedItem((int)session.get("userId"));
								for (int i = 0; i < cartList.size(); i++) {
					                amountAll = amountAll+(cartList.get(i).getPriceyen()) * (cartList.get(i).getQuantities());
					            }
								ret = SUCCESS;
								
							}else{
								whaterror=1;
							ret = "other";
							}
						}else{
							whaterror=2;
						ret = "other";
						}
					}else{
						whaterror=3;
					ret = "other";
					}
				}else{
					whaterror=4;
				ret = "other";
				}
			}else{
				whaterror=5;
			ret = "other";
			}
		}
			return ret;
		}


	/**
	 * ユーザーIDを取得するメソッド
	 * @return userId
	 */
	public int getUserId(){
		return userId;
	}
	/**
	 * ユーザーIDを格納するメソッド
	 * @param userId
	 */
	public void setUserId(int userId){
		this.userId=userId;
	}
	
	/**
	 * クレジットカードナンバーを取得するメソッド
	 * @return creditnumber
	 */
	public String getCreditNumber(){
		return creditNumber;
	}
	/**
	 * クレジットカードナンバーを格納するメソッド
	 * @param creditNumber
	 */
	public void setCreditNumber(String creditNumber){
		this.creditNumber = creditNumber;
	}
	
	/**
	 * カード名義を取得するメソッド
	 * @return nameHolder
	 */
	public String getNameHolder(){
		return nameHolder;
	}
	/**
	 * カード名義を格納するメソッド
	 * @param nameHolder
	 */
	public void setNameHolder(String nameHolder){
		this.nameHolder = nameHolder;
	}
	
	/**
	 * セキュリティコードを取得するメソッド
	 * @return securityCode
	 */
	public String getSecurityCode(){
		return securityCode;
	}
	/**
	 * セキュリティコードを格納するメソッド
	 * @param securityCode
	 */
	public void setSecurityCode(String securityCode){
		this.securityCode = securityCode;
	}
	
	/**
	 * 期限月を取得するメソッド
	 * @return expirationMonth
	 */
	public String getExpirationMonth(){
		return expirationMonth;
	}
	/**
	 * 期限月を格納するメソッド
	 * @param expirationMonth
	 */
	public void setExpirationMonth(String expirationMonth){
		this.expirationMonth = expirationMonth;
	}
	
	/**
	 * 期限年を取得するメソッド 
	 * @return exipirationYear
	 */
	public String getExpirationYear(){
		return expirationYear;
	}
	/**
	 * 期限年を格納するメソッド
	 * @param expirationYear
	 */
	public void setExpirationYear(String expirationYear){
		this.expirationYear = expirationYear;
	}


	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;

	}
	public Map<String, Object> getsession(){
		return session;
	}

	/**
	 * クレジットカードの種類を取得するメソッド
	 * @return creditType
	 */
	public String getCreditType() {
		return creditType;
	}
	/**
	 * クレジットカードの種類を格納するメソッド
	 * @param creditType
	 */
	public void setCreditType(String creditType) {
		this.creditType = creditType;
	}
	
	/**
	 * 配送方法を取得するメソッド
	 * @return deliverySelect
	 */
	public String getDeliverySelect() {
		return deliverySelect;
	}
	/**
	 * 配送方法を格納するメソッド
	 * @param deliverySelect
	 */
	public void setDeliverySelect(String deliverySelect) {
		this.deliverySelect = deliverySelect;
	}
	
	/**
	 * 配送日を取得するメソッド
	 * @return deliveryMonth
	 */
	public String getDeliveryMonth() {
		return deliveryMonth;
	}
	/**
	 * 配送日を格納するメソッド
	 * @param deliveryMonth
	 */
	public void setDeliveryMonth(String deliveryMonth) {
		this.deliveryMonth = deliveryMonth;
	}
	
	/**
	 * 配送時間を取得するメソッド
	 * @return　deliverytime
	 */
	public String getDeliveryTime() {
		return deliveryTime;
	}
	/**
	 * 配送時間を格納するメソッド
	 * @param deliveryTime
	 */
	public void setDeliveryTime(String deliveryTime) {
		this.deliveryTime = deliveryTime;
	}
	
	/**
	 * 商品リストを取得するメソッド
	 * @return cartList
	 */
	public ArrayList<CartDTO> getCartList(){
		return cartList;
	}
	/**
	 * 商品リストを格納するメソッド
	 * @param cartList
	 */
	public void setCartList(ArrayList<CartDTO> cartList){
		this.cartList=cartList;
	}
	
	/**
	 * エラーかどうか取得するメソッド
	 * @return whaterror
	 */
	public int getWhaterror() {
		return whaterror;
	}
	/**
	 * エラーを格納するメソッド
	 * @param whaterror
	 */
	public void setWhaterror(int whaterror) {
		this.whaterror = whaterror;
	}

	/**
	 * 金額合計を取得するメソッド
	 * @return amountAll
	 */
	public int getAmountAll() {
		return amountAll;
	}
	/**
	 * 金額合計を格納するメソッド
	 * @param amountAll
	 */
	public void setAmountAll(int amountAll) {
		this.amountAll = amountAll;
	}


	/**
	 * @return card_no4
	 */
	public String getCard_no4() {
		return card_no4;
	}
	/**
	 * @param card_no4 セットする card_no4
	 */
	public void setCard_no4(String card_no4) {
		this.card_no4 = card_no4;
	}


	/**
	 * @return card_no3
	 */
	public String getCard_no3() {
		return card_no3;
	}
	/**
	 * @param card_no3 セットする card_no3
	 */
	public void setCard_no3(String card_no3) {
		this.card_no3 = card_no3;
	}


	/**
	 * @return card_no2
	 */
	public String getCard_no2() {
		return card_no2;
	}
	/**
	 * @param card_no2 セットする card_no2
	 */
	public void setCard_no2(String card_no2) {
		this.card_no2 = card_no2;
	}
	
	
	/**
	 * @return str
	 */
	public String getStr() {
		return str;
	}
	/**
	 * @param str
	 */
	public void setStr(String str) {
		this.str = str;
	}




}
