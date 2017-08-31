/**
 *
 */
package com.internousdev.kairakutenichiba.action;

import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.kairakutenichiba.dao.myPageDAO;
import com.internousdev.kairakutenichiba.dto.myPageDTO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author internousdev
 *
 */
public class myPageAction extends ActionSupport implements SessionAware{

	private Map<String,Object> session;

	private ArrayList<myPageDTO> UserList = new ArrayList<myPageDTO>();

	private int userId;

	public String execute(){
		if (session.get("userId") == null){
			return ERROR;
		}

		userId = (int) session.get("userId");
		myPageDAO mypagedao = new myPageDAO();

		UserList = mypagedao.select(userId);

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

	public ArrayList<myPageDTO> getUserList(){
		return UserList;
	}

	public void setUserList(ArrayList<myPageDTO> userList){
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
