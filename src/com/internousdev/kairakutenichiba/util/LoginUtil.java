/**
 *
 */
package com.internousdev.kairakutenichiba.util;

import java.util.Map;

import com.internousdev.kairakutenichiba.dto.MyPageDTO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author internousdev
 *
 */
public class LoginUtil extends ActionSupport{


	/**
	 * シリアルID
	 */
	private static final long serialVersionUID = -564268116563098912L;

	/**
	 * ログインの成否を判定するメソッド
	 * @param dto DBから抽出したユーザーDTOのインスタンス
	 * @param session セッション
	 * @return errorMsg
	 * @author Kaito Fukutani
	 * @since 2017/5/22
	 * @version 1.0
	 */
	public String validate(MyPageDTO dto, Map<String, Object> session) {
		String errorMsg = null;
		if (session.containsKey("userId")) {
			if ((int) (session.get("userId")) == (dto.getUserId())) {
				errorMsg = getText("lang.login.notDouble");
			} else {
				errorMsg = getText("lang.login.notSameTime");
			}
			return errorMsg;
		}
		if(dto.isLoginFlg() == true) {
			errorMsg = getText("lang.login.notDouble");
		}
		return errorMsg;
	}

	/**
	 * ログインの成否を判定するメソッド(オーバーロード)
	 * @param email メールアドレス
	 * @param password パスワード
	 * @param dto DBから抽出したユーザーDTOのインスタンス
	 * @param session セッション
	 * @return errorMsg
	 * @author Kaito Fukutani
	 * @since 2017/5/22
	 * @version 1.0
	 */
	public String validate(String email, String password, MyPageDTO dto, Map<String, Object> session) {
		String errorMsg = null;

		if (!email.equals(dto.getPhoneEmail()) || !password.equals(dto.getPassword())) {
			errorMsg = getText("lang.login.notCorrect");
			return errorMsg;
		}
		errorMsg = this.validate(dto, session);
		return errorMsg;
	}


}
