/**
 *
 */
package com.internousdev.kairakutenichiba.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.kairakutenichiba.dto.CartDTO;
import com.internousdev.util.db.mysql.MySqlConnector;


/**
 * カート遷移に関するクラス
 * @version 1.0
 */
public class GoCartDAO{


	/**
	 * カート内の商品情報を取得しリストに格納するメソッド
	 * @param userId ユーザーID
	 * @return cartList カート内の商品情報
	 * @autor shoji hayato
	 * @since 17/09/22
	 */
  public ArrayList<CartDTO> selectedItem(int userId){

    MySqlConnector db = new MySqlConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/", "openconnect", "root","mysql");
    Connection con = db.getConnection();
    ArrayList<CartDTO> cartList = new ArrayList<CartDTO>();

    String sql = "select * from carts where user_id=?";
    String select2 = "SELECT * FROM items WHERE item_id = ?";

    try{
    	PreparedStatement ps = con.prepareStatement(sql);
    	ps.setInt(1,userId);
    	ResultSet rs = ps.executeQuery();
    	while(rs.next()){
    		CartDTO dto = new CartDTO();
    		dto.setUserId(rs.getInt("user_id"));//ユーザーID
    		dto.setItemId(rs.getInt("item_id"));//商品ID
    		dto.setQuantities(rs.getInt("quantities"));//数量
			dto.setSubtotal(rs.getFloat("total_price")); //小計
    		
    		PreparedStatement ps2 = con.prepareStatement(select2);
			ps2.setInt(1, dto.getItemId());
			ResultSet rs2 = ps2.executeQuery();

			if (rs2.next()) {

				dto.setItemName(rs2.getString("item_name"));//商品名
				dto.setPrice(rs2.getFloat("price")); //価格
				dto.setImgPath(rs2.getString("item_image")); //イメージパス
				cartList.add(dto);
			}
    	}
    }catch(SQLException e){
    	e.printStackTrace();
    }finally {
		try{
			con.close();
		}catch(Exception e){
			e.printStackTrace();
			}
	}
     return cartList;
  }
}
