/**
 *
 */
package com.internousdev.kairakutenichiba.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.kairakutenichiba.dto.HelpDTO;
import com.internousdev.util.db.mysql.MySqlConnector;

/**
 * @author internousdev
 *
 */
public class HelpDAO {

	  /**
     * 問い合わせフォームから送信された時に実行するメソッド
     * @param userName 問い合わせ者の名前
     * @param userAdress 住所
     * @param userMail メールアドレス
     * @param category 問い合わせ種類
     * @param comment 問い合わせ内容
     */
    public int insertDAO(String userName, String userAdress, String userMail, String category, String comment,
            boolean userId) {
        int count = 0;

        Connection con = new MySqlConnector("kairakutenihiba").getConnection();
        String sql = "INSERT INTO help_histories(user_name,user_address,user_mail,category,comment,)VALUES(?,?,?,?,?,)";
        Connection con2 = new MySqlConnector("openconnect").getConnection();
        String sql2 = "SELECT * FROM users where user_id=?";
        HelpDTO dto = new HelpDTO();

        try {
            PreparedStatement ps2 = con2.prepareStatement(sql2);
            ps2.setBoolean(1, userId);
            ResultSet rs = ps2.executeQuery();

            if (rs.next()) {
                if(!(userName.length()>0)){
                    userName = rs.getString("user_name");
                }
                if(!(userMail.length()>0)){
                    userMail = rs.getString("user_mail");
                }

            }

            String userAddress = dto.getuserAddress();
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
                con2.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
    }
        return count;
    }
}


