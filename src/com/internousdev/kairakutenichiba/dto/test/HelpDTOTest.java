package com.internousdev.kairakutenichiba.dto.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.internousdev.kairakutenichiba.dto.HelpDTO;


public class HelpDTOTest {

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.HelpDTO#getUserName()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetUserName1() {
		HelpDTO test = new HelpDTO();
		String expected = null;

		test.setUserName(expected);
		String actual = test.getUserName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.HelpDTO#getUserName()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetUserName2() {
		HelpDTO test = new HelpDTO();
		String expected = "";

		test.setUserName(expected);
		String actual = test.getUserName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.HelpDTO#getUserName()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetUserName3() {
		HelpDTO test = new HelpDTO();
		String expected = " ";

		test.setUserName(expected);
		String actual = test.getUserName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.HelpDTO#getUserName()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetUserName4() {
		HelpDTO test = new HelpDTO();
		String expected = "　";

		test.setUserName(expected);
		String actual = test.getUserName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.HelpDTO#getUserName()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetUserName5() {
		HelpDTO test = new HelpDTO();
		String expected = "abc123";

		test.setUserName(expected);
		String actual = test.getUserName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.HelpDTO#getUserName()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetUserName6() {
		HelpDTO test = new HelpDTO();
		String expected = "あいう１２３";

		test.setUserName(expected);
		String actual = test.getUserName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.HelpDTO#getUserName()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetUserName7() {
		HelpDTO test = new HelpDTO();
		String expected = "abc123あいう１２３";

		test.setUserName(expected);
		String actual = test.getUserName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.HelpDTO#getUserName()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetUserName8() {
		HelpDTO test = new HelpDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setUserName(expected);
		String actual = test.getUserName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.HelpDTO#setUserName(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetUserName1() {
		HelpDTO test = new HelpDTO();
		String expected = null;

		test.setUserName(expected);
		String actual = test.getUserName();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.HelpDTO#setUserName(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetUserName2() {
		HelpDTO test = new HelpDTO();
		String expected = "";

		test.setUserName(expected);
		String actual = test.getUserName();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.HelpDTO#setUserName(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetUserName3() {
		HelpDTO test = new HelpDTO();
		String expected = " ";

		test.setUserName(expected);
		String actual = test.getUserName();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.HelpDTO#setUserName(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetUserName4() {
		HelpDTO test = new HelpDTO();
		String expected = "　";

		test.setUserName(expected);
		String actual = test.getUserName();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.HelpDTO#setUserName(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetUserName5() {
		HelpDTO test = new HelpDTO();
		String expected = "abc123";

		test.setUserName(expected);
		String actual = test.getUserName();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.HelpDTO#setUserName(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetUserName6() {
		HelpDTO test = new HelpDTO();
		String expected = "あいう１２３";

		test.setUserName(expected);
		String actual = test.getUserName();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.HelpDTO#setUserName(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetUserName7() {
		HelpDTO test = new HelpDTO();
		String expected = "abc123あいう１２３";

		test.setUserName(expected);
		String actual = test.getUserName();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.HelpDTO#setUserName(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetUserName8() {
		HelpDTO test = new HelpDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setUserName(expected);
		String actual = test.getUserName();

		assertEquals(expected, actual);

	}





    public void testGetUserMail1() {
        HelpDTO test = new HelpDTO();
        String expected = null;

        test.setUserMail(expected);
        String actual = test.getUserMail();

        assertEquals(expected, actual);
    }


    public void testGetUserMail2() {
        HelpDTO test = new HelpDTO();
        String expected = "";

        test.setUserMail(expected);
        String actual = test.getUserMail();

        assertEquals(expected, actual);
    }


    public void testGetUserMail3() {
        HelpDTO test = new HelpDTO();
        String expected = " ";

        test.setUserMail(expected);
        String actual = test.getUserMail();

        assertEquals(expected, actual);
    }


    public void testGetUserMail4() {
        HelpDTO test = new HelpDTO();
        String expected = "　";

        test.setUserMail(expected);
        String actual = test.getUserMail();

        assertEquals(expected, actual);
    }


    public void testGetUserMail5() {
        HelpDTO test = new HelpDTO();
        String expected = "abc123";

        test.setUserMail(expected);
        String actual = test.getUserMail();

        assertEquals(expected, actual);
    }



    public void testGetUserMail6() {
        HelpDTO test = new HelpDTO();
        String expected = "あいう１２３";

        test.setUserMail(expected);
        String actual = test.getUserMail();

        assertEquals(expected, actual);
    }


    public void testGetUserMail7() {
        HelpDTO test = new HelpDTO();
        String expected = "abc123あいう１２３";

        test.setUserMail(expected);
        String actual = test.getUserMail();

        assertEquals(expected, actual);
    }


    public void testGetUserMail8() {
        HelpDTO test = new HelpDTO();
        String expected = "ａｂｃ１２３あいう漢字";

        test.setUserMail(expected);
        String actual = test.getUserMail();

        assertEquals(expected, actual);
    }



    public void testSetUserMail1() {
        HelpDTO test = new HelpDTO();
        String expected = null;

        test.setUserMail(expected);
        String actual = test.getUserMail();

        assertEquals(expected, actual);

    }



    public void testSetUserMail2() {
        HelpDTO test = new HelpDTO();
        String expected = "";

        test.setUserMail(expected);
        String actual = test.getUserMail();

        assertEquals(expected, actual);

    }


    public void testSetUserMail3() {
        HelpDTO test = new HelpDTO();
        String expected = " ";

        test.setUserMail(expected);
        String actual = test.getUserMail();

        assertEquals(expected, actual);

    }

    @Test
    public void testSetUserMail4() {
        HelpDTO test = new HelpDTO();
        String expected = "　";

        test.setUserMail(expected);
        String actual = test.getUserMail();

        assertEquals(expected, actual);

    }

    public void testSetUserMail5() {
        HelpDTO test = new HelpDTO();
        String expected = "abc123";

        test.setUserMail(expected);
        String actual = test.getUserMail();

        assertEquals(expected, actual);

    }



    public void testSetUserMail6() {
        HelpDTO test = new HelpDTO();
        String expected = "あいう１２３";

        test.setUserMail(expected);
        String actual = test.getUserMail();

        assertEquals(expected, actual);

    }


    public void testSetUserMail7() {
        HelpDTO test = new HelpDTO();
        String expected = "abc123あいう１２３";

        test.setUserMail(expected);
        String actual = test.getUserMail();

        assertEquals(expected, actual);

    }


    public void testSetUserMail8() {
        HelpDTO test = new HelpDTO();
        String expected = "ａｂｃ１２３あいう漢字";

        test.setUserMail(expected);
        String actual = test.getUserMail();

        assertEquals(expected, actual);

    }



/*****************************************UserMailここまで**************************/

    public void testGetUserAddress() {
        HelpDTO dto = new HelpDTO();
        String expected = null;
        dto.setUserAddress(expected);
        assertEquals(expected, dto.getUserAddress());
    }

    public void testGetUserAddress2() {
        HelpDTO dto = new HelpDTO();
        String expected = "";
        dto.setUserAddress(expected);
        assertEquals(expected, dto.getUserAddress());
    }

    public void testGetUserAddress3() {
        HelpDTO dto = new HelpDTO();
        String expected = " ";
        dto.setUserAddress(expected);
        assertEquals(expected, dto.getUserAddress());
    }

    public void testGetUserAddress4() {
        HelpDTO dto = new HelpDTO();
        String expected = "　";
        dto.setUserAddress(expected);
        assertEquals(expected, dto.getUserAddress());
    }

    public void testGetUserAddress5() {
        HelpDTO dto = new HelpDTO();
        String expected = "abc123";
        dto.setUserAddress(expected);
        assertEquals(expected, dto.getUserAddress());
    }

    public void testGetUserAddress6() {
        HelpDTO dto = new HelpDTO();
        String expected = "あいう１２３";
        dto.setUserAddress(expected);
        assertEquals(expected, dto.getUserAddress());
    }

    public void testGetUserAddress7() {
        HelpDTO dto = new HelpDTO();
        String expected = "abc123あいう１２３";
        dto.setUserAddress(expected);
        assertEquals(expected, dto.getUserAddress());
    }

    public void testGetUserAddress8() {
        HelpDTO dto = new HelpDTO();
        String expected = "abc123あいう１２３漢字";
        dto.setUserAddress(expected);
        assertEquals(expected, dto.getUserAddress());
    }

    public void testSetUserAddress() {
        HelpDTO dto = new HelpDTO();
        String expected = null;
        dto.setUserAddress(expected);
        String actual=dto.getUserAddress();
        assertEquals(expected, actual);
    }

    public void testSetUserAddress2() {
        HelpDTO dto = new HelpDTO();
        String expected = "";
        dto.setUserAddress(expected);
        String actual=dto.getUserAddress();
        assertEquals(expected, actual);
    }

    public void testSetUserAddress3() {
        HelpDTO dto = new HelpDTO();
        String expected = " ";
        dto.setUserAddress(expected);
        String actual=dto.getUserAddress();
        assertEquals(expected, actual);
    }

    public void testSetUserAddress4() {
        HelpDTO dto = new HelpDTO();
        String expected = "　";
        dto.setUserAddress(expected);
        String actual=dto.getUserAddress();
        assertEquals(expected, actual);
    }

    public void testSetUserAddress5() {
        HelpDTO dto = new HelpDTO();
        String expected = "abc123";
        dto.setUserAddress(expected);
        String actual=dto.getUserAddress();
        assertEquals(expected, actual);
    }

    public void testSetUserAddress6() {
        HelpDTO dto = new HelpDTO();
        String expected = "あいう１２３";
        dto.setUserAddress(expected);
        String actual=dto.getUserAddress();
        assertEquals(expected, actual);
    }

    public void testSetUserAddress7() {
        HelpDTO dto = new HelpDTO();
        String expected = "abc123あいう１２３";
        dto.setUserAddress(expected);
        String actual=dto.getUserAddress();
        assertEquals(expected, actual);
    }

    public void testSetUserAddress8() {
        HelpDTO dto = new HelpDTO();
        String expected = "abc123あいう１２３漢字";
        dto.setUserAddress(expected);
        String actual=dto.getUserAddress();
        assertEquals(expected, actual);
    }












    public void testGetCategory1() {
        HelpDTO test = new HelpDTO();
        String expected = null;

        test.setCategory(expected);
        String actual = test.getCategory();

        assertEquals(expected, actual);
    }


    public void testGetCategory2() {
        HelpDTO test = new HelpDTO();
        String expected = "";

        test.setCategory(expected);
        String actual = test.getCategory();

        assertEquals(expected, actual);
    }


    public void testGetCategory3() {
        HelpDTO test = new HelpDTO();
        String expected = " ";

        test.setCategory(expected);
        String actual = test.getCategory();

        assertEquals(expected, actual);
    }

    @Test
    public void testGetCategory4() {
        HelpDTO test = new HelpDTO();
        String expected = "　";

        test.setCategory(expected);
        String actual = test.getCategory();

        assertEquals(expected, actual);
    }


    public void testGetCategory5() {
        HelpDTO test = new HelpDTO();
        String expected = "abc123";

        test.setCategory(expected);
        String actual = test.getCategory();

        assertEquals(expected, actual);
    }


    @Test
    public void testGetCategory6() {
        HelpDTO test = new HelpDTO();
        String expected = "あいう１２３";

        test.setCategory(expected);
        String actual = test.getCategory();

        assertEquals(expected, actual);
    }


    public void testGetCategory7() {
        HelpDTO test = new HelpDTO();
        String expected = "abc123あいう１２３";

        test.setCategory(expected);
        String actual = test.getCategory();

        assertEquals(expected, actual);
    }


    public void testGetCategory8() {
        HelpDTO test = new HelpDTO();
        String expected = "ａｂｃ１２３あいう漢字";

        test.setCategory(expected);
        String actual = test.getCategory();

        assertEquals(expected, actual);
    }


    @Test
    public void testSetCategory1() {
        HelpDTO test = new HelpDTO();
        String expected = null;

        test.setCategory(expected);
        String actual = test.getCategory();

        assertEquals(expected, actual);

    }



    public void testSetCategory2() {
        HelpDTO test = new HelpDTO();
        String expected = "";

        test.setCategory(expected);
        String actual = test.getCategory();

        assertEquals(expected, actual);

    }


    public void testSetCategory3() {
        HelpDTO test = new HelpDTO();
        String expected = " ";

        test.setCategory(expected);
        String actual = test.getCategory();

        assertEquals(expected, actual);

    }


    public void testSetCategory4() {
        HelpDTO test = new HelpDTO();
        String expected = "　";

        test.setCategory(expected);
        String actual = test.getCategory();

        assertEquals(expected, actual);

    }

    public void testSetCategory5() {
        HelpDTO test = new HelpDTO();
        String expected = "abc123";

        test.setCategory(expected);
        String actual = test.getCategory();

        assertEquals(expected, actual);

    }


    @Test
    public void testSetCategory6() {
        HelpDTO test = new HelpDTO();
        String expected = "あいう１２３";

        test.setCategory(expected);
        String actual = test.getCategory();

        assertEquals(expected, actual);

    }


    public void testSetCategory7() {
        HelpDTO test = new HelpDTO();
        String expected = "abc123あいう１２３";

        test.setCategory(expected);
        String actual = test.getCategory();

        assertEquals(expected, actual);

    }


    public void testSetCategory8() {
        HelpDTO test = new HelpDTO();
        String expected = "ａｂｃ１２３あいう漢字";

        test.setCategory(expected);
        String actual = test.getCategory();

        assertEquals(expected, actual);

    }



/*****************************************Categoryここまで**************************/


    public void testGetComment1() {
        HelpDTO test = new HelpDTO();
        String expected = null;

        test.setComment(expected);
        String actual = test.getComment();

        assertEquals(expected, actual);
    }


    public void testGetComment2() {
        HelpDTO test = new HelpDTO();
        String expected = "";

        test.setComment(expected);
        String actual = test.getComment();

        assertEquals(expected, actual);
    }


    public void testGetComment3() {
        HelpDTO test = new HelpDTO();
        String expected = " ";

        test.setComment(expected);
        String actual = test.getComment();

        assertEquals(expected, actual);
    }


    public void testGetComment4() {
        HelpDTO test = new HelpDTO();
        String expected = "　";

        test.setComment(expected);
        String actual = test.getComment();

        assertEquals(expected, actual);
    }


    public void testGetComment5() {
        HelpDTO test = new HelpDTO();
        String expected = "abc123";

        test.setComment(expected);
        String actual = test.getComment();

        assertEquals(expected, actual);
    }


    @Test
    public void testGetComment6() {
        HelpDTO test = new HelpDTO();
        String expected = "あいう１２３";

        test.setComment(expected);
        String actual = test.getComment();

        assertEquals(expected, actual);
    }


    public void testGetComment7() {
        HelpDTO test = new HelpDTO();
        String expected = "abc123あいう１２３";

        test.setComment(expected);
        String actual = test.getComment();

        assertEquals(expected, actual);
    }


    public void testGetComment8() {
        HelpDTO test = new HelpDTO();
        String expected = "ａｂｃ１２３あいう漢字";

        test.setComment(expected);
        String actual = test.getComment();

        assertEquals(expected, actual);
    }


    @Test
    public void testSetComment1() {
        HelpDTO test = new HelpDTO();
        String expected = null;

        test.setComment(expected);
        String actual = test.getComment();

        assertEquals(expected, actual);

    }



    public void testSetComment2() {
        HelpDTO test = new HelpDTO();
        String expected = "";

        test.setComment(expected);
        String actual = test.getComment();

        assertEquals(expected, actual);

    }


    public void testSetComment3() {
        HelpDTO test = new HelpDTO();
        String expected = " ";

        test.setComment(expected);
        String actual = test.getComment();

        assertEquals(expected, actual);

    }

    @Test
    public void testSetComment4() {
        HelpDTO test = new HelpDTO();
        String expected = "　";

        test.setComment(expected);
        String actual = test.getComment();

        assertEquals(expected, actual);

    }

    public void testSetComment5() {
        HelpDTO test = new HelpDTO();
        String expected = "abc123";

        test.setComment(expected);
        String actual = test.getComment();

        assertEquals(expected, actual);

    }



    public void testSetComment6() {
        HelpDTO test = new HelpDTO();
        String expected = "あいう１２３";

        test.setComment(expected);
        String actual = test.getComment();

        assertEquals(expected, actual);

    }


    public void testSetComment7() {
        HelpDTO test = new HelpDTO();
        String expected = "abc123あいう１２３";

        test.setComment(expected);
        String actual = test.getComment();

        assertEquals(expected, actual);

    }


    public void testSetComment8() {
        HelpDTO test = new HelpDTO();
        String expected = "ａｂｃ１２３あいう漢字";

        test.setComment(expected);
        String actual = test.getComment();

        assertEquals(expected, actual);

    }
}




/*****************************************commentここまで**************************/
