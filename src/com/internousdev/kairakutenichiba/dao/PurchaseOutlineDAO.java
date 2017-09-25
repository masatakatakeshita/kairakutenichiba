package com.internousdev.kairakutenichiba.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.kairakutenichiba.util.DBConnector;

/**
 * 
 * @author shouji.hayato
 *
 */
public class PurchaseOutlineDAO {
	int ret;
	/**
	 * 購入情報（大）に値を入れるメソッド
	 * @author shouji.hayato
	 * @param purchaseId	購入ID
	 * @param userId　ユーザーID
	 * @param totalPrice　合計金額
	 * @param delivery　配送方法
	 * @param creditNumber　クレジットカード番号
	 * @return ret 実行行数を返す
	 */
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
