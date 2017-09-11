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
	 *
	 */
       public ArrayList<ItemDTO> select(){
       	DBConnector db = new DBConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/", "openconnect", "root","mysql");
       	Connection con = db.getConnection();
       	ArrayList<ItemDTO> Item = new ArrayList<ItemDTO>();
       	String sql ="select * from items";


       	try{
       		PreparedStatement ps = con.prepareStatement(sql);
    		ResultSet rs = ps.executeQuery();
    		while(rs.next()){
    			ItemDTO dto = new ItemDTO();;
    			
    			dto.setCategory(rs.getString("category")); //種類ID
    		
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








