
package com.internousdev.kairakutenichiba.dto;

import java.util.Map;

public class paymentDTO {

/*
 * 必要な変数軍
cardType クレジットの種類
cardNumber カード番号
cardHolder 所有者の名前	　/testuser
cardDeadline  month　月
			　year  年
cardSecurity セキュリティコード

 */
	private String creditType;	//visa ,master, Americanの場合分け

	private String creditNumber;

	private String nameHolder;

	private String securityCode;

	private String expirationMonth; //Stringじゃないとだめ？

	private String expirationYear; //Stringじゃないとだめ？


    private String deliverySelect;

	private String deliveryMonth;

	private String deliveryTime;
	
	private int creditId;


	private Map<String, Object> session; //ここいるの？何に使ってんの？


	public String getCreditNumber(){
		return creditNumber;
	}
	public void setCreditNumber(String creditNumber){
		this.creditNumber = creditNumber;
	}

	public String getNameHolder(){
		return nameHolder;
	}
	public void setNameHolder(String nameHolder){
		this.nameHolder = nameHolder;
	}

	public String getSecurityCode(){
		return securityCode;
	}
	public void setSecurityCode(String securityCode){
		this.securityCode = securityCode;
	}

	public String getExpirationMonth(){
		return expirationMonth;
	}
	public void setExpirationMonth(String expirationMonth){
		this.expirationMonth = expirationMonth;
	}

	public String getExpirationYear(){
		return expirationYear;
	}
	public void setExpirationYear(String expirationYeari){
		this.expirationYear = expirationYeari;
	}


	public void setSession(Map<String, Object> session) {
		this.session = session;

	}

	public Map<String, Object> getsession(){
		return session;
	}


	public String getCreditType() {
		return creditType;
	}


	public void setCreditType(String creditType) {
		this.creditType = creditType;
	}


	public String getDeliverySelect() {
		return deliverySelect;
	}


	public void setDeliverySelect(String deliverySelect) {
		this.deliverySelect = deliverySelect;
	}


	public String getDeliveryMonth() {
		return deliveryMonth;
	}


	public void setDeliveryMonth(String deliveryMonth) {
		this.deliveryMonth = deliveryMonth;
	}


	public String getDeliveryTime() {
		return deliveryTime;
	}


	public void setDeliveryTime(String deliveryTime) {
		this.deliveryTime = deliveryTime;
	}
	public int getCreditId() {
		return creditId;
	}
	public void setCreditId(int creditId) {
		this.creditId = creditId;
	}


}
