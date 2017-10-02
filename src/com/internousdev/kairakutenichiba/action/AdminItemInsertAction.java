
package com.internousdev.kairakutenichiba.action;

import java.util.ArrayList;

import com.internousdev.kairakutenichiba.dao.AdminItemDAO;
import com.internousdev.kairakutenichiba.dao.AdminItemInsertDAO;
import com.internousdev.kairakutenichiba.dto.ItemDTO;
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
	 * シリアルID
	 */
	private static final long serialVersionUID = 8532713829641837301L;
	/**
	 * 商品ID
	 */
	private int item_id;
	/**
	 * 商品名
	 */
	private String item_name;
	/**
	 * カテゴリー
	 */
	private String category;
	/**
	 * 販売日
	 */
	private String release_day;
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
	private String publish_type;
	/**
	 * ページ
	 */
	private int pages;
	/**
	 * ISBNコード
	 */
	private long isbn;
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
	private String item_detail;
	/**
	 * 商品画像
	 */
	private String imgPath;
	/**
	 * 削除判定
	 */
	private boolean is_deleted;	
	//if deleteがtrueかfalseでjspに表示、非表示か判定できるための仕組み
	/**
	 * 登録日
	 */
	private String created_at;
	/**
	 * 更新日
	 */
	private String updated_at;
	/**
	 * 重複判定
	 */
	private String duplication;	//重複のための文字判定
	
	private ArrayList<ItemDTO> itemList;
	
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
		System.out.println("aaaa");
		String result = ERROR;
		AdminItemInsertDAO dao = new AdminItemInsertDAO();
		if(dao.duplication(item_id,item_name) == true){
			System.out.println("bbbb");
			setDuplication("エラー：同名の商品と商品IDが存在しています");
		}else if(dao.insert(item_id,item_name,category,release_day,author,publisher,publish_type,pages,isbn,price,stocks,sales,item_detail,imgPath,is_deleted,created_at,updated_at)>0){
	System.out.println("fffff");
			dao.insert(item_id,item_name,category,release_day,author,publisher,publish_type,pages,isbn,price,stocks,sales,item_detail,imgPath,is_deleted,created_at,updated_at);	
			result = SUCCESS;
			AdminItemDAO dao2=new AdminItemDAO();
			itemList=dao2.select();
			
			if(itemList.size()>0){
				result=SUCCESS;
			}
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

	/**
	 * @return item_id
	 */
	public int getItem_id() {
		return item_id;
	}

	/**
	 * @param item_id セットする item_id
	 */
	public void setItem_id(int item_id) {
		this.item_id = item_id;
	}

	/**
	 * @return item_name
	 */
	public String getItem_name() {
		return item_name;
	}

	/**
	 * @param item_name セットする item_name
	 */
	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}

	/**
	 * @return category
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * @param category セットする category
	 */
	public void setCategory(String category) {
		this.category = category;
	}

	/**
	 * @return release_day
	 */
	public String getRelease_day() {
		return release_day;
	}

	/**
	 * @param release_day セットする release_day
	 */
	public void setRelease_day(String release_day) {
		this.release_day = release_day;
	}

	/**
	 * @return author
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * @param author セットする author
	 */
	public void setAuthor(String author) {
		this.author = author;
	}

	/**
	 * @return publisher
	 */
	public String getPublisher() {
		return publisher;
	}

	/**
	 * @param publisher セットする publisher
	 */
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	/**
	 * @return publish_type
	 */
	public String getPublish_type() {
		return publish_type;
	}

	/**
	 * @param publish_type セットする publish_type
	 */
	public void setPublish_type(String publish_type) {
		this.publish_type = publish_type;
	}

	/**
	 * @return pages
	 */
	public int getPages() {
		return pages;
	}

	/**
	 * @param pages セットする pages
	 */
	public void setPages(int pages) {
		this.pages = pages;
	}

	/**
	 * @return isbn
	 */
	public long getIsbn() {
		return isbn;
	}

	/**
	 * @param isbn セットする isbn
	 */
	public void setIsbn(long isbn) {
		this.isbn = isbn;
	}

	/**
	 * @return price
	 */
	public int getPrice() {
		return price;
	}

	/**
	 * @param price セットする price
	 */
	public void setPrice(int price) {
		this.price = price;
	}

	/**
	 * @return stocks
	 */
	public int getStocks() {
		return stocks;
	}

	/**
	 * @param stocks セットする stocks
	 */
	public void setStocks(int stocks) {
		this.stocks = stocks;
	}

	/**
	 * @return sales
	 */
	public int getSales() {
		return sales;
	}

	/**
	 * @param sales セットする sales
	 */
	public void setSales(int sales) {
		this.sales = sales;
	}

	/**
	 * @return item_detail
	 */
	public String getItem_detail() {
		return item_detail;
	}

	/**
	 * @param item_detail セットする item_detail
	 */
	public void setItem_detail(String item_detail) {
		this.item_detail = item_detail;
	}

	/**
	 * @return item_image
	 */
	public String getImgPath() {
		return imgPath;
	}

	/**
	 * @param item_image セットする item_image
	 */
	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}

	/**
	 * @return is_deleted
	 */
	public boolean isIs_deleted() {
		return is_deleted;
	}

	/**
	 * @param is_deleted セットする is_deleted
	 */
	public void setIs_deleted(boolean is_deleted) {
		this.is_deleted = is_deleted;
	}

	/**
	 * @return created_at
	 */
	public String getCreated_at() {
		return created_at;
	}

	/**
	 * @param created_at セットする created_at
	 */
	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}

	/**
	 * @return updated_at
	 */
	public String getUpdated_at() {
		return updated_at;
	}

	/**
	 * @param updated_at セットする updated_at
	 */
	public void setUpdated_at(String updated_at) {
		this.updated_at = updated_at;
	}

	
	public ArrayList<ItemDTO> getItemList(){
		return itemList;
	}
	
	public void setItemList(ArrayList<ItemDTO> itemList){
		this.itemList=itemList;
	}

	

	
	
}
