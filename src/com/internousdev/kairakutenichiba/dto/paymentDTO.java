
package com.internousdev.kairakutenichiba.dto;

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
	private int userId;
	
	private String loginId;
	
	private int creditName;	//こいついらないかも←ここ所有者の名前？
	
	private String creditNumber;
	
	private String nameHolder; //name_e nameE
	
	private int securityCode;
	
	private int expirationMonth;
	
	private int expirationYear;
	
	private String creditType;
	
//	private String lastName;
//	
//	private String firstName;
//	
//	private String registrationData;
//	
//	private String updateData;

	
	
	
	public int getUserId(){
		return userId;
	}
	public void serUserID(int userId){
		this.userId = userId;
	}
	

	public int getCreditName(){
		return creditName;
	}
	public void setCreditName(int creditName){
		this.creditName = creditName;
	}
	
	
	public String getLoginId(){
		return loginId;
	}
	public void setLoginId(String loginId){
		this.loginId = loginId;
	}
	
	
	public String getCreditNumber(){
		return creditNumber;
	}
	public void setCreditNumber(String creditNumber){
		this.creditNumber = creditNumber;
	}
	
	
	public String getNameHolder(){
		return nameHolder;
	}
	public void setNameHolder(String nameE){
		this.nameHolder = nameE;
	}
	
	
	public int getSecurityCode(){
		return securityCode;
	}
	public void setSecurityCode(int securityCode){
		this.securityCode = securityCode;
	}
	
	
	public int getExpirationMonth(){
		return expirationMonth;
	}
	public void setExpirationMonth(int expirationMonth){
		this.expirationMonth = expirationMonth;
	}
	
	
	public int getExpirationYear(){	//メンバ変数フィールドに格納された値をreturn；
		return expirationYear;
	}
	public void setExpirationYear(int expirationYear){  //DTOはJSPから値受け取ってんの？
		this.expirationYear = expirationYear;
	}
	
	
	public String getCreditType(){
		return creditType;
	}
	public void setCreditType(String creditType){
		this.creditType = creditType;
	}
	
//
//	LastName FirstName変数つかわねぇだろこれ。	
//	

	
	
}
