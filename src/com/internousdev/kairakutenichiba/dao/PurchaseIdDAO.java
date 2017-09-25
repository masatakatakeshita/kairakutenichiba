package com.internousdev.kairakutenichiba.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.util.db.mysql.MySqlConnector;


public class PurchaseIdDAO {
	int ret;
	/**
	 * @shouji.hayato
	 * 購入情報（大）のデータの件数を調べる
	 * @return ret テーブル内部の最後までの行数を返す
	 */
	public int count(){
		ret=0;
		MySqlConnector db = new MySqlConnector("com.mysql.jdbc.Driver","jdbc:mysql://localhost/","kairakutenichiba","root","mysql");
		Connection con = db.getConnection();
		
		String sql="select * from purchas_outlines";
				try{
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				ret++;
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
				return ret;
	}

}
