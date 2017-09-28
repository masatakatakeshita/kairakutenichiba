package com.internousdev.kairakutenichiba.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.util.db.mysql.MySqlConnector;

public class ItemStocksDAO {
	
	private int stocks;
	
	public int stocks(int itemId){
		MySqlConnector db=new MySqlConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/", "kairakutenichiba", "root","mysql");
		Connection con=db.getConnection();
		String sql= "select * from items where item_id=?";
	
		
		try{
			PreparedStatement ps= con.prepareStatement(sql);
			ps.setInt(1, itemId);
			ResultSet rs = ps.executeQuery();
			if(rs.next()){
			stocks=rs.getInt("stocks");
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
		return stocks;
    }


	public int getStocks() {
		return stocks;
	}

	public void setStocks(int stocks) {
		this.stocks = stocks;
	}
}
