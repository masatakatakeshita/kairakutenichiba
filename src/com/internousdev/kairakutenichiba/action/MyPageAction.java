/**
ユーザーがマイページでユーザー情報を取得するクラス
 *
 */
package com.internousdev.kairakutenichiba.action;

import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.kairakutenichiba.dao.MyPageDAO;
import com.internousdev.kairakutenichiba.dto.MyPageDTO;
import com.opensymphony.xwork2.ActionSupport;



public class MyPageAction extends ActionSupport implements SessionAware{

	/**
	 * シリアルID
	 */
	private static final long serialVersionUID = -4224690986696875933L;

	private Map<String,Object> session;

	private ArrayList<MyPageDTO> UserList = new ArrayList<MyPageDTO>();

	/**
	 * ユーザーID
	 */
	private int userId;

	/**
	 * セッション情報を取得する。
	 * userListにセッションの情報が移っており、存在していたらSUCCESS
	 */
	public String execute(){
		if (session.get("userId") == null){
			return ERROR;
		}

		userId = (int) session.get("userId");
		MyPageDAO MyPagedao = new MyPageDAO();

		UserList = MyPagedao.select(userId);

		if (UserList.size() ==0){
			return ERROR;
		}else{
			return SUCCESS;
		}
	}

	/**
	 * セッション情報を取得するメソッド
	 * return session
	 */
	public Map<String,Object> getSession(){
		return session;
	}

	/**
	 * セッション情報を格納するメソッド
	 * param session
	 */
	public void setSession1(Map<String, Object> session){
		this.session =session;
	}

	/**
	 *  配列化されたユーザー情報を取得するメソッド
	 * @return UserList
	 */
	public ArrayList<MyPageDTO> getUserList(){
		return UserList;
	}
	/**
	 * DTOに格納された情報をUserListに格納するメソッド
	 * @param userList
	 */
	public void setUserList(ArrayList<MyPageDTO> userList){
		UserList = userList;
	}

	/**
	 * ユーザーIDを取得するメソッド
	 * @return userId
	 */
	public int getUserId(){
		return userId;
	}
	/**
	 * ユーザーIDを格納するメソッド
	 * @param userId
	 */
	public void setUserId(int userId){
		this.userId =userId;
	}
	/**
	 * セッション情報を格納するメソッド
	 */
	public void setSession(Map<String, Object> arg0) {
		this .session = arg0;
	}

}
