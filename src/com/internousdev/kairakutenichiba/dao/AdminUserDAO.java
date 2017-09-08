/**
 *
 */
package com.internousdev.kairakutenichiba.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.kairakutenichiba.dto.MyPageDTO;
import com.internousdev.util.DBConnector;

/**
 * @author internousdev
 *
 */
public class AdminUserDAO {

	/**
	* 顧客情報を取得しリストに格納する
	* @param userId ユーザーID
	* @return itemList 顧客情報
	* @version 1.0
	*/
	public ArrayList<MyPageDTO> select(int user_id) {
		DBConnector db = new DBConnector("com.mysql.jdbc.Driver","jdbc:mysql://localhost/","openconnect","root","mysql");
		Connection con = db.getConnection();
		MyPageDTO dto = new MyPageDTO();
		ArrayList<MyPageDTO> itemList = new ArrayList<MyPageDTO>();
		/**

		**/
		String sql = "select * from users where user_id=?";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, user_id);

			ResultSet rs = ps.executeQuery();
			while (rs.next()) {

				dto.setUserId(rs.getInt("userId"));

				dto.setFamilyName(rs.getString("family_name"));

				dto.setGivenName(rs.getString("given_name"));

				dto.setBirthday(rs.getString("birthday"));

				dto.setPhoneNumber(rs.getString("phone_number"));

				dto.setPhoneEmail(rs.getString("phone_email"));

				dto.setPostal(rs.getString("postal"));

				dto.setAddress(rs.getString("address"));

				dto.setPassword(rs.getString("password"));

				dto.setSex(rs.getString("sex"));

				dto.setRegisterDay(rs.getString("register_day"));

				itemList.add(dto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return itemList;
	}
}