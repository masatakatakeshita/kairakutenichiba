/**
 *
 */
package com.internousdev.kairakutenichiba.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.util.db.mysql.MySqlConnector;


public class LogoutDAO {
	/**
	 * userIdのlogin_flgを引数loginFlgに更新するメソッド（基本loginFlg=false）
	 * @param userId ユーザーＩＤ
	 * @param loginFlg ログインフラグ
	 * @return count 正しく動作すれば変更を行った行数、errorならば0を返す
	 * @version 1.0
	 */
	public int update(int userId){	//Actionで実行時にここの引数が渡されてくる
		int count = 0;
		MySqlConnector db = new MySqlConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/", "openconnect", "root", "mysql");
		Connection con = db.getConnection();

		String sql = "update users set login_flg=false where user_id=?";
		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, userId);
			count = ps.executeUpdate();
			return count;
		}catch(SQLException e){
			e.printStackTrace();
		}
		try{
			con.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
 		return count;
	}

}
