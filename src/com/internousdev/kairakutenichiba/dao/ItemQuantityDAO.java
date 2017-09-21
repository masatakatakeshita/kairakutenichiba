package com.internousdev.kairakutenichiba.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.kairakutenichiba.util.DBConnector;

public class ItemQuantityDAO {
	
	private int newstocks;
	
	private int ret;
	
	public int itemupdate(int itemId,int quantity){
		ret=0;
		DBConnector db=new DBConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/", "legmina", "root","mysql");
		Connection con=db.getConnection();
		String sql1= "select * from items where item_id=?";
		String sql2= "update items set stocks =? where item_id=?";
		
		try{
			PreparedStatement ps1= con.prepareStatement(sql1);
			ps1.setInt(1, itemId);
			ResultSet rs = ps1.executeQuery();
			newstocks=rs.getInt("stocks")-quantity;
			
			try{
				PreparedStatement ps2= con.prepareStatement(sql2);
				ps2.setInt(1,newstocks);
				ps2.setInt(2, itemId);
				
				ret=ps2.executeUpdate();

				ps2.close();
			}catch(SQLException e){
				e.printStackTrace();
			} 
			
			ps1.close();
			
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

	public int getNewstocks() {
		return newstocks;
	}

	public void setNewstocks(int newstocks) {
		this.newstocks = newstocks;
	}
}
