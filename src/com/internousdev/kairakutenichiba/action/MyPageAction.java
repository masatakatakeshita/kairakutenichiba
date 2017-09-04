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


@SuppressWarnings("serial")
public class MyPageAction extends ActionSupport implements SessionAware{

	private Map<String,Object> session;

	private ArrayList<MyPageDTO> UserList = new ArrayList<MyPageDTO>();

	private int userId;

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

	public Map<String,Object> getSession(){
		return session;
	}

	public void setSession1(Map<String, Object> session){
		this.session =session;
		}

	public ArrayList<MyPageDTO> getUserList(){
		return UserList;
	}

	public void setUserList(ArrayList<MyPageDTO> userList){
		UserList = userList;
	}

	public int getUserId(){
		return userId;
	}

	public void setUserId(int userId){
		this.userId =userId;
	}

	public void setSession(Map<String, Object> arg0) {

	}

}
