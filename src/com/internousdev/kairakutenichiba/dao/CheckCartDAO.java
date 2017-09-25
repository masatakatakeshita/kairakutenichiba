package com.internousdev.kairakutenichiba.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.util.db.mysql.MySqlConnector;

/**
 * カートテーブル情報追加に関するクラス
 * @author shoji hayato
 */
public class CheckCartDAO {
	
	/**
	 * カート内の商品の数量を調べるメソッド
	 * @param userId ユーザーID
	 * @param itemId アイテムID
	 * @return quantity 数量
	 * @autor shoji hayato
	 * @since 17/09/25
	 */
	
	private int quantity;
	
	public int check(int userId,int itemId){
		MySqlConnector db = new MySqlConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/", "kairakutenichiba", "root","mysql");
        Connection con = db.getConnection();
        String sql="SELECT * FROM carts WHERE user_id=? AND item_id=?";
        try{
        PreparedStatement ps=con.prepareStatement(sql);
        ps.setInt(1,userId);
        ps.setInt(2,itemId);
        ResultSet rs=ps.executeQuery();
        if(rs.next()){
        	quantity=rs.getInt("quantities");
        }else{
        	quantity=0;
        	}
        
        }catch(SQLException e){
        	e.printStackTrace();
        }finally{
        	try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
        }
        return quantity;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
