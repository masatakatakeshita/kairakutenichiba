
/**
 *
 */
package com.internousdev.kairakutenichiba.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.kairakutenichiba.util.DBConnector;



/**
 * カートインサート＆アップデートに関するクラス
 *@author
 *@since
 *@version
 */
public class CartUpdateDAO {

	/**
	 *カート商品の数量を更新するメソッド
	 *@author
	 *@since
	 *@param cartId カートID
	 *@param userId ユーザーID
	 *@param quantities 数量
	 *@return int 成否を判断する変数
	 *
	 */
	public int updateCart(int cartId,int itemId,int quantities){
		int updateCount = 0;

		DBConnector db = new DBConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/", "openconnect", "root","mysql");
		Connection con = (Connection) db.getConnection();
		String sql ="update carts set quantities=? where item_id=? and cart_id=?";

		try{
			PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);
			ps.setInt(1, quantities);
			ps.setInt(2, itemId);
			ps.setInt(3, cartId);
			updateCount = ps.executeUpdate();
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			if(con!=null){
				try{
					con.close();
				}catch(SQLException e){
					e.printStackTrace();
				}
			}
		}
	return updateCount;
	}




}
