package com.internousdev.kairakutenichiba.dto.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.internousdev.kairakutenichiba.dto.CartDTO;

/**
 * @author Ryo Maeda
 */

public class CartDTOTest {

//CartId------------------------------
	/**
	 *  {@link com.internousdev.kairakutenichiba.dto.CartDTO#getCartId()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetCartId1() {
		CartDTO test = new CartDTO();
		int expected = 0;

		test.setCartId(expected);

		assertEquals(expected, test.getCartId());
	}

	/**
	 *  {@link com.internousdev.kairakutenichiba.dto.CartDTO#getCartId()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetCartId2() {
		CartDTO test = new CartDTO();
		int expected = 2147483647;

		test.setCartId(expected);

		assertEquals(expected, test.getCartId());
	}

	/**
	 *  {@link com.internousdev.kairakutenichiba.dto.CartDTO#getCartId()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetCartId3() {
		CartDTO test = new CartDTO();
		int expected = -2147483648;

		test.setCartId(expected);

		assertEquals(expected, test.getCartId());
	}

	/**
	 *  {@link com.internousdev.kairakutenichiba.dto.CartDTO#getCartId()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetCartId4() {
		CartDTO test = new CartDTO();
		try {
			int CartIdMax = Integer.parseInt("2147483648");
			test.setCartId(CartIdMax);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	/**
	 *  {@link com.internousdev.kairakutenichiba.dto.CartDTO#getCartId()} のためのテスト・メソッド。
	 */
	@Test
	public void testCartId5() {
		CartDTO test = new CartDTO();
		try {
			int CartIdMin = Integer.parseInt("-2147483649");
			test.setCartId(CartIdMin);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CartDTO#setCartId(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetCartId1() {
		CartDTO test = new CartDTO();
		int expected = 0;

		test.setCartId(expected);
		int actual = test.getCartId();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CartDTO#setCartId(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetCartId2() {
		CartDTO test = new CartDTO();
		int expected = 2147483647;

		test.setCartId(expected);
		int actual = test.getCartId();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CartDTO#setCartId(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetCartId3() {
		CartDTO test = new CartDTO();
		int expected = -2147483648;

		test.setCartId(expected);
		int actual = test.getCartId();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CartDTO#setCartId(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetCartId4() {
		CartDTO test = new CartDTO();
		try {
			int CartIdMax = Integer.parseInt("2147483648");
			test.setCartId(CartIdMax);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CartDTO#setCartId(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetCartId5() {
		CartDTO test = new CartDTO();
		try {
			int CartIdMin = Integer.parseInt("-2147483649");
			test.setCartId(CartIdMin);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}

	}

//UserId--------------------------------------------
	/**
	 *  {@link com.internousdev.kairakutenichiba.dto.CartDTO#getUserId()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetUserId1() {
		CartDTO test = new CartDTO();
		int expected = 0;

		test.setUserId(expected);

		assertEquals(expected, test.getUserId());
	}

	/**
	 *  {@link com.internousdev.kairakutenichiba.dto.CartDTO#getUserId()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetUserId2() {
		CartDTO test = new CartDTO();
		int expected = 2147483647;

		test.setUserId(expected);

		assertEquals(expected, test.getUserId());
	}

	/**
	 *  {@link com.internousdev.kairakutenichiba.dto.CartDTO#getUserId()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetUserId3() {
		CartDTO test = new CartDTO();
		int expected = -2147483648;

		test.setUserId(expected);

		assertEquals(expected, test.getUserId());
	}

	/**
	 *  {@link com.internousdev.kairakutenichiba.dto.CartDTO#getUserId()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetUserId4() {
		CartDTO test = new CartDTO();
		try {
			int userIdMax = Integer.parseInt("2147483648");
			test.setUserId(userIdMax);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	/**
	 *  {@link com.internousdev.kairakutenichiba.dto.CartDTO#getUserId()} のためのテスト・メソッド。
	 */
	@Test
	public void testUserId5() {
		CartDTO test = new CartDTO();
		try {
			int userIdMin = Integer.parseInt("-2147483649");
			test.setUserId(userIdMin);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CartDTO#setUserId(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetUserId1() {
		CartDTO test = new CartDTO();
		int expected = 0;

		test.setUserId(expected);
		int actual = test.getUserId();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CartDTO#setUserId(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetUserId2() {
		CartDTO test = new CartDTO();
		int expected = 2147483647;

		test.setUserId(expected);
		int actual = test.getUserId();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CartDTO#setUserId(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetUserId3() {
		CartDTO test = new CartDTO();
		int expected = -2147483648;

		test.setUserId(expected);
		int actual = test.getUserId();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CartDTO#setUserId(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetUserId4() {
		CartDTO test = new CartDTO();
		try {
			int userIdMax = Integer.parseInt("2147483648");
			test.setUserId(userIdMax);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CartDTO#setUserId(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetUserId5() {
		CartDTO test = new CartDTO();
		try {
			int userIdMin = Integer.parseInt("-2147483649");
			test.setUserId(userIdMin);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}

	}
//ItemId--------------------------------------

	/**
	 *  {@link com.internousdev.kairakutenichiba.dto.CartDTO#getItemId()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetItemId1() {
		CartDTO test = new CartDTO();
		int expected = 0;

		test.setItemId(expected);

		assertEquals(expected, test.getItemId());
	}

	/**
	 *  {@link com.internousdev.kairakutenichiba.dto.CartDTO#getItemId()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetItemId2() {
		CartDTO test = new CartDTO();
		int expected = 2147483647;

		test.setItemId(expected);

		assertEquals(expected, test.getItemId());
	}

	/**
	 *  {@link com.internousdev.kairakutenichiba.dto.CartDTO#getItemId()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetItemId3() {
		CartDTO test = new CartDTO();
		int expected = -2147483648;

		test.setItemId(expected);

		assertEquals(expected, test.getItemId());
	}

	/**
	 *  {@link com.internousdev.kairakutenichiba.dto.CartDTO#getItemId()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetItemId4() {
		CartDTO test = new CartDTO();
		try {
			int itemIdMax = Integer.parseInt("2147483648");
			test.setItemId(itemIdMax);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	/**
	 *  {@link com.internousdev.kairakutenichiba.dto.CartDTO#getItemId()} のためのテスト・メソッド。
	 */
	@Test
	public void testItemId5() {
		CartDTO test = new CartDTO();
		try {
			int itemIdMin = Integer.parseInt("-2147483649");
			test.setItemId(itemIdMin);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CartDTO#setItemId(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetItemId1() {
		CartDTO test = new CartDTO();
		int expected = 0;

		test.setItemId(expected);
		int actual = test.getItemId();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CartDTO#setItemId(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetItemId2() {
		CartDTO test = new CartDTO();
		int expected = 2147483647;

		test.setItemId(expected);
		int actual = test.getItemId();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CartDTO#setItemId(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetItemId3() {
		CartDTO test = new CartDTO();
		int expected = -2147483648;

		test.setItemId(expected);
		int actual = test.getItemId();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CartDTO#setItemId(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetItemId4() {
		CartDTO test = new CartDTO();
		try {
			int itemIdMax = Integer.parseInt("2147483648");
			test.setItemId(itemIdMax);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CartDTO#setItemId(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetItemId5() {
		CartDTO test = new CartDTO();
		try {
			int itemIdMin = Integer.parseInt("-2147483649");
			test.setItemId(itemIdMin);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}

	}
//ItemName----------------------------------------
	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CartDTO#getItemName()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetItemName1() {
		CartDTO test = new CartDTO();
		String expected = null;

		test.setItemName(expected);
		String actual = test.getItemName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CartDTO#getItemName()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetItemName2() {
		CartDTO test = new CartDTO();
		String expected = "";

		test.setItemName(expected);
		String actual = test.getItemName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CartDTO#getItemName()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetItemName3() {
		CartDTO test = new CartDTO();
		String expected = " ";

		test.setItemName(expected);
		String actual = test.getItemName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CartDTO#getItemName()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetItemName4() {
		CartDTO test = new CartDTO();
		String expected = "　";

		test.setItemName(expected);
		String actual = test.getItemName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CartDTO#getItemName()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetItemName5() {
		CartDTO test = new CartDTO();
		String expected = "abc123";

		test.setItemName(expected);
		String actual = test.getItemName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CartDTO#getItemName()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetItemName6() {
		CartDTO test = new CartDTO();
		String expected = "あいう１２３";

		test.setItemName(expected);
		String actual = test.getItemName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CartDTO#getItemName()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetItemName7() {
		CartDTO test = new CartDTO();
		String expected = "abc123あいう１２３";

		test.setItemName(expected);
		String actual = test.getItemName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CartDTO#getItemName()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetItemName8() {
		CartDTO test = new CartDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setItemName(expected);
		String actual = test.getItemName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CartDTO#setItemName(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetItemName1() {
		CartDTO test = new CartDTO();
		String expected = null;

		test.setItemName(expected);
		String actual = test.getItemName();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CartDTO#setItemName(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetItemName2() {
		CartDTO test = new CartDTO();
		String expected = "";

		test.setItemName(expected);
		String actual = test.getItemName();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CartDTO#setItemName(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetItemName3() {
		CartDTO test = new CartDTO();
		String expected = " ";

		test.setItemName(expected);
		String actual = test.getItemName();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CartDTO#setItemName(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetItemName4() {
		CartDTO test = new CartDTO();
		String expected = "　";

		test.setItemName(expected);
		String actual = test.getItemName();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CartDTO#setItemName(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetItemName5() {
		CartDTO test = new CartDTO();
		String expected = "abc123";

		test.setItemName(expected);
		String actual = test.getItemName();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CartDTO#setItemName(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetItemName6() {
		CartDTO test = new CartDTO();
		String expected = "あいう１２３";

		test.setItemName(expected);
		String actual = test.getItemName();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CartDTO#setItemName(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetItemName7() {
		CartDTO test = new CartDTO();
		String expected = "abc123あいう１２３";

		test.setItemName(expected);
		String actual = test.getItemName();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CartDTO#setItemName(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetItemName8() {
		CartDTO test = new CartDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setItemName(expected);
		String actual = test.getItemName();

		assertEquals(expected, actual);

	}
//Price---------------------------------------------
	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CartDTO#getPrice()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetPrice1() {
		CartDTO test = new CartDTO();
		float expected = 0f;

		test.setPrice(expected);

		assertEquals(expected, test.getPrice(),0.00000000001f);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CartDTO#getPrice()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetPrice2() {
		CartDTO test = new CartDTO();
		float expected =  3.4028235E38f;//3.4x(10の38乗)

		test.setPrice(expected);

		assertEquals(expected, test.getPrice(),0.00000000001f);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CartDTO#getPrice()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetPrice3() {
		CartDTO test = new CartDTO();
		float expected = 1.4E-45f;//1.4x(10の-45乗)

		test.setPrice(expected);

		assertEquals(expected, test.getPrice(),0.00000000001f);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CartDTO#getPrice()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetPrice4() {
		CartDTO test = new CartDTO();
		try {
			float priceMax = Integer.parseInt("4.4028235E38f");
			test.setPrice(priceMax);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"4.4028235E38f\"");
		}
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CartDTO#getPrice()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetPrice5() {
		CartDTO test = new CartDTO();
		try {
			float priceMin = Integer.parseInt("-4.4028235E38f");
			test.setPrice(priceMin);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-4.4028235E38f\"");
		}
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CartDTO#setPrice(float)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetPrice1() {
		CartDTO test = new CartDTO();
		float expected = 0f;

		test.setPrice(expected);

		assertEquals(expected, test.getPrice(),0.00000000001f);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CartDTO#setPrice(float)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetPrice2() {
		CartDTO test = new CartDTO();
		float expected =  3.4028235E38f;

		test.setPrice(expected);

		assertEquals(expected, test.getPrice(),0.00000000001f);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CartDTO#setPrice(float)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetPrice3() {
		CartDTO test = new CartDTO();
		float expected = 1.4E-45f;

		test.setPrice(expected);

		assertEquals(expected, test.getPrice(),0.00000000001f);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CartDTO#setPrice(float)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetPrice4() {
		CartDTO test = new CartDTO();
		try {
			float priceMin = Integer.parseInt("4.4028235E38f");
			test.setPrice(priceMin);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"4.4028235E38f\"");
		}
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CartDTO#setPrice(float)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetPrice5() {
		CartDTO test = new CartDTO();
		try {
			float priceMin = Integer.parseInt("-4.4028235E38f");
			test.setPrice(priceMin);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-4.4028235E38f\"");
		}
	}


//priceyen--------------------------------------------
	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CartDTO#getPriceyen()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetPriceyen1() {
		CartDTO test = new CartDTO();
		int expected = 0;

		test.setPriceyen(expected);

		assertEquals(expected, test.getPriceyen(),0.00000000001f);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CartDTO#getPriceyen()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetPriceyen2() {
		CartDTO test = new CartDTO();
		int expected =  3;

		test.setPriceyen(expected);

		assertEquals(expected, test.getPriceyen(),0);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CartDTO#getPriceyen()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetPrice3yen() {
		CartDTO test = new CartDTO();
		int expected = 1;

		test.setPriceyen(expected);

		assertEquals(expected, test.getPriceyen(),1);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CartDTO#getPriceyen()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetPrice4yen() {
		CartDTO test = new CartDTO();
		try {
			int priceyenMax = Integer.parseInt("4.4028235E38f");
			test.setPriceyen(priceyenMax);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"4.4028235E38f\"");
		}
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CartDTO#getPriceyen()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetPriceyenyen5() {
		CartDTO test = new CartDTO();
		try {
			int priceyenMin = Integer.parseInt("-4.4028235E38f");
			test.setPrice(priceyenMin);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-4.4028235E38f\"");
		}
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CartDTO#setPriceyen(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetPriceyen1() {
		CartDTO test = new CartDTO();
		int expected = 0;

		test.setPriceyen(expected);

		assertEquals(expected, test.getPriceyen(),1);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CartDTO#setPriceyen(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetPrice2yen() {
		CartDTO test = new CartDTO();
		int expected =  3;

		test.setPriceyen(expected);

		assertEquals(expected, test.getPriceyen(),1);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CartDTO#setPriceyen(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetPrice3yen() {
		CartDTO test = new CartDTO();
		int expected = 1;

		test.setPriceyen(expected);

		assertEquals(expected, test.getPriceyen(),1);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CartDTO#setPriceyen(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetPriceyen4() {
		CartDTO test = new CartDTO();
		try {
			float priceyenMin = Integer.parseInt("4.4028235E38f");
			test.setPriceyen(priceyenMin);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"4.4028235E38f\"");
		}
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CartDTO#setPriceyen(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetPriceyen5() {
		CartDTO test = new CartDTO();
		try {
			float priceyenMin = Integer.parseInt("-4.4028235E38f");
			test.setPriceyen(priceyenMin);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-4.4028235E38f\"");
		}
	}



//Quantities----------------------------------------
	/**
	 *  {@link com.internousdev.kairakutenichiba.dto.CartDTO#getQuantities()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetQuantities1() {
		CartDTO test = new CartDTO();
		int expected = 0;

		test.setQuantities(expected);

		assertEquals(expected, test.getQuantities());
	}

	/**
	 *  {@link com.internousdev.kairakutenichiba.dto.CartDTO#getQuantities()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetQuantities2() {
		CartDTO test = new CartDTO();
		int expected = 2147483647;

		test.setQuantities(expected);

		assertEquals(expected, test.getQuantities());
	}

	/**
	 *  {@link com.internousdev.kairakutenichiba.dto.CartDTO#getQuantities()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetQuantities3() {
		CartDTO test = new CartDTO();
		int expected = -2147483648;

		test.setQuantities(expected);

		assertEquals(expected, test.getQuantities());
	}

	/**
	 *  {@link com.internousdev.kairakutenichiba.dto.CartDTO#getQuantities()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetQuantities4() {
		CartDTO test = new CartDTO();
		try {
			int quantitiesMax = Integer.parseInt("2147483648");
			test.setQuantities(quantitiesMax);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	/**
	 *  {@link com.internousdev.kairakutenichiba.dto.CartDTO#getQuantities()} のためのテスト・メソッド。
	 */
	@Test
	public void testQuantities5() {
		CartDTO test = new CartDTO();
		try {
			int quantitiesMin = Integer.parseInt("-2147483649");
			test.setQuantities(quantitiesMin);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CartDTO#setQuantities(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetQuantities1() {
		CartDTO test = new CartDTO();
		int expected = 0;

		test.setQuantities(expected);
		int actual = test.getQuantities();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CartDTO#setQuantities(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetQuantities2() {
		CartDTO test = new CartDTO();
		int expected = 2147483647;

		test.setQuantities(expected);
		int actual = test.getQuantities();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CartDTO#setQuantities(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetQuantities3() {
		CartDTO test = new CartDTO();
		int expected = -2147483648;

		test.setQuantities(expected);
		int actual = test.getQuantities();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CartDTO#setQuantities(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetQuantities4() {
		CartDTO test = new CartDTO();
		try {
			int quantitiesMax = Integer.parseInt("2147483648");
			test.setQuantities(quantitiesMax);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CartDTO#setQuantities(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetQuantities5() {
		CartDTO test = new CartDTO();
		try {
			int quantitiesMin = Integer.parseInt("-2147483649");
			test.setQuantities(quantitiesMin);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}

	}
//ImgPath---------------------------------------
	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CartDTO#getImgPath()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetImgPath1() {
		CartDTO test = new CartDTO();
		String expected = null;

		test.setImgPath(expected);
		String actual = test.getImgPath();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CartDTO#getImgPath()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetImgPath2() {
		CartDTO test = new CartDTO();
		String expected = "";

		test.setImgPath(expected);
		String actual = test.getImgPath();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CartDTO#getImgPath()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetImgPath3() {
		CartDTO test = new CartDTO();
		String expected = " ";

		test.setImgPath(expected);
		String actual = test.getImgPath();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CartDTO#getImgPath()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetImgPath4() {
		CartDTO test = new CartDTO();
		String expected = "　";

		test.setImgPath(expected);
		String actual = test.getImgPath();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CartDTO#getImgPath()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetImgPath5() {
		CartDTO test = new CartDTO();
		String expected = "abc123";

		test.setImgPath(expected);
		String actual = test.getImgPath();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CartDTO#getImgPath()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetImgPath6() {
		CartDTO test = new CartDTO();
		String expected = "あいう１２３";

		test.setImgPath(expected);
		String actual = test.getImgPath();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CartDTO#getImgPath()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetImgPath7() {
		CartDTO test = new CartDTO();
		String expected = "abc123あいう１２３";

		test.setImgPath(expected);
		String actual = test.getImgPath();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CartDTO#getImgPath()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetImgPath8() {
		CartDTO test = new CartDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setImgPath(expected);
		String actual = test.getImgPath();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CartDTO#setImgPath(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetImgPath1() {
		CartDTO test = new CartDTO();
		String expected = null;

		test.setImgPath(expected);
		String actual = test.getImgPath();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CartDTO#setImgPath(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetImgPath2() {
		CartDTO test = new CartDTO();
		String expected = "";

		test.setImgPath(expected);
		String actual = test.getImgPath();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CartDTO#setImgPath(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetImgPath3() {
		CartDTO test = new CartDTO();
		String expected = " ";

		test.setImgPath(expected);
		String actual = test.getImgPath();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CartDTO#setImgPath(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetImgPath4() {
		CartDTO test = new CartDTO();
		String expected = "　";

		test.setImgPath(expected);
		String actual = test.getImgPath();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CartDTO#setImgPath(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetImgPath5() {
		CartDTO test = new CartDTO();
		String expected = "abc123";

		test.setImgPath(expected);
		String actual = test.getImgPath();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CartDTO#setImgPath(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetImgPath6() {
		CartDTO test = new CartDTO();
		String expected = "あいう１２３";

		test.setImgPath(expected);
		String actual = test.getImgPath();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CartDTO#setImgPath(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetImgPath7() {
		CartDTO test = new CartDTO();
		String expected = "abc123あいう１２３";

		test.setImgPath(expected);
		String actual = test.getImgPath();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CartDTO#setImgPath(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetImgPath8() {
		CartDTO test = new CartDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setImgPath(expected);
		String actual = test.getImgPath();

		assertEquals(expected, actual);

	}
//Subtotal-------------------------------------
	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CartDTO#getSubtotal()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetSubtotal1() {
		CartDTO test = new CartDTO();
		float expected = 0f;

		test.setSubtotal(expected);

		assertEquals(expected, test.getSubtotal(),0.00000000001f);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CartDTO#getSubtotal()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetSubtotal2() {
		CartDTO test = new CartDTO();
		float expected =  3.4028235E38f;//3.4x(10の38乗)

		test.setSubtotal(expected);

		assertEquals(expected, test.getSubtotal(),0.00000000001f);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CartDTO#getSubtotal()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetSubtotal3() {
		CartDTO test = new CartDTO();
		float expected = 1.4E-45f;//1.4x(10の-45乗)

		test.setSubtotal(expected);

		assertEquals(expected, test.getSubtotal(),0.00000000001f);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CartDTO#getSubtotal()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetSubtotal4() {
		CartDTO test = new CartDTO();
		try {
			float subtotalMax = Integer.parseInt("4.4028235E38f");
			test.setSubtotal(subtotalMax);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"4.4028235E38f\"");
		}
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CartDTO#getSubtotal()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetSubtotal5() {
		CartDTO test = new CartDTO();
		try {
			float subtotalMin = Integer.parseInt("-4.4028235E38f");
			test.setSubtotal(subtotalMin);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-4.4028235E38f\"");
		}
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CartDTO#setSubtotal(float)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetSubtotal1() {
		CartDTO test = new CartDTO();
		float expected = 0f;

		test.setSubtotal(expected);

		assertEquals(expected, test.getSubtotal(),0.00000000001f);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CartDTO#setSubtotal(float)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetSubtotal2() {
		CartDTO test = new CartDTO();
		float expected =  3.4028235E38f;

		test.setSubtotal(expected);

		assertEquals(expected, test.getSubtotal(),0.00000000001f);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CartDTO#setSubtotal(float)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetSubtotal3() {
		CartDTO test = new CartDTO();
		float expected = 1.4E-45f;

		test.setSubtotal(expected);

		assertEquals(expected, test.getSubtotal(),0.00000000001f);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CartDTO#setSubtotal(float)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetSubtotal4() {
		CartDTO test = new CartDTO();
		try {
			float subtotalMin = Integer.parseInt("4.4028235E38f");
			test.setSubtotal(subtotalMin);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"4.4028235E38f\"");
		}
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CartDTO#setSubtotal(float)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetSubtotal5() {
		CartDTO test = new CartDTO();
		try {
			float subtotalMin = Integer.parseInt("-4.4028235E38f");
			test.setSubtotal(subtotalMin);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-4.4028235E38f\"");
		}
	}

}
