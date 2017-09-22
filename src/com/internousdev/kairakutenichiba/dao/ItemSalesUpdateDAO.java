package com.internousdev.kairakutenichiba.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.kairakutenichiba.util.DBConnector;

public class ItemSalesUpdateDAO {

	private int ret;
	
	public int itemsalesupdate(int itemId,int newsales){
		ret=0;
		DBConnector db=new DBConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/", "kairakutenichiba", "root","mysql");
		Connection con=db.getConnection();
		String sql= "update items set sales =? where item_id=?";
		try{
			PreparedStatement ps= con.prepareStatement(sql);
			ps.setInt(1,newsales);
			ps.setInt(2, itemId);
			
			ret=ps.executeUpdate();
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			try{
				con.close();
			}catch(SQLException e){
				e.printStackTrace();
			} 
	    }
		return ret;
	}
}
