/**
 *
 */
package com.internousdev.kairakutenichiba.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.kairakutenichiba.dto.AdminHistoryDTO;
import com.internousdev.util.db.mysql.MySqlConnector;

/**
 *管理者販売履歴の表示に関するメソッド
 */
public class AdminHistoryDAO {

	/**
	 * 商品IDで販売履歴を取得しリストに格納するメソッド
	 * @param itemId 商品ID
	 * @return adminhistorylist 販売履歴
	 * @version 1.0
	 */
	public ArrayList<AdminHistoryDTO> select(int itemId) {
		/**
		 * 購入履歴を格納する
		 */
		ArrayList<AdminHistoryDTO> adminhistoryList = new ArrayList<AdminHistoryDTO>();
		MySqlConnector db = new MySqlConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/", "kairakutenichiba", "root", "mysql");
		Connection con = db.getConnection();

		String sql = "select * from purchases_details where item_id=?";
		String sql2 = "select * from items where item_id = ?";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, itemId);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				AdminHistoryDTO dto = new AdminHistoryDTO();

				dto.setItemId(rs.getInt("item_id")); //商品ID

				dto.setPurchaseId(rs.getInt("purchase_id")); //購入ID

				dto.setQuantities(rs.getInt("quantities")); //数量

				dto.setPurchase_at(rs.getString("purchase_at")); //登録日

				//商品名をsqlで検索でDTOに入れなきゃならん。ここからした
				PreparedStatement ps2 = con.prepareStatement(sql2);
				ps2.setInt(1, dto.getItemId());
				ResultSet rs2 = ps2.executeQuery();
				if(rs2.next()){
					dto.setItemsName(rs.getString("items_name")); //商品名

					dto.setPrice(rs.getFloat("price")); //単価

					dto.setSubtotal(dto.getPrice()*dto.getQuantities());//合計金額

					adminhistoryList.add(dto);
				}
			}
			rs.close();
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return adminhistoryList;
	}
}