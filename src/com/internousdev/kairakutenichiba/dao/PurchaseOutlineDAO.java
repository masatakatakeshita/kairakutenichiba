package com.internousdev.kairakutenichiba.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.kairakutenichiba.util.DBConnector;

public class PurchaseOutlineDAO {
	int ret;
	public int insert(int purchaseId,int userId,int totalPrice,String delivery,int creditNumber){
		ret=0;
		DBConnector db = new DBConnector("com.mysql.jdbc.Driver","jdbc:mysql://localhost/","kairakutenichiba","root","mysql");
		Connection con = db.getConnection();
		
		String sql="insert into purchases_outlines(purchase_id,user_id,total_price,delivery,credit_number)values(purchaseId,userId,totalPrice,delivery,creditNumber)";
				try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.executeUpdate();
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
