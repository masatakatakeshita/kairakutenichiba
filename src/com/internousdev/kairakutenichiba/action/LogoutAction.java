/**
 *
 */
package com.internousdev.kairakutenichiba.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.kairakutenichiba.dao.LogoutDAO;
import com.opensymphony.xwork2.ActionSupport;


public class LogoutAction extends ActionSupport implements SessionAware{

	/**
	 * シリアルID
	 */
	private static final long serialVersionUID = 8755573724861558565L;
	/**
	 * セッション情報（ユーザーID）
	 */
	private Map<String, Object> session;

	/**
	 * ユーザーID
	 */
	private int userId;
	
	/**
	 * ログアウトするための実行メソッド
	 *
	 * @return ログアウトできたならSUCCESS、できなければERROR
	 */
	public String execute() {
		String result = ERROR;
		if (session.containsKey("userId")) {
			LogoutDAO dao = new LogoutDAO();
			if(dao.update((int) session.get("userId"))>0){
			session.clear();
			}
			if (session.isEmpty()) {
				result = SUCCESS;
			}
		}
		return result;
	}

	/**
	 * セッション情報を取得するメソッド
	 *
	 * @return session セッション情報
	 */
	public Map<String, Object> getSession() {
		return session;
	}

	/**
	 * セッションを格納するメソッド
	 *
	 * @param session
	 *            セットする session
	 */
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}


	/**
	 * ユーザーIDを取得するメソッド
	 *
	 * @return userId ユーザーID
	 */
	public int getUserId() {
		return userId;
	}

	/**
	 * ユーザーIDを格納するメソッド
	 *
	 * @param userId
	 *            セットする userId
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}

	

	
}
