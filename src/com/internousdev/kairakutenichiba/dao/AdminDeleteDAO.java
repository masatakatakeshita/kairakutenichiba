/**
 *
 */
package com.internousdev.kairakutenichiba.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.util.DBConnector;

/**
 * @author internousdev
 *商品情報削除に関するクラス
 */
public class AdminDeleteDAO {

	/**
	 * itemIdで検索した商品のデリートキーをtrueにするメソッド
	 * @param itemId 商品ID
	 * @return deleted 成否を格納する変数
	 * @version 1.0
	 */
	public int delete(int itemId){
		DBConnector db=new DBConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/", "openconnect", "root","mysql");
		Connection con=db.getConnection();
		int deleted=0;
		String sql="update items set del_key = true where item_id=?";

		try{
			PreparedStatement ps= con.prepareStatement(sql);
			ps.setInt(1, itemId);
			deleted=ps.executeUpdate();
			ps.close();
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			try{
				con.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}

		return deleted;
	}
}