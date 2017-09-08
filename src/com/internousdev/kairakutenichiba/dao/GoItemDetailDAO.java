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
import com.internousdev.kairakutenichiba.util.DBConnector;

/**
* 商品詳細表示に関するクラス
* @version 1.0
*/
public class GoItemDetailDAO {
	public ArrayList<ItemDTO> searchList=new ArrayList<ItemDTO>();

	/**
	 *種類IDで商品詳細を取得しリストに格納するメソッド
	 * @param sortId 種類ID
	 * @return searchList 商品情報
	 * @version 1.0
	 */
	public ArrayList<ItemDTO> select(int category_id) {
		DBConnector db = new DBConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/","kairakutenichiba", "root","mysql");
		Connection con = db.getConnection();
		String sql;
		 sql = "select * from items where category_id=? and del_key =false";
		try{
			PreparedStatement ps = con.prepareStatement(sql) ;
			ps.setInt(1, category_id);
			ResultSet rs = ps.executeQuery();
			while (rs.next()){
				ItemDTO dto=new ItemDTO();
				dto.setCategory_id(rs.getInt("category_id"));
				dto.setItem_id(rs.getInt("item_id"));
				dto.setItem_name(rs.getString("item_name"));
				dto.setPrice(rs.getFloat("price"));
				dto.setRelease_day(rs.getInt("release_day"));
				dto.setAuthor(rs.getString("author"));
				dto.setPublisher(rs.getString("publisher"));
				dto.setPublish_type(rs.getString("publish_type"));
				dto.setPages(rs.getInt("pages"));
				dto.setIsbn(rs.getInt("isbn"));
				dto.setStocks(rs.getInt("stocks"));
				dto.setItemDetail(rs.getString("items_detail"));
				dto.setItemImg01(rs.getString("item_img01"));
				dto.setItemImg02(rs.getString("item_img02"));
				dto.setImgPath(rs.getString("img_path"));
				searchList.add(dto);
			}
		} catch (SQLException e ) {
		   e.printStackTrace() ;
		} finally {
			try{
				con.close();
		}catch(SQLException e){
			e.printStackTrace();
			}
	}
		return searchList;
	}

	/**
	 *商品IDで商品詳細を取得しリストに格納するメソッド
	 * @param itemId 商品ID
	 * @return searchList 商品情報
	 * @version 1.0
	 */
	public ArrayList<ItemDTO> selectbyItem(int itemId) {
		DBConnector db = new DBConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/","kairakutenichiba", "root","mysql");
		Connection con = db.getConnection();
		ItemDTO dto = new ItemDTO();
		ArrayList<ItemDTO> itemList = new ArrayList<ItemDTO>();
		String sql;
		 sql = "select * from items where item_id=?";
		try{
			PreparedStatement ps = con.prepareStatement(sql) ;
			ps.setInt(1, itemId);
			ResultSet rs = ps.executeQuery();
			while (rs.next()){
				dto.setCategory_id(rs.getInt("category_id"));
				dto.setItem_id(rs.getInt("item_id"));
				dto.setItem_name(rs.getString("item_name"));
				dto.setPrice(rs.getFloat("price"));
				dto.setRelease_day(rs.getInt("release_day"));
				dto.setAuthor(rs.getString("author"));
				dto.setPublisher(rs.getString("publisher"));
				dto.setPublish_type(rs.getString("publish_type"));
				dto.setPages(rs.getInt("pages"));
				dto.setIsbn(rs.getInt("isbn"));
				dto.setStocks(rs.getInt("stocks"));
				dto.setItemDetail(rs.getString("items_detail"));
				dto.setImgPath(rs.getString("img_path"));
				itemList.add(dto);
			}
		} catch (SQLException e ) {
		   e.printStackTrace() ;
		} finally {
			try{
				con.close();
		}catch(SQLException e){
			e.printStackTrace();
			}
	}
		return itemList;
	}
}


