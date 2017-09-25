
/**
 *
 */
package com.internousdev.kairakutenichiba.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.util.db.mysql.MySqlConnector;



/**
 * カートインサート＆アップデートに関するクラス
 *@author
 *@since
 *@version
 */
public class CartUpdateDAO {
	private int ret;

	/**
	 *カート商品の数量を更新するメソッド
	 *@author　shoji hayato
	 *@since 17/09/25
	 *@param cartId カートID
	 *@param userId ユーザーID
	 *@param quantities 数量
	 *@return ret 成否を判断する変数
	 *
	 */
	 public int update(int userId,int itemId,int quantities) {
	       	ret=0;
	    	MySqlConnector db = new MySqlConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/", "kairakutenichiba", "root","mysql");
	    	Connection con = db.getConnection();
	    	String sql = "UPDATE carts SET quantities=? WHERE user_id=? AND item_id=?";
	      

	        try {
	            PreparedStatement ps = con.prepareStatement(sql);
	            ps.setInt(1, quantities);
	            ps.setInt(2, userId);
	            ps.setInt(3, itemId);
	            ret=ps.executeUpdate();
	            }catch(SQLException e){
	        	e.printStackTrace();
	        	}finally{
	        		try {
						con.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
	        	}
	        return ret;
	    }

		public int getRet() {
			return ret;
		}

		public void setRet(int ret) {
			this.ret = ret;
		}



}
