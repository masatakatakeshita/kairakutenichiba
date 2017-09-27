/**
 *
 */
package com.internousdev.kairakutenichiba.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.kairakutenichiba.dto.LoginDTO;
import com.internousdev.util.db.mysql.MySqlConnector;


public class LoginDAO {
	/**
	 * DB内部のログインID,パスワードを比較して同一ならDTOに保存する
	 * @param email 
	 * @param password
	 * @return dto dtoにDBの内容を保存。
	 */
	public LoginDTO select(String email, String password){

		MySqlConnector db = new MySqlConnector("com.mysql.jdbc.Driver","jdbc:mysql://localhost/","openconnect","root","mysql");
		Connection con = db.getConnection();
		LoginDTO dto = new LoginDTO();

		String sql = "select * from users where phone_email=? and password=?";
		try{
			PreparedStatement ps = con.prepareStatement(sql);
			
			ps.setString(1, email);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();

			while(rs.next()){
				dto.setEmail(rs.getString("phone_email"));
				dto.setPassword(rs.getString("password"));
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

	/**
	 * DBのログインフラッグを書き換えるメソッド
	 * @param email　Eメール
	 * @param password　パスワード
	 * @return　count DBないでexecuteUpdate()処理が行われた回数を返す
	 */
	public int update(String email, String password){
		int count=0;
		MySqlConnector db = new MySqlConnector("com.mysql.jdbc.Driver","jdbc:mysql://localhost/","openconnect","root","mysql");
		Connection con = db.getConnection();
		String sql = "update users set login_flg = true where phone_email = ? and password = ?";
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
