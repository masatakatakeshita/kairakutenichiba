package com.internousdev.kairakutenichiba.dto.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.internousdev.kairakutenichiba.dto.LoginDTO;

public class LoginDTOTest {

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.LoginDTO#getUserId()}
	 *  のためのテスト・メソッド。
	 */
	@Test
	public void testGetUserId1() {
		LoginDTO test = new LoginDTO();
		int expected = 0;

		test.setUserId(expected);

		assertEquals(expected, test.getUserId());

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.LoginDTO#getUserId()}
	 *  のためのテスト・メソッド。
	 */
	@Test
	public void testGetUserId2() {
		LoginDTO test = new LoginDTO();
		int expected = 2147483647;

		test.setUserId(expected);

		assertEquals(expected, test.getUserId());
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.LoginDTO#getUserId()}
	 *  のためのテスト・メソッド。
	 */
	@Test
	public void testGetUserId3() {
		LoginDTO test = new LoginDTO();
		int expected = -2147483648;

		test.setUserId(expected);

		assertEquals(expected, test.getUserId());
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.LoginDTO#getUserId()}
	 *  のためのテスト・メソッド。
	 */
	@Test
	public void testGetUserId4() {
		LoginDTO test = new LoginDTO();
		try {
			int UserIdMin = Integer.parseInt("2147483648");
			test.setUserId(UserIdMin);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.LoginDTO#getUserId()}
	 *  のためのテスト・メソッド。
	 */
	@Test
	public void testGetUserId5() {
		LoginDTO test = new LoginDTO();
		try {
			int UserIdMin = Integer.parseInt("-2147483649");
			test.setUserId(UserIdMin);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.LoginDTO#setUserId(int)}
	 *  のためのテスト・メソッド。
	 */
	@Test
	public void testSetUserId1() {
		LoginDTO test = new LoginDTO();
		int expected = 0;

		test.setUserId(expected);
		int actual = test.getUserId();

		assertEquals(expected, actual);
	}


	/**
	 * {@link com.internousdev.kairakutenichiba.dto.LoginDTO#setUserId(int)}
	 *  のためのテスト・メソッド。
	 */
	@Test
	public void testSetUserId2() {
		LoginDTO test = new LoginDTO();
		int expected = 2147483647;

		test.setUserId(expected);
		int actual = test.getUserId();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.LoginDTO#setUserId(int)}
	 *  のためのテスト・メソッド。
	 */
	@Test
	public void testSetUserId3() {
		LoginDTO test = new LoginDTO();
		int expected = -2147483648;

		test.setUserId(expected);
		int actual = test.getUserId();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.LoginDTO#setUserId(int)}
	 *  のためのテスト・メソッド。
	 */
	@Test
	public void testSetUserId4() {
		LoginDTO test = new LoginDTO();
		try {
			int UserIdMax = Integer.parseInt("2147483648");
			test.setUserId(UserIdMax);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.LoginDTO#setUserId(int)}
	 *  のためのテスト・メソッド。
	 */
	@Test
	public void testSetUserId5() {
		LoginDTO test = new LoginDTO();
		try {
			int UserIdMax = Integer.parseInt("-2147483649");
			test.setUserId(UserIdMax);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}

	}


	/**
	 * {@link com.internousdev.kairakutenichiba.dto.LoginDTO#getPassword()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetPassword1() {
		LoginDTO test = new LoginDTO();
		String expected = null;

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.LoginDTO#getPassword()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetPassword2() {
		LoginDTO test = new LoginDTO();
		String expected = "";

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.LoginDTO#getPassword()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetPassword3() {
		LoginDTO test = new LoginDTO();
		String expected = " ";

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.LoginDTO#getPassword()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetPassword4() {
		LoginDTO test = new LoginDTO();
		String expected = "　";

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.LoginDTO#getPassword()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetPassword5() {
		LoginDTO test = new LoginDTO();
		String expected = "abc123";

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.LoginDTO#getPassword()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetPassword6() {
		LoginDTO test = new LoginDTO();
		String expected = "あいう１２３";

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.LoginDTO#getPassword()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetPassword7() {
		LoginDTO test = new LoginDTO();
		String expected = "abc123あいう１２３";

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.LoginDTO#getPassword()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetPassword8() {
		LoginDTO test = new LoginDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.LoginDTO#setPassword(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetPassword1() {
		LoginDTO test = new LoginDTO();
		String expected = null;

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.LoginDTO#setPassword(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetPassword2() {
		LoginDTO test = new LoginDTO();
		String expected = "";

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.LoginDTO#setPassword(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetPassword3() {
		LoginDTO test = new LoginDTO();
		String expected = " ";

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.LoginDTO#setPassword(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetPassword4() {
		LoginDTO test = new LoginDTO();
		String expected = "　";

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.LoginDTO#setPassword(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetPassword5() {
		LoginDTO test = new LoginDTO();
		String expected = "abc123";

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.LoginDTO#setPassword(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetPassword6() {
		LoginDTO test = new LoginDTO();
		String expected = "あいう１２３";

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.LoginDTO#setPassword(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetPassword7() {
		LoginDTO test = new LoginDTO();
		String expected = "abc123あいう１２３";

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.LoginDTO#setPassword(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetPassword8() {
		LoginDTO test = new LoginDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected, actual);

	}


	/**
	 * {@link com.internousdev.kairakutenichiba.dto.LoginDTO#isUserdelFlg()}
	 *  のためのテスト・メソッド。
	 */
	@Test
	public void testIsUserdelFlg1() {
		LoginDTO test = new LoginDTO();
		boolean expected = true;

		test.setUserdelFlg(expected);
		boolean actual=test.isUserdelFlg();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.LoginDTO#isUserdelFlg()}
	 *  のためのテスト・メソッド。
	 */
	@Test
	public void testIsUserdelFlg2() {
		LoginDTO test = new LoginDTO();
		boolean expected = false;

		test.setUserdelFlg(expected);
		boolean actual=test.isUserdelFlg();
		assertEquals(expected, actual);
	}



	/**
	 * {@link com.internousdev.kairakutenichiba.dto.LoginDTO#setUserdelFlg(boolean)}
	 *  のためのテスト・メソッド。
	 */
	@Test
	public void testSetUserdelFlg1() {
		LoginDTO test = new LoginDTO();
		boolean expected = true;

		test.setUserdelFlg(expected);
		boolean actual=test.isUserdelFlg();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.LoginDTO#setUserdelFlg(boolean)}
	 *  のためのテスト・メソッド。
	 */
	@Test
	public void testSetUserdelFlg2() {
		LoginDTO test = new LoginDTO();
		boolean expected = false;

		test.setUserdelFlg(expected);
		boolean actual=test.isUserdelFlg();
		assertEquals(expected, actual);
	}




	/**
	 * {@link com.internousdev.kairakutenichiba.dto.LoginDTO#LoginFlg()}
	 *  のためのテスト・メソッド。
	 */
	@Test
	public void testLoginFlg1() {
		LoginDTO test = new LoginDTO();
		boolean expected = true;

		test.setLoginFlg(expected);
		boolean actual=test.LoginFlg();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.LoginDTO#LoginFlg()}
	 *  のためのテスト・メソッド。
	 */
	@Test
	public void testLoginFlg2() {
		LoginDTO test = new LoginDTO();
		boolean expected = false;

		test.setLoginFlg(expected);
		boolean actual=test.LoginFlg();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.LoginDTO#setLoginFlg(boolean)}
	 *  のためのテスト・メソッド。
	 */
	@Test
	public void testSetLoginFlg1() {
		LoginDTO test = new LoginDTO();
		boolean expected = true;

		test.setLoginFlg(expected);
		boolean actual=test.LoginFlg();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.LoginDTO#setLoginFlg(boolean)}
	 *  のためのテスト・メソッド。
	 */
	@Test
	public void testSetLoginFlg2() {
		LoginDTO test = new LoginDTO();
		boolean expected = false;

		test.setLoginFlg(expected);
		boolean actual=test.LoginFlg();
		assertEquals(expected, actual);
	}
	/**
	 * {@link com.internousdev.kairakutenichiba.dto.LoginDTO#getUserFlg()}
	 *  のためのテスト・メソッド。
	 */
	@Test
	public void testGetUserFlg1() {
		LoginDTO test = new LoginDTO();
		int expected = 0;

		test.setUserFlg(expected);

		assertEquals(expected, test.getUserFlg());

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.LoginDTO#getUserFlg()}
	 *  のためのテスト・メソッド。
	 */
	@Test
	public void testGetUserFlg2() {
		LoginDTO test = new LoginDTO();
		int expected = 2147483647;

		test.setUserFlg(expected);

		assertEquals(expected, test.getUserFlg());
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.LoginDTO#getUserFlg()}
	 *  のためのテスト・メソッド。
	 */
	@Test
	public void testGetUserFlg3() {
		LoginDTO test = new LoginDTO();
		int expected = -2147483648;

		test.setUserFlg(expected);

		assertEquals(expected, test.getUserFlg());
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.LoginDTO#getUserFlg()}
	 *  のためのテスト・メソッド。
	 */
	@Test
	public void testGetUserFlg4() {
		LoginDTO test = new LoginDTO();
		try {
			int UserFlgMin = Integer.parseInt("2147483648");
			test.setUserFlg(UserFlgMin);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.LoginDTO#getUserFlg()}
	 *  のためのテスト・メソッド。
	 */
	@Test
	public void testGetUserFlg5() {
		LoginDTO test = new LoginDTO();
		try {
			int UserFlgMin = Integer.parseInt("-2147483649");
			test.setUserFlg(UserFlgMin);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.LoginDTO#setUserFlg(int)}
	 *  のためのテスト・メソッド。
	 */
	@Test
	public void testSetUserFlg1() {
		LoginDTO test = new LoginDTO();
		int expected = 0;

		test.setUserFlg(expected);
		int actual = test.getUserFlg();

		assertEquals(expected, actual);
	}


	/**
	 * {@link com.internousdev.kairakutenichiba.dto.LoginDTO#setUserFlg(int)}
	 *  のためのテスト・メソッド。
	 */
	@Test
	public void testSetUserFlg2() {
		LoginDTO test = new LoginDTO();
		int expected = 2147483647;

		test.setUserFlg(expected);
		int actual = test.getUserFlg();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.LoginDTO#setUserFlg(int)}
	 *  のためのテスト・メソッド。
	 */
	@Test
	public void testSetUserFlg3() {
		LoginDTO test = new LoginDTO();
		int expected = -2147483648;

		test.setUserFlg(expected);
		int actual = test.getUserFlg();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.LoginDTO#setUserFlg(int)}
	 *  のためのテスト・メソッド。
	 */
	@Test
	public void testSetUserFlg4() {
		LoginDTO test = new LoginDTO();
		try {
			int UserFlgMax = Integer.parseInt("2147483648");
			test.setUserFlg(UserFlgMax);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.LoginDTO#setUserFlg(int)}
	 *  のためのテスト・メソッド。
	 */
	@Test
	public void testSetUserFlg5() {
		LoginDTO test = new LoginDTO();
		try {
			int UserFlgMax = Integer.parseInt("-2147483649");
			test.setUserFlg(UserFlgMax);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.LoginDTO#getOauthId()}
		 * のためのテスト・メソッド。
		 */
	}



		/**
		 * {@link com.internousdev.kairakutenichiba.dto.LoginDTO#getUserName()}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testGetUserName1() {
			LoginDTO test = new LoginDTO();
			String expected = null;

			test.setUserName(expected);
			String actual = test.getUserName();

			assertEquals(expected, actual);
		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.LoginDTO#getUserName()}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testGetUserName2() {
			LoginDTO test = new LoginDTO();
			String expected = "";

			test.setUserName(expected);
			String actual = test.getUserName();

			assertEquals(expected, actual);
		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.LoginDTO#getUserName()}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testGetUserName3() {
			LoginDTO test = new LoginDTO();
			String expected = " ";

			test.setUserName(expected);
			String actual = test.getUserName();

			assertEquals(expected, actual);
		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.LoginDTO#getUserName()}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testGetUserName4() {
			LoginDTO test = new LoginDTO();
			String expected = "　";

			test.setUserName(expected);
			String actual = test.getUserName();

			assertEquals(expected, actual);
		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.LoginDTO#getUserName()}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testGetUserName5() {
			LoginDTO test = new LoginDTO();
			String expected = "abc123";

			test.setUserName(expected);
			String actual = test.getUserName();

			assertEquals(expected, actual);
		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.LoginDTO#getUserName()}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testGetUserName6() {
			LoginDTO test = new LoginDTO();
			String expected = "あいう１２３";

			test.setUserName(expected);
			String actual = test.getUserName();

			assertEquals(expected, actual);
		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.LoginDTO#getUserName()}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testGetUserName7() {
			LoginDTO test = new LoginDTO();
			String expected = "abc123あいう１２３";

			test.setUserName(expected);
			String actual = test.getUserName();

			assertEquals(expected, actual);
		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.LoginDTO#getUserName()}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testGetUserName8() {
			LoginDTO test = new LoginDTO();
			String expected = "ａｂｃ１２３あいう漢字";

			test.setUserName(expected);
			String actual = test.getUserName();

			assertEquals(expected, actual);
		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.LoginDTO#setUserName(java.lang.String)}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testSetUserName1() {
			LoginDTO test = new LoginDTO();
			String expected = null;

			test.setUserName(expected);
			String actual = test.getUserName();

			assertEquals(expected, actual);

		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.LoginDTO#setUserName(java.lang.String)}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testSetUserName2() {
			LoginDTO test = new LoginDTO();
			String expected = "";

			test.setUserName(expected);
			String actual = test.getUserName();

			assertEquals(expected, actual);

		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.LoginDTO#setUserName(java.lang.String)}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testSetUserName3() {
			LoginDTO test = new LoginDTO();
			String expected = " ";

			test.setUserName(expected);
			String actual = test.getUserName();

			assertEquals(expected, actual);

		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.LoginDTO#setUserName(java.lang.String)}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testSetUserName4() {
			LoginDTO test = new LoginDTO();
			String expected = "　";

			test.setUserName(expected);
			String actual = test.getUserName();

			assertEquals(expected, actual);

		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.LoginDTO#setUserName(java.lang.String)}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testSetUserName5() {
			LoginDTO test = new LoginDTO();
			String expected = "abc123";

			test.setUserName(expected);
			String actual = test.getUserName();

			assertEquals(expected, actual);

		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.LoginDTO#setUserName(java.lang.String)}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testSetUserName6() {
			LoginDTO test = new LoginDTO();
			String expected = "あいう１２３";

			test.setUserName(expected);
			String actual = test.getUserName();

			assertEquals(expected, actual);

		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.LoginDTO#setUserName(java.lang.String)}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testSetUserName7() {
			LoginDTO test = new LoginDTO();
			String expected = "abc123あいう１２３";

			test.setUserName(expected);
			String actual = test.getUserName();

			assertEquals(expected, actual);

		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.LoginDTO#setUserName(java.lang.String)}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testSetUserName8() {
			LoginDTO test = new LoginDTO();
			String expected = "ａｂｃ１２３あいう漢字";

			test.setUserName(expected);
			String actual = test.getUserName();

			assertEquals(expected, actual);

		}


		/**
		 * {@link com.internousdev.kairakutenichiba.dto.LoginDTO#getEmail()}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testGetEmail1() {
			LoginDTO test = new LoginDTO();
			String expected = null;

			test.setEmail(expected);
			String actual = test.getEmail();

			assertEquals(expected, actual);
		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.LoginDTO#getEmail()}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testGetEmail2() {
			LoginDTO test = new LoginDTO();
			String expected = "";

			test.setEmail(expected);
			String actual = test.getEmail();

			assertEquals(expected, actual);
		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.LoginDTO#getEmail()}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testGetEmail3() {
			LoginDTO test = new LoginDTO();
			String expected = " ";

			test.setEmail(expected);
			String actual = test.getEmail();

			assertEquals(expected, actual);
		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.LoginDTO#getEmail()}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testGetEmail4() {
			LoginDTO test = new LoginDTO();
			String expected = "　";

			test.setEmail(expected);
			String actual = test.getEmail();

			assertEquals(expected, actual);
		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.LoginDTO#getEmail()}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testGetEmail5() {
			LoginDTO test = new LoginDTO();
			String expected = "abc123";

			test.setEmail(expected);
			String actual = test.getEmail();

			assertEquals(expected, actual);
		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.LoginDTO#getEmail()}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testGetEmail6() {
			LoginDTO test = new LoginDTO();
			String expected = "あいう１２３";

			test.setEmail(expected);
			String actual = test.getEmail();

			assertEquals(expected, actual);
		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.LoginDTO#getEmail()}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testGetEmail7() {
			LoginDTO test = new LoginDTO();
			String expected = "abc123あいう１２３";

			test.setEmail(expected);
			String actual = test.getEmail();

			assertEquals(expected, actual);
		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.LoginDTO#getEmail()}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testGetEmail8() {
			LoginDTO test = new LoginDTO();
			String expected = "ａｂｃ１２３あいう漢字";

			test.setEmail(expected);
			String actual = test.getEmail();

			assertEquals(expected, actual);
		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.LoginDTO#setEmail(java.lang.String)}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testSetEmail1() {
			LoginDTO test = new LoginDTO();
			String expected = null;

			test.setEmail(expected);
			String actual = test.getEmail();

			assertEquals(expected, actual);

		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.LoginDTO#setEmail(java.lang.String)}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testSetEmail2() {
			LoginDTO test = new LoginDTO();
			String expected = "";

			test.setEmail(expected);
			String actual = test.getEmail();

			assertEquals(expected, actual);

		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.LoginDTO#setEmail(java.lang.String)}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testSetEmail3() {
			LoginDTO test = new LoginDTO();
			String expected = " ";

			test.setEmail(expected);
			String actual = test.getEmail();

			assertEquals(expected, actual);

		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.LoginDTO#setEmail(java.lang.String)}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testSetEmail4() {
			LoginDTO test = new LoginDTO();
			String expected = "　";

			test.setEmail(expected);
			String actual = test.getEmail();

			assertEquals(expected, actual);

		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.LoginDTO#setEmail(java.lang.String)}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testSetEmail5() {
			LoginDTO test = new LoginDTO();
			String expected = "abc123";

			test.setEmail(expected);
			String actual = test.getEmail();

			assertEquals(expected, actual);

		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.LoginDTO#setEmail(java.lang.String)}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testSetEmail6() {
			LoginDTO test = new LoginDTO();
			String expected = "あいう１２３";

			test.setEmail(expected);
			String actual = test.getEmail();

			assertEquals(expected, actual);

		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.LoginDTO#setEmail(java.lang.String)}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testSetEmail7() {
			LoginDTO test = new LoginDTO();
			String expected = "abc123あいう１２３";

			test.setEmail(expected);
			String actual = test.getEmail();

			assertEquals(expected, actual);

		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.LoginDTO#setEmail(java.lang.String)}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testSetEmail8() {
			LoginDTO test = new LoginDTO();
			String expected = "ａｂｃ１２３あいう漢字";

			test.setEmail(expected);
			String actual = test.getEmail();

			assertEquals(expected, actual);

		}

}
