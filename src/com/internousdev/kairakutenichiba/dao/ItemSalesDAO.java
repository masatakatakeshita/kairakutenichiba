package com.internousdev.kairakutenichiba.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.util.db.mysql.MySqlConnector;

public class ItemSalesDAO {
	/**
	 * 売上
	 */
	private int sales;
	
	/**
	 * 商品IDを使って値段を取得するメソッド
	 * @param itemId　商品ID
	 * @return sales 売上
	 */
	public int sales(int itemId){
	    sales=0;
		MySqlConnector db=new MySqlConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/", "kairakutenichiba", "root","mysql");
		Connection con=db.getConnection();
		String sql= "select * from items where item_id=?";
	
		
		try{
			PreparedStatement ps= con.prepareStatement(sql);
			ps.setInt(1, itemId);
			ResultSet rs = ps.executeQuery();
			sales=rs.getInt("sales");
			
			
			
			
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			try{
				con.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
			
		return sales;
    }

	public int getSales() {
		return sales;
	}

	public void setSales(int sales) {
		this.sales = sales;
	}


}
