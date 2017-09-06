/**
 *
 */
package com.internousdev.kairakutenichiba.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.kairakutenichiba.dto.LoginDTO;
import com.internousdev.kairakutenichiba.util.DBConnector;

/**
 * @author internousdev
 *
 */
public class LoginDAO {
	public LoginDTO select(String email, String password){

		DBConnector db = new DBConnector("com.mysql.jdbc.Driver","jdbc:mysql://localhost/","openconnect","root","mysql");

		Connection con = db.getConnection();
		LoginDTO dto = new LoginDTO();

		String sql = "select email, password, user_id, login_flg, family_name, given_name, user_flg"
				+" from users where email=? and password=?";
		try{
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1, email);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();

			if(rs.next()){
				dto.setEmail(rs.getString("email"));
				dto.setPassword(rs.getString("password"));
				dto.setUserId(rs.getInt("user_id"));
				dto.setLoginFlg(rs.getBoolean("login_flg"));
				dto.setUserFlg(rs.getInt("user_flg"));
			}
		}catch(SQLException e){
			e.printStackTrace();
		}try{
			con.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return dto;
	}

	public int update(String email, String password){
		int count=0;
		DBConnector db = new DBConnector("com.mysql.jdbc.Driver","jdbc:mysql://localhost/","openconnect","root","mysql");
		Connection con = db.getConnection();
		String sql = "update users set login_flg = true where email = ? and password = ?";
		try{
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1, email);
			ps.setString(2, password);
			count = ps.executeUpdate();
		}catch(SQLException e){
			e.printStackTrace();
		}try{
			con.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return count;
	}


}
