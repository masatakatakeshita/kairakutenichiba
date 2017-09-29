package com.internousdev.kairakutenichiba.dto.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.internousdev.kairakutenichiba.dto.PaymentDTO;

public class PaymentDTOTest {





	/**
	 * {@link com.internousdev.kairakutenichiba.dto.PaymentDTO#getCreditId()}
	 *  のためのテスト・メソッド。
	 */
	@Test
	public void testGetCreditType1() {
		PaymentDTO test = new PaymentDTO();
		String expected = 0;

		test.setCreditType(expected);

		assertEquals(expected, test.getCreditType());

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.PaymentDTO#getCreditId()}
	 *  のためのテスト・メソッド。
	 */
	@Test
	public void testGetCreditId2() {
		PaymentDTO test = new PaymentDTO();
		int expected = 2147483647;

		test.setCreditId(expected);

		assertEquals(expected, test.getCreditId());
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.PaymentDTO#getCreditId()}
	 *  のためのテスト・メソッド。
	 */
	@Test
	public void testGetCreditId3() {
		PaymentDTO test = new PaymentDTO();
		int expected = -2147483648;

		test.setCreditId(expected);

		assertEquals(expected, test.getCreditId());
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.PaymentDTO#getCreditId()}
	 *  のためのテスト・メソッド。
	 */
	@Test
	public void testGetCreditId4() {
		PaymentDTO test = new PaymentDTO();
		try {
			int CreditIdMin = Integer.parseInt("2147483648");
			test.setCreditId(CreditIdMin);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.PaymentDTO#getCreditId()}
	 *  のためのテスト・メソッド。
	 */
	@Test
	public void testGetCreditId5() {
		PaymentDTO test = new PaymentDTO();
		try {
			int CreditIdMin = Integer.parseInt("-2147483649");
			test.setCreditId(CreditIdMin);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}


	/**
	 * {@link com.internousdev.kairakutenichiba.dto.PaymentDTO#setCreditId(int)}
	 *  のためのテスト・メソッド。
	 */
	@Test
	public void testSetCreditId1() {
		PaymentDTO test = new PaymentDTO();
		int expected = 0;

		test.setCreditId(expected);
		int actual = test.getCreditId();

		assertEquals(expected, actual);
	}


	/**
	 * {@link com.internousdev.kairakutenichiba.dto.PaymentDTO#setCreditId(int)}
	 *  のためのテスト・メソッド。
	 */
	@Test
	public void testSetCreditId2() {
		PaymentDTO test = new PaymentDTO();
		int expected = 2147483647;

		test.setCreditId(expected);
		int actual = test.getCreditId();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.PaymentDTO#setCreditId(int)}
	 *  のためのテスト・メソッド。
	 */
	@Test
	public void testSetCreditId3() {
		PaymentDTO test = new PaymentDTO();
		int expected = -2147483648;

		test.setCreditId(expected);
		int actual = test.getCreditId();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.PaymentDTO#setCreditId(int)}
	 *  のためのテスト・メソッド。
	 */
	@Test
	public void testSetCreditId4() {
		PaymentDTO test = new PaymentDTO();
		try {
			int CreditIdMax = Integer.parseInt("2147483648");
			test.setCreditId(CreditIdMax);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.PaymentDTO#setCreditId(int)}
	 *  のためのテスト・メソッド。
	 */
	@Test
	public void testSetCreditId5() {
		PaymentDTO test = new PaymentDTO();
		try {
			int CreditIdMax = Integer.parseInt("-2147483649");
			test.setCreditId(CreditIdMax);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.PaymentDTO#getCreditNumber()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetCreditNumber1() {
		PaymentDTO test = new PaymentDTO();
		String expected = null;

		test.setCreditNumber(expected);
		String actual = test.getCreditNumber();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.PaymentDTO#getCreditNumber()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetCreditNumber2() {
		PaymentDTO test = new PaymentDTO();
		String expected = "";

		test.setCreditNumber(expected);
		String actual = test.getCreditNumber();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.PaymentDTO#getCreditNumber()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetCreditNumber3() {
		PaymentDTO test = new PaymentDTO();
		String expected = " ";

		test.setCreditNumber(expected);
		String actual = test.getCreditNumber();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.PaymentDTO#getCreditNumber()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetCreditNumber4() {
		PaymentDTO test = new PaymentDTO();
		String expected = "　";

		test.setCreditNumber(expected);
		String actual = test.getCreditNumber();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.PaymentDTO#getCreditNumber()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetCreditNumber5() {
		PaymentDTO test = new PaymentDTO();
		String expected = "abc123";

		test.setCreditNumber(expected);
		String actual = test.getCreditNumber();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.PaymentDTO#getCreditNumber()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetCreditNumber6() {
		PaymentDTO test = new PaymentDTO();
		String expected = "あいう１２３";

		test.setCreditNumber(expected);
		String actual = test.getCreditNumber();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.PaymentDTO#getCreditNumber()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetCreditNumber7() {
		PaymentDTO test = new PaymentDTO();
		String expected = "abc123あいう１２３";

		test.setCreditNumber(expected);
		String actual = test.getCreditNumber();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.PaymentDTO#getCreditNumber()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetCreditNumber8() {
		PaymentDTO test = new PaymentDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setCreditNumber(expected);
		String actual = test.getCreditNumber();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.PaymentDTO#setCreditNumber(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetCreditNumber1() {
		PaymentDTO test = new PaymentDTO();
		String expected = null;

		test.setCreditNumber(expected);
		String actual = test.getCreditNumber();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.PaymentDTO#setCreditNumber(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetCreditNumber2() {
		PaymentDTO test = new PaymentDTO();
		String expected = "";

		test.setCreditNumber(expected);
		String actual = test.getCreditNumber();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.PaymentDTO#setCreditNumber(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetCreditNumber3() {
		PaymentDTO test = new PaymentDTO();
		String expected = " ";

		test.setCreditNumber(expected);
		String actual = test.getCreditNumber();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.PaymentDTO#setCreditNumber(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetCreditNumber4() {
		PaymentDTO test = new PaymentDTO();
		String expected = "　";

		test.setCreditNumber(expected);
		String actual = test.getCreditNumber();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.PaymentDTO#setCreditNumber(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetCreditNumber5() {
		PaymentDTO test = new PaymentDTO();
		String expected = "abc123";

		test.setCreditNumber(expected);
		String actual = test.getCreditNumber();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.PaymentDTO#setCreditNumber(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetCreditNumber6() {
		PaymentDTO test = new PaymentDTO();
		String expected = "あいう１２３";

		test.setCreditNumber(expected);
		String actual = test.getCreditNumber();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.PaymentDTO#setCreditNumber(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetCreditNumber7() {
		PaymentDTO test = new PaymentDTO();
		String expected = "abc123あいう１２３";

		test.setCreditNumber(expected);
		String actual = test.getCreditNumber();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.PaymentDTO#setCreditNumber(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetCreditNumber8() {
		PaymentDTO test = new PaymentDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setCreditNumber(expected);
		String actual = test.getCreditNumber();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.PaymentDTO#getNameE()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetNameHolder1() {
		PaymentDTO test = new PaymentDTO();
		String expected = null;

		test.setNameHolder(expected);
		String actual = test.getNameHolder();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.PaymentDTO#getNameE()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetNameHolder2() {
		PaymentDTO test = new PaymentDTO();
		String expected = "";

		test.setNameHolder(expected);
		String actual = test.getNameHolder();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.PaymentDTO#getNameE()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetNameHolder3() {
		PaymentDTO test = new PaymentDTO();
		String expected = " ";

		test.setNameHolder(expected);
		String actual = test.getNameHolder();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.PaymentDTO#getNameE()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetNameHolder4() {
		PaymentDTO test = new PaymentDTO();
		String expected = "　";

		test.setNameHolder(expected);
		String actual = test.getNameHolder();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.PaymentDTO#getNameE()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetNameHolder5() {
		PaymentDTO test = new PaymentDTO();
		String expected = "abc123";

		test.setNameHolder(expected);
		String actual = test.getNameHolder();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.PaymentDTO#getNameE()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetNameHolder6() {
		PaymentDTO test = new PaymentDTO();
		String expected = "あいう１２３";

		test.setNameHolder(expected);
		String actual = test.getNameHolder();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.PaymentDTO#getNameE()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetNameHolder7() {
		PaymentDTO test = new PaymentDTO();
		String expected = "abc123あいう１２３";

		test.setNameHolder(expected);
		String actual = test.getNameHolder();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.PaymentDTO#getNameE()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetNameHolder8() {
		PaymentDTO test = new PaymentDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setNameHolder(expected);
		String actual = test.getNameHolder();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.PaymentDTO#setNameE(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetNameHolder1() {
		PaymentDTO test = new PaymentDTO();
		String expected = null;

		test.setNameHolder(expected);
		String actual = test.getNameHolder();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.PaymentDTO#setNameE(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetNameHolder2() {
		PaymentDTO test = new PaymentDTO();
		String expected = "";

		test.setNameHolder(expected);
		String actual = test.getNameHolder();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.PaymentDTO#setNameE(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetNameHolder3() {
		PaymentDTO test = new PaymentDTO();
		String expected = " ";

		test.setNameHolder(expected);
		String actual = test.getNameHolder();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.PaymentDTO#setNameE(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetNameHolder4() {
		PaymentDTO test = new PaymentDTO();
		String expected = "　";

		test.setNameHolder(expected);
		String actual = test.getNameHolder();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.PaymentDTO#setNameE(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetNameHolder5() {
		PaymentDTO test = new PaymentDTO();
		String expected = "abc123";

		test.setNameHolder(expected);
		String actual = test.getNameHolder();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.PaymentDTO#setNameE(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetNameHolder6() {
		PaymentDTO test = new PaymentDTO();
		String expected = "あいう１２３";

		test.setNameHolder(expected);
		String actual = test.getNameHolder();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.PaymentDTO#setNameE(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetNameHolder7() {
		PaymentDTO test = new PaymentDTO();
		String expected = "abc123あいう１２３";

		test.setNameHolder(expected);
		String actual = test.getNameHolder();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.PaymentDTO#setNameE(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetNameHolder8() {
		PaymentDTO test = new PaymentDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setNameHolder(expected);
		String actual = test.getNameHolder();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.PaymentDTO#getSecurityCode()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetSecurityCode1() {
		PaymentDTO test = new PaymentDTO();
		String expected = null;

		test.setSecurityCode(expected);
		String actual = test.getSecurityCode();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.PaymentDTO#getSecurityCode()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetSecurityCode2() {
		PaymentDTO test = new PaymentDTO();
		String expected = "";

		test.setSecurityCode(expected);
		String actual = test.getSecurityCode();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.PaymentDTO#getSecurityCode()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetSecurityCode3() {
		PaymentDTO test = new PaymentDTO();
		String expected = " ";

		test.setSecurityCode(expected);
		String actual = test.getSecurityCode();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.PaymentDTO#getSecurityCode()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetSecurityCode4() {
		PaymentDTO test = new PaymentDTO();
		String expected = "　";

		test.setSecurityCode(expected);
		String actual = test.getSecurityCode();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.PaymentDTO#getSecurityCode()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetSecurityCode5() {
		PaymentDTO test = new PaymentDTO();
		String expected = "abc123";

		test.setSecurityCode(expected);
		String actual = test.getSecurityCode();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.PaymentDTO#getSecurityCode()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetSecurityCode6() {
		PaymentDTO test = new PaymentDTO();
		String expected = "あいう１２３";

		test.setSecurityCode(expected);
		String actual = test.getSecurityCode();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.PaymentDTO#getSecurityCode()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetSecurityCode7() {
		PaymentDTO test = new PaymentDTO();
		String expected = "abc123あいう１２３";

		test.setSecurityCode(expected);
		String actual = test.getSecurityCode();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.PaymentDTO#getSecurityCode()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetSecurityCode8() {
		PaymentDTO test = new PaymentDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setSecurityCode(expected);
		String actual = test.getSecurityCode();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.PaymentDTO#setSecurityCode(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetSecurityCode1() {
		PaymentDTO test = new PaymentDTO();
		String expected = null;

		test.setSecurityCode(expected);
		String actual = test.getSecurityCode();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.PaymentDTO#setSecurityCode(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetSecurityCode2() {
		PaymentDTO test = new PaymentDTO();
		String expected = "";

		test.setSecurityCode(expected);
		String actual = test.getSecurityCode();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.PaymentDTO#setSecurityCode(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetSecurityCode3() {
		PaymentDTO test = new PaymentDTO();
		String expected = " ";

		test.setSecurityCode(expected);
		String actual = test.getSecurityCode();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.PaymentDTO#setSecurityCode(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetSecurityCode4() {
		PaymentDTO test = new PaymentDTO();
		String expected = "　";

		test.setSecurityCode(expected);
		String actual = test.getSecurityCode();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.PaymentDTO#setSecurityCode(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetSecurityCode5() {
		PaymentDTO test = new PaymentDTO();
		String expected = "abc123";

		test.setSecurityCode(expected);
		String actual = test.getSecurityCode();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.PaymentDTO#setSecurityCode(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetSecurityCode6() {
		PaymentDTO test = new PaymentDTO();
		String expected = "あいう１２３";

		test.setSecurityCode(expected);
		String actual = test.getSecurityCode();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.PaymentDTO#setSecurityCode(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetSecurityCode7() {
		PaymentDTO test = new PaymentDTO();
		String expected = "abc123あいう１２３";

		test.setSecurityCode(expected);
		String actual = test.getSecurityCode();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.PaymentDTO#setSecurityCode(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetSecurityCode8() {
		PaymentDTO test = new PaymentDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setSecurityCode(expected);
		String actual = test.getSecurityCode();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.PaymentDTO#getExpirationMonth()}
	 *  のためのテスト・メソッド。
	 */
	@Test
	public void testGetExpirationMonth1() {
		PaymentDTO test = new PaymentDTO();
		int expected = 0;

		test.setExpirationMonth(expected);

		assertEquals(expected, test.getExpirationMonth());

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.PaymentDTO#getExpirationMonth()}
	 *  のためのテスト・メソッド。
	 */
	@Test
	public void testGetExpirationMonth2() {
		PaymentDTO test = new PaymentDTO();
		int expected = 2147483647;

		test.setExpirationMonth(expected);

		assertEquals(expected, test.getExpirationMonth());
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.PaymentDTO#getExpirationMonth()}
	 *  のためのテスト・メソッド。
	 */
	@Test
	public void testGetExpirationMonth3() {
		PaymentDTO test = new PaymentDTO();
		int expected = -2147483648;

		test.setExpirationMonth(expected);

		assertEquals(expected, test.getExpirationMonth());
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.PaymentDTO#getExpirationMonth()}
	 *  のためのテスト・メソッド。
	 */
	@Test
	public void testGetExpirationMonth4() {
		PaymentDTO test = new PaymentDTO();
		try {
			int ExpirationMonthMin = Integer.parseInt("2147483648");
			test.setExpirationMonth(ExpirationMonthMin);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.PaymentDTO#getExpirationMonth()}
	 *  のためのテスト・メソッド。
	 */
	@Test
	public void testGetExpirationMonth5() {
		PaymentDTO test = new PaymentDTO();
		try {
			int ExpirationMonthMin = Integer.parseInt("-2147483649");
			test.setExpirationMonth(ExpirationMonthMin);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.PaymentDTO#setExpirationMonth(int)}
	 *  のためのテスト・メソッド。
	 */
	@Test
	public void testSetExpirationMonth1() {
		PaymentDTO test = new PaymentDTO();
		int expected = 0;

		test.setExpirationMonth(expected);
		int actual = test.getExpirationMonth();

		assertEquals(expected, actual);
	}


	/**
	 * {@link com.internousdev.kairakutenichiba.dto.PaymentDTO#setExpirationMonth(int)}
	 *  のためのテスト・メソッド。
	 */
	@Test
	public void testSetExpirationMonth2() {
		PaymentDTO test = new PaymentDTO();
		int expected = 2147483647;

		test.setExpirationMonth(expected);
		int actual = test.getExpirationMonth();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.PaymentDTO#setExpirationMonth(int)}
	 *  のためのテスト・メソッド。
	 */
	@Test
	public void testSetExpirationMonth3() {
		PaymentDTO test = new PaymentDTO();
		int expected = -2147483648;

		test.setExpirationMonth(expected);
		int actual = test.getExpirationMonth();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.PaymentDTO#setExpirationMonth(int)}
	 *  のためのテスト・メソッド。
	 */
	@Test
	public void testSetExpirationMonth4() {
		PaymentDTO test = new PaymentDTO();
		try {
			int ExpirationMonthMax = Integer.parseInt("2147483648");
			test.setExpirationMonth(ExpirationMonthMax);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.PaymentDTO#setExpirationMonth(int)}
	 *  のためのテスト・メソッド。
	 */
	@Test
	public void testSetExpirationMonth5() {
		PaymentDTO test = new PaymentDTO();
		try {
			int ExpirationMonthMax = Integer.parseInt("-2147483649");
			test.setExpirationMonth(ExpirationMonthMax);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.PaymentDTO#getExpirationYear()}
	 *  のためのテスト・メソッド。
	 */
	@Test
	public void testGetExpirationYear1() {
		PaymentDTO test = new PaymentDTO();
		int expected = 0;

		test.setExpirationYear(expected);

		assertEquals(expected, test.getExpirationYear());

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.PaymentDTO#getExpirationYear()}
	 *  のためのテスト・メソッド。
	 */
	@Test
	public void testGetExpirationYear2() {
		PaymentDTO test = new PaymentDTO();
		int expected = 2147483647;

		test.setExpirationYear(expected);

		assertEquals(expected, test.getExpirationYear());
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.PaymentDTO#getExpirationYear()}
	 *  のためのテスト・メソッド。
	 */
	@Test
	public void testGetExpirationYear3() {
		PaymentDTO test = new PaymentDTO();
		int expected = -2147483648;

		test.setExpirationYear(expected);

		assertEquals(expected, test.getExpirationYear());
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.PaymentDTO#getExpirationYear()}
	 *  のためのテスト・メソッド。
	 */
	@Test
	public void testGetExpirationYear4() {
		PaymentDTO test = new PaymentDTO();
		try {
			int ExpirationYearMin = Integer.parseInt("2147483648");
			test.setExpirationYear(ExpirationYearMin);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.PaymentDTO#getExpirationYear()}
	 *  のためのテスト・メソッド。
	 */
	@Test
	public void testGetExpirationYear5() {
		PaymentDTO test = new PaymentDTO();
		try {
			int ExpirationYearMin = Integer.parseInt("-2147483649");
			test.setExpirationYear(ExpirationYearMin);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}
	/**
	 * {@link com.internousdev.kairakutenichiba.dto.PaymentDTO#setExpirationYear(int)}
	 *  のためのテスト・メソッド。
	 */
	@Test
	public void testSetExpirationYear1() {
		PaymentDTO test = new PaymentDTO();
		int expected = 0;

		test.setExpirationYear(expected);
		int actual = test.getExpirationYear();

		assertEquals(expected, actual);
	}


	/**
	 * {@link com.internousdev.kairakutenichiba.dto.PaymentDTO#setExpirationYear(int)}
	 *  のためのテスト・メソッド。
	 */
	@Test
	public void testSetExpirationYear2() {
		PaymentDTO test = new PaymentDTO();
		int expected = 2147483647;

		test.setExpirationYear(expected);
		int actual = test.getExpirationYear();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.PaymentDTO#setExpirationYear(int)}
	 *  のためのテスト・メソッド。
	 */
	@Test
	public void testSetExpirationYear3() {
		PaymentDTO test = new PaymentDTO();
		int expected = -2147483648;

		test.setExpirationYear(expected);
		int actual = test.getExpirationYear();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.PaymentDTO#setExpirationYear(int)}
	 *  のためのテスト・メソッド。
	 */
	@Test
	public void testSetExpirationYear4() {
		PaymentDTO test = new PaymentDTO();
		try {
			int ExpirationYearMax = Integer.parseInt("2147483648");
			test.setExpirationYear(ExpirationYearMax);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.PaymentDTO#setExpirationYear(int)}
	 *  のためのテスト・メソッド。
	 */

	@Test
	public void testSetExpirationYear5() {
		PaymentDTO test = new PaymentDTO();
		try {
			int ExpirationYearMax = Integer.parseInt("-2147483649");
			test.setExpirationYear(ExpirationYearMax);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}

	}

















}