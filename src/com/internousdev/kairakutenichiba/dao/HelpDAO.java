/**
 *
 */
package com.internousdev.kairakutenichiba.dao;

import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

import com.internousdev.kairakutenichiba.util.MongoDBConnector;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
/**
 * @author naoto togashi
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
     * @param comment 問い合わせ内容
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
		MongoDBConnector con = new MongoDBConnector();
		/*利用するDB(コレクション)を取得*/
		DB db = con.getConnection();
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


	}





