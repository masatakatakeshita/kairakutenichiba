/**
 * 
 */
package com.internousdev.kairakutenichiba.action;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.kairakutenichiba.dao.MypageDAO;
import com.internousdev.kairakutenichiba.dto.MypageDTO;
import com.opensymphony.xwork2.ActionSupport;

/**
* ユーザーがマイページでユーザー情報を取得するクラス
* @author Miyauchi Akitomo
* @since 2017/5/18
* @version 1.0
*
*/
public class UserAction extends ActionSupport implements SessionAware{


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
		private ArrayList<MypageDTO> User = new ArrayList<MypageDTO>();
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
			MypageDAO mypagedao = new MypageDAO();

			User = mypagedao.select(userId);

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
		public ArrayList<MypageDTO> getUser() {
			return User;
		}

		/**
		 * ユーザリスト格納メソッド
		 * @author Miyauchi
		 * @param userList セットする userList
		 */
		public void setUserList(ArrayList<MypageDTO> userList) {
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
