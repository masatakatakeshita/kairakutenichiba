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
 *
 */
public class LoginAction extends ActionSupport implements SessionAware{

	/**
	 * シリアルID
	 */
	private static final long serialVersionUID = 1960678948564666991L;
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
	 * @return ログイン成功 =SUCCESS 失敗 =ERROR 管理人ならLOGIN
	 */
	public String execute() {
		String ret = ERROR;

		LoginDAO dao = new LoginDAO();
		LoginDTO dto = new LoginDTO();
		dto = dao.select(email, password);

		if (email.equals(dto.getEmail())) {
			if (password.equals(dto.getPassword())) {

				if (dto.getLoginFlg() == false) {

					if (dao.update(dto.getEmail(), dto.getPassword()) > 0) {
						    session.put("userId", dto.getUserId());
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
