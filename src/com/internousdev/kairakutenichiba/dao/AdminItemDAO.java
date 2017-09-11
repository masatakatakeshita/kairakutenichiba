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
 * 管理者商品管理に関するクラス
 * @author Ryo Maeda
 * @since 2017/05/18
 * @version 1.0
 */
public class AdminItemDAO {

	/**
	 * 商品情報を取得しリストに格納するメソッド
	 * @param itemsName 商品名
	 * @return itemList 商品情報
	 * @author Ryo Maeda
	 * @since 2017/05/18
	 * @version 1.0
	 */
	public ArrayList<ItemDTO> select(String itemsName){
		DBConnector db=new DBConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/", "openconnect", "root","mysql");
		Connection con=db.getConnection();

		ArrayList<ItemDTO> itemList=new ArrayList<ItemDTO>();
		int k=0;
		String sql;

		if(itemsName.equals("") || itemsName==null){
			sql="select * from items where del_key = false";
		}else{
			sql="select * from items where items_name= ? and del_key= false";
			k=1;
		}




		try{
			PreparedStatement ps= con.prepareStatement(sql);
			if(k==1){
				ps.setString(1,itemsName);
			}
			ResultSet rs=ps.executeQuery();

			while (rs.next()) {
				ItemDTO dto= new ItemDTO();

				dto.setItem_id(rs.getInt("item_id"));

				dto.setItem_name(rs.getString("items_name"));

				dto.setPrice(rs.getFloat("price"));

				dto.setStocks(rs.getInt("stocks"));

				dto.setSales(rs.getInt("sales"));

				dto.setItemDetail(rs.getString("items_detail"));

				dto.setImgPath(rs.getString("img_path"));

				dto.setCategory(rs.getString("category"));

				dto.setCreated_at(rs.getString("created_at"));

				dto.setUpdated_at(rs.getString("updated_at"));

				dto.setIs_deleted(rs.getBoolean("del_key"));

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
