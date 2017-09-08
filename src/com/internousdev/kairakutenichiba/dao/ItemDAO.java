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
import com.internousdev.util.DBConnector;

/**
* 商品一覧画面遷移に関するクラス
* @version 1.0
*/
public class ItemDAO {

	/**
	 * 野菜の種類を取得しリストに格納するメソッド
	 * @return Item アイテム情報
	 * @version 1.0
	 */
       public ArrayList<ItemDTO> select(){
       	DBConnector db = new DBConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/", "openconnect", "root","mysql");
       	Connection con = db.getConnection();
       	ArrayList<ItemDTO> Item = new ArrayList<ItemDTO>();
       	String sql ="select * from sorts";


       	try{
       		PreparedStatement ps = con.prepareStatement(sql);
    		ResultSet rs = ps.executeQuery();
    		while(rs.next()){
    			ItemDTO dto = new ItemDTO();;
    			dto.setItemGenre(rs.getString("sorts")); //種類
    			dto.setCategory_id(rs.getInt("sort_id")); //種類ID
    			dto.setImgPath(rs.getString("sort_img")); //イメージパス
    			Item.add(dto);
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
       	return Item;
       	}
}








