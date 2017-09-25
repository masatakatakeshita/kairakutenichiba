package com.internousdev.kairakutenichiba.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.util.db.mysql.MySqlConnector;

/**
 * カートテーブル内情報の削除に関するクラス
 * @since
 * @version
 */
public class CartDeleteDAO {

    /**
     * カート内の商品を削除するメソッド
     * @author
     * @since
     * @version
     * @param userId ユーザーID
     * @return delCount 削除する件数
     */
	
	private int delCount;

    public int delete(int userId) {
        delCount = 0;
        MySqlConnector db = new MySqlConnector("kairakutenichiba");
        Connection con = db.getConnection();
        String sql = "delete from carts where user_id=?";
       
        try {
            	PreparedStatement ps = con.prepareStatement(sql);
                ps.setInt(1, userId);
                delCount=ps.executeUpdate();
               
            
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return delCount;
    }

}