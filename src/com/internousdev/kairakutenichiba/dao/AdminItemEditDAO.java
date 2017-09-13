/**
 *
 */
package com.internousdev.kairakutenichiba.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.internousdev.kairakutenichiba.dto.ItemDTO;
import com.internousdev.util.db.mysql.MySqlConnector;

/**
 * @author internousdev
 *
 */
public class AdminItemEditDAO {

	  /**
     * スイッチするメソッド
     * @return dto DTOをactionに返す
     */

    private Connection con = new MySqlConnector("kairakutenichiba").getConnection();
    private ItemDTO dto = new ItemDTO();

    public ItemDTO getItemData(int id) throws Exception {

        try {
            String sql1 = "SELECT * FROM items where item_id=?";
            PreparedStatement ps = con.prepareStatement(sql1);
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                dto.setItem_id(rs.getInt("item_id"));
                dto.setCategory(rs.getString("category"));
                dto.setItem_name(rs.getString("item_name"));
                dto.setPrice(rs.getFloat("price"));
                dto.setStocks(rs.getInt("stocks"));
                dto.setImgPath(rs.getString("item_image"));
                dto.setItem_id(rs.getInt("item_id"));
                dto.setItem_id(rs.getInt("item_id"));

              

            }
            con.close();
        } catch (Exception e) {

        }
        return dto;
    }

}
