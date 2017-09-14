/**
 *
 */
package com.internousdev.kairakutenichiba.util;

import java.net.UnknownHostException;

import com.mongodb.DB;
import com.mongodb.MongoClient;

/**
 * MongoDBConnectorクラス
 * @author
 * @since
 * @version 1.0
 */
public class MongoDBConnector {


		private MongoClient client = null;
			public DB getConnection() throws UnknownHostException {
			DB db = null;
			client = new MongoClient("localhost", 27017);
			db = client.getDB("kairakutenichiba");
			return db;
		}

		public void closeConnection() {
			client.close();
		}




}
