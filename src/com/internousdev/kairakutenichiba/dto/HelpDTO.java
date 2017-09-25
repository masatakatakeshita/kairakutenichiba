/**
 *
 */
package com.internousdev.kairakutenichiba.dto;

/**
 * @author naoto togashi
 *
 */
public class HelpDTO {


	  	/**
	    * ユーザーID
	    */
	    private int userId;


	  	 /**
	     * 氏名
	     */
	    private String userName;


	    /**
	     * 住所
	     */
	    private String userAddress;


	    /**
	     * メールアドレス
	     */
	    private String userMail;

        /**
         * 問い合わせ種類
         */
	    private String category;


	    /**
	     * 問い合わせ内容
	     */
	    private String comment;

	    /**
	     * 問い合わせ日時
	     */
	    private String inquiried_at;

	    /**
	     * ログインフラグ
	     */
	    private boolean loginFlg;

	    /**
	     * ユーザーフラグ
	     */
	    private int userFlg;



	    /**
	     * 登録日
	     */
	    private String createdDay;

	    /**
	     * 更新日
	     */

		private String updateDay;



		 /**
	     * ユーザーIDを取得
	     * @return ユーザーID
	     */
	    public int getUserId() {
	        return userId;
	    }

	    /**
	     * ユーザーIDを格納
	     * @param userId ユーザーID
	     */
	    public void setUserId(int userId) {
	        this.userId = userId;
	    }





	    /**
	     * 氏名を取得
	     * @return 氏名
	     */
	    public String getuserName() {
	        return userName;
	    }

	    /**
	     * 氏名を格納
	     * @param userName 氏名
	     */
	    public void setUserName(String userName) {
	        this.userName = userName;
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
	     * 問い合わせ種類を取得
	     */
	    public String getcategory() {
	    	return category;
	    }

	    /**
	     * 問い合わせ種類を格納
	     */
        public void setcategory(String category) {
        	this.category = category;
        }

        /**
         * 問い合わせ内容を取得
         */
        public String getcomment() {
        	return comment;
        }

        /**
         * 問い合わせ内容を格納
         */
        public void setcomment(String comment) {
        	this.comment = comment;
        }

        /**
         * 問い合わせ日時を取得
         */
        public String getinquiried_at() {
        	return inquiried_at;
        }

        /**
         * 問い合わせ日時を格納
         */
        public void setinquiried_at(String inquiried_at) {
        	this.inquiried_at = inquiried_at;
        }


	    /**
	     * ログインフラグを取得
	     * @return ログインフラグ
	     */
	    public boolean isLoginFlg() {
	        return loginFlg;
	    }

	    /**
	     * ログインフラグを格納
	     * @param loginFlg ログインフラグ
	     */
	    public void setLoginFlg(boolean loginFlg) {
	        this.loginFlg = loginFlg;
	    }

	    /**
	     * ユーザーフラグを取得
	     * @return ユーザーフラグ
	     */
	    public int getUserFlg() {
	        return userFlg;
	    }

	    /**
	     * ユーザーフラグを格納
	     * @param userFlg ユーザーフラグ
	     */
	    public void setUserFlg(int userFlg) {
	        this.userFlg = userFlg;
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

