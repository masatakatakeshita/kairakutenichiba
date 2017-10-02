package com.internousdev.kairakutenichiba.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.util.db.mysql.MySqlConnector;

/**
 * 
 */

/**
 * @author junpeikoizumi
 * 商品の登録に関するメソッド。
 * 1:s:textfiledに入力された値を引数としてうけてメソッドの実行する。
 * 2:すでに引数でテーブルの中身を検索。すでに同じ値が存在した場合はfalse
 * 3:テーブルの中身がなかった場合は、insertメソッドを実行。
 * 4:テーブルの中に新たに行を追加する。
 */
public class AdminItemInsertDAO {

	public Boolean duplication(int itemId, String itemName){
		Boolean ret = false;
		MySqlConnector db = new MySqlConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/", "kairakutenichiba", "root","mysql");
		Connection con=db.getConnection();
		
		String sql = "select * from items where item_id = ? and item_name = ?";
		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, itemId);
			ps.setString(2, itemName);
			ResultSet rs=ps.executeQuery();
			if(rs.next()){
				if(rs.getInt("item_id")==itemId && rs.getString("item_name").equals(itemName)){
					ret = true;
				}
			}
			con.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return ret;
	}
	
	
	/**
	 * DBのテーブルに入力された情報を登録するメソッド
	 * @param itemId　商品ID
	 * @param itemName　商品名
	 * @param category　カテゴリー
	 * @param releaseday　販売日
	 * @param Author　著者
	 * @param publisher　発行会社
	 * @param publishtype　発行形態
	 * @param page　ページ数
	 * @param ISBN　ISBNコード
	 * @param price　単価
	 * @param stocks　在庫数
	 * @param sales　売上
	 * @param itemdetail　商品詳細 
	 * @param itemimagePass　商品画像
	 * @param deleteFlag	削除フラグ
	 * @param RegisteredDay　登録日
	 * @param UpdatedDay　更新日
	 */
	public int insert(int itemId, String itemName, String category, String releaseday, String Author, String publisher, String publishtype, int page, long ISBN, int price, int stocks,int sales, String itemdetail, String itemimagePass, boolean deleteFlag, String RegisteredDay, String UpdatedDay){
		int ret=0;
		MySqlConnector db = new MySqlConnector("com.mysql.jdbc.Driver","jdbc:mysql://localhost/","kairakutenichiba","root","mysql");
		Connection con = db.getConnection();
		
		String sql="insert into items(item_id, item_name, category_name, release_day, author, publisher, publish_type, pages, isbn, price, stocks, sales, item_datail, item_image, is_deleted, created_at, updated_at)"
				+ "values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, itemId);
			ps.setString(2, itemName);
			ps.setString(3, category);
			ps.setString(4, releaseday);
			ps.setString(5, Author);
			ps.setString(6, publisher);
			ps.setString(7, publishtype);
			ps.setInt(8, page);
			ps.setLong(9, ISBN);
			ps.setInt(10, price);
			ps.setInt(11, stocks);
			ps.setInt(12, sales );
			ps.setString(13, itemdetail);
			ps.setString(14,  itemimagePass);
			ps.setBoolean(15,  deleteFlag);
			ps.setString(16, RegisteredDay);
			ps.setString(17, UpdatedDay);
			
			ret = ps.executeUpdate();
			
			con.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return ret;
	}
}
