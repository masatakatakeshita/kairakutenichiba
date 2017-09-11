package com.internousdev.kairakutenichiba.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.util.db.mysql.MySqlConnector;

/**
 * カートテーブル内情報の削除に関するクラス
 * @author
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
     * @param cartId カートID
     * @return delCount 削除する件数
     */

    public int delete(int userId, int cartId) {
        int delCount = 0;
        MySqlConnector db = new MySqlConnector("kairakutenichiba");
        Connection con = db.getConnection();
        String sql1 = "select * from carts where user_id=? and cart_id=?";
        String sql2 = "delete from carts where user_id=? and cart_id=?";
       
        try {
            PreparedStatement ps = con.prepareStatement(sql1);
            ps.setInt(1, userId);
            ps.setInt(2, cartId);System.out.println(ps.toString());
            ResultSet rs = ps.executeQuery();

            if(rs.next()){
               
                ps.close();
                rs.close();
                ps = con.prepareStatement(sql2);
                ps.setInt(1, userId);
                ps.setInt(2, cartId);System.out.println(ps.toString());
                }
            
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