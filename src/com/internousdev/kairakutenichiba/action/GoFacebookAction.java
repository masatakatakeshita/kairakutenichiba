/**
 *
 */
package com.internousdev.kairakutenichiba.action;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.util.oauth.facebook.FacebookOauth;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author internousdev
 *
 */
public class GoFacebookAction extends ActionSupport implements SessionAware{


	/**
	 * シリアルID
	 * @author Kaito Fukutani
	 * @since 2017/5/18
	 * @version 1.0
	 */
	private static final long serialVersionUID = -8106870342611553385L;
	/**
	 * リクエスト
	 * @author Kaito Fukutani
	 * @since 2017/5/18
	 * @version 1.0
	 */
	private HttpServletRequest request;

	/**
	 * レスポンス
	 * @author Kaito Fukutani
	 * @since 2017/5/18
	 * @version 1.0
	 */
	private HttpServletResponse response;



	/**
	 * FaceBookからTokenを取得メソッド
	 * @author Kaito Fukutani
	 * @since 2017/5/18
	 * @version 1.0
	 */
    public String execute() {
    	FacebookOauth oauth = new FacebookOauth();
		oauth.getRequestToken(request, response);
		return SUCCESS;
	}

	/**
	 * リクエスト格納メソッド
	 * @author Kaito Fukutani
	 * @since 2017/5/18
	 * @version 1.0
	 */
	public void setServletRequest(HttpServletRequest request) {
		this.request = request;
	}
	/**
	 * レスポンス格納メソッド
	 * @author Kaito Fukutani
	 * @since 2017/5/18
	 * @version 1.0
	 */
	public void setServletResponse(HttpServletResponse response) {
		this.response = response;
	}

	@Override
	public void setSession(Map<String, Object> arg0) {
		// TODO 自動生成されたメソッド・スタブ

	}
}







