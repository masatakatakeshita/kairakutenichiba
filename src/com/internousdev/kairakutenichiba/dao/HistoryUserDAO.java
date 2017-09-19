package com.internousdev.kairakutenichiba.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.kairakutenichiba.dto.HistoryUserDTO;
import com.internousdev.kairakutenichiba.util.DBConnector;


/**
 * @author junpei koizumi
 *
 */
public class HistoryUserDAO {
	
	/**
	 * DBのテーブルから取得したデータをDTOに格納するために使う具体化オブジェクト
	 * 格納している変数を配列でリスト化。
	 * public ArrayList<HistoryDTO> HistoryList = new ArrayList<HistroyDTO>;
	 * ↓
	 * 仕様変更：
	 * DTOを2つ作成。
	 * 1つは購入者情報[購入日、合計金額など]　1回のみ表示
	 * 1つは商品情報[商品名、単価、作者名など]　商品の種類だけ表示
	 */
	
	
	/**
	 * Actionでsessionに保存されているuserIdを取得後に動作するメソッド。
	 * userIdを引数にDBから情報を引き出す。　
	 * テーブル名：purchase_details
	 * DBに接続してデータを取得し、DTOに格納する。
	 */
	public HistoryUserDTO select(Object userId){
		DBConnector db = new DBConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/", "kairakutenichiba", "root","mysql");
		Connection con = db.getConnection();
		HistoryUserDTO HistoryItem = new HistoryUserDTO();
		
		String sql = "select * from purchase_details where user_id=? and item_id=? and quantities=? and multiplied_price=? and purchase_at=? and item_id=?";

		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setObject(1, userId);
			
			//userIdの一致した行のデータを引っ張ってくる。
			ResultSet rs = ps.executeQuery();
			if(rs.next()){
				HistoryItem.setItem_id(rs.getInt("user_id"));
				HistoryItem.setQuantities(rs.getInt("quantities"));
				HistoryItem.setMultiplied_price(rs.getString("multiplied_price"));
				HistoryItem.setPurchased_day(rs.getString("purchase_at"));
				HistoryItem.setItem_id(rs.getInt("item_id"));		
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		
		try{
			con.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return HistoryItem;
		
	}

}
