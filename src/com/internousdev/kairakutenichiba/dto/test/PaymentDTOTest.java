package com.internousdev.kairakutenichiba.dto.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.internousdev.kairakutenichiba.dto.PaymentDTO;

public class PaymentDTOTest {





	   public void testGetCreditType1() {
	        PaymentDTO test = new PaymentDTO();
	        String expected = null;

	        test.setCreditType(expected);
	        String actual = test.getCreditType();

	        assertEquals(expected, actual);
	    }


	    public void testGetCreditType2() {
	        PaymentDTO test = new PaymentDTO();
	        String expected = "";

	        test.setCreditType(expected);
	        String actual = test.getCreditType();

	        assertEquals(expected, actual);
	    }


	    public void testGetCreditType3() {
	        PaymentDTO test = new PaymentDTO();
	        String expected = " ";

	        test.setCreditType(expected);
	        String actual = test.getCreditType();

	        assertEquals(expected, actual);
	    }

	    @Test
	    public void testGetCreditType4() {
	        PaymentDTO test = new PaymentDTO();
	        String expected = "　";

	        test.setCreditType(expected);
	        String actual = test.getCreditType();

	        assertEquals(expected, actual);
	    }


	    public void testGetCreditType5() {
	        PaymentDTO test = new PaymentDTO();
	        String expected = "abc123";

	        test.setCreditType(expected);
	        String actual = test.getCreditType();

	        assertEquals(expected, actual);
	    }


	    @Test
	    public void testGetCreditType6() {
	        PaymentDTO test = new PaymentDTO();
	        String expected = "あいう１２３";

	        test.setCreditType(expected);
	        String actual = test.getCreditType();

	        assertEquals(expected, actual);
	    }


	    public void testGetCreditType7() {
	        PaymentDTO test = new PaymentDTO();
	        String expected = "abc123あいう１２３";

	        test.setCreditType(expected);
	        String actual = test.getCreditType();

	        assertEquals(expected, actual);
	    }


	    public void testGetCreditType8() {
	        PaymentDTO test = new PaymentDTO();
	        String expected = "ａｂｃ１２３あいう漢字";

	        test.setCreditType(expected);
	        String actual = test.getCreditType();

	        assertEquals(expected, actual);
	    }


	    @Test
	    public void testSetCreditType1() {
	        PaymentDTO test = new PaymentDTO();
	        String expected = null;

	        test.setCreditType(expected);
	        String actual = test.getCreditType();

	        assertEquals(expected, actual);

	    }



	    public void testSetCreditType2() {
	        PaymentDTO test = new PaymentDTO();
	        String expected = "";

	        test.setCreditType(expected);
	        String actual = test.getCreditType();

	        assertEquals(expected, actual);

	    }


	    public void testSetCreditType3() {
	        PaymentDTO test = new PaymentDTO();
	        String expected = " ";

	        test.setCreditType(expected);
	        String actual = test.getCreditType();

	        assertEquals(expected, actual);

	    }


	    public void testSetCreditType4() {
	        PaymentDTO test = new PaymentDTO();
	        String expected = "　";

	        test.setCreditType(expected);
	        String actual = test.getCreditType();

	        assertEquals(expected, actual);

	    }

	    public void testSetCreditType5() {
	        PaymentDTO test = new PaymentDTO();
	        String expected = "abc123";

	        test.setCreditType(expected);
	        String actual = test.getCreditType();

	        assertEquals(expected, actual);

	    }


	    @Test
	    public void testSetCreditType6() {
	        PaymentDTO test = new PaymentDTO();
	        String expected = "あいう１２３";

	        test.setCreditType(expected);
	        String actual = test.getCreditType();

	        assertEquals(expected, actual);

	    }


	    public void testSetCreditType7() {
	        PaymentDTO test = new PaymentDTO();
	        String expected = "abc123あいう１２３";

	        test.setCreditType(expected);
	        String actual = test.getCreditType();

	        assertEquals(expected, actual);

	    }


	    public void testSetCreditType8() {
	        PaymentDTO test = new PaymentDTO();
	        String expected = "ａｂｃ１２３あいう漢字";

	        test.setCreditType(expected);
	        String actual = test.getCreditType();

	        assertEquals(expected, actual);

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
 * {@link com.internousdev.kairakutenichiba.dto.PaymentDTO#getExpirationYear()}
 * のためのテスト・メソッド。
 */
@Test
public void testGetExpirationYear1() {
	PaymentDTO test = new PaymentDTO();
	String expected = null;

	test.setExpirationYear(expected);
	String actual = test.getExpirationYear();

	assertEquals(expected, actual);
}

/**
 * {@link com.internousdev.kairakutenichiba.dto.PaymentDTO#getExpirationYear()}
 * のためのテスト・メソッド。
 */
@Test
public void testGetExpirationYear2() {
	PaymentDTO test = new PaymentDTO();
	String expected = "";

	test.setExpirationYear(expected);
	String actual = test.getExpirationYear();

	assertEquals(expected, actual);
}

/**
 * {@link com.internousdev.kairakutenichiba.dto.PaymentDTO#getExpirationYear()}
 * のためのテスト・メソッド。
 */
@Test
public void testGetExpirationYear3() {
	PaymentDTO test = new PaymentDTO();
	String expected = " ";

	test.setExpirationYear(expected);
	String actual = test.getExpirationYear();

	assertEquals(expected, actual);
}

/**
 * {@link com.internousdev.kairakutenichiba.dto.PaymentDTO#getExpirationYear()}
 * のためのテスト・メソッド。
 */
@Test
public void testGetExpirationYear4() {
	PaymentDTO test = new PaymentDTO();
	String expected = "　";

	test.setExpirationYear(expected);
	String actual = test.getExpirationYear();

	assertEquals(expected, actual);
}

/**
 * {@link com.internousdev.kairakutenichiba.dto.PaymentDTO#getExpirationYear()}
 * のためのテスト・メソッド。
 */
@Test
public void testGetExpirationYear5() {
	PaymentDTO test = new PaymentDTO();
	String expected = "abc123";

	test.setExpirationYear(expected);
	String actual = test.getExpirationYear();

	assertEquals(expected, actual);
}

/**
 * {@link com.internousdev.kairakutenichiba.dto.PaymentDTO#getExpirationYear()}
 * のためのテスト・メソッド。
 */
@Test
public void testGetExpirationYear6() {
	PaymentDTO test = new PaymentDTO();
	String expected = "あいう１２３";

	test.setExpirationYear(expected);
	String actual = test.getExpirationYear();

	assertEquals(expected, actual);
}

/**
 * {@link com.internousdev.kairakutenichiba.dto.PaymentDTO#getExpirationYear()}
 * のためのテスト・メソッド。
 */
@Test
public void testGetExpirationYear7() {
	PaymentDTO test = new PaymentDTO();
	String expected = "abc123あいう１２３";

	test.setExpirationYear(expected);
	String actual = test.getExpirationYear();

	assertEquals(expected, actual);
}

/**
 * {@link com.internousdev.kairakutenichiba.dto.PaymentDTO#getExpirationYear()}
 * のためのテスト・メソッド。
 */
@Test
public void testGetExpirationYear8() {
	PaymentDTO test = new PaymentDTO();
	String expected = "ａｂｃ１２３あいう漢字";

	test.setExpirationYear(expected);
	String actual = test.getExpirationYear();

	assertEquals(expected, actual);
}

/**
 * {@link com.internousdev.kairakutenichiba.dto.PaymentDTO#setExpirationYear(java.lang.String)}
 * のためのテスト・メソッド。
 */
@Test
public void testSetExpirationYear1() {
	PaymentDTO test = new PaymentDTO();
	String expected = null;

	test.setExpirationYear(expected);
	String actual = test.getExpirationYear();

	assertEquals(expected, actual);

}

/**
 * {@link com.internousdev.kairakutenichiba.dto.PaymentDTO#setExpirationYear(java.lang.String)}
 * のためのテスト・メソッド。
 */
@Test
public void testSetExpirationYear2() {
	PaymentDTO test = new PaymentDTO();
	String expected = "";

	test.setExpirationYear(expected);
	String actual = test.getExpirationYear();

	assertEquals(expected, actual);

}

/**
 * {@link com.internousdev.kairakutenichiba.dto.PaymentDTO#setExpirationYear(java.lang.String)}
 * のためのテスト・メソッド。
 */
@Test
public void testSetExpirationYear3() {
	PaymentDTO test = new PaymentDTO();
	String expected = " ";

	test.setExpirationYear(expected);
	String actual = test.getExpirationYear();

	assertEquals(expected, actual);

}

/**
 * {@link com.internousdev.kairakutenichiba.dto.PaymentDTO#setExpirationYear(java.lang.String)}
 * のためのテスト・メソッド。
 */
@Test
public void testSetExpirationYear4() {
	PaymentDTO test = new PaymentDTO();
	String expected = "　";

	test.setExpirationYear(expected);
	String actual = test.getExpirationYear();

	assertEquals(expected, actual);

}

/**
 * {@link com.internousdev.kairakutenichiba.dto.PaymentDTO#setExpirationYear(java.lang.String)}
 * のためのテスト・メソッド。
 */
@Test
public void testSetExpirationYear5() {
	PaymentDTO test = new PaymentDTO();
	String expected = "abc123";

	test.setExpirationYear(expected);
	String actual = test.getExpirationYear();

	assertEquals(expected, actual);

}

/**
 * {@link com.internousdev.kairakutenichiba.dto.PaymentDTO#setExpirationYear(java.lang.String)}
 * のためのテスト・メソッド。
 */
@Test
public void testSetExpirationYear6() {
	PaymentDTO test = new PaymentDTO();
	String expected = "あいう１２３";

	test.setExpirationYear(expected);
	String actual = test.getExpirationYear();

	assertEquals(expected, actual);

}

/**
 * {@link com.internousdev.kairakutenichiba.dto.PaymentDTO#setExpirationYear(java.lang.String)}
 * のためのテスト・メソッド。
 */
@Test
public void testSetExpirationYear7() {
	PaymentDTO test = new PaymentDTO();
	String expected = "abc123あいう１２３";

	test.setExpirationYear(expected);
	String actual = test.getExpirationYear();

	assertEquals(expected, actual);

}

/**
 * {@link com.internousdev.kairakutenichiba.dto.PaymentDTO#setExpirationYear(java.lang.String)}
 * のためのテスト・メソッド。
 */
@Test
public void testSetExpirationYear8() {
	PaymentDTO test = new PaymentDTO();
	String expected = "ａｂｃ１２３あいう漢字";

	test.setExpirationYear(expected);
	String actual = test.getExpirationYear();

	assertEquals(expected, actual);

}


/**
 * {@link com.internousdev.kairakutenichiba.dto.PaymentDTO#getExpirationMonth()}
 * のためのテスト・メソッド。
 */
@Test
public void testGetExpirationMonth1() {
	PaymentDTO test = new PaymentDTO();
	String expected = null;

	test.setExpirationMonth(expected);
	String actual = test.getExpirationMonth();

	assertEquals(expected, actual);
}

/**
 * {@link com.internousdev.kairakutenichiba.dto.PaymentDTO#getExpirationMonth()}
 * のためのテスト・メソッド。
 */
@Test
public void testGetExpirationMonth2() {
	PaymentDTO test = new PaymentDTO();
	String expected = "";

	test.setExpirationMonth(expected);
	String actual = test.getExpirationMonth();

	assertEquals(expected, actual);
}

/**
 * {@link com.internousdev.kairakutenichiba.dto.PaymentDTO#getExpirationMonth()}
 * のためのテスト・メソッド。
 */
@Test
public void testGetExpirationMonth3() {
	PaymentDTO test = new PaymentDTO();
	String expected = " ";

	test.setExpirationMonth(expected);
	String actual = test.getExpirationMonth();

	assertEquals(expected, actual);
}

/**
 * {@link com.internousdev.kairakutenichiba.dto.PaymentDTO#getExpirationMonth()}
 * のためのテスト・メソッド。
 */
@Test
public void testGetExpirationMonth4() {
	PaymentDTO test = new PaymentDTO();
	String expected = "　";

	test.setExpirationMonth(expected);
	String actual = test.getExpirationMonth();

	assertEquals(expected, actual);
}

/**
 * {@link com.internousdev.kairakutenichiba.dto.PaymentDTO#getExpirationMonth()}
 * のためのテスト・メソッド。
 */
@Test
public void testGetExpirationMonth5() {
	PaymentDTO test = new PaymentDTO();
	String expected = "abc123";

	test.setExpirationMonth(expected);
	String actual = test.getExpirationMonth();

	assertEquals(expected, actual);
}

/**
 * {@link com.internousdev.kairakutenichiba.dto.PaymentDTO#getExpirationMonth()}
 * のためのテスト・メソッド。
 */
@Test
public void testGetExpirationMonth6() {
	PaymentDTO test = new PaymentDTO();
	String expected = "あいう１２３";

	test.setExpirationMonth(expected);
	String actual = test.getExpirationMonth();

	assertEquals(expected, actual);
}

/**
 * {@link com.internousdev.kairakutenichiba.dto.PaymentDTO#getExpirationMonth()}
 * のためのテスト・メソッド。
 */
@Test
public void testGetExpirationMonth7() {
	PaymentDTO test = new PaymentDTO();
	String expected = "abc123あいう１２３";

	test.setExpirationMonth(expected);
	String actual = test.getExpirationMonth();

	assertEquals(expected, actual);
}

/**
 * {@link com.internousdev.kairakutenichiba.dto.PaymentDTO#getExpirationMonth()}
 * のためのテスト・メソッド。
 */
@Test
public void testGetExpirationMonth8() {
	PaymentDTO test = new PaymentDTO();
	String expected = "ａｂｃ１２３あいう漢字";

	test.setExpirationMonth(expected);
	String actual = test.getExpirationMonth();

	assertEquals(expected, actual);
}

/**
 * {@link com.internousdev.kairakutenichiba.dto.PaymentDTO#setExpirationMonth(java.lang.String)}
 * のためのテスト・メソッド。
 */
@Test
public void testSetExpirationMonth1() {
	PaymentDTO test = new PaymentDTO();
	String expected = null;

	test.setExpirationMonth(expected);
	String actual = test.getExpirationMonth();

	assertEquals(expected, actual);

}

/**
 * {@link com.internousdev.kairakutenichiba.dto.PaymentDTO#setExpirationMonth(java.lang.String)}
 * のためのテスト・メソッド。
 */
@Test
public void testSetExpirationMonth2() {
	PaymentDTO test = new PaymentDTO();
	String expected = "";

	test.setExpirationMonth(expected);
	String actual = test.getExpirationMonth();

	assertEquals(expected, actual);

}

/**
 * {@link com.internousdev.kairakutenichiba.dto.PaymentDTO#setExpirationMonth(java.lang.String)}
 * のためのテスト・メソッド。
 */
@Test
public void testSetExpirationMonth3() {
	PaymentDTO test = new PaymentDTO();
	String expected = " ";

	test.setExpirationMonth(expected);
	String actual = test.getExpirationMonth();

	assertEquals(expected, actual);

}

/**
 * {@link com.internousdev.kairakutenichiba.dto.PaymentDTO#setExpirationMonth(java.lang.String)}
 * のためのテスト・メソッド。
 */
@Test
public void testSetExpirationMonth4() {
	PaymentDTO test = new PaymentDTO();
	String expected = "　";

	test.setExpirationMonth(expected);
	String actual = test.getExpirationMonth();

	assertEquals(expected, actual);

}

/**
 * {@link com.internousdev.kairakutenichiba.dto.PaymentDTO#setExpirationMonth(java.lang.String)}
 * のためのテスト・メソッド。
 */
@Test
public void testSetExpirationMonth5() {
	PaymentDTO test = new PaymentDTO();
	String expected = "abc123";

	test.setExpirationMonth(expected);
	String actual = test.getExpirationMonth();

	assertEquals(expected, actual);

}

/**
 * {@link com.internousdev.kairakutenichiba.dto.PaymentDTO#setExpirationMonth(java.lang.String)}
 * のためのテスト・メソッド。
 */
@Test
public void testSetExpirationMonth6() {
	PaymentDTO test = new PaymentDTO();
	String expected = "あいう１２３";

	test.setExpirationMonth(expected);
	String actual = test.getExpirationMonth();

	assertEquals(expected, actual);

}

/**
 * {@link com.internousdev.kairakutenichiba.dto.PaymentDTO#setExpirationMonth(java.lang.String)}
 * のためのテスト・メソッド。
 */
@Test
public void testSetExpirationMonth7() {
	PaymentDTO test = new PaymentDTO();
	String expected = "abc123あいう１２３";

	test.setExpirationMonth(expected);
	String actual = test.getExpirationMonth();

	assertEquals(expected, actual);

}

/**
 * {@link com.internousdev.kairakutenichiba.dto.PaymentDTO#setExpirationMonth(java.lang.String)}
 * のためのテスト・メソッド。
 */
@Test
public void testSetExpirationMonth8() {
	PaymentDTO test = new PaymentDTO();
	String expected = "ａｂｃ１２３あいう漢字";

	test.setExpirationMonth(expected);
	String actual = test.getExpirationMonth();

	assertEquals(expected, actual);

}
}