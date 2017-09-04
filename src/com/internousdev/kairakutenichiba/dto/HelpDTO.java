/**
 *
 */
package com.internousdev.kairakutenichiba.dto;

/**
 * @author internousdev
 *
 */
public class HelpDTO {


	  	    /**
	     * 氏名
	     */
	    private String userName;

	    /**
	     * 氏名（カナ）
	     */
	    private String userNameKana;

	    /**
	     * 郵便番号
	     */
	    private String postal;

	    /**
	     * 住所
	     */
	    private String userAddress;


	    /**
	     * メールアドレス
	     */
	    private String userMail;



	    /**
	     * 登録日
	     */
	    private String createdDay;

	    /**
	     * 更新日
	     */

		private String updateDay;


	    /**
	     * 氏名を取得
	     * @return 氏名
	     */
	    public String getuserName() {
	        return userName;
	    }


	    /**
	     * 氏名（カナ）を取得
	     * @return 氏名（カナ）
	     */
	    public String getuserNameKana() {
	        return userNameKana;
	    }

	    /**
	     * 氏名（かな）を格納
	     * @param userNameKana 氏名（カナ）
	     */
	    public void setUserNameKana(String userNameKana) {
	        this.userNameKana = userNameKana;
	    }

	    /**
	     * 氏名を格納
	     * @param userName 氏名
	     */
	    public void setUserName(String userName) {
	        this.userName = userName;
	    }

	    /**
	     * 郵便番号を取得
	     * @return 郵便番号
	     */
	    public String getPostal() {
	        return postal;
	    }

	    /**
	     * 郵便番号を格納
	     * @param postal 郵便番号
	     */
	    public void setPostal(String postal) {
	        this.postal = postal;
	    }

	    /**
	     * 住所を取得
	     * @return userAddress住所
	     */
	    public String getuserAddress() {
	        return userAddress;
	    }

	    /**
	     * 住所を格納
	     * @param userAddress 住所
	     */
	    public void setUserAddress(String userAddress) {
	        this.userAddress = userAddress;
	    }


	    /**
	     * メールアドレスを取得
	     * @return userMail メールアドレス
	     */
	    public String getuserMail() {
	        return userMail;
	    }

	    /**
	     * メールアドレスを格納
	     * @param userMail メールアドレス
	     */
	    public void setuserMail(String userMail) {
	        this.userMail = userMail;
	    }

	    /**
	     * 登録日を取得
	     * @return createdDay登録日
	     */
	    public String getcreatedDay() {
	        return createdDay;
	    }

	    /**
	     * 登録日を格納
	     * @param createdDay 登録日
	     */
	    public void setcreatedDay(String createdDay) {
	        this.createdDay = createdDay;
	    }

	    /**
	     * 更新日を取得
	     * @return updateDay更新日
	     */
	    public String getupdateDay() {
	        return updateDay;
	    }

	    /**
	     * 更新日を格納
	     * @param updateDay 更新日
	     */
	    public void setupdateDay(String updateDay) {
	        this.updateDay = updateDay;
	    }

}

