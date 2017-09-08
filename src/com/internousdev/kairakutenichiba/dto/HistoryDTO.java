/**
 *
 */
package com.internousdev.kairakutenichiba.dto;

/**
 * @author internousdev
 *購入履歴
 */
public class HistoryDTO {

	/**
	 * ユーザーID
	 */
	private int user_id;

	/**
	 *商品ID
	 */
	private int item_id;

	/**
	 * 単価
	 */
	private float price;

	/**
	 * 数量
	 */
	private int quantities;

	/**
	 * 小計
	 */
	private float total_price;

	/**
	 * 登録日
	 */
	private String createdAt;

	/**
	 * 商品名
	 */
	private String itemsName;


	//以下アクセサリー


	/**
	 * ユーザーIDを取得するメソッド
	 * @return user_id
	 */
	public int getUser_id() {
		return user_id;
	}

	/**
	 * ユーザーIDを格納するメソッド
	 * @param user_id セットする user_id
	 */
	public void setUser_id(int user_id) {
		this.user_id = user_id;
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
	 * 単価を格納するメソッド
	 * @param price セットする price
	 */
	public void setPrice(float price) {
		this.price = price;
	}

	/**
	 * 数量を取得するメソッド
	 * @return quantities
	 */
	public int getQuantities() {
		return quantities;
	}

	/**
	 * 数量を格納するメソッド
	 * @param quantities セットする quantities
	 */
	public void setQuantities(int quantities) {
		this.quantities = quantities;
	}

	/**
	 * 小計を取得するメソッド
	 * @return total_price
	 */
	public float getTotal_price() {
		return total_price;
	}

	/**
	 * 小計を格納するメソッド
	 * @param total_price セットする total_price
	 */
	public void setTotal_price(float total_price) {
		this.total_price = total_price;
	}

	/**
	 * 登録日を取得するメソッド
	 * @return createdAt
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
	 * @return itemsName
	 */
	public String getItemsName() {
		return itemsName;
	}

	/**
	 * 更新日を格納するメソッド
	 * @param itemsName セットする itemsName
	 */
	public void setItemsName(String itemsName) {
		this.itemsName = itemsName;
	}

}
