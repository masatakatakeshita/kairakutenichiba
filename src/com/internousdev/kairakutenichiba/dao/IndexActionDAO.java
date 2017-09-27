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
 * @author internous
 *
 */
public class IndexActionDAO  {

	ArrayList<ItemDTO> itemList=new ArrayList<ItemDTO>();

	public ArrayList<ItemDTO> select(){
		MySqlConnector db=new MySqlConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/", "kairakutenichiba", "root","mysql");
		Connection con=db.getConnection();

		String sql="select * from items";

		try{
			PreparedStatement ps= con.prepareStatement(sql);

			ResultSet rs=ps.executeQuery();

			while (rs.next()) {
				ItemDTO dto= new ItemDTO();

				dto.setItem_id(rs.getInt("item_id"));

				dto.setCategory(rs.getString("category_name"));

				dto.setItem_image(rs.getString("item_image"));

				itemList.add(dto);
			}

			rs.close();
			ps.close();
			


		}catch (SQLException e){
			e.printStackTrace();
		}finally{
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return itemList;
	}






	public ArrayList<ItemDTO> select(String category){
		MySqlConnector db=new MySqlConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/", "kairakutenichiba", "root","mysql");
		Connection con=db.getConnection();

		String sql="select * from items where category_name = ?";

		try{
			PreparedStatement ps= con.prepareStatement(sql);
            ps.setString(1,category);
			ResultSet rs=ps.executeQuery();
			itemList.clear();

			while (rs.next()) {
				ItemDTO dto= new ItemDTO();

				dto.setItem_id(rs.getInt("item_id"));

				dto.setCategory(rs.getString("category_name"));

				dto.setItem_image(rs.getString("item_image"));

				itemList.add(dto);
			}

			rs.close();
			ps.close();

		}catch (SQLException e){
			e.printStackTrace();
		}finally{
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return itemList;
	}

}
