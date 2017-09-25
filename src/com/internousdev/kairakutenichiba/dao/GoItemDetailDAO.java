/**
 *
 */
package com.internousdev.kairakutenichiba.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.kairakutenichiba.dto.ItemDTO;
import com.internousdev.util.db.mysql.MySqlConnector;

/**
* 商品詳細表示に関するクラス
* @version 1.0
*/
public class GoItemDetailDAO {
	public ArrayList<ItemDTO> searchList=new ArrayList<ItemDTO>();

	/**
	 * 商品IDで商品詳細を取得しリストに格納するメソッド
	 * @param item_id 商品ID
	 * @return searchList 商品情報
	 * @version 1.0
	 */
	public ArrayList<ItemDTO> select(int itemId) {
		MySqlConnector db = new MySqlConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/","kairakutenichiba", "root","mysql");
		Connection con = db.getConnection();
		String sql;
		 sql = "select * from items where item_id=? and is_deleted =false";
		try{
			PreparedStatement ps = con.prepareStatement(sql) ;
			ps.setInt(1, itemId);
			ResultSet rs = ps.executeQuery();
			while (rs.next()){
				ItemDTO dto=new ItemDTO();
				dto.setItem_id(rs.getInt("item_id"));
				dto.setItem_name(rs.getString("item_name"));
				dto.setCategory(rs.getString("category_name"));
				dto.setPrice(rs.getFloat("price"));
				dto.setRelease_day(rs.getInt("release_day"));
				dto.setAuthor(rs.getString("author"));
				dto.setPublisher(rs.getString("publisher"));
				dto.setPublish_type(rs.getString("publish_type"));
				dto.setPages(rs.getInt("pages"));
				dto.setIsbn(rs.getInt("isbn"));
				dto.setStocks(rs.getInt("stocks"));
				dto.setItem_image(rs.getString("item_image"));

				searchList.add(dto);
			}
		} catch (SQLException e ) {
			e.printStackTrace();
		} finally {
			try{
				con.close();
		}catch(SQLException e){
			e.printStackTrace();
			}
	}
		return searchList;
	}

}


