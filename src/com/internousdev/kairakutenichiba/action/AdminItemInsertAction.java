
package com.internousdev.kairakutenichiba.action;

import com.internousdev.kairakutenichiba.dao.AdminItemInsertDAO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 
 */

/**
 * @author junpeikoizumi
 * 商品をデータベースに新しく追加する際に動くAction
 */
public class AdminItemInsertAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8532713829641837301L;


	/**
	 * 商品ID
	 */
	private int itemId;
	/**
	 * 商品名
	 */
	private String itemName;
	/**
	 * カテゴリー
	 */
	private String category;
	/**
	 * 販売日
	 */
	private String releaseday;
	/**
	 * 著者
	 */
	private String author;
	/**
	 * 出版社
	 */
	private String publisher;
	/**
	 * 発行形態
	 */
	private String publishtype;
	/**
	 * ページ
	 */
	private int page;
	/**
	 * ISBNコード
	 */
	private int ISBN;
	/**
	 * 値段
	 */
	private int price;
	/**
	 * 在庫
	 */
	private int stocks;
	/**
	 * 売上
	 */
	private int sales;
	/**
	 * 商品詳細
	 */
	private String itemdetail;
	/**
	 * 商品画像
	 */
	private String itemimagePass;
	/**
	 * 削除判定
	 */
	private boolean deleteFlag;	
	//if deleteがtrueかfalseでjspに表示、非表示か判定できるための仕組み
	/**
	 * 登録日
	 */
	private String RegisteredDay;
	/**
	 * 更新日
	 */
	private String UpdatedDay;
	/**
	 * 重複判定
	 */
	private String duplication;	//重複のための文字判定
	
    /**
    * DBに商品を追加する実行メソッド
    * @author　junpei koizumi
    */

    /**
    * 実行メソッド 処理内容と順番
    * 1：商品名か商品IDが重複しているか判断
    * 2：重複している場合はエラー。
    * 3：重複していない場合はDBにinsertされる
    */
	public String execute(){
		String result = ERROR;
		AdminItemInsertDAO dao = new AdminItemInsertDAO();
//daoではそうか、すでに存在しているテーブルであったなら削除スべきだな。		
		if(dao.duplication(itemId,itemName) == false){
			setDuplication("エラー：同名の商品と商品IDが存在しています");
		}else{
			dao.insert(itemId,itemName,category,releaseday,author,publisher,publishtype,page,ISBN,price,stocks,sales,itemdetail,itemimagePass,deleteFlag,RegisteredDay,UpdatedDay);	//こいつ実行すればDB書き換わる。
			result = SUCCESS;
		}
		return result;
	}

	
	/**
	 * set,getメソッド
	 */
	/**
	 * 重複判定をget
	 */
	public String getDuplication() {
		return duplication;
	}

	/**
	 * 重複判定をset
	 */
	public void setDuplication(String duplication) {
		this.duplication = duplication;
	}


	

	
	
}
