/**
 *
 */
package com.internousdev.kairakutenichiba.action;

import java.util.Map;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.util.login.LogoutDAO;
import com.opensymphony.xwork2.ActionSupport;


public class LogoutAction extends ActionSupport implements SessionAware, ServletResponseAware, ServletRequestAware {

	/**
	 * シリアルID
	 */
	private static final long serialVersionUID = 8755573724861558565L;
	/**
	 * セッション情報（ユーザーID）
	 */
	private Map<String, Object> session;
	/**
	 * ログインフラグ
	 */
	private boolean loginFlg;
	/**
	 * ユーザーID
	 */
	private int userId;
	/**
	 * アクションフラグ
	 */
	private String actionFlg;

	// Cookie関連

	private HttpServletResponse response;

	private HttpServletRequest request;

	/**
	 * ログアウトするための実行メソッド
	 *
	 * @return ログアウトできたならSUCCESS、できなければERROR
	 */
	public String execute() {

		Cookie cookies[] = request.getCookies();
		for (Cookie cookie : cookies) {
			if ("userId".equals(cookie.getName())) {
				cookie.setMaxAge(0);
				cookie.setPath("/");
				response.addCookie(cookie);
			} else if ("loginFlg".equals(cookie.getName())) {
				cookie.setMaxAge(0);
				cookie.setPath("/");
				response.addCookie(cookie);
			} else {
				cookie.setMaxAge(0);
			}
		}

		String result = ERROR;
		if (session.get("userId") != null) {
			LogoutDAO dao = new LogoutDAO();
			dao.update((int) session.get("userId"), false);
			session.clear();
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
	 * ログインフラグを取得するメソッド
	 *
	 * @return loginFlg ログインフラグ
	 */
	public boolean isLoginFlg() {
		return loginFlg;
	}

	/**
	 * ログインフラグを格納するメソッド
	 *
	 * @param loginFlg
	 *            セットする loginFlg
	 */
	public void setLoginFlg(boolean loginFlg) {
		this.loginFlg = loginFlg;
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

	/**
	 * アクションフラグを取得するメソッド
	 *
	 * @return actionFlg アクションフラグ
	 */
	public String getActionFlg() {
		return actionFlg;
	}

	/**
	 * アクションフラグを格納するメソッド
	 *
	 * @param actionFlg
	 *            セットする actionFlg
	 */
	public void setActionFlg(String actionFlg) {
		this.actionFlg = actionFlg;
	}

	public HttpServletResponse getResponse() {
		return response;
	}

	public void setResponse(HttpServletResponse response) {
		this.response = response;
	}

	public HttpServletRequest getRequest() {
		return request;
	}

	public void setRequest(HttpServletRequest request) {
		this.request = request;
	}

	@Override
	public void setServletResponse(HttpServletResponse response) {
		this.response = response;

	}

	public void setServletRequest(HttpServletRequest request) {
		this.request = request;
	}

}
