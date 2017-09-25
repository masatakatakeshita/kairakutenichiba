package com.internousdev.kairakutenichiba.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.kairakutenichiba.dto.CartDTO;
import com.internousdev.kairakutenichiba.dto.ItemDTO;
import com.internousdev.util.db.mysql.MySqlConnector;

/**
 * カートテーブル情報追加に関するクラス
 * @author
 */

public class AddToCartDAO {

    /**
     * カートテーブルに追加する商品の情報を取得するメソッド
	 * @author
     * @param itemId 商品ID
     * @return itemStatus 成否を格納する変数
     */

    public ArrayList<ItemDTO> itemStatus(int itemId) {

        MySqlConnector db = new MySqlConnector("kairakutenichiba");
        Connection con = db.getConnection();
        ArrayList<ItemDTO> itemStatus = new ArrayList<ItemDTO>();

        String sql= "select * from items where item_id = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, itemId);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                ItemDTO dto = new ItemDTO();
                dto.setItem_name(rs.getString("item_name"));
                dto.setPrice(rs.getFloat("price"));
                itemStatus.add(dto);

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
        return itemStatus;
    }

    /**
     * カートテーブルへ情報をインサートするメソッド
     * @author
     * @since
     * @version
     * @param userId ユーザーID
     * @param itemId 商品ID
     * @return addCount 成否を格納する変数
     */

    public boolean addToCart(int userId, int itemId,int quantities) {
        ResultSet rs;
        int addCount = 0;
        boolean errorCheck=true;


        Connection con = new MySqlConnector("kairakutenichiba").getConnection();
        System.out.println(userId + "," + itemId);
        String sql1 = "select * from items where item_id=?";
        String sql2 = "select * from carts where user_id=? and item_id=?";
        String sql3 = "insert into carts (user_id,item_id,quantities) values(?,?,?)";
        String sql4 = "update items set stocks=stocks-? where item_id=?";

        try {
            PreparedStatement ps = con.prepareStatement(sql1);
            ps.setInt(1, itemId);
            rs = ps.executeQuery();

            if(rs.next()){
                if(quantities>rs.getInt("stocks")){
                    return errorCheck;
                }
            }

            CartDeleteDAO delete = new CartDeleteDAO();
            ps.close();
            rs.close();
            ps = con.prepareStatement(sql2);
            ps.setInt(1, userId);
            ps.setInt(2, itemId);
            rs = ps.executeQuery();
            while(rs.next()){
                quantities += rs.getInt("quantities");
                delete.delete(userId, rs.getInt("cart_id"));
            }

            if (quantities > 50){
                quantities = 50;
            }

            ps.close();
            ps = con.prepareStatement(sql3);
            ps.setInt(1, userId);
            ps.setInt(2, itemId);
            ps.setInt(3, quantities);
            addCount = ps.executeUpdate();

            if(addCount>0){
                ps.close();
                ps = con.prepareStatement(sql4);
                ps.setInt(1,quantities);
                ps.setInt(2,itemId);

                addCount = ps.executeUpdate();
                if(addCount>0){
                    errorCheck = false;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return errorCheck;
    }

    /**
     * カート内の商品情報を取得しリストに格納するメソッド
     * @author
     * @since
     * @version
     * @param userId ユーザーID
     * @return cartList カート情報
     */
    public ArrayList<CartDTO> selected(int userId) {


        MySqlConnector db = new MySqlConnector( "kairakutenichiba");
        Connection con = db.getConnection();
        ArrayList<CartDTO> cartList = new ArrayList<CartDTO>();
        String sql = "select * from carts where user_id=?";
        String select2 = "SELECT * FROM items WHERE item_id = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, userId);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                CartDTO dto = new CartDTO();
                dto.setUserId(rs.getInt("user_id"));
                dto.setCartId(rs.getInt("cart_id"));
                dto.setItemId(rs.getInt("item_id"));
                dto.setQuantities(rs.getInt("quantities"));


                PreparedStatement ps2 = con.prepareStatement(select2);
                ps2.setInt(1, dto.getItemId());
                ResultSet rs2 = ps2.executeQuery();

                while (rs2.next()) {

                    dto.setItemName(rs2.getString("item_name"));
                    dto.setPrice(rs2.getFloat("price"));
                    dto.setStocks(rs.getInt("stocks"));
                }
                cartList.add(dto);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return cartList;
    }
}