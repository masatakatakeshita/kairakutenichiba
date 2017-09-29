package com.internousdev.kairakutenichiba.dto.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.internousdev.kairakutenichiba.dto.PurchaseDetailDTO;


public class PurchaseDetailDTOTest {


public void testGetPurchaseId1() {
    PurchaseDetailDTO test = new PurchaseDetailDTO();
    int expected = 0;

    test.setPurchaseId(expected);

    assertEquals(expected, test.getPurchaseId());

}


public void testGetPurchaseId2() {
    PurchaseDetailDTO test = new PurchaseDetailDTO();
    int expected = 2147483647;

    test.setPurchaseId(expected);

    assertEquals(expected, test.getPurchaseId());
}


public void testGetPurchaseId3() {
    PurchaseDetailDTO test = new PurchaseDetailDTO();
    int expected = -2147483648;

    test.setPurchaseId(expected);

    assertEquals(expected, test.getPurchaseId());
}



public void testGetPurchaseId4() {
    PurchaseDetailDTO test = new PurchaseDetailDTO();
    try {
        int PurchaseIdMin = Integer.parseInt("2147483648");
        test.setPurchaseId(PurchaseIdMin);

    } catch (RuntimeException e) {
        assertEquals(e.getMessage(), "For input string: \"2147483648\"");
    }
}


public void testGetPurchaseId5() {
    PurchaseDetailDTO test = new PurchaseDetailDTO();
    try {
        int PurchaseIdMin = Integer.parseInt("-2147483649");
        test.setPurchaseId(PurchaseIdMin);

    } catch (RuntimeException e) {
        assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
    }
}


public void testSetPurchaseId1() {
    PurchaseDetailDTO test = new PurchaseDetailDTO();
    int expected = 0;

    test.setPurchaseId(expected);
    int actual = test.getPurchaseId();

    assertEquals(expected, actual);
}



public void testSetPurchaseId2() {
    PurchaseDetailDTO test = new PurchaseDetailDTO();
    int expected = 2147483647;

    test.setPurchaseId(expected);
    int actual = test.getPurchaseId();

    assertEquals(expected, actual);
}


public void testSetPurchaseId3() {
    PurchaseDetailDTO test = new PurchaseDetailDTO();
    int expected = -2147483648;

    test.setPurchaseId(expected);
    int actual = test.getPurchaseId();

    assertEquals(expected, actual);
}


@Test
public void testSetPurchaseId4() {
    PurchaseDetailDTO test = new PurchaseDetailDTO();
    try {
        int PurchaseIdMax = Integer.parseInt("2147483648");
        test.setPurchaseId(PurchaseIdMax);

    } catch (RuntimeException e) {
        assertEquals(e.getMessage(), "For input string: \"2147483648\"");
    }

}




public void testSetPurchaseId5() {
    PurchaseDetailDTO test = new PurchaseDetailDTO();
    try {
        int PurchaseIdMax = Integer.parseInt("-2147483649");
        test.setPurchaseId(PurchaseIdMax);

    } catch (RuntimeException e) {
        assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
    }
}


/***************************purchaseIdここまで***********************************/


    public void testGetPurchaseNo1() {
        PurchaseDetailDTO test = new PurchaseDetailDTO();
        int expected = 0;

        test.setPurchaseNo(expected);

        assertEquals(expected, test.getPurchaseNo());

    }


    public void testGetPurchaseNo2() {
        PurchaseDetailDTO test = new PurchaseDetailDTO();
        int expected = 2147483647;

        test.setPurchaseNo(expected);

        assertEquals(expected, test.getPurchaseNo());
    }


    public void testGetPurchaseNo3() {
        PurchaseDetailDTO test = new PurchaseDetailDTO();
        int expected = -2147483648;

        test.setPurchaseNo(expected);

        assertEquals(expected, test.getPurchaseNo());
    }



    public void testGetPurchaseNo4() {
        PurchaseDetailDTO test = new PurchaseDetailDTO();
        try {
            int PurchaseNoMin = Integer.parseInt("2147483648");
            test.setPurchaseNo(PurchaseNoMin);

        } catch (RuntimeException e) {
            assertEquals(e.getMessage(), "For input string: \"2147483648\"");
        }
    }


    public void testGetPurchaseNo5() {
        PurchaseDetailDTO test = new PurchaseDetailDTO();
        try {
            int PurchaseNoMin = Integer.parseInt("-2147483649");
            test.setPurchaseNo(PurchaseNoMin);

        } catch (RuntimeException e) {
            assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
        }
    }


    public void testSetPurchaseNo1() {
        PurchaseDetailDTO test = new PurchaseDetailDTO();
        int expected = 0;

        test.setPurchaseNo(expected);
        int actual = test.getPurchaseNo();

        assertEquals(expected, actual);
    }



    public void testSetPurchaseNo2() {
        PurchaseDetailDTO test = new PurchaseDetailDTO();
        int expected = 2147483647;

        test.setPurchaseNo(expected);
        int actual = test.getPurchaseNo();

        assertEquals(expected, actual);
    }


    public void testSetPurchaseNo3() {
        PurchaseDetailDTO test = new PurchaseDetailDTO();
        int expected = -2147483648;

        test.setPurchaseNo(expected);
        int actual = test.getPurchaseNo();

        assertEquals(expected, actual);
    }


    @Test
    public void testSetPurchaseNo4() {
        PurchaseDetailDTO test = new PurchaseDetailDTO();
        try {
            int PurchaseNoMax = Integer.parseInt("2147483648");
            test.setPurchaseNo(PurchaseNoMax);

        } catch (RuntimeException e) {
            assertEquals(e.getMessage(), "For input string: \"2147483648\"");
        }

    }




    public void testSetPurchaseNo5() {
        PurchaseDetailDTO test = new PurchaseDetailDTO();
        try {
            int PurchaseNoMax = Integer.parseInt("-2147483649");
            test.setPurchaseNo(PurchaseNoMax);

        } catch (RuntimeException e) {
            assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
        }
    }

    /***************************purchaseNoここまで***********************************/

        public void testGetUserId1() {
            PurchaseDetailDTO test = new PurchaseDetailDTO();
            int expected = 0;

            test.setUserId(expected);

            assertEquals(expected, test.getUserId());

        }


        public void testGetUserId2() {
            PurchaseDetailDTO test = new PurchaseDetailDTO();
            int expected = 2147483647;

            test.setUserId(expected);

            assertEquals(expected, test.getUserId());
        }


        public void testGetUserId3() {
            PurchaseDetailDTO test = new PurchaseDetailDTO();
            int expected = -2147483648;

            test.setUserId(expected);

            assertEquals(expected, test.getUserId());
        }



        public void testGetUserId4() {
            PurchaseDetailDTO test = new PurchaseDetailDTO();
            try {
                int UserIdMin = Integer.parseInt("2147483648");
                test.setUserId(UserIdMin);

            } catch (RuntimeException e) {
                assertEquals(e.getMessage(), "For input string: \"2147483648\"");
            }
        }


        public void testGetUserId5() {
            PurchaseDetailDTO test = new PurchaseDetailDTO();
            try {
                int UserIdMin = Integer.parseInt("-2147483649");
                test.setUserId(UserIdMin);

            } catch (RuntimeException e) {
                assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
            }
        }


        public void testSetUserId1() {
            PurchaseDetailDTO test = new PurchaseDetailDTO();
            int expected = 0;

            test.setUserId(expected);
            int actual = test.getUserId();

            assertEquals(expected, actual);
        }



        public void testSetUserId2() {
            PurchaseDetailDTO test = new PurchaseDetailDTO();
            int expected = 2147483647;

            test.setUserId(expected);
            int actual = test.getUserId();

            assertEquals(expected, actual);
        }


        public void testSetUserId3() {
            PurchaseDetailDTO test = new PurchaseDetailDTO();
            int expected = -2147483648;

            test.setUserId(expected);
            int actual = test.getUserId();

            assertEquals(expected, actual);
        }


        @Test
        public void testSetUserId4() {
            PurchaseDetailDTO test = new PurchaseDetailDTO();
            try {
                int UserIdMax = Integer.parseInt("2147483648");
                test.setUserId(UserIdMax);

            } catch (RuntimeException e) {
                assertEquals(e.getMessage(), "For input string: \"2147483648\"");
            }
        }





        public void testSetUserId5() {
            PurchaseDetailDTO test = new PurchaseDetailDTO();
            try {
                int UserIdMax = Integer.parseInt("-2147483649");
                test.setUserId(UserIdMax);

            } catch (RuntimeException e) {
                assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
            }
        }


/***************************userIdここまで***********************************/

            public void testGetItemId1() {
                PurchaseDetailDTO test = new PurchaseDetailDTO();
                int expected = 0;

                test.setItemId(expected);

                assertEquals(expected, test.getItemId());

            }


            public void testGetItemId2() {
                PurchaseDetailDTO test = new PurchaseDetailDTO();
                int expected = 2147483647;

                test.setItemId(expected);

                assertEquals(expected, test.getItemId());
            }


            public void testGetItemId3() {
                PurchaseDetailDTO test = new PurchaseDetailDTO();
                int expected = -2147483648;

                test.setItemId(expected);

                assertEquals(expected, test.getItemId());
            }



            public void testGetItemId4() {
                PurchaseDetailDTO test = new PurchaseDetailDTO();
                try {
                    int ItemIdMin = Integer.parseInt("2147483648");
                    test.setItemId(ItemIdMin);

                } catch (RuntimeException e) {
                    assertEquals(e.getMessage(), "For input string: \"2147483648\"");
                }
            }


            public void testGetItemId5() {
                PurchaseDetailDTO test = new PurchaseDetailDTO();
                try {
                    int ItemIdMin = Integer.parseInt("-2147483649");
                    test.setItemId(ItemIdMin);

                } catch (RuntimeException e) {
                    assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
                }
            }


            public void testSetItemId1() {
                PurchaseDetailDTO test = new PurchaseDetailDTO();
                int expected = 0;

                test.setItemId(expected);
                int actual = test.getItemId();

                assertEquals(expected, actual);
            }



            public void testSetItemId2() {
                PurchaseDetailDTO test = new PurchaseDetailDTO();
                int expected = 2147483647;

                test.setItemId(expected);
                int actual = test.getItemId();

                assertEquals(expected, actual);
            }


            public void testSetItemId3() {
                PurchaseDetailDTO test = new PurchaseDetailDTO();
                int expected = -2147483648;

                test.setItemId(expected);
                int actual = test.getItemId();

                assertEquals(expected, actual);
            }


            @Test
            public void testSetItemId4() {
                PurchaseDetailDTO test = new PurchaseDetailDTO();
                try {
                    int ItemIdMax = Integer.parseInt("2147483648");
                    test.setItemId(ItemIdMax);

                } catch (RuntimeException e) {
                    assertEquals(e.getMessage(), "For input string: \"2147483648\"");
                }
            }





            public void testSetItemId5() {
                PurchaseDetailDTO test = new PurchaseDetailDTO();
                try {
                    int ItemIdMax = Integer.parseInt("-2147483649");
                    test.setItemId(ItemIdMax);

                } catch (RuntimeException e) {
                    assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
                }
            }



            /***************************itemIdここまで***********************************/

public void testGetItemName1() {
    PurchaseDetailDTO test = new PurchaseDetailDTO();
    String expected = null;

    test.setItemName(expected);
    String actual = test.getItemName();

    assertEquals(expected, actual);
}


public void testGetItemName2() {
    PurchaseDetailDTO test = new PurchaseDetailDTO();
    String expected = "";

    test.setItemName(expected);
    String actual = test.getItemName();

    assertEquals(expected, actual);
}


public void testGetItemName3() {
    PurchaseDetailDTO test = new PurchaseDetailDTO();
    String expected = " ";

    test.setItemName(expected);
    String actual = test.getItemName();

    assertEquals(expected, actual);
}


public void testGetItemName4() {
    PurchaseDetailDTO test = new PurchaseDetailDTO();
    String expected = "　";

    test.setItemName(expected);
    String actual = test.getItemName();

    assertEquals(expected, actual);
}


public void testGetItemName5() {
    PurchaseDetailDTO test = new PurchaseDetailDTO();
    String expected = "abc123";

    test.setItemName(expected);
    String actual = test.getItemName();

    assertEquals(expected, actual);
}


@Test
public void testGetItemName6() {
    PurchaseDetailDTO test = new PurchaseDetailDTO();
    String expected = "あいう１２３";

    test.setItemName(expected);
    String actual = test.getItemName();

    assertEquals(expected, actual);
}


public void testGetItemName7() {
    PurchaseDetailDTO test = new PurchaseDetailDTO();
    String expected = "abc123あいう１２３";

    test.setItemName(expected);
    String actual = test.getItemName();

    assertEquals(expected, actual);
}


public void testGetItemName8() {
    PurchaseDetailDTO test = new PurchaseDetailDTO();
    String expected = "ａｂｃ１２３あいう漢字";

    test.setItemName(expected);
    String actual = test.getItemName();

    assertEquals(expected, actual);
}


@Test
public void testSetItemName1() {
    PurchaseDetailDTO test = new PurchaseDetailDTO();
    String expected = null;

    test.setItemName(expected);
    String actual = test.getItemName();

    assertEquals(expected, actual);

}



public void testSetItemName2() {
    PurchaseDetailDTO test = new PurchaseDetailDTO();
    String expected = "";

    test.setItemName(expected);
    String actual = test.getItemName();

    assertEquals(expected, actual);

}


public void testSetItemName3() {
    PurchaseDetailDTO test = new PurchaseDetailDTO();
    String expected = " ";

    test.setItemName(expected);
    String actual = test.getItemName();

    assertEquals(expected, actual);

}


public void testSetItemName4() {
    PurchaseDetailDTO test = new PurchaseDetailDTO();
    String expected = "　";

    test.setItemName(expected);
    String actual = test.getItemName();

    assertEquals(expected, actual);

}

public void testSetItemName5() {
    PurchaseDetailDTO test = new PurchaseDetailDTO();
    String expected = "abc123";

    test.setItemName(expected);
    String actual = test.getItemName();

    assertEquals(expected, actual);

}


@Test
public void testSetItemName6() {
    PurchaseDetailDTO test = new PurchaseDetailDTO();
    String expected = "あいう１２３";

    test.setItemName(expected);
    String actual = test.getItemName();

    assertEquals(expected, actual);

}


public void testSetItemName7() {
    PurchaseDetailDTO test = new PurchaseDetailDTO();
    String expected = "abc123あいう１２３";

    test.setItemName(expected);
    String actual = test.getItemName();

    assertEquals(expected, actual);

}


public void testSetItemName8() {
    PurchaseDetailDTO test = new PurchaseDetailDTO();
    String expected = "ａｂｃ１２３あいう漢字";

    test.setItemName(expected);
    String actual = test.getItemName();

    assertEquals(expected, actual);

}
/***************************itemNameここまで***********************************/

        public void testGetImagePath1() {
            PurchaseDetailDTO test = new PurchaseDetailDTO();
            String expected = null;

            test.setImagePath(expected);
            String actual = test.getImagePath();

            assertEquals(expected, actual);
        }


        public void testGetImagePath2() {
            PurchaseDetailDTO test = new PurchaseDetailDTO();
            String expected = "";

            test.setImagePath(expected);
            String actual = test.getImagePath();

            assertEquals(expected, actual);
        }


        public void testGetImagePath3() {
            PurchaseDetailDTO test = new PurchaseDetailDTO();
            String expected = " ";

            test.setImagePath(expected);
            String actual = test.getImagePath();

            assertEquals(expected, actual);
        }


        public void testGetImagePath4() {
            PurchaseDetailDTO test = new PurchaseDetailDTO();
            String expected = "　";

            test.setImagePath(expected);
            String actual = test.getImagePath();

            assertEquals(expected, actual);
        }


        public void testGetImagePath5() {
            PurchaseDetailDTO test = new PurchaseDetailDTO();
            String expected = "abc123";

            test.setImagePath(expected);
            String actual = test.getImagePath();

            assertEquals(expected, actual);
        }


        @Test
        public void testGetImagePath6() {
            PurchaseDetailDTO test = new PurchaseDetailDTO();
            String expected = "あいう１２３";

            test.setImagePath(expected);
            String actual = test.getImagePath();

            assertEquals(expected, actual);
        }


        public void testGetImagePath7() {
            PurchaseDetailDTO test = new PurchaseDetailDTO();
            String expected = "abc123あいう１２３";

            test.setImagePath(expected);
            String actual = test.getImagePath();

            assertEquals(expected, actual);
        }


        public void testGetImagePath8() {
            PurchaseDetailDTO test = new PurchaseDetailDTO();
            String expected = "ａｂｃ１２３あいう漢字";

            test.setImagePath(expected);
            String actual = test.getImagePath();

            assertEquals(expected, actual);
        }


        @Test
        public void testSetImagePath1() {
            PurchaseDetailDTO test = new PurchaseDetailDTO();
            String expected = null;

            test.setImagePath(expected);
            String actual = test.getImagePath();

            assertEquals(expected, actual);

        }



        public void testSetImagePath2() {
            PurchaseDetailDTO test = new PurchaseDetailDTO();
            String expected = "";

            test.setImagePath(expected);
            String actual = test.getImagePath();

            assertEquals(expected, actual);

        }


        public void testSetImagePath3() {
            PurchaseDetailDTO test = new PurchaseDetailDTO();
            String expected = " ";

            test.setImagePath(expected);
            String actual = test.getImagePath();

            assertEquals(expected, actual);

        }


        public void testSetImagePath4() {
            PurchaseDetailDTO test = new PurchaseDetailDTO();
            String expected = "　";

            test.setImagePath(expected);
            String actual = test.getImagePath();

            assertEquals(expected, actual);

        }

        public void testSetImagePath5() {
            PurchaseDetailDTO test = new PurchaseDetailDTO();
            String expected = "abc123";

            test.setImagePath(expected);
            String actual = test.getImagePath();

            assertEquals(expected, actual);

        }


        @Test
        public void testSetImagePath6() {
            PurchaseDetailDTO test = new PurchaseDetailDTO();
            String expected = "あいう１２３";

            test.setImagePath(expected);
            String actual = test.getImagePath();

            assertEquals(expected, actual);

        }


        public void testSetImagePath7() {
            PurchaseDetailDTO test = new PurchaseDetailDTO();
            String expected = "abc123あいう１２３";

            test.setImagePath(expected);
            String actual = test.getImagePath();

            assertEquals(expected, actual);

        }


        public void testSetImagePath8() {
            PurchaseDetailDTO test = new PurchaseDetailDTO();
            String expected = "ａｂｃ１２３あいう漢字";

            test.setImagePath(expected);
            String actual = test.getImagePath();

            assertEquals(expected, actual);

        }

/***************************imagePathここまで***********************************/

public void testGetPrice1() {
    PurchaseDetailDTO test = new PurchaseDetailDTO();
    float expected = 0f;

    test.setPrice(expected);

    assertEquals(expected, test.getPrice(),0.00000000001f);
}

/**
 * link com.internousdev.seatopia.dto.PurchaseDetailDTO#getPrice()} のためのテスト・メソッド。
 */
@Test
public void testGetPrice2() {
    PurchaseDetailDTO test = new PurchaseDetailDTO();
    float expected =  3.4028235E38f;

    test.setPrice(expected);

    assertEquals(expected, test.getPrice(),0.00000000001f);
}

/**
 * link com.internousdev.seatopia.dto.PurchaseDetailDTO#getPrice()} のためのテスト・メソッド。
 */
@Test
public void testGetPrice3() {
    PurchaseDetailDTO test = new PurchaseDetailDTO();
    float expected = 1.4E-45f;

    test.setPrice(expected);

    assertEquals(expected, test.getPrice(),0.00000000001f);
}

/**
 * link com.internousdev.seatopia.dto.PurchaseDetailDTO#getPrice()} のためのテスト・メソッド。
 */
@Test
public void testGetPrice4() {
    PurchaseDetailDTO test = new PurchaseDetailDTO();
    try {
        float PriceMin = Integer.parseInt("4.4028235E38f");
        test.setPrice(PriceMin);

    } catch (RuntimeException e) {
        assertEquals(e.getMessage(), "For input string: \"4.4028235E38f\"");
    }
}

/**
 * link com.internousdev.seatopia.dto.PurchaseDetailDTO#getPrice()} のためのテスト・メソッド。
 */
@Test
public void testGetPrice5() {
    PurchaseDetailDTO test = new PurchaseDetailDTO();
    try {
        float PriceMin = Integer.parseInt("-4.4028235E38f");
        test.setPrice(PriceMin);

    } catch (RuntimeException e) {
        assertEquals(e.getMessage(), "For input string: \"-4.4028235E38f\"");
    }
}

/**
 * link com.internousdev.seatopia.dto.PurchaseDetailDTO#getPrice(int)} のためのテスト・メソッド。
 */
@Test
public void testSetPrice1() {
    PurchaseDetailDTO test = new PurchaseDetailDTO();
    float expected = 0f;

    test.setPrice(expected);

    assertEquals(expected, test.getPrice(),0.00000000001f);
}

/**
 * link com.internousdev.seatopia.dto.PurchaseDetailDTO#getPrice(int)} のためのテスト・メソッド。
 */
@Test
public void testSetPrice2() {
    PurchaseDetailDTO test = new PurchaseDetailDTO();
    float expected =  3.4028235E38f;

    test.setPrice(expected);

    assertEquals(expected, test.getPrice(),0.00000000001f);
}

/**
 * link com.internousdev.seatopia.dto.PurchaseDetailDTO#getPrice(int)} のためのテスト・メソッド。
 */
@Test
public void testSetPrice3() {
    PurchaseDetailDTO test = new PurchaseDetailDTO();
    float expected = 1.4E-45f;

    test.setPrice(expected);

    assertEquals(expected, test.getPrice(),0.00000000001f);
}

/**
 * link com.internousdev.seatopia.dto.PurchaseDetailDTO#getPrice(int)} のためのテスト・メソッド。
 */
@Test
public void testSetPrice4() {
    PurchaseDetailDTO test = new PurchaseDetailDTO();
    try {
        float PriceMin = Integer.parseInt("4.4028235E38f");
        test.setPrice(PriceMin);

    } catch (RuntimeException e) {
        assertEquals(e.getMessage(), "For input string: \"4.4028235E38f\"");
    }
}

/**
 * link com.internousdev.seatopia.dto.PurchaseDetailDTO#getPrice(int)} のためのテスト・メソッド。
 */
@Test
public void testSetPrice5() {
    PurchaseDetailDTO test = new PurchaseDetailDTO();
    try {
        float PriceMin = Integer.parseInt("-4.4028235E38f");
        test.setPrice(PriceMin);

    } catch (RuntimeException e) {
        assertEquals(e.getMessage(), "For input string: \"-4.4028235E38f\"");
    }
}


/***************************priceここまで***********************************/


public void testGetQuantities1() {
    PurchaseDetailDTO test = new PurchaseDetailDTO();
    int expected = 0;

    test.setQuantities(expected);

    assertEquals(expected, test.getQuantities());

}


public void testGetQuantities2() {
    PurchaseDetailDTO test = new PurchaseDetailDTO();
    int expected = 2147483647;

    test.setQuantities(expected);

    assertEquals(expected, test.getQuantities());
}


public void testGetQuantities3() {
    PurchaseDetailDTO test = new PurchaseDetailDTO();
    int expected = -2147483648;

    test.setQuantities(expected);

    assertEquals(expected, test.getQuantities());
}



public void testGetQuantities4() {
    PurchaseDetailDTO test = new PurchaseDetailDTO();
    try {
        int QuantitiesMin = Integer.parseInt("2147483648");
        test.setQuantities(QuantitiesMin);

    } catch (RuntimeException e) {
        assertEquals(e.getMessage(), "For input string: \"2147483648\"");
    }
}


public void testGetQuantities5() {
    PurchaseDetailDTO test = new PurchaseDetailDTO();
    try {
        int QuantitiesMin = Integer.parseInt("-2147483649");
        test.setQuantities(QuantitiesMin);

    } catch (RuntimeException e) {
        assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
    }
}


public void testSetQuantities1() {
    PurchaseDetailDTO test = new PurchaseDetailDTO();
    int expected = 0;

    test.setQuantities(expected);
    int actual = test.getQuantities();

    assertEquals(expected, actual);
}



public void testSetQuantities2() {
    PurchaseDetailDTO test = new PurchaseDetailDTO();
    int expected = 2147483647;

    test.setQuantities(expected);
    int actual = test.getQuantities();

    assertEquals(expected, actual);
}


public void testSetQuantities3() {
    PurchaseDetailDTO test = new PurchaseDetailDTO();
    int expected = -2147483648;

    test.setQuantities(expected);
    int actual = test.getQuantities();

    assertEquals(expected, actual);
}


@Test
public void testSetQuantities4() {
    PurchaseDetailDTO test = new PurchaseDetailDTO();
    try {
        int QuantitiesMax = Integer.parseInt("2147483648");
        test.setQuantities(QuantitiesMax);

    } catch (RuntimeException e) {
        assertEquals(e.getMessage(), "For input string: \"2147483648\"");
    }

}




public void testSetQuantities5() {
    PurchaseDetailDTO test = new PurchaseDetailDTO();
    try {
        int QuantitiesMax = Integer.parseInt("-2147483649");
        test.setQuantities(QuantitiesMax);

    } catch (RuntimeException e) {
        assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
    }
}


/***************************quantitiesここまで***********************************/

public void testGetMultipliedPrice1() {
    PurchaseDetailDTO test = new PurchaseDetailDTO();
    float expected = 0f;

    test.setMultipliedPrice(expected);

    assertEquals(expected, test.getMultipliedPrice(),0.00000000001f);
}

/**
 * link com.internousdev.seatopia.dto.PurchaseDetailDTO#getMultipliedPrice()} のためのテスト・メソッド。
 */
@Test
public void testGetMultipliedPrice2() {
    PurchaseDetailDTO test = new PurchaseDetailDTO();
    float expected =  3.4028235E38f;

    test.setMultipliedPrice(expected);

    assertEquals(expected, test.getMultipliedPrice(),0.00000000001f);
}

/**
 * link com.internousdev.seatopia.dto.PurchaseDetailDTO#getMultipliedPrice()} のためのテスト・メソッド。
 */
@Test
public void testGetMultipliedPrice3() {
    PurchaseDetailDTO test = new PurchaseDetailDTO();
    float expected = 1.4E-45f;

    test.setMultipliedPrice(expected);

    assertEquals(expected, test.getMultipliedPrice(),0.00000000001f);
}

/**
 * link com.internousdev.seatopia.dto.PurchaseDetailDTO#getMultipliedPrice()} のためのテスト・メソッド。
 */
@Test
public void testGetMultipliedPrice4() {
    PurchaseDetailDTO test = new PurchaseDetailDTO();
    try {
        float MultipliedPriceMin = Integer.parseInt("4.4028235E38f");
        test.setMultipliedPrice(MultipliedPriceMin);

    } catch (RuntimeException e) {
        assertEquals(e.getMessage(), "For input string: \"4.4028235E38f\"");
    }
}

/**
 * link com.internousdev.seatopia.dto.PurchaseDetailDTO#getMultipliedPrice()} のためのテスト・メソッド。
 */
@Test
public void testGetMultipliedPrice5() {
    PurchaseDetailDTO test = new PurchaseDetailDTO();
    try {
        float MultipliedPriceMin = Integer.parseInt("-4.4028235E38f");
        test.setMultipliedPrice(MultipliedPriceMin);

    } catch (RuntimeException e) {
        assertEquals(e.getMessage(), "For input string: \"-4.4028235E38f\"");
    }
}

/**
 * link com.internousdev.seatopia.dto.PurchaseDetailDTO#getMultipliedPrice(int)} のためのテスト・メソッド。
 */
@Test
public void testSetMultipliedPrice1() {
    PurchaseDetailDTO test = new PurchaseDetailDTO();
    float expected = 0f;

    test.setMultipliedPrice(expected);

    assertEquals(expected, test.getMultipliedPrice(),0.00000000001f);
}

/**
 * link com.internousdev.seatopia.dto.PurchaseDetailDTO#getMultipliedPrice(int)} のためのテスト・メソッド。
 */
@Test
public void testSetMultipliedPrice2() {
    PurchaseDetailDTO test = new PurchaseDetailDTO();
    float expected =  3.4028235E38f;

    test.setMultipliedPrice(expected);

    assertEquals(expected, test.getMultipliedPrice(),0.00000000001f);
}

/**
 * link com.internousdev.seatopia.dto.PurchaseDetailDTO#getMultipliedPrice(int)} のためのテスト・メソッド。
 */
@Test
public void testSetMultipliedPrice3() {
    PurchaseDetailDTO test = new PurchaseDetailDTO();
    float expected = 1.4E-45f;

    test.setMultipliedPrice(expected);

    assertEquals(expected, test.getMultipliedPrice(),0.00000000001f);
}

/**
 * link com.internousdev.seatopia.dto.PurchaseDetailDTO#getMultipliedPrice(int)} のためのテスト・メソッド。
 */
@Test
public void testSetMultipliedPrice4() {
    PurchaseDetailDTO test = new PurchaseDetailDTO();
    try {
        float MultipliedPriceMin = Integer.parseInt("4.4028235E38f");
        test.setMultipliedPrice(MultipliedPriceMin);

    } catch (RuntimeException e) {
        assertEquals(e.getMessage(), "For input string: \"4.4028235E38f\"");
    }
}

/**
 * link com.internousdev.seatopia.dto.PurchaseDetailDTO#getMultipliedPrice(int)} のためのテスト・メソッド。
 */
@Test
public void testSetMultipliedPrice5() {
    PurchaseDetailDTO test = new PurchaseDetailDTO();
    try {
        float MultipliedPriceMin = Integer.parseInt("-4.4028235E38f");
        test.setMultipliedPrice(MultipliedPriceMin);

    } catch (RuntimeException e) {
        assertEquals(e.getMessage(), "For input string: \"-4.4028235E38f\"");
    }
}


/***************************multipliedPriceここまで***********************************/


public void testGetPurchasedAt1() {
    PurchaseDetailDTO test = new PurchaseDetailDTO();
    String expected = null;

    test.setPurchasedAt(expected);
    String actual = test.getPurchasedAt();

    assertEquals(expected, actual);
}


public void testGetPurchasedAt2() {
    PurchaseDetailDTO test = new PurchaseDetailDTO();
    String expected = "";

    test.setPurchasedAt(expected);
    String actual = test.getPurchasedAt();

    assertEquals(expected, actual);
}


public void testGetPurchasedAt3() {
    PurchaseDetailDTO test = new PurchaseDetailDTO();
    String expected = " ";

    test.setPurchasedAt(expected);
    String actual = test.getPurchasedAt();

    assertEquals(expected, actual);
}


public void testGetPurchasedAt4() {
    PurchaseDetailDTO test = new PurchaseDetailDTO();
    String expected = "　";

    test.setPurchasedAt(expected);
    String actual = test.getPurchasedAt();

    assertEquals(expected, actual);
}


public void testGetPurchasedAt5() {
    PurchaseDetailDTO test = new PurchaseDetailDTO();
    String expected = "abc123";

    test.setPurchasedAt(expected);
    String actual = test.getPurchasedAt();

    assertEquals(expected, actual);
}


@Test
public void testGetPurchasedAt6() {
    PurchaseDetailDTO test = new PurchaseDetailDTO();
    String expected = "あいう１２３";

    test.setPurchasedAt(expected);
    String actual = test.getPurchasedAt();

    assertEquals(expected, actual);
}


public void testGetPurchasedAt7() {
    PurchaseDetailDTO test = new PurchaseDetailDTO();
    String expected = "abc123あいう１２３";

    test.setPurchasedAt(expected);
    String actual = test.getPurchasedAt();

    assertEquals(expected, actual);
}


public void testGetPurchasedAt8() {
    PurchaseDetailDTO test = new PurchaseDetailDTO();
    String expected = "ａｂｃ１２３あいう漢字";

    test.setPurchasedAt(expected);
    String actual = test.getPurchasedAt();

    assertEquals(expected, actual);
}


@Test
public void testSetPurchasedAt1() {
    PurchaseDetailDTO test = new PurchaseDetailDTO();
    String expected = null;

    test.setPurchasedAt(expected);
    String actual = test.getPurchasedAt();

    assertEquals(expected, actual);

}



public void testSetPurchasedAt2() {
    PurchaseDetailDTO test = new PurchaseDetailDTO();
    String expected = "";

    test.setPurchasedAt(expected);
    String actual = test.getPurchasedAt();

    assertEquals(expected, actual);

}


public void testSetPurchasedAt3() {
    PurchaseDetailDTO test = new PurchaseDetailDTO();
    String expected = " ";

    test.setPurchasedAt(expected);
    String actual = test.getPurchasedAt();

    assertEquals(expected, actual);

}


public void testSetPurchasedAt4() {
    PurchaseDetailDTO test = new PurchaseDetailDTO();
    String expected = "　";

    test.setPurchasedAt(expected);
    String actual = test.getPurchasedAt();

    assertEquals(expected, actual);

}

public void testSetPurchasedAt5() {
    PurchaseDetailDTO test = new PurchaseDetailDTO();
    String expected = "abc123";

    test.setPurchasedAt(expected);
    String actual = test.getPurchasedAt();

    assertEquals(expected, actual);

}


@Test
public void testSetPurchasedAt6() {
    PurchaseDetailDTO test = new PurchaseDetailDTO();
    String expected = "あいう１２３";

    test.setPurchasedAt(expected);
    String actual = test.getPurchasedAt();

    assertEquals(expected, actual);

}


public void testSetPurchasedAt7() {
    PurchaseDetailDTO test = new PurchaseDetailDTO();
    String expected = "abc123あいう１２３";

    test.setPurchasedAt(expected);
    String actual = test.getPurchasedAt();

    assertEquals(expected, actual);

}


public void testSetPurchasedAt8() {
    PurchaseDetailDTO test = new PurchaseDetailDTO();
    String expected = "ａｂｃ１２３あいう漢字";

    test.setPurchasedAt(expected);
    String actual = test.getPurchasedAt();

    assertEquals(expected, actual);

}
/***************************purchasedAtここまで***********************************/

public void testGetCreatedAt1() {
    PurchaseDetailDTO test = new PurchaseDetailDTO();
    String expected = null;

    test.setCreatedAt(expected);
    String actual = test.getCreatedAt();

    assertEquals(expected, actual);
}


public void testGetCreatedAt2() {
    PurchaseDetailDTO test = new PurchaseDetailDTO();
    String expected = "";

    test.setCreatedAt(expected);
    String actual = test.getCreatedAt();

    assertEquals(expected, actual);
}


public void testGetCreatedAt3() {
    PurchaseDetailDTO test = new PurchaseDetailDTO();
    String expected = " ";

    test.setCreatedAt(expected);
    String actual = test.getCreatedAt();

    assertEquals(expected, actual);
}


public void testGetCreatedAt4() {
    PurchaseDetailDTO test = new PurchaseDetailDTO();
    String expected = "　";

    test.setCreatedAt(expected);
    String actual = test.getCreatedAt();

    assertEquals(expected, actual);
}


public void testGetCreatedAt5() {
    PurchaseDetailDTO test = new PurchaseDetailDTO();
    String expected = "abc123";

    test.setCreatedAt(expected);
    String actual = test.getCreatedAt();

    assertEquals(expected, actual);
}


@Test
public void testGetCreatedAt6() {
    PurchaseDetailDTO test = new PurchaseDetailDTO();
    String expected = "あいう１２３";

    test.setCreatedAt(expected);
    String actual = test.getCreatedAt();

    assertEquals(expected, actual);
}


public void testGetCreatedAt7() {
    PurchaseDetailDTO test = new PurchaseDetailDTO();
    String expected = "abc123あいう１２３";

    test.setCreatedAt(expected);
    String actual = test.getCreatedAt();

    assertEquals(expected, actual);
}


public void testGetCreatedAt8() {
    PurchaseDetailDTO test = new PurchaseDetailDTO();
    String expected = "ａｂｃ１２３あいう漢字";

    test.setCreatedAt(expected);
    String actual = test.getCreatedAt();

    assertEquals(expected, actual);
}


@Test
public void testSetCreatedAt1() {
    PurchaseDetailDTO test = new PurchaseDetailDTO();
    String expected = null;

    test.setCreatedAt(expected);
    String actual = test.getCreatedAt();

    assertEquals(expected, actual);

}



public void testSetCreatedAt2() {
    PurchaseDetailDTO test = new PurchaseDetailDTO();
    String expected = "";

    test.setCreatedAt(expected);
    String actual = test.getCreatedAt();

    assertEquals(expected, actual);

}


public void testSetCreatedAt3() {
    PurchaseDetailDTO test = new PurchaseDetailDTO();
    String expected = " ";

    test.setCreatedAt(expected);
    String actual = test.getCreatedAt();

    assertEquals(expected, actual);

}


public void testSetCreatedAt4() {
    PurchaseDetailDTO test = new PurchaseDetailDTO();
    String expected = "　";

    test.setCreatedAt(expected);
    String actual = test.getCreatedAt();

    assertEquals(expected, actual);

}

public void testSetCreatedAt5() {
    PurchaseDetailDTO test = new PurchaseDetailDTO();
    String expected = "abc123";

    test.setCreatedAt(expected);
    String actual = test.getCreatedAt();

    assertEquals(expected, actual);

}


@Test
public void testSetCreatedAt6() {
    PurchaseDetailDTO test = new PurchaseDetailDTO();
    String expected = "あいう１２３";

    test.setCreatedAt(expected);
    String actual = test.getCreatedAt();

    assertEquals(expected, actual);

}


public void testSetCreatedAt7() {
    PurchaseDetailDTO test = new PurchaseDetailDTO();
    String expected = "abc123あいう１２３";

    test.setCreatedAt(expected);
    String actual = test.getCreatedAt();

    assertEquals(expected, actual);

}


public void testSetCreatedAt8() {
    PurchaseDetailDTO test = new PurchaseDetailDTO();
    String expected = "ａｂｃ１２３あいう漢字";

    test.setCreatedAt(expected);
    String actual = test.getCreatedAt();

    assertEquals(expected, actual);

}
/***************************CreatedAtここまで***********************************/


public void testGetUpdatedAt1() {
    PurchaseDetailDTO test = new PurchaseDetailDTO();
    String expected = null;

    test.setUpdatedAt(expected);
    String actual = test.getUpdatedAt();

    assertEquals(expected, actual);
}


public void testGetUpdatedAt2() {
    PurchaseDetailDTO test = new PurchaseDetailDTO();
    String expected = "";

    test.setUpdatedAt(expected);
    String actual = test.getUpdatedAt();

    assertEquals(expected, actual);
}


public void testGetUpdatedAt3() {
    PurchaseDetailDTO test = new PurchaseDetailDTO();
    String expected = " ";

    test.setUpdatedAt(expected);
    String actual = test.getUpdatedAt();

    assertEquals(expected, actual);
}


public void testGetUpdatedAt4() {
    PurchaseDetailDTO test = new PurchaseDetailDTO();
    String expected = "　";

    test.setUpdatedAt(expected);
    String actual = test.getUpdatedAt();

    assertEquals(expected, actual);
}


public void testGetUpdatedAt5() {
    PurchaseDetailDTO test = new PurchaseDetailDTO();
    String expected = "abc123";

    test.setUpdatedAt(expected);
    String actual = test.getUpdatedAt();

    assertEquals(expected, actual);
}


@Test
public void testGetUpdatedAt6() {
    PurchaseDetailDTO test = new PurchaseDetailDTO();
    String expected = "あいう１２３";

    test.setUpdatedAt(expected);
    String actual = test.getUpdatedAt();

    assertEquals(expected, actual);
}


public void testGetUpdatedAt7() {
    PurchaseDetailDTO test = new PurchaseDetailDTO();
    String expected = "abc123あいう１２３";

    test.setUpdatedAt(expected);
    String actual = test.getUpdatedAt();

    assertEquals(expected, actual);
}


public void testGetUpdatedAt8() {
    PurchaseDetailDTO test = new PurchaseDetailDTO();
    String expected = "ａｂｃ１２３あいう漢字";

    test.setUpdatedAt(expected);
    String actual = test.getUpdatedAt();

    assertEquals(expected, actual);
}


@Test
public void testSetUpdatedAt1() {
    PurchaseDetailDTO test = new PurchaseDetailDTO();
    String expected = null;

    test.setUpdatedAt(expected);
    String actual = test.getUpdatedAt();

    assertEquals(expected, actual);

}



public void testSetUpdatedAt2() {
    PurchaseDetailDTO test = new PurchaseDetailDTO();
    String expected = "";

    test.setUpdatedAt(expected);
    String actual = test.getUpdatedAt();

    assertEquals(expected, actual);

}


public void testSetUpdatedAt3() {
    PurchaseDetailDTO test = new PurchaseDetailDTO();
    String expected = " ";

    test.setUpdatedAt(expected);
    String actual = test.getUpdatedAt();

    assertEquals(expected, actual);

}


public void testSetUpdatedAt4() {
    PurchaseDetailDTO test = new PurchaseDetailDTO();
    String expected = "　";

    test.setUpdatedAt(expected);
    String actual = test.getUpdatedAt();

    assertEquals(expected, actual);

}

public void testSetUpdatedAt5() {
    PurchaseDetailDTO test = new PurchaseDetailDTO();
    String expected = "abc123";

    test.setUpdatedAt(expected);
    String actual = test.getUpdatedAt();

    assertEquals(expected, actual);

}


@Test
public void testSetUpdatedAt6() {
    PurchaseDetailDTO test = new PurchaseDetailDTO();
    String expected = "あいう１２３";

    test.setUpdatedAt(expected);
    String actual = test.getUpdatedAt();

    assertEquals(expected, actual);

}


public void testSetUpdatedAt7() {
    PurchaseDetailDTO test = new PurchaseDetailDTO();
    String expected = "abc123あいう１２３";

    test.setUpdatedAt(expected);
    String actual = test.getUpdatedAt();

    assertEquals(expected, actual);

}


public void testSetUpdatedAt8() {
    PurchaseDetailDTO test = new PurchaseDetailDTO();
    String expected = "ａｂｃ１２３あいう漢字";

    test.setUpdatedAt(expected);
    String actual = test.getUpdatedAt();

    assertEquals(expected, actual);

}
}
/***************************updatedAtここまで***********************************/




