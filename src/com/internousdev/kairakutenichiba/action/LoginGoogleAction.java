package com.internousdev.kairakutenichiba.action;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.kairakutenichiba.dao.LoginOauthDAO;
import com.internousdev.kairakutenichiba.dto.MyPageDTO;
import com.internousdev.kairakutenichiba.util.Definition;
import com.internousdev.kairakutenichiba.util.GoogleOauth;
import com.internousdev.kairakutenichiba.util.LoginUtil;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author internousdev
 *Googleでログインする為のクラス
 */
public class LoginGoogleAction extends ActionSupport implements
ServletRequestAware, SessionAware {

	/**
	 * シリアルID
	 */
	private static final long serialVersionUID = 7348119319842803358L;

	/**
	 * ネットワークネーム
	 */
	static final int NETWORK_NAME = Definition.NETWORK_NAME_GOOGLE;

	/**
	 * セッション
	 */
	private Map<String, Object> session;

	/**
	 * リクエスト
	 */
	private HttpServletRequest request;


	/**
	 * エラーメッセージ
	 */
	private String errorMsg;

	/**
	 * Google認証の実行メソッド
	 * @return SUCCESS
	 */
	public String execute(){
		String rtn = ERROR;

		GoogleOauth googleOauth = new GoogleOauth();
		Map<String, String> userMap = googleOauth.getAccessToken(request);

		if (userMap == null) {
			return rtn;
		}
		String uniqueId = userMap.get("id");
		String userName = userMap.get("name");
		LoginOauthDAO dao = new LoginOauthDAO();
		MyPageDTO dto = dao.getMyPageDTO();
		LoginUtil login = new LoginUtil();

		dto = dao.selectInList(uniqueId, NETWORK_NAME);
		if (dto.getOauthAccount() != null) {

			int count = dao.update(uniqueId);
			if(count == 0) {
				return rtn;
			}

			errorMsg = login.validate(dto, session);
			if(errorMsg != null) {
				return rtn;
			}

			dao.update(uniqueId);//ログインフラグ変更
			dto = dao.selectInList(uniqueId, NETWORK_NAME);//dto情報の取得

			session.put("userId", dto.getUserId());
			session.put("loginFlg", dto.isLoginFlg());
			rtn = SUCCESS;
			return rtn;
		}

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
	  *  セッションを格納するためのメソッド
	  *  @param session セッション
	  */
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
	 /**
	  * セッションを取得するためのメソッド
	  * @return session
	  */
	public Map<String, Object> getSession() {
		return session;
	}
	 /**
	  * リクエストを取得するためのメソッド
	  * @param request リクエスト
	  */
	public void setServletRequest(HttpServletRequest request) {
		this.request = request;
	}
	/**
	 * エラーメッセージ取得メソッド
	 * @return errorMsg
	 */
	public String getErrorMsg() {
		return errorMsg;
	}
	/**
	 * エラーメッセージ格納メソッド
	 * @param errorMsg セットする errorMsg
	 */
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
}
