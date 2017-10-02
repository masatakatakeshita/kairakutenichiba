package com.internousdev.kairakutenichiba.dao;

import java.net.UnknownHostException;
import java.util.ArrayList;

import com.internousdev.kairakutenichiba.dto.AdminHelpDTO;
import com.internousdev.kairakutenichiba.util.MongoDBConnector;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;

/**
 * お問い合わせ情報閲覧に関するクラス
 * @author naoto togashi
 */
public class AdminHelpDAO {

	/**
	 * お問い合わせのデータをいれるリスト
	 */
	ArrayList<AdminHelpDTO> selectList = new ArrayList<AdminHelpDTO>();


	/**
	 * mongoDBにアクセスし取得した情報をリストに格納するメソッド
	 * @param searchCategory お問い合わせ種類検索
	 * @param searchUserName 名前検索
	 * @param searchSort ソート検索
	 * @return selectList お問い合わせ情報
	 */
	public ArrayList<AdminHelpDTO> selectMongo(String searchCategory, String searchUserName, int searchSort) {


		/* mongoDBに接続*/
		MongoDBConnector con = new MongoDBConnector();
		DB db=null;


		if(searchCategory == null){
			searchCategory = "";
		}
		if(searchUserName == null){
			searchUserName = "";
		}
		try {
			db = con.getConnection();
		} catch (UnknownHostException e) {
			e.printStackTrace();

		}
		DBCollection coll = db.getCollection("inquiry_histories");
		DBCursor cursor=null;



		/* 検索キーに使用*/
				/*問い合わせ種類で検索用*/
				BasicDBObject querycategory = new BasicDBObject("category", searchCategory);
				/*名前検索用*/
				BasicDBObject queryname = new BasicDBObject("user_name", searchUserName);
				/*名前と問い合わせ種類検索用*/
				BasicDBObject querynt = new BasicDBObject("category", searchCategory).append("user_name", searchUserName);
				BasicDBObject querysort = new BasicDBObject("inquiried_at", searchSort);


		/* 検索キーにて取得データを制御
				 * searchCategory:問い合わせ種類
				 * searchName:名前検索
				 */
				if (searchCategory.length()==0 && searchUserName.length()==0){
				/* 全件検索*/
					cursor = coll.find();
				}else if(searchCategory.length()!=0 && searchUserName.length()==0){
				/* 問い合わせ種類のみ検索*/
					cursor = coll.find(querycategory);
				}else if(searchCategory.length()==0 && searchUserName.length()!=0){
				/* 名前でのみ検索*/
					cursor = coll.find(queryname);
				}else if(searchCategory.length()!=0 && searchUserName.length()!=0){
				/* 問い合わせ種類と名前検索*/
					cursor = coll.find(querynt);
				}


				/* sort処理
				 * searchSort=-1:降順(新しい順)
				 * searchSort=1:昇順(古い順)
				 */
				cursor = cursor.sort(querysort);

try {

			while (cursor.hasNext()) {
				AdminHelpDTO dto = new AdminHelpDTO();
				DBObject dbs = cursor.next();
				dto.setUserName((String) dbs.get("user_name"));
				dto.setUserMail((String) dbs.get("user_mail"));
				dto.setCategory((String) dbs.get("category"));
				dto.setComment((String) dbs.get("comment"));
				dto.setDt((String) dbs.get("inquiried_at"));
				selectList.add(dto);

			}
}finally {



			cursor.close();
			}
		return selectList;


	}

}