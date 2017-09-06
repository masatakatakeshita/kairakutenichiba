/**
 *
 */
package com.internousdev.kairakutenichiba.action;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.Definition;
import com.internousdev.LoginUtil;
import com.internousdev.kairakutenichiba.dao.LoginOauthDAO;
import com.internousdev.kairakutenichiba.dto.MyPageDTO;
import com.internousdev.util.oauth.facebook.FacebookOauth;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author internousdev
 * LoginFacebookAction　FACEBOOKでログインする為のクラス
 */
public class LoginFacebookAction extends ActionSupport implements SessionAware{

	/**
	 *シリアルバージョンIDの生成
	 */
	private static final long serialVersionUID = 8019870018624857587L;

	/**
	 * ネットワークネーム
	 *
	 *
	 * @version 1.0
	 */

	static final int NETWORK_NAME = Definition.NETWORK_NAME_FACEBOOK;


	/**
	 * レスポンス
	 * @version 1.0
	 */
	private HttpServletRequest request;
	/**
	 * リクエスト
	 * @version 1.0
	 */
	private HttpServletResponse response;
	/**
	 * セッション
	 * @version 1.0
	 */
	private Map<String, Object> session;

	/**
	 * エラーメッセージ
	 * @version 1.0
	 */
	private String errorMsg;

	/**実行メソッド
	 * FACEBOOK認証をし、ユーザー情報をセッションする為のメソッド
	 * @version 1.0
	 */
	public String execute() {
		String rtn = ERROR;
		FacebookOauth oauth = new FacebookOauth();
		Map<String, String> userMap = null;
		userMap = oauth.getAccessToken(request, response);

		if (userMap == null) {
			return rtn;
		}

		String uniqueId = userMap.get("id");
		String userName = userMap.get("name");
		LoginOauthDAO dao = new LoginOauthDAO();
		LoginUtil login = new LoginUtil();
		MyPageDTO dto = new MyPageDTO();

		dto = dao.selectInList(uniqueId, NETWORK_NAME);
		if (dto.getOauthAccount() != null) {

			int count = dao.update(uniqueId);
			if (count == 0) {
				return rtn;
			}

			errorMsg = login.validate(dto, session);
			if (errorMsg != null) {
				return rtn;
			}
			dao.update(uniqueId);//ログインフラグ変更
			dto = dao.selectInList(uniqueId, NETWORK_NAME);//dto情報の取得

			session.put("userId", dto.getUserId());
			session.put("loginFlg", dto.isLoginFlg());
			rtn = SUCCESS;
			return rtn;
		}

		//ユーザー情報を新しくDBに登録する
		boolean result = dao.insert(uniqueId, userName, NETWORK_NAME);
		if (!result) {
			return rtn;
		}
		dao.update(uniqueId);//ログインフラグ変更
		dto = dao.selectInList(uniqueId, NETWORK_NAME);
		session.put("userId", dto.getUserId());
		session.put("loginFlg", dto.isLoginFlg());
		rtn = SUCCESS;
		return rtn;
	}

	/**
	 * リクエスト格納メソッド
	 *
	 *
	 * @version 1.0
	 * @param request セットする
	 */
	public void setServletRequest(HttpServletRequest request) {
		this.request = request;
	}
     /**
      * レスポンス格納メッソド
	 *
	 *
	 * @version 1.0
	 * @param response　セットする
	 */
	public void setServletResponse(HttpServletResponse response) {
		this.response = response;
	}

	/**
	 * セッション取得メソッド
	 *
	 *
	 * @version 1.0
	 * @return session
	 */
	public Map<String, Object> getSession() {
		return session;
	}

	/**
	 * セッション格納メソッド
	 *
	 *
	 * @version 1.0
	 * @param session　セットする
	 */
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	/**
	 * エラーメッセージ取得メソッド
	 *
	 *
	 * @version 1.0
	 * @return errorMsg
	 */
	public String getErrorMsg() {
		return errorMsg;
	}

	/**
	 * エラーメッセージ格納メソッド
	 *
	 *
	 * @version 1.0
	 * @param errorMsg セットする
	 */
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
}


}
