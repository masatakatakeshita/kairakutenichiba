package com.internousdev.kairakutenichiba.dto.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.internousdev.kairakutenichiba.dto.CreditDTO;

public class CreditDTOTest {





	//ここからユーザーID
	/**
	 *  creditDTO, userId
	 *  のためのテスト・メソッド。
	 */
	@Test
	public void testGetUserId1() {
		CreditDTO test = new CreditDTO();
		int expected = 0;

		test.setUserId(expected);

		assertEquals(expected, test.getUserId());

	}

	/**
	 *  creditDTO, userId
	 *  のためのテスト・メソッド。
	 */
	@Test
	public void testGetUserId2() {
		CreditDTO test = new CreditDTO();
		int expected = 2147483647;

		test.setUserId(expected);

		assertEquals(expected, test.getUserId());
	}

	/**
	 * creditDTO, userId
	 *  のためのテスト・メソッド。
	 */
	@Test
	public void testGetUserId3() {
		CreditDTO test = new CreditDTO();
		int expected = -2147483648;

		test.setUserId(expected);

		assertEquals(expected, test.getUserId());
	}

	/**
	 *  creditDTO, userId
	 *  のためのテスト・メソッド。
	 */
	@Test
	public void testGetUserId4() {
		CreditDTO test = new CreditDTO();
		try {
			int UserIdMin = Integer.parseInt("2147483648");
			test.setUserId(UserIdMin);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	/**
	 *  creditDTO, userId
	 *  のためのテスト・メソッド。
	 */
	@Test
	public void testGetUserId5() {
		CreditDTO test = new CreditDTO();
		try {
			int UserIdMin = Integer.parseInt("-2147483649");
			test.setUserId(UserIdMin);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

	/**
	 *  creditDTO, userId
	 *  のためのテスト・メソッド。
	 */
	@Test
	public void testSetUserId1() {
		CreditDTO test = new CreditDTO();
		int expected = 0;

		test.setUserId(expected);
		int actual = test.getUserId();

		assertEquals(expected, actual);
	}


	/**
	 *  creditDTO, userId
	 *  のためのテスト・メソッド。
	 */
	@Test
	public void testSetUserId2() {
		CreditDTO test = new CreditDTO();
		int expected = 2147483647;

		test.setUserId(expected);
		int actual = test.getUserId();

		assertEquals(expected, actual);
	}

	/**
	 *  creditDTO, userId
	 *  のためのテスト・メソッド。
	 */
	@Test
	public void testSetUserId3() {
		CreditDTO test = new CreditDTO();
		int expected = -2147483648;

		test.setUserId(expected);
		int actual = test.getUserId();

		assertEquals(expected, actual);
	}

	/**
	 *  creditDTO, userId
	 *  のためのテスト・メソッド。
	 */
	@Test
	public void testSetUserId4() {
		CreditDTO test = new CreditDTO();
		try {
			int UserIdMax = Integer.parseInt("2147483648");
			test.setUserId(UserIdMax);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	/**
	 *  creditDTO, userId
	 *  のためのテスト・メソッド。
	 */
	@Test
	public void testSetUserId5() {
		CreditDTO test = new CreditDTO();
		try {
			int UserIdMax = Integer.parseInt("-2147483649");
			test.setUserId(UserIdMax);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

	//ここからクレジットID

	/**
	 *  creditDTO, CreditId
	 *  のためのテスト・メソッド。
	 */
	@Test
	public void testGetCreditId1() {
		CreditDTO test = new CreditDTO();
		int expected = 0;

		test.setCreditId(expected);

		assertEquals(expected, test.getCreditId());

	}

	/**
	 *  creditDTO, CreditId
	 *  のためのテスト・メソッド。
	 */
	@Test
	public void testGetCreditId2() {
		CreditDTO test = new CreditDTO();
		int expected = 2147483647;

		test.setCreditId(expected);

		assertEquals(expected, test.getCreditId());
	}

	/**
	 * creditDTO, CreditId
	 *  のためのテスト・メソッド。
	 */
	@Test
	public void testGetCreditId3() {
		CreditDTO test = new CreditDTO();
		int expected = -2147483648;

		test.setCreditId(expected);

		assertEquals(expected, test.getCreditId());
	}

	/**
	 *  creditDTO, CreditId
	 *  のためのテスト・メソッド。
	 */
	@Test
	public void testGetCreditId4() {
		CreditDTO test = new CreditDTO();
		try {
			int CreditIdMin = Integer.parseInt("2147483648");
			test.setCreditId(CreditIdMin);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	/**
	 *  creditDTO, CreditId
	 *  のためのテスト・メソッド。
	 */
	@Test
	public void testGetCreditId5() {
		CreditDTO test = new CreditDTO();
		try {
			int CreditIdMin = Integer.parseInt("-2147483649");
			test.setCreditId(CreditIdMin);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

	/**
	 *  creditDTO, CreditId
	 *  のためのテスト・メソッド。
	 */
	@Test
	public void testSetCreditId1() {
		CreditDTO test = new CreditDTO();
		int expected = 0;

		test.setCreditId(expected);
		int actual = test.getCreditId();

		assertEquals(expected, actual);
	}


	/**
	 *  creditDTO, CreditId
	 *  のためのテスト・メソッド。
	 */
	@Test
	public void testSetCreditId2() {
		CreditDTO test = new CreditDTO();
		int expected = 2147483647;

		test.setCreditId(expected);
		int actual = test.getCreditId();

		assertEquals(expected, actual);
	}

	/**
	 *  creditDTO, CreditId
	 *  のためのテスト・メソッド。
	 */
	@Test
	public void testSetCreditId3() {
		CreditDTO test = new CreditDTO();
		int expected = -2147483648;

		test.setCreditId(expected);
		int actual = test.getCreditId();

		assertEquals(expected, actual);
	}

	/**
	 *  creditDTO, CreditId
	 *  のためのテスト・メソッド。
	 */
	@Test
	public void testSetCreditId4() {
		CreditDTO test = new CreditDTO();
		try {
			int CreditIdMax = Integer.parseInt("2147483648");
			test.setCreditId(CreditIdMax);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	/**
	 *  creditDTO, CreditId
	 *  のためのテスト・メソッド。
	 */
	@Test
	public void testSetCreditId5() {
		CreditDTO test = new CreditDTO();
		try {
			int CreditIdMax = Integer.parseInt("-2147483649");
			test.setCreditId(CreditIdMax);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}


//ここからログインID


	@Test
	public void testGetLoginId1() {
		CreditDTO test = new CreditDTO();
		String expected = null;

		test.setLoginId(expected);
		String actual = test.getLoginId();

		assertEquals(expected, actual);
	}

	public void testGetLoginId2() {
		CreditDTO test = new CreditDTO();
		String expected = "";

		test.setLoginId(expected);
		String actual = test.getLoginId();

		assertEquals(expected, actual);
	}

	public void testGetLoginId3() {
		CreditDTO test = new CreditDTO();
		String expected = " ";

		test.setLoginId(expected);
		String actual = test.getLoginId();

		assertEquals(expected, actual);
	}

	public void testGetLoginId4() {
		CreditDTO test = new CreditDTO();
		String expected = "　";

		test.setLoginId(expected);
		String actual = test.getLoginId();

		assertEquals(expected, actual);
	}

	public void testGetLoginId5() {
		CreditDTO test = new CreditDTO();
		String expected = "abc123";

		test.setLoginId(expected);
		String actual = test.getLoginId();

		assertEquals(expected, actual);
	}

	public void testGetLoginId6() {
		CreditDTO test = new CreditDTO();
		String expected = "あいう１２３";

		test.setLoginId(expected);
		String actual = test.getLoginId();

		assertEquals(expected, actual);
	}

	public void testGetLoginId7() {
		CreditDTO test = new CreditDTO();
		String expected = "abc123あいう１２３";

		test.setLoginId(expected);
		String actual = test.getLoginId();

		assertEquals(expected, actual);
	}

	public void testGetLoginId8() {
		CreditDTO test = new CreditDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setLoginId(expected);
		String actual = test.getLoginId();

		assertEquals(expected, actual);
	}


	public void testSetLoginId1() {
		CreditDTO test = new CreditDTO();
		String expected = null;

		test.setLoginId(expected);
		String actual = test.getLoginId();

		assertEquals(expected, actual);

	}

	public void testSetLoginId2() {
		CreditDTO test = new CreditDTO();
		String expected = "";

		test.setLoginId(expected);
		String actual = test.getLoginId();

		assertEquals(expected, actual);

	}

	public void testSetLoginId3() {
		CreditDTO test = new CreditDTO();
		String expected = " ";

		test.setLoginId(expected);
		String actual = test.getLoginId();

		assertEquals(expected, actual);

	}

	public void testSetLoginId4() {
		CreditDTO test = new CreditDTO();
		String expected = "　";

		test.setLoginId(expected);
		String actual = test.getLoginId();

		assertEquals(expected, actual);

	}

	public void testSetLoginId5() {
		CreditDTO test = new CreditDTO();
		String expected = "abc123";

		test.setLoginId(expected);
		String actual = test.getLoginId();

		assertEquals(expected, actual);

	}

	public void testSetLoginId6() {
		CreditDTO test = new CreditDTO();
		String expected = "あいう１２３";

		test.setLoginId(expected);
		String actual = test.getLoginId();

		assertEquals(expected, actual);

	}

	public void testSetLoginId7() {
		CreditDTO test = new CreditDTO();
		String expected = "abc123あいう１２３";

		test.setLoginId(expected);
		String actual = test.getLoginId();

		assertEquals(expected, actual);

	}

	public void testSetLoginId8() {
		CreditDTO test = new CreditDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setLoginId(expected);
		String actual = test.getLoginId();

		assertEquals(expected, actual);

	}

//  ここからクレジットナンバー


	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CreditDTO#getCreditNumber()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetCreditNumber1() {
		CreditDTO test = new CreditDTO();
		String expected = null;

		test.setCreditNumber(expected);
		String actual = test.getCreditNumber();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CreditDTO#getCreditNumber()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetCreditNumber2() {
		CreditDTO test = new CreditDTO();
		String expected = "";

		test.setCreditNumber(expected);
		String actual = test.getCreditNumber();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CreditDTO#getCreditNumber()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetCreditNumber3() {
		CreditDTO test = new CreditDTO();
		String expected = " ";

		test.setCreditNumber(expected);
		String actual = test.getCreditNumber();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CreditDTO#getCreditNumber()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetCreditNumber4() {
		CreditDTO test = new CreditDTO();
		String expected = "　";

		test.setCreditNumber(expected);
		String actual = test.getCreditNumber();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CreditDTO#getCreditNumber()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetCreditNumber5() {
		CreditDTO test = new CreditDTO();
		String expected = "abc123";

		test.setCreditNumber(expected);
		String actual = test.getCreditNumber();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CreditDTO#getCreditNumber()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetCreditNumber6() {
		CreditDTO test = new CreditDTO();
		String expected = "あいう１２３";

		test.setCreditNumber(expected);
		String actual = test.getCreditNumber();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CreditDTO#getCreditNumber()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetCreditNumber7() {
		CreditDTO test = new CreditDTO();
		String expected = "abc123あいう１２３";

		test.setCreditNumber(expected);
		String actual = test.getCreditNumber();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CreditDTO#getCreditNumber()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetCreditNumber8() {
		CreditDTO test = new CreditDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setCreditNumber(expected);
		String actual = test.getCreditNumber();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CreditDTO#setCreditNumber(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetCreditNumber1() {
		CreditDTO test = new CreditDTO();
		String expected = null;

		test.setCreditNumber(expected);
		String actual = test.getCreditNumber();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CreditDTO#setCreditNumber(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetCreditNumber2() {
		CreditDTO test = new CreditDTO();
		String expected = "";

		test.setCreditNumber(expected);
		String actual = test.getCreditNumber();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CreditDTO#setCreditNumber(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetCreditNumber3() {
		CreditDTO test = new CreditDTO();
		String expected = " ";

		test.setCreditNumber(expected);
		String actual = test.getCreditNumber();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CreditDTO#setCreditNumber(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetCreditNumber4() {
		CreditDTO test = new CreditDTO();
		String expected = "　";

		test.setCreditNumber(expected);
		String actual = test.getCreditNumber();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CreditDTO#setCreditNumber(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetCreditNumber5() {
		CreditDTO test = new CreditDTO();
		String expected = "abc123";

		test.setCreditNumber(expected);
		String actual = test.getCreditNumber();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CreditDTO#setCreditNumber(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetCreditNumber6() {
		CreditDTO test = new CreditDTO();
		String expected = "あいう１２３";

		test.setCreditNumber(expected);
		String actual = test.getCreditNumber();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CreditDTO#setCreditNumber(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetCreditNumber7() {
		CreditDTO test = new CreditDTO();
		String expected = "abc123あいう１２３";

		test.setCreditNumber(expected);
		String actual = test.getCreditNumber();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CreditDTO#setCreditNumber(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetCreditNumber8() {
		CreditDTO test = new CreditDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setCreditNumber(expected);
		String actual = test.getCreditNumber();

		assertEquals(expected, actual);

	}


//  ここからカード名義


	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CreditDTO#getNameE()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetNameE1() {
		CreditDTO test = new CreditDTO();
		String expected = null;

		test.setNameE(expected);
		String actual = test.getNameE();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CreditDTO#getNameE()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetNameE2() {
		CreditDTO test = new CreditDTO();
		String expected = "";

		test.setNameE(expected);
		String actual = test.getNameE();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CreditDTO#getNameE()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetNameE3() {
		CreditDTO test = new CreditDTO();
		String expected = " ";

		test.setNameE(expected);
		String actual = test.getNameE();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CreditDTO#getNameE()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetNameE4() {
		CreditDTO test = new CreditDTO();
		String expected = "　";

		test.setNameE(expected);
		String actual = test.getNameE();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CreditDTO#getNameE()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetNameE5() {
		CreditDTO test = new CreditDTO();
		String expected = "abc123";

		test.setNameE(expected);
		String actual = test.getNameE();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CreditDTO#getNameE()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetNameE6() {
		CreditDTO test = new CreditDTO();
		String expected = "あいう１２３";

		test.setNameE(expected);
		String actual = test.getNameE();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CreditDTO#getNameE()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetNameE7() {
		CreditDTO test = new CreditDTO();
		String expected = "abc123あいう１２３";

		test.setNameE(expected);
		String actual = test.getNameE();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CreditDTO#getNameE()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetNameE8() {
		CreditDTO test = new CreditDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setNameE(expected);
		String actual = test.getNameE();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CreditDTO#setNameE(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetNameE1() {
		CreditDTO test = new CreditDTO();
		String expected = null;

		test.setNameE(expected);
		String actual = test.getNameE();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CreditDTO#setNameE(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetNameE2() {
		CreditDTO test = new CreditDTO();
		String expected = "";

		test.setNameE(expected);
		String actual = test.getNameE();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CreditDTO#setNameE(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetNameE3() {
		CreditDTO test = new CreditDTO();
		String expected = " ";

		test.setNameE(expected);
		String actual = test.getNameE();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CreditDTO#setNameE(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetNameE4() {
		CreditDTO test = new CreditDTO();
		String expected = "　";

		test.setNameE(expected);
		String actual = test.getNameE();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CreditDTO#setNameE(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetNameE5() {
		CreditDTO test = new CreditDTO();
		String expected = "abc123";

		test.setNameE(expected);
		String actual = test.getNameE();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CreditDTO#setNameE(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetNameE6() {
		CreditDTO test = new CreditDTO();
		String expected = "あいう１２３";

		test.setNameE(expected);
		String actual = test.getNameE();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CreditDTO#setNameE(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetNameE7() {
		CreditDTO test = new CreditDTO();
		String expected = "abc123あいう１２３";

		test.setNameE(expected);
		String actual = test.getNameE();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CreditDTO#setNameE(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetNameE8() {
		CreditDTO test = new CreditDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setNameE(expected);
		String actual = test.getNameE();

		assertEquals(expected, actual);

	}

//ここからセキュリティコード
	@Test
	public void testGetSecurityCode1() {
		CreditDTO test = new CreditDTO();
		int expected = 0;

		test.setSecurityCode(expected);

		assertEquals(expected, test.getSecurityCode());
	}

	@Test
	public void testGetSecurityCode2() {
		CreditDTO test = new CreditDTO();
		int expected = 2147483647;

		test.setSecurityCode(expected);

		assertEquals(expected, test.getSecurityCode());
	}

	@Test
	public void testGetSecurityCode3() {
		CreditDTO test = new CreditDTO();
		int expected = -2147483648;

		test.setSecurityCode(expected);

		assertEquals(expected, test.getSecurityCode());
	}

	@Test
	public void testGetSecurityCode4() {
		CreditDTO test = new CreditDTO();
		try {
			int UserIdMin = Integer.parseInt("2147483648");
			test.setSecurityCode(UserIdMin);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	@Test
	public void testGetSecurityCode5() {
		CreditDTO test = new CreditDTO();
		try {
			int UserIdMin = Integer.parseInt("-2147483649");
			test.setSecurityCode(UserIdMin);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

	@Test
	public void testSetSecurityCode1() {
		CreditDTO test = new CreditDTO();
		int expected = 0;

		test.setSecurityCode(expected);
		int actual = test.getSecurityCode();

		assertEquals(expected, actual);
	}

	public void testSetSecurityCode2() {
		CreditDTO test = new CreditDTO();
		int expected = 2147483647;

		test.setSecurityCode(expected);
		int actual = test.getSecurityCode();

		assertEquals(expected, actual);
	}

	public void testSetSecurityCode3() {
		CreditDTO test = new CreditDTO();
		int expected = -2147483648;

		test.setSecurityCode(expected);
		int actual = test.getSecurityCode();

		assertEquals(expected, actual);
	}

	public void testSetSecurityCode4() {
		CreditDTO test = new CreditDTO();
		try {
			int UserIdMax = Integer.parseInt("2147483648");
			test.setSecurityCode(UserIdMax);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	public void testSetSecurityCode5() {
		CreditDTO test = new CreditDTO();
		try {
			int UserIdMax = Integer.parseInt("-2147483649");
			test.setSecurityCode(UserIdMax);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}


	//ここから有効期限（月）


	@Test
	public void testGetExpirationMonth1() {
		CreditDTO test = new CreditDTO();
		int expected = 0;

		test.setExpirationMonth(expected);

		assertEquals(expected, test.getExpirationMonth());
	}

	public void testGetExpirationMonth2() {
		CreditDTO test = new CreditDTO();
		int expected = 2147483647;

		test.setExpirationMonth(expected);

		assertEquals(expected, test.getExpirationMonth());
	}

	public void testGetExpirationMonth3() {
		CreditDTO test = new CreditDTO();
		int expected = -2147483648;

		test.setExpirationMonth(expected);

		assertEquals(expected, test.getExpirationMonth());
	}

	public void testGetExpirationMonth4() {
		CreditDTO test = new CreditDTO();
		try {
			int UserIdMin = Integer.parseInt("2147483648");
			test.setExpirationMonth(UserIdMin);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	public void testGetExpirationMonth5() {
		CreditDTO test = new CreditDTO();
		try {
			int UserIdMin = Integer.parseInt("-2147483649");
			test.setExpirationMonth(UserIdMin);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}


	@Test
	public void testSetExpirationMonth1() {
		CreditDTO test = new CreditDTO();
		int expected = 0;

		test.setExpirationMonth(expected);

		assertEquals(expected, test.getExpirationMonth());
	}

	public void testSetExpirationMonth2() {
		CreditDTO test = new CreditDTO();
		int expected = 2147483647;

		test.setExpirationMonth(expected);

		assertEquals(expected, test.getExpirationMonth());
	}

	public void testSetExpirationMonth3() {
		CreditDTO test = new CreditDTO();
		int expected = -2147483648;

		test.setExpirationMonth(expected);

		assertEquals(expected, test.getExpirationMonth());
	}

	public void testSetExpirationMonth4() {
		CreditDTO test = new CreditDTO();
		try {
			int UserIdMin = Integer.parseInt("2147483648");
			test.setExpirationMonth(UserIdMin);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	public void testSetExpirationMonth5() {
		CreditDTO test = new CreditDTO();
		try {
			int UserIdMin = Integer.parseInt("-2147483649");
			test.setExpirationMonth(UserIdMin);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}




	//ここから有効期限（年）


	@Test
	public void testGetExpirationYear1() {
		CreditDTO test = new CreditDTO();
		int expected = 0;

		test.setExpirationYear(expected);

		assertEquals(expected, test.getExpirationYear());
	}

	public void testGetExpirationYear2() {
		CreditDTO test = new CreditDTO();
		int expected = 2147483647;

		test.setExpirationYear(expected);

		assertEquals(expected, test.getExpirationYear());
	}

	public void testGetExpirationYear3() {
		CreditDTO test = new CreditDTO();
		int expected = -2147483648;

		test.setExpirationYear(expected);

		assertEquals(expected, test.getExpirationYear());
	}

	public void testGetExpirationYear4() {
		CreditDTO test = new CreditDTO();
		try {
			int UserIdMin = Integer.parseInt("2147483648");
			test.setExpirationYear(UserIdMin);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	public void testGetExpirationYear5() {
		CreditDTO test = new CreditDTO();
		try {
			int UserIdMin = Integer.parseInt("-2147483649");
			test.setExpirationYear(UserIdMin);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}


	@Test
	public void testSetExpirationYear1() {
		CreditDTO test = new CreditDTO();
		int expected = 0;

		test.setExpirationYear(expected);

		assertEquals(expected, test.getExpirationYear());
	}

	public void testSetExpirationYear2() {
		CreditDTO test = new CreditDTO();
		int expected = 2147483647;

		test.setExpirationYear(expected);

		assertEquals(expected, test.getExpirationYear());
	}

	public void testSetExpirationYear3() {
		CreditDTO test = new CreditDTO();
		int expected = -2147483648;

		test.setExpirationYear(expected);

		assertEquals(expected, test.getExpirationYear());
	}

	public void testSetExpirationYear4() {
		CreditDTO test = new CreditDTO();
		try {
			int UserIdMin = Integer.parseInt("2147483648");
			test.setExpirationYear(UserIdMin);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	public void testSetExpirationYear5() {
		CreditDTO test = new CreditDTO();
		try {
			int UserIdMin = Integer.parseInt("-2147483649");
			test.setExpirationYear(UserIdMin);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}


	//ここからクレジット種類

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CreditDTO#getCreditType()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetCreditType1() {
		CreditDTO test = new CreditDTO();
		String expected = null;

		test.setCreditType(expected);
		String actual = test.getCreditType();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CreditDTO#getCreditType()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetCreditType2() {
		CreditDTO test = new CreditDTO();
		String expected = "";

		test.setCreditType(expected);
		String actual = test.getCreditType();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CreditDTO#getCreditType()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetCreditType3() {
		CreditDTO test = new CreditDTO();
		String expected = " ";

		test.setCreditType(expected);
		String actual = test.getCreditType();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CreditDTO#getCreditType()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetCreditType4() {
		CreditDTO test = new CreditDTO();
		String expected = "　";

		test.setCreditType(expected);
		String actual = test.getCreditType();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CreditDTO#getCreditType()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetCreditType5() {
		CreditDTO test = new CreditDTO();
		String expected = "abc123";

		test.setCreditType(expected);
		String actual = test.getCreditType();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CreditDTO#getCreditType()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetCreditType6() {
		CreditDTO test = new CreditDTO();
		String expected = "あいう１２３";

		test.setCreditType(expected);
		String actual = test.getCreditType();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CreditDTO#getCreditType()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetCreditType7() {
		CreditDTO test = new CreditDTO();
		String expected = "abc123あいう１２３";

		test.setCreditType(expected);
		String actual = test.getCreditType();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CreditDTO#getCreditType()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetCreditType8() {
		CreditDTO test = new CreditDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setCreditType(expected);
		String actual = test.getCreditType();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CreditDTO#setCreditType(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetCreditType1() {
		CreditDTO test = new CreditDTO();
		String expected = null;

		test.setCreditType(expected);
		String actual = test.getCreditType();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CreditDTO#setCreditType(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetCreditType2() {
		CreditDTO test = new CreditDTO();
		String expected = "";

		test.setCreditType(expected);
		String actual = test.getCreditType();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CreditDTO#setCreditType(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetCreditType3() {
		CreditDTO test = new CreditDTO();
		String expected = " ";

		test.setCreditType(expected);
		String actual = test.getCreditType();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CreditDTO#setCreditType(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetCreditType4() {
		CreditDTO test = new CreditDTO();
		String expected = "　";

		test.setCreditType(expected);
		String actual = test.getCreditType();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CreditDTO#setCreditType(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetCreditType5() {
		CreditDTO test = new CreditDTO();
		String expected = "abc123";

		test.setCreditType(expected);
		String actual = test.getCreditType();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CreditDTO#setCreditType(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetCreditType6() {
		CreditDTO test = new CreditDTO();
		String expected = "あいう１２３";

		test.setCreditType(expected);
		String actual = test.getCreditType();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CreditDTO#setCreditType(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetCreditType7() {
		CreditDTO test = new CreditDTO();
		String expected = "abc123あいう１２３";

		test.setCreditType(expected);
		String actual = test.getCreditType();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CreditDTO#setCreditType(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetCreditType8() {
		CreditDTO test = new CreditDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setCreditType(expected);
		String actual = test.getCreditType();

		assertEquals(expected, actual);

	}


	//ここから姓
	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CreditDTO#getLastName()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetLastName1() {
		CreditDTO test = new CreditDTO();
		String expected = null;

		test.setLastName(expected);
		String actual = test.getLastName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CreditDTO#getLastName()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetLastName2() {
		CreditDTO test = new CreditDTO();
		String expected = "";

		test.setLastName(expected);
		String actual = test.getLastName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CreditDTO#getLastName()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetLastName3() {
		CreditDTO test = new CreditDTO();
		String expected = " ";

		test.setLastName(expected);
		String actual = test.getLastName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CreditDTO#getLastName()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetLastName4() {
		CreditDTO test = new CreditDTO();
		String expected = "　";

		test.setLastName(expected);
		String actual = test.getLastName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CreditDTO#getLastName()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetLastName5() {
		CreditDTO test = new CreditDTO();
		String expected = "abc123";

		test.setLastName(expected);
		String actual = test.getLastName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CreditDTO#getLastName()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetLastName6() {
		CreditDTO test = new CreditDTO();
		String expected = "あいう１２３";

		test.setLastName(expected);
		String actual = test.getLastName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CreditDTO#getLastName()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetLastName7() {
		CreditDTO test = new CreditDTO();
		String expected = "abc123あいう１２３";

		test.setLastName(expected);
		String actual = test.getLastName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CreditDTO#getLastName()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetLastName8() {
		CreditDTO test = new CreditDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setLastName(expected);
		String actual = test.getLastName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CreditDTO#setLastName(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetLastName1() {
		CreditDTO test = new CreditDTO();
		String expected = null;

		test.setLastName(expected);
		String actual = test.getLastName();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CreditDTO#setLastName(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetLastName2() {
		CreditDTO test = new CreditDTO();
		String expected = "";

		test.setLastName(expected);
		String actual = test.getLastName();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CreditDTO#setLastName(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetLastName3() {
		CreditDTO test = new CreditDTO();
		String expected = " ";

		test.setLastName(expected);
		String actual = test.getLastName();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CreditDTO#setLastName(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetLastName4() {
		CreditDTO test = new CreditDTO();
		String expected = "　";

		test.setLastName(expected);
		String actual = test.getLastName();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CreditDTO#setLastName(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetLastName5() {
		CreditDTO test = new CreditDTO();
		String expected = "abc123";

		test.setLastName(expected);
		String actual = test.getLastName();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CreditDTO#setLastName(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetLastName6() {
		CreditDTO test = new CreditDTO();
		String expected = "あいう１２３";

		test.setLastName(expected);
		String actual = test.getLastName();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CreditDTO#setLastName(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetLastName7() {
		CreditDTO test = new CreditDTO();
		String expected = "abc123あいう１２３";

		test.setLastName(expected);
		String actual = test.getLastName();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CreditDTO#setLastName(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetLastName8() {
		CreditDTO test = new CreditDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setLastName(expected);
		String actual = test.getLastName();

		assertEquals(expected, actual);

	}


	//ここから名
	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CreditDTO#getFirstName()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetFirstName1() {
		CreditDTO test = new CreditDTO();
		String expected = null;

		test.setFirstName(expected);
		String actual = test.getFirstName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CreditDTO#getFirstName()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetFirstName2() {
		CreditDTO test = new CreditDTO();
		String expected = "";

		test.setFirstName(expected);
		String actual = test.getFirstName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CreditDTO#getFirstName()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetFirstName3() {
		CreditDTO test = new CreditDTO();
		String expected = " ";

		test.setFirstName(expected);
		String actual = test.getFirstName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CreditDTO#getFirstName()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetFirstName4() {
		CreditDTO test = new CreditDTO();
		String expected = "　";

		test.setFirstName(expected);
		String actual = test.getFirstName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CreditDTO#getFirstName()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetFirstName5() {
		CreditDTO test = new CreditDTO();
		String expected = "abc123";

		test.setFirstName(expected);
		String actual = test.getFirstName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CreditDTO#getFirstName()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetFirstName6() {
		CreditDTO test = new CreditDTO();
		String expected = "あいう１２３";

		test.setFirstName(expected);
		String actual = test.getFirstName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CreditDTO#getFirstName()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetFirstName7() {
		CreditDTO test = new CreditDTO();
		String expected = "abc123あいう１２３";

		test.setFirstName(expected);
		String actual = test.getFirstName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CreditDTO#getFirstName()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetFirstName8() {
		CreditDTO test = new CreditDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setFirstName(expected);
		String actual = test.getFirstName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CreditDTO#setFirstName(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetFirstName1() {
		CreditDTO test = new CreditDTO();
		String expected = null;

		test.setFirstName(expected);
		String actual = test.getFirstName();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CreditDTO#setFirstName(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetFirstName2() {
		CreditDTO test = new CreditDTO();
		String expected = "";

		test.setFirstName(expected);
		String actual = test.getFirstName();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CreditDTO#setFirstName(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetFirstName3() {
		CreditDTO test = new CreditDTO();
		String expected = " ";

		test.setFirstName(expected);
		String actual = test.getFirstName();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CreditDTO#setFirstName(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetFirstName4() {
		CreditDTO test = new CreditDTO();
		String expected = "　";

		test.setFirstName(expected);
		String actual = test.getFirstName();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CreditDTO#setFirstName(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetFirstName5() {
		CreditDTO test = new CreditDTO();
		String expected = "abc123";

		test.setFirstName(expected);
		String actual = test.getFirstName();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CreditDTO#setFirstName(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetFirstName6() {
		CreditDTO test = new CreditDTO();
		String expected = "あいう１２３";

		test.setFirstName(expected);
		String actual = test.getFirstName();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CreditDTO#setFirstName(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetFirstName7() {
		CreditDTO test = new CreditDTO();
		String expected = "abc123あいう１２３";

		test.setFirstName(expected);
		String actual = test.getFirstName();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CreditDTO#setFirstName(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetFirstName8() {
		CreditDTO test = new CreditDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setFirstName(expected);
		String actual = test.getFirstName();

		assertEquals(expected, actual);

	}


	//ここからクレジットカード下４ケタ
	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CreditDTO#getCreditNumberDown()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetCreditNumberDown1() {
		CreditDTO test = new CreditDTO();
		String expected = null;

		test.setCreditNumberDown(expected);
		String actual = test.getCreditNumberDown();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CreditDTO#getCreditNumberDown()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetCreditNumberDown2() {
		CreditDTO test = new CreditDTO();
		String expected = "";

		test.setCreditNumberDown(expected);
		String actual = test.getCreditNumberDown();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CreditDTO#getCreditNumberDown()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetCreditNumberDown3() {
		CreditDTO test = new CreditDTO();
		String expected = " ";

		test.setCreditNumberDown(expected);
		String actual = test.getCreditNumberDown();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CreditDTO#getCreditNumberDown()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetCreditNumberDown4() {
		CreditDTO test = new CreditDTO();
		String expected = "　";

		test.setCreditNumberDown(expected);
		String actual = test.getCreditNumberDown();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CreditDTO#getCreditNumberDown()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetCreditNumberDown5() {
		CreditDTO test = new CreditDTO();
		String expected = "abc123";

		test.setCreditNumberDown(expected);
		String actual = test.getCreditNumberDown();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CreditDTO#getCreditNumberDown()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetCreditNumberDown6() {
		CreditDTO test = new CreditDTO();
		String expected = "あいう１２３";

		test.setCreditNumberDown(expected);
		String actual = test.getCreditNumberDown();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CreditDTO#getCreditNumberDown()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetCreditNumberDown7() {
		CreditDTO test = new CreditDTO();
		String expected = "abc123あいう１２３";

		test.setCreditNumberDown(expected);
		String actual = test.getCreditNumberDown();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CreditDTO#getCreditNumberDown()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetCreditNumberDown8() {
		CreditDTO test = new CreditDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setCreditNumberDown(expected);
		String actual = test.getCreditNumberDown();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CreditDTO#setCreditNumberDown(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetCreditNumberDown1() {
		CreditDTO test = new CreditDTO();
		String expected = null;

		test.setCreditNumberDown(expected);
		String actual = test.getCreditNumberDown();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CreditDTO#setCreditNumberDown(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetCreditNumberDown2() {
		CreditDTO test = new CreditDTO();
		String expected = "";

		test.setCreditNumberDown(expected);
		String actual = test.getCreditNumberDown();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CreditDTO#setCreditNumberDown(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetCreditNumberDown3() {
		CreditDTO test = new CreditDTO();
		String expected = " ";

		test.setCreditNumberDown(expected);
		String actual = test.getCreditNumberDown();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CreditDTO#setCreditNumberDown(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetCreditNumberDown4() {
		CreditDTO test = new CreditDTO();
		String expected = "　";

		test.setCreditNumberDown(expected);
		String actual = test.getCreditNumberDown();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CreditDTO#setCreditNumberDown(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetCreditNumberDown5() {
		CreditDTO test = new CreditDTO();
		String expected = "abc123";

		test.setCreditNumberDown(expected);
		String actual = test.getCreditNumberDown();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CreditDTO#setCreditNumberDown(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetCreditNumberDown6() {
		CreditDTO test = new CreditDTO();
		String expected = "あいう１２３";

		test.setCreditNumberDown(expected);
		String actual = test.getCreditNumberDown();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CreditDTO#setCreditNumberDown(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetCreditNumberDown7() {
		CreditDTO test = new CreditDTO();
		String expected = "abc123あいう１２３";

		test.setCreditNumberDown(expected);
		String actual = test.getCreditNumberDown();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CreditDTO#setCreditNumberDown(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetCreditNumberDown8() {
		CreditDTO test = new CreditDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setCreditNumberDown(expected);
		String actual = test.getCreditNumberDown();

		assertEquals(expected, actual);

	}

//  ここから登録日


	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CreditDTO#getCreatedAt()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetCreatedAt1() {
		CreditDTO test = new CreditDTO();
		String expected = null;

		test.setCreatedAt(expected);
		String actual = test.getCreatedAt();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CreditDTO#getCreatedAt()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetCreatedAt2() {
		CreditDTO test = new CreditDTO();
		String expected = "";

		test.setCreatedAt(expected);
		String actual = test.getCreatedAt();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CreditDTO#getCreatedAt()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetCreatedAt3() {
		CreditDTO test = new CreditDTO();
		String expected = " ";

		test.setCreatedAt(expected);
		String actual = test.getCreatedAt();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CreditDTO#getCreatedAt()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetCreatedAt4() {
		CreditDTO test = new CreditDTO();
		String expected = "　";

		test.setCreatedAt(expected);
		String actual = test.getCreatedAt();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CreditDTO#getCreatedAt()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetCreatedAt5() {
		CreditDTO test = new CreditDTO();
		String expected = "abc123";

		test.setCreatedAt(expected);
		String actual = test.getCreatedAt();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CreditDTO#getCreatedAt()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetCreatedAt6() {
		CreditDTO test = new CreditDTO();
		String expected = "あいう１２３";

		test.setCreatedAt(expected);
		String actual = test.getCreatedAt();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CreditDTO#getCreatedAt()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetCreatedAt7() {
		CreditDTO test = new CreditDTO();
		String expected = "abc123あいう１２３";

		test.setCreatedAt(expected);
		String actual = test.getCreatedAt();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CreditDTO#getCreatedAt()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetCreatedAt8() {
		CreditDTO test = new CreditDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setCreatedAt(expected);
		String actual = test.getCreatedAt();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CreditDTO#setCreatedAt(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetCreatedAt1() {
		CreditDTO test = new CreditDTO();
		String expected = null;

		test.setCreatedAt(expected);
		String actual = test.getCreatedAt();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CreditDTO#setCreatedAt(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetCreatedAt2() {
		CreditDTO test = new CreditDTO();
		String expected = "";

		test.setCreatedAt(expected);
		String actual = test.getCreatedAt();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CreditDTO#setCreatedAt(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetCreatedAt3() {
		CreditDTO test = new CreditDTO();
		String expected = " ";

		test.setCreatedAt(expected);
		String actual = test.getCreatedAt();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CreditDTO#setCreatedAt(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetCreatedAt4() {
		CreditDTO test = new CreditDTO();
		String expected = "　";

		test.setCreatedAt(expected);
		String actual = test.getCreatedAt();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CreditDTO#setCreatedAt(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetCreatedAt5() {
		CreditDTO test = new CreditDTO();
		String expected = "abc123";

		test.setCreatedAt(expected);
		String actual = test.getCreatedAt();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CreditDTO#setCreatedAt(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetCreatedAt6() {
		CreditDTO test = new CreditDTO();
		String expected = "あいう１２３";

		test.setCreatedAt(expected);
		String actual = test.getCreatedAt();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CreditDTO#setCreatedAt(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetCreatedAt7() {
		CreditDTO test = new CreditDTO();
		String expected = "abc123あいう１２３";

		test.setCreatedAt(expected);
		String actual = test.getCreatedAt();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CreditDTO#setCreatedAt(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetCreatedAt8() {
		CreditDTO test = new CreditDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setCreatedAt(expected);
		String actual = test.getCreatedAt();

		assertEquals(expected, actual);

	}

//  ここから更新日


	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CreditDTO#getUpdatedAt()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetUpdatedAt1() {
		CreditDTO test = new CreditDTO();
		String expected = null;

		test.setUpdatedAt(expected);
		String actual = test.getUpdatedAt();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CreditDTO#getUpdatedAt()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetUpdatedAt2() {
		CreditDTO test = new CreditDTO();
		String expected = "";

		test.setUpdatedAt(expected);
		String actual = test.getUpdatedAt();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CreditDTO#getUpdatedAt()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetUpdatedAt3() {
		CreditDTO test = new CreditDTO();
		String expected = " ";

		test.setUpdatedAt(expected);
		String actual = test.getUpdatedAt();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CreditDTO#getUpdatedAt()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetUpdatedAt4() {
		CreditDTO test = new CreditDTO();
		String expected = "　";

		test.setUpdatedAt(expected);
		String actual = test.getUpdatedAt();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CreditDTO#getUpdatedAt()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetUpdatedAt5() {
		CreditDTO test = new CreditDTO();
		String expected = "abc123";

		test.setUpdatedAt(expected);
		String actual = test.getUpdatedAt();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CreditDTO#getUpdatedAt()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetUpdatedAt6() {
		CreditDTO test = new CreditDTO();
		String expected = "あいう１２３";

		test.setUpdatedAt(expected);
		String actual = test.getUpdatedAt();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CreditDTO#getUpdatedAt()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetUpdatedAt7() {
		CreditDTO test = new CreditDTO();
		String expected = "abc123あいう１２３";

		test.setUpdatedAt(expected);
		String actual = test.getUpdatedAt();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CreditDTO#getUpdatedAt()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetUpdatedAt8() {
		CreditDTO test = new CreditDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setUpdatedAt(expected);
		String actual = test.getUpdatedAt();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CreditDTO#setUpdatedAt(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetUpdatedAt1() {
		CreditDTO test = new CreditDTO();
		String expected = null;

		test.setUpdatedAt(expected);
		String actual = test.getUpdatedAt();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CreditDTO#setUpdatedAt(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetUpdatedAt2() {
		CreditDTO test = new CreditDTO();
		String expected = "";

		test.setUpdatedAt(expected);
		String actual = test.getUpdatedAt();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CreditDTO#setUpdatedAt(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetUpdatedAt3() {
		CreditDTO test = new CreditDTO();
		String expected = " ";

		test.setUpdatedAt(expected);
		String actual = test.getUpdatedAt();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CreditDTO#setUpdatedAt(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetUpdatedAt4() {
		CreditDTO test = new CreditDTO();
		String expected = "　";

		test.setUpdatedAt(expected);
		String actual = test.getUpdatedAt();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CreditDTO#setUpdatedAt(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetUpdatedAt5() {
		CreditDTO test = new CreditDTO();
		String expected = "abc123";

		test.setUpdatedAt(expected);
		String actual = test.getUpdatedAt();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CreditDTO#setUpdatedAt(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetUpdatedAt6() {
		CreditDTO test = new CreditDTO();
		String expected = "あいう１２３";

		test.setUpdatedAt(expected);
		String actual = test.getUpdatedAt();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CreditDTO#setUpdatedAt(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetUpdatedAt7() {
		CreditDTO test = new CreditDTO();
		String expected = "abc123あいう１２３";

		test.setUpdatedAt(expected);
		String actual = test.getUpdatedAt();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CreditDTO#setUpdatedAt(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetUpdatedAt8() {
		CreditDTO test = new CreditDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setUpdatedAt(expected);
		String actual = test.getUpdatedAt();

		assertEquals(expected, actual);

	}


}