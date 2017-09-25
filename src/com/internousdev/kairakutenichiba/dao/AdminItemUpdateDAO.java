
package com.internousdev.kairakutenichiba.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.kairakutenichiba.util.DBConnector;

/**
 * @author
 */

public class AdminItemUpdateDAO {


	/**
	 * 重複しているかどうかを判定するメソッド
	 * @param itemsName 商品名
	 * @param itemId　商品ID
	 * @return result　重複判定
	 */
	public boolean doubling(String itemsName, int itemId ){
		boolean result=false;
		DBConnector db=new DBConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/", "kairakutenichiba", "root","mysql");
		Connection con=db.getConnection();

		String sql="select * from items where item_name = ? and item_id !=?";
		try{
			PreparedStatement ps= con.prepareStatement(sql);
			ps.setString(1, itemsName);
			ps.setInt(2, itemId);
			ResultSet rs = ps.executeQuery();
			if (rs.next()){
				result=true;
			}
			rs.close();
			ps.close();
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			try{
				con.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
		return result;
	}

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
	public int update(int item_id, String item_name, String category, int release_day, String author, String publisher, String publish_type, int pages, int isbn,boolean is_deleted,String created_at, String item_detail, String updated_at, float price, int stocks, int sales, int imgDel,String imgPath
){

		DBConnector db=new DBConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/", "kairakutenichiba", "root","mysql");
		Connection con=db.getConnection();

		int inserted=0;
		int c=1;
		String sql="";
		if(imgDel==1){
			sql= "update items set item_name =?,price=?,stocks=?,sales =?,items_detail=?,release_day=?,author=?,publisher=?,publish_type=?,pages=?,isbn=?,is_deleted=?,created_at=?,updated_at=?,category=? where item_id=?";
		}else if(imgDel==2){
			sql= "update items set item_name =?,price=?,stocks=?,sales =?,items_detail=?,release_day=?,author=?,publisher=?,publish_type=?,pages=?,isbn=?,is_deleted=?,created_at=?,updated_at=?,img_path=?,category=? where item_id=?";
		}else if(imgDel==3){
			sql= "update items set item_name =?,price=?,stocks=?,sales =?,items_detail=?,release_day=?,author=?,publisher=?,publish_type=?,pages=?,isbn=?,is_deleted=?,created_at=?,updated_at=?,img_path='',category=? where item_id=?";
		}
		try{
			PreparedStatement ps= con.prepareStatement(sql);
			ps.setString(c++,item_name);
			ps.setFloat(c++,price);
			ps.setInt(c++,stocks);
			ps.setInt(c++, sales);
			ps.setString(c++,item_detail);
			ps.setInt(c++, release_day);
			ps.setString(c++, author);
			ps.setString(c++, publisher);
			ps.setString(c++, publish_type);
			ps.setInt(c++, pages);
			ps.setInt(c++, isbn);
			ps.setBoolean(c++, is_deleted);
			ps.setString(c++, created_at);
			ps.setString(c++, updated_at);

			if(imgDel==2){
				ps.setString(c++,imgPath);
			}
			ps.setString(c++,category);
			ps.setInt(c, item_id);
			inserted=ps.executeUpdate();

			ps.close();
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




































