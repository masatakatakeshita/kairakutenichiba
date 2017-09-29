package com.internousdev.kairakutenichiba.dto.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.internousdev.kairakutenichiba.dto.ItemDTO;



public class ItemDTOTest {




	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#getItem_name()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetItem_name1() {
		ItemDTO test = new ItemDTO();
		String expected = null;

		test.setItem_name(expected);
		String actual = test.getItem_name();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#getItem_name()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetItem_name2() {
		ItemDTO test = new ItemDTO();
		String expected = "";

		test.setItem_name(expected);
		String actual = test.getItem_name();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#getItem_name()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetItem_name3() {
		ItemDTO test = new ItemDTO();
		String expected = " ";

		test.setItem_name(expected);
		String actual = test.getItem_name();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#getItem_name()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetItem_name4() {
		ItemDTO test = new ItemDTO();
		String expected = "　";

		test.setItem_name(expected);
		String actual = test.getItem_name();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#getItem_name()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetItem_name5() {
		ItemDTO test = new ItemDTO();
		String expected = "abc123";

		test.setItem_name(expected);
		String actual = test.getItem_name();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#getItem_name()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetItem_name6() {
		ItemDTO test = new ItemDTO();
		String expected = "あいう１２３";

		test.setItem_name(expected);
		String actual = test.getItem_name();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#getItem_name()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetItem_name7() {
		ItemDTO test = new ItemDTO();
		String expected = "abc123あいう１２３";

		test.setItem_name(expected);
		String actual = test.getItem_name();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#getItem_name()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetItem_name8() {
		ItemDTO test = new ItemDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setItem_name(expected);
		String actual = test.getItem_name();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#setItem_name(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetItem_name1() {
		ItemDTO test = new ItemDTO();
		String expected = null;

		test.setItem_name(expected);
		String actual = test.getItem_name();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#setItem_name(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetItem_name2() {
		ItemDTO test = new ItemDTO();
		String expected = "";

		test.setItem_name(expected);
		String actual = test.getItem_name();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#setItem_name(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetItem_name3() {
		ItemDTO test = new ItemDTO();
		String expected = " ";

		test.setItem_name(expected);
		String actual = test.getItem_name();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#setItem_name(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetItem_name4() {
		ItemDTO test = new ItemDTO();
		String expected = "　";

		test.setItem_name(expected);
		String actual = test.getItem_name();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#setItem_name(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetItem_name5() {
		ItemDTO test = new ItemDTO();
		String expected = "abc123";

		test.setItem_name(expected);
		String actual = test.getItem_name();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#setItem_name(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetItem_name6() {
		ItemDTO test = new ItemDTO();
		String expected = "あいう１２３";

		test.setItem_name(expected);
		String actual = test.getItem_name();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#setItem_name(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetItem_name7() {
		ItemDTO test = new ItemDTO();
		String expected = "abc123あいう１２３";

		test.setItem_name(expected);
		String actual = test.getItem_name();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#setItem_name(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetItem_name8() {
		ItemDTO test = new ItemDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setItem_name(expected);
		String actual = test.getItem_name();

		assertEquals(expected, actual);

	}





	/**
	 *  {@link com.internousdev.kairakutenichiba.dto.ItemDTO#getItem_id()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetItem_id1() {
		ItemDTO test = new ItemDTO();
		int expected = 0;

		test.setItem_id(expected);

		assertEquals(expected, test.getItem_id());
	}

	/**
	 *  {@link com.internousdev.kairakutenichiba.dto.ItemDTO#getItem_id()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetItem_id2() {
		ItemDTO test = new ItemDTO();
		int expected = 2147483647;

		test.setItem_id(expected);

		assertEquals(expected, test.getItem_id());
	}

	/**
	 *  {@link com.internousdev.kairakutenichiba.dto.ItemDTO#getItem_id()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetItem_id3() {
		ItemDTO test = new ItemDTO();
		int expected = -2147483648;

		test.setItem_id(expected);

		assertEquals(expected, test.getItem_id());
	}

	/**
	 *  {@link com.internousdev.kairakutenichiba.dto.ItemDTO#getItem_id()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetItem_id4() {
		ItemDTO test = new ItemDTO();
		try {
			int Item_idMax = Integer.parseInt("2147483648");
			test.setItem_id(Item_idMax);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	/**
	 *  {@link com.internousdev.kairakutenichiba.dto.ItemDTO#getItem_id()} のためのテスト・メソッド。
	 */
	@Test
	public void testItem_id5() {
		ItemDTO test = new ItemDTO();
		try {
			int Item_idMin = Integer.parseInt("-2147483649");
			test.setItem_id(Item_idMin);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#setItem_id(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetItem_id1() {
		ItemDTO test = new ItemDTO();
		int expected = 0;

		test.setItem_id(expected);
		int actual = test.getItem_id();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#setItem_id(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetItem_id2() {
		ItemDTO test = new ItemDTO();
		int expected = 2147483647;

		test.setItem_id(expected);
		int actual = test.getItem_id();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#setItem_id(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetItem_id3() {
		ItemDTO test = new ItemDTO();
		int expected = -2147483648;

		test.setItem_id(expected);
		int actual = test.getItem_id();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#setItem_id(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetItem_id4() {
		ItemDTO test = new ItemDTO();
		try {
			int Item_idMax = Integer.parseInt("2147483648");
			test.setItem_id(Item_idMax);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#setItem_id(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetItem_id5() {
		ItemDTO test = new ItemDTO();
		try {
			int Item_idMin = Integer.parseInt("-2147483649");
			test.setItem_id(Item_idMin);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}

	}
//-----------------------------------------------------


	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#getPrice()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetPrice1() {
		ItemDTO test = new ItemDTO();
		float expected = 0f;

		test.setPrice(expected);

		assertEquals(expected, test.getPrice(),0.00000000001f);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#getPrice()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetPrice2() {
		ItemDTO test = new ItemDTO();
		float expected =  3.4028235E38f;//3.4x(10の38乗)

		test.setPrice(expected);

		assertEquals(expected, test.getPrice(),0.00000000001f);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#getPrice()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetPrice3() {
		ItemDTO test = new ItemDTO();
		float expected = 1.4E-45f;//1.4x(10の-45乗)

		test.setPrice(expected);

		assertEquals(expected, test.getPrice(),0.00000000001f);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#getPrice()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetPrice4() {
		ItemDTO test = new ItemDTO();
		try {
			float PriceMax = Integer.parseInt("4.4028235E38f");
			test.setPrice(PriceMax);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"4.4028235E38f\"");
		}
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#getPrice()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetPrice5() {
		ItemDTO test = new ItemDTO();
		try {
			float PriceMin = Integer.parseInt("-4.4028235E38f");
			test.setPrice(PriceMin);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-4.4028235E38f\"");
		}
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#setPrice(float)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetPrice1() {
		ItemDTO test = new ItemDTO();
		float expected = 0f;

		test.setPrice(expected);

		assertEquals(expected, test.getPrice(),0.00000000001f);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#setPrice(float)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetPrice2() {
		ItemDTO test = new ItemDTO();
		float expected =  3.4028235E38f;

		test.setPrice(expected);

		assertEquals(expected, test.getPrice(),0.00000000001f);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#setPrice(float)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetPrice3() {
		ItemDTO test = new ItemDTO();
		float expected = 1.4E-45f;

		test.setPrice(expected);

		assertEquals(expected, test.getPrice(),0.00000000001f);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#setPrice(float)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetPrice4() {
		ItemDTO test = new ItemDTO();
		try {
			float PriceMin = Integer.parseInt("4.4028235E38f");
			test.setPrice(PriceMin);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"4.4028235E38f\"");
		}
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#setPrice(float)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetPrice5() {
		ItemDTO test = new ItemDTO();
		try {
			float PriceMin = Integer.parseInt("-4.4028235E38f");
			test.setPrice(PriceMin);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-4.4028235E38f\"");
		}
	}




	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#getPrice()} のためのテスト・メソッド。
	 */
	@Test
	public void testPriceyen1() {
		ItemDTO test = new ItemDTO();
		int expected = 0;

		test.setPriceyen(expected);

		assertEquals(expected, test.getPriceyen());
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#getPrice()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetPriceyen2() {
		ItemDTO test = new ItemDTO();
		int expected =  2147483647;

		test.setPrice(expected);

		assertEquals(expected, test.getPriceyen());
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#getPrice()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetPriceyen3() {
		ItemDTO test = new ItemDTO();
		int expected = -2147483648;

		test.setPriceyen(expected);

		assertEquals(expected, test.getPriceyen());
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#getPrice()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetPriceyen4() {
		ItemDTO test = new ItemDTO();
		try {
			int PriceyenMax = Integer.parseInt("2147483648");
			test.setPrice(PriceyenMax);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#getPrice()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetPriceyen5() {
		ItemDTO test = new ItemDTO();
		try {
			int PriceyenMin = Integer.parseInt("-2147483649");
			test.setPrice(PriceyenMin);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#setPrice(float)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetPriceyen1() {
		ItemDTO test = new ItemDTO();
		int expected = 0;

		test.setPriceyen(expected);
		int actual = test.getPriceyen();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#setPrice(float)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetPriceyen2() {
		ItemDTO test = new ItemDTO();
		int expected = 2147483647;

		test.setPriceyen(expected);
		int actual = test.getPriceyen();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#setPrice(float)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetPriceyen3() {
		ItemDTO test = new ItemDTO();
		int expected =  -2147483648;

		test.setPriceyen(expected);
		int actual = test.getPriceyen();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#setPrice(float)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetPriceyen4() {
		ItemDTO test = new ItemDTO();
		try {
			int PriceyenMin = Integer.parseInt("2147483648");
			test.setPrice(PriceyenMin);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#setPrice(float)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetPriceyen5() {
		ItemDTO test = new ItemDTO();
		try {
			int PriceyenMin = Integer.parseInt("-2147483649");
			test.setPrice(PriceyenMin);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}









	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#getRelease_day()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetRelease_day1() {
		ItemDTO test = new ItemDTO();
		String expected = null;

		test.setRelease_day(expected);
		String actual = test.getRelease_day();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#getRelease_day()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetRelease_day2() {
		ItemDTO test = new ItemDTO();
		String expected = "";

		test.setRelease_day(expected);
		String actual = test.getRelease_day();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#getRelease_day()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetRelease_day3() {
		ItemDTO test = new ItemDTO();
		String expected = " ";

		test.setRelease_day(expected);
		String actual = test.getRelease_day();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#getRelease_day()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetRelease_day4() {
		ItemDTO test = new ItemDTO();
		String expected = "";

		test.setRelease_day(expected);
		String actual = test.getRelease_day();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#getRelease_day()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetRelease_day5() {
		ItemDTO test = new ItemDTO();
		String expected = "abc123";

		test.setRelease_day(expected);
		String actual = test.getRelease_day();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#getRelease_day()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetRelease_day6() {
		ItemDTO test = new ItemDTO();
		String expected = "あいう１２３";

		test.setRelease_day(expected);
		String actual = test.getRelease_day();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#getRelease_day()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetRelease_day7() {
		ItemDTO test = new ItemDTO();
		String expected = "abc123あいう１２３";

		test.setRelease_day(expected);
		String actual = test.getRelease_day();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#getRelease_day()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetRelease_day8() {
		ItemDTO test = new ItemDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setRelease_day(expected);
		String actual = test.getRelease_day();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#setRelease_day(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetRelease_day1() {
		ItemDTO test = new ItemDTO();
		String expected = null;

		test.setRelease_day(expected);
		String actual = test.getRelease_day();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#setRelease_day(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetRelease_day2() {
		ItemDTO test = new ItemDTO();
		String expected = "";

		test.setRelease_day(expected);
		String actual = test.getRelease_day();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#setRelease_day(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetRelease_day3() {
		ItemDTO test = new ItemDTO();
		String expected = " ";

		test.setRelease_day(expected);
		String actual = test.getRelease_day();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#setRelease_day(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetRelease_day4() {
		ItemDTO test = new ItemDTO();
		String expected = "　";

		test.setRelease_day(expected);
		String actual = test.getRelease_day();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#setRelease_day(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetRelease_day5() {
		ItemDTO test = new ItemDTO();
		String expected = "abc123";

		test.setRelease_day(expected);
		String actual = test.getRelease_day();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#setRelease_day(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetRelease_day6() {
		ItemDTO test = new ItemDTO();
		String expected = "あいう１２３";

		test.setRelease_day(expected);
		String actual = test.getRelease_day();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#setRelease_day(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetRelease_day7() {
		ItemDTO test = new ItemDTO();
		String expected = "abc123あいう１２３";

		test.setRelease_day(expected);
		String actual = test.getRelease_day();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#setRelease_day(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetRelease_day8() {
		ItemDTO test = new ItemDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setRelease_day(expected);
		String actual = test.getRelease_day();

		assertEquals(expected, actual);

	}



	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#getAuthor()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetAuthor1() {
		ItemDTO test = new ItemDTO();
		String expected = null;

		test.setAuthor(expected);
		String actual = test.getAuthor();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#getAuthor()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetAuthor2() {
		ItemDTO test = new ItemDTO();
		String expected = "";

		test.setAuthor(expected);
		String actual = test.getAuthor();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#getAuthor()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetAuthor3() {
		ItemDTO test = new ItemDTO();
		String expected = " ";

		test.setAuthor(expected);
		String actual = test.getAuthor();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#getAuthor()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetAuthor4() {
		ItemDTO test = new ItemDTO();
		String expected = "";

		test.setAuthor(expected);
		String actual = test.getAuthor();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#getAuthor()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetAuthor5() {
		ItemDTO test = new ItemDTO();
		String expected = "abc123";

		test.setAuthor(expected);
		String actual = test.getAuthor();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#getAuthor()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetAuthor6() {
		ItemDTO test = new ItemDTO();
		String expected = "あいう１２３";

		test.setAuthor(expected);
		String actual = test.getAuthor();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#getAuthor()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetAuthor7() {
		ItemDTO test = new ItemDTO();
		String expected = "abc123あいう１２３";

		test.setAuthor(expected);
		String actual = test.getAuthor();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#getAuthor()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetAuthor8() {
		ItemDTO test = new ItemDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setAuthor(expected);
		String actual = test.getAuthor();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#setAuthor(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetAuthor1() {
		ItemDTO test = new ItemDTO();
		String expected = null;

		test.setAuthor(expected);
		String actual = test.getAuthor();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#setAuthor(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetAuthor2() {
		ItemDTO test = new ItemDTO();
		String expected = "";

		test.setAuthor(expected);
		String actual = test.getAuthor();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#setAuthor(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetAuthor3() {
		ItemDTO test = new ItemDTO();
		String expected = " ";

		test.setAuthor(expected);
		String actual = test.getAuthor();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#setAuthor(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetAuthor4() {
		ItemDTO test = new ItemDTO();
		String expected = "　";

		test.setAuthor(expected);
		String actual = test.getAuthor();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#setAuthor(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetAuthor5() {
		ItemDTO test = new ItemDTO();
		String expected = "abc123";

		test.setAuthor(expected);
		String actual = test.getAuthor();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#setAuthor(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetAuthor6() {
		ItemDTO test = new ItemDTO();
		String expected = "あいう１２３";

		test.setAuthor(expected);
		String actual = test.getAuthor();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#setAuthor(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetAuthor7() {
		ItemDTO test = new ItemDTO();
		String expected = "abc123あいう１２３";

		test.setAuthor(expected);
		String actual = test.getAuthor();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#setAuthor(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetAuthor8() {
		ItemDTO test = new ItemDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setAuthor(expected);
		String actual = test.getAuthor();

		assertEquals(expected, actual);

	}


	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#getPublisher()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetPublisher1() {
		ItemDTO test = new ItemDTO();
		String expected = null;

		test.setPublisher(expected);
		String actual = test.getPublisher();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#getPublisher()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetPublisher2() {
		ItemDTO test = new ItemDTO();
		String expected = "";

		test.setPublisher(expected);
		String actual = test.getPublisher();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#getPublisher()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetPublisher3() {
		ItemDTO test = new ItemDTO();
		String expected = " ";

		test.setPublisher(expected);
		String actual = test.getPublisher();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#getPublisher()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetPublisher4() {
		ItemDTO test = new ItemDTO();
		String expected = "";

		test.setPublisher(expected);
		String actual = test.getPublisher();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#getPublisher()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetPublisher5() {
		ItemDTO test = new ItemDTO();
		String expected = "abc123";

		test.setPublisher(expected);
		String actual = test.getPublisher();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#getPublisher()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetPublisher6() {
		ItemDTO test = new ItemDTO();
		String expected = "あいう１２３";

		test.setPublisher(expected);
		String actual = test.getPublisher();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#getPublisher()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetPublisher7() {
		ItemDTO test = new ItemDTO();
		String expected = "abc123あいう１２３";

		test.setPublisher(expected);
		String actual = test.getPublisher();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#getPublisher()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetPublisher8() {
		ItemDTO test = new ItemDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setPublisher(expected);
		String actual = test.getPublisher();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#setPublisher(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetPublisher1() {
		ItemDTO test = new ItemDTO();
		String expected = null;

		test.setPublisher(expected);
		String actual = test.getPublisher();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#setPublisher(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetPublisher2() {
		ItemDTO test = new ItemDTO();
		String expected = "";

		test.setPublisher(expected);
		String actual = test.getPublisher();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#setPublisher(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetPublisher3() {
		ItemDTO test = new ItemDTO();
		String expected = " ";

		test.setPublisher(expected);
		String actual = test.getPublisher();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#setPublisher(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetPublisher4() {
		ItemDTO test = new ItemDTO();
		String expected = "　";

		test.setPublisher(expected);
		String actual = test.getPublisher();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#setPublisher(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetPublisher5() {
		ItemDTO test = new ItemDTO();
		String expected = "abc123";

		test.setPublisher(expected);
		String actual = test.getPublisher();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#setPublisher(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetPublisher6() {
		ItemDTO test = new ItemDTO();
		String expected = "あいう１２３";

		test.setPublisher(expected);
		String actual = test.getPublisher();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#setPublisher(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetPublisher7() {
		ItemDTO test = new ItemDTO();
		String expected = "abc123あいう１２３";

		test.setPublisher(expected);
		String actual = test.getPublisher();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#setPublisher(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetPublisher8() {
		ItemDTO test = new ItemDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setPublisher(expected);
		String actual = test.getPublisher();

		assertEquals(expected, actual);

	}



	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#getPublish_type()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetPublish_type1() {
		ItemDTO test = new ItemDTO();
		String expected = null;

		test.setPublish_type(expected);
		String actual = test.getPublish_type();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#getPublish_type()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetPublish_type2() {
		ItemDTO test = new ItemDTO();
		String expected = "";

		test.setPublish_type(expected);
		String actual = test.getPublish_type();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#getPublish_type()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetPublish_type3() {
		ItemDTO test = new ItemDTO();
		String expected = " ";

		test.setPublish_type(expected);
		String actual = test.getPublish_type();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#getPublish_type()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetPublish_type4() {
		ItemDTO test = new ItemDTO();
		String expected = "";

		test.setPublish_type(expected);
		String actual = test.getPublish_type();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#getPublish_type()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetPublish_type5() {
		ItemDTO test = new ItemDTO();
		String expected = "abc123";

		test.setPublish_type(expected);
		String actual = test.getPublish_type();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#getPublish_type()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetPublish_type6() {
		ItemDTO test = new ItemDTO();
		String expected = "あいう１２３";

		test.setPublish_type(expected);
		String actual = test.getPublish_type();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#getPublish_type()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetPublish_type7() {
		ItemDTO test = new ItemDTO();
		String expected = "abc123あいう１２３";

		test.setPublish_type(expected);
		String actual = test.getPublish_type();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#getPublish_type()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetPublish_type8() {
		ItemDTO test = new ItemDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setPublish_type(expected);
		String actual = test.getPublish_type();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#setPublish_type(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetPublish_type1() {
		ItemDTO test = new ItemDTO();
		String expected = null;

		test.setPublish_type(expected);
		String actual = test.getPublish_type();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#setPublish_type(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetPublish_type2() {
		ItemDTO test = new ItemDTO();
		String expected = "";

		test.setPublish_type(expected);
		String actual = test.getPublish_type();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#setPublish_type(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetPublish_type3() {
		ItemDTO test = new ItemDTO();
		String expected = " ";

		test.setPublish_type(expected);
		String actual = test.getPublish_type();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#setPublish_type(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetPublish_type4() {
		ItemDTO test = new ItemDTO();
		String expected = "　";

		test.setPublish_type(expected);
		String actual = test.getPublish_type();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#setPublish_type(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetPublish_type5() {
		ItemDTO test = new ItemDTO();
		String expected = "abc123";

		test.setPublish_type(expected);
		String actual = test.getPublish_type();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#setPublish_type(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetPublish_type6() {
		ItemDTO test = new ItemDTO();
		String expected = "あいう１２３";

		test.setPublish_type(expected);
		String actual = test.getPublish_type();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#setPublish_type(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetPublish_type7() {
		ItemDTO test = new ItemDTO();
		String expected = "abc123あいう１２３";

		test.setPublish_type(expected);
		String actual = test.getPublish_type();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#setPublish_type(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetPublish_type8() {
		ItemDTO test = new ItemDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setPublish_type(expected);
		String actual = test.getPublish_type();

		assertEquals(expected, actual);

	}



	public void testGetPages1() {
		ItemDTO test = new ItemDTO();
		int expected = 0;

		test.setPages(expected);

		assertEquals(expected, test.getPages());
	}

	/**
	 *  {@link com.internousdev.kairakutenichiba.dto.ItemDTO#getPages()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetPages2() {
		ItemDTO test = new ItemDTO();
		int expected = 2147483647;

		test.setPages(expected);

		assertEquals(expected, test.getPages());
	}

	/**
	 *  {@link com.internousdev.kairakutenichiba.dto.ItemDTO#getPages()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetPages3() {
		ItemDTO test = new ItemDTO();
		int expected = -2147483648;

		test.setPages(expected);

		assertEquals(expected, test.getPages());
	}

	/**
	 *  {@link com.internousdev.kairakutenichiba.dto.ItemDTO#getPages()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetPages4() {
		ItemDTO test = new ItemDTO();
		try {
			int PagesMax = Integer.parseInt("2147483648");
			test.setPages(PagesMax);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	/**
	 *  {@link com.internousdev.kairakutenichiba.dto.ItemDTO#getPages()} のためのテスト・メソッド。
	 */
	@Test
	public void testPages5() {
		ItemDTO test = new ItemDTO();
		try {
			int PagesMin = Integer.parseInt("-2147483649");
			test.setPages(PagesMin);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#setPages(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetPages1() {
		ItemDTO test = new ItemDTO();
		int expected = 0;

		test.setPages(expected);
		int actual = test.getPages();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#setPages(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetPages2() {
		ItemDTO test = new ItemDTO();
		int expected = 2147483647;

		test.setPages(expected);
		int actual = test.getPages();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#setPages(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetPages3() {
		ItemDTO test = new ItemDTO();
		int expected = -2147483648;

		test.setPages(expected);
		int actual = test.getPages();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#setPages(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetPages4() {
		ItemDTO test = new ItemDTO();
		try {
			int PagesMax = Integer.parseInt("2147483648");
			test.setPages(PagesMax);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#setPages(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetPages5() {
		ItemDTO test = new ItemDTO();
		try {
			int PagesMin = Integer.parseInt("-2147483649");
			test.setPages(PagesMin);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}

	}


	/**
	 *  {@link com.internousdev.kairakutenichiba.dto.ItemDTO#getIsbn()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetIsbn1() {
		ItemDTO test = new ItemDTO();
		long expected = 0;

		test.setIsbn(expected);

		assertEquals(expected, test.getIsbn());
	}

	/**
	 *  {@link com.internousdev.kairakutenichiba.dto.ItemDTO#getIsbn()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetIsbn2() {
		ItemDTO test = new ItemDTO();
		long expected = 9223372036854775807l;

		test.setIsbn(expected);

		assertEquals(expected, test.getIsbn());
	}

	/**
	 *  {@link com.internousdev.kairakutenichiba.dto.ItemDTO#getIsbn()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetIsbn3() {
		ItemDTO test = new ItemDTO();
		long expected =  -9223372036854775808l;

		test.setIsbn(expected);

		assertEquals(expected, test.getIsbn());
	}

	/**
	 *  {@link com.internousdev.kairakutenichiba.dto.ItemDTO#getIsbn()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetIsbn4() {
		ItemDTO test = new ItemDTO();
		try {
			long IsbnMax = Integer.parseInt("9223372036854775808l");
			test.setIsbn(IsbnMax);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"9223372036854775808l\"");
		}
	}

	/**
	 *  {@link com.internousdev.kairakutenichiba.dto.ItemDTO#getIsbn()} のためのテスト・メソッド。
	 */
	@Test
	public void testIsbn5() {
		ItemDTO test = new ItemDTO();
		try {
			long IsbnMin = Integer.parseInt("-9223372036854775809l");
			test.setIsbn(IsbnMin);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-9223372036854775809l\"");
		}
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#setIsbn(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetIsbn1() {
		ItemDTO test = new ItemDTO();
		long expected = 0;

		test.setIsbn(expected);
		long actual = test.getIsbn();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#setIsbn(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetIsbn2() {
		ItemDTO test = new ItemDTO();
		long expected = 9223372036854775807l;

		test.setIsbn(expected);
		long actual = test.getIsbn();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#setIsbn(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetIsbn3() {
		ItemDTO test = new ItemDTO();
		long expected = -9223372036854775808l;

		test.setIsbn(expected);
		long actual = test.getIsbn();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#setIsbn(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetIsbn4() {
		ItemDTO test = new ItemDTO();
		try {
			long IsbnMax = Integer.parseInt("9223372036854775808l");
			test.setIsbn(IsbnMax);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"9223372036854775808l\"");
		}
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#setIsbn(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetIsbn5() {
		ItemDTO test = new ItemDTO();
		try {
			long IsbnMin = Integer.parseInt("-9223372036854775809l");
			test.setIsbn(IsbnMin);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-9223372036854775809l\"");
		}

	}









	/**
	 *  {@link com.internousdev.kairakutenichiba.dto.ItemDTO#getStocks()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetStocks1() {
		ItemDTO test = new ItemDTO();
		int expected = 0;

		test.setStocks(expected);

		assertEquals(expected, test.getStocks());
	}

	/**
	 *  {@link com.internousdev.kairakutenichiba.dto.ItemDTO#getStocks()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetStocks2() {
		ItemDTO test = new ItemDTO();
		int expected = 2147483647;

		test.setStocks(expected);

		assertEquals(expected, test.getStocks());
	}

	/**
	 *  {@link com.internousdev.kairakutenichiba.dto.ItemDTO#getStocks()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetStocks3() {
		ItemDTO test = new ItemDTO();
		int expected = -2147483648;

		test.setStocks(expected);

		assertEquals(expected, test.getStocks());
	}

	/**
	 *  {@link com.internousdev.kairakutenichiba.dto.ItemDTO#getStocks()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetStocks4() {
		ItemDTO test = new ItemDTO();
		try {
			int StocksMax = Integer.parseInt("2147483648");
			test.setStocks(StocksMax);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	/**
	 *  {@link com.internousdev.kairakutenichiba.dto.ItemDTO#getStocks()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetStocks5() {
		ItemDTO test = new ItemDTO();
		try {
			int StocksMin = Integer.parseInt("-2147483649");
			test.setStocks(StocksMin);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#setStocks(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetStocks1() {
		ItemDTO test = new ItemDTO();
		int expected = 0;

		test.setStocks(expected);
		int actual = test.getStocks();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#setStocks(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetStocks2() {
		ItemDTO test = new ItemDTO();
		int expected = 2147483647;

		test.setStocks(expected);
		int actual = test.getStocks();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#setStocks(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetStocks3() {
		ItemDTO test = new ItemDTO();
		int expected = -2147483648;

		test.setStocks(expected);
		int actual = test.getStocks();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#setStocks(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetStocks4() {
		ItemDTO test = new ItemDTO();
		try {
			int stocksMax = Integer.parseInt("2147483648");
			test.setStocks(stocksMax);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#setStocks(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetStocks5() {
		ItemDTO test = new ItemDTO();
		try {
			int stocksMin = Integer.parseInt("-2147483649");
			test.setStocks(stocksMin);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}

	}
//-------------------------------------------------
	/**
	 *  {@link com.internousdev.kairakutenichiba.dto.ItemDTO#getSales()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetSales1() {
		ItemDTO test = new ItemDTO();
		int expected = 0;

		test.setSales(expected);

		assertEquals(expected, test.getSales());
	}

	/**
	 *  {@link com.internousdev.kairakutenichiba.dto.ItemDTO#getSales()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetSales2() {
		ItemDTO test = new ItemDTO();
		int expected = 2147483647;

		test.setSales(expected);

		assertEquals(expected, test.getSales());
	}

	/**
	 *  {@link com.internousdev.kairakutenichiba.dto.ItemDTO#getSales()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetSales3() {
		ItemDTO test = new ItemDTO();
		int expected = -2147483648;

		test.setSales(expected);

		assertEquals(expected, test.getSales());
	}

	/**
	 *  {@link com.internousdev.kairakutenichiba.dto.ItemDTO#getSales()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetSales4() {
		ItemDTO test = new ItemDTO();
		try {
			int salesMax = Integer.parseInt("2147483648");
			test.setSales(salesMax);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	/**
	 *  {@link com.internousdev.kairakutenichiba.dto.ItemDTO#getSales()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetSales5() {
		ItemDTO test = new ItemDTO();
		try {
			int salesMin = Integer.parseInt("-2147483649");
			test.setSales(salesMin);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#setSales(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetSales1() {
		ItemDTO test = new ItemDTO();
		int expected = 0;

		test.setSales(expected);
		int actual = test.getSales();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#setSales(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetSales2() {
		ItemDTO test = new ItemDTO();
		int expected = 2147483647;

		test.setSales(expected);
		int actual = test.getSales();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#setSales(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetSales3() {
		ItemDTO test = new ItemDTO();
		int expected = -2147483648;

		test.setSales(expected);
		int actual = test.getSales();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#setSales(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetSales4() {
		ItemDTO test = new ItemDTO();
		try {
			int max = Integer.parseInt("2147483648");
			test.setSales(max);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#setSales(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetSales5() {
		ItemDTO test = new ItemDTO();
		try {
			int min = Integer.parseInt("-2147483649");
			test.setSales(min);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}

	}


	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#getItem_image()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetItem_image1() {
		ItemDTO test = new ItemDTO();
		String expected = null;

		test.setItem_image(expected);
		String actual = test.getItem_image();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#getItem_image()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetItem_image2() {
		ItemDTO test = new ItemDTO();
		String expected = "";

		test.setItem_image(expected);
		String actual = test.getItem_image();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#getItem_image()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetItem_image3() {
		ItemDTO test = new ItemDTO();
		String expected = " ";

		test.setItem_image(expected);
		String actual = test.getItem_image();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#getItem_image()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetItem_image4() {
		ItemDTO test = new ItemDTO();
		String expected = "　";

		test.setItem_image(expected);
		String actual = test.getItem_image();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#getItem_image()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetItem_image5() {
		ItemDTO test = new ItemDTO();
		String expected = "abc123";

		test.setItem_image(expected);
		String actual = test.getItem_image();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#getItem_image()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetItem_image6() {
		ItemDTO test = new ItemDTO();
		String expected = "あいう１２３";

		test.setItem_image(expected);
		String actual = test.getItem_image();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#getItem_image()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetItem_image7() {
		ItemDTO test = new ItemDTO();
		String expected = "abc123あいう１２３";

		test.setItem_image(expected);
		String actual = test.getItem_image();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#getItem_image()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetItem_image8() {
		ItemDTO test = new ItemDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setItem_image(expected);
		String actual = test.getItem_image();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#setItem_image(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetItem_image1() {
		ItemDTO test = new ItemDTO();
		String expected = null;

		test.setItem_image(expected);
		String actual = test.getItem_image();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#setItem_image(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetItem_image2() {
		ItemDTO test = new ItemDTO();
		String expected = "";

		test.setItem_image(expected);
		String actual = test.getItem_image();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#setItem_image(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetItem_image3() {
		ItemDTO test = new ItemDTO();
		String expected = " ";

		test.setItem_image(expected);
		String actual = test.getItem_image();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#setItem_image(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetItem_image4() {
		ItemDTO test = new ItemDTO();
		String expected = "　";

		test.setItem_image(expected);
		String actual = test.getItem_image();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#setItem_image(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetItem_image5() {
		ItemDTO test = new ItemDTO();
		String expected = "abc123";

		test.setItem_image(expected);
		String actual = test.getItem_image();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#setItem_image(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetItem_image6() {
		ItemDTO test = new ItemDTO();
		String expected = "あいう１２３";

		test.setItem_image(expected);
		String actual = test.getItem_image();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#setItem_image(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetItem_image7() {
		ItemDTO test = new ItemDTO();
		String expected = "abc123あいう１２３";

		test.setItem_image(expected);
		String actual = test.getItem_image();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#setItem_image(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetItem_image8() {
		ItemDTO test = new ItemDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setItem_image(expected);
		String actual = test.getItem_image();

		assertEquals(expected, actual);

	}


	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#getItem_detail()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetItem_detail1() {
		ItemDTO test = new ItemDTO();
		String expected = null;

		test.setItem_detail(expected);
		String actual = test.getItem_detail();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#getItem_detail()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetItem_detail2() {
		ItemDTO test = new ItemDTO();
		String expected = "";

		test.setItem_detail(expected);
		String actual = test.getItem_detail();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#getItem_detail()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetItem_detail3() {
		ItemDTO test = new ItemDTO();
		String expected = " ";

		test.setItem_detail(expected);
		String actual = test.getItem_detail();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#getItem_detail()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetItem_detail4() {
		ItemDTO test = new ItemDTO();
		String expected = "　";

		test.setItem_detail(expected);
		String actual = test.getItem_detail();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#getItem_detail()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetItem_detail5() {
		ItemDTO test = new ItemDTO();
		String expected = "abc123";

		test.setItem_detail(expected);
		String actual = test.getItem_detail();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#getItem_detail()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetItem_detail6() {
		ItemDTO test = new ItemDTO();
		String expected = "あいう１２３";

		test.setItem_detail(expected);
		String actual = test.getItem_detail();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#getItem_detail()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetItem_detail7() {
		ItemDTO test = new ItemDTO();
		String expected = "abc123あいう１２３";

		test.setItem_detail(expected);
		String actual = test.getItem_detail();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#getItem_detail()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetItem_detail8() {
		ItemDTO test = new ItemDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setItem_detail(expected);
		String actual = test.getItem_detail();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#setItem_detail(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetItem_detail1() {
		ItemDTO test = new ItemDTO();
		String expected = null;

		test.setItem_detail(expected);
		String actual = test.getItem_detail();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#setItem_detail(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetItem_detail2() {
		ItemDTO test = new ItemDTO();
		String expected = "";

		test.setItem_detail(expected);
		String actual = test.getItem_detail();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#setItem_detail(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetItem_detail3() {
		ItemDTO test = new ItemDTO();
		String expected = " ";

		test.setItem_detail(expected);
		String actual = test.getItem_detail();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#setItem_detail(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetItem_detail4() {
		ItemDTO test = new ItemDTO();
		String expected = "　";

		test.setItem_detail(expected);
		String actual = test.getItem_detail();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#setItem_detail(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetItem_detail5() {
		ItemDTO test = new ItemDTO();
		String expected = "abc123";

		test.setItem_detail(expected);
		String actual = test.getItem_detail();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#setItem_detail(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetItem_detail6() {
		ItemDTO test = new ItemDTO();
		String expected = "あいう１２３";

		test.setItem_detail(expected);
		String actual = test.getItem_detail();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#setItem_detail(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetItem_detail7() {
		ItemDTO test = new ItemDTO();
		String expected = "abc123あいう１２３";

		test.setItem_detail(expected);
		String actual = test.getItem_detail();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#setItem_detail(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetItem_detail8() {
		ItemDTO test = new ItemDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setItem_detail(expected);
		String actual = test.getItem_detail();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#getCreated_at()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetCreated_at1() {
		ItemDTO test = new ItemDTO();
		String expected = null;

		test.setCreated_at(expected);
		String actual = test.getCreated_at();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#getCreated_at()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetCreated_at2() {
		ItemDTO test = new ItemDTO();
		String expected = "";

		test.setCreated_at(expected);
		String actual = test.getCreated_at();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#getCreated_at()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetCreated_at3() {
		ItemDTO test = new ItemDTO();
		String expected = " ";

		test.setCreated_at(expected);
		String actual = test.getCreated_at();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#getCreated_at()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetCreated_at4() {
		ItemDTO test = new ItemDTO();
		String expected = "　";

		test.setCreated_at(expected);
		String actual = test.getCreated_at();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#getCreated_at()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetCreated_at5() {
		ItemDTO test = new ItemDTO();
		String expected = "abc123";

		test.setCreated_at(expected);
		String actual = test.getCreated_at();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#getCreated_at()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetCreated_at6() {
		ItemDTO test = new ItemDTO();
		String expected = "あいう１２３";

		test.setCreated_at(expected);
		String actual = test.getCreated_at();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#getCreated_at()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetCreated_at7() {
		ItemDTO test = new ItemDTO();
		String expected = "abc123あいう１２３";

		test.setCreated_at(expected);
		String actual = test.getCreated_at();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#getCreated_at()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetCreated_at8() {
		ItemDTO test = new ItemDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setCreated_at(expected);
		String actual = test.getCreated_at();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#setCreated_at(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetCreated_at1() {
		ItemDTO test = new ItemDTO();
		String expected = null;

		test.setCreated_at(expected);
		String actual = test.getCreated_at();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#setCreated_at(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetCreated_at2() {
		ItemDTO test = new ItemDTO();
		String expected = "";

		test.setCreated_at(expected);
		String actual = test.getCreated_at();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#setCreated_at(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetCreated_at3() {
		ItemDTO test = new ItemDTO();
		String expected = " ";

		test.setCreated_at(expected);
		String actual = test.getCreated_at();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#setCreated_at(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetCreated_at4() {
		ItemDTO test = new ItemDTO();
		String expected = "　";

		test.setCreated_at(expected);
		String actual = test.getCreated_at();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#setCreated_at(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetCreated_at5() {
		ItemDTO test = new ItemDTO();
		String expected = "abc123";

		test.setCreated_at(expected);
		String actual = test.getCreated_at();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#setCreated_at(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetCreated_at6() {
		ItemDTO test = new ItemDTO();
		String expected = "あいう１２３";

		test.setCreated_at(expected);
		String actual = test.getCreated_at();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#setCreated_at(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetCreated_at7() {
		ItemDTO test = new ItemDTO();
		String expected = "abc123あいう１２３";

		test.setCreated_at(expected);
		String actual = test.getCreated_at();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#setCreated_at(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetCreated_at8() {
		ItemDTO test = new ItemDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setCreated_at(expected);
		String actual = test.getCreated_at();

		assertEquals(expected, actual);

	}
//--------------------------------------
	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#getUpdated_at()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetUpdated_at1() {
		ItemDTO test = new ItemDTO();
		String expected = null;

		test.setUpdated_at(expected);
		String actual = test.getUpdated_at();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#getUpdated_at()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetUpdated_at2() {
		ItemDTO test = new ItemDTO();
		String expected = "";

		test.setUpdated_at(expected);
		String actual = test.getUpdated_at();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#getUpdated_at()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetUpdated_at3() {
		ItemDTO test = new ItemDTO();
		String expected = " ";

		test.setUpdated_at(expected);
		String actual = test.getUpdated_at();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#getUpdated_at()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetUpdated_at4() {
		ItemDTO test = new ItemDTO();
		String expected = "　";

		test.setUpdated_at(expected);
		String actual = test.getUpdated_at();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#getUpdated_at()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetUpdated_at5() {
		ItemDTO test = new ItemDTO();
		String expected = "abc123";

		test.setUpdated_at(expected);
		String actual = test.getUpdated_at();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#getUpdated_at()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetUpdated_at6() {
		ItemDTO test = new ItemDTO();
		String expected = "あいう１２３";

		test.setUpdated_at(expected);
		String actual = test.getUpdated_at();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#getUpdated_at()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetUpdated_at7() {
		ItemDTO test = new ItemDTO();
		String expected = "abc123あいう１２３";

		test.setUpdated_at(expected);
		String actual = test.getUpdated_at();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#getUpdated_at()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetUpdated_at8() {
		ItemDTO test = new ItemDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setUpdated_at(expected);
		String actual = test.getUpdated_at();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#setUpdated_at(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetUpdated_at1() {
		ItemDTO test = new ItemDTO();
		String expected = null;

		test.setUpdated_at(expected);
		String actual = test.getUpdated_at();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#setUpdated_at(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetUpdated_at2() {
		ItemDTO test = new ItemDTO();
		String expected = "";

		test.setUpdated_at(expected);
		String actual = test.getUpdated_at();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#setUpdated_at(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetUpdated_at3() {
		ItemDTO test = new ItemDTO();
		String expected = " ";

		test.setUpdated_at(expected);
		String actual = test.getUpdated_at();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#setUpdated_at(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetUpdated_at4() {
		ItemDTO test = new ItemDTO();
		String expected = "　";

		test.setUpdated_at(expected);
		String actual = test.getUpdated_at();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#setUpdated_at(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetUpdated_at5() {
		ItemDTO test = new ItemDTO();
		String expected = "abc123";

		test.setUpdated_at(expected);
		String actual = test.getUpdated_at();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#setUpdated_at(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetUpdated_at6() {
		ItemDTO test = new ItemDTO();
		String expected = "あいう１２３";

		test.setUpdated_at(expected);
		String actual = test.getUpdated_at();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#setUpdated_at(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetUpdated_at7() {
		ItemDTO test = new ItemDTO();
		String expected = "abc123あいう１２３";

		test.setUpdated_at(expected);
		String actual = test.getUpdated_at();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#setUpdated_at(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetUpdated_at8() {
		ItemDTO test = new ItemDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setUpdated_at(expected);
		String actual = test.getUpdated_at();

		assertEquals(expected, actual);

	}



	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#getCategory()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetCategory1() {
		ItemDTO test = new ItemDTO();
		String expected = null;

		test.setCategory(expected);
		String actual = test.getCategory();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#getCategory()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetCategory2() {
		ItemDTO test = new ItemDTO();
		String expected = "";

		test.setCategory(expected);
		String actual = test.getCategory();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#getCategory()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetCategory3() {
		ItemDTO test = new ItemDTO();
		String expected = " ";

		test.setCategory(expected);
		String actual = test.getCategory();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#getCategory()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetCategory4() {
		ItemDTO test = new ItemDTO();
		String expected = "　";

		test.setCategory(expected);
		String actual = test.getCategory();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#getCategory()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetCategory5() {
		ItemDTO test = new ItemDTO();
		String expected = "abc123";

		test.setCategory(expected);
		String actual = test.getCategory();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#getCategory()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetCategory6() {
		ItemDTO test = new ItemDTO();
		String expected = "あいう１２３";

		test.setCategory(expected);
		String actual = test.getCategory();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#getCategory()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetCategory7() {
		ItemDTO test = new ItemDTO();
		String expected = "abc123あいう１２３";

		test.setCategory(expected);
		String actual = test.getCategory();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#getCategory()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetCategory8() {
		ItemDTO test = new ItemDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setCategory(expected);
		String actual = test.getCategory();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#setCategory(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetCategory1() {
		ItemDTO test = new ItemDTO();
		String expected = null;

		test.setCategory(expected);
		String actual = test.getCategory();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#setCategory(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetCategory2() {
		ItemDTO test = new ItemDTO();
		String expected = "";

		test.setCategory(expected);
		String actual = test.getCategory();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#setCategory(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetCategory3() {
		ItemDTO test = new ItemDTO();
		String expected = " ";

		test.setCategory(expected);
		String actual = test.getCategory();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#setCategory(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetCategory4() {
		ItemDTO test = new ItemDTO();
		String expected = "　";

		test.setCategory(expected);
		String actual = test.getCategory();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#setCategory(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetCategory5() {
		ItemDTO test = new ItemDTO();
		String expected = "abc123";

		test.setCategory(expected);
		String actual = test.getCategory();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#setCategory(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetCategory6() {
		ItemDTO test = new ItemDTO();
		String expected = "あいう１２３";

		test.setCategory(expected);
		String actual = test.getCategory();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#setCategory(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetCategory7() {
		ItemDTO test = new ItemDTO();
		String expected = "abc123あいう１２３";

		test.setCategory(expected);
		String actual = test.getCategory();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#setCategory(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetCategory8() {
		ItemDTO test = new ItemDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setCategory(expected);
		String actual = test.getCategory();

		assertEquals(expected, actual);

	}



	public void testGetIs_deleted1() {
		ItemDTO test = new ItemDTO();
		int expected = 0;

		test.setIs_deleted(expected);

		assertEquals(expected, test.getIs_deleted());
	}

	/**
	 *  {@link com.internousdev.kairakutenichiba.dto.ItemDTO#getIs_deleted()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetIs_deleted2() {
		ItemDTO test = new ItemDTO();
		int expected = 2147483647;

		test.setIs_deleted(expected);

		assertEquals(expected, test.getIs_deleted());
	}

	/**
	 *  {@link com.internousdev.kairakutenichiba.dto.ItemDTO#getIs_deleted()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetIs_deleted3() {
		ItemDTO test = new ItemDTO();
		int expected = -2147483648;

		test.setIs_deleted(expected);

		assertEquals(expected, test.getIs_deleted());
	}

	/**
	 *  {@link com.internousdev.kairakutenichiba.dto.ItemDTO#getIs_deleted()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetIs_deleted4() {
		ItemDTO test = new ItemDTO();
		try {
			int Is_deletedMax = Integer.parseInt("2147483648");
			test.setIs_deleted(Is_deletedMax);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	/**
	 *  {@link com.internousdev.kairakutenichiba.dto.ItemDTO#getIs_deleted()} のためのテスト・メソッド。
	 */
	@Test
	public void testIs_deleted5() {
		ItemDTO test = new ItemDTO();
		try {
			int Is_deletedMin = Integer.parseInt("-2147483649");
			test.setIs_deleted(Is_deletedMin);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#setIs_deleted(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetIs_deleted1() {
		ItemDTO test = new ItemDTO();
		int expected = 0;

		test.setIs_deleted(expected);
		int actual = test.getIs_deleted();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#setIs_deleted(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetIs_deleted2() {
		ItemDTO test = new ItemDTO();
		int expected = 2147483647;

		test.setIs_deleted(expected);
		int actual = test.getIs_deleted();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#setIs_deleted(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetIs_deleted3() {
		ItemDTO test = new ItemDTO();
		int expected = -2147483648;

		test.setIs_deleted(expected);
		int actual = test.getIs_deleted();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#setIs_deleted(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetIs_deleted4() {
		ItemDTO test = new ItemDTO();
		try {
			int Is_deletedMax = Integer.parseInt("2147483648");
			test.setIs_deleted(Is_deletedMax);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.ItemDTO#setIs_deleted(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetIs_deleted5() {
		ItemDTO test = new ItemDTO();
		try {
			int Is_deletedMin = Integer.parseInt("-2147483649");
			test.setIs_deleted(Is_deletedMin);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}

	}




















}