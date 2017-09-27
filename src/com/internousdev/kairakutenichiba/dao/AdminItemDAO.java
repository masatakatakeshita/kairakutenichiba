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
 * 管理者商品管理に関するクラス
 * @author
 *
 */
public class AdminItemDAO {

	/**
	 * 商品情報を取得しリストに格納するメソッド
	 * @param itemsName 商品名
	 * @return itemList 商品情報
	 * @author
	 */
	public ArrayList<ItemDTO> select(){
		MySqlConnector db=new MySqlConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/", "openconnect", "root","mysql");
		Connection con=db.getConnection();

		ArrayList<ItemDTO> itemList=new ArrayList<ItemDTO>();
		String sql="select * from items where del_key = false";

		try{
			PreparedStatement ps= con.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();

			while (rs.next()) {
				ItemDTO dto= new ItemDTO();

				dto.setItem_id(rs.getInt("item_id"));

				dto.setItem_name(rs.getString("items_name"));

				dto.setCategory(rs.getString("category"));

				dto.setRelease_day(rs.getString("release_day"));

				dto.setAuthor(rs.getString("author"));

				dto.setPublisher(rs.getString("publisher"));

				dto.setPublish_type(rs.getString("publish_type"));

				dto.setPages(rs.getInt("pages"));

				dto.setIsbn(rs.getInt("isbn"));

				dto.setPrice(rs.getFloat("price"));

				dto.setStocks(rs.getInt("stocks"));

				dto.setSales(rs.getInt("sales"));

				dto.setItem_detail(rs.getString("item_detail"));

				dto.setItem_image(rs.getString("item_image"));

				dto.setIs_deleted(rs.getBoolean("is_deleted"));

				dto.setCreated_at(rs.getString("created_at"));

				dto.setUpdated_at(rs.getString("updated_at"));



				itemList.add(dto);
			}

			rs.close();
			ps.close();
			con.close();


		}catch (SQLException e){
			e.printStackTrace();
		}



		return itemList;
	}

}
