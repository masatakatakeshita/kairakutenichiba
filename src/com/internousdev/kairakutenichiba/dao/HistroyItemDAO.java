
package com.internousdev.kairakutenichiba.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.kairakutenichiba.dto.HistoryItemDTO;
import com.internousdev.kairakutenichiba.util.DBConnector;

/**
 * @author internous
 * 1つ目のDAOでitem_idをActionに格納。
 * 上記item_idからDBの商品詳細テーブル:itemsに移動
 * 対応した情報をDTOに格納するメソッドを作成。
 */
public class HistroyItemDAO{
	
	//HistoryItemDTOへの格納メソッド
	public HistoryItemDTO select(int item_id){
		DBConnector db = new DBConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/","kairakutenichiba","root","mysql");
		Connection con = db.getConnection();
		HistoryItemDTO HistoryItemList = new HistoryItemDTO();
		
		//ここって比較のためにつけてるだけで、ここを記述しなくてもgetString("フィールド名");で値自体は取得できる？
		String sql = "select * from items where item_id=? and item_name=? and release_day=? and author=? and price=?";
		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, item_id);	//引数を入れてる。ここでなんか比較してんの？
		
			ResultSet rs = ps.executeQuery();
			if(rs.next()){
				HistoryItemList.setItem_name(rs.getString("item_name"));
				HistoryItemList.setRelease_day(rs.getString("release_day"));
				HistoryItemList.setAuthor(rs.getString("author"));
				HistoryItemList.setPrice(rs.getInt("price"));
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		try{
			con.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return HistoryItemList;
		
	}
}
