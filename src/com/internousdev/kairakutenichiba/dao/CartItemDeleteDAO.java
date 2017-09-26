package com.internousdev.kairakutenichiba.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.util.db.mysql.MySqlConnector;

public class CartItemDeleteDAO {
	/**
	 * カートテーブル内アイテムの削除に関するクラス
	 * @author shoji hayato
	 * @since 17/09/25
	 * @version 1.0
	 */
	

	    /**
	     * カート内の商品を削除するメソッド
	     * @author shoji hayato
	     * @since 17/09/25
	     * @version 1.0
	     * @param userId ユーザーID
	     * @returen ret 削除する件数
	     */
		
		private int ret;

	    public int delete(int userId, int itemId) {
	        setRet(0);
	        MySqlConnector db = new MySqlConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/", "kairakutenichiba", "root","mysql");
	    	Connection con = db.getConnection();
	        String sql = "DELETE FROM carts WHERE user_id=? AND item_id=?";
	       
	        try {
	            	PreparedStatement ps = con.prepareStatement(sql);
	                ps.setInt(1, userId);
	                ps.setInt(2,itemId);
	                ret=ps.executeUpdate();
	               
	            
	        } catch (SQLException e) {
	            e.printStackTrace();
	        } finally {
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
