/**
 *
 */
package com.internousdev.kairakutenichiba.action;

import java.net.UnknownHostException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.kairakutenichiba.dao.HelpDAO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author naoto togashi
 *
 */
public class HelpAction extends ActionSupport  implements SessionAware {


	 /**
     * シリアルキー
     */
    private static final long serialVersionUID = 7307749500088925358L;

	/**
	 * 問い合わせ氏名
	 *
	 */
private String userName;


/**
 * 住所
 */
private String userAddress;

/**
 *メールアドレス
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
private String inquiriedAt;

/**
 * セッション情報
 */
private Map<String, Object> session;





/**
 * MONGODBと接続して情報を取得する
 * @return HelpDAO
 */

public String execute() {
	String result = ERROR;

	HelpDAO dao = new HelpDAO();
	try {
		if (dao.mongoInsert(userName, userAddress, userMail, category, comment)) {
          result=SUCCESS;
          return result;
		}
	} catch (UnknownHostException e) {
		e.printStackTrace();
	}
	return result;
}


/**
 * 氏名を取得するメソッド
 * 	@return userName 氏名
 */
public String getUserName() {
	return userName;
}

/**
 * 氏名を格納するメソッド
 * @return userName セット　userName
 */

public void setUserName(String userName) {
	this.userName = userName;
}


/**
 * 住所を取得するメソッド
 * @return　userAddress　住所
 */
public String getUserAddress() {
    return userAddress;
}

/**
 * 住所を格納するメソッド
 * @param　userAddress　セットする　住所
 */
public void setUserAddress(String userAddress) {
    this.userAddress = userAddress;
}

/**
 * メールアドレスを取得するメソッド
 * @return userMail メールアドレス
 */
public String getUserMail() {
	return userMail;
}

/**
 * メールアドレスを格納するメソッド
 * @return userMail セットする　メールアドレス
 */
public void setUserMail(String userMail) {
	this.userMail = userMail;
}


/**
 * 問い合わせ種類を取得するメソッド
 * @return　　category 種類
 */
public String getCategory() {
    return category;
}

/**
 * 問い合わせ種類を格納するメソッド
 * @param title　セットする　種類
 */
public void setCategory(String category) {
    this.category = category;
}

/**
 * 内容を取得するメソッド
 * @return　comment　内容
 */
public String getComment() {
    return comment;
}

/**
 * 内容を格納するメソッド
 * @param comment　セットする　内容
 */
public void setComment(String comment) {
    this.comment = comment;
}

/**
 * 問い合わせ日時を取得
 */
public String getInquiriedAt() {
	return inquiriedAt;
}

/**
 * 問い合わせ日時を格納
 */
public void setInquiriedAt(String inquiriedAt) {
	this.inquiriedAt = inquiriedAt;
}

/**
 * セッションIDを取得するメソッド
 * @return　session セッションID
 */
public Map<String, Object> getSession() {
    return session;
}

/**
 * セッションIDを格納するメソッド
 * @param　session セットする　セッションID
 */
public void setSession(Map<String, Object> session) {
    this.session = session;
}





}



