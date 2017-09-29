package com.internousdev.kairakutenichiba.dto.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.internousdev.kairakutenichiba.dto.CartDeleteDTO;

/**
 * @author
 */

public class CartDeleteDTOTest {


//UserId--------------------------------------------
	/**
	 *  {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#getUserId()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetUserId1() {
		CartDeleteDTO test = new CartDeleteDTO();
		int expected = 0;

		test.setUserId(expected);

		assertEquals(expected, test.getUserId());
	}

	/**
	 *  {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#getUserId()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetUserId2() {
		CartDeleteDTO test = new CartDeleteDTO();
		int expected = 2147483647;

		test.setUserId(expected);

		assertEquals(expected, test.getUserId());
	}

	/**
	 *  {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#getUserId()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetUserId3() {
		CartDeleteDTO test = new CartDeleteDTO();
		int expected = -2147483648;

		test.setUserId(expected);

		assertEquals(expected, test.getUserId());
	}

	/**
	 *  {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#getUserId()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetUserId4() {
		CartDeleteDTO test = new CartDeleteDTO();
		try {
			int userIdMax = Integer.parseInt("2147483648");
			test.setUserId(userIdMax);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	/**
	 *  {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#getUserId()} のためのテスト・メソッド。
	 */
	@Test
	public void testUserId5() {
		CartDeleteDTO test = new CartDeleteDTO();
		try {
			int userIdMin = Integer.parseInt("-2147483649");
			test.setUserId(userIdMin);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#setUserId(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetUserId1() {
		CartDeleteDTO test = new CartDeleteDTO();
		int expected = 0;

		test.setUserId(expected);
		int actual = test.getUserId();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#setUserId(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetUserId2() {
		CartDeleteDTO test = new CartDeleteDTO();
		int expected = 2147483647;

		test.setUserId(expected);
		int actual = test.getUserId();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#setUserId(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetUserId3() {
		CartDeleteDTO test = new CartDeleteDTO();
		int expected = -2147483648;

		test.setUserId(expected);
		int actual = test.getUserId();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#setUserId(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetUserId4() {
		CartDeleteDTO test = new CartDeleteDTO();
		try {
			int userIdMax = Integer.parseInt("2147483648");
			test.setUserId(userIdMax);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#setUserId(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetUserId5() {
		CartDeleteDTO test = new CartDeleteDTO();
		try {
			int userIdMin = Integer.parseInt("-2147483649");
			test.setUserId(userIdMin);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}

	}

//Password---------------------------------------
	  public void testGetPassword() {
	        CartDeleteDTO dto = new CartDeleteDTO();
	        String expected = null;
	        dto.setPassword(expected);
	        assertEquals(expected, dto.getPassword());
	    }

	    public void testGetPassword2() {
	        CartDeleteDTO dto = new CartDeleteDTO();
	        String expected = "";
	        dto.setPassword(expected);
	        assertEquals(expected, dto.getPassword());
	    }

	    public void testGetPassword3() {
	        CartDeleteDTO dto = new CartDeleteDTO();
	        String expected = " ";
	        dto.setPassword(expected);
	        assertEquals(expected, dto.getPassword());
	    }

	    public void testGetPassword4() {
	        CartDeleteDTO dto = new CartDeleteDTO();
	        String expected = "　";
	        dto.setPassword(expected);
	        assertEquals(expected, dto.getPassword());
	    }

	    public void testGetPassword5() {
	        CartDeleteDTO dto = new CartDeleteDTO();
	        String expected = "abc123";
	        dto.setPassword(expected);
	        assertEquals(expected, dto.getPassword());
	    }

	    public void testGetPassword6() {
	        CartDeleteDTO dto = new CartDeleteDTO();
	        String expected = "あいう１２３";
	        dto.setPassword(expected);
	        assertEquals(expected, dto.getPassword());
	    }

	    public void testGetPassword7() {
	        CartDeleteDTO dto = new CartDeleteDTO();
	        String expected = "abc123あいう１２３";
	        dto.setPassword(expected);
	        assertEquals(expected, dto.getPassword());
	    }

	    public void testGetPassword8() {
	        CartDeleteDTO dto = new CartDeleteDTO();
	        String expected = "abc123あいう１２３漢字";
	        dto.setPassword(expected);
	        assertEquals(expected, dto.getPassword());
	    }

	    public void testSetPassword() {
	        CartDeleteDTO dto = new CartDeleteDTO();
	        String expected = null;
	        dto.setPassword(expected);
	        assertEquals(expected, dto.getPassword());
	    }

	    public void testSetPassword2() {
	        CartDeleteDTO dto = new CartDeleteDTO();
	        String expected = "";
	        dto.setPassword(expected);
	        assertEquals(expected, dto.getPassword());
	    }

	    public void testSetPassword3() {
	        CartDeleteDTO dto = new CartDeleteDTO();
	        String expected = " ";
	        dto.setPassword(expected);
	        assertEquals(expected, dto.getPassword());
	    }

	    public void testSetPassword4() {
	        CartDeleteDTO dto = new CartDeleteDTO();
	        String expected = "　";
	        dto.setPassword(expected);
	        assertEquals(expected, dto.getPassword());
	    }

	    public void testSetPassword5() {
	        CartDeleteDTO dto = new CartDeleteDTO();
	        String expected = "abc123";
	        dto.setPassword(expected);
	        assertEquals(expected, dto.getPassword());
	    }

	    public void testSetPassword6() {
	        CartDeleteDTO dto = new CartDeleteDTO();
	        String expected = "あいう１２３";
	        dto.setPassword(expected);
	        assertEquals(expected, dto.getPassword());
	    }

	    public void testSetPassword7() {
	        CartDeleteDTO dto = new CartDeleteDTO();
	        String expected = "abc123あいう１２３";
	        dto.setPassword(expected);
	        assertEquals(expected, dto.getPassword());
	    }

	    public void testSetPassword8() {
	        CartDeleteDTO dto = new CartDeleteDTO();
	        String expected = "abc123あいう１２３漢字";
	        dto.setPassword(expected);
	        assertEquals(expected, dto.getPassword());
	    }

//UserName---------------------------------------
	    /**
		 * {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#getUserName()}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testGetUserName1() {
			CartDeleteDTO test = new CartDeleteDTO();
			String expected = null;

			test.setUserName(expected);
			String actual = test.getUserName();

			assertEquals(expected, actual);
		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#getUserName()}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testGetUserName2() {
			CartDeleteDTO test = new CartDeleteDTO();
			String expected = "";

			test.setUserName(expected);
			String actual = test.getUserName();

			assertEquals(expected, actual);
		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#getUserName()}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testGetUserName3() {
			CartDeleteDTO test = new CartDeleteDTO();
			String expected = " ";

			test.setUserName(expected);
			String actual = test.getUserName();

			assertEquals(expected, actual);
		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#getUserName()}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testGetUserName4() {
			CartDeleteDTO test = new CartDeleteDTO();
			String expected = "　";

			test.setUserName(expected);
			String actual = test.getUserName();

			assertEquals(expected, actual);
		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#getUserName()}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testGetUserName5() {
			CartDeleteDTO test = new CartDeleteDTO();
			String expected = "abc123";

			test.setUserName(expected);
			String actual = test.getUserName();

			assertEquals(expected, actual);
		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#getUserName()}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testGetUserName6() {
			CartDeleteDTO test = new CartDeleteDTO();
			String expected = "あいう１２３";

			test.setUserName(expected);
			String actual = test.getUserName();

			assertEquals(expected, actual);
		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#getUserName()}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testGetUserName7() {
			CartDeleteDTO test = new CartDeleteDTO();
			String expected = "abc123あいう１２３";

			test.setUserName(expected);
			String actual = test.getUserName();

			assertEquals(expected, actual);
		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#getUserName()}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testGetUserName8() {
			CartDeleteDTO test = new CartDeleteDTO();
			String expected = "ａｂｃ１２３あいう漢字";

			test.setUserName(expected);
			String actual = test.getUserName();

			assertEquals(expected, actual);
		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#setUserName(java.lang.String)}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testSetUserName1() {
			CartDeleteDTO test = new CartDeleteDTO();
			String expected = null;

			test.setUserName(expected);
			String actual = test.getUserName();

			assertEquals(expected, actual);

		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#setUserName(java.lang.String)}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testSetUserName2() {
			CartDeleteDTO test = new CartDeleteDTO();
			String expected = "";

			test.setUserName(expected);
			String actual = test.getUserName();

			assertEquals(expected, actual);

		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#setUserName(java.lang.String)}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testSetUserName3() {
			CartDeleteDTO test = new CartDeleteDTO();
			String expected = " ";

			test.setUserName(expected);
			String actual = test.getUserName();

			assertEquals(expected, actual);

		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#setUserName(java.lang.String)}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testSetUserName4() {
			CartDeleteDTO test = new CartDeleteDTO();
			String expected = "　";

			test.setUserName(expected);
			String actual = test.getUserName();

			assertEquals(expected, actual);

		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#setUserName(java.lang.String)}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testSetUserName5() {
			CartDeleteDTO test = new CartDeleteDTO();
			String expected = "abc123";

			test.setUserName(expected);
			String actual = test.getUserName();

			assertEquals(expected, actual);

		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#setUserName(java.lang.String)}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testSetUserName6() {
			CartDeleteDTO test = new CartDeleteDTO();
			String expected = "あいう１２３";

			test.setUserName(expected);
			String actual = test.getUserName();

			assertEquals(expected, actual);

		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#setUserName(java.lang.String)}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testSetUserName7() {
			CartDeleteDTO test = new CartDeleteDTO();
			String expected = "abc123あいう１２３";

			test.setUserName(expected);
			String actual = test.getUserName();

			assertEquals(expected, actual);

		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#setUserName(java.lang.String)}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testSetUserName8() {
			CartDeleteDTO test = new CartDeleteDTO();
			String expected = "ａｂｃ１２３あいう漢字";

			test.setUserName(expected);
			String actual = test.getUserName();

			assertEquals(expected, actual);

		}

//Postal-----------------------------------

		@Test
		public void testGetPostal1() {
			CartDeleteDTO test = new CartDeleteDTO();
			String expected = null;

			test.setPostal(expected);
			String actual = test.getPostal();

			assertEquals(expected, actual);
		}

		/**
		 * {@link com.internousdev.legimina.dto.CartDeleteDTO#getPostal()}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testGetPostal2() {
			CartDeleteDTO test = new CartDeleteDTO();
			String expected = "";

			test.setPostal(expected);
			String actual = test.getPostal();

			assertEquals(expected, actual);
		}

		/**
		 * {@link com.internousdev.legimina.dto.CartDeleteDTO#getPostal()}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testGetPostal3() {
			CartDeleteDTO test = new CartDeleteDTO();
			String expected = " ";

			test.setPostal(expected);
			String actual = test.getPostal();

			assertEquals(expected, actual);
		}

		/**
		 * {@link com.internousdev.legimina.dto.CartDeleteDTO#getPostal()}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testGetPostal4() {
			CartDeleteDTO test = new CartDeleteDTO();
			String expected = "　";

			test.setPostal(expected);
			String actual = test.getPostal();

			assertEquals(expected, actual);
		}

		/**
		 * {@link com.internousdev.legimina.dto.CartDeleteDTO#getPostal()}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testGetPostal5() {
			CartDeleteDTO test = new CartDeleteDTO();
			String expected = "abc123";

			test.setPostal(expected);
			String actual = test.getPostal();

			assertEquals(expected, actual);
		}

		/**
		 * {@link com.internousdev.legimina.dto.CartDeleteDTO#getPostal()}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testGetPostal6() {
			CartDeleteDTO test = new CartDeleteDTO();
			String expected = "あいう１２３";

			test.setPostal(expected);
			String actual = test.getPostal();

			assertEquals(expected, actual);
		}

		/**
		 * {@link com.internousdev.legimina.dto.CartDeleteDTO#getPostal()}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testGetPostal7() {
			CartDeleteDTO test = new CartDeleteDTO();
			String expected = "abc123あいう１２３";

			test.setPostal(expected);
			String actual = test.getPostal();

			assertEquals(expected, actual);
		}

		/**
		 * {@link com.internousdev.legimina.dto.CartDeleteDTO#getPostal()}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testGetPostal8() {
			CartDeleteDTO test = new CartDeleteDTO();
			String expected = "ａｂｃ１２３あいう漢字";

			test.setPostal(expected);
			String actual = test.getPostal();

			assertEquals(expected, actual);
		}

		/**
		 * {@link com.internousdev.legimina.dto.CartDeleteDTO#setPostal(java.lang.String)}
		 * のためのテスト・メソッド。
		 */



		@Test
		public void testSetPostal1() {
			CartDeleteDTO test = new CartDeleteDTO();
			String expected = null;

			test.setPostal(expected);
			String actual = test.getPostal();

			assertEquals(expected, actual);

		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#setPostal(java.lang.String)}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testSetPostal2() {
			CartDeleteDTO test = new CartDeleteDTO();
			String expected = "";

			test.setPostal(expected);
			String actual = test.getPostal();

			assertEquals(expected, actual);

		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#setPostal(java.lang.String)}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testSetPostal3() {
			CartDeleteDTO test = new CartDeleteDTO();
			String expected = " ";

			test.setPostal(expected);
			String actual = test.getPostal();

			assertEquals(expected, actual);

		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#setPostal(java.lang.String)}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testSetPostal4() {
			CartDeleteDTO test = new CartDeleteDTO();
			String expected = "　";

			test.setPostal(expected);
			String actual = test.getPostal();

			assertEquals(expected, actual);

		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#setPostal(java.lang.String)}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testSetPostal5() {
			CartDeleteDTO test = new CartDeleteDTO();
			String expected = "abc123";

			test.setPostal(expected);
			String actual = test.getPostal();

			assertEquals(expected, actual);

		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#setPostal(java.lang.String)}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testSetPostal6() {
			CartDeleteDTO test = new CartDeleteDTO();
			String expected = "あいう１２３";

			test.setPostal(expected);
			String actual = test.getPostal();

			assertEquals(expected, actual);

		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#setPostal(java.lang.String)}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testSetPostal7() {
			CartDeleteDTO test = new CartDeleteDTO();
			String expected = "abc123あいう１２３";

			test.setPostal(expected);
			String actual = test.getPostal();

			assertEquals(expected, actual);

		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#setPostal(java.lang.String)}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testSetPostal8() {
			CartDeleteDTO test = new CartDeleteDTO();
			String expected = "ａｂｃ１２３あいう漢字";

			test.setPostal(expected);
			String actual = test.getPostal();

			assertEquals(expected, actual);

		}

		@Test
		public void testGetAddress1() {
			CartDeleteDTO test = new CartDeleteDTO();
			String expected = null;

			test.setAddress(expected);
			String actual = test.getAddress();

			assertEquals(expected, actual);
		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#getAddress()}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testGetAddress2() {
			CartDeleteDTO test = new CartDeleteDTO();
			String expected = "";

			test.setAddress(expected);
			String actual = test.getAddress();

			assertEquals(expected, actual);
		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#getAddress()}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testGetAddress3() {
			CartDeleteDTO test = new CartDeleteDTO();
			String expected = " ";

			test.setAddress(expected);
			String actual = test.getAddress();

			assertEquals(expected, actual);
		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#getAddress()}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testGetAddress4() {
			CartDeleteDTO test = new CartDeleteDTO();
			String expected = "　";

			test.setAddress(expected);
			String actual = test.getAddress();

			assertEquals(expected, actual);
		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#getAddress()}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testGetAddress5() {
			CartDeleteDTO test = new CartDeleteDTO();
			String expected = "abc123";

			test.setAddress(expected);
			String actual = test.getAddress();

			assertEquals(expected, actual);
		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#getAddress()}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testGetAddress6() {
			CartDeleteDTO test = new CartDeleteDTO();
			String expected = "あいう１２３";

			test.setAddress(expected);
			String actual = test.getAddress();

			assertEquals(expected, actual);
		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#getAddress()}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testGetAddress7() {
			CartDeleteDTO test = new CartDeleteDTO();
			String expected = "abc123あいう１２３";

			test.setAddress(expected);
			String actual = test.getAddress();

			assertEquals(expected, actual);
		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#getAddress()}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testGetAddress8() {
			CartDeleteDTO test = new CartDeleteDTO();
			String expected = "ａｂｃ１２３あいう漢字";

			test.setAddress(expected);
			String actual = test.getAddress();

			assertEquals(expected, actual);
		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#setAddress(java.lang.String)}
		 * のためのテスト・メソッド。
*/






		@Test
		public void testSetAddress1() {
			CartDeleteDTO test = new CartDeleteDTO();
			String expected = null;

			test.setAddress(expected);
			String actual = test.getAddress();

			assertEquals(expected, actual);

		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#setAddress(java.lang.String)}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testSetAddress2() {
			CartDeleteDTO test = new CartDeleteDTO();
			String expected = "";

			test.setAddress(expected);
			String actual = test.getAddress();

			assertEquals(expected, actual);

		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#setAddress(java.lang.String)}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testSetAddress3() {
			CartDeleteDTO test = new CartDeleteDTO();
			String expected = " ";

			test.setAddress(expected);
			String actual = test.getAddress();

			assertEquals(expected, actual);

		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#setAddress(java.lang.String)}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testSetAddress4() {
			CartDeleteDTO test = new CartDeleteDTO();
			String expected = "　";

			test.setAddress(expected);
			String actual = test.getAddress();

			assertEquals(expected, actual);

		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#setAddress(java.lang.String)}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testSetAddress5() {
			CartDeleteDTO test = new CartDeleteDTO();
			String expected = "abc123";

			test.setAddress(expected);
			String actual = test.getAddress();

			assertEquals(expected, actual);

		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#setAddress(java.lang.String)}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testSetAddress6() {
			CartDeleteDTO test = new CartDeleteDTO();
			String expected = "あいう１２３";

			test.setAddress(expected);
			String actual = test.getAddress();

			assertEquals(expected, actual);

		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#setAddress(java.lang.String)}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testSetAddress7() {
			CartDeleteDTO test = new CartDeleteDTO();
			String expected = "abc123あいう１２３";

			test.setAddress(expected);
			String actual = test.getAddress();

			assertEquals(expected, actual);

		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#setAddress(java.lang.String)}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testSetAddress8() {
			CartDeleteDTO test = new CartDeleteDTO();
			String expected = "ａｂｃ１２３あいう漢字";

			test.setAddress(expected);
			String actual = test.getAddress();

			assertEquals(expected, actual);

		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#getEmail()}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testGetEmail1() {
			CartDeleteDTO test = new CartDeleteDTO();
			String expected = null;

			test.setEmail(expected);
			String actual = test.getEmail();

			assertEquals(expected, actual);
		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#getEmail()}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testGetEmail2() {
			CartDeleteDTO test = new CartDeleteDTO();
			String expected = "";

			test.setEmail(expected);
			String actual = test.getEmail();

			assertEquals(expected, actual);
		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#getEmail()}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testGetEmail3() {
			CartDeleteDTO test = new CartDeleteDTO();
			String expected = " ";

			test.setEmail(expected);
			String actual = test.getEmail();

			assertEquals(expected, actual);
		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#getEmail()}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testGetEmail4() {
			CartDeleteDTO test = new CartDeleteDTO();
			String expected = "　";

			test.setEmail(expected);
			String actual = test.getEmail();

			assertEquals(expected, actual);
		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#getEmail()}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testGetEmail5() {
			CartDeleteDTO test = new CartDeleteDTO();
			String expected = "abc123";

			test.setEmail(expected);
			String actual = test.getEmail();

			assertEquals(expected, actual);
		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#getEmail()}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testGetEmail6() {
			CartDeleteDTO test = new CartDeleteDTO();
			String expected = "あいう１２３";

			test.setEmail(expected);
			String actual = test.getEmail();

			assertEquals(expected, actual);
		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#getEmail()}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testGetEmail7() {
			CartDeleteDTO test = new CartDeleteDTO();
			String expected = "abc123あいう１２３";

			test.setEmail(expected);
			String actual = test.getEmail();

			assertEquals(expected, actual);
		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#getEmail()}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testGetEmail8() {
			CartDeleteDTO test = new CartDeleteDTO();
			String expected = "ａｂｃ１２３あいう漢字";

			test.setEmail(expected);
			String actual = test.getEmail();

			assertEquals(expected, actual);
		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#setEmail(java.lang.String)}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testSetEmail1() {
			CartDeleteDTO test = new CartDeleteDTO();
			String expected = null;

			test.setEmail(expected);
			String actual = test.getEmail();

			assertEquals(expected, actual);

		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#setEmail(java.lang.String)}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testSetEmail2() {
			CartDeleteDTO test = new CartDeleteDTO();
			String expected = "";

			test.setEmail(expected);
			String actual = test.getEmail();

			assertEquals(expected, actual);

		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#setEmail(java.lang.String)}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testSetEmail3() {
			CartDeleteDTO test = new CartDeleteDTO();
			String expected = " ";

			test.setEmail(expected);
			String actual = test.getEmail();

			assertEquals(expected, actual);

		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#setEmail(java.lang.String)}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testSetEmail4() {
			CartDeleteDTO test = new CartDeleteDTO();
			String expected = "　";

			test.setEmail(expected);
			String actual = test.getEmail();

			assertEquals(expected, actual);

		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#setEmail(java.lang.String)}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testSetEmail5() {
			CartDeleteDTO test = new CartDeleteDTO();
			String expected = "abc123";

			test.setEmail(expected);
			String actual = test.getEmail();

			assertEquals(expected, actual);

		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#setEmail(java.lang.String)}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testSetEmail6() {
			CartDeleteDTO test = new CartDeleteDTO();
			String expected = "あいう１２３";

			test.setEmail(expected);
			String actual = test.getEmail();

			assertEquals(expected, actual);

		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#setEmail(java.lang.String)}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testSetEmail7() {
			CartDeleteDTO test = new CartDeleteDTO();
			String expected = "abc123あいう１２３";

			test.setEmail(expected);
			String actual = test.getEmail();

			assertEquals(expected, actual);

		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#setEmail(java.lang.String)}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testSetEmail8() {
			CartDeleteDTO test = new CartDeleteDTO();
			String expected = "ａｂｃ１２３あいう漢字";

			test.setEmail(expected);
			String actual = test.getEmail();

			assertEquals(expected, actual);

		}





		/**
		 * {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#getBirthday()}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testGetBirthday1() {
			CartDeleteDTO test = new CartDeleteDTO();
			String expected = null;

			test.setBirthday(expected);
			String actual = test.getBirthday();

			assertEquals(expected, actual);
		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#getBirthday()}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testGetBirthday2() {
			CartDeleteDTO test = new CartDeleteDTO();
			String expected = "";

			test.setBirthday(expected);
			String actual = test.getBirthday();

			assertEquals(expected, actual);
		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#getBirthday()}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testGetBirthday3() {
			CartDeleteDTO test = new CartDeleteDTO();
			String expected = " ";

			test.setBirthday(expected);
			String actual = test.getBirthday();

			assertEquals(expected, actual);
		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#getBirthday()}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testGetBirthday4() {
			CartDeleteDTO test = new CartDeleteDTO();
			String expected = "　";

			test.setBirthday(expected);
			String actual = test.getBirthday();

			assertEquals(expected, actual);
		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#getBirthday()}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testGetBirthday5() {
			CartDeleteDTO test = new CartDeleteDTO();
			String expected = "abc123";

			test.setBirthday(expected);
			String actual = test.getBirthday();

			assertEquals(expected, actual);
		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#getBirthday()}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testGetBirthday6() {
			CartDeleteDTO test = new CartDeleteDTO();
			String expected = "あいう１２３";

			test.setBirthday(expected);
			String actual = test.getBirthday();

			assertEquals(expected, actual);
		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#getBirthday()}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testGetBirthday7() {
			CartDeleteDTO test = new CartDeleteDTO();
			String expected = "abc123あいう１２３";

			test.setBirthday(expected);
			String actual = test.getBirthday();

			assertEquals(expected, actual);
		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#getBirthday()}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testGetBirthday8() {
			CartDeleteDTO test = new CartDeleteDTO();
			String expected = "ａｂｃ１２３あいう漢字";

			test.setBirthday(expected);
			String actual = test.getBirthday();

			assertEquals(expected, actual);
		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#setBirthday(java.lang.String)}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testSetBirthday1() {
			CartDeleteDTO test = new CartDeleteDTO();
			String expected = null;

			test.setBirthday(expected);
			String actual = test.getBirthday();

			assertEquals(expected, actual);

		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#setBirthday(java.lang.String)}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testSetBirthday2() {
			CartDeleteDTO test = new CartDeleteDTO();
			String expected = "";

			test.setBirthday(expected);
			String actual = test.getBirthday();

			assertEquals(expected, actual);

		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#setBirthday(java.lang.String)}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testSetBirthday3() {
			CartDeleteDTO test = new CartDeleteDTO();
			String expected = " ";

			test.setBirthday(expected);
			String actual = test.getBirthday();

			assertEquals(expected, actual);

		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#setBirthday(java.lang.String)}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testSetBirthday4() {
			CartDeleteDTO test = new CartDeleteDTO();
			String expected = "　";

			test.setBirthday(expected);
			String actual = test.getBirthday();

			assertEquals(expected, actual);

		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#setBirthday(java.lang.String)}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testSetBirthday5() {
			CartDeleteDTO test = new CartDeleteDTO();
			String expected = "abc123";

			test.setBirthday(expected);
			String actual = test.getBirthday();

			assertEquals(expected, actual);

		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#setBirthday(java.lang.String)}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testSetBirthday6() {
			CartDeleteDTO test = new CartDeleteDTO();
			String expected = "あいう１２３";

			test.setBirthday(expected);
			String actual = test.getBirthday();

			assertEquals(expected, actual);

		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#setBirthday(java.lang.String)}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testSetBirthday7() {
			CartDeleteDTO test = new CartDeleteDTO();
			String expected = "abc123あいう１２３";

			test.setBirthday(expected);
			String actual = test.getBirthday();

			assertEquals(expected, actual);

		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#setBirthday(java.lang.String)}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testSetBirthday8() {
			CartDeleteDTO test = new CartDeleteDTO();
			String expected = "ａｂｃ１２３あいう漢字";

			test.setBirthday(expected);
			String actual = test.getBirthday();

			assertEquals(expected, actual);

		}




		/**
		 * {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#getUserFlg()} のためのテスト・メソッド。
		 */
		@Test
		public void testGetUserFlg1() {
			CartDeleteDTO test = new CartDeleteDTO();
			int expected = 0;

			test.setUserFlg(expected);

			assertEquals(expected, test.getUserFlg());

		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#getUserFlg()} のためのテスト・メソッド。
		 */
		@Test
		public void testGetUserFlg2() {
			CartDeleteDTO test = new CartDeleteDTO();
			int expected = 2147483647;

			test.setUserFlg(expected);

			assertEquals(expected, test.getUserFlg());
		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#getUserFlg()} のためのテスト・メソッド。
		 */
		@Test
		public void testGetUserFlg3() {
			CartDeleteDTO test = new CartDeleteDTO();
			int expected = -2147483648;

			test.setUserFlg(expected);

			assertEquals(expected, test.getUserFlg());
		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#getUserFlg()} のためのテスト・メソッド。
		 */
		@Test
		public void testGetUserFlg4() {
			CartDeleteDTO test = new CartDeleteDTO();
			try {
				int UserFlgMin = Integer.parseInt("2147483648");
				test.setUserFlg(UserFlgMin);

			} catch (RuntimeException e) {
				assertEquals(e.getMessage(), "For input string: \"2147483648\"");
			}
		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#getUserFlg()} のためのテスト・メソッド。
		 */
		@Test
		public void testGetUserFlg5() {
			CartDeleteDTO test = new CartDeleteDTO();
			try {
				int UserFlgMin = Integer.parseInt("-2147483649");
				test.setUserFlg(UserFlgMin);

			} catch (RuntimeException e) {
				assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
			}
		}



		/**
		 * {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#setUserFlg(int)}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testSetUserFlg1() {
			CartDeleteDTO test = new CartDeleteDTO();
			int expected = 0;

			test.setUserFlg(expected);
			int actual = test.getUserFlg();

			assertEquals(expected, actual);
		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#setUserFlg(int)}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testSetUserFlg2() {
			CartDeleteDTO test = new CartDeleteDTO();
			int expected = 2147483647;

			test.setUserFlg(expected);
			int actual = test.getUserFlg();

			assertEquals(expected, actual);
		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#setUserFlg(int)}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testSetUserFlg3() {
			CartDeleteDTO test = new CartDeleteDTO();
			int expected = -2147483648;

			test.setUserFlg(expected);
			int actual = test.getUserFlg();

			assertEquals(expected, actual);
		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#setUserFlg(int)}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testSetUserFlg4() {
			CartDeleteDTO test = new CartDeleteDTO();
			try {
				int UserFlgMax = Integer.parseInt("2147483648");
				test.setUserFlg(UserFlgMax);

			} catch (RuntimeException e) {
				assertEquals(e.getMessage(), "For input string: \"2147483648\"");
			}
		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#setUserFlg(int)}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testSetUserFlg5() {
			CartDeleteDTO test = new CartDeleteDTO();
			try {
				int UserFlgMax = Integer.parseInt("-2147483649");
				test.setUserFlg(UserFlgMax);

			} catch (RuntimeException e) {
				assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
			}

		}



	public class testtest {
		/**
		 * {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#isUserdelFlg()}
		 *  のためのテスト・メソッド。
		 */
		@Test
		public void testIsUserdelFlg1() {
			CartDeleteDTO test = new CartDeleteDTO();
			boolean expected = true;

			test.setUserdelFlg(expected);
			boolean actual=test.isUserdelFlg();
			assertEquals(expected, actual);
		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#isUserdelFlg()}
		 *  のためのテスト・メソッド。
		 */
		@Test
		public void testIsUserdelFlg2() {
			CartDeleteDTO test = new CartDeleteDTO();
			boolean expected = false;

			test.setUserdelFlg(expected);
			boolean actual=test.isUserdelFlg();
			assertEquals(expected, actual);
		}



		/**
		 * {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#setUserdelFlg(boolean)}
		 *  のためのテスト・メソッド。
		 */
		@Test
		public void testSetUserdelFlg1() {
			CartDeleteDTO test = new CartDeleteDTO();
			boolean expected = true;

			test.setUserdelFlg(expected);
			boolean actual=test.isUserdelFlg();
			assertEquals(expected, actual);
		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#setUserdelFlg(boolean)}
		 *  のためのテスト・メソッド。
		 */
		@Test
		public void testSetUserdelFlg2() {
			CartDeleteDTO test = new CartDeleteDTO();
			boolean expected = false;

			test.setUserdelFlg(expected);
			boolean actual=test.isUserdelFlg();
			assertEquals(expected, actual);
		}
		/**
		 * {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#isLoginFlg()}
		 *  のためのテスト・メソッド。
		 */
		@Test
		public void testIsLoginFlg1() {
			CartDeleteDTO test = new CartDeleteDTO();
			boolean expected = true;

			test.setLoginFlg(expected);
			boolean actual=test.isLoginFlg();
			assertEquals(expected, actual);
		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#isLoginFlg()}
		 *  のためのテスト・メソッド。
		 */
		@Test
		public void testIsLoginFlg2() {
			CartDeleteDTO test = new CartDeleteDTO();
			boolean expected = false;

			test.setLoginFlg(expected);
			boolean actual=test.isLoginFlg();
			assertEquals(expected, actual);
		}



		/**
		 * {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#setLoginFlg(boolean)}
		 *  のためのテスト・メソッド。
		 */
		@Test
		public void testSetLoginFlg1() {
			CartDeleteDTO test = new CartDeleteDTO();
			boolean expected = true;

			test.setLoginFlg(expected);
			boolean actual=test.isLoginFlg();
			assertEquals(expected, actual);
		}

		/**
		 * {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#setLoginFlg(boolean)}
		 *  のためのテスト・メソッド。
		 */
		@Test
		public void testSetLoginFlg2() {
			CartDeleteDTO test = new CartDeleteDTO();
			boolean expected = false;

			test.setLoginFlg(expected);
			boolean actual=test.isLoginFlg();
			assertEquals(expected, actual);
		}

}


	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#getYear()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetYear1() {
		CartDeleteDTO test = new CartDeleteDTO();
		String expected = null;

		test.setYear(expected);
		String actual = test.getYear();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#getYear()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetYear2() {
		CartDeleteDTO test = new CartDeleteDTO();
		String expected = "";

		test.setYear(expected);
		String actual = test.getYear();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#getYear()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetYear3() {
		CartDeleteDTO test = new CartDeleteDTO();
		String expected = " ";

		test.setYear(expected);
		String actual = test.getYear();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#getYear()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetYear4() {
		CartDeleteDTO test = new CartDeleteDTO();
		String expected = "　";

		test.setYear(expected);
		String actual = test.getYear();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#getYear()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetYear5() {
		CartDeleteDTO test = new CartDeleteDTO();
		String expected = "abc123";

		test.setYear(expected);
		String actual = test.getYear();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#getYear()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetYear6() {
		CartDeleteDTO test = new CartDeleteDTO();
		String expected = "あいう１２３";

		test.setYear(expected);
		String actual = test.getYear();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#getYear()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetYear7() {
		CartDeleteDTO test = new CartDeleteDTO();
		String expected = "abc123あいう１２３";

		test.setYear(expected);
		String actual = test.getYear();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#getYear()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetYear8() {
		CartDeleteDTO test = new CartDeleteDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setYear(expected);
		String actual = test.getYear();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#setYear(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetYear1() {
		CartDeleteDTO test = new CartDeleteDTO();
		String expected = null;

		test.setYear(expected);
		String actual = test.getYear();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#setYear(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetYear2() {
		CartDeleteDTO test = new CartDeleteDTO();
		String expected = "";

		test.setYear(expected);
		String actual = test.getYear();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#setYear(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetYear3() {
		CartDeleteDTO test = new CartDeleteDTO();
		String expected = " ";

		test.setYear(expected);
		String actual = test.getYear();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#setYear(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetYear4() {
		CartDeleteDTO test = new CartDeleteDTO();
		String expected = "　";

		test.setYear(expected);
		String actual = test.getYear();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#setYear(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetYear5() {
		CartDeleteDTO test = new CartDeleteDTO();
		String expected = "abc123";

		test.setYear(expected);
		String actual = test.getYear();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#setYear(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetYear6() {
		CartDeleteDTO test = new CartDeleteDTO();
		String expected = "あいう１２３";

		test.setYear(expected);
		String actual = test.getYear();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#setYear(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetYear7() {
		CartDeleteDTO test = new CartDeleteDTO();
		String expected = "abc123あいう１２３";

		test.setYear(expected);
		String actual = test.getYear();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#setYear(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetYear8() {
		CartDeleteDTO test = new CartDeleteDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setYear(expected);
		String actual = test.getYear();

		assertEquals(expected, actual);

	}


	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#getMonth()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetMonth1() {
		CartDeleteDTO test = new CartDeleteDTO();
		String expected = null;

		test.setMonth(expected);
		String actual = test.getMonth();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#getMonth()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetMonth2() {
		CartDeleteDTO test = new CartDeleteDTO();
		String expected = "";

		test.setMonth(expected);
		String actual = test.getMonth();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#getMonth()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetMonth3() {
		CartDeleteDTO test = new CartDeleteDTO();
		String expected = " ";

		test.setMonth(expected);
		String actual = test.getMonth();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#getMonth()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetMonth4() {
		CartDeleteDTO test = new CartDeleteDTO();
		String expected = "　";

		test.setMonth(expected);
		String actual = test.getMonth();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#getMonth()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetMonth5() {
		CartDeleteDTO test = new CartDeleteDTO();
		String expected = "abc123";

		test.setMonth(expected);
		String actual = test.getMonth();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#getMonth()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetMonth6() {
		CartDeleteDTO test = new CartDeleteDTO();
		String expected = "あいう１２３";

		test.setMonth(expected);
		String actual = test.getMonth();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#getMonth()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetMonth7() {
		CartDeleteDTO test = new CartDeleteDTO();
		String expected = "abc123あいう１２３";

		test.setMonth(expected);
		String actual = test.getMonth();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#getMonth()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetMonth8() {
		CartDeleteDTO test = new CartDeleteDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setMonth(expected);
		String actual = test.getMonth();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#setMonth(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetMonth1() {
		CartDeleteDTO test = new CartDeleteDTO();
		String expected = null;

		test.setMonth(expected);
		String actual = test.getMonth();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#setMonth(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetMonth2() {
		CartDeleteDTO test = new CartDeleteDTO();
		String expected = "";

		test.setMonth(expected);
		String actual = test.getMonth();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#setMonth(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetMonth3() {
		CartDeleteDTO test = new CartDeleteDTO();
		String expected = " ";

		test.setMonth(expected);
		String actual = test.getMonth();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#setMonth(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetMonth4() {
		CartDeleteDTO test = new CartDeleteDTO();
		String expected = "　";

		test.setMonth(expected);
		String actual = test.getMonth();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#setMonth(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetMonth5() {
		CartDeleteDTO test = new CartDeleteDTO();
		String expected = "abc123";

		test.setMonth(expected);
		String actual = test.getMonth();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#setMonth(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetMonth6() {
		CartDeleteDTO test = new CartDeleteDTO();
		String expected = "あいう１２３";

		test.setMonth(expected);
		String actual = test.getMonth();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#setMonth(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetMonth7() {
		CartDeleteDTO test = new CartDeleteDTO();
		String expected = "abc123あいう１２３";

		test.setMonth(expected);
		String actual = test.getMonth();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#setMonth(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetMonth8() {
		CartDeleteDTO test = new CartDeleteDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setMonth(expected);
		String actual = test.getMonth();

		assertEquals(expected, actual);

	}


	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#getRegisterDay()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetRegisterDay1() {
		CartDeleteDTO test = new CartDeleteDTO();
		String expected = null;

		test.setRegisterDay(expected);
		String actual = test.getRegisterDay();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#getRegisterDay()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetRegisterDay2() {
		CartDeleteDTO test = new CartDeleteDTO();
		String expected = "";

		test.setRegisterDay(expected);
		String actual = test.getRegisterDay();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#getRegisterDay()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetRegisterDay3() {
		CartDeleteDTO test = new CartDeleteDTO();
		String expected = " ";

		test.setRegisterDay(expected);
		String actual = test.getRegisterDay();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#getRegisterDay()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetRegisterDay4() {
		CartDeleteDTO test = new CartDeleteDTO();
		String expected = "　";

		test.setRegisterDay(expected);
		String actual = test.getRegisterDay();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#getRegisterDay()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetRegisterDay5() {
		CartDeleteDTO test = new CartDeleteDTO();
		String expected = "abc123";

		test.setRegisterDay(expected);
		String actual = test.getRegisterDay();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#getRegisterDay()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetRegisterDay6() {
		CartDeleteDTO test = new CartDeleteDTO();
		String expected = "あいう１２３";

		test.setRegisterDay(expected);
		String actual = test.getRegisterDay();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#getRegisterDay()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetRegisterDay7() {
		CartDeleteDTO test = new CartDeleteDTO();
		String expected = "abc123あいう１２３";

		test.setRegisterDay(expected);
		String actual = test.getRegisterDay();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#getRegisterDay()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetRegisterDay8() {
		CartDeleteDTO test = new CartDeleteDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setRegisterDay(expected);
		String actual = test.getRegisterDay();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#setRegisterDay(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetRegisterDay1() {
		CartDeleteDTO test = new CartDeleteDTO();
		String expected = null;

		test.setRegisterDay(expected);
		String actual = test.getRegisterDay();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#setRegisterDay(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetRegisterDay2() {
		CartDeleteDTO test = new CartDeleteDTO();
		String expected = "";

		test.setRegisterDay(expected);
		String actual = test.getRegisterDay();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#setRegisterDay(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetRegisterDay3() {
		CartDeleteDTO test = new CartDeleteDTO();
		String expected = " ";

		test.setRegisterDay(expected);
		String actual = test.getRegisterDay();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#setRegisterDay(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetRegisterDay4() {
		CartDeleteDTO test = new CartDeleteDTO();
		String expected = "　";

		test.setRegisterDay(expected);
		String actual = test.getRegisterDay();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#setRegisterDay(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetRegisterDay5() {
		CartDeleteDTO test = new CartDeleteDTO();
		String expected = "abc123";

		test.setRegisterDay(expected);
		String actual = test.getRegisterDay();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#setRegisterDay(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetRegisterDay6() {
		CartDeleteDTO test = new CartDeleteDTO();
		String expected = "あいう１２３";

		test.setRegisterDay(expected);
		String actual = test.getRegisterDay();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#setRegisterDay(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetRegisterDay7() {
		CartDeleteDTO test = new CartDeleteDTO();
		String expected = "abc123あいう１２３";

		test.setRegisterDay(expected);
		String actual = test.getRegisterDay();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#setRegisterDay(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetRegisterDay8() {
		CartDeleteDTO test = new CartDeleteDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setRegisterDay(expected);
		String actual = test.getRegisterDay();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#getUpdateDay()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetUpdateDay1() {
		CartDeleteDTO test = new CartDeleteDTO();
		String expected = null;

		test.setUpdateDay(expected);
		String actual = test.getUpdateDay();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#getUpdateDay()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetUpdateDay2() {
		CartDeleteDTO test = new CartDeleteDTO();
		String expected = "";

		test.setUpdateDay(expected);
		String actual = test.getUpdateDay();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#getUpdateDay()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetUpdateDay3() {
		CartDeleteDTO test = new CartDeleteDTO();
		String expected = " ";

		test.setUpdateDay(expected);
		String actual = test.getUpdateDay();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#getUpdateDay()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetUpdateDay4() {
		CartDeleteDTO test = new CartDeleteDTO();
		String expected = "　";

		test.setUpdateDay(expected);
		String actual = test.getUpdateDay();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#getUpdateDay()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetUpdateDay5() {
		CartDeleteDTO test = new CartDeleteDTO();
		String expected = "abc123";

		test.setUpdateDay(expected);
		String actual = test.getUpdateDay();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#getUpdateDay()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetUpdateDay6() {
		CartDeleteDTO test = new CartDeleteDTO();
		String expected = "あいう１２３";

		test.setUpdateDay(expected);
		String actual = test.getUpdateDay();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#getUpdateDay()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetUpdateDay7() {
		CartDeleteDTO test = new CartDeleteDTO();
		String expected = "abc123あいう１２３";

		test.setUpdateDay(expected);
		String actual = test.getUpdateDay();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#getUpdateDay()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetUpdateDay8() {
		CartDeleteDTO test = new CartDeleteDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setUpdateDay(expected);
		String actual = test.getUpdateDay();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#setUpdateDay(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetUpdateDay1() {
		CartDeleteDTO test = new CartDeleteDTO();
		String expected = null;

		test.setUpdateDay(expected);
		String actual = test.getUpdateDay();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#setUpdateDay(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetUpdateDay2() {
		CartDeleteDTO test = new CartDeleteDTO();
		String expected = "";

		test.setUpdateDay(expected);
		String actual = test.getUpdateDay();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#setUpdateDay(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetUpdateDay3() {
		CartDeleteDTO test = new CartDeleteDTO();
		String expected = " ";

		test.setUpdateDay(expected);
		String actual = test.getUpdateDay();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#setUpdateDay(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetUpdateDay4() {
		CartDeleteDTO test = new CartDeleteDTO();
		String expected = "　";

		test.setUpdateDay(expected);
		String actual = test.getUpdateDay();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#setUpdateDay(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetUpdateDay5() {
		CartDeleteDTO test = new CartDeleteDTO();
		String expected = "abc123";

		test.setUpdateDay(expected);
		String actual = test.getUpdateDay();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#setUpdateDay(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetUpdateDay6() {
		CartDeleteDTO test = new CartDeleteDTO();
		String expected = "あいう１２３";

		test.setUpdateDay(expected);
		String actual = test.getUpdateDay();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#setUpdateDay(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetUpdateDay7() {
		CartDeleteDTO test = new CartDeleteDTO();
		String expected = "abc123あいう１２３";

		test.setUpdateDay(expected);
		String actual = test.getUpdateDay();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#setUpdateDay(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetUpdateDay8() {
		CartDeleteDTO test = new CartDeleteDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setUpdateDay(expected);
		String actual = test.getUpdateDay();

		assertEquals(expected, actual);

	}


//PurchaseId-----------------------------------------

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#getPurchaseId()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetPurchaseId1() {
		CartDeleteDTO test = new CartDeleteDTO();
		int expected = 0;

		test.setPurchaseId(expected);

		assertEquals(expected, test.getPurchaseId());
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#getPurchaseId()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetPurchaseId2() {
		CartDeleteDTO test = new CartDeleteDTO();
		int expected = 2147483647;

		test.setPurchaseId(expected);

		assertEquals(expected, test.getPurchaseId());
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#getPurchaseId()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetPurchaseId3() {
		CartDeleteDTO test = new CartDeleteDTO();
		int expected = -2147483648;

		test.setPurchaseId(expected);

		assertEquals(expected, test.getPurchaseId());
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#getPurchaseId()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetPurchaseId4() {
		CartDeleteDTO test = new CartDeleteDTO();
		try {
			int Purchase_idMin = Integer.parseInt("2147483648");
			test.setPurchaseId(Purchase_idMin);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#getPurchaseId()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetPurchaseId5() {
		CartDeleteDTO test = new CartDeleteDTO();
		try {
			int Purchase_idMin = Integer.parseInt("-2147483649");
			test.setPurchaseId(Purchase_idMin);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#setPurchaseId(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetPurchaseId1() {
		CartDeleteDTO test = new CartDeleteDTO();
		int expected = 0;

		test.setPurchaseId(expected);
		int actual = test.getPurchaseId();

		assertEquals(expected, actual);
	}


	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#setPurchaseId(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetPurchaseId2() {
		CartDeleteDTO test = new CartDeleteDTO();
		int expected = 2147483647;

		test.setPurchaseId(expected);
		int actual = test.getPurchaseId();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#setPurchaseId(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetPurchaseId3() {
		CartDeleteDTO test = new CartDeleteDTO();
		int expected = -2147483648;

		test.setPurchaseId(expected);
		int actual = test.getPurchaseId();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#setPurchaseId(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetPurchaseId4() {
		CartDeleteDTO test = new CartDeleteDTO();
		try {
			int Purchase_idMax = Integer.parseInt("2147483648");
			test.setPurchaseId(Purchase_idMax);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#setPurchaseId(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetPurchaseId5() {
		CartDeleteDTO test = new CartDeleteDTO();
		try {
			int Purchase_idMax = Integer.parseInt("-2147483649");
			test.setPurchaseId(Purchase_idMax);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}








	//TotalPrice-------------------------------------
	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#getTotalPrice()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetTotalPrice1() {
		CartDeleteDTO test = new CartDeleteDTO();
		float expected = 0f;

		test.setTotalPrice(expected);

		assertEquals(expected, test.getTotalPrice(),0.00000000001f);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#getTotalPrice()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetTotalPrice2() {
		CartDeleteDTO test = new CartDeleteDTO();
		float expected =  3.4028235E38f;//3.4x(10の38乗)

		test.setTotalPrice(expected);

		assertEquals(expected, test.getTotalPrice(),0.00000000001f);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#getTotalPrice()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetTotalPrice3() {
		CartDeleteDTO test = new CartDeleteDTO();
		float expected = 1.4E-45f;//1.4x(10の-45乗)

		test.setTotalPrice(expected);

		assertEquals(expected, test.getTotalPrice(),0.00000000001f);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#getTotalPrice()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetTotalPrice4() {
		CartDeleteDTO test = new CartDeleteDTO();
		try {
			float TotalPriceMax = Integer.parseInt("4.4028235E38f");
			test.setTotalPrice(TotalPriceMax);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"4.4028235E38f\"");
		}
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#getTotalPrice()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetTotalPrice5() {
		CartDeleteDTO test = new CartDeleteDTO();
		try {
			float TotalPriceMin = Integer.parseInt("-4.4028235E38f");
			test.setTotalPrice(TotalPriceMin);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-4.4028235E38f\"");
		}
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#setTotalPrice(float)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetTotalPrice1() {
		CartDeleteDTO test = new CartDeleteDTO();
		float expected = 0f;

		test.setTotalPrice(expected);

		assertEquals(expected, test.getTotalPrice(),0.00000000001f);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#setTotalPrice(float)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetTotalPrice2() {
		CartDeleteDTO test = new CartDeleteDTO();
		float expected =  3.4028235E38f;

		test.setTotalPrice(expected);

		assertEquals(expected, test.getTotalPrice(),0.00000000001f);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#setTotalPrice(float)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetTotalPrice3() {
		CartDeleteDTO test = new CartDeleteDTO();
		float expected = 1.4E-45f;

		test.setTotalPrice(expected);

		assertEquals(expected, test.getTotalPrice(),0.00000000001f);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#setTotalPrice(float)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetTotalPrice4() {
		CartDeleteDTO test = new CartDeleteDTO();
		try {
			float TotalPriceMin = Integer.parseInt("4.4028235E38f");
			test.setTotalPrice(TotalPriceMin);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"4.4028235E38f\"");
		}
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.CartDeleteDTO#setTotalPrice(float)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetTotalPrice5() {
		CartDeleteDTO test = new CartDeleteDTO();
		try {
			float TotalPriceMin = Integer.parseInt("-4.4028235E38f");
			test.setTotalPrice(TotalPriceMin);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-4.4028235E38f\"");
		}
	}

}
