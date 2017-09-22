/**
 *
 */
package com.internousdev.kairakutenichiba.action;

import java.util.ArrayList;

import com.internousdev.kairakutenichiba.dao.AdminItemDAO;
import com.internousdev.kairakutenichiba.dto.ItemDTO;
import com.internousdev.kairakutenichiba.util.AllPages;
import com.internousdev.kairakutenichiba.util.PageObject;
import com.opensymphony.xwork2.ActionSupport;

/**
* 商品一覧を表示するクラス
* @version 1.0
*
*/
public class AdminItemAction extends ActionSupport{

	/**
	 * シリアルID
	 */
	private static final long serialVersionUID = -181035513965129116L;

	/**
	 * 商品名
	 */
	private String item_name;

	/**
	 * 商品ID
	 */
	private int item_id;

	/**
	 * 単価
	 */
	private float price;

	/**
	 * 発売日
	 */
	private int release_day;

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
	 * ページ数
	 */
	private int pages;

	/**
	 * コード
	 */
	private int isbn;

    /**
     * イメージパス
	 */
	private String item_image;

	/**
	 * 在庫数
	 */
	private int stocks;

	/**
	 * 商品詳細
	 */
	private String item_detail;

	/**
	 * 売上数
	 */
	private int sales;

	/**
	 * 登録日
	 */
	private String created_at;

	/**
	 * 更新日
	 */
	private String updated_at;


	/**
	 * カテゴリ
	 */
	private String category;



	/**
	 * デリートキー
	 */
	private boolean is_deleted;



	/**
	 * 商品リストを取得するメソッド

	 */
	public String execute(){
		String result =SUCCESS;

		int all=0;
		ArrayList<ItemDTO> allList = new ArrayList<ItemDTO>();
		AdminItemDAO dao=new AdminItemDAO();
		allList=dao.select("");
		all=allList.size();
		for(int i=0;i<all;i++){
			ItemDTO dto = new ItemDTO();
			dto= allList.get(i);
			String str=dto.getItem_name();
			if(str.startsWith(item_name)){
				itemList.add(dto);
			}

		}
		number=itemList.size();


		if(number > 0) {
			//ページネーション処理
			ArrayList<PageObject> allPages = new ArrayList<PageObject>();
			AllPages allp = new AllPages();
			allPages=allp.paginate(itemList, 10);
			setMaxPage(allp.getMaxPage(itemList, 10));
			setDisplayList(allPages.get(pageNum-1).getPaginatedList());
			result = SUCCESS;
		}

		return result;
	}


	/**
	 * セッターゲッター
	 */

	//以下アクセサリー


		/**
		 * 商品名を取得するメソッド
		 * @return item_name
		 */
		public String getItem_name() {
			return item_name;
		}

		/**
		 * 商品名を格納するメソッド
		 * @param item_name セットする item_name
		 */
		public void setItem_name(String item_name) {
			this.item_name = item_name;
		}

		/**
		 * アイテムIDを取得するメソッド
		 * @return item_id
		 */
		public int getItem_id() {
			return item_id;
		}

		/**
		 * アイテムIDを格納するメソッド
		 * @param item_id セットする item_id
		 */
		public void setItem_id(int item_id) {
			this.item_id = item_id;
		}

		/**
		 * 単価を取得するメソッド
		 * @return price
		 */
		public float getPrice() {
			return price;
		}

		/**
		 * 発売日を取得するメソッド
		 * @return release_day
		 */
		public int getRelease_day() {
			return release_day;
		}

		/**
		 * 発売日を格納するメソッド
		 */
		public void setRelease_day(int release_day) {
			this.release_day = release_day;
		}

		/**
		 * 著者名を取得するメソッド
		 * @return author
		 */
		public String getAuthor() {
			return author;
		}

		/**
		 * 著者名を格納するメソッド
		 * @param price セットする price
		 */
		public void setAuthor(String author) {
			this.author = author;
		}

		/**
		 * 出版社を取得するメソッド
		 * @return publisher
		 */
		public String getPublisher(){
			return publisher;
		}
		/**
		 * 出版社を格納するメソッド
		 * @param publisher
		 */
		public void setPublisher(String publisher){
			this.publisher = publisher;
		}

		/**
		 * 発行形態を取得するメソッド
		 * @return publish_type
		 */
		public String getpublish_type(){
			return publish_type;
		}
		/**
		 * 発行形態を格納するメソッド
		 * @param publish_type
		 */
		public void setPublish_type(String publish_type){
			this.publish_type = publish_type;
		}

		/**
		 * ページ数を取得するメソッド
		 * @return publish_type
		 */
		public int getPages(){
			return pages;
		}
		/**
		 * ページ数を格納するメソッド
		 * @param publish_type
		 */
		public void setPages(int pages){
			this.pages = pages;
		}

		/**
		 * コードを取得するメソッド
		 * @return publish_type
		 */
		public int getIsbn(){
			return isbn;
		}
		/**
		 * コードを格納するメソッド
		 * @param publish_type
		 */
		public void setIsbn(int isbn){
			this.isbn = isbn;
		}

		/**
		 * 単価を格納するメソッド
		 * @param price セットする price
		 */
		public void setPrice(float price) {
			this.price = price;
		}

		/**
		 * イメージパスを取得するメソッド
		 * @return item_image
		 */
		public String getitem_image() {
			return item_image;
		}

		/**
		 * イメージパスを格納するメソッド
		 * @param item_image セットする item_image
		 */
		public void setitem_image(String item_image) {
			this.item_image = item_image;
		}

		/**
		 * 在庫数を取得するメソッド
		 * @return stocks
		 */
		public int getStocks() {
			return stocks;
		}

		/**
		 * 在庫数を格納するメソッド
		 * @param stocks セットする stocks
		 */
		public void setStocks(int stocks) {
			this.stocks = stocks;
		}

		/**
		 * 売上数を取得するメソッド
		 * @return sales
		 */
		public int getSales() {
			return sales;
		}

		/**
		 * 売上数を格納するメソッド
		 * @param sales セットする sales
		 */
		public void setSales(int sales) {
			this.sales = sales;
		}

		/**
		 *	登録日を取得するメソッド
		 * @return created_at
		 */
		public String getCreated_at() {
			return created_at;
		}

		/**
		 * 登録日を格納するメソッド
		 * @param created_at セットする created_at
		 */
		public void setCreated_at(String created_at) {
			this.created_at = created_at;
		}

		/**
		 * 更新日を取得するメソッド
		 * @return updated_at
		 */
		public String getUpdated_at() {
			return updated_at;
		}

		/**
		 * 更新日を格納するメソッド
		 * @param updated_at セットする updated_at
		 */
		public void setUpdated_at(String updated_at) {
			this.updated_at = updated_at;
		}



		/**
		 * カテゴリを取得するメソッド
		 * @return category
		 */
		public String getCategory() {
			return category;
		}

		/**
		 * カテゴリを格納するメソッド
		 * @param category セットする category
		 */
		public void setCategory(String category) {
			this.category = category;
		}

		/**
		 * デリートキーを取得するメソッド
		 * @return is_deleted
		 */
		public boolean getis_deleted() {
			return is_deleted;
		}

		/**
		 * デリートキーを格納するメソッド
		 * @param is_deleted セットする is_deleted
		 */
		public void setis_deleted(boolean is_deleted) {
			this.is_deleted = is_deleted;
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
		 * 商品リスト
		 */
		public ArrayList<ItemDTO> itemList = new ArrayList<ItemDTO>();

		/**
		 * 検索数
		 */
		public int number;

		private int maxPage;
		public ArrayList<ItemDTO> displayList = new ArrayList<ItemDTO>();

		private int pageNum=1;





	/**
	* ページ数のget
	*/
	public int getMaxPage() {
		return maxPage;
	}

	/**
	 * ページ数をset
	 */
	public void setMaxPage(int maxPage) {
		this.maxPage = maxPage;
	}

	/**
	 * ItemDTOをリスト化してget
	 */
	public ArrayList<ItemDTO> getDisplayList() {
		return displayList;
	}

	/**
	 * ItemDTOをリスト化してset
	 */
	public void setDisplayList(ArrayList<ItemDTO> displayList) {
		this.displayList = displayList;
	}
	/**
	 * ページ合計をget　
	 */
	public int getPageNum() {
		return pageNum;
	}

	/**
	 * ページ合計をset
	 */
	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}

	}