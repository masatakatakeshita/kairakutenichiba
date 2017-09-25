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


public class MyPageDAO {

	/**
	 * ユーザーIDでDBを検索し、ユーザー情報をDTOに格納するメソッド
	 * @param userId　ユーザーID
	 * @return userList　DTOのユーザー情報を配列で返す
	 */
	public ArrayList<MyPageDTO> select(int userId) {
		DBConnector db = new DBConnector("com.mysql.jdbc.Driver","jdbc:mysql://localhost/","openconnect","root","mysql");
		Connection con = db.getConnection();
		MyPageDTO dto = new MyPageDTO();
		ArrayList<MyPageDTO> userList = new ArrayList<MyPageDTO>();

		String sql = "select * from users where user_id=?";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, userId);

			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				dto.setUserId(rs.getInt("userId"));

				dto.setFamilyNameKanji(rs.getString("family_name_kanji"));

				dto.setGivenNameKanji(rs.getString("given_name_kanji"));

				dto.setFamilyNameKana(rs.getString("family_name_kana"));

				dto.setGivenNameKana(rs.getString("given_name_kana"));

				dto.setAddress(rs.getString("address"));

				dto.setPhoneEmail(rs.getString("phone_email"));

				dto.setPhoneNumber(rs.getString("phone_number"));




				userList.add(dto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return userList;

	}


}
