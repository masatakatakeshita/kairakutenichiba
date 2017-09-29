package com.internousdev.kairakutenichiba.dto.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.internousdev.kairakutenichiba.dto.AdminHistoryDTO;

public class AdminHistoryDTOTest {

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.AdminHistoryDTO#getPurchaseId()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetPurchaseId1() {
		AdminHistoryDTO test = new AdminHistoryDTO();
		int expected = 0;

		test.setPurchaseId(expected);

		assertEquals(expected, test.getPurchaseId());
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.AdminHistoryDTO#getPurchaseId()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetPurchaseId2() {
		AdminHistoryDTO test = new AdminHistoryDTO();
		int expected = 2147483647;

		test.setPurchaseId(expected);

		assertEquals(expected, test.getPurchaseId());
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.AdminHistoryDTO#getPurchaseId()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetPurchaseId3() {
		AdminHistoryDTO test = new AdminHistoryDTO();
		int expected = -2147483648;

		test.setPurchaseId(expected);

		assertEquals(expected, test.getPurchaseId());
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.AdminHistoryDTO#getPurchaseId()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetPurchaseId4() {
		AdminHistoryDTO test = new AdminHistoryDTO();
		try {
			int Purchase_idMin = Integer.parseInt("2147483648");
			test.setPurchaseId(Purchase_idMin);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.AdminHistoryDTO#getPurchaseId()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetPurchaseId5() {
		AdminHistoryDTO test = new AdminHistoryDTO();
		try {
			int Purchase_idMin = Integer.parseInt("-2147483649");
			test.setPurchaseId(Purchase_idMin);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.AdminHistoryDTO#setPurchaseId(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetPurchaseId1() {
		AdminHistoryDTO test = new AdminHistoryDTO();
		int expected = 0;

		test.setPurchaseId(expected);
		int actual = test.getPurchaseId();

		assertEquals(expected, actual);
	}


	/**
	 * {@link com.internousdev.kairakutenichiba.dto.AdminHistoryDTO#setPurchaseId(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetPurchaseId2() {
		AdminHistoryDTO test = new AdminHistoryDTO();
		int expected = 2147483647;

		test.setPurchaseId(expected);
		int actual = test.getPurchaseId();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.AdminHistoryDTO#setPurchaseId(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetPurchaseId3() {
		AdminHistoryDTO test = new AdminHistoryDTO();
		int expected = -2147483648;

		test.setPurchaseId(expected);
		int actual = test.getPurchaseId();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.AdminHistoryDTO#setPurchaseId(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetPurchaseId4() {
		AdminHistoryDTO test = new AdminHistoryDTO();
		try {
			int Purchase_idMax = Integer.parseInt("2147483648");
			test.setPurchaseId(Purchase_idMax);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.AdminHistoryDTO#setPurchaseId(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetPurchaseId5() {
		AdminHistoryDTO test = new AdminHistoryDTO();
		try {
			int Purchase_idMax = Integer.parseInt("-2147483649");
			test.setPurchaseId(Purchase_idMax);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}









	/**
	 * {@link com.internousdev.kairakutenichiba.dto.AdminHistoryDTO#getItemsName()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetItemsName1() {
		AdminHistoryDTO test = new AdminHistoryDTO();
		String expected = null;

		test.setItemsName(expected);
		String actual = test.getItemsName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.AdminHistoryDTO#getItemsName()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetItemsName2() {
		AdminHistoryDTO test = new AdminHistoryDTO();
		String expected = "";

		test.setItemsName(expected);
		String actual = test.getItemsName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.AdminHistoryDTO#getItemsName()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetItemsName3() {
		AdminHistoryDTO test = new AdminHistoryDTO();
		String expected = " ";

		test.setItemsName(expected);
		String actual = test.getItemsName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.AdminHistoryDTO#getItemsName()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetItemsName4() {
		AdminHistoryDTO test = new AdminHistoryDTO();
		String expected = "　";

		test.setItemsName(expected);
		String actual = test.getItemsName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.AdminHistoryDTO#getItemsName()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetItemsName5() {
		AdminHistoryDTO test = new AdminHistoryDTO();
		String expected = "abc123";

		test.setItemsName(expected);
		String actual = test.getItemsName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.AdminHistoryDTO#getItemsName()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetItemsName6() {
		AdminHistoryDTO test = new AdminHistoryDTO();
		String expected = "あいう１２３";

		test.setItemsName(expected);
		String actual = test.getItemsName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.AdminHistoryDTO#getItemsName()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetItemsName7() {
		AdminHistoryDTO test = new AdminHistoryDTO();
		String expected = "abc123あいう１２３";

		test.setItemsName(expected);
		String actual = test.getItemsName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.AdminHistoryDTO#getItemsName()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetItemsName8() {
		AdminHistoryDTO test = new AdminHistoryDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setItemsName(expected);
		String actual = test.getItemsName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.AdminHistoryDTO#setItemsName(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetItemsName1() {
		AdminHistoryDTO test = new AdminHistoryDTO();
		String expected = null;

		test.setItemsName(expected);
		String actual = test.getItemsName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.AdminHistoryDTO#setItemsName(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetItemsName2() {
		AdminHistoryDTO test = new AdminHistoryDTO();
		String expected = "";

		test.setItemsName(expected);
		String actual = test.getItemsName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.AdminHistoryDTO#setItemsName(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetItemsName3() {
		AdminHistoryDTO test = new AdminHistoryDTO();
		String expected = " ";

		test.setItemsName(expected);
		String actual = test.getItemsName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.AdminHistoryDTO#setItemsName(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetItemsName4() {
		AdminHistoryDTO test = new AdminHistoryDTO();
		String expected = "　";

		test.setItemsName(expected);
		String actual = test.getItemsName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.AdminHistoryDTO#setItemsName(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetItemsName5() {
		AdminHistoryDTO test = new AdminHistoryDTO();
		String expected = "abc123";

		test.setItemsName(expected);
		String actual = test.getItemsName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.AdminHistoryDTO#setItemsName(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetItemsName6() {
		AdminHistoryDTO test = new AdminHistoryDTO();
		String expected = "あいう１２３";

		test.setItemsName(expected);
		String actual = test.getItemsName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.AdminHistoryDTO#setItemsName(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetItemsName7() {
		AdminHistoryDTO test = new AdminHistoryDTO();
		String expected = "abc123あいう１２３";

		test.setItemsName(expected);
		String actual = test.getItemsName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.AdminHistoryDTO#setItemsName(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetItemsName8() {
		AdminHistoryDTO test = new AdminHistoryDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setItemsName(expected);
		String actual = test.getItemsName();

		assertEquals(expected, actual);
	}









	/**
	 * {@link com.internousdev.kairakutenichiba.dto.AdminHistoryDTO#getPrice()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetPrice1() {
		AdminHistoryDTO test = new AdminHistoryDTO();
		float expected = 0f;

		test.setPrice(expected);

		assertEquals(expected, test.getPrice(),0.00000000001f);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.AdminHistoryDTO#getPrice()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetPrice2() {
		AdminHistoryDTO test = new AdminHistoryDTO();
		float expected =  3.4028235E38f;

		test.setPrice(expected);

		assertEquals(expected, test.getPrice(),0.00000000001f);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.AdminHistoryDTO#getPrice()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetPrice3() {
		AdminHistoryDTO test = new AdminHistoryDTO();
		float expected = 1.4E-45f;

		test.setPrice(expected);

		assertEquals(expected, test.getPrice(),0.00000000001f);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.AdminHistoryDTO#getPrice()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetPrice4() {
		AdminHistoryDTO test = new AdminHistoryDTO();
		try {
			float PriceMin = Integer.parseInt("4.4028235E38f");
			test.setPrice(PriceMin);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"4.4028235E38f\"");
		}
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.AdminHistoryDTO#getPrice()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetPrice5() {
		AdminHistoryDTO test = new AdminHistoryDTO();
		try {
			float PriceMin = Integer.parseInt("-4.4028235E38f");
			test.setPrice(PriceMin);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-4.4028235E38f\"");
		}
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.AdminHistoryDTO#setPrice(float)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetPrice1() {
		AdminHistoryDTO test = new AdminHistoryDTO();
		float expected = 0f;

		test.setPrice(expected);

		assertEquals(expected, test.getPrice(),0.00000000001f);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.AdminHistoryDTO#setPrice(float)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetPrice2() {
		AdminHistoryDTO test = new AdminHistoryDTO();
		float expected =  3.4028235E38f;

		test.setPrice(expected);

		assertEquals(expected, test.getPrice(),0.00000000001f);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.AdminHistoryDTO#setPrice(float)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetPrice3() {
		AdminHistoryDTO test = new AdminHistoryDTO();
		float expected = 1.4E-45f;

		test.setPrice(expected);

		assertEquals(expected, test.getPrice(),0.00000000001f);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.AdminHistoryDTO#setPrice(float)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetPrice4() {
		AdminHistoryDTO test = new AdminHistoryDTO();
		try {
			float PriceMin = Integer.parseInt("4.4028235E38f");
			test.setPrice(PriceMin);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"4.4028235E38f\"");
		}
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.AdminHistoryDTO#setPrice(float)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetPrice5() {
		AdminHistoryDTO test = new AdminHistoryDTO();
		try {
			float PriceMin = Integer.parseInt("-4.4028235E38f");
			test.setPrice(PriceMin);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-4.4028235E38f\"");
		}
	}











    /**
	 * {@link com.internousdev.kairakutenichiba.dto.AdminHistoryDTO#getItemId()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetItemId1() {
		AdminHistoryDTO test = new AdminHistoryDTO();
		int expected = 0;

		test.setItemId(expected);

		assertEquals(expected, test.getItemId());
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.AdminHistoryDTO#getItemId()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetItemId2() {
		AdminHistoryDTO test = new AdminHistoryDTO();
		int expected = 2147483647;

		test.setItemId(expected);

		assertEquals(expected, test.getItemId());
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.AdminHistoryDTO#getItemId()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetItemId3() {
		AdminHistoryDTO test = new AdminHistoryDTO();
		int expected = -2147483648;

		test.setItemId(expected);

		assertEquals(expected, test.getItemId());
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.AdminHistoryDTO#getItemId()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetItemId4() {
		AdminHistoryDTO test = new AdminHistoryDTO();
		try {
			int Purchase_idMin = Integer.parseInt("2147483648");
			test.setItemId(Purchase_idMin);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.AdminHistoryDTO#getItemId()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetItemId5() {
		AdminHistoryDTO test = new AdminHistoryDTO();
		try {
			int Purchase_idMin = Integer.parseInt("-2147483649");
			test.setItemId(Purchase_idMin);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.AdminHistoryDTO#setItemId(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetItemId1() {
		AdminHistoryDTO test = new AdminHistoryDTO();
		int expected = 0;

		test.setItemId(expected);
		int actual = test.getItemId();

		assertEquals(expected, actual);
	}


	/**
	 * {@link com.internousdev.kairakutenichiba.dto.AdminHistoryDTO#setItemId(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetItemId2() {
		AdminHistoryDTO test = new AdminHistoryDTO();
		int expected = 2147483647;

		test.setItemId(expected);
		int actual = test.getItemId();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.AdminHistoryDTO#setItemId(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetItemId3() {
		AdminHistoryDTO test = new AdminHistoryDTO();
		int expected = -2147483648;

		test.setItemId(expected);
		int actual = test.getItemId();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.AdminHistoryDTO#setItemId(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetItemId4() {
		AdminHistoryDTO test = new AdminHistoryDTO();
		try {
			int Purchase_idMax = Integer.parseInt("2147483648");
			test.setItemId(Purchase_idMax);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.AdminHistoryDTO#setItemId(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetItemId5() {
		AdminHistoryDTO test = new AdminHistoryDTO();
		try {
			int Purchase_idMax = Integer.parseInt("-2147483649");
			test.setItemId(Purchase_idMax);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}












	/**
	 * {@link com.internousdev.kairakutenichiba.dto.AdminHistoryDTO#getPurchase_at()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetPurchase_at1() {
		AdminHistoryDTO test = new AdminHistoryDTO();
		String expected = null;

		test.setPurchase_at(expected);
		String actual = test.getPurchase_at();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.AdminHistoryDTO#getPurchase_at()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetPurchase_at2() {
		AdminHistoryDTO test = new AdminHistoryDTO();
		String expected = "";

		test.setPurchase_at(expected);
		String actual = test.getPurchase_at();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.AdminHistoryDTO#getPurchase_at()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetPurchase_at3() {
		AdminHistoryDTO test = new AdminHistoryDTO();
		String expected = " ";

		test.setPurchase_at(expected);
		String actual = test.getPurchase_at();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.AdminHistoryDTO#getPurchase_at()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetPurchase_at4() {
		AdminHistoryDTO test = new AdminHistoryDTO();
		String expected = "　";

		test.setPurchase_at(expected);
		String actual = test.getPurchase_at();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.AdminHistoryDTO#getPurchase_at()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetPurchase_at5() {
		AdminHistoryDTO test = new AdminHistoryDTO();
		String expected = "abc123";

		test.setPurchase_at(expected);
		String actual = test.getPurchase_at();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.AdminHistoryDTO#getPurchase_at()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetPurchase_at6() {
		AdminHistoryDTO test = new AdminHistoryDTO();
		String expected = "あいう１２３";

		test.setPurchase_at(expected);
		String actual = test.getPurchase_at();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.AdminHistoryDTO#getPurchase_at()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetPurchase_at7() {
		AdminHistoryDTO test = new AdminHistoryDTO();
		String expected = "abc123あいう１２３";

		test.setPurchase_at(expected);
		String actual = test.getPurchase_at();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.AdminHistoryDTO#getPurchase_at()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetPurchase_at8() {
		AdminHistoryDTO test = new AdminHistoryDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setPurchase_at(expected);
		String actual = test.getPurchase_at();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.AdminHistoryDTO#setPurchase_at(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetPurchase_at1() {
		AdminHistoryDTO test = new AdminHistoryDTO();
		String expected = null;

		test.setPurchase_at(expected);
		String actual = test.getPurchase_at();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.AdminHistoryDTO#setPurchase_at(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetPurchase_at2() {
		AdminHistoryDTO test = new AdminHistoryDTO();
		String expected = "";

		test.setPurchase_at(expected);
		String actual = test.getPurchase_at();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.AdminHistoryDTO#setPurchase_at(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetPurchase_at3() {
		AdminHistoryDTO test = new AdminHistoryDTO();
		String expected = " ";

		test.setPurchase_at(expected);
		String actual = test.getPurchase_at();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.AdminHistoryDTO#setPurchase_at(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetPurchase_at4() {
		AdminHistoryDTO test = new AdminHistoryDTO();
		String expected = "　";

		test.setPurchase_at(expected);
		String actual = test.getPurchase_at();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.AdminHistoryDTO#setPurchase_at(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetPurchase_at5() {
		AdminHistoryDTO test = new AdminHistoryDTO();
		String expected = "abc123";

		test.setPurchase_at(expected);
		String actual = test.getPurchase_at();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.AdminHistoryDTO#setPurchase_at(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetPurchase_at6() {
		AdminHistoryDTO test = new AdminHistoryDTO();
		String expected = "あいう１２３";

		test.setPurchase_at(expected);
		String actual = test.getPurchase_at();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.AdminHistoryDTO#setPurchase_at(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetPurchase_at7() {
		AdminHistoryDTO test = new AdminHistoryDTO();
		String expected = "abc123あいう１２３";

		test.setPurchase_at(expected);
		String actual = test.getPurchase_at();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.AdminHistoryDTO#setPurchase_at(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetPurchase_at8() {
		AdminHistoryDTO test = new AdminHistoryDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setPurchase_at(expected);
		String actual = test.getPurchase_at();

		assertEquals(expected, actual);
	}









    /**
	 * {@link com.internousdev.kairakutenichiba.dto.AdminHistoryDTO#getSubtotal()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetSubtotal1() {
		AdminHistoryDTO test = new AdminHistoryDTO();
		float expected = 0f;

		test.setSubtotal(expected);

		assertEquals(expected, test.getSubtotal(),0.00000000001f);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.AdminHistoryDTO#getSubtotal()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetSubtotal2() {
		AdminHistoryDTO test = new AdminHistoryDTO();
		float expected =  3.4028235E38f;

		test.setSubtotal(expected);

		assertEquals(expected, test.getSubtotal(),0.00000000001f);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.AdminHistoryDTO#getSubtotal()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetSubtotal3() {
		AdminHistoryDTO test = new AdminHistoryDTO();
		float expected = 1.4E-45f;

		test.setSubtotal(expected);

		assertEquals(expected, test.getSubtotal(),0.00000000001f);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.AdminHistoryDTO#getSubtotal()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetSubtotal4() {
		AdminHistoryDTO test = new AdminHistoryDTO();
		try {
			float SubtotalMin = Integer.parseInt("4.4028235E38f");
			test.setSubtotal(SubtotalMin);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"4.4028235E38f\"");
		}
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.AdminHistoryDTO#getSubtotal()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetSubtotal5() {
		AdminHistoryDTO test = new AdminHistoryDTO();
		try {
			float SubtotalMin = Integer.parseInt("-4.4028235E38f");
			test.setSubtotal(SubtotalMin);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-4.4028235E38f\"");
		}
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.AdminHistoryDTO#setSubtotal(float)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetSubtotal1() {
		AdminHistoryDTO test = new AdminHistoryDTO();
		float expected = 0f;

		test.setSubtotal(expected);

		assertEquals(expected, test.getSubtotal(),0.00000000001f);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.AdminHistoryDTO#setSubtotal(float)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetSubtotal2() {
		AdminHistoryDTO test = new AdminHistoryDTO();
		float expected =  3.4028235E38f;

		test.setSubtotal(expected);

		assertEquals(expected, test.getSubtotal(),0.00000000001f);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.AdminHistoryDTO#setSubtotal(float)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetSubtotal3() {
		AdminHistoryDTO test = new AdminHistoryDTO();
		float expected = 1.4E-45f;

		test.setSubtotal(expected);

		assertEquals(expected, test.getSubtotal(),0.00000000001f);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.AdminHistoryDTO#setSubtotal(float)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetSubtotal4() {
		AdminHistoryDTO test = new AdminHistoryDTO();
		try {
			float SubtotalMin = Integer.parseInt("4.4028235E38f");
			test.setSubtotal(SubtotalMin);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"4.4028235E38f\"");
		}
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.AdminHistoryDTO#setSubtotal(float)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetSubtotal5() {
		AdminHistoryDTO test = new AdminHistoryDTO();
		try {
			float SubtotalMin = Integer.parseInt("-4.4028235E38f");
			test.setSubtotal(SubtotalMin);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-4.4028235E38f\"");
		}
	}










    /**
	 * {@link com.internousdev.kairakutenichiba.dto.AdminHistoryDTO#getQuantities()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetQuantities1() {
		AdminHistoryDTO test = new AdminHistoryDTO();
		int expected = 0;

		test.setQuantities(expected);

		assertEquals(expected, test.getQuantities());
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.AdminHistoryDTO#getQuantities()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetQuantities2() {
		AdminHistoryDTO test = new AdminHistoryDTO();
		int expected = 2147483647;

		test.setQuantities(expected);

		assertEquals(expected, test.getQuantities());
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.AdminHistoryDTO#getQuantities()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetQuantities3() {
		AdminHistoryDTO test = new AdminHistoryDTO();
		int expected = -2147483648;

		test.setQuantities(expected);

		assertEquals(expected, test.getQuantities());
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.AdminHistoryDTO#getQuantities()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetQuantities4() {
		AdminHistoryDTO test = new AdminHistoryDTO();
		try {
			int Purchase_countMin = Integer.parseInt("2147483648");
			test.setQuantities(Purchase_countMin);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.AdminHistoryDTO#getQuantities()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetQuantities5() {
		AdminHistoryDTO test = new AdminHistoryDTO();
		try {
			int Purchase_countMin = Integer.parseInt("-2147483649");
			test.setQuantities(Purchase_countMin);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.AdminHistoryDTO#setQuantities(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetQuantities1() {
		AdminHistoryDTO test = new AdminHistoryDTO();
		int expected = 0;

		test.setQuantities(expected);
		int actual = test.getQuantities();

		assertEquals(expected, actual);
	}


	/**
	 * {@link com.internousdev.kairakutenichiba.dto.AdminHistoryDTO#setQuantities(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetQuantities2() {
		AdminHistoryDTO test = new AdminHistoryDTO();
		int expected = 2147483647;

		test.setQuantities(expected);
		int actual = test.getQuantities();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.AdminHistoryDTO#setQuantities(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetQuantities3() {
		AdminHistoryDTO test = new AdminHistoryDTO();
		int expected = -2147483648;

		test.setQuantities(expected);
		int actual = test.getQuantities();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.AdminHistoryDTO#setQuantities(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetQuantities4() {
		AdminHistoryDTO test = new AdminHistoryDTO();
		try {
			int Purchase_countMax = Integer.parseInt("2147483648");
			test.setQuantities(Purchase_countMax);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.AdminHistoryDTO#setQuantities(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetQuantities5() {
		AdminHistoryDTO test = new AdminHistoryDTO();
		try {
			int Purchase_countMax = Integer.parseInt("-2147483649");
			test.setQuantities(Purchase_countMax);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}




}
