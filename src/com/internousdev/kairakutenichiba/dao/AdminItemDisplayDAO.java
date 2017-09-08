/**
 *
 */
package com.internousdev.kairakutenichiba.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.internousdev.kairakutenichiba.dto.CategoryDTO;
import com.internousdev.kairakutenichiba.dto.ItemDTO;
import com.internousdev.util.db.mysql.MySqlConnector;

/**
 * @author internousdev
 *
 */
public class AdminItemDisplayDAO {

	  /**
     * スイッチするメソッド


    /**
     * アイテムリスト
     */
    private ArrayList<ItemDTO> itemList = new ArrayList<ItemDTO>();

    /**
     * カテゴリリスト
     */
    private ArrayList<CategoryDTO> categoryList = new ArrayList<CategoryDTO>();

    /**
     * アイテムDTO
     */
    private ItemDTO itemDTO = new ItemDTO();

    /**
     * カテゴリDTO
     */
    private CategoryDTO categoryDTO = new CategoryDTO();

    private String sql1, sql2;
    private PreparedStatement ps1, ps2;
    private ResultSet rs1, rs2;
    private int numImgPath = 5;

    public ArrayList<ItemDTO> generateItemList() throws Exception {
        try {
            final Connection con = new MySqlConnector("kairakutenichiba").getConnection();

            sql1 = "SELECT * FROM items";
            sql2 = "SELECT * FROM items_images WHERE item_id=?";

            ps1 = con.prepareStatement(sql1);
            rs1 = ps1.executeQuery();

            while (rs1.next()) {
                itemDTO = new ItemDTO();
                itemDTO.setItem_id(rs1.getInt("item_id"));
                itemDTO.setCategory_id(rs1.getInt("category_id"));
                itemDTO.setItem_name(rs1.getString("item_name"));
                itemDTO.setPrice(rs1.getFloat("price"));
                itemDTO.setStocks(rs1.getInt("stocks"));
                itemDTO.setSales(rs1.getInt("sales"));
                itemDTO.setItemDetail(rs1.getString("item_detail").replace("\n", "<br>"));
                itemDTO.setIsDeleted(rs1.getBoolean("is_deleted"));
                itemDTO.setCreated_at(rs1.getTimestamp("created_at").toString());
                itemDTO.setUpdated_at(rs1.getTimestamp("updated_at").toString());

                ps2 = con.prepareStatement(sql2);
                ps2.setInt(1, itemDTO.getItem_id());
                rs2 = ps2.executeQuery();
                int count = 1;
                if (rs2.next()) {
                    while (count <= numImgPath && rs2.getString("img_path" + count) != null) {
                        itemDTO.setImagePath(count - 1, rs2.getString("img_path" + count));
                        count++;
                    }
                }

                itemList.add(itemDTO);

            }
            con.close();

        } catch (Exception e) {

        }
        return itemList;
    }

    public ArrayList<CategoryDTO> generateCategoryList() throws Exception {
        try {

            final Connection con = new MySqlConnector("kairakutenichiba").getConnection();

            sql1 = "SELECT * FROM categories";
            ps1 = con.prepareStatement(sql1);
            rs1 = ps1.executeQuery();

            while (rs1.next()) {
                categoryDTO = new CategoryDTO();

                categoryDTO.setCategoryId(rs1.getInt("category_id"));
                categoryDTO.setCategoryName(rs1.getString("category_name"));
                categoryDTO.setDisplayName(categoryDTO.getCategoryId() + ":" + categoryDTO.getCategoryName());

                categoryList.add(categoryDTO);
            }
            con.close();
        } catch (Exception e) {

        }
        return categoryList;
    }

}

