package com.internousdev.kairakutenichiba.dto.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.internousdev.kairakutenichiba.dto.ItemDTO;



public class ItemDTOTest {




	/**
	 * {@link com.internousdev.legmina.dto.ItemDTO#getItem_name()} のためのテスト・メソッド。
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
	 * {@link com.internousdev.legmina.dto.ItemDTO#getItem_name()} のためのテスト・メソッド。
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
	 * {@link com.internousdev.legmina.dto.ItemDTO#getItem_name()} のためのテスト・メソッド。
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
	 * {@link com.internousdev.legmina.dto.ItemDTO#getItem_name()} のためのテスト・メソッド。
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
	 * {@link com.internousdev.legmina.dto.ItemDTO#getItem_name()} のためのテスト・メソッド。
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
	 * {@link com.internousdev.legmina.dto.ItemDTO#getItem_name()} のためのテスト・メソッド。
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
	 * {@link com.internousdev.legmina.dto.ItemDTO#getItem_name()} のためのテスト・メソッド。
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
	 * {@link com.internousdev.legmina.dto.ItemDTO#getItem_name()} のためのテスト・メソッド。
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
	 * {@link com.internousdev.legmina.dto.ItemDTO#setItem_name(java.lang.String)} のためのテスト・メソッド。
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
	 * {@link com.internousdev.legmina.dto.ItemDTO#setItem_name(java.lang.String)} のためのテスト・メソッド。
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
	 * {@link com.internousdev.legmina.dto.ItemDTO#setItem_name(java.lang.String)} のためのテスト・メソッド。
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
	 * {@link com.internousdev.legmina.dto.ItemDTO#setItem_name(java.lang.String)} のためのテスト・メソッド。
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
	 * {@link com.internousdev.legmina.dto.ItemDTO#setItem_name(java.lang.String)} のためのテスト・メソッド。
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
	 * {@link com.internousdev.legmina.dto.ItemDTO#setItem_name(java.lang.String)} のためのテスト・メソッド。
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
	 * {@link com.internousdev.legmina.dto.ItemDTO#setItem_name(java.lang.String)} のためのテスト・メソッド。
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
	 * {@link com.internousdev.legmina.dto.ItemDTO#setItem_name(java.lang.String)} のためのテスト・メソッド。
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
	 *  {@link com.internousdev.legmina.dto.ItemDTO#getItem_id()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetItem_id1() {
		ItemDTO test = new ItemDTO();
		int expected = 0;

		test.setItem_id(expected);

		assertEquals(expected, test.getItem_id());
	}

	/**
	 *  {@link com.internousdev.legmina.dto.ItemDTO#getItem_id()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetItem_id2() {
		ItemDTO test = new ItemDTO();
		int expected = 2147483647;

		test.setItem_id(expected);

		assertEquals(expected, test.getItem_id());
	}

	/**
	 *  {@link com.internousdev.legmina.dto.ItemDTO#getItem_id()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetItem_id3() {
		ItemDTO test = new ItemDTO();
		int expected = -2147483648;

		test.setItem_id(expected);

		assertEquals(expected, test.getItem_id());
	}

	/**
	 *  {@link com.internousdev.legmina.dto.ItemDTO#getItem_id()} のためのテスト・メソッド。
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
	 *  {@link com.internousdev.legmina.dto.ItemDTO#getItem_id()} のためのテスト・メソッド。
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
	 * {@link com.internousdev.legmina.dto.ItemDTO#setItem_id(int)} のためのテスト・メソッド。
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
	 * {@link com.internousdev.legmina.dto.ItemDTO#setItem_id(int)} のためのテスト・メソッド。
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
	 * {@link com.internousdev.legmina.dto.ItemDTO#setItem_id(int)} のためのテスト・メソッド。
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
	 * {@link com.internousdev.legmina.dto.ItemDTO#setItem_id(int)} のためのテスト・メソッド。
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
	 * {@link com.internousdev.legmina.dto.ItemDTO#setItem_id(int)} のためのテスト・メソッド。
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
	 *  {@link com.internousdev.legmina.dto.ItemDTO#getStocks()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetStocks1() {
		ItemDTO test = new ItemDTO();
		int expected = 0;

		test.setStocks(expected);

		assertEquals(expected, test.getStocks());
	}

	/**
	 *  {@link com.internousdev.legmina.dto.ItemDTO#getStocks()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetStocks2() {
		ItemDTO test = new ItemDTO();
		int expected = 2147483647;

		test.setStocks(expected);

		assertEquals(expected, test.getStocks());
	}

	/**
	 *  {@link com.internousdev.legmina.dto.ItemDTO#getStocks()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetStocks3() {
		ItemDTO test = new ItemDTO();
		int expected = -2147483648;

		test.setStocks(expected);

		assertEquals(expected, test.getStocks());
	}

	/**
	 *  {@link com.internousdev.legmina.dto.ItemDTO#getStocks()} のためのテスト・メソッド。
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
	 *  {@link com.internousdev.legmina.dto.ItemDTO#getStocks()} のためのテスト・メソッド。
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
	 * {@link com.internousdev.legmina.dto.ItemDTO#setStocks(int)} のためのテスト・メソッド。
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
	 * {@link com.internousdev.legmina.dto.ItemDTO#setStocks(int)} のためのテスト・メソッド。
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
	 * {@link com.internousdev.legmina.dto.ItemDTO#setStocks(int)} のためのテスト・メソッド。
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
	 * {@link com.internousdev.legmina.dto.ItemDTO#setStocks(int)} のためのテスト・メソッド。
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
	 * {@link com.internousdev.legmina.dto.ItemDTO#setStocks(int)} のためのテスト・メソッド。
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
	 *  {@link com.internousdev.legmina.dto.ItemDTO#getSales()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetSales1() {
		ItemDTO test = new ItemDTO();
		int expected = 0;

		test.setSales(expected);

		assertEquals(expected, test.getSales());
	}

	/**
	 *  {@link com.internousdev.legmina.dto.ItemDTO#getSales()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetSales2() {
		ItemDTO test = new ItemDTO();
		int expected = 2147483647;

		test.setSales(expected);

		assertEquals(expected, test.getSales());
	}

	/**
	 *  {@link com.internousdev.legmina.dto.ItemDTO#getSales()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetSales3() {
		ItemDTO test = new ItemDTO();
		int expected = -2147483648;

		test.setSales(expected);

		assertEquals(expected, test.getSales());
	}

	/**
	 *  {@link com.internousdev.legmina.dto.ItemDTO#getSales()} のためのテスト・メソッド。
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
	 *  {@link com.internousdev.legmina.dto.ItemDTO#getSales()} のためのテスト・メソッド。
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
	 * {@link com.internousdev.legmina.dto.ItemDTO#setSales(int)} のためのテスト・メソッド。
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
	 * {@link com.internousdev.legmina.dto.ItemDTO#setSales(int)} のためのテスト・メソッド。
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
	 * {@link com.internousdev.legmina.dto.ItemDTO#setSales(int)} のためのテスト・メソッド。
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
	 * {@link com.internousdev.legmina.dto.ItemDTO#setSales(int)} のためのテスト・メソッド。
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
	 * {@link com.internousdev.legmina.dto.ItemDTO#setSales(int)} のためのテスト・メソッド。
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


}