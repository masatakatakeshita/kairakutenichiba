
package com.internousdev.kairakutenichiba.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.util.db.mysql.MySqlConnector;

/**
 * 
 */

public class AdminItemUpdateDAO {



	/**
	 * DBの商品情報を更新するメソッド
	 * @param item_id 商品ID
	 * @param item_name　商品名
	 * @param category　カテゴリー
	 * @param release_day　販売日
	 * @param author　著者
	 * @param publisher　発行会社
	 * @param publish_type　発行形態
	 * @param pages　ページ数
	 * @param isbn　ISBNコード
	 * @param is_deleted　削除フラグ
	 * @param created_at　作成日
	 * @param item_detail　商品詳細
	 * @param updated_at　更新日
	 * @param price　単価
	 * @param stocks　在庫
	 * @param sales　売上
	 * @param imgDel　画像削除
	 * @param imgPath　商品画像
	 * @return　inserted　成功かどうかの判定
	 */
	public int update(int item_id, String item_name, String category, String release_day, String author, String publisher, String publish_type, int pages, long isbn,int is_deleted,String created_at, String item_detail, String updated_at, int price, int stocks, int sales,String imgPath
){

		MySqlConnector db=new MySqlConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/", "kairakutenichiba", "root","mysql");
		Connection con=db.getConnection();

		int inserted=0;
		String sql= "UPDATE items SET item_name =?,price=?,stocks=?,sales =?,item_datail=?,release_day=?,author=?,publisher=?,publish_type=?,pages=?,isbn=?,is_deleted=?,created_at=?,updated_at=?,item_image=?,category_name=? WHERE item_id=?";
		try{
			PreparedStatement ps= con.prepareStatement(sql);
			ps.setString(1,item_name);
			ps.setFloat(2,price);
			ps.setInt(3,stocks);
			ps.setInt(4, sales);
			ps.setString(5,item_detail);
			ps.setString(6, release_day);
			ps.setString(7, author);
			ps.setString(8, publisher);
			ps.setString(9, publish_type);
			ps.setInt(10, pages);
			ps.setLong(11, isbn);
			ps.setInt(12, is_deleted);
			ps.setString(13, created_at);
			ps.setString(14, updated_at);
			ps.setString(15,imgPath);
			ps.setString(16,category);
			ps.setInt(17, item_id);
			inserted=ps.executeUpdate();

		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			try{
				con.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
		return inserted;
	}
	
}




































