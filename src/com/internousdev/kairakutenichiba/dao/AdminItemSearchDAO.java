/**
 *
 */
package com.internousdev.kairakutenichiba.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.internousdev.kairakutenichiba.dto.ItemDTO;
import com.internousdev.util.db.mysql.MySqlConnector;

/**
 * @author internousdev
 *
 */
public class AdminItemSearchDAO {

    /**
     * スイッチするメソッド

     * @param itemId 商品ID
     * @param categoryId カテゴリーID
     * @param itemName 商品名
     * @param price 価格
     * @param stocks 在庫数
     * @param sales
     * @param itemDetail 商品詳細
     * @param isDeleted 削除
     * @param createdAt 追加
     * @param updatedAt 更新
     */

    private ArrayList<ItemDTO> itemList= new ArrayList<ItemDTO>();
    private ItemDTO itemDTO = new ItemDTO();

    private String sql1,sql2;
    private PreparedStatement ps1,ps2;
    private ResultSet rs1,rs2;

    public ArrayList<ItemDTO> generateItemList(String chkisDeleted,int chkCategoryId,String chkItemName) throws Exception{
        try{
            final Connection con=new MySqlConnector("kairakutenichiba").getConnection();

            sql1 ="SELECT * FROM items";
            sql2 ="SELECT * FROM items_images WHERE item_id=?";

            String searchCondition="",multiCondition="";
            if(!chkisDeleted.equals("noselect")){
                    searchCondition += multiCondition+" is_deleted="+chkisDeleted;
                    multiCondition=" AND";
            }
            if(chkCategoryId!=0){
                searchCondition += multiCondition+" category_id="+chkCategoryId;
                multiCondition=" AND";
            }
            if(!chkItemName.equals("")){
                searchCondition += multiCondition+" item_name like \'%"+chkItemName+"%\'";
                multiCondition=" AND";
            }

            if(searchCondition!=""){
                sql1 += " WHERE"+searchCondition;
            }

            ps1 = con.prepareStatement(sql1);
            rs1 = ps1.executeQuery();


            while(rs1.next()){
                itemDTO = new ItemDTO();
                itemDTO.setItem_id(rs1.getInt("item_id"));
                itemDTO.setCategory(rs1.getString("category_id"));
                itemDTO.setItem_name(rs1.getString("item_name"));
                itemDTO.setPrice(rs1.getFloat("price"));
                itemDTO.setStocks(rs1.getInt("stocks"));
                itemDTO.setSales(rs1.getInt("sales"));
                itemDTO.setItemDetail(rs1.getString("item_detail").replace("\n","<br>"));
                itemDTO.setIs_deleted(rs1.getBoolean("boolean is_deleted"));
                itemDTO.setCreated_at(rs1.getTimestamp("created_at").toString());
                itemDTO.setUpdated_at(rs1.getTimestamp("updated_at").toString());

                ps2 = con.prepareStatement(sql2);
                ps2.setInt(1,itemDTO.getItem_id());
                rs2 = ps2.executeQuery();
                int count=1;
                if(rs2.next()){
                    while(rs2.getString("img_path"+count)!=null){
                        itemDTO.setImgPath(count-1,rs2.getString("img_path"+count));
                        count++;
                    }
                }

                itemList.add(itemDTO);


            }
        con.close();

        }catch(Exception e){

        }
        return itemList;
    }

}
