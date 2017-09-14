package com.internousdev.kairakutenichiba.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.kairakutenichiba.dao.paymentDAO;
import com.internousdev.kairakutenichiba.dto.paymentDTO;
import com.opensymphony.xwork2.ActionSupport;
/**
 * @author koizumi junpei
 * 2017/09/13
 *
 */

public class paymentAction extends ActionSupport implements SessionAware{


	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	private String creditType;	//visa ,master, Americanの場合分け

	private String creditNumber;

	private String nameHolder;

	private String securityCode;

	private String expirationMonth; //Stringじゃないとだめ？

	private String expirationYear; //Stringじゃないとだめ？


    private String deliverySelect;

	private String deliveryMonth;

	private String deliveryTime;


	private Map<String, Object> session; //ここいるの？何に使ってんの？
	




//	private String errmag; //これいるか？
							//多分アラートで元ページを再度表示？
							//JQuearyで赤枠？

	public String execute(){
		String ret = ERROR;
		paymentDAO dao = new paymentDAO();
		paymentDTO dto = new paymentDTO();

		//dtoに格納
		dto = dao.select(nameHolder, creditNumber, expirationMonth, expirationYear, securityCode);
		//
		if(nameHolder.equals(dto.getNameHolder())){
			if(creditNumber.equals(dto.getCreditNumber())){
				if(expirationMonth.equals(dto.getExpirationMonth())){
					if(expirationYear.equals(dto.getExpirationYear())){
						if(securityCode.equals(dto.getSecurityCode())){
							dto.setDeliverySelect(this.deliverySelect);
							dto.setDeliveryMonth(this.deliveryMonth);
							dto.setDeliveryTime(this.deliveryTime);
							ret = SUCCESS;
						}
					}
				}
			}
		}
		return ret;
	}


//ここから下がなぜ必要なのか、まだ何に使うのか誰か説明してください。
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




}
