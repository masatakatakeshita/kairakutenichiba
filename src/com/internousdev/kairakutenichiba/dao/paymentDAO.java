package com.internousdev.kairakutenichiba.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.kairakutenichiba.dto.paymentDTO;
import com.internousdev.kairakutenichiba.util.DBConnector;

/**
 * @author koizumi junpei
 * 2017/09/13
 *
 */
public class paymentDAO{
	/**
	 * 入力されたクレジット番号の上6ケタと、クレジットマネージャDBを照合するメソッド
	 * creditId クレジットの種類
	 *
	 *
	 * utilのDBConnector classコンストラクタ呼び出し。
		drivename, urlは特に変更してないけど、コンストラクタ呼び出しにいるので記述。
		databaseNameはcommon01-creditcard.sql のcreditcard_manager
		actionクラスの creditId
		actionはjspからうけとってる？

	 */
/*
	public boolean select(int creditId){
		DBConnector db = new DBConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/", "creditcard_manager", "root","mysql");
		Connection con = db.getConnection();
		boolean result = false;
		String brandName = null;
			//from テーブル名(m_creditcard_type) カラム名(card_number)
		String sql = "select * from m_creditcard_type where card_number = ?";
	}
*/


//値の比較のためのメソッド
//visa master American の分岐どうやんだ？
	public paymentDTO select(String nameHolder, String creditNumber, String expirationMonth, String expirationYear, String securityCode){
		DBConnector db = new DBConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/", "creditcard_manager", "root","mysql");
		Connection con = db.getConnection();
		paymentDTO dto = new paymentDTO();

		//ここのDB判定どうやんねん from DB名
		String sql = "select * from creditcard where name_e=? and credit_number=? and expiration_month=? and expiration_year = ? and security_code = ?";

		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, nameHolder); 
			ps.setString(2, creditNumber);
			ps.setString(3, expirationMonth );
			ps.setString(4, expirationYear);
			ps.setString(5, securityCode);
			//ここで検索してるっぽい。

			ResultSet rs = ps.executeQuery(); 
			if(rs.next()){
				dto.setNameHolder(rs.getString("name_e"));	//ここテーブルの値をdtoに保存
				dto.setCreditNumber(rs.getString("credit_number"));
				dto.setExpirationMonth(rs.getString("expirationMonth"));
				dto.setExpirationYear(rs.getString("expirationYear"));
				dto.setSecurityCode(rs.getString("secuirtycode"));
				dto.setCreditId(rs.getInt("credit_id"));
			}
			//loginDAOのやつもpassward数字だけど、Stringでやってもんもん
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
