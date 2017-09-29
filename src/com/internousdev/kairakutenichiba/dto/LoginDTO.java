/**
 *
 */
package com.internousdev.kairakutenichiba.dto;


public class LoginDTO {
	/**
	 * ユーザーの名前
	 */
	private String userName;
	/**
	 * メールアドレス
	 */
	private String email;
	/**
	 * ユーザーID
	 */
	private int userId;
	/**
	 * パスワード
	 */
	private String password;
	/**
	 * 退会フラグ
	 */
	private boolean userdelFlg;
	/**
	 * ログインフラグ
	 */
	private boolean loginFlg;
	/**
	 * ユーザーID
	 */
	private int userFlg;

	//以下アクセサリー


	/**
	 * ユーザーの名前を収納するメソッド
	 * @return userName
	 */
	public String getUserName() {
		return userName;
	}
	/**
	 * ユーザーの名前を格納するメソッド
	 * @param userName セットする userName
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/**
	 * メールアドレスを収納するメソッド
	 * @return Email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * メールアドレスを格納するメソッド
	 * @param Email セットする Email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * ユーザーIDを収納するメソッド
	 * @return userId
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
	 * パスワードを収納するメソッド
	 * @return password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * パスワードを格納するメソッド
	 * @param password セットする password
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * ユーザーフラグを収納するメソッド
	 * @return userdelFlg
	 */
	public boolean isUserdelFlg() {
		return userdelFlg;
	}
	/**
	 * ユーザーフラグを格納するメソッド
	 * @param userdelFlg セットする userdelFlg
	 */
	public void setUserdelFlg(boolean userdelFlg) {
		this.userdelFlg = userdelFlg;
	}
	/**
	 * ログインフラグを収納するメソッド
	 * @return loginFlg
	 */
	public boolean getLoginFlg() {
		return loginFlg;
	}
	/**
	 * ログインフラグを格納するメソッド
	 * @param loginFlg セットする loginFlg
	 */
	public void setLoginFlg(boolean loginFlg) {
		this.loginFlg = loginFlg;
	}
	/**
	 * ユーザーフラグを収納するメソッド
	 * @return userFlg
	 */
	public int getUserFlg() {
		return userFlg;
	}
	/**
	 * ユーザーフラグを格納するメソッド
	 * @param userFlg セットする userFlg
	 */
	public void setUserFlg(int userFlg) {
		this.userFlg = userFlg;
	}
	public boolean LoginFlg() {
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}
}