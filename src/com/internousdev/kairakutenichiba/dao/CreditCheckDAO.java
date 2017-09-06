/**
 *
 */
package com.internousdev.kairakutenichiba.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.kairakutenichiba.dto.CreditDTO;
import com.internousdev.kairakutenichiba.util.DBConnector;

/**
 * クレジットの照合に関するクラス
 * @author MISA KIKUCHI
 * @since 5/19
 * @version 1.0
 */
public class CreditCheckDAO {

	/**
	 * 入力されたクレジット番号の上6ケタと、クレジットマネージャDBを照合するメソッド
	 * @param creditId クレジットの種類
	 * @param checkNumber クレジット番号上6ケタ
	 * @return result 合致すればtrue、しなければfalseを返す
	 * @author MISA KIKUCHI
	 * @since 5/19
	 * @version 1.0
	 */
	public boolean select(int creditId, String checkNumber){

		DBConnector db = new DBConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/", "creditcard_manager", "root","mysql");
		Connection con = db.getConnection();
		boolean result = false;
		String brandName = null;
		String sql = "select * from m_creditcard_type where card_number = ?";
		if(creditId == 1){
				brandName = "Visa";
		}else if(creditId == 2){
				brandName = "MasterCard";
		}else if(creditId == 3){
				brandName = "American Express";
		}


	try{
		PreparedStatement ps = con.prepareStatement(sql);

		ps.setString(1, checkNumber);
		ResultSet rs = ps.executeQuery();
		rs.next();
		if(rs.getString("card_name").equals(brandName)){

			result = true;

			}
	}catch(SQLException e){
		e.printStackTrace();
	}finally{

		try{
			con.close();
		}catch(SQLException e){
			e.printStackTrace();
			}
		}
		return result;
	}


	/**
	 * クレジットカード情報を取得しリストに格納するメソッド
	 * @param creditId クレジットの種類
	 * @param creditNumber クレジット番号
	 * @return userInfoDto クレジットカード情報
	 * @version 1.0
	 */
	public CreditDTO selectUserInfo(int creditId, String creditNumber){

		CreditDTO userInfoDto = new CreditDTO();
		String brandName = null;
		if(creditId == 1){
			brandName = "visa";

		}else if(creditId == 2){
			brandName = "mastercard";

		}else if(creditId == 3){
			brandName = "americanexpress";
		}

		DBConnector db = new DBConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/", brandName, "root", "mysql");
		Connection con = db.getConnection();

		/** 以下でカード番号、セキュリティコード、有効期限の情報を抜き取るが、
		 * 	visaのDBに有効期限がないので、それだけはカード番号とセキュリティコードのみ抜き取ってる。**/

			String query = "select * from credit_card where credit_number =?";
			try {
				PreparedStatement ps = con.prepareStatement(query);
				ps.setString(1, creditNumber);
				ResultSet rs = ps.executeQuery();
				while(rs.next()){
						userInfoDto.setCreditNumber(rs.getString("credit_number"));
						userInfoDto.setSecurityCode(rs.getInt("security_code"));

						if(creditId != 1){
							//有効期限が年月合わさっていて、かつvarcharのため、intに直し、年は上4ケタ、月は下2桁のみ切り取り
							userInfoDto.setExpirationYear(Integer.parseInt((rs.getString("expiration_day")).substring(0, 4)));
							userInfoDto.setExpirationMonth(Integer.parseInt((rs.getString("expiration_day")).substring(6, 7)));
						}

				}
			} catch (SQLException e) {
				e.printStackTrace();
			}finally{
				if(con != null){
					try {
						con.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
			}
			return userInfoDto;
	}


}