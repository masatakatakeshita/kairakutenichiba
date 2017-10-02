
package com.internousdev.kairakutenichiba.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Time;

import com.internousdev.util.db.mysql.MySqlConnector;

/**
 * @author
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
	public int update(int item_id, String item_name, String category, Date release_day, String author, String publisher, String publish_type, int pages, long isbn,int is_deleted,Time created_at, String item_detail, Time updated_at, float price, int stocks, int sales,String imgPath
){

		MySqlConnector db=new MySqlConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/", "kairakutenichiba", "root","mysql");
		Connection con=db.getConnection();

		int inserted=0;
		int c=0;
		String sql= "UPDATE items SET item_name =?,price=?,stocks=?,sales =?,items_detail=?,release_day=?,author=?,publisher=?,publish_type=?,pages=?,isbn=?,is_deleted=?,created_at=?,updated_at=?,item_image=?,category_name=? WHERE item_id=?";
		try{
			PreparedStatement ps= con.prepareStatement(sql);
			ps.setString(c++,item_name);
			ps.setFloat(c++,price);
			ps.setInt(c++,stocks);
			ps.setInt(c++, sales);
			ps.setString(c++,item_detail);
			ps.setDate(c++, release_day);
			ps.setString(c++, author);
			ps.setString(c++, publisher);
			ps.setString(c++, publish_type);
			ps.setInt(c++, pages);
			ps.setLong(c++, isbn);
			ps.setInt(c++, is_deleted);
			ps.setTime(c++, created_at);
			ps.setTime(c++, updated_at);
			ps.setString(c++,imgPath);
			ps.setString(c++,category);
			ps.setInt(c, item_id);
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




































