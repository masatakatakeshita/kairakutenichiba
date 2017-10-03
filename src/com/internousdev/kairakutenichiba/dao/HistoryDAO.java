package com.internousdev.kairakutenichiba.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.kairakutenichiba.dto.HistoryDTO;
import com.internousdev.util.db.mysql.MySqlConnector;


/**
 * @author junpei koizumi
 *
 */
public class HistoryDAO {
	
	
	/**
	 * ユーザーの購入履歴をリスト化して表示する
	 * @author junpei.koizumi
	 * @param userId ユーザーID
	 * @return　HistoryList　購入履歴
	 */
	public ArrayList<HistoryDTO> select(Object userId){
		MySqlConnector db = new MySqlConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/", "kairakutenichiba", "root","mysql");
		Connection con = db.getConnection();
		ArrayList<HistoryDTO> HistoryList = new ArrayList<HistoryDTO>();
		
		String sql = "select * from purchases_details where user_id=?";
		String sql2 = "select * from items where item_id=?";
		
		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setObject(1, userId);
			//userIdの一致した行のデータを引っ張ってくる。
			
			ResultSet rs = ps.executeQuery();
			while(rs.next()){		//繰り返すためのif→while
				HistoryDTO dto = new HistoryDTO();
				dto.setQuantities(rs.getInt("quantities"));
				dto.setPurchased_day(rs.getString("purchased_at"));
				dto.setItem_id(rs.getInt("item_id"));	
				
				//別テーブルにアクセス
				PreparedStatement ps2 = con.prepareStatement(sql2);
				ps2.setInt(1, dto.getItem_id());
				ResultSet rs2 = ps2.executeQuery();
				
				if(rs2.next()){
					dto.setItem_name(rs2.getString("item_name"));
					dto.setRelease_day(rs2.getString("release_day"));
					dto.setAuthor(rs2.getString("author"));
					dto.setPrice(rs2.getInt("price"));
					HistoryList.add(dto);
				}
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		
		try{
			con.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return HistoryList;
		
	}

}
