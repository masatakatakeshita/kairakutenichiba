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

	private Map<String,Object> session;

	private String userid;
	private String password;


	public String execute() {
		String ret = ERROR;

		LoginDAO dao = new LoginDAO();
		LoginDTO dto = new LoginDTO();
		dto = dao.select(userid, password);
}

}
