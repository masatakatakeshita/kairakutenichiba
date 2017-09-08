/**
 *
 */
package com.internousdev.kairakutenichiba.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.kairakutenichiba.dto.AdminHelpDTO;
import com.internousdev.util.db.mysql.MySqlConnector;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

/**
 * @author internousdev
 *
 */
public class AdminHelpDAO {

	/**
	 * @param args
	 */

	    ArrayList<AdminHelpDTO> SearchList = new ArrayList<AdminHelpDTO>();

	    /**
	     * 問い合わせ情報のうち、指定された文字列がユーザー名に含まれるものを返す(指定が無い場合は全一覧を返す)
	     * @param userName ユーザー名
	     * @return SearchList 問い合わせ情報のリスト
	     */
	    public ArrayList<AdminHelpDTO> display(String userName,String isDeleted) {
	        Connection con = (Connection) new MySqlConnector("kairakutenichiba").getConnection();
	        String sql = "select * from inquiry_histories";
	        String text =" where";
	        if (!userName.equals("")) {
	            sql += text + " user_name like \'%" + userName + "%\'";
	            text = " and";
	        }
	        if (!isDeleted.equals("")) {
	            sql += text + " is_deleted=" + isDeleted;
	            text = " and";
	        }

	        try {
	            PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);
	            ResultSet rs = ps.executeQuery();

	            while (rs.next()) {
	                AdminHelpDTO dto = new AdminHelpDTO();
	                dto.setInquiryNo(rs.getInt("inquiry_no"));
	                dto.setLogin(rs.getBoolean("login"));
	                dto.setUserId(rs.getInt("user_id"));
	                dto.setUserName(rs.getString("user_name"));
	                dto.setUserMail(rs.getString("user_mail"));
	                dto.setCategory(rs.getString("category"));
	                dto.setComment(rs.getString("comment"));
	                dto.setIsDeleted(rs.getBoolean("is_Deleted"));
	                dto.setInquiriedAt(rs.getTimestamp("inquiried_at").toString());
	                SearchList.add(dto);
	            }

	            con.close();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return SearchList;
	    }
	}




