/**
 *
 */
package com.internousdev.kairakutenichiba.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;

import com.internousdev.kairakutenichiba.util.FacebookOauth;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author internousdev
 *
 */
public class GoFacebookAction extends ActionSupport implements ServletResponseAware,ServletRequestAware{


	/**
	 * シリアルID
	 * @version 1.0
	 */
	private static final long serialVersionUID = -8106870342611553385L;
	/**
	 * リクエスト
	 * @version 1.0
	 */
	private HttpServletRequest request;

	/**
	 * レスポンス
	 * @version 1.0
	 */
	private HttpServletResponse response;



	/**
	 * FaceBookからTokenを取得メソッド
	 * @version 1.0
	 */
    public String execute() {
    	FacebookOauth oauth = new FacebookOauth();
		oauth.getRequestToken(request, response);
		return SUCCESS;
	}

	/**
	 * リクエスト格納メソッド
	 * @version 1.0
	 */
	public void setServletRequest(HttpServletRequest request) {
		this.request = request;
	}
	/**
	 * レスポンス格納メソッド
	 * @version 1.0
	 */
	public void setServletResponse(HttpServletResponse response) {
		this.response = response;
	}

}








