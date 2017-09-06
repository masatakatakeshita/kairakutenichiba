/**
 * 
 */
package com.internousdev.kairakutenichiba.action;

import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.kairakutenichiba.dao.GoItemDetailDAO;
import com.internousdev.kairakutenichiba.dto.ItemDTO;
import com.opensymphony.xwork2.ActionSupport;
/**
* ジャンル別に商品一覧を表示するクラス
* @author Tatsuhiro Saito
* @since 2017/05/19
* @version 1.0
*/
public class GoItemDetailAction extends ActionSupport {


	/**
	 * シリアルID
	 */
	private static final long serialVersionUID = 265702236011588767L;

	/**
	 * 商品ID
    */

	private int itemId;

	/**
	 * 商品名
    */

	private String itemsName;

	/**
	 * 種類ID
    */
	private int sortId;

	/**
	 * 単価
    */

	private float price;

	/**
	 * 商品画像01
    */

	private String itemImg01;
	/**
	 * 商品画像02
    */

	private String itemImg02;

	/**
	 * 商品詳細
    */

	private String itemsDetail;

	/**
	 * 商品一覧表示用リスト
    */

	private ArrayList<ItemDTO> displayList = new ArrayList<ItemDTO>();


	/**
	 * 商品一覧表示用リストの生成
    */
	public String execute() throws SQLException {
		String result = ERROR;
		GoItemDetailDAO dao = new GoItemDetailDAO();
		displayList = dao.select(sortId);
		if(displayList.size() != 0) {
			result = SUCCESS;
		}
		return result;
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
	 * 種類IDを取得するメソッド
	 * @return sortId　種類ID
	 */
	public int getSortId() {
		return sortId;
	}




	/**
	 * 種類IDを格納するメソッド
	 * @param sortId セットする sortId
	 */
	public void setSortId(int sortId) {
		this.sortId = sortId;
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
	 * 商品詳細を取得するメソッド
	 * @return itemsDetail　商品詳細
	 */
	public String getItemsDetail() {
		return itemsDetail;
	}




	/**
	 * 商品詳細を格納するメソッド
	 * @param itemsDetail セットする itemsDetail
	 */
	public void setItemsDetail(String itemsDetail) {
		this.itemsDetail = itemsDetail;
	}




	/**
	 * 商品一覧表示用リストを取得するメソッド
	 * @return displayList　商品一覧表示用リスト
	 */
	public ArrayList<ItemDTO> getDisplayList() {
		return displayList;
	}




	/**
	 * 商品一覧表示用リストを格納するメソッド
	 * @param displayList セットする displayList
	 */
	public void setDisplayList(ArrayList<ItemDTO> displayList) {
		this.displayList = displayList;
	}

	}
