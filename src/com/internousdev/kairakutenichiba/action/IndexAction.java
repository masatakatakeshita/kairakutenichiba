/**
 *
 */
package com.internousdev.kairakutenichiba.action;

import java.util.ArrayList;

import com.internousdev.kairakutenichiba.dao.IndexActionDAO;
import com.internousdev.kairakutenichiba.dto.ItemDTO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author internous
 *
 */
public class IndexAction extends ActionSupport {


	/**
	 * シリアルID
	 */
	private static final long serialVersionUID = -181035513965129116L;

	

	/**
	 * 商品ID
	 */
	private int item_id;

	

    /**
     * イメージパス
	 */
	private String item_image;

	

	/**
	 * カテゴリ
	 */
	private String category;


	
	
	/**
	 * 商品リスト
	 */
	private ArrayList<ItemDTO> itemList  = new ArrayList<>();
	private ArrayList<ItemDTO> itemListA = new ArrayList<>();
	private ArrayList<ItemDTO> itemListB = new ArrayList<>();
	private ArrayList<ItemDTO> itemListC = new ArrayList<>();
	private ArrayList<ItemDTO> itemListD = new ArrayList<>();
	private ArrayList<ItemDTO> itemListE = new ArrayList<>();
	private String aa;
	private String bb;
	private String cc;
	private String dd;
	private String ee;
	





	public String execute() {
        String result = ERROR;
        IndexActionDAO dao = new IndexActionDAO();
        itemList = dao.select();
        
        ItemDTO dtoa=new ItemDTO();
        dtoa.setItemList( dao.select("少年漫画"));
        itemListA=dtoa.getItemList();
        
        ItemDTO dtob=new ItemDTO();
        dtob.setItemList( dao.select("少女漫画"));
        itemListB=dtob.getItemList();
        
        itemListC = dao.select("ライトノベル");
        itemListD = dao.select("文庫本");
        
        ItemDTO dtoe=new ItemDTO();
        dtoe.setItemList( dao.select("雑誌"));
        itemListE=dtoe.getItemList();
        
        System.out.println("test"+itemListA);
        System.out.println(itemListB);
        aa = itemListA.get(1).getItem_image();
        bb = itemListB.get(1).getItem_image();
        cc = itemListC.get(1).getItem_image();
        dd = itemListD.get(1).getItem_image();
        ee = itemListE.get(1).getItem_image();
        System.out.println(aa);


        result = SUCCESS;

        return result;
        }




	/**
	 * セッターゲッター
	 */

	//以下アクセサリー


		

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
		 * イメージパスを取得するメソッド
		 * @return item_image
		 */
		public String getItem_image() {
			return item_image;
		}

		/**
		 * イメージパスを格納するメソッド
		 * @param item_image セットする item_image
		 */
		public void setItem_image(String item_image) {
			this.item_image = item_image;
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

		

		



		public ArrayList<ItemDTO> getItemList() {
			return itemList;
		}


		public void setItemList(ArrayList<ItemDTO> itemList) {
			this.itemList= itemList;
		}



		public ArrayList<ItemDTO> getItemListA() {
			return itemListA;
		}

		public void setItemListA(ArrayList<ItemDTO> itemListA) {
			this.itemListA = itemListA;
		}

		public ArrayList<ItemDTO> getItemListB() {
			return itemListB;
		}




		public void setItemListB(ArrayList<ItemDTO> itemListB) {
			this.itemListB = itemListB;
		}
		
		public ArrayList<ItemDTO> getItemListC() {
			return itemListC;
		}

		public void setItemListC(ArrayList<ItemDTO> itemListC) {
			this.itemListC = itemListC;
		}
		
		public ArrayList<ItemDTO> getItemListD() {
			return itemListD;
		}

		public void setItemListD(ArrayList<ItemDTO> itemListD) {
			this.itemListD = itemListD;
		}
		
		public ArrayList<ItemDTO> getItemListE() {
			return itemListE;
		}

		public void setItemListE(ArrayList<ItemDTO> itemListE) {
			this.itemListE = itemListE;
		}






		public String getAa() {
			return aa;
		}




		public void setAa(String aa) {
			this.aa = aa;
		}




		public String getBb() {
			return bb;
		}




		public void setBb(String bb) {
			this.bb = bb;
		}




		public String getCc() {
			return cc;
		}




		public void setCc(String cc) {
			this.cc = cc;
		}




		public String getDd() {
			return dd;
		}




		public void setDd(String dd) {
			this.dd = dd;
		}




		public String getEe() {
			return ee;
		}




		public void setEe(String ee) {
			this.ee = ee;
		}
		









}
