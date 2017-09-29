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
	    public String getUserName() {
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
	    public String getUserAddress() {
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
	    public String getUserMail() {
	        return userMail;
	    }

	    /**
	     * メールアドレスを格納
	     * @param userMail メールアドレス
	     */
	    public void setUserMail(String userMail) {
	        this.userMail = userMail;
	    }

	    /**
	     * 問い合わせ種類を取得
	     */
	    public String getCategory() {
	    	return category;
	    }

	    /**
	     * 問い合わせ種類を格納
	     */
        public void setCategory(String category) {
        	this.category = category;
        }

        /**
         * 問い合わせ内容を取得
         */
        public String getComment() {
        	return comment;
        }

        /**
         * 問い合わせ内容を格納
         */
        public void setComment(String comment) {
        	this.comment = comment;
        }

        /**
         * 問い合わせ日時を取得
         */
        public String getInquiried_at() {
        	return inquiried_at;
        }

        /**
         * 問い合わせ日時を格納
         */
        public void setInquiried_at(String inquiried_at) {
        	this.inquiried_at = inquiried_at;
        }



	    /**
	     * 登録日を取得
	     * @return createdDay登録日
	     */
	    public String getCreatedDay() {
	        return createdDay;
	    }

	    /**
	     * 登録日を格納
	     * @param createdDay 登録日
	     */
	    public void setCreatedDay(String createdDay) {
	        this.createdDay = createdDay;
	    }

	    /**
	     * 更新日を取得
	     * @return updateDay更新日
	     */
	    public String getUpdateDay() {
	        return updateDay;
	    }

	    /**
	     * 更新日を格納
	     * @param updateDay 更新日
	     */
	    public void setUpdateDay(String updateDay) {
	        this.updateDay = updateDay;
	    }

}

