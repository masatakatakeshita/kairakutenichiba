package com.internousdev.kairakutenichiba.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.kairakutenichiba.util.DBConnector;

/**
 * 
 */

/**
 * @author junpeikoizumi
 * 商品の登録に関するメソッド。
 * s:textfiledに入力された値を引数としてうけてメソッドの実行する。
 * すでに引数でテーブルの中身を検索。すでに同じ値が存在した場合はfalse
 * テーブルの中身がなかった場合は、insertメソッドを実行。
 * テーブルの中に新たに行を追加する。
 */
public class AdminItemInsertDAO {

	public boolean duplication(int itemId, String itemName){
		boolean result = false;
		DBConnector db = new DBConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/", "kairakutenichiba", "root","mysql");
		Connection con=db.getConnection();
		
		String sql = "select * from items where item_id = ? and item_name = ?";
		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, itemId);
			ps.setString(2, itemName);
			ResultSet rs = ps.executeQuery();
			if(rs.next()){
				if(rs.getInt("item_id")==itemId || rs.getString("item_name").equals(itemName)){
					result = true;
				}
			}
			con.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return result;
	}
	
	
	/**
	 * DBのテーブルに入力された情報を登録するメソッド
	 * itemId
	 * itemName
	 * category
	 * releaseday
	 * Author
	 * publisher, 
	 * publishtype, 
	 * page, 
	 * ISBN, 
	 * price, 
	 * stocks, 
	 * sales
	 * itemdetail, 
	 * itemimagePass, 
	 * deleteFlag, 
	 * RegisteredDay,
	 * UpdatedDay)
	 * 17個？
	 * 
	 * 
	 */
	//voidでよくね？
	//なんかデータ型で返すものなんて無いだろ
	public void insert(int itemId, String itemName, String category, String releaseday, String Author, String publisher, String publishtype, int page, int ISBN, int price, int stocks,int sales, String itemdetail, String itemimagePass, boolean deleteFlag, String RegisteredDay, String UpdatedDay){
		DBConnector db = new DBConnector("com.mysql.jdbc.Driver","jdbc:mysql://localhost/","kairakutenichiba","root","mysql");
		Connection con = db.getConnection();
		
		String sql="insert into items(item_id, item_name, category, release_day, author, publisher, publisher_type, pages, isbn, price, stocks, sales, item_detail, item_image, is_deleted, created_at, updated_at)"
				+ "values(itemId, itemName,category,releaseday,Author,publisher,publishtype,page,ISBN,price,stocks,sales,itemdetail,itemimagePass,deleteFlag,RegisteredDay,UpdatedDay)";
		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.executeUpdate();
			
			con.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
}
