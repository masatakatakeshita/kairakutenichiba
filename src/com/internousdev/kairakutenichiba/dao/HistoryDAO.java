/**
 *
 */
package com.internousdev.kairakutenichiba.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.kairakutenichiba.dto.HistoryDTO;
import com.internousdev.util.DBConnector;

/**
 * @author internousdev
 *
 */
public class HistoryDAO {

	/**
	 * 購入履歴をリスト化
	 */
	public ArrayList<HistoryDTO> HistoryList = new ArrayList<HistoryDTO>();

	/**
	 * 購入履歴を取得してリストに格納するメソッド
	 * @param userId ユーザーID
	 * @param itemsName 商品名
	 * @return HistoryList アレイリストの値を返す
	 * @version 1.0
	 */
	public ArrayList<HistoryDTO> HistoryList(int userId,String itemsName){

		DBConnector db = new DBConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/", "openconnect", "root","mysql");
		Connection con = db.getConnection();
		ArrayList<HistoryDTO> HistoryList = new ArrayList<HistoryDTO>();
		int k=1;


		String sql = "select * from purchases left join items on purchases.item_id = items.item_id where user_id=? and items_name=?";


		if(itemsName.equals("")){


			sql= "select * from purchases left join items on purchases.item_id = items.item_id where user_id=?";
			k=2;
		}
		if(userId == 0){
			k=0;
			sql ="";
		}



	try{




		PreparedStatement ps = con.prepareStatement(sql);

		if(k==1){
			ps.setInt(1,userId);
		ps.setString(2,itemsName);
		}
		if(k==2){
			ps.setInt(1,userId);
		}

		ResultSet rs = ps.executeQuery();

		while(rs.next()){

			HistoryDTO dto = new HistoryDTO();


			dto.setUser_id(rs.getInt("user_id")); //購入者ID
			dto.setItem_id(rs.getInt("item_id"));  //商品ID
			dto.setQuantities(rs.getInt("quantities"));  //数量
			dto.setCreatedAt(rs.getString("created_at"));  //登録日
			HistoryList.add(dto);




				dto.setItemsName(rs.getString("items_name")); //商品名
				dto.setPrice(rs.getFloat("price")); //価格
				dto.setTotal_price(dto.getPrice()*dto.getQuantities()); //小計
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
	return HistoryList;



	}

}



