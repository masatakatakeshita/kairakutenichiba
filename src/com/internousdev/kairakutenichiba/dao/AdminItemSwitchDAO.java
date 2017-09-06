/**
 *
 */
package com.internousdev.kairakutenichiba.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;

import com.internousdev.kairakutenichiba.dto.ItemDTO;
import com.internousdev.util.db.mysql.MySqlConnector;

/**
 * @author internousdev
 *
 */
public class AdminItemSwitchDAO {

    /**
     * スイッチするメソッド

     * @param Id ID
     * @param flg フラグ
     * @return resultをactionに返す
     */

    ArrayList<ItemDTO> itemList = new ArrayList<ItemDTO>();
    ItemDTO itemDTO = new ItemDTO();

    private String sql;
    private PreparedStatement ps;
    int rs;

    private String result;

    public String switchDeleted(int id, boolean flg) throws Exception {
        result = "error";
        try {
            final Connection con = new MySqlConnector("kairakutenichiba").getConnection();

            sql = "UPDATE items SET is_deleted=? WHERE item_id=?";

            ps = con.prepareStatement(sql);
            ps.setBoolean(1, flg);
            ps.setInt(2, id);
            rs = ps.executeUpdate();

            con.close();
            if(rs>0){
                result = "success";
            }

        } catch (Exception e) {

        }
        return result;
    }
}
