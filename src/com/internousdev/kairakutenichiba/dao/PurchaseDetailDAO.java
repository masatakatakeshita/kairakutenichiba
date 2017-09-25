package com.internousdev.kairakutenichiba.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.kairakutenichiba.util.DBConnector;


/**
 * 
 * @author shoji.
 *
 */
public class PurchaseDetailDAO {
	int ret;
	/**
	 * 購入情報詳細をデータベースにいれる
	 * @param purchaseId　購入ID
	 * @param userId　ユーザーID
	 * @param itemId　商品ID
	 * @param quantity　量
	 * @param price　価格
	 * @return ret 実行行数を返す
	 */
	public int insert(int purchaseId,int userId,int itemId,int quantity,float price){
		ret=0;
		DBConnector db = new DBConnector("com.mysql.jdbc.Driver","jdbc:mysql://localhost/","kairakutenichiba","root","mysql");
		Connection con = db.getConnection();
		
		String sql="insert into purchases_details(purchase_id,user_id,item_id,quantities,multiplied_price)values(?,?,?,?,?)";
				try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1,purchaseId );
			ps.setInt(2,userId );
			ps.setInt(3,itemId );
			ps.setInt(4,quantity );
			ps.setFloat(5,price*quantity );
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
