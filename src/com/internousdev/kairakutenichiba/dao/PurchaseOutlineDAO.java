package com.internousdev.kairakutenichiba.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.kairakutenichiba.util.DBConnector;

//購入情報（大）をデータベースにぶち込む。荘司。

public class PurchaseOutlineDAO {
	int ret;
	public int insert(int purchaseId,int userId,float totalPrice,String delivery,String creditNumber){
		ret=0;
		DBConnector db = new DBConnector("com.mysql.jdbc.Driver","jdbc:mysql://localhost/","kairakutenichiba","root","mysql");
		Connection con = db.getConnection();
		
		String sql="insert into purchases_outlines(purchase_id,user_id,total_price,delivery,credit_number)values(?,?,?,?,?)";
				try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, purchaseId);
			ps.setInt(2,userId );
			ps.setFloat(3, totalPrice);
			ps.setString(4, delivery);
			ps.setString(5, creditNumber);
			ret=ps.executeUpdate();
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
				return ret;
	}

}
