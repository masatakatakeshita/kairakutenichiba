package com.internousdev.kairakutenichiba.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.kairakutenichiba.dto.HistoryDTO;
import com.internousdev.kairakutenichiba.util.DBConnector;


/**
 * @author junpei koizumi
 *
 */
public class HistoryDAO {
	
	/**
	 * DBのテーブルから取得したデータをDTOに格納するために使う具体化オブジェクト
	 * public ArrayList<HistoryDTO> HistoryList = new ArrayList<HistroyDTO>;
	 * listには1行ずつdto変数の配列が追加されていく感じ。
	 */
	
	
	/**
	 * 1つのDAO内部にsql起動分を2つ作成。
	 * すべてをdtoに格納したら、cartList.add(dto);でlistに追加する。
	 * 
	 *  ArrayList<HistoryDTO> →javadrive
	 */
	public ArrayList<HistoryDTO> select(Object userId){
		DBConnector db = new DBConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/", "kairakutenichiba", "root","mysql");
		Connection con = db.getConnection();
		ArrayList<HistoryDTO> HistoryList = new ArrayList<HistoryDTO>();
				//jspに表示するための情報郡を1行ずつ登録していく保存先。
		
		String sql = "select * from purchase_details where user_id=?";
		String sql2 = "select * from items where item_id=?";
		
		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setObject(1, userId);
			//userIdの一致した行のデータを引っ張ってくる。
			
			ResultSet rs = ps.executeQuery();
			while(rs.next()){		//繰り返すためのif→while
				HistoryDTO dto = new HistoryDTO();
				//user_idに関するget,setはいらないよね？引数で検索かけるだけ
				dto.setQuantities(rs.getInt("quantities"));
//				dto.setMultiplied_price(rs.getString("multiplied_price"));
				dto.setPurchased_day(rs.getString("purchase_at"));
				dto.setItem_id(rs.getInt("item_id"));	
				
				//別テーブルにアクセス
				PreparedStatement ps2 = con.prepareStatement(sql2);
				ps2.setInt(1, dto.getItem_id());
				ResultSet rs2 = ps2.executeQuery();
				
				if(rs2.next()){
					dto.setItem_name(rs.getString("item_name"));
					dto.setRelease_day(rs.getString("release_day"));
					dto.setAuthor(rs.getString("author"));
					dto.setPrice(rs.getInt("price"));
//					dto.setImgPath(rs2.getString("img_path")); 
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
