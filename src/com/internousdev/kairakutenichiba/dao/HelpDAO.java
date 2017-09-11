/**
 *
 */
package com.internousdev.kairakutenichiba.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.util.db.mysql.MySqlConnector;

/**
 * @author internousdev
 *
 */
public class HelpDAO {

	/**
     * 問い合わせフォームに入力されたときに実行されるメソッド
     * @param userName 問い合わせ者名
     * @param userAddress 住所
     * @param userMail メールアドレス
     * @param category 問い合わせ種類
     * @param comment 本文
     * @param login ログイン情報
     * @return countをactionに返す
     */
    public int insertDAO(String userName, String userAddress, String userMail, String category, String comment) {
        int count = 0;

        Connection con = new MySqlConnector("kairakutenichiba").getConnection();
        String sql = "INSERT INTO inquiry_histories(user_name,user_address,user_mail,category,comment)VALUES(?,?,?,?,?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, userName);
            ps.setString(2, userAddress);
            ps.setString(3, userMail);
            ps.setString(4, category);
            ps.setString(5, comment);


            count = ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return count;
    }


}


