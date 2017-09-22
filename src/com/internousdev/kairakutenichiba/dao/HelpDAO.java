/**
 *
 */
package com.internousdev.kairakutenichiba.dao;

import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.Mongo;
import com.mongodb.MongoClient;

/**
 * @author internousdev
 *
 *
 */
public class HelpDAO {

	/**
     * 問い合わせフォームに入力されたときに実行されるメソッド
     * @param userName 問い合わせ者名
     * @param userAddress 住所
     * @param userMail メールアドレス
     * @param category 問い合わせ種類
     * @param comment 本文
	 * @param
     * @return countをactionに返す
	 * @throws UnknownHostException
     */
    public boolean mongoInsert(String userName, String userAddress, String userMail, String category, String comment) throws UnknownHostException {
    	boolean result = false;

        Calendar cal = Calendar.getInstance();
		TimeZone tz = TimeZone.getTimeZone("Asia/Tokyo");
		cal.setTimeZone(tz);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm");
		String dt = sdf.format(cal.getTime());

		/*MongoDBサーバに接続*/
		MongoClient cliant = new MongoClient("localhost",27017);
		/*利用するDBを取得*/
		DB db = cliant.getDB("kairakutenichiba");
		/*利用するコレクションを取得*/
		DBCollection coll = db.getCollection("inquiry_histories");


		BasicDBObject doc = new BasicDBObject();

			doc.append("user_name",userName);
			doc.append("user_address", userAddress);
			doc.append("user_mail", userMail);
			doc.append("category", category);
			doc.append("comment", comment);
			doc.append("inquiried_at", dt);

			coll.insert(doc);



        return result;
    }

    public void closeCollection(Mongo client) {
    client.close();
    }

	}





