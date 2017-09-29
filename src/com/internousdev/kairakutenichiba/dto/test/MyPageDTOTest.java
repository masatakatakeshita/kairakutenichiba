package com.internousdev.kairakutenichiba.dto.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.internousdev.kairakutenichiba.dto.MyPageDTO;


public class MyPageDTOTest {



	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#getUserId()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetUserId1() {
		MyPageDTO test = new MyPageDTO();
		int expected = 0;

		test.setUserId(expected);

		assertEquals(expected, test.getUserId());

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#getUserId()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetUserId2() {
		MyPageDTO test = new MyPageDTO();
		int expected = 2147483647;

		test.setUserId(expected);

		assertEquals(expected, test.getUserId());
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#getUserId()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetUserId3() {
		MyPageDTO test = new MyPageDTO();
		int expected = -2147483648;

		test.setUserId(expected);

		assertEquals(expected, test.getUserId());
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#getUserId()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetUserId4() {
		MyPageDTO test = new MyPageDTO();
		try {
			int UserIdMin = Integer.parseInt("2147483648");
			test.setUserId(UserIdMin);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#getUserId()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetUserId5() {
		MyPageDTO test = new MyPageDTO();
		try {
			int UserIdMin = Integer.parseInt("-2147483649");
			test.setUserId(UserIdMin);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}



	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#setUserId(int)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetUserId1() {
		MyPageDTO test = new MyPageDTO();
		int expected = 0;

		test.setUserId(expected);
		int actual = test.getUserId();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#setUserId(int)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetUserId2() {
		MyPageDTO test = new MyPageDTO();
		int expected = 2147483647;

		test.setUserId(expected);
		int actual = test.getUserId();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#setUserId(int)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetUserId3() {
		MyPageDTO test = new MyPageDTO();
		int expected = -2147483648;

		test.setUserId(expected);
		int actual = test.getUserId();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#setUserId(int)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetUserId4() {
		MyPageDTO test = new MyPageDTO();
		try {
			int UserIdMax = Integer.parseInt("2147483648");
			test.setUserId(UserIdMax);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#setUserId(int)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetUserId5() {
		MyPageDTO test = new MyPageDTO();
		try {
			int UserIdMax = Integer.parseInt("-2147483649");
			test.setUserId(UserIdMax);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}

	}



	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#getPassword()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetPassword1() {
		MyPageDTO test = new MyPageDTO();
		String expected = null;

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#getPassword()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetPassword2() {
		MyPageDTO test = new MyPageDTO();
		String expected = "";

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#getPassword()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetPassword3() {
		MyPageDTO test = new MyPageDTO();
		String expected = " ";

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#getPassword()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetPassword4() {
		MyPageDTO test = new MyPageDTO();
		String expected = "　";

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#getPassword()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetPassword5() {
		MyPageDTO test = new MyPageDTO();
		String expected = "abc123";

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#getPassword()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetPassword6() {
		MyPageDTO test = new MyPageDTO();
		String expected = "あいう１２３";

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#getPassword()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetPassword7() {
		MyPageDTO test = new MyPageDTO();
		String expected = "abc123あいう１２３";

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#getPassword()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetPassword8() {
		MyPageDTO test = new MyPageDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#setPassword(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetPassword1() {
		MyPageDTO test = new MyPageDTO();
		String expected = null;

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#setPassword(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetPassword2() {
		MyPageDTO test = new MyPageDTO();
		String expected = "";

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#setPassword(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetPassword3() {
		MyPageDTO test = new MyPageDTO();
		String expected = " ";

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#setPassword(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetPassword4() {
		MyPageDTO test = new MyPageDTO();
		String expected = "　";

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#setPassword(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetPassword5() {
		MyPageDTO test = new MyPageDTO();
		String expected = "abc123";

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#setPassword(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetPassword6() {
		MyPageDTO test = new MyPageDTO();
		String expected = "あいう１２３";

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#setPassword(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetPassword7() {
		MyPageDTO test = new MyPageDTO();
		String expected = "abc123あいう１２３";

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#setPassword(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetPassword8() {
		MyPageDTO test = new MyPageDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected, actual);

	}


	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#getFamilyName()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetFamilyName1() {
		MyPageDTO test = new MyPageDTO();
		String expected = null;

		test.setFamilyName(expected);
		String actual = test.getFamilyName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#getFamilyName()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetFamilyName2() {
		MyPageDTO test = new MyPageDTO();
		String expected = "";

		test.setFamilyName(expected);
		String actual = test.getFamilyName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#getFamilyName()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetFamilyName3() {
		MyPageDTO test = new MyPageDTO();
		String expected = " ";

		test.setFamilyName(expected);
		String actual = test.getFamilyName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#getFamilyName()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetFamilyName4() {
		MyPageDTO test = new MyPageDTO();
		String expected = "　";

		test.setFamilyName(expected);
		String actual = test.getFamilyName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#getFamilyName()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetFamilyName5() {
		MyPageDTO test = new MyPageDTO();
		String expected = "abc123";

		test.setFamilyName(expected);
		String actual = test.getFamilyName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#getFamilyName()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetFamilyName6() {
		MyPageDTO test = new MyPageDTO();
		String expected = "あいう１２３";

		test.setFamilyName(expected);
		String actual = test.getFamilyName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#getFamilyName()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetFamilyName7() {
		MyPageDTO test = new MyPageDTO();
		String expected = "abc123あいう１２３";

		test.setFamilyName(expected);
		String actual = test.getFamilyName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#getFamilyName()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetFamilyName8() {
		MyPageDTO test = new MyPageDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setFamilyName(expected);
		String actual = test.getFamilyName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#setFamilyName(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetFamilyName1() {
		MyPageDTO test = new MyPageDTO();
		String expected = null;

		test.setFamilyName(expected);
		String actual = test.getFamilyName();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#setFamilyName(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetFamilyName2() {
		MyPageDTO test = new MyPageDTO();
		String expected = "";

		test.setFamilyName(expected);
		String actual = test.getFamilyName();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#setFamilyName(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetFamilyName3() {
		MyPageDTO test = new MyPageDTO();
		String expected = " ";

		test.setFamilyName(expected);
		String actual = test.getFamilyName();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#setFamilyName(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetFamilyName4() {
		MyPageDTO test = new MyPageDTO();
		String expected = "　";

		test.setFamilyName(expected);
		String actual = test.getFamilyName();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#setFamilyName(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetFamilyName5() {
		MyPageDTO test = new MyPageDTO();
		String expected = "abc123";

		test.setFamilyName(expected);
		String actual = test.getFamilyName();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#setFamilyName(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetFamilyName6() {
		MyPageDTO test = new MyPageDTO();
		String expected = "あいう１２３";

		test.setFamilyName(expected);
		String actual = test.getFamilyName();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#setFamilyName(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetFamilyName7() {
		MyPageDTO test = new MyPageDTO();
		String expected = "abc123あいう１２３";

		test.setFamilyName(expected);
		String actual = test.getFamilyName();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#setFamilyName(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetFamilyName8() {
		MyPageDTO test = new MyPageDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setFamilyName(expected);
		String actual = test.getFamilyName();

		assertEquals(expected, actual);

	}




	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#getGivenName()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetGivenName1() {
		MyPageDTO test = new MyPageDTO();
		String expected = null;

		test.setGivenName(expected);
		String actual = test.getGivenName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#getGivenName()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetGivenName2() {
		MyPageDTO test = new MyPageDTO();
		String expected = "";

		test.setGivenName(expected);
		String actual = test.getGivenName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#getGivenName()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetGivenName3() {
		MyPageDTO test = new MyPageDTO();
		String expected = " ";

		test.setGivenName(expected);
		String actual = test.getGivenName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#getGivenName()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetGivenName4() {
		MyPageDTO test = new MyPageDTO();
		String expected = "　";

		test.setGivenName(expected);
		String actual = test.getGivenName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#getGivenName()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetGivenName5() {
		MyPageDTO test = new MyPageDTO();
		String expected = "abc123";

		test.setGivenName(expected);
		String actual = test.getGivenName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#getGivenName()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetGivenName6() {
		MyPageDTO test = new MyPageDTO();
		String expected = "あいう１２３";

		test.setGivenName(expected);
		String actual = test.getGivenName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#getGivenName()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetGivenName7() {
		MyPageDTO test = new MyPageDTO();
		String expected = "abc123あいう１２３";

		test.setGivenName(expected);
		String actual = test.getGivenName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#getGivenName()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetGivenName8() {
		MyPageDTO test = new MyPageDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setGivenName(expected);
		String actual = test.getGivenName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#setGivenName(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetGivenName1() {
		MyPageDTO test = new MyPageDTO();
		String expected = null;

		test.setGivenName(expected);
		String actual = test.getGivenName();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#setGivenName(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetGivenName2() {
		MyPageDTO test = new MyPageDTO();
		String expected = "";

		test.setGivenName(expected);
		String actual = test.getGivenName();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#setGivenName(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetGivenName3() {
		MyPageDTO test = new MyPageDTO();
		String expected = " ";

		test.setGivenName(expected);
		String actual = test.getGivenName();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#setGivenName(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetGivenName4() {
		MyPageDTO test = new MyPageDTO();
		String expected = "　";

		test.setGivenName(expected);
		String actual = test.getGivenName();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#setGivenName(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetGivenName5() {
		MyPageDTO test = new MyPageDTO();
		String expected = "abc123";

		test.setGivenName(expected);
		String actual = test.getGivenName();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#setGivenName(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetGivenName6() {
		MyPageDTO test = new MyPageDTO();
		String expected = "あいう１２３";

		test.setGivenName(expected);
		String actual = test.getGivenName();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#setGivenName(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetGivenName7() {
		MyPageDTO test = new MyPageDTO();
		String expected = "abc123あいう１２３";

		test.setGivenName(expected);
		String actual = test.getGivenName();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#setGivenName(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetGivenName8() {
		MyPageDTO test = new MyPageDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setGivenName(expected);
		String actual = test.getGivenName();

		assertEquals(expected, actual);

	}





	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#getFamilyNameKanji()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetFamilyNameKanji1() {
		MyPageDTO test = new MyPageDTO();
		String expected = null;

		test.setFamilyNameKanji(expected);
		String actual = test.getFamilyNameKanji();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#getFamilyNameKanji()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetFamilyNameKanji2() {
		MyPageDTO test = new MyPageDTO();
		String expected = "";

		test.setFamilyNameKanji(expected);
		String actual = test.getFamilyNameKanji();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#getFamilyNameKanji()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetFamilyNameKanji3() {
		MyPageDTO test = new MyPageDTO();
		String expected = " ";

		test.setFamilyNameKanji(expected);
		String actual = test.getFamilyNameKanji();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#getFamilyNameKanji()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetFamilyNameKanji4() {
		MyPageDTO test = new MyPageDTO();
		String expected = "　";

		test.setFamilyNameKanji(expected);
		String actual = test.getFamilyNameKanji();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#getFamilyNameKanji()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetFamilyNameKanji5() {
		MyPageDTO test = new MyPageDTO();
		String expected = "abc123";

		test.setFamilyNameKanji(expected);
		String actual = test.getFamilyNameKanji();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#getFamilyNameKanji()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetFamilyNameKanji6() {
		MyPageDTO test = new MyPageDTO();
		String expected = "あいう１２３";

		test.setFamilyNameKanji(expected);
		String actual = test.getFamilyNameKanji();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#getFamilyNameKanji()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetFamilyNameKanji7() {
		MyPageDTO test = new MyPageDTO();
		String expected = "abc123あいう１２３";

		test.setFamilyNameKanji(expected);
		String actual = test.getFamilyNameKanji();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#getFamilyNameKanji()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetFamilyNameKanji8() {
		MyPageDTO test = new MyPageDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setFamilyNameKanji(expected);
		String actual = test.getFamilyNameKanji();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#setFamilyNameKanji(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetFamilyNameKanji1() {
		MyPageDTO test = new MyPageDTO();
		String expected = null;

		test.setFamilyNameKanji(expected);
		String actual = test.getFamilyNameKanji();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#setFamilyNameKanji(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetFamilyNameKanji2() {
		MyPageDTO test = new MyPageDTO();
		String expected = "";

		test.setFamilyNameKanji(expected);
		String actual = test.getFamilyNameKanji();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#setFamilyNameKanji(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetFamilyNameKanji3() {
		MyPageDTO test = new MyPageDTO();
		String expected = " ";

		test.setFamilyNameKanji(expected);
		String actual = test.getFamilyNameKanji();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#setFamilyNameKanji(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetFamilyNameKanji4() {
		MyPageDTO test = new MyPageDTO();
		String expected = "　";

		test.setFamilyNameKanji(expected);
		String actual = test.getFamilyNameKanji();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#setFamilyNameKanji(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetFamilyNameKanji5() {
		MyPageDTO test = new MyPageDTO();
		String expected = "abc123";

		test.setFamilyNameKanji(expected);
		String actual = test.getFamilyNameKanji();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#setFamilyNameKanji(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetFamilyNameKanji6() {
		MyPageDTO test = new MyPageDTO();
		String expected = "あいう１２３";

		test.setFamilyNameKanji(expected);
		String actual = test.getFamilyNameKanji();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#setFamilyNameKanji(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetFamilyNameKanji7() {
		MyPageDTO test = new MyPageDTO();
		String expected = "abc123あいう１２３";

		test.setFamilyNameKanji(expected);
		String actual = test.getFamilyNameKanji();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#setFamilyNameKanji(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetFamilyNameKanji8() {
		MyPageDTO test = new MyPageDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setFamilyNameKanji(expected);
		String actual = test.getFamilyNameKanji();

		assertEquals(expected, actual);

	}




	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#getFamilyNameKana()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetFamilyNameKana1() {
		MyPageDTO test = new MyPageDTO();
		String expected = null;

		test.setFamilyNameKana(expected);
		String actual = test.getFamilyNameKana();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#getFamilyNameKana()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetFamilyNameKana2() {
		MyPageDTO test = new MyPageDTO();
		String expected = "";

		test.setFamilyNameKana(expected);
		String actual = test.getFamilyNameKana();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#getFamilyNameKana()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetFamilyNameKana3() {
		MyPageDTO test = new MyPageDTO();
		String expected = " ";

		test.setFamilyNameKana(expected);
		String actual = test.getFamilyNameKana();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#getFamilyNameKana()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetFamilyNameKana4() {
		MyPageDTO test = new MyPageDTO();
		String expected = "　";

		test.setFamilyNameKana(expected);
		String actual = test.getFamilyNameKana();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#getFamilyNameKana()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetFamilyNameKana5() {
		MyPageDTO test = new MyPageDTO();
		String expected = "abc123";

		test.setFamilyNameKana(expected);
		String actual = test.getFamilyNameKana();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#getFamilyNameKana()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetFamilyNameKana6() {
		MyPageDTO test = new MyPageDTO();
		String expected = "あいう１２３";

		test.setFamilyNameKana(expected);
		String actual = test.getFamilyNameKana();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#getFamilyNameKana()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetFamilyNameKana7() {
		MyPageDTO test = new MyPageDTO();
		String expected = "abc123あいう１２３";

		test.setFamilyNameKana(expected);
		String actual = test.getFamilyNameKana();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#getFamilyNameKana()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetFamilyNameKana8() {
		MyPageDTO test = new MyPageDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setFamilyNameKana(expected);
		String actual = test.getFamilyNameKana();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#setFamilyNameKana(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetFamilyNameKana1() {
		MyPageDTO test = new MyPageDTO();
		String expected = null;

		test.setFamilyNameKana(expected);
		String actual = test.getFamilyNameKana();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#setFamilyNameKana(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetFamilyNameKana2() {
		MyPageDTO test = new MyPageDTO();
		String expected = "";

		test.setFamilyNameKana(expected);
		String actual = test.getFamilyNameKana();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#setFamilyNameKana(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetFamilyNameKana3() {
		MyPageDTO test = new MyPageDTO();
		String expected = " ";

		test.setFamilyNameKana(expected);
		String actual = test.getFamilyNameKana();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#setFamilyNameKana(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetFamilyNameKana4() {
		MyPageDTO test = new MyPageDTO();
		String expected = "　";

		test.setFamilyNameKana(expected);
		String actual = test.getFamilyNameKana();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#setFamilyNameKana(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetFamilyNameKana5() {
		MyPageDTO test = new MyPageDTO();
		String expected = "abc123";

		test.setFamilyNameKana(expected);
		String actual = test.getFamilyNameKana();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#setFamilyNameKana(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetFamilyNameKana6() {
		MyPageDTO test = new MyPageDTO();
		String expected = "あいう１２３";

		test.setFamilyNameKana(expected);
		String actual = test.getFamilyNameKana();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#setFamilyNameKana(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetFamilyNameKana7() {
		MyPageDTO test = new MyPageDTO();
		String expected = "abc123あいう１２３";

		test.setFamilyNameKana(expected);
		String actual = test.getFamilyNameKana();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#setFamilyNameKana(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetFamilyNameKana8() {
		MyPageDTO test = new MyPageDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setFamilyNameKana(expected);
		String actual = test.getFamilyNameKana();

		assertEquals(expected, actual);

	}




	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#getGivenNameKanji()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetGivenNameKanji1() {
		MyPageDTO test = new MyPageDTO();
		String expected = null;

		test.setGivenNameKanji(expected);
		String actual = test.getGivenNameKanji();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#getGivenNameKanji()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetGivenNameKanji2() {
		MyPageDTO test = new MyPageDTO();
		String expected = "";

		test.setGivenNameKanji(expected);
		String actual = test.getGivenNameKanji();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#getGivenNameKanji()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetGivenNameKanji3() {
		MyPageDTO test = new MyPageDTO();
		String expected = " ";

		test.setGivenNameKanji(expected);
		String actual = test.getGivenNameKanji();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#getGivenNameKanji()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetGivenNameKanji4() {
		MyPageDTO test = new MyPageDTO();
		String expected = "　";

		test.setGivenNameKanji(expected);
		String actual = test.getGivenNameKanji();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#getGivenNameKanji()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetGivenNameKanji5() {
		MyPageDTO test = new MyPageDTO();
		String expected = "abc123";

		test.setGivenNameKanji(expected);
		String actual = test.getGivenNameKanji();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#getGivenNameKanji()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetGivenNameKanji6() {
		MyPageDTO test = new MyPageDTO();
		String expected = "あいう１２３";

		test.setGivenNameKanji(expected);
		String actual = test.getGivenNameKanji();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#getGivenNameKanji()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetGivenNameKanji7() {
		MyPageDTO test = new MyPageDTO();
		String expected = "abc123あいう１２３";

		test.setGivenNameKanji(expected);
		String actual = test.getGivenNameKanji();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#getGivenNameKanji()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetGivenNameKanji8() {
		MyPageDTO test = new MyPageDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setGivenNameKanji(expected);
		String actual = test.getGivenNameKanji();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#setGivenNameKanji(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetGivenNameKanji1() {
		MyPageDTO test = new MyPageDTO();
		String expected = null;

		test.setGivenNameKanji(expected);
		String actual = test.getGivenNameKanji();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#setGivenNameKanji(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetGivenNameKanji2() {
		MyPageDTO test = new MyPageDTO();
		String expected = "";

		test.setGivenNameKanji(expected);
		String actual = test.getGivenNameKanji();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#setGivenNameKanji(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetGivenNameKanji3() {
		MyPageDTO test = new MyPageDTO();
		String expected = " ";

		test.setGivenNameKanji(expected);
		String actual = test.getGivenNameKanji();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#setGivenNameKanji(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetGivenNameKanji4() {
		MyPageDTO test = new MyPageDTO();
		String expected = "　";

		test.setGivenNameKanji(expected);
		String actual = test.getGivenNameKanji();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#setGivenNameKanji(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetGivenNameKanji5() {
		MyPageDTO test = new MyPageDTO();
		String expected = "abc123";

		test.setGivenNameKanji(expected);
		String actual = test.getGivenNameKanji();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#setGivenNameKanji(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetGivenNameKanji6() {
		MyPageDTO test = new MyPageDTO();
		String expected = "あいう１２３";

		test.setGivenNameKanji(expected);
		String actual = test.getGivenNameKanji();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#setGivenNameKanji(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetGivenNameKanji7() {
		MyPageDTO test = new MyPageDTO();
		String expected = "abc123あいう１２３";

		test.setGivenNameKanji(expected);
		String actual = test.getGivenNameKanji();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#setGivenNameKanji(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetGivenNameKanji8() {
		MyPageDTO test = new MyPageDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setGivenNameKanji(expected);
		String actual = test.getGivenNameKanji();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#getGivenNameKana()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetGivenNameKana1() {
		MyPageDTO test = new MyPageDTO();
		String expected = null;

		test.setGivenNameKana(expected);
		String actual = test.getGivenNameKana();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#getGivenNameKana()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetGivenNameKana2() {
		MyPageDTO test = new MyPageDTO();
		String expected = "";

		test.setGivenNameKana(expected);
		String actual = test.getGivenNameKana();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#getGivenNameKana()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetGivenNameKana3() {
		MyPageDTO test = new MyPageDTO();
		String expected = " ";

		test.setGivenNameKana(expected);
		String actual = test.getGivenNameKana();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#getGivenNameKana()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetGivenNameKana4() {
		MyPageDTO test = new MyPageDTO();
		String expected = "　";

		test.setGivenNameKana(expected);
		String actual = test.getGivenNameKana();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#getGivenNameKana()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetGivenNameKana5() {
		MyPageDTO test = new MyPageDTO();
		String expected = "abc123";

		test.setGivenNameKana(expected);
		String actual = test.getGivenNameKana();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#getGivenNameKana()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetGivenNameKana6() {
		MyPageDTO test = new MyPageDTO();
		String expected = "あいう１２３";

		test.setGivenNameKana(expected);
		String actual = test.getGivenNameKana();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#getGivenNameKana()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetGivenNameKana7() {
		MyPageDTO test = new MyPageDTO();
		String expected = "abc123あいう１２３";

		test.setGivenNameKana(expected);
		String actual = test.getGivenNameKana();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#getGivenNameKana()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetGivenNameKana8() {
		MyPageDTO test = new MyPageDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setGivenNameKana(expected);
		String actual = test.getGivenNameKana();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#setGivenNameKana(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetGivenNameKana1() {
		MyPageDTO test = new MyPageDTO();
		String expected = null;

		test.setGivenNameKana(expected);
		String actual = test.getGivenNameKana();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#setGivenNameKana(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetGivenNameKana2() {
		MyPageDTO test = new MyPageDTO();
		String expected = "";

		test.setGivenNameKana(expected);
		String actual = test.getGivenNameKana();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#setGivenNameKana(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetGivenNameKana3() {
		MyPageDTO test = new MyPageDTO();
		String expected = " ";

		test.setGivenNameKana(expected);
		String actual = test.getGivenNameKana();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#setGivenNameKana(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetGivenNameKana4() {
		MyPageDTO test = new MyPageDTO();
		String expected = "　";

		test.setGivenNameKana(expected);
		String actual = test.getGivenNameKana();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#setGivenNameKana(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetGivenNameKana5() {
		MyPageDTO test = new MyPageDTO();
		String expected = "abc123";

		test.setGivenNameKana(expected);
		String actual = test.getGivenNameKana();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#setGivenNameKana(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetGivenNameKana6() {
		MyPageDTO test = new MyPageDTO();
		String expected = "あいう１２３";

		test.setGivenNameKana(expected);
		String actual = test.getGivenNameKana();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#setGivenNameKana(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetGivenNameKana7() {
		MyPageDTO test = new MyPageDTO();
		String expected = "abc123あいう１２３";

		test.setGivenNameKana(expected);
		String actual = test.getGivenNameKana();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#setGivenNameKana(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetGivenNameKana8() {
		MyPageDTO test = new MyPageDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setGivenNameKana(expected);
		String actual = test.getGivenNameKana();

		assertEquals(expected, actual);

	}
		@Test
		public void testGetPostal1() {
			MyPageDTO test = new MyPageDTO();
			String expected = null;

			test.setPostal(expected);
			String actual = test.getPostal();

			assertEquals(expected, actual);
		}

		/**
		 * {@link com.internousdev.legimina.dto.MyPageDTO#getPostal()}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testGetPostal2() {
			MyPageDTO test = new MyPageDTO();
			String expected = "";

			test.setPostal(expected);
			String actual = test.getPostal();

			assertEquals(expected, actual);
		}

		/**
		 * {@link com.internousdev.legimina.dto.MyPageDTO#getPostal()}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testGetPostal3() {
			MyPageDTO test = new MyPageDTO();
			String expected = " ";

			test.setPostal(expected);
			String actual = test.getPostal();

			assertEquals(expected, actual);
		}

		/**
		 * {@link com.internousdev.legimina.dto.MyPageDTO#getPostal()}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testGetPostal4() {
			MyPageDTO test = new MyPageDTO();
			String expected = "　";

			test.setPostal(expected);
			String actual = test.getPostal();

			assertEquals(expected, actual);
		}

		/**
		 * {@link com.internousdev.legimina.dto.MyPageDTO#getPostal()}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testGetPostal5() {
			MyPageDTO test = new MyPageDTO();
			String expected = "abc123";

			test.setPostal(expected);
			String actual = test.getPostal();

			assertEquals(expected, actual);
		}

		/**
		 * {@link com.internousdev.legimina.dto.MyPageDTO#getPostal()}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testGetPostal6() {
			MyPageDTO test = new MyPageDTO();
			String expected = "あいう１２３";

			test.setPostal(expected);
			String actual = test.getPostal();

			assertEquals(expected, actual);
		}

		/**
		 * {@link com.internousdev.legimina.dto.MyPageDTO#getPostal()}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testGetPostal7() {
			MyPageDTO test = new MyPageDTO();
			String expected = "abc123あいう１２３";

			test.setPostal(expected);
			String actual = test.getPostal();

			assertEquals(expected, actual);
		}

		/**
		 * {@link com.internousdev.legimina.dto.MyPageDTO#getPostal()}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testGetPostal8() {
			MyPageDTO test = new MyPageDTO();
			String expected = "ａｂｃ１２３あいう漢字";

			test.setPostal(expected);
			String actual = test.getPostal();

			assertEquals(expected, actual);
		}

		/**
		 * {@link com.internousdev.legimina.dto.MyPageDTO#setPostal(java.lang.String)}
		 * のためのテスト・メソッド。
		 */



		@Test
		public void testSetPostal1() {
			MyPageDTO test = new MyPageDTO();
			String expected = null;

			test.setPostal(expected);
			String actual = test.getPostal();

			assertEquals(expected, actual);

		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#setPostal(java.lang.String)}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testSetPostal2() {
			MyPageDTO test = new MyPageDTO();
			String expected = "";

			test.setPostal(expected);
			String actual = test.getPostal();

			assertEquals(expected, actual);

		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#setPostal(java.lang.String)}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testSetPostal3() {
			MyPageDTO test = new MyPageDTO();
			String expected = " ";

			test.setPostal(expected);
			String actual = test.getPostal();

			assertEquals(expected, actual);

		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#setPostal(java.lang.String)}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testSetPostal4() {
			MyPageDTO test = new MyPageDTO();
			String expected = "　";

			test.setPostal(expected);
			String actual = test.getPostal();

			assertEquals(expected, actual);

		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#setPostal(java.lang.String)}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testSetPostal5() {
			MyPageDTO test = new MyPageDTO();
			String expected = "abc123";

			test.setPostal(expected);
			String actual = test.getPostal();

			assertEquals(expected, actual);

		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#setPostal(java.lang.String)}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testSetPostal6() {
			MyPageDTO test = new MyPageDTO();
			String expected = "あいう１２３";

			test.setPostal(expected);
			String actual = test.getPostal();

			assertEquals(expected, actual);

		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#setPostal(java.lang.String)}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testSetPostal7() {
			MyPageDTO test = new MyPageDTO();
			String expected = "abc123あいう１２３";

			test.setPostal(expected);
			String actual = test.getPostal();

			assertEquals(expected, actual);

		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#setPostal(java.lang.String)}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testSetPostal8() {
			MyPageDTO test = new MyPageDTO();
			String expected = "ａｂｃ１２３あいう漢字";

			test.setPostal(expected);
			String actual = test.getPostal();

			assertEquals(expected, actual);

		}

		@Test
		public void testGetAddress1() {
			MyPageDTO test = new MyPageDTO();
			String expected = null;

			test.setAddress(expected);
			String actual = test.getAddress();

			assertEquals(expected, actual);
		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#getAddress()}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testGetAddress2() {
			MyPageDTO test = new MyPageDTO();
			String expected = "";

			test.setAddress(expected);
			String actual = test.getAddress();

			assertEquals(expected, actual);
		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#getAddress()}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testGetAddress3() {
			MyPageDTO test = new MyPageDTO();
			String expected = " ";

			test.setAddress(expected);
			String actual = test.getAddress();

			assertEquals(expected, actual);
		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#getAddress()}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testGetAddress4() {
			MyPageDTO test = new MyPageDTO();
			String expected = "　";

			test.setAddress(expected);
			String actual = test.getAddress();

			assertEquals(expected, actual);
		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#getAddress()}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testGetAddress5() {
			MyPageDTO test = new MyPageDTO();
			String expected = "abc123";

			test.setAddress(expected);
			String actual = test.getAddress();

			assertEquals(expected, actual);
		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#getAddress()}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testGetAddress6() {
			MyPageDTO test = new MyPageDTO();
			String expected = "あいう１２３";

			test.setAddress(expected);
			String actual = test.getAddress();

			assertEquals(expected, actual);
		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#getAddress()}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testGetAddress7() {
			MyPageDTO test = new MyPageDTO();
			String expected = "abc123あいう１２３";

			test.setAddress(expected);
			String actual = test.getAddress();

			assertEquals(expected, actual);
		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#getAddress()}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testGetAddress8() {
			MyPageDTO test = new MyPageDTO();
			String expected = "ａｂｃ１２３あいう漢字";

			test.setAddress(expected);
			String actual = test.getAddress();

			assertEquals(expected, actual);
		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#setAddress(java.lang.String)}
		 * のためのテスト・メソッド。
*/






		@Test
		public void testSetAddress1() {
			MyPageDTO test = new MyPageDTO();
			String expected = null;

			test.setAddress(expected);
			String actual = test.getAddress();

			assertEquals(expected, actual);

		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#setAddress(java.lang.String)}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testSetAddress2() {
			MyPageDTO test = new MyPageDTO();
			String expected = "";

			test.setAddress(expected);
			String actual = test.getAddress();

			assertEquals(expected, actual);

		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#setAddress(java.lang.String)}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testSetAddress3() {
			MyPageDTO test = new MyPageDTO();
			String expected = " ";

			test.setAddress(expected);
			String actual = test.getAddress();

			assertEquals(expected, actual);

		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#setAddress(java.lang.String)}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testSetAddress4() {
			MyPageDTO test = new MyPageDTO();
			String expected = "　";

			test.setAddress(expected);
			String actual = test.getAddress();

			assertEquals(expected, actual);

		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#setAddress(java.lang.String)}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testSetAddress5() {
			MyPageDTO test = new MyPageDTO();
			String expected = "abc123";

			test.setAddress(expected);
			String actual = test.getAddress();

			assertEquals(expected, actual);

		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#setAddress(java.lang.String)}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testSetAddress6() {
			MyPageDTO test = new MyPageDTO();
			String expected = "あいう１２３";

			test.setAddress(expected);
			String actual = test.getAddress();

			assertEquals(expected, actual);

		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#setAddress(java.lang.String)}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testSetAddress7() {
			MyPageDTO test = new MyPageDTO();
			String expected = "abc123あいう１２３";

			test.setAddress(expected);
			String actual = test.getAddress();

			assertEquals(expected, actual);

		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#setAddress(java.lang.String)}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testSetAddress8() {
			MyPageDTO test = new MyPageDTO();
			String expected = "ａｂｃ１２３あいう漢字";

			test.setAddress(expected);
			String actual = test.getAddress();

			assertEquals(expected, actual);

		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#getPassword()}
		 * のためのテスト・メソッド。
		 */

		@Test
		public void testGetPhoneNumber1() {
			MyPageDTO test = new MyPageDTO();
			String expected = null;

			test.setPhoneNumber(expected);
			String actual = test.getPhoneNumber();

			assertEquals(expected, actual);
		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#getPhoneNumber()}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testGetPhoneNumber2() {
			MyPageDTO test = new MyPageDTO();
			String expected = "";

			test.setPhoneNumber(expected);
			String actual = test.getPhoneNumber();

			assertEquals(expected, actual);
		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#getPhoneNumber()}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testGetPhoneNumber3() {
			MyPageDTO test = new MyPageDTO();
			String expected = " ";

			test.setPhoneNumber(expected);
			String actual = test.getPhoneNumber();

			assertEquals(expected, actual);
		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#getPhoneNumber()}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testGetPhoneNumber4() {
			MyPageDTO test = new MyPageDTO();
			String expected = "　";

			test.setPhoneNumber(expected);
			String actual = test.getPhoneNumber();

			assertEquals(expected, actual);
		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#getPhoneNumber()}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testGetPhoneNumber5() {
			MyPageDTO test = new MyPageDTO();
			String expected = "abc123";

			test.setPhoneNumber(expected);
			String actual = test.getPhoneNumber();

			assertEquals(expected, actual);
		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#getPhoneNumber()}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testGetPhoneNumber6() {
			MyPageDTO test = new MyPageDTO();
			String expected = "あいう１２３";

			test.setPhoneNumber(expected);
			String actual = test.getPhoneNumber();

			assertEquals(expected, actual);
		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#getPhoneNumber()}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testGetPhoneNumber7() {
			MyPageDTO test = new MyPageDTO();
			String expected = "abc123あいう１２３";

			test.setPhoneNumber(expected);
			String actual = test.getPhoneNumber();

			assertEquals(expected, actual);
		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#getPhoneNumber()}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testGetPhoneNumber8() {
			MyPageDTO test = new MyPageDTO();
			String expected = "ａｂｃ１２３あいう漢字";

			test.setPhoneNumber(expected);
			String actual = test.getPhoneNumber();

			assertEquals(expected, actual);
		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#setPhoneNumber(java.lang.String)}
		 * のためのテスト・メソッド。
		 */

		@Test
		public void testSetPhoneNumber1() {
			MyPageDTO test = new MyPageDTO();
			String expected = null;

			test.setPhoneNumber(expected);
			String actual = test.getPhoneNumber();

			assertEquals(expected, actual);

		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#setPhoneNumber(java.lang.String)}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testSetPhoneNumber2() {
			MyPageDTO test = new MyPageDTO();
			String expected = "";

			test.setPhoneNumber(expected);
			String actual = test.getPhoneNumber();

			assertEquals(expected, actual);

		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#setPhoneNumber(java.lang.String)}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testSetPhoneNumber3() {
			MyPageDTO test = new MyPageDTO();
			String expected = " ";

			test.setPhoneNumber(expected);
			String actual = test.getPhoneNumber();

			assertEquals(expected, actual);

		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#setPhoneNumber(java.lang.String)}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testSetPhoneNumber4() {
			MyPageDTO test = new MyPageDTO();
			String expected = "　";

			test.setPhoneNumber(expected);
			String actual = test.getPhoneNumber();

			assertEquals(expected, actual);

		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#setPhoneNumber(java.lang.String)}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testSetPhoneNumber5() {
			MyPageDTO test = new MyPageDTO();
			String expected = "abc123";

			test.setPhoneNumber(expected);
			String actual = test.getPhoneNumber();

			assertEquals(expected, actual);

		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#setPhoneNumber(java.lang.String)}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testSetPhoneNumber6() {
			MyPageDTO test = new MyPageDTO();
			String expected = "あいう１２３";

			test.setPhoneNumber(expected);
			String actual = test.getPhoneNumber();

			assertEquals(expected, actual);

		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#setPhoneNumber(java.lang.String)}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testSetPhoneNumber7() {
			MyPageDTO test = new MyPageDTO();
			String expected = "abc123あいう１２３";

			test.setPhoneNumber(expected);
			String actual = test.getPhoneNumber();

			assertEquals(expected, actual);

		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#setPhoneNumber(java.lang.String)}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testSetPhoneNumber8() {
			MyPageDTO test = new MyPageDTO();
			String expected = "ａｂｃ１２３あいう漢字";

			test.setPhoneNumber(expected);
			String actual = test.getPhoneNumber();

			assertEquals(expected, actual);

		}







		/**
		 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#getPhoneEmail()}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testGetPhoneEmail1() {
			MyPageDTO test = new MyPageDTO();
			String expected = null;

			test.setPhoneEmail(expected);
			String actual = test.getPhoneEmail();

			assertEquals(expected, actual);
		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#getPhoneEmail()}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testGetPhoneEmail2() {
			MyPageDTO test = new MyPageDTO();
			String expected = "";

			test.setPhoneEmail(expected);
			String actual = test.getPhoneEmail();

			assertEquals(expected, actual);
		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#getPhoneEmail()}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testGetPhoneEmail3() {
			MyPageDTO test = new MyPageDTO();
			String expected = " ";

			test.setPhoneEmail(expected);
			String actual = test.getPhoneEmail();

			assertEquals(expected, actual);
		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#getPhoneEmail()}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testGetPhoneEmail4() {
			MyPageDTO test = new MyPageDTO();
			String expected = "　";

			test.setPhoneEmail(expected);
			String actual = test.getPhoneEmail();

			assertEquals(expected, actual);
		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#getPhoneEmail()}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testGetPhoneEmail5() {
			MyPageDTO test = new MyPageDTO();
			String expected = "abc123";

			test.setPhoneEmail(expected);
			String actual = test.getPhoneEmail();

			assertEquals(expected, actual);
		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#getPhoneEmail()}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testGetPhoneEmail6() {
			MyPageDTO test = new MyPageDTO();
			String expected = "あいう１２３";

			test.setPhoneEmail(expected);
			String actual = test.getPhoneEmail();

			assertEquals(expected, actual);
		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#getPhoneEmail()}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testGetPhoneEmail7() {
			MyPageDTO test = new MyPageDTO();
			String expected = "abc123あいう１２３";

			test.setPhoneEmail(expected);
			String actual = test.getPhoneEmail();

			assertEquals(expected, actual);
		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#getPhoneEmail()}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testGetPhoneEmail8() {
			MyPageDTO test = new MyPageDTO();
			String expected = "ａｂｃ１２３あいう漢字";

			test.setPhoneEmail(expected);
			String actual = test.getPhoneEmail();

			assertEquals(expected, actual);
		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#setPhoneEmail(java.lang.String)}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testSetPhoneEmail1() {
			MyPageDTO test = new MyPageDTO();
			String expected = null;

			test.setPhoneEmail(expected);
			String actual = test.getPhoneEmail();

			assertEquals(expected, actual);

		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#setPhoneEmail(java.lang.String)}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testSetPhoneEmail2() {
			MyPageDTO test = new MyPageDTO();
			String expected = "";

			test.setPhoneEmail(expected);
			String actual = test.getPhoneEmail();

			assertEquals(expected, actual);

		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#setPhoneEmail(java.lang.String)}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testSetPhoneEmail3() {
			MyPageDTO test = new MyPageDTO();
			String expected = " ";

			test.setPhoneEmail(expected);
			String actual = test.getPhoneEmail();

			assertEquals(expected, actual);

		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#setPhoneEmail(java.lang.String)}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testSetPhoneEmail4() {
			MyPageDTO test = new MyPageDTO();
			String expected = "　";

			test.setPhoneEmail(expected);
			String actual = test.getPhoneEmail();

			assertEquals(expected, actual);

		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#setPhoneEmail(java.lang.String)}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testSetPhoneEmail5() {
			MyPageDTO test = new MyPageDTO();
			String expected = "abc123";

			test.setPhoneEmail(expected);
			String actual = test.getPhoneEmail();

			assertEquals(expected, actual);

		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#setPhoneEmail(java.lang.String)}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testSetPhoneEmail6() {
			MyPageDTO test = new MyPageDTO();
			String expected = "あいう１２３";

			test.setPhoneEmail(expected);
			String actual = test.getPhoneEmail();

			assertEquals(expected, actual);

		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#setPhoneEmail(java.lang.String)}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testSetPhoneEmail7() {
			MyPageDTO test = new MyPageDTO();
			String expected = "abc123あいう１２３";

			test.setPhoneEmail(expected);
			String actual = test.getPhoneEmail();

			assertEquals(expected, actual);

		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#setPhoneEmail(java.lang.String)}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testSetPhoneEmail8() {
			MyPageDTO test = new MyPageDTO();
			String expected = "ａｂｃ１２３あいう漢字";

			test.setPhoneEmail(expected);
			String actual = test.getPhoneEmail();

			assertEquals(expected, actual);

		}







		/**
		 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#getPostalEmail()}
		 * のためのテスト・メソッド。
		 */


		/**
		 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#getMobileNumber()}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testGetMobileNumber1() {
			MyPageDTO test = new MyPageDTO();
			String expected = null;

			test.setMobileNumber(expected);
			String actual = test.getMobileNumber();

			assertEquals(expected, actual);
		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#getMobileNumber()}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testGetMobileNumber2() {
			MyPageDTO test = new MyPageDTO();
			String expected = "";

			test.setMobileNumber(expected);
			String actual = test.getMobileNumber();

			assertEquals(expected, actual);
		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#getMobileNumber()}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testGetMobileNumber3() {
			MyPageDTO test = new MyPageDTO();
			String expected = " ";

			test.setMobileNumber(expected);
			String actual = test.getMobileNumber();

			assertEquals(expected, actual);
		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#getMobileNumber()}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testGetMobileNumber4() {
			MyPageDTO test = new MyPageDTO();
			String expected = "　";

			test.setMobileNumber(expected);
			String actual = test.getMobileNumber();

			assertEquals(expected, actual);
		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#getMobileNumber()}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testGetMobileNumber5() {
			MyPageDTO test = new MyPageDTO();
			String expected = "abc123";

			test.setMobileNumber(expected);
			String actual = test.getMobileNumber();

			assertEquals(expected, actual);
		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#getMobileNumber()}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testGetMobileNumber6() {
			MyPageDTO test = new MyPageDTO();
			String expected = "あいう１２３";

			test.setMobileNumber(expected);
			String actual = test.getMobileNumber();

			assertEquals(expected, actual);
		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#getMobileNumber()}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testGetMobileNumber7() {
			MyPageDTO test = new MyPageDTO();
			String expected = "abc123あいう１２３";

			test.setMobileNumber(expected);
			String actual = test.getMobileNumber();

			assertEquals(expected, actual);
		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#getMobileNumber()}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testGetMobileNumber8() {
			MyPageDTO test = new MyPageDTO();
			String expected = "ａｂｃ１２３あいう漢字";

			test.setMobileNumber(expected);
			String actual = test.getMobileNumber();

			assertEquals(expected, actual);
		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#setMobileNumber(java.lang.String)}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testSetMobileNumber1() {
			MyPageDTO test = new MyPageDTO();
			String expected = null;

			test.setMobileNumber(expected);
			String actual = test.getMobileNumber();

			assertEquals(expected, actual);

		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#setMobileNumber(java.lang.String)}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testSetMobileNumber2() {
			MyPageDTO test = new MyPageDTO();
			String expected = "";

			test.setMobileNumber(expected);
			String actual = test.getMobileNumber();

			assertEquals(expected, actual);

		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#setMobileNumber(java.lang.String)}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testSetMobileNumber3() {
			MyPageDTO test = new MyPageDTO();
			String expected = " ";

			test.setMobileNumber(expected);
			String actual = test.getMobileNumber();

			assertEquals(expected, actual);

		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#setMobileNumber(java.lang.String)}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testSetMobileNumber4() {
			MyPageDTO test = new MyPageDTO();
			String expected = "　";

			test.setMobileNumber(expected);
			String actual = test.getMobileNumber();

			assertEquals(expected, actual);

		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#setMobileNumber(java.lang.String)}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testSetMobileNumber5() {
			MyPageDTO test = new MyPageDTO();
			String expected = "abc123";

			test.setMobileNumber(expected);
			String actual = test.getMobileNumber();

			assertEquals(expected, actual);

		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#setMobileNumber(java.lang.String)}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testSetMobileNumber6() {
			MyPageDTO test = new MyPageDTO();
			String expected = "あいう１２３";

			test.setMobileNumber(expected);
			String actual = test.getMobileNumber();

			assertEquals(expected, actual);

		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#setMobileNumber(java.lang.String)}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testSetMobileNumber7() {
			MyPageDTO test = new MyPageDTO();
			String expected = "abc123あいう１２３";

			test.setMobileNumber(expected);
			String actual = test.getMobileNumber();

			assertEquals(expected, actual);

		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#setMobileNumber(java.lang.String)}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testSetMobileNumber8() {
			MyPageDTO test = new MyPageDTO();
			String expected = "ａｂｃ１２３あいう漢字";

			test.setMobileNumber(expected);
			String actual = test.getMobileNumber();

			assertEquals(expected, actual);

		}



		/**
		 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#getMobileEmail()}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testGetMobileEmail1() {
			MyPageDTO test = new MyPageDTO();
			String expected = null;

			test.setMobileEmail(expected);
			String actual = test.getMobileEmail();

			assertEquals(expected, actual);
		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#getMobileEmail()}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testGetMobileEmail2() {
			MyPageDTO test = new MyPageDTO();
			String expected = "";

			test.setMobileEmail(expected);
			String actual = test.getMobileEmail();

			assertEquals(expected, actual);
		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#getMobileEmail()}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testGetMobileEmail3() {
			MyPageDTO test = new MyPageDTO();
			String expected = " ";

			test.setMobileEmail(expected);
			String actual = test.getMobileEmail();

			assertEquals(expected, actual);
		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#getMobileEmail()}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testGetMobileEmail4() {
			MyPageDTO test = new MyPageDTO();
			String expected = "　";

			test.setMobileEmail(expected);
			String actual = test.getMobileEmail();

			assertEquals(expected, actual);
		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#getMobileEmail()}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testGetMobileEmail5() {
			MyPageDTO test = new MyPageDTO();
			String expected = "abc123";

			test.setMobileEmail(expected);
			String actual = test.getMobileEmail();

			assertEquals(expected, actual);
		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#getMobileEmail()}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testGetMobileEmail6() {
			MyPageDTO test = new MyPageDTO();
			String expected = "あいう１２３";

			test.setMobileEmail(expected);
			String actual = test.getMobileEmail();

			assertEquals(expected, actual);
		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#getMobileEmail()}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testGetMobileEmail7() {
			MyPageDTO test = new MyPageDTO();
			String expected = "abc123あいう１２３";

			test.setMobileEmail(expected);
			String actual = test.getMobileEmail();

			assertEquals(expected, actual);
		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#getMobileEmail()}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testGetMobileEmail8() {
			MyPageDTO test = new MyPageDTO();
			String expected = "ａｂｃ１２３あいう漢字";

			test.setMobileEmail(expected);
			String actual = test.getMobileEmail();

			assertEquals(expected, actual);
		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#setMobileEmail(java.lang.String)}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testSetMobileEmail1() {
			MyPageDTO test = new MyPageDTO();
			String expected = null;

			test.setMobileEmail(expected);
			String actual = test.getMobileEmail();

			assertEquals(expected, actual);

		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#setMobileEmail(java.lang.String)}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testSetMobileEmail2() {
			MyPageDTO test = new MyPageDTO();
			String expected = "";

			test.setMobileEmail(expected);
			String actual = test.getMobileEmail();

			assertEquals(expected, actual);

		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#setMobileEmail(java.lang.String)}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testSetMobileEmail3() {
			MyPageDTO test = new MyPageDTO();
			String expected = " ";

			test.setMobileEmail(expected);
			String actual = test.getMobileEmail();

			assertEquals(expected, actual);

		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#setMobileEmail(java.lang.String)}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testSetMobileEmail4() {
			MyPageDTO test = new MyPageDTO();
			String expected = "　";

			test.setMobileEmail(expected);
			String actual = test.getMobileEmail();

			assertEquals(expected, actual);

		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#setMobileEmail(java.lang.String)}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testSetMobileEmail5() {
			MyPageDTO test = new MyPageDTO();
			String expected = "abc123";

			test.setMobileEmail(expected);
			String actual = test.getMobileEmail();

			assertEquals(expected, actual);

		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#setMobileEmail(java.lang.String)}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testSetMobileEmail6() {
			MyPageDTO test = new MyPageDTO();
			String expected = "あいう１２３";

			test.setMobileEmail(expected);
			String actual = test.getMobileEmail();

			assertEquals(expected, actual);

		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#setMobileEmail(java.lang.String)}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testSetMobileEmail7() {
			MyPageDTO test = new MyPageDTO();
			String expected = "abc123あいう１２３";

			test.setMobileEmail(expected);
			String actual = test.getMobileEmail();

			assertEquals(expected, actual);

		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#setMobileEmail(java.lang.String)}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testSetMobileEmail8() {
			MyPageDTO test = new MyPageDTO();
			String expected = "ａｂｃ１２３あいう漢字";

			test.setMobileEmail(expected);
			String actual = test.getMobileEmail();

			assertEquals(expected, actual);

		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#getSex()}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testGetSex1() {
			MyPageDTO test = new MyPageDTO();
			String expected = null;

			test.setSex(expected);
			String actual = test.getSex();

			assertEquals(expected, actual);
		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#getSex()}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testGetSex2() {
			MyPageDTO test = new MyPageDTO();
			String expected = "";

			test.setSex(expected);
			String actual = test.getSex();

			assertEquals(expected, actual);
		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#getSex()}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testGetSex3() {
			MyPageDTO test = new MyPageDTO();
			String expected = " ";

			test.setSex(expected);
			String actual = test.getSex();

			assertEquals(expected, actual);
		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#getSex()}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testGetSex4() {
			MyPageDTO test = new MyPageDTO();
			String expected = "　";

			test.setSex(expected);
			String actual = test.getSex();

			assertEquals(expected, actual);
		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#getSex()}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testGetSex5() {
			MyPageDTO test = new MyPageDTO();
			String expected = "abc123";

			test.setSex(expected);
			String actual = test.getSex();

			assertEquals(expected, actual);
		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#getSex()}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testGetSex6() {
			MyPageDTO test = new MyPageDTO();
			String expected = "あいう１２３";

			test.setSex(expected);
			String actual = test.getSex();

			assertEquals(expected, actual);
		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#getSex()}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testGetSex7() {
			MyPageDTO test = new MyPageDTO();
			String expected = "abc123あいう１２３";

			test.setSex(expected);
			String actual = test.getSex();

			assertEquals(expected, actual);
		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#getSex()}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testGetSex8() {
			MyPageDTO test = new MyPageDTO();
			String expected = "ａｂｃ１２３あいう漢字";

			test.setSex(expected);
			String actual = test.getSex();

			assertEquals(expected, actual);
		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#setSex(java.lang.String)}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testSetSex1() {
			MyPageDTO test = new MyPageDTO();
			String expected = null;

			test.setSex(expected);
			String actual = test.getSex();

			assertEquals(expected, actual);

		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#setSex(java.lang.String)}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testSetSex2() {
			MyPageDTO test = new MyPageDTO();
			String expected = "";

			test.setSex(expected);
			String actual = test.getSex();

			assertEquals(expected, actual);

		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#setSex(java.lang.String)}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testSetSex3() {
			MyPageDTO test = new MyPageDTO();
			String expected = " ";

			test.setSex(expected);
			String actual = test.getSex();

			assertEquals(expected, actual);

		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#setSex(java.lang.String)}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testSetSex4() {
			MyPageDTO test = new MyPageDTO();
			String expected = "　";

			test.setSex(expected);
			String actual = test.getSex();

			assertEquals(expected, actual);

		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#setSex(java.lang.String)}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testSetSex5() {
			MyPageDTO test = new MyPageDTO();
			String expected = "abc123";

			test.setSex(expected);
			String actual = test.getSex();

			assertEquals(expected, actual);

		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#setSex(java.lang.String)}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testSetSex6() {
			MyPageDTO test = new MyPageDTO();
			String expected = "あいう１２３";

			test.setSex(expected);
			String actual = test.getSex();

			assertEquals(expected, actual);

		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#setSex(java.lang.String)}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testSetSex7() {
			MyPageDTO test = new MyPageDTO();
			String expected = "abc123あいう１２３";

			test.setSex(expected);
			String actual = test.getSex();

			assertEquals(expected, actual);

		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#setSex(java.lang.String)}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testSetSex8() {
			MyPageDTO test = new MyPageDTO();
			String expected = "ａｂｃ１２３あいう漢字";

			test.setSex(expected);
			String actual = test.getSex();

			assertEquals(expected, actual);

		}


		/**
		 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#getBirthday()}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testGetBirthday1() {
			MyPageDTO test = new MyPageDTO();
			String expected = null;

			test.setBirthday(expected);
			String actual = test.getBirthday();

			assertEquals(expected, actual);
		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#getBirthday()}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testGetBirthday2() {
			MyPageDTO test = new MyPageDTO();
			String expected = "";

			test.setBirthday(expected);
			String actual = test.getBirthday();

			assertEquals(expected, actual);
		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#getBirthday()}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testGetBirthday3() {
			MyPageDTO test = new MyPageDTO();
			String expected = " ";

			test.setBirthday(expected);
			String actual = test.getBirthday();

			assertEquals(expected, actual);
		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#getBirthday()}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testGetBirthday4() {
			MyPageDTO test = new MyPageDTO();
			String expected = "　";

			test.setBirthday(expected);
			String actual = test.getBirthday();

			assertEquals(expected, actual);
		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#getBirthday()}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testGetBirthday5() {
			MyPageDTO test = new MyPageDTO();
			String expected = "abc123";

			test.setBirthday(expected);
			String actual = test.getBirthday();

			assertEquals(expected, actual);
		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#getBirthday()}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testGetBirthday6() {
			MyPageDTO test = new MyPageDTO();
			String expected = "あいう１２３";

			test.setBirthday(expected);
			String actual = test.getBirthday();

			assertEquals(expected, actual);
		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#getBirthday()}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testGetBirthday7() {
			MyPageDTO test = new MyPageDTO();
			String expected = "abc123あいう１２３";

			test.setBirthday(expected);
			String actual = test.getBirthday();

			assertEquals(expected, actual);
		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#getBirthday()}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testGetBirthday8() {
			MyPageDTO test = new MyPageDTO();
			String expected = "ａｂｃ１２３あいう漢字";

			test.setBirthday(expected);
			String actual = test.getBirthday();

			assertEquals(expected, actual);
		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#setBirthday(java.lang.String)}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testSetBirthday1() {
			MyPageDTO test = new MyPageDTO();
			String expected = null;

			test.setBirthday(expected);
			String actual = test.getBirthday();

			assertEquals(expected, actual);

		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#setBirthday(java.lang.String)}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testSetBirthday2() {
			MyPageDTO test = new MyPageDTO();
			String expected = "";

			test.setBirthday(expected);
			String actual = test.getBirthday();

			assertEquals(expected, actual);

		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#setBirthday(java.lang.String)}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testSetBirthday3() {
			MyPageDTO test = new MyPageDTO();
			String expected = " ";

			test.setBirthday(expected);
			String actual = test.getBirthday();

			assertEquals(expected, actual);

		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#setBirthday(java.lang.String)}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testSetBirthday4() {
			MyPageDTO test = new MyPageDTO();
			String expected = "　";

			test.setBirthday(expected);
			String actual = test.getBirthday();

			assertEquals(expected, actual);

		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#setBirthday(java.lang.String)}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testSetBirthday5() {
			MyPageDTO test = new MyPageDTO();
			String expected = "abc123";

			test.setBirthday(expected);
			String actual = test.getBirthday();

			assertEquals(expected, actual);

		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#setBirthday(java.lang.String)}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testSetBirthday6() {
			MyPageDTO test = new MyPageDTO();
			String expected = "あいう１２３";

			test.setBirthday(expected);
			String actual = test.getBirthday();

			assertEquals(expected, actual);

		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#setBirthday(java.lang.String)}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testSetBirthday7() {
			MyPageDTO test = new MyPageDTO();
			String expected = "abc123あいう１２３";

			test.setBirthday(expected);
			String actual = test.getBirthday();

			assertEquals(expected, actual);

		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#setBirthday(java.lang.String)}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testSetBirthday8() {
			MyPageDTO test = new MyPageDTO();
			String expected = "ａｂｃ１２３あいう漢字";

			test.setBirthday(expected);
			String actual = test.getBirthday();

			assertEquals(expected, actual);

		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#getUserFlg()} のためのテスト・メソッド。
		 */
		@Test
		public void testGetUserFlg1() {
			MyPageDTO test = new MyPageDTO();
			int expected = 0;

			test.setUserFlg(expected);

			assertEquals(expected, test.getUserFlg());

		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#getUserFlg()} のためのテスト・メソッド。
		 */
		@Test
		public void testGetUserFlg2() {
			MyPageDTO test = new MyPageDTO();
			int expected = 2147483647;

			test.setUserFlg(expected);

			assertEquals(expected, test.getUserFlg());
		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#getUserFlg()} のためのテスト・メソッド。
		 */
		@Test
		public void testGetUserFlg3() {
			MyPageDTO test = new MyPageDTO();
			int expected = -2147483648;

			test.setUserFlg(expected);

			assertEquals(expected, test.getUserFlg());
		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#getUserFlg()} のためのテスト・メソッド。
		 */
		@Test
		public void testGetUserFlg4() {
			MyPageDTO test = new MyPageDTO();
			try {
				int UserFlgMin = Integer.parseInt("2147483648");
				test.setUserFlg(UserFlgMin);

			} catch (RuntimeException e) {
				assertEquals(e.getMessage(), "For input string: \"2147483648\"");
			}
		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#getUserFlg()} のためのテスト・メソッド。
		 */
		@Test
		public void testGetUserFlg5() {
			MyPageDTO test = new MyPageDTO();
			try {
				int UserFlgMin = Integer.parseInt("-2147483649");
				test.setUserFlg(UserFlgMin);

			} catch (RuntimeException e) {
				assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
			}
		}



		/**
		 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#setUserFlg(int)}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testSetUserFlg1() {
			MyPageDTO test = new MyPageDTO();
			int expected = 0;

			test.setUserFlg(expected);
			int actual = test.getUserFlg();

			assertEquals(expected, actual);
		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#setUserFlg(int)}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testSetUserFlg2() {
			MyPageDTO test = new MyPageDTO();
			int expected = 2147483647;

			test.setUserFlg(expected);
			int actual = test.getUserFlg();

			assertEquals(expected, actual);
		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#setUserFlg(int)}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testSetUserFlg3() {
			MyPageDTO test = new MyPageDTO();
			int expected = -2147483648;

			test.setUserFlg(expected);
			int actual = test.getUserFlg();

			assertEquals(expected, actual);
		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#setUserFlg(int)}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testSetUserFlg4() {
			MyPageDTO test = new MyPageDTO();
			try {
				int UserFlgMax = Integer.parseInt("2147483648");
				test.setUserFlg(UserFlgMax);

			} catch (RuntimeException e) {
				assertEquals(e.getMessage(), "For input string: \"2147483648\"");
			}
		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#setUserFlg(int)}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testSetUserFlg5() {
			MyPageDTO test = new MyPageDTO();
			try {
				int UserFlgMax = Integer.parseInt("-2147483649");
				test.setUserFlg(UserFlgMax);

			} catch (RuntimeException e) {
				assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
			}

		}



	public class testtest {
		/**
		 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#isUserdelFlg()}
		 *  のためのテスト・メソッド。
		 */
		@Test
		public void testIsUserdelFlg1() {
			MyPageDTO test = new MyPageDTO();
			boolean expected = true;

			test.setUserdelFlg(expected);
			boolean actual=test.isUserdelFlg();
			assertEquals(expected, actual);
		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#isUserdelFlg()}
		 *  のためのテスト・メソッド。
		 */
		@Test
		public void testIsUserdelFlg2() {
			MyPageDTO test = new MyPageDTO();
			boolean expected = false;

			test.setUserdelFlg(expected);
			boolean actual=test.isUserdelFlg();
			assertEquals(expected, actual);
		}



		/**
		 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#setUserdelFlg(boolean)}
		 *  のためのテスト・メソッド。
		 */
		@Test
		public void testSetUserdelFlg1() {
			MyPageDTO test = new MyPageDTO();
			boolean expected = true;

			test.setUserdelFlg(expected);
			boolean actual=test.isUserdelFlg();
			assertEquals(expected, actual);
		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#setUserdelFlg(boolean)}
		 *  のためのテスト・メソッド。
		 */
		@Test
		public void testSetUserdelFlg2() {
			MyPageDTO test = new MyPageDTO();
			boolean expected = false;

			test.setUserdelFlg(expected);
			boolean actual=test.isUserdelFlg();
			assertEquals(expected, actual);
		}
		/**
		 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#isLoginFlg()}
		 *  のためのテスト・メソッド。
		 */
		@Test
		public void testIsLoginFlg1() {
			MyPageDTO test = new MyPageDTO();
			boolean expected = true;

			test.setLoginFlg(expected);
			boolean actual=test.isLoginFlg();
			assertEquals(expected, actual);
		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#isLoginFlg()}
		 *  のためのテスト・メソッド。
		 */
		@Test
		public void testIsLoginFlg2() {
			MyPageDTO test = new MyPageDTO();
			boolean expected = false;

			test.setLoginFlg(expected);
			boolean actual=test.isLoginFlg();
			assertEquals(expected, actual);
		}



		/**
		 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#setLoginFlg(boolean)}
		 *  のためのテスト・メソッド。
		 */
		@Test
		public void testSetLoginFlg1() {
			MyPageDTO test = new MyPageDTO();
			boolean expected = true;

			test.setLoginFlg(expected);
			boolean actual=test.isLoginFlg();
			assertEquals(expected, actual);
		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#setLoginFlg(boolean)}
		 *  のためのテスト・メソッド。
		 */
		@Test
		public void testSetLoginFlg2() {
			MyPageDTO test = new MyPageDTO();
			boolean expected = false;

			test.setLoginFlg(expected);
			boolean actual=test.isLoginFlg();
			assertEquals(expected, actual);
		}

}


	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#getYear()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetYear1() {
		MyPageDTO test = new MyPageDTO();
		String expected = null;

		test.setYear(expected);
		String actual = test.getYear();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#getYear()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetYear2() {
		MyPageDTO test = new MyPageDTO();
		String expected = "";

		test.setYear(expected);
		String actual = test.getYear();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#getYear()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetYear3() {
		MyPageDTO test = new MyPageDTO();
		String expected = " ";

		test.setYear(expected);
		String actual = test.getYear();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#getYear()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetYear4() {
		MyPageDTO test = new MyPageDTO();
		String expected = "　";

		test.setYear(expected);
		String actual = test.getYear();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#getYear()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetYear5() {
		MyPageDTO test = new MyPageDTO();
		String expected = "abc123";

		test.setYear(expected);
		String actual = test.getYear();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#getYear()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetYear6() {
		MyPageDTO test = new MyPageDTO();
		String expected = "あいう１２３";

		test.setYear(expected);
		String actual = test.getYear();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#getYear()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetYear7() {
		MyPageDTO test = new MyPageDTO();
		String expected = "abc123あいう１２３";

		test.setYear(expected);
		String actual = test.getYear();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#getYear()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetYear8() {
		MyPageDTO test = new MyPageDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setYear(expected);
		String actual = test.getYear();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#setYear(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetYear1() {
		MyPageDTO test = new MyPageDTO();
		String expected = null;

		test.setYear(expected);
		String actual = test.getYear();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#setYear(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetYear2() {
		MyPageDTO test = new MyPageDTO();
		String expected = "";

		test.setYear(expected);
		String actual = test.getYear();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#setYear(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetYear3() {
		MyPageDTO test = new MyPageDTO();
		String expected = " ";

		test.setYear(expected);
		String actual = test.getYear();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#setYear(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetYear4() {
		MyPageDTO test = new MyPageDTO();
		String expected = "　";

		test.setYear(expected);
		String actual = test.getYear();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#setYear(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetYear5() {
		MyPageDTO test = new MyPageDTO();
		String expected = "abc123";

		test.setYear(expected);
		String actual = test.getYear();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#setYear(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetYear6() {
		MyPageDTO test = new MyPageDTO();
		String expected = "あいう１２３";

		test.setYear(expected);
		String actual = test.getYear();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#setYear(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetYear7() {
		MyPageDTO test = new MyPageDTO();
		String expected = "abc123あいう１２３";

		test.setYear(expected);
		String actual = test.getYear();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#setYear(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetYear8() {
		MyPageDTO test = new MyPageDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setYear(expected);
		String actual = test.getYear();

		assertEquals(expected, actual);

	}


	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#getMonth()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetMonth1() {
		MyPageDTO test = new MyPageDTO();
		String expected = null;

		test.setMonth(expected);
		String actual = test.getMonth();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#getMonth()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetMonth2() {
		MyPageDTO test = new MyPageDTO();
		String expected = "";

		test.setMonth(expected);
		String actual = test.getMonth();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#getMonth()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetMonth3() {
		MyPageDTO test = new MyPageDTO();
		String expected = " ";

		test.setMonth(expected);
		String actual = test.getMonth();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#getMonth()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetMonth4() {
		MyPageDTO test = new MyPageDTO();
		String expected = "　";

		test.setMonth(expected);
		String actual = test.getMonth();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#getMonth()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetMonth5() {
		MyPageDTO test = new MyPageDTO();
		String expected = "abc123";

		test.setMonth(expected);
		String actual = test.getMonth();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#getMonth()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetMonth6() {
		MyPageDTO test = new MyPageDTO();
		String expected = "あいう１２３";

		test.setMonth(expected);
		String actual = test.getMonth();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#getMonth()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetMonth7() {
		MyPageDTO test = new MyPageDTO();
		String expected = "abc123あいう１２３";

		test.setMonth(expected);
		String actual = test.getMonth();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#getMonth()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetMonth8() {
		MyPageDTO test = new MyPageDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setMonth(expected);
		String actual = test.getMonth();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#setMonth(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetMonth1() {
		MyPageDTO test = new MyPageDTO();
		String expected = null;

		test.setMonth(expected);
		String actual = test.getMonth();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#setMonth(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetMonth2() {
		MyPageDTO test = new MyPageDTO();
		String expected = "";

		test.setMonth(expected);
		String actual = test.getMonth();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#setMonth(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetMonth3() {
		MyPageDTO test = new MyPageDTO();
		String expected = " ";

		test.setMonth(expected);
		String actual = test.getMonth();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#setMonth(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetMonth4() {
		MyPageDTO test = new MyPageDTO();
		String expected = "　";

		test.setMonth(expected);
		String actual = test.getMonth();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#setMonth(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetMonth5() {
		MyPageDTO test = new MyPageDTO();
		String expected = "abc123";

		test.setMonth(expected);
		String actual = test.getMonth();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#setMonth(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetMonth6() {
		MyPageDTO test = new MyPageDTO();
		String expected = "あいう１２３";

		test.setMonth(expected);
		String actual = test.getMonth();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#setMonth(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetMonth7() {
		MyPageDTO test = new MyPageDTO();
		String expected = "abc123あいう１２３";

		test.setMonth(expected);
		String actual = test.getMonth();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#setMonth(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetMonth8() {
		MyPageDTO test = new MyPageDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setMonth(expected);
		String actual = test.getMonth();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#getRegisterDay()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetRegisterDay1() {
		MyPageDTO test = new MyPageDTO();
		String expected = null;

		test.setRegisterDay(expected);
		String actual = test.getRegisterDay();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#getRegisterDay()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetRegisterDay2() {
		MyPageDTO test = new MyPageDTO();
		String expected = "";

		test.setRegisterDay(expected);
		String actual = test.getRegisterDay();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#getRegisterDay()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetRegisterDay3() {
		MyPageDTO test = new MyPageDTO();
		String expected = " ";

		test.setRegisterDay(expected);
		String actual = test.getRegisterDay();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#getRegisterDay()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetRegisterDay4() {
		MyPageDTO test = new MyPageDTO();
		String expected = "　";

		test.setRegisterDay(expected);
		String actual = test.getRegisterDay();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#getRegisterDay()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetRegisterDay5() {
		MyPageDTO test = new MyPageDTO();
		String expected = "abc123";

		test.setRegisterDay(expected);
		String actual = test.getRegisterDay();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#getRegisterDay()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetRegisterDay6() {
		MyPageDTO test = new MyPageDTO();
		String expected = "あいう１２３";

		test.setRegisterDay(expected);
		String actual = test.getRegisterDay();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#getRegisterDay()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetRegisterDay7() {
		MyPageDTO test = new MyPageDTO();
		String expected = "abc123あいう１２３";

		test.setRegisterDay(expected);
		String actual = test.getRegisterDay();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#getRegisterDay()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetRegisterDay8() {
		MyPageDTO test = new MyPageDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setRegisterDay(expected);
		String actual = test.getRegisterDay();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#setRegisterDay(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetRegisterDay1() {
		MyPageDTO test = new MyPageDTO();
		String expected = null;

		test.setRegisterDay(expected);
		String actual = test.getRegisterDay();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#setRegisterDay(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetRegisterDay2() {
		MyPageDTO test = new MyPageDTO();
		String expected = "";

		test.setRegisterDay(expected);
		String actual = test.getRegisterDay();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#setRegisterDay(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetRegisterDay3() {
		MyPageDTO test = new MyPageDTO();
		String expected = " ";

		test.setRegisterDay(expected);
		String actual = test.getRegisterDay();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#setRegisterDay(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetRegisterDay4() {
		MyPageDTO test = new MyPageDTO();
		String expected = "　";

		test.setRegisterDay(expected);
		String actual = test.getRegisterDay();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#setRegisterDay(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetRegisterDay5() {
		MyPageDTO test = new MyPageDTO();
		String expected = "abc123";

		test.setRegisterDay(expected);
		String actual = test.getRegisterDay();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#setRegisterDay(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetRegisterDay6() {
		MyPageDTO test = new MyPageDTO();
		String expected = "あいう１２３";

		test.setRegisterDay(expected);
		String actual = test.getRegisterDay();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#setRegisterDay(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetRegisterDay7() {
		MyPageDTO test = new MyPageDTO();
		String expected = "abc123あいう１２３";

		test.setRegisterDay(expected);
		String actual = test.getRegisterDay();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#setRegisterDay(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetRegisterDay8() {
		MyPageDTO test = new MyPageDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setRegisterDay(expected);
		String actual = test.getRegisterDay();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#getUpdateDay()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetUpdateDay1() {
		MyPageDTO test = new MyPageDTO();
		String expected = null;

		test.setUpdateDay(expected);
		String actual = test.getUpdateDay();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#getUpdateDay()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetUpdateDay2() {
		MyPageDTO test = new MyPageDTO();
		String expected = "";

		test.setUpdateDay(expected);
		String actual = test.getUpdateDay();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#getUpdateDay()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetUpdateDay3() {
		MyPageDTO test = new MyPageDTO();
		String expected = " ";

		test.setUpdateDay(expected);
		String actual = test.getUpdateDay();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#getUpdateDay()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetUpdateDay4() {
		MyPageDTO test = new MyPageDTO();
		String expected = "　";

		test.setUpdateDay(expected);
		String actual = test.getUpdateDay();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#getUpdateDay()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetUpdateDay5() {
		MyPageDTO test = new MyPageDTO();
		String expected = "abc123";

		test.setUpdateDay(expected);
		String actual = test.getUpdateDay();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#getUpdateDay()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetUpdateDay6() {
		MyPageDTO test = new MyPageDTO();
		String expected = "あいう１２３";

		test.setUpdateDay(expected);
		String actual = test.getUpdateDay();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#getUpdateDay()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetUpdateDay7() {
		MyPageDTO test = new MyPageDTO();
		String expected = "abc123あいう１２３";

		test.setUpdateDay(expected);
		String actual = test.getUpdateDay();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#getUpdateDay()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetUpdateDay8() {
		MyPageDTO test = new MyPageDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setUpdateDay(expected);
		String actual = test.getUpdateDay();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#setUpdateDay(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetUpdateDay1() {
		MyPageDTO test = new MyPageDTO();
		String expected = null;

		test.setUpdateDay(expected);
		String actual = test.getUpdateDay();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#setUpdateDay(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetUpdateDay2() {
		MyPageDTO test = new MyPageDTO();
		String expected = "";

		test.setUpdateDay(expected);
		String actual = test.getUpdateDay();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#setUpdateDay(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetUpdateDay3() {
		MyPageDTO test = new MyPageDTO();
		String expected = " ";

		test.setUpdateDay(expected);
		String actual = test.getUpdateDay();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#setUpdateDay(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetUpdateDay4() {
		MyPageDTO test = new MyPageDTO();
		String expected = "　";

		test.setUpdateDay(expected);
		String actual = test.getUpdateDay();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#setUpdateDay(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetUpdateDay5() {
		MyPageDTO test = new MyPageDTO();
		String expected = "abc123";

		test.setUpdateDay(expected);
		String actual = test.getUpdateDay();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#setUpdateDay(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetUpdateDay6() {
		MyPageDTO test = new MyPageDTO();
		String expected = "あいう１２３";

		test.setUpdateDay(expected);
		String actual = test.getUpdateDay();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#setUpdateDay(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetUpdateDay7() {
		MyPageDTO test = new MyPageDTO();
		String expected = "abc123あいう１２３";

		test.setUpdateDay(expected);
		String actual = test.getUpdateDay();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.MyPageDTO#setUpdateDay(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetUpdateDay8() {
		MyPageDTO test = new MyPageDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setUpdateDay(expected);
		String actual = test.getUpdateDay();

		assertEquals(expected, actual);

	}













}