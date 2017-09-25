package com.internousdev.kairakutenichiba.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.util.db.mysql.MySqlConnector;

/**
 * カートテーブル情報追加に関するクラス
 * @author　shoji hayato
 */

public class AddToCartDAO {
	
	private int ret;

    /**
     * カートテーブルに商品を追加するメソッド
	 * @author shoji hayato
     * @param userId ユーザーID,itemId 商品ID,quantities 数量
     * @return ret
     */

    public int insert(int userId,int itemId) {
       	ret=0;
    	MySqlConnector db = new MySqlConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/", "kairakutenichiba", "root","mysql");
    	Connection con = db.getConnection();
    	String sql = "INSERT INTO carts(user_id,item_id,quantities) VALUES(?,?,1)";
      

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, userId);
            ps.setInt(2, itemId);
            ret=ps.executeUpdate();
         
           
        }catch(SQLException e){
        	e.printStackTrace();
        	}finally{
        		try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
        	}
        return ret;
    }
    

	public int getRet() {
		return ret;
	}

	public void setRet(int ret) {
		this.ret = ret;
	}
}