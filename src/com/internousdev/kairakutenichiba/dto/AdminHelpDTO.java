/**
 *
 */
package com.internousdev.kairakutenichiba.dto;

/**
 * @author naoto togashi
 *
 */
public class AdminHelpDTO {


	   /**
     * 問い合わせ番号
     */
    private int inquiryNo;
    /**
     * ユーザID
     */
    private int userId;

    /**
     * ログインフラグ
     */
    private boolean login;
    /**
     * 氏名
     */
    private String userName;

    /**
     * メールアドレス
     */
    private String userMail;
    /**
     * 種類
     */
    private String category;

    /**
     * お問い合わせ
     */
    private String comment;

    /**
     * 対応状況
     */
    private boolean isDeleted;
    /**
     * お問い合わせ日時
     */
    private String inquiriedAt;
    /**
     * 問い合わせ番号を取得
     * @return inquiryNo
     */
   public int getInquiryNo() {
       return inquiryNo;
   }

   /**
    * 問い合わせ番号を設定
    * @param inquiryNo セットする inquiryNo
    */
   public void setInquiryNo(int inquiryNo) {
       this.inquiryNo = inquiryNo;
   }

    /**
      * ユーザIDを取得
      * @return userId
      */
    public int getUserId() {
        return userId;
    }

    /**
     * ユーザIDを設定
     * @param userId セットする userId
     */
    public void setUserId(int userId) {
        this.userId = userId;
    }

    /**
     * ログインフラグを取得
     */
    public boolean getLogin() {
    return login;
    }
    /**
     * ログインフラグを格納
     */
    public void setLogin(boolean login) {
    	this.login = login;
    }
    /**
     * 氏名を取得する
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 氏名を設定
     * @param userName セットする userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * メールアドレスを取得
     * @return userMail
     */
    public String getUserMail() {
        return userMail;
    }

    /**
     * メールアドレスを設定
     * @param userMail セットする userMail
     */
    public void setUserMail(String userMail) {
        this.userMail = userMail;
    }


    /**
     * お問い合わせ種類を取得
     * @return category
     */
    public String getCategory() {
        return category;
    }

    /**
     * お問い合わせ種類を設定
     * @param category セットする category
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * お問い合わせ内容を取得
     * @return comment
     */
    public String getComment() {
        return comment;
    }

    /**
     * お問い合わせ内容を設定
     * @param comment セットする comment
     */
    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * 対応状況を取得
     * @return isDeleted
     */
    public boolean getIsDeleted() {
        return isDeleted;
    }
    /**
     * 対応状況を設定
     * @param isDeleted セットする isDeleted
     */
    public void setIsDeleted(boolean isDeleted) {
        this.isDeleted = isDeleted;
    }



    /**
     * お問い合わせ日時を取得
     * @return inquiriedAt
     */
    public String getInquiriedAt() {
        return inquiriedAt;
    }
    /**
     * お問い合わせ日時を設定
     * @param inquiriedAt セットする inquiriedAt
     */
    public void setInquiriedAt(String inquiriedAt) {
        this.inquiriedAt = inquiriedAt;
    }

	public void setDt(String string) {
		// TODO 自動生成されたメソッド・スタブ

	}




}
