/**
 *
 */
package com.internousdev.kairakutenichiba.action;

import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.kairakutenichiba.dao.MyPageDAO;
import com.internousdev.kairakutenichiba.dto.MyPageDTO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author internousdev
 *
 */
class UserAction extends ActionSupport implements SessionAware{


	/**
	 * シリアルID
	 */
private static final long serialVersionUID = 5885699203740558850L;
	/**
	 * セッション情報
	 */
	private Map<String,Object> session;
	/**
	 * ユーザーリスト
	 */
	private ArrayList<MyPageDTO> User = new ArrayList<MyPageDTO>();
	/**
	 * ユーザID
	 */
	private int userId;

	/**
	 * ユーザー情報を表示するための実行メソッド
	 * @author Miyauchi
	 * @return ユーザー情報が取得 =SUCCESS 失敗 =ERROR
	 */
	public String execute(){
		if (session.get("userId") == null) {
			return ERROR;
		}
		/**
		 * sessionからユーザーIDを取得
		 */
		userId = (int) session.get("userId");
		MyPageDAO MyPagedao = new MyPageDAO();

		User = MyPagedao.select(userId);

		if (User.size() == 0) {

			return ERROR;
		}else{
			return SUCCESS;
		}


	}

	/**
	 * セッションを取得
	 * @return session セッション
	 */
	public Map<String, Object> getSession() {
		return session;
	}
	/**
	 * セッションを設定
	 * @param session セットする session
	 */
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	/**
	 * ユーザリストを取得
	 * @return UserList ユーザリスト
	 */
	public ArrayList<MyPageDTO> getUser() {
		return User;
	}

	/**
	 * ユーザリスト格納メソッド
	 * @author Miyauchi
	 * @param userList セットする userList
	 */
	public void setUserList(ArrayList<MyPageDTO> userList) {
		User = userList;
	}

	/**
	 * ユーザーDを取得メソッド
	 * @return userID　ユーザーID
	 */
	public int getUserId() {
		return userId;
	}

	/**
	 * ユーザーＩＤ格納メソッド
	 * @author Miyauchi
	 * @param userId セットする userId
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}







}
