package com.internousdev.kairakutenichiba.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.kairakutenichiba.dto.paymentDTO;
import com.internousdev.util.db.mysql.MySqlConnector;

/**
 * @author koizumi junpei
 * 2017/09/13
 *
 */
public class paymentDAO{


	/**
	 * クレジットカードの入力情報をDBと比較して、あっているならDTOに保存するメソッド。
	 * @param nameHolder 名義
	 * @param creditNumber　クレジットカード番号
	 * @param expirationMonth　期限月
	 * @param expirationYear　期限年　
	 * @param securityCode　セキュリティコード
	 * @return 
	 */
	public paymentDTO select(String nameHolder, String creditNumber, String expirationMonth, String expirationYear, String securityCode){
		MySqlConnector db = new MySqlConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/", "creditcard_manager", "root","mysql");
		Connection con = db.getConnection();
		paymentDTO dto = new paymentDTO();

		String sql = "select * from creditcard where name_e=? and credit_number=? and expiration_month=? and expiration_year = ? and security_code = ?";

		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, nameHolder); 
			ps.setString(2, creditNumber);
			ps.setString(3, expirationMonth );
			ps.setString(4, expirationYear);
			ps.setString(5, securityCode);

			ResultSet rs = ps.executeQuery(); 
			if(rs.next()){
				dto.setNameHolder(rs.getString("name_e"));	
				dto.setCreditNumber(rs.getString("credit_number"));
				dto.setExpirationMonth(rs.getString("expirationMonth"));
				dto.setExpirationYear(rs.getString("expirationYear"));
				dto.setSecurityCode(rs.getString("secuirtycode"));
				dto.setCreditId(rs.getInt("credit_id"));
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		try{
			con.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
			return dto;

	}


}
