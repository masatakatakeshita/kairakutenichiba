package com.internousdev.kairakutenichiba.dto.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.internousdev.kairakutenichiba.dto.AdminHelpDTO;

public class AdminHelpDTOTest {

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.AdminHelpDTO#getInquiryNo()} のためのテスト・メソッド。
	 */
	@Test
	public void testgetInquiryNo1() {
		AdminHelpDTO test = new AdminHelpDTO();
		int expected = 0;

		test.setInquiryNo(expected);

		assertEquals(expected, test.getInquiryNo());
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.AdminHelpDTO#getInquiryNo()} のためのテスト・メソッド。
	 */
	@Test
	public void testgetInquiryNo2() {
		AdminHelpDTO test = new AdminHelpDTO();
		int expected = 2147483647;

		test.setInquiryNo(expected);

		assertEquals(expected, test.getInquiryNo());
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.AdminHelpDTO#getInquiryNo()} のためのテスト・メソッド。
	 */
	@Test
	public void testgetInquiryNo3() {
		AdminHelpDTO test = new AdminHelpDTO();
		int expected = -2147483648;

		test.setInquiryNo(expected);

		assertEquals(expected, test.getInquiryNo());
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.AdminHelpDTO#getInquiryNo()} のためのテスト・メソッド。
	 */
	@Test
	public void testgetInquiryNo4() {
		AdminHelpDTO test = new AdminHelpDTO();
		try {
			int Purchase_idMin = Integer.parseInt("2147483648");
			test.setInquiryNo(Purchase_idMin);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.AdminHelpDTO#getInquiryNo()} のためのテスト・メソッド。
	 */
	@Test
	public void testgetInquiryNo5() {
		AdminHelpDTO test = new AdminHelpDTO();
		try {
			int Purchase_idMin = Integer.parseInt("-2147483649");
			test.setInquiryNo(Purchase_idMin);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.AdminHelpDTO#setInquiryNo(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testsetInquiryNo1() {
		AdminHelpDTO test = new AdminHelpDTO();
		int expected = 0;

		test.setInquiryNo(expected);
		int actual = test.getInquiryNo();

		assertEquals(expected, actual);
	}


	/**
	 * {@link com.internousdev.kairakutenichiba.dto.AdminHelpDTO#setInquiryNo(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testsetInquiryNo2() {
		AdminHelpDTO test = new AdminHelpDTO();
		int expected = 2147483647;

		test.setInquiryNo(expected);
		int actual = test.getInquiryNo();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.AdminHelpDTO#setInquiryNo(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testsetInquiryNo3() {
		AdminHelpDTO test = new AdminHelpDTO();
		int expected = -2147483648;

		test.setInquiryNo(expected);
		int actual = test.getInquiryNo();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.AdminHelpDTO#setInquiryNo(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testsetInquiryNo4() {
		AdminHelpDTO test = new AdminHelpDTO();
		try {
			int Purchase_idMax = Integer.parseInt("2147483648");
			test.setInquiryNo(Purchase_idMax);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.AdminHelpDTO#setInquiryNo(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testsetInquiryNo5() {
		AdminHelpDTO test = new AdminHelpDTO();
		try {
			int Purchase_idMax = Integer.parseInt("-2147483649");
			test.setInquiryNo(Purchase_idMax);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}









	/**
	 * {@link com.internousdev.kairakutenichiba.dto.AdminHelpDTO#getItemsName()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetItemsName1() {
		AdminHelpDTO test = new AdminHelpDTO();
		String expected = null;

		test.setItemsName(expected);
		String actual = test.getItemsName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.AdminHelpDTO#getItemsName()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetItemsName2() {
		AdminHelpDTO test = new AdminHelpDTO();
		String expected = "";

		test.setItemsName(expected);
		String actual = test.getItemsName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.AdminHelpDTO#getItemsName()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetItemsName3() {
		AdminHelpDTO test = new AdminHelpDTO();
		String expected = " ";

		test.setItemsName(expected);
		String actual = test.getItemsName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.AdminHelpDTO#getItemsName()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetItemsName4() {
		AdminHelpDTO test = new AdminHelpDTO();
		String expected = "　";

		test.setItemsName(expected);
		String actual = test.getItemsName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.AdminHelpDTO#getItemsName()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetItemsName5() {
		AdminHelpDTO test = new AdminHelpDTO();
		String expected = "abc123";

		test.setItemsName(expected);
		String actual = test.getItemsName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.AdminHelpDTO#getItemsName()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetItemsName6() {
		AdminHelpDTO test = new AdminHelpDTO();
		String expected = "あいう１２３";

		test.setItemsName(expected);
		String actual = test.getItemsName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.AdminHelpDTO#getItemsName()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetItemsName7() {
		AdminHelpDTO test = new AdminHelpDTO();
		String expected = "abc123あいう１２３";

		test.setItemsName(expected);
		String actual = test.getItemsName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.AdminHelpDTO#getItemsName()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetItemsName8() {
		AdminHelpDTO test = new AdminHelpDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setItemsName(expected);
		String actual = test.getItemsName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.AdminHelpDTO#setItemsName(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetItemsName1() {
		AdminHelpDTO test = new AdminHelpDTO();
		String expected = null;

		test.setItemsName(expected);
		String actual = test.getItemsName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.AdminHelpDTO#setItemsName(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetItemsName2() {
		AdminHelpDTO test = new AdminHelpDTO();
		String expected = "";

		test.setItemsName(expected);
		String actual = test.getItemsName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.AdminHelpDTO#setItemsName(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetItemsName3() {
		AdminHelpDTO test = new AdminHelpDTO();
		String expected = " ";

		test.setItemsName(expected);
		String actual = test.getItemsName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.AdminHelpDTO#setItemsName(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetItemsName4() {
		AdminHelpDTO test = new AdminHelpDTO();
		String expected = "　";

		test.setItemsName(expected);
		String actual = test.getItemsName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.AdminHelpDTO#setItemsName(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetItemsName5() {
		AdminHelpDTO test = new AdminHelpDTO();
		String expected = "abc123";

		test.setItemsName(expected);
		String actual = test.getItemsName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.AdminHelpDTO#setItemsName(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetItemsName6() {
		AdminHelpDTO test = new AdminHelpDTO();
		String expected = "あいう１２３";

		test.setItemsName(expected);
		String actual = test.getItemsName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.AdminHelpDTO#setItemsName(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetItemsName7() {
		AdminHelpDTO test = new AdminHelpDTO();
		String expected = "abc123あいう１２３";

		test.setItemsName(expected);
		String actual = test.getItemsName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.AdminHelpDTO#setItemsName(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetItemsName8() {
		AdminHelpDTO test = new AdminHelpDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setItemsName(expected);
		String actual = test.getItemsName();

		assertEquals(expected, actual);
	}









	/**
	 * {@link com.internousdev.kairakutenichiba.dto.AdminHelpDTO#getPrice()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetPrice1() {
		AdminHelpDTO test = new AdminHelpDTO();
		float expected = 0f;

		test.setPrice(expected);

		assertEquals(expected, test.getPrice(),0.00000000001f);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.AdminHelpDTO#getPrice()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetPrice2() {
		AdminHelpDTO test = new AdminHelpDTO();
		float expected =  3.4028235E38f;

		test.setPrice(expected);

		assertEquals(expected, test.getPrice(),0.00000000001f);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.AdminHelpDTO#getPrice()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetPrice3() {
		AdminHelpDTO test = new AdminHelpDTO();
		float expected = 1.4E-45f;

		test.setPrice(expected);

		assertEquals(expected, test.getPrice(),0.00000000001f);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.AdminHelpDTO#getPrice()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetPrice4() {
		AdminHelpDTO test = new AdminHelpDTO();
		try {
			float PriceMin = Integer.parseInt("4.4028235E38f");
			test.setPrice(PriceMin);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"4.4028235E38f\"");
		}
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.AdminHelpDTO#getPrice()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetPrice5() {
		AdminHelpDTO test = new AdminHelpDTO();
		try {
			float PriceMin = Integer.parseInt("-4.4028235E38f");
			test.setPrice(PriceMin);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-4.4028235E38f\"");
		}
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.AdminHelpDTO#setPrice(float)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetPrice1() {
		AdminHelpDTO test = new AdminHelpDTO();
		float expected = 0f;

		test.setPrice(expected);

		assertEquals(expected, test.getPrice(),0.00000000001f);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.AdminHelpDTO#setPrice(float)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetPrice2() {
		AdminHelpDTO test = new AdminHelpDTO();
		float expected =  3.4028235E38f;

		test.setPrice(expected);

		assertEquals(expected, test.getPrice(),0.00000000001f);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.AdminHelpDTO#setPrice(float)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetPrice3() {
		AdminHelpDTO test = new AdminHelpDTO();
		float expected = 1.4E-45f;

		test.setPrice(expected);

		assertEquals(expected, test.getPrice(),0.00000000001f);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.AdminHelpDTO#setPrice(float)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetPrice4() {
		AdminHelpDTO test = new AdminHelpDTO();
		try {
			float PriceMin = Integer.parseInt("4.4028235E38f");
			test.setPrice(PriceMin);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"4.4028235E38f\"");
		}
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.AdminHelpDTO#setPrice(float)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetPrice5() {
		AdminHelpDTO test = new AdminHelpDTO();
		try {
			float PriceMin = Integer.parseInt("-4.4028235E38f");
			test.setPrice(PriceMin);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-4.4028235E38f\"");
		}
	}











    /**
	 * {@link com.internousdev.kairakutenichiba.dto.AdminHelpDTO#getItemId()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetItemId1() {
		AdminHelpDTO test = new AdminHelpDTO();
		int expected = 0;

		test.setItemId(expected);

		assertEquals(expected, test.getItemId());
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.AdminHelpDTO#getItemId()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetItemId2() {
		AdminHelpDTO test = new AdminHelpDTO();
		int expected = 2147483647;

		test.setItemId(expected);

		assertEquals(expected, test.getItemId());
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.AdminHelpDTO#getItemId()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetItemId3() {
		AdminHelpDTO test = new AdminHelpDTO();
		int expected = -2147483648;

		test.setItemId(expected);

		assertEquals(expected, test.getItemId());
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.AdminHelpDTO#getItemId()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetItemId4() {
		AdminHelpDTO test = new AdminHelpDTO();
		try {
			int Purchase_idMin = Integer.parseInt("2147483648");
			test.setItemId(Purchase_idMin);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.AdminHelpDTO#getItemId()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetItemId5() {
		AdminHelpDTO test = new AdminHelpDTO();
		try {
			int Purchase_idMin = Integer.parseInt("-2147483649");
			test.setItemId(Purchase_idMin);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.AdminHelpDTO#setItemId(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetItemId1() {
		AdminHelpDTO test = new AdminHelpDTO();
		int expected = 0;

		test.setItemId(expected);
		int actual = test.getItemId();

		assertEquals(expected, actual);
	}


	/**
	 * {@link com.internousdev.kairakutenichiba.dto.AdminHelpDTO#setItemId(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetItemId2() {
		AdminHelpDTO test = new AdminHelpDTO();
		int expected = 2147483647;

		test.setItemId(expected);
		int actual = test.getItemId();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.AdminHelpDTO#setItemId(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetItemId3() {
		AdminHelpDTO test = new AdminHelpDTO();
		int expected = -2147483648;

		test.setItemId(expected);
		int actual = test.getItemId();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.AdminHelpDTO#setItemId(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetItemId4() {
		AdminHelpDTO test = new AdminHelpDTO();
		try {
			int Purchase_idMax = Integer.parseInt("2147483648");
			test.setItemId(Purchase_idMax);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.AdminHelpDTO#setItemId(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetItemId5() {
		AdminHelpDTO test = new AdminHelpDTO();
		try {
			int Purchase_idMax = Integer.parseInt("-2147483649");
			test.setItemId(Purchase_idMax);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}












	/**
	 * {@link com.internousdev.kairakutenichiba.dto.AdminHelpDTO#getCreatedAt()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetCreatedAt1() {
		AdminHelpDTO test = new AdminHelpDTO();
		String expected = null;

		test.setCreatedAt(expected);
		String actual = test.getCreatedAt();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.AdminHelpDTO#getCreatedAt()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetCreatedAt2() {
		AdminHelpDTO test = new AdminHelpDTO();
		String expected = "";

		test.setCreatedAt(expected);
		String actual = test.getCreatedAt();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.AdminHelpDTO#getCreatedAt()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetCreatedAt3() {
		AdminHelpDTO test = new AdminHelpDTO();
		String expected = " ";

		test.setCreatedAt(expected);
		String actual = test.getCreatedAt();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.AdminHelpDTO#getCreatedAt()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetCreatedAt4() {
		AdminHelpDTO test = new AdminHelpDTO();
		String expected = "　";

		test.setCreatedAt(expected);
		String actual = test.getCreatedAt();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.AdminHelpDTO#getCreatedAt()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetCreatedAt5() {
		AdminHelpDTO test = new AdminHelpDTO();
		String expected = "abc123";

		test.setCreatedAt(expected);
		String actual = test.getCreatedAt();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.AdminHelpDTO#getCreatedAt()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetCreatedAt6() {
		AdminHelpDTO test = new AdminHelpDTO();
		String expected = "あいう１２３";

		test.setCreatedAt(expected);
		String actual = test.getCreatedAt();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.AdminHelpDTO#getCreatedAt()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetCreatedAt7() {
		AdminHelpDTO test = new AdminHelpDTO();
		String expected = "abc123あいう１２３";

		test.setCreatedAt(expected);
		String actual = test.getCreatedAt();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.AdminHelpDTO#getCreatedAt()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetCreatedAt8() {
		AdminHelpDTO test = new AdminHelpDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setCreatedAt(expected);
		String actual = test.getCreatedAt();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.AdminHelpDTO#setCreatedAt(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetCreatedAt1() {
		AdminHelpDTO test = new AdminHelpDTO();
		String expected = null;

		test.setCreatedAt(expected);
		String actual = test.getCreatedAt();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.AdminHelpDTO#setCreatedAt(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetCreatedAt2() {
		AdminHelpDTO test = new AdminHelpDTO();
		String expected = "";

		test.setCreatedAt(expected);
		String actual = test.getCreatedAt();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.AdminHelpDTO#setCreatedAt(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetCreatedAt3() {
		AdminHelpDTO test = new AdminHelpDTO();
		String expected = " ";

		test.setCreatedAt(expected);
		String actual = test.getCreatedAt();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.AdminHelpDTO#setCreatedAt(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetCreatedAt4() {
		AdminHelpDTO test = new AdminHelpDTO();
		String expected = "　";

		test.setCreatedAt(expected);
		String actual = test.getCreatedAt();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.AdminHelpDTO#setCreatedAt(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetCreatedAt5() {
		AdminHelpDTO test = new AdminHelpDTO();
		String expected = "abc123";

		test.setCreatedAt(expected);
		String actual = test.getCreatedAt();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.AdminHelpDTO#setCreatedAt(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetCreatedAt6() {
		AdminHelpDTO test = new AdminHelpDTO();
		String expected = "あいう１２３";

		test.setCreatedAt(expected);
		String actual = test.getCreatedAt();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.AdminHelpDTO#setCreatedAt(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetCreatedAt7() {
		AdminHelpDTO test = new AdminHelpDTO();
		String expected = "abc123あいう１２３";

		test.setCreatedAt(expected);
		String actual = test.getCreatedAt();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.AdminHelpDTO#setCreatedAt(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetCreatedAt8() {
		AdminHelpDTO test = new AdminHelpDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setCreatedAt(expected);
		String actual = test.getCreatedAt();

		assertEquals(expected, actual);
	}









    /**
	 * {@link com.internousdev.kairakutenichiba.dto.AdminHelpDTO#getSubtotal()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetSubtotal1() {
		AdminHelpDTO test = new AdminHelpDTO();
		float expected = 0f;

		test.setSubtotal(expected);

		assertEquals(expected, test.getSubtotal(),0.00000000001f);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.AdminHelpDTO#getSubtotal()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetSubtotal2() {
		AdminHelpDTO test = new AdminHelpDTO();
		float expected =  3.4028235E38f;

		test.setSubtotal(expected);

		assertEquals(expected, test.getSubtotal(),0.00000000001f);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.AdminHelpDTO#getSubtotal()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetSubtotal3() {
		AdminHelpDTO test = new AdminHelpDTO();
		float expected = 1.4E-45f;

		test.setSubtotal(expected);

		assertEquals(expected, test.getSubtotal(),0.00000000001f);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.AdminHelpDTO#getSubtotal()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetSubtotal4() {
		AdminHelpDTO test = new AdminHelpDTO();
		try {
			float SubtotalMin = Integer.parseInt("4.4028235E38f");
			test.setSubtotal(SubtotalMin);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"4.4028235E38f\"");
		}
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.AdminHelpDTO#getSubtotal()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetSubtotal5() {
		AdminHelpDTO test = new AdminHelpDTO();
		try {
			float SubtotalMin = Integer.parseInt("-4.4028235E38f");
			test.setSubtotal(SubtotalMin);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-4.4028235E38f\"");
		}
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.AdminHelpDTO#setSubtotal(float)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetSubtotal1() {
		AdminHelpDTO test = new AdminHelpDTO();
		float expected = 0f;

		test.setSubtotal(expected);

		assertEquals(expected, test.getSubtotal(),0.00000000001f);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.AdminHelpDTO#setSubtotal(float)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetSubtotal2() {
		AdminHelpDTO test = new AdminHelpDTO();
		float expected =  3.4028235E38f;

		test.setSubtotal(expected);

		assertEquals(expected, test.getSubtotal(),0.00000000001f);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.AdminHelpDTO#setSubtotal(float)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetSubtotal3() {
		AdminHelpDTO test = new AdminHelpDTO();
		float expected = 1.4E-45f;

		test.setSubtotal(expected);

		assertEquals(expected, test.getSubtotal(),0.00000000001f);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.AdminHelpDTO#setSubtotal(float)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetSubtotal4() {
		AdminHelpDTO test = new AdminHelpDTO();
		try {
			float SubtotalMin = Integer.parseInt("4.4028235E38f");
			test.setSubtotal(SubtotalMin);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"4.4028235E38f\"");
		}
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.AdminHelpDTO#setSubtotal(float)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetSubtotal5() {
		AdminHelpDTO test = new AdminHelpDTO();
		try {
			float SubtotalMin = Integer.parseInt("-4.4028235E38f");
			test.setSubtotal(SubtotalMin);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-4.4028235E38f\"");
		}
	}










    /**
	 * {@link com.internousdev.kairakutenichiba.dto.AdminHelpDTO#getQuantities()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetQuantities1() {
		AdminHelpDTO test = new AdminHelpDTO();
		int expected = 0;

		test.setQuantities(expected);

		assertEquals(expected, test.getQuantities());
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.AdminHelpDTO#getQuantities()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetQuantities2() {
		AdminHelpDTO test = new AdminHelpDTO();
		int expected = 2147483647;

		test.setQuantities(expected);

		assertEquals(expected, test.getQuantities());
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.AdminHelpDTO#getQuantities()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetQuantities3() {
		AdminHelpDTO test = new AdminHelpDTO();
		int expected = -2147483648;

		test.setQuantities(expected);

		assertEquals(expected, test.getQuantities());
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.AdminHelpDTO#getQuantities()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetQuantities4() {
		AdminHelpDTO test = new AdminHelpDTO();
		try {
			int Purchase_countMin = Integer.parseInt("2147483648");
			test.setQuantities(Purchase_countMin);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.AdminHelpDTO#getQuantities()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetQuantities5() {
		AdminHelpDTO test = new AdminHelpDTO();
		try {
			int Purchase_countMin = Integer.parseInt("-2147483649");
			test.setQuantities(Purchase_countMin);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.AdminHelpDTO#setQuantities(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetQuantities1() {
		AdminHelpDTO test = new AdminHelpDTO();
		int expected = 0;

		test.setQuantities(expected);
		int actual = test.getQuantities();

		assertEquals(expected, actual);
	}


	/**
	 * {@link com.internousdev.kairakutenichiba.dto.AdminHelpDTO#setQuantities(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetQuantities2() {
		AdminHelpDTO test = new AdminHelpDTO();
		int expected = 2147483647;

		test.setQuantities(expected);
		int actual = test.getQuantities();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.AdminHelpDTO#setQuantities(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetQuantities3() {
		AdminHelpDTO test = new AdminHelpDTO();
		int expected = -2147483648;

		test.setQuantities(expected);
		int actual = test.getQuantities();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.AdminHelpDTO#setQuantities(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetQuantities4() {
		AdminHelpDTO test = new AdminHelpDTO();
		try {
			int Purchase_countMax = Integer.parseInt("2147483648");
			test.setQuantities(Purchase_countMax);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.AdminHelpDTO#setQuantities(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetQuantities5() {
		AdminHelpDTO test = new AdminHelpDTO();
		try {
			int Purchase_countMax = Integer.parseInt("-2147483649");
			test.setQuantities(Purchase_countMax);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}




}
