/**
 *
 */
package com.internousdev.kairakutenichiba.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.kairakutenichiba.dao.LoginDAO;
import com.internousdev.kairakutenichiba.dto.LoginDTO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author internousdev
 *
 */
public class LoginAction extends ActionSupport implements SessionAware {

	/**
	 * メールアドレス
	 */
	private String email;
	/**
	 * パスワード
	 */
	private String password;
	/**
	 * セッション情報（ユーザーID）
	 */
	private Map<String, Object> session;





	/**
	 * ログインするための実行メソッド
	 *
	 * @return ログイン成功 =SUCCESS 失敗 =ERROR 管理人ならLOGIN
	 */
	public String execute() {
		String ret = ERROR;

		LoginDAO dao = new LoginDAO();
		LoginDTO dto = new LoginDTO();
		dto = dao.select(email, password);

		if (email.equals(dto.getEmail())) {
			if (password.equals(dto.getPassword())) {

				if (dto.isLoginFlg() == false) {

					if (dao.update(dto.getEmail(), dto.getPassword()) > 0) {

						dto = dao.select(dto.getEmail(), dto.getPassword());

						session.put("userId", dto.getUserId());
						session.put("loginFlg", dto.isLoginFlg());




					}
				}
			}
		}

		return ret;

	}

	/**
	 * メールアドレスを取得するメソッド
	 *
	 * @return email メールアドレス
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * メールアドレスを格納するメソッド
	 *
	 * @param Email
	 *            セットする
	 */
	public void setEmail(String email) {
		this.email = email;
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



}
