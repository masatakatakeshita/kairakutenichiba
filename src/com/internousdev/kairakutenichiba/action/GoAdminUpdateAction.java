/**
 * 
 */
package com.internousdev.kairakutenichiba.action;

import java.util.ArrayList;

import com.internousdev.kairakutenichiba.dao.AdminItemDAO;
import com.internousdev.kairakutenichiba.dto.ItemDTO;
import com.opensymphony.xwork2.ActionSupport;

	/**
	 * 商品情報更新画面へ遷移するときに商品データを取得するクラス
	 * @author Ryo Maeda
	 * @since 2017/05/15
	 * @version 1.0
	 */
public class GoAdminUpdateAction extends ActionSupport{

	/**
	 * シリアルID
	 */
	private static final long serialVersionUID = 2281123274036546024L;
	/**
	 *
	 */
	/**
	 * 商品名
	 *
	 */
	private String itemsName="";

	/**
	 * 商品ID
	 */
	private int itemId;

	/**
	 * ジャンル
	 */
	private String itemGenre;

	/**
	 * 単価
	 */
	private float price;

	/**
	 * イメージファイルパス
	 */
	private String imgPath;

	/**
	 * 商品詳細
	 */
	private String itemDetail;

	/**
	 * 在庫数
	 */
	private int stock;

	/**
	 * 売上数
	 */
	private int sales;
	/**
	 * 種類ID
	 */
	private int sort;

	/**
	 * 登録日
	 */
	private String createdAt;

	/**
	 * 更新日
	 */
	private String updatedAt;

	/**
	 * 商品画像01
	 */
	private String itemImg01;

	/**
	 * 商品画像02
	 */
	private String itemImg02;

	/**
	 * 商品リスト
	 */
	public ArrayList<ItemDTO> itemList = new ArrayList<ItemDTO>();

	/**
	 * 実行メソッド
	 * DBのアイテム情報を取得するメソッド
	 * @return result 成功=SUCCESS 失敗=ERROR
	 */

	public String execute(){
		String result=ERROR;
		AdminItemDAO dao = new AdminItemDAO();
		itemList=dao.select(itemsName);
		if(itemList.size()>0){
			result=SUCCESS;
		}
		return result;
	}

	/**
	 * 商品名を取得するメソッド
	 * @return itemsName　商品名
	 */
	public String getItemsName() {
		return itemsName;
	}

	/**
	 * 商品名を格納するメソッド
	 * @param itemsName セットする itemsName
	 */
	public void setItemsName(String itemsName) {
		this.itemsName = itemsName;
	}

	/**
	 * 商品IDを取得するメソッド
	 * @return itemId　商品ID
	 */
	public int getItemId() {
		return itemId;
	}

	/**
	 * 商品IDを格納するメソッド
	 * @param itemId セットする itemId
	 */
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	/**
	 * ジャンルを取得するメソッド
	 * @return itemGenre　ジャンル
	 */
	public String getItemGenre() {
		return itemGenre;
	}

	/**
	 * ジャンルを格納するメソッド
	 * @param itemGenre セットする itemGenre
	 */
	public void setItemGenre(String itemGenre) {
		this.itemGenre = itemGenre;
	}

	/**
	 * 単価を取得するメソッド
	 * @return price　単価
	 */
	public float getPrice() {
		return price;
	}

	/**
	 * 単価を格納するメソッド
	 * @param price セットする price
	 */
	public void setPrice(float price) {
		this.price = price;
	}

	/**
	 * イメージファイルパスを取得するメソッド
	 * @return imgPath　イメージファイルパス
	 */
	public String getImgPath() {
		return imgPath;
	}

	/**
	 * イメージファイルパスを格納するメソッド
	 * @param imgPath セットする imgPath
	 */
	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}

	/**
	 * 商品詳細を取得するメソッド
	 * @return itemDetail　商品詳細
	 */
	public String getItemDetail() {
		return itemDetail;
	}

	/**
	 * 商品詳細を格納するメソッド
	 * @param itemDetail セットする itemDetail
	 */
	public void setItemDetail(String itemDetail) {
		this.itemDetail = itemDetail;
	}

	/**
	 * 在庫数を取得するメソッド
	 * @return stock　在庫数
	 */
	public int getStock() {
		return stock;
	}

	/**
	 * 在庫数を格納するメソッド
	 * @param stock セットする stock
	 */
	public void setStock(int stock) {
		this.stock = stock;
	}

	/**
	 * 売上数を取得するメソッド
	 * @return sales　売上数
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
	 * 種類IDを取得するメソッド
	 * @return sort　種類ID
	 */
	public int getSort() {
		return sort;
	}

	/**
	 * 種類IDを格納するメソッドを格納する
	 * @param sort セットする sort
	 */
	public void setSort(int sort) {
		this.sort = sort;
	}

	/**
	 * 登録日を取得するメソッド
	 * @return createdAt　登録日
	 */
	public String getCreatedAt() {
		return createdAt;
	}

	/**
	 * 登録日を格納するメソッド
	 * @param createdAt セットする createdAt
	 */
	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	/**
	 * 更新日を取得するメソッド
	 * @return updatedAt　更新日
	 */
	public String getUpdatedAt() {
		return updatedAt;
	}

	/**
	 * 更新日を格納するメソッド
	 * @param updatedAt セットする updatedAt
	 */
	public void setUpdatedAt(String updatedAt) {
		this.updatedAt = updatedAt;
	}

	/**
	 * 商品画像01を取得するメソッド
	 * @return itemImg01　商品画像01
	 */
	public String getItemImg01() {
		return itemImg01;
	}

	/**
	 * 商品画像01を格納するメソッド
	 * @param itemImg01 セットする itemImg01
	 */
	public void setItemImg01(String itemImg01) {
		this.itemImg01 = itemImg01;
	}

	/**
	 * 商品画像02を取得するメソッド
	 * @return itemImg02　商品画像02
	 */
	public String getItemImg02() {
		return itemImg02;
	}

	/**
	 * 商品画像02を格納するメソッド
	 * @param itemImg02 セットする itemImg02
	 */
	public void setItemImg02(String itemImg02) {
		this.itemImg02 = itemImg02;
	}

	/**
	 * 商品リストを取得するメソッド
	 * @return itemList　商品リスト
	 */
	public ArrayList<ItemDTO> getItemList() {
		return itemList;
	}

	/**
	 * 商品リストを格納するメソッド
	 * @param itemList セットする itemList
	 */
	public void setItemList(ArrayList<ItemDTO> itemList) {
		this.itemList = itemList;
	}


}
