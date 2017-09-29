package com.internousdev.kairakutenichiba.dto.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.internousdev.kairakutenichiba.dto.HistoryDTO;

public class HistoryDTOTest {


//ここからアイテムID

/**
 *  HistoryDTO, Item_id
 *  のためのテスト・メソッド。
 */
@Test
public void testGetItem_id1() {
	HistoryDTO test = new HistoryDTO();
	int expected = 0;

	test.setItem_id(expected);

	assertEquals(expected, test.getItem_id());

}

/**
 *  HistoryDTO, Item_id
 *  のためのテスト・メソッド。
 */
@Test
public void testGetItem_id2() {
	HistoryDTO test = new HistoryDTO();
	int expected = 2147483647;

	test.setItem_id(expected);

	assertEquals(expected, test.getItem_id());
}

/**
 * HistoryDTO, Item_id
 *  のためのテスト・メソッド。
 */
@Test
public void testGetItem_id3() {
	HistoryDTO test = new HistoryDTO();
	int expected = -2147483648;

	test.setItem_id(expected);

	assertEquals(expected, test.getItem_id());
}

/**
 *  HistoryDTO, Item_id
 *  のためのテスト・メソッド。
 */
@Test
public void testGetItem_id4() {
	HistoryDTO test = new HistoryDTO();
	try {
		int Item_idMin = Integer.parseInt("2147483648");
		test.setItem_id(Item_idMin);

	} catch (RuntimeException e) {
		assertEquals(e.getMessage(), "For input string: \"2147483648\"");
	}
}

/**
 *  HistoryDTO, Item_id
 *  のためのテスト・メソッド。
 */
@Test
public void testGetItem_id5() {
	HistoryDTO test = new HistoryDTO();
	try {
		int Item_idMin = Integer.parseInt("-2147483649");
		test.setItem_id(Item_idMin);

	} catch (RuntimeException e) {
		assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
	}
}

/**
 *  HistoryDTO, Item_id
 *  のためのテスト・メソッド。
 */
@Test
public void testSetItem_id1() {
	HistoryDTO test = new HistoryDTO();
	int expected = 0;

	test.setItem_id(expected);
	int actual = test.getItem_id();

	assertEquals(expected, actual);
}


/**
 *  HistoryDTO, Item_id
 *  のためのテスト・メソッド。
 */
@Test
public void testSetItem_id2() {
	HistoryDTO test = new HistoryDTO();
	int expected = 2147483647;

	test.setItem_id(expected);
	int actual = test.getItem_id();

	assertEquals(expected, actual);
}

/**
 *  HistoryDTO, Item_id
 *  のためのテスト・メソッド。
 */
@Test
public void testSetItem_id3() {
	HistoryDTO test = new HistoryDTO();
	int expected = -2147483648;

	test.setItem_id(expected);
	int actual = test.getItem_id();

	assertEquals(expected, actual);
}

/**
 *  HistoryDTO, Item_id
 *  のためのテスト・メソッド。
 */
@Test
public void testSetItem_id4() {
	HistoryDTO test = new HistoryDTO();
	try {
		int Item_idMax = Integer.parseInt("2147483648");
		test.setItem_id(Item_idMax);

	} catch (RuntimeException e) {
		assertEquals(e.getMessage(), "For input string: \"2147483648\"");
	}
}

/**
 *  HistoryDTO, Item_id
 *  のためのテスト・メソッド。
 */
@Test
public void testSetItem_id5() {
	HistoryDTO test = new HistoryDTO();
	try {
		int Item_idMax = Integer.parseInt("-2147483649");
		test.setItem_id(Item_idMax);

	} catch (RuntimeException e) {
		assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
	}
}


//ここから個数

	/**
	 * link com.internousdev.kairakutenichiba.dto.HistoryDTO#getQuantities()}
	 *  のためのテスト・メソッド。
	 */
	@Test
	public void testGetQuantities1() {
		HistoryDTO test = new HistoryDTO();
		int expected = 0;

		test.setQuantities(expected);

		assertEquals(expected, test.getQuantites());

	}

	/**
	 * link com.internousdev.kairakutenichiba.dto.HistoryDTO#getQuantities()}
	 *  のためのテスト・メソッド。
	 */
	@Test
	public void testGetQuantities2() {
		HistoryDTO test = new HistoryDTO();
		int expected = 2147483647;

		test.setQuantities(expected);

		assertEquals(expected, test.getQuantites());
	}

	/**
	 * link com.internousdev.kairakutenichiba.dto.HistoryDTO#getQuantities()}
	 *  のためのテスト・メソッド。
	 */
	@Test
	public void testGetQuantities3() {
		HistoryDTO test = new HistoryDTO();
		int expected = -2147483648;

		test.setQuantities(expected);

		assertEquals(expected, test.getQuantites());
	}

	/**
	 * link com.internousdev.kairakutenichiba.dto.HistoryDTO#getQuantities()}
	 *  のためのテスト・メソッド。
	 */
	@Test
	public void testGetQuantities4() {
		HistoryDTO test = new HistoryDTO();
		try {
			int QuantitiesMin = Integer.parseInt("2147483648");
			test.setQuantities(QuantitiesMin);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	/**
	 * link com.internousdev.kairakutenichiba.dto.HistoryDTO#getQuantities()}
	 *  のためのテスト・メソッド。
	 */
	@Test
	public void testGetQuantities5() {
		HistoryDTO test = new HistoryDTO();
		try {
			int QuantitiesMin = Integer.parseInt("-2147483649");
			test.setQuantities(QuantitiesMin);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

	/**
	 * link com.internousdev.kairakutenichiba.dto.HistoryDTO#setQuantities(int)}
	 *  のためのテスト・メソッド。
	 */
	@Test
	public void testSetQuantities1() {
		HistoryDTO test = new HistoryDTO();
		int expected = 0;

		test.setQuantities(expected);
		int actual = test.getQuantites();

		assertEquals(expected, actual);
	}


	/**
	 * link com.internousdev.kairakutenichiba.dto.HistoryDTO#setQuantities(int)}
	 *  のためのテスト・メソッド。
	 */
	@Test
	public void testSetQuantities2() {
		HistoryDTO test = new HistoryDTO();
		int expected = 2147483647;

		test.setQuantities(expected);
		int actual = test.getQuantites();

		assertEquals(expected, actual);
	}

	/**
	 * link com.internousdev.kairakutenichiba.dto.HistoryDTO#setQuantities(int)}
	 *  のためのテスト・メソッド。
	 */
	@Test
	public void testSetQuantities3() {
		HistoryDTO test = new HistoryDTO();
		int expected = -2147483648;

		test.setQuantities(expected);
		int actual = test.getQuantites();

		assertEquals(expected, actual);
	}

	/**
	 * link com.internousdev.kairakutenichiba.dto.HistoryDTO#setQuantities(int)}
	 *  のためのテスト・メソッド。
	 */
	@Test
	public void testSetQuantities4() {
		HistoryDTO test = new HistoryDTO();
		try {
			int QuantitiesMax = Integer.parseInt("2147483648");
			test.setQuantities(QuantitiesMax);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	/**
	 * link com.internousdev.kairakutenichiba.dto.HistoryDTO#setQuantities(int)}
	 *  のためのテスト・メソッド。
	 */
	@Test
	public void testSetQuantities5() {
		HistoryDTO test = new HistoryDTO();
		try {
			int QuantitiesMax = Integer.parseInt("-2147483649");
			test.setQuantities(QuantitiesMax);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

//ここから購入日

/**
 * {@link com.internousdev.kairakutenichiba.dto.HistoryDTO#getPurchased_day()}
 * のためのテスト・メソッド。
 */
@Test
public void testGetPurchased_day1() {
	HistoryDTO test = new HistoryDTO();
	String expected = null;

	test.setPurchased_day(expected);
	String actual = test.getPurchased_day();

	assertEquals(expected, actual);
}

/**
 * {@link com.internousdev.kairakutenichiba.dto.HistoryDTO#getPurchased_day()}
 * のためのテスト・メソッド。
 */
@Test
public void testGetPurchased_day2() {
	HistoryDTO test = new HistoryDTO();
	String expected = "";

	test.setPurchased_day(expected);
	String actual = test.getPurchased_day();

	assertEquals(expected, actual);
}

/**
 * {@link com.internousdev.kairakutenichiba.dto.HistoryDTO#getPurchased_day()}
 * のためのテスト・メソッド。
 */
@Test
public void testGetPurchased_day3() {
	HistoryDTO test = new HistoryDTO();
	String expected = " ";

	test.setPurchased_day(expected);
	String actual = test.getPurchased_day();

	assertEquals(expected, actual);
}

/**
 * {@link com.internousdev.kairakutenichiba.dto.HistoryDTO#getPurchased_day()}
 * のためのテスト・メソッド。
 */
@Test
public void testGetPurchased_day4() {
	HistoryDTO test = new HistoryDTO();
	String expected = "　";

	test.setPurchased_day(expected);
	String actual = test.getPurchased_day();

	assertEquals(expected, actual);
}

/**
 * {@link com.internousdev.kairakutenichiba.dto.HistoryDTO#getPurchased_day()}
 * のためのテスト・メソッド。
 */
@Test
public void testGetPurchased_day5() {
	HistoryDTO test = new HistoryDTO();
	String expected = "abc123";

	test.setPurchased_day(expected);
	String actual = test.getPurchased_day();

	assertEquals(expected, actual);
}

/**
 * {@link com.internousdev.kairakutenichiba.dto.HistoryDTO#getPurchased_day()}
 * のためのテスト・メソッド。
 */
@Test
public void testGetPurchased_day6() {
	HistoryDTO test = new HistoryDTO();
	String expected = "あいう１２３";

	test.setPurchased_day(expected);
	String actual = test.getPurchased_day();

	assertEquals(expected, actual);
}

/**
 * {@link com.internousdev.kairakutenichiba.dto.HistoryDTO#getPurchased_day()}
 * のためのテスト・メソッド。
 */
@Test
public void testGetPurchased_day7() {
	HistoryDTO test = new HistoryDTO();
	String expected = "abc123あいう１２３";

	test.setPurchased_day(expected);
	String actual = test.getPurchased_day();

	assertEquals(expected, actual);
}

/**
 * {@link com.internousdev.kairakutenichiba.dto.HistoryDTO#getPurchased_day()}
 * のためのテスト・メソッド。
 */
@Test
public void testGetPurchased_day8() {
	HistoryDTO test = new HistoryDTO();
	String expected = "ａｂｃ１２３あいう漢字";

	test.setPurchased_day(expected);
	String actual = test.getPurchased_day();

	assertEquals(expected, actual);
}

/**
 * {@link com.internousdev.kairakutenichiba.dto.HistoryDTO#setPurchased_day(java.lang.String)}
 * のためのテスト・メソッド。
 */
@Test
public void testSetPurchased_day1() {
	HistoryDTO test = new HistoryDTO();
	String expected = null;

	test.setPurchased_day(expected);
	String actual = test.getPurchased_day();

	assertEquals(expected, actual);

}

/**
 * {@link com.internousdev.kairakutenichiba.dto.HistoryDTO#setPurchased_day(java.lang.String)}
 * のためのテスト・メソッド。
 */
@Test
public void testSetPurchased_day2() {
	HistoryDTO test = new HistoryDTO();
	String expected = "";

	test.setPurchased_day(expected);
	String actual = test.getPurchased_day();

	assertEquals(expected, actual);

}

/**
 * {@link com.internousdev.kairakutenichiba.dto.HistoryDTO#setPurchased_day(java.lang.String)}
 * のためのテスト・メソッド。
 */
@Test
public void testSetPurchased_day3() {
	HistoryDTO test = new HistoryDTO();
	String expected = " ";

	test.setPurchased_day(expected);
	String actual = test.getPurchased_day();

	assertEquals(expected, actual);

}

/**
 * {@link com.internousdev.kairakutenichiba.dto.HistoryDTO#setPurchased_day(java.lang.String)}
 * のためのテスト・メソッド。
 */
@Test
public void testSetPurchased_day4() {
	HistoryDTO test = new HistoryDTO();
	String expected = "　";

	test.setPurchased_day(expected);
	String actual = test.getPurchased_day();

	assertEquals(expected, actual);

}

/**
 * {@link com.internousdev.kairakutenichiba.dto.HistoryDTO#setPurchased_day(java.lang.String)}
 * のためのテスト・メソッド。
 */
@Test
public void testSetPurchased_day5() {
	HistoryDTO test = new HistoryDTO();
	String expected = "abc123";

	test.setPurchased_day(expected);
	String actual = test.getPurchased_day();

	assertEquals(expected, actual);

}

/**
 * {@link com.internousdev.kairakutenichiba.dto.HistoryDTO#setPurchased_day(java.lang.String)}
 * のためのテスト・メソッド。
 */
@Test
public void testSetPurchased_day6() {
	HistoryDTO test = new HistoryDTO();
	String expected = "あいう１２３";

	test.setPurchased_day(expected);
	String actual = test.getPurchased_day();

	assertEquals(expected, actual);

}

/**
 * {@link com.internousdev.kairakutenichiba.dto.HistoryDTO#setPurchased_day(java.lang.String)}
 * のためのテスト・メソッド。
 */
@Test
public void testSetPurchased_day7() {
	HistoryDTO test = new HistoryDTO();
	String expected = "abc123あいう１２３";

	test.setPurchased_day(expected);
	String actual = test.getPurchased_day();

	assertEquals(expected, actual);

}

/**
 * {@link com.internousdev.kairakutenichiba.dto.HistoryDTO#setPurchased_day(java.lang.String)}
 * のためのテスト・メソッド。
 */
@Test
public void testSetPurchased_day8() {
	HistoryDTO test = new HistoryDTO();
	String expected = "ａｂｃ１２３あいう漢字";

	test.setPurchased_day(expected);
	String actual = test.getPurchased_day();

	assertEquals(expected, actual);

}


//ここから商品名
	/**
	 * link com.internousdev.kairakutenichiba.dto.HistoryDTO#getItem_name()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetItem_name1() {
		HistoryDTO test = new HistoryDTO();
		String expected = null;

		test.setItem_name(expected);
		String actual = test.getItem_name();

		assertEquals(expected, actual);
	}

	/**
	 * link com.internousdev.kairakutenichiba.dto.HistoryDTO#getItem_name()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetItem_name2() {
		HistoryDTO test = new HistoryDTO();
		String expected = "";

		test.setItem_name(expected);
		String actual = test.getItem_name();

		assertEquals(expected, actual);
	}

	/**
	 * link com.internousdev.kairakutenichiba.dto.HistoryDTO#getItem_name()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetItem_name3() {
		HistoryDTO test = new HistoryDTO();
		String expected = " ";

		test.setItem_name(expected);
		String actual = test.getItem_name();

		assertEquals(expected, actual);
	}

	/**
	 * link com.internousdev.kairakutenichiba.dto.HistoryDTO#getItem_name()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetItem_name4() {
		HistoryDTO test = new HistoryDTO();
		String expected = "　";

		test.setItem_name(expected);
		String actual = test.getItem_name();

		assertEquals(expected, actual);
	}

	/**
	 * link com.internousdev.kairakutenichiba.dto.HistoryDTO#getItem_name()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetItem_name5() {
		HistoryDTO test = new HistoryDTO();
		String expected = "abc123";

		test.setItem_name(expected);
		String actual = test.getItem_name();

		assertEquals(expected, actual);
	}

	/**
	 * link com.internousdev.kairakutenichiba.dto.HistoryDTO#getItem_name()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetItem_name6() {
		HistoryDTO test = new HistoryDTO();
		String expected = "あいう１２３";

		test.setItem_name(expected);
		String actual = test.getItem_name();

		assertEquals(expected, actual);
	}

	/**
	 * link com.internousdev.kairakutenichiba.dto.HistoryDTO#getItem_name()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetItem_name7() {
		HistoryDTO test = new HistoryDTO();
		String expected = "abc123あいう１２３";

		test.setItem_name(expected);
		String actual = test.getItem_name();

		assertEquals(expected, actual);
	}

	/**
	 * link com.internousdev.kairakutenichiba.dto.HistoryDTO#getItem_name()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetItem_name8() {
		HistoryDTO test = new HistoryDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setItem_name(expected);
		String actual = test.getItem_name();

		assertEquals(expected, actual);
	}

	/**
	 * link com.internousdev.kairakutenichiba.dto.HistoryDTO#setItem_name(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSettItem_name1() {
		HistoryDTO test = new HistoryDTO();
		String expected = null;

		test.setItem_name(expected);
		String actual = test.getItem_name();

		assertEquals(expected, actual);

	}

	/**
	 * link com.internousdev.kairakutenichiba.dto.HistoryDTO#setItem_name(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSettItem_name2() {
		HistoryDTO test = new HistoryDTO();
		String expected = "";

		test.setItem_name(expected);
		String actual = test.getItem_name();

		assertEquals(expected, actual);

	}

	/**
	 * link com.internousdev.kairakutenichiba.dto.HistoryDTO#setItem_name(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSettItem_name3() {
		HistoryDTO test = new HistoryDTO();
		String expected = " ";

		test.setItem_name(expected);
		String actual = test.getItem_name();

		assertEquals(expected, actual);

	}

	/**
	 * link com.internousdev.kairakutenichiba.dto.HistoryDTO#setItem_name(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSettItem_name4() {
		HistoryDTO test = new HistoryDTO();
		String expected = "　";

		test.setItem_name(expected);
		String actual = test.getItem_name();

		assertEquals(expected, actual);

	}

	/**
	 * link com.internousdev.kairakutenichiba.dto.HistoryDTO#setItem_name(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSettItem_name5() {
		HistoryDTO test = new HistoryDTO();
		String expected = "abc123";

		test.setItem_name(expected);
		String actual = test.getItem_name();

		assertEquals(expected, actual);

	}

	/**
	 * link com.internousdev.kairakutenichiba.dto.HistoryDTO#setItem_name(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSettItem_name6() {
		HistoryDTO test = new HistoryDTO();
		String expected = "あいう１２３";

		test.setItem_name(expected);
		String actual = test.getItem_name();

		assertEquals(expected, actual);

	}

	/**
	 * link com.internousdev.kairakutenichiba.dto.HistoryDTO#setItem_name(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSettItem_name7() {
		HistoryDTO test = new HistoryDTO();
		String expected = "abc123あいう１２３";

		test.setItem_name(expected);
		String actual = test.getItem_name();

		assertEquals(expected, actual);

	}

	/**
	 * link com.internousdev.kairakutenichiba.dto.HistoryDTO#setItem_name(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSettItem_name8() {
		HistoryDTO test = new HistoryDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setItem_name(expected);
		String actual = test.getItem_name();

		assertEquals(expected, actual);

	}


	//ここから販売日

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.HistoryDTO#getRelease_day()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetRelease_day1() {
		HistoryDTO test = new HistoryDTO();
		String expected = null;

		test.setRelease_day(expected);
		String actual = test.getRelease_day();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.HistoryDTO#getRelease_day()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetRelease_day2() {
		HistoryDTO test = new HistoryDTO();
		String expected = "";

		test.setRelease_day(expected);
		String actual = test.getRelease_day();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.HistoryDTO#getRelease_day()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetRelease_day3() {
		HistoryDTO test = new HistoryDTO();
		String expected = " ";

		test.setRelease_day(expected);
		String actual = test.getRelease_day();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.HistoryDTO#getRelease_day()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetRelease_day4() {
		HistoryDTO test = new HistoryDTO();
		String expected = "　";

		test.setRelease_day(expected);
		String actual = test.getRelease_day();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.HistoryDTO#getRelease_day()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetRelease_day5() {
		HistoryDTO test = new HistoryDTO();
		String expected = "abc123";

		test.setRelease_day(expected);
		String actual = test.getRelease_day();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.HistoryDTO#getRelease_day()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetRelease_day6() {
		HistoryDTO test = new HistoryDTO();
		String expected = "あいう１２３";

		test.setRelease_day(expected);
		String actual = test.getRelease_day();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.HistoryDTO#getRelease_day()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetRelease_day7() {
		HistoryDTO test = new HistoryDTO();
		String expected = "abc123あいう１２３";

		test.setRelease_day(expected);
		String actual = test.getRelease_day();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.HistoryDTO#getRelease_day()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetRelease_day8() {
		HistoryDTO test = new HistoryDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setRelease_day(expected);
		String actual = test.getRelease_day();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.HistoryDTO#setRelease_day(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetRelease_day1() {
		HistoryDTO test = new HistoryDTO();
		String expected = null;

		test.setRelease_day(expected);
		String actual = test.getRelease_day();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.HistoryDTO#setRelease_day(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetRelease_day2() {
		HistoryDTO test = new HistoryDTO();
		String expected = "";

		test.setRelease_day(expected);
		String actual = test.getRelease_day();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.HistoryDTO#setRelease_day(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetRelease_day3() {
		HistoryDTO test = new HistoryDTO();
		String expected = " ";

		test.setRelease_day(expected);
		String actual = test.getRelease_day();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.HistoryDTO#setRelease_day(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetRelease_day4() {
		HistoryDTO test = new HistoryDTO();
		String expected = "　";

		test.setRelease_day(expected);
		String actual = test.getRelease_day();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.HistoryDTO#setRelease_day(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetRelease_day5() {
		HistoryDTO test = new HistoryDTO();
		String expected = "abc123";

		test.setRelease_day(expected);
		String actual = test.getRelease_day();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.HistoryDTO#setRelease_day(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetRelease_day6() {
		HistoryDTO test = new HistoryDTO();
		String expected = "あいう１２３";

		test.setRelease_day(expected);
		String actual = test.getRelease_day();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.HistoryDTO#setRelease_day(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetRelease_day7() {
		HistoryDTO test = new HistoryDTO();
		String expected = "abc123あいう１２３";

		test.setRelease_day(expected);
		String actual = test.getRelease_day();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kairakutenichiba.dto.HistoryDTO#setRelease_day(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetRelease_day8() {
		HistoryDTO test = new HistoryDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setRelease_day(expected);
		String actual = test.getRelease_day();

		assertEquals(expected, actual);

	}


//著者名----------------------------------


public void testGetAuthor() {
    HistoryDTO dto = new HistoryDTO();
    String expected = null;
    dto.setAuthor(expected);
    assertEquals(expected, dto.getAuthor());
}

public void testGetAuthor2() {
    HistoryDTO dto = new HistoryDTO();
    String expected = "";
    dto.setAuthor(expected);
    assertEquals(expected, dto.getAuthor());
}

public void testGetAuthor3() {
    HistoryDTO dto = new HistoryDTO();
    String expected = " ";
    dto.setAuthor(expected);
    assertEquals(expected, dto.getAuthor());
}

public void testGetAuthor4() {
    HistoryDTO dto = new HistoryDTO();
    String expected = "　";
    dto.setAuthor(expected);
    assertEquals(expected, dto.getAuthor());
}

public void testGetAuthor5() {
    HistoryDTO dto = new HistoryDTO();
    String expected = "abc123";
    dto.setAuthor(expected);
    assertEquals(expected, dto.getAuthor());
}

public void testGetAuthor6() {
    HistoryDTO dto = new HistoryDTO();
    String expected = "あいう１２３";
    dto.setAuthor(expected);
    assertEquals(expected, dto.getAuthor());
}

public void testGetAuthor7() {
    HistoryDTO dto = new HistoryDTO();
    String expected = "abc123あいう１２３";
    dto.setAuthor(expected);
    assertEquals(expected, dto.getAuthor());
}

public void testGetAuthor8() {
    HistoryDTO dto = new HistoryDTO();
    String expected = "abc123あいう１２３漢字";
    dto.setAuthor(expected);
    assertEquals(expected, dto.getAuthor());
}


public void testSetAuthor() {
    HistoryDTO dto = new HistoryDTO();
    String expected = null;
    dto.setAuthor(expected);
    assertEquals(expected, dto.getAuthor());
}

public void testSetAuthor2() {
    HistoryDTO dto = new HistoryDTO();
    String expected = "";
    dto.setAuthor(expected);
    assertEquals(expected, dto.getAuthor());
}

public void testSetAuthor3() {
    HistoryDTO dto = new HistoryDTO();
    String expected = " ";
    dto.setAuthor(expected);
    assertEquals(expected, dto.getAuthor());
}

public void testSetAuthor4() {
    HistoryDTO dto = new HistoryDTO();
    String expected = "　";
    dto.setAuthor(expected);
    assertEquals(expected, dto.getAuthor());
}

public void testSetAuthor5() {
    HistoryDTO dto = new HistoryDTO();
    String expected = "abc123";
    dto.setAuthor(expected);
    assertEquals(expected, dto.getAuthor());
}

public void testSetAuthor6() {
    HistoryDTO dto = new HistoryDTO();
    String expected = "あいう１２３";
    dto.setAuthor(expected);
    assertEquals(expected, dto.getAuthor());
}

public void testSetAuthor7() {
    HistoryDTO dto = new HistoryDTO();
    String expected = "abc123あいう１２３";
    dto.setAuthor(expected);
    assertEquals(expected, dto.getAuthor());
}

public void testSetAuthor8() {
    HistoryDTO dto = new HistoryDTO();
    String expected = "abc123あいう１２３漢字";
    dto.setAuthor(expected);
    assertEquals(expected, dto.getAuthor());
}



//ここから値段

	/**
	 * link com.internousdev.legmina.dto.HistoryDTO#getPrice()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetPrice1() {
		HistoryDTO test = new HistoryDTO();
		int expected = 0;

		test.setPrice(expected);

		assertEquals(expected, test.getPrice(),0.00000000001f);
	}

	/**
	 * link com.internousdev.legmina.dto.HistoryDTO#getPrice()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetPrice2() {
		HistoryDTO test = new HistoryDTO();
		int expected =  3;

		test.setPrice(expected);

		assertEquals(expected, test.getPrice(),1);
	}

	/**
	 * link com.internousdev.legmina.dto.HistoryDTO#getPrice()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetPrice3() {
		HistoryDTO test = new HistoryDTO();
		int expected = 1-45;

		test.setPrice(expected);

		assertEquals(expected, test.getPrice(),1);
	}

	/**
	 * link com.internousdev.legmina.dto.HistoryDTO#getPrice()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetPrice4() {
		HistoryDTO test = new HistoryDTO();
		try {
			int PriceMin = Integer.parseInt("4.4028235E38f");
			test.setPrice(PriceMin);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"4.4028235E38f\"");
		}
	}

	/**
	 * link com.internousdev.legmina.dto.HistoryDTO#getPrice()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetPrice5() {
		HistoryDTO test = new HistoryDTO();
		try {
			int PriceMin = Integer.parseInt("-4.4028235E38f");
			test.setPrice(PriceMin);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-4.4028235E38f\"");
		}
	}

	/**
	 * link com.internousdev.legmina.dto.HistoryDTO#setPrice(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetPrice1() {
		HistoryDTO test = new HistoryDTO();
		int expected = 0;

		test.setPrice(expected);

		assertEquals(expected, test.getPrice(),1);
	}

	/**
	 * link com.internousdev.legmina.dto.HistoryDTO#setPrice(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetPrice2() {
		HistoryDTO test = new HistoryDTO();
		int expected =  3;

		test.setPrice(expected);

		assertEquals(expected, test.getPrice(),1);
	}

	/**
	 * link com.internousdev.legmina.dto.HistoryDTO#setPrice(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetPrice3() {
		HistoryDTO test = new HistoryDTO();
		int expected = 1-45;

		test.setPrice(expected);

		assertEquals(expected, test.getPrice(),1);
	}

	/**
	 * link com.internousdev.legmina.dto.HistoryDTO#setPrice(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetPrice4() {
		HistoryDTO test = new HistoryDTO();
		try {
			int PriceMin = Integer.parseInt("4.4028235E38f");
			test.setPrice(PriceMin);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"4.4028235E38f\"");
		}
	}

	/**
	 * link com.internousdev.legmina.dto.HistoryDTO#setPrice(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetPrice5() {
		HistoryDTO test = new HistoryDTO();
		try {
			int PriceMin = Integer.parseInt("-4.4028235E38f");
			test.setPrice(PriceMin);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-4.4028235E38f\"");
		}
	}
}




