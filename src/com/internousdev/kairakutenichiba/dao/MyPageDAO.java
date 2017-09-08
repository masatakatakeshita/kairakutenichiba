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
				dto.setUserId(rs.getInt("user_id"));

				dto.setname(rs.getString("name"));

				dto.sethurigana(rs.getString("hurigana"));

				dto.setPhoneEmail(rs.getString("phoneEmail"));

				dto.setAddress(rs.getString("address"));

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
