
package com.internousdev.kairakutenichiba.dto;

import java.util.Map;

/**
 * 支払いのときのクレジットカード情報を格納するDTO
 * @author junpei.koizumi
 *
 */
public class paymentDTO {

	/**
	 * クレジットカードの種類
	 */
	private String creditType;	
	/**
	 * クレジットカード番号
	 */
	private String creditNumber;
	/**
	 * カード名義
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
	 * 期限年
	 */
	private String expirationYear;
	/**
	 * 配送方法
	 */
    private String deliverySelect;
    /**
     * 配送日時
     */
	private String deliveryMonth;
	/**
	 * 配送時間
	 */
	private String deliveryTime;
	/**
	 * クレジットカードID
	 */
	private int creditId;

	

	private Map<String, Object> session; //ここいるの？何に使ってんの？


	/**
	 * クレジットカード番号を取得するメソッド
	 * @return creditNumber
	 */
	public String getCreditNumber(){
		return creditNumber;
	}
	/**
	 * クレジットカード番号を格納するメソッド
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
	 * @return securitycode
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
	 * 期限付きを格納するメソッド
	 * @param expirationMonth
	 */
	public void setExpirationMonth(String expirationMonth){
		this.expirationMonth = expirationMonth;
	}
	/**
	 * 期限年を取得するメソッド
	 * @return expirationYear
	 */
	public String getExpirationYear(){
		return expirationYear;
	}
	/**
	 * 期限年を格納するメソッド
	 * @param expirationYeari
	 */
	public void setExpirationYear(String expirationYeari){
		this.expirationYear = expirationYeari;
	}


	public void setSession(Map<String, Object> session) {
		this.session = session;

	}

	public Map<String, Object> getsession(){
		return session;
	}

	/**
	 * クレジットカードタイプを取得するメソッド
	 * @return creditType
	 */
	public String getCreditType() {
		return creditType;
	}
	/**
	 * クレジットカードタイプを格納するメソッド
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
	 * 配送月を取得するメソッド
	 * @return deliveryMonth
	 */
	public String getDeliveryMonth() {
		return deliveryMonth;
	}
	/**
	 * 配送月を格納するメソッド
	 * @param deliveryMonth
	 */
	public void setDeliveryMonth(String deliveryMonth) {
		this.deliveryMonth = deliveryMonth;
	}
	/**
	 * 配送日時を取得するメソッド
	 * @return deliverytime
	 */
	public String getDeliveryTime() {
		return deliveryTime;
	}
	/**
	 * 配送日時を格納するメソッド
	 * @param deliveryTime
	 */
	public void setDeliveryTime(String deliveryTime) {
		this.deliveryTime = deliveryTime;
	}
	/**
	 * クレジットカードIDを取得するメソッド
	 * @return
	 */
	public int getCreditId() {
		return creditId;
	}
	/**
	 * クレジットカードIDを格納するメソッド
	 * @param creditId
	 */
	public void setCreditId(int creditId) {
		this.creditId = creditId;
	}


}
