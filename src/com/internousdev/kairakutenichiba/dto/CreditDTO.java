/**
 * 
 */
package com.internousdev.kairakutenichiba.dto;

/**
 * クレジット情報に関するDTOクラス
 * @author MISA KIKUCHI
 * @since 5/19
 * @version 1.0
 */


public class CreditDTO {

		/**
		 * ユーザーID
		 */
		private int userId;

		/**
		 * ログインID
		 */
		private String loginId;

		/**
		 * クレジットの種類
		 */
		private int creditId;

		/**
		 * クレジット番号
		 */
		private String creditNumber;

		/**
		 * 姓名(ローマ字)
		 */
		private String nameE;

		/**
		 * セキュリティーコード
		 */
		private int securityCode;

		/**
		 * 有効期限(月）
		 */
		private int expirationMonth;

		/**
		 * 有効期限(年）
		 */
		private int  expirationYear;

		/**
		 * クレジットタイプ
		 */
		private String creditType;
		/**
		 * 姓名（漢字）
		 */
		private String lastName;
		/**
		 * 名前(漢字)
		 */
		private String firstName;
		/**
		 * クレジット番号下4ケタ
		 */
		private String creditNumberDown;
		/**
		 * 登録日
		 */
		private String createdAt;
		/**
		* 更新日
		 */
		private String updatedAt;


		//以下アクセサリー


		/**
		 * ユーザーIDを取得するメソッド
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
		 * クレジットの種類を取得するメソッド
		 * @return creditId
		 */
		public int getCreditId() {
			return creditId;
		}
		/**
		 * クレジットの種類を格納するメソッド
		 * @param creditId セットする creditId
		 */
		public void setCreditId(int creditId) {
			this.creditId = creditId;
		}
		/**
		 * ログインIDを取得するメソッド
		 * @return loginId
		 */
		public String getLoginId() {
			return loginId;
		}
		/**
		 * ログインIDを格納するメソッド
		 * @param loginId セットする loginId
		 */
		public void setLoginId(String loginId) {
			this.loginId = loginId;
		}
		/**
		 * クレジット番号を取得するメソッド
		 * @return creditNumber
		 */
		public String getCreditNumber() {
			return creditNumber;
		}
		/**
		 * クレジット番号を格納するメソッド
		 * @param creditNumber セットする creditNumber
		 */
		public void setCreditNumber(String creditNumber) {
			this.creditNumber = creditNumber;
		}
		/**
		 * 姓名(ローマ字)を取得するメソッド
		 * @return nameE
		 */
		public String getNameE() {
			return nameE;
		}
		/**
		 * 姓名(ローマ字)を格納するメソッド
		 * @param nameE セットする nameE
		 */
		public void setNameE(String nameE) {
			this.nameE = nameE;
		}
		/**
		 * セキュリティコードを取得するメソッド
		 * @return securityCode
		 */
		public int getSecurityCode() {
			return securityCode;
		}
		/**セキュリティコードを格納するメソッド
		 * @param securityCode セットする securityCode
		 */
		public void setSecurityCode(int securityCode) {
			this.securityCode = securityCode;
		}
		/**
		 * 有効期限（月）を取得するメソッド
		 * @return expirationMonth
		 */
		public int getExpirationMonth() {
			return expirationMonth;
		}
		/**
		 * 有効期限（月）を格納するメソッド
		 * @param expirationMonth セットする expirationMonth
		 */
		public void setExpirationMonth(int expirationMonth) {
			this.expirationMonth = expirationMonth;
		}
		/**
		 * 有効期限（年）を取得するメソッド
		 * @return expirationYear
		 */
		public int getExpirationYear() {
			return expirationYear;
		}
		/**
		 * 有効期限（年）を格納するメソッド
		 * @param expirationYear セットする expirationYear
		 */
		public void setExpirationYear(int expirationYear) {
			this.expirationYear = expirationYear;
		}
		/**
		 * クレジットタイプを取得するメソッド
		 * @return creditType
		 */
		public String getCreditType() {
			return creditType;
		}
		/**
		 * クレジットタイプを格納するメソッド
		 * @param creditType セットする creditType
		 */
		public void setCreditType(String creditType) {
			this.creditType = creditType;
		}
		/**
		 *  姓名（漢字）を取得するメソッド
		 * @return lastName
		 */
		public String getLastName() {
			return lastName;
		}
		/**
		 *  姓名（漢字）を格納するメソッド
		 * @param lastName セットする lastName
		 */
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		/**
		 * 名前(漢字)を取得するメソッド
		 * @return firstName
		 */
		public String getFirstName() {
			return firstName;
		}
		/**
		 * 名前(漢字)を格納するメソッド
		 * @param firstName セットする firstName
		 */
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		/**
		 * クレジット番号下4ケタを取得するメソッド
		 * @return creditNumberDown
		 */
		public String getCreditNumberDown() {
			return creditNumberDown;
		}
		/**
		 * クレジット番号下4ケタを格納するメソッド
		 * @param creditNumberDown セットする creditNumberDown
		 */
		public void setCreditNumberDown(String creditNumberDown) {
			this.creditNumberDown = creditNumberDown;
		}
		/**
		 * 登録日を取得するメソッド
		 * @return createdAt
		 */
		public String getCreatedAt() {
			return createdAt;
		}
		/**
		 * 登録日を格納するメソッド
		 * @param createdAt セットする createdAt
		 */
		public void setCreatedAt(String createdAt) {
			this.createdAt = createdAt;
		}
		/**
		 * 更新日を取得するメソッド
		 * @return updatedAt
		 */
		public String getUpdatedAt() {
			return updatedAt;
		}
		/**
		 * 更新日を格納するメソッド
		 * @param updatedAt セットする updatedAt
		 */
		public void setUpdatedAt(String updatedAt) {
			this.updatedAt = updatedAt;
		}

}