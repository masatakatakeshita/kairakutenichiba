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
            String sql2 = "SELECT * FROM items_images WHERE item_id=?";
            PreparedStatement ps = con.prepareStatement(sql1);
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                dto.setItem_id(rs.getInt("item_id"));
                dto.setCategory(rs.getString("category"));
                dto.setItem_name(rs.getString("item_name"));
                dto.setPrice(rs.getFloat("price"));
                dto.setStocks(rs.getInt("stocks"));
                dto.setItemDetail(rs.getString("item_detail"));
                dto.setItem_id(rs.getInt("item_id"));
                dto.setItem_id(rs.getInt("item_id"));

                ps = con.prepareStatement(sql2);
                ps.setInt(1, dto.getItem_id());
                rs = ps.executeQuery();
                int count = 1;
                if (rs.next()) {
                    while (rs.getString("img_path" + count) != null) {
                        dto.setImagePath(count - 1, rs.getString("img_path" + count));
                        count++;
                    }
                }

            }
            con.close();
        } catch (Exception e) {

        }
        return dto;
    }

}
