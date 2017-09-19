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

import com.internousdev.kairakutenichiba.dao.LoginDAO;
import com.internousdev.kairakutenichiba.dto.LoginDTO;
import com.opensymphony.xwork2.ActionSupport;


/**
 * @author internousdev
 *
 */
public class LoginAction extends ActionSupport implements SessionAware, ServletResponseAware, ServletRequestAware {

	/**
	 * シリアルID
	 */
	private static final long serialVersionUID = 1960678948564666991L;
	/**
	 * メールアドレス
	 */
	private String Email;
	/**
	 * パスワード
	 */
	private String password;
	/**
	 * セッション情報（ユーザーID）
	 */
	private Map<String, Object> session;

	/**
	 * 管理者
	 *
	* private boolean admin = true;
	*いらないと思う。
	*/

	// Cookie関連
	private HttpServletResponse response;

	private HttpServletRequest request;

	private Cookie cookieUserId;

	private Cookie cookieLoginFlg;

	/**
	 * ログインするための実行メソッド
	 *
	 * @return ログイン成功 =SUCCESS 失敗 =ERROR 管理人ならLOGIN
	 */
	public String execute() {
		String ret = ERROR;

		LoginDAO dao = new LoginDAO();
		LoginDTO dto = new LoginDTO();
		dto = dao.select(Email, password);

		if (Email.equals(dto.getEmail())) {
			if (password.equals(dto.getPassword())) {

				if (dto.isLoginFlg() == false) {

					if (dao.update(dto.getEmail(), dto.getPassword()) > 0) {

						dto = dao.select(dto.getEmail(), dto.getPassword());

						session.put("userId", dto.getUserId());
						

						// Cookie関連
						String cUserId = String.valueOf(dto.getUserId());

						String cLoginFlg = String.valueOf(dto.isLoginFlg());

						cookieUserId = new Cookie("userId", cUserId);

						cookieLoginFlg = new Cookie("loginFlg", cLoginFlg);

						cookieUserId.setMaxAge(60 * 60 * 24);

						cookieLoginFlg.setMaxAge(60 * 60 * 24);

						cookieUserId.setPath("/");

						cookieLoginFlg.setPath("/");

						response.addCookie(cookieUserId);

						response.addCookie(cookieLoginFlg);
/*
*						if (admin) {
*いらないと思う。
*/
							int userFlg = (int) dto.getUserFlg();
							if (userFlg == 3) {
								ret = LOGIN;
							} else {
								ret = SUCCESS;
							}						
					}
				}
			}
		}

		return ret;

	}

	/**
	 * メールアドレスを取得するメソッド
	 *
	 * @return Email メールアドレス
	 */
	public String getEmail() {
		return Email;
	}

	/**
	 * メールアドレスを格納するメソッド
	 *
	 * @param Email
	 *            セットする
	 */
	public void setEmail(String Email) {
		this.Email = Email;
	}

	/**
	 * パスワードを取得するメソッド
	 *
	 * @return password パスワード
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * パスワードを格納するメソッド
	 *
	 * @param password
	 *            セットする
	 */
	public void setPassword(String password) {
		this.password = password;
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
	 * セッション情報を格納するメソッド
	 *
	 * @param session
	 *            セットする session
	 */
	public void setSession(Map<String, Object> session) {
		this.session = session;
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

	public Cookie getCookieUserId() {
		return cookieUserId;
	}

	public void setCookieUserId(Cookie cookieUserId) {
		this.cookieUserId = cookieUserId;
	}

	public Cookie getCookieLoginFlg() {
		return cookieLoginFlg;
	}

	public void setCookieLoginFlg(Cookie cookieLoginFlg) {
		this.cookieLoginFlg = cookieLoginFlg;
	}

	@Override
	public void setServletResponse(HttpServletResponse response) {
		this.response = response;

	}

	public void setServletRequest(HttpServletRequest request) {
		this.request = request;
	}

}
