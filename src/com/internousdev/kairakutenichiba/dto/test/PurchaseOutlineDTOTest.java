package com.internousdev.kairakutenichiba.dto.test;

import com.internousdev.kairakutenichiba.dto.PurchaseOutlineDTO;

import junit.framework.TestCase;

public class PurchaseOutlineDTOTest extends TestCase {

    public void testGetPurchaseId() {
        PurchaseOutlineDTO dto = new PurchaseOutlineDTO();
        int expected = 0;
        dto.setPurchaseId(expected);
        assertEquals(expected, dto.getPurchaseId());
    }

    public void testGetPurchaseId2() {
        PurchaseOutlineDTO dto = new PurchaseOutlineDTO();
        int expected = -2147483648;
        dto.setPurchaseId(expected);
        assertEquals(expected, dto.getPurchaseId());
    }

    public void testGetPurchaseId3() {
        PurchaseOutlineDTO dto = new PurchaseOutlineDTO();
        int expected = 2147483647;
        dto.setPurchaseId(expected);
        assertEquals(expected, dto.getPurchaseId());
    }

    public void testGetPurchaseId4()throws Exception {
        PurchaseOutlineDTO dto = new PurchaseOutlineDTO();
        try {
            int postalMin = Integer.parseInt("-2147483649");
            dto.setPurchaseId(postalMin);
            } catch (RuntimeException e) {
            assertThat1(e.getMessage(), "For input string: \"-2147483649\"");
            }
    }

    public void testGetOauthName5() throws Exception{
        PurchaseOutlineDTO dto = new PurchaseOutlineDTO();
        try {
            int postalMax = Integer.parseInt("2147483647");
            dto.setPurchaseId(postalMax);
            } catch (RuntimeException e) {
            assertThat1(e.getMessage(), "For input string:\"2147483647\"");
            }
    }

    private void assertThat(String message, String string) {
        assertEquals(message, string);
    }



    public void testSetPurchaseId() {
        PurchaseOutlineDTO dto = new PurchaseOutlineDTO();
        int expected = 0;
        dto.setPurchaseId(expected);
        int actual = dto.getPurchaseId();
        assertEquals(expected, actual);
    }

    public void testSetPurchaseId2() {
        PurchaseOutlineDTO dto = new PurchaseOutlineDTO();
        int expected = 2147483647;
        dto.setPurchaseId(expected);
        int actual = dto.getPurchaseId();
        assertEquals(expected, actual);
    }

    public void testSetPurchaseId3() {
        PurchaseOutlineDTO dto = new PurchaseOutlineDTO();
        int expected = -2147483648;
        dto.setPurchaseId(expected);
        int actual = dto.getPurchaseId();
        assertEquals(expected, actual);
    }

    public void testSetPurchaseId4() throws Exception{
        PurchaseOutlineDTO dto = new PurchaseOutlineDTO();
        try {
            int postalMin = Integer.parseInt("-2147483649");
            dto.setPurchaseId(postalMin);
            } catch (RuntimeException e) {
            assertThat(e.getMessage(), "For input string: \"-2147483649\"");
            }
    }

    public void testSetPurchaseId5() throws Exception{
        PurchaseOutlineDTO dto = new PurchaseOutlineDTO();
        try {
            int postalMax = Integer.parseInt("2147483647");
            dto.setPurchaseId(postalMax);
            } catch (RuntimeException e) {
            assertThat(e.getMessage(), "For input string:\"2147483647\"");
            }
    }

    private void assertThat1(String message, String string) {
        assertEquals(message, string);

    }
    public PurchaseOutlineDTOTest(String name) {
        super(name);
    }

    public void testGetUserId() {
         PurchaseOutlineDTO dto = new  PurchaseOutlineDTO();
        int expected = 0;
        dto.setUserId(expected);
        assertEquals(expected, dto.getUserId());
    }

    public void testGetUserId2() {
         PurchaseOutlineDTO dto = new  PurchaseOutlineDTO();
        int expected = -2147483648;
        dto.setUserId(expected);
        assertEquals(expected, dto.getUserId());
    }

    public void testGetUserId3() {
         PurchaseOutlineDTO dto = new  PurchaseOutlineDTO();
        int expected = 2147483647;
        dto.setUserId(expected);
        assertEquals(expected, dto.getUserId());
    }

    public void testGetUserId4() throws Exception{
         PurchaseOutlineDTO dto = new  PurchaseOutlineDTO();
        try {
            int postalMin = Integer.parseInt("-2147483649");
            dto.setUserId(postalMin);
            } catch (RuntimeException e) {
            assertThat1(e.getMessage(), "For input string: \"-2147483649\"");
            }
    }

    public void testGetUserId5() throws Exception{
         PurchaseOutlineDTO dto = new  PurchaseOutlineDTO();
        try {
            int postalMax = Integer.parseInt("2147483647");
            dto.setUserId(postalMax);
            } catch (RuntimeException e) {
            assertThat1(e.getMessage(), "For input string: \"2147483647\"");
            }
    }

    public void testSetUserId() {
         PurchaseOutlineDTO dto = new  PurchaseOutlineDTO();
        int expected = 0;
        dto.setUserId(expected);
        int actual = dto.getUserId();
        assertEquals(expected, actual);
    }

    public void testSetUserId2() {
         PurchaseOutlineDTO dto = new  PurchaseOutlineDTO();
        int expected = 2147483647;
        dto.setUserId(expected);
        int actual = dto.getUserId();
        assertEquals(expected, actual);
    }

    public void testSetUserId3() {
         PurchaseOutlineDTO dto = new  PurchaseOutlineDTO();
        int expected = -2147483648;
        dto.setUserId(expected);
        int actual = dto.getUserId();
        assertEquals(expected, actual);
    }

    public void testSetUserId4()throws Exception {
         PurchaseOutlineDTO dto = new  PurchaseOutlineDTO();
        try {
        int postalMin = Integer.parseInt("-2147483649");
        dto.setUserId(postalMin);
        } catch (RuntimeException e) {
        assertThat1(e.getMessage(), "For input string: \"-2147483649\"");
        }
    }

    public void testSetUserId5()throws Exception {
         PurchaseOutlineDTO dto = new  PurchaseOutlineDTO();
        try {
        int postalMax = Integer.parseInt("2147483647");
        dto.setUserId(postalMax);
        } catch (RuntimeException e) {
        assertThat1(e.getMessage(), "For input string: \"2147483647\"");
        }
    }
    public void testGetUserName() {
         PurchaseOutlineDTO dto = new  PurchaseOutlineDTO();
        String expected = null;
        dto.setUserName(expected);
        assertEquals(expected, dto.getUserName());
    }

    public void testGetUserName2() {
         PurchaseOutlineDTO dto = new  PurchaseOutlineDTO();
        String expected = "";
        dto.setUserName(expected);
        assertEquals(expected, dto.getUserName());
    }

    public void testGetUserName3() {
         PurchaseOutlineDTO dto = new  PurchaseOutlineDTO();
        String expected = "　";
        dto.setUserName(expected);
        assertEquals(expected, dto.getUserName());
    }

    public void testGetUserName4() {
         PurchaseOutlineDTO dto = new  PurchaseOutlineDTO();
        String expected = " ";
        dto.setUserName(expected);
        assertEquals(expected, dto.getUserName());
    }

    public void testGetUserName5() {
         PurchaseOutlineDTO dto = new  PurchaseOutlineDTO();
        String expected = "abc123";
        dto.setUserName(expected);
        assertEquals(expected, dto.getUserName());
    }

    public void testGetUserName6() {
         PurchaseOutlineDTO dto = new  PurchaseOutlineDTO();
        String expected = "あいう１２３";
        dto.setUserName(expected);
        assertEquals(expected, dto.getUserName());
    }

    public void testGetUserName7() {
         PurchaseOutlineDTO dto = new  PurchaseOutlineDTO();
        String expected = "abc123あいう１２３";
        dto.setUserName(expected);
        assertEquals(expected, dto.getUserName());
    }

    public void testGetUserName8() {
         PurchaseOutlineDTO dto = new  PurchaseOutlineDTO();
        String expected = "abc123あいう１２３漢字";
        dto.setUserName(expected);
        assertEquals(expected, dto.getUserName());
    }


    public void testSetUserName() {
         PurchaseOutlineDTO dto = new  PurchaseOutlineDTO();
        String expected = null;
        dto.setUserName(expected);
        String actual=dto.getUserName();
        assertEquals(expected, actual);
    }

    public void testSetUserName2() {
         PurchaseOutlineDTO dto = new  PurchaseOutlineDTO();
        String expected = "";
        dto.setUserName(expected);
        String actual=dto.getUserName();
        assertEquals(expected, actual);
    }

    public void testSetUserName3() {
         PurchaseOutlineDTO dto = new  PurchaseOutlineDTO();
        String expected = "　";
        dto.setUserName(expected);
        String actual=dto.getUserName();
        assertEquals(expected, actual);
    }

    public void testSetUserName4() {
         PurchaseOutlineDTO dto = new  PurchaseOutlineDTO();
        String expected = " ";
        dto.setUserName(expected);
        String actual=dto.getUserName();
        assertEquals(expected, actual);
    }

    public void testSetUserName5() {
         PurchaseOutlineDTO dto = new  PurchaseOutlineDTO();
        String expected = "abc123";
        dto.setUserName(expected);
        String actual=dto.getUserName();
        assertEquals(expected, actual);
    }

    public void testSetUserName6() {
         PurchaseOutlineDTO dto = new  PurchaseOutlineDTO();
        String expected = "あいう１２３";
        dto.setUserName(expected);
        String actual=dto.getUserName();
        assertEquals(expected, actual);
    }

    public void testSetUserName7() {
         PurchaseOutlineDTO dto = new  PurchaseOutlineDTO();
        String expected = "abc123あいう１２３";
        dto.setUserName(expected);
        String actual=dto.getUserName();
        assertEquals(expected, actual);
    }

    public void testSetUserName8() {
         PurchaseOutlineDTO dto = new  PurchaseOutlineDTO();
        String expected = "abc123あいう１２３漢字";
        dto.setUserName(expected);
        String actual=dto.getUserName();
        assertEquals(expected, actual);
    }

    public void testGetTotalPrice() {
         PurchaseOutlineDTO test = new  PurchaseOutlineDTO();
        float expected = 0f;
        test.setTotalPrice(expected);
        assertEquals(expected, test.getTotalPrice(),0.00000000001f);
    }

    public void testGetTotalPrice2() {
         PurchaseOutlineDTO test = new  PurchaseOutlineDTO();
        float expected =  3.4028235E38f;
        test.setTotalPrice(expected);
        assertEquals(expected, test.getTotalPrice(),0.00000000001f);
    }

    public void testGetTotalPrice3() {
         PurchaseOutlineDTO test = new  PurchaseOutlineDTO();
        float expected = 1.4E-45f;
        test.setTotalPrice(expected);
        assertEquals(expected, test.getTotalPrice(),0.00000000001f);
    }
    public void testGetTotalPrice4() {
         PurchaseOutlineDTO test = new  PurchaseOutlineDTO();
        try {
            float PriceAdultsMin = Integer.parseInt("4.4028235E38f");
            test.setTotalPrice(PriceAdultsMin);
        } catch (RuntimeException e) {
            assertEquals(e.getMessage(), "For input string: \"4.4028235E38f\"");
        }
    }

    public void testGetTotalPrice5() {
         PurchaseOutlineDTO test = new  PurchaseOutlineDTO();
        try {
            float PriceAdultsMin = Integer.parseInt("-4.4028235E38f");
            test.setTotalPrice(PriceAdultsMin);
        } catch (RuntimeException e) {
            assertEquals(e.getMessage(), "For input string: \"-4.4028235E38f\"");
        }
    }

    public void testSetTotalPrice() {
         PurchaseOutlineDTO test = new  PurchaseOutlineDTO();
        float expected = 0f;
        test.setTotalPrice(expected);
        assertEquals(expected, test.getTotalPrice(),0.00000000001f);
    }

    public void testSetTotalPrice2() {
         PurchaseOutlineDTO test = new  PurchaseOutlineDTO();
        float expected =  3.4028235E38f;
        test.setTotalPrice(expected);
        assertEquals(expected, test.getTotalPrice(),0.00000000001f);
    }

    public void testSetTotalPrice3() {
         PurchaseOutlineDTO test = new  PurchaseOutlineDTO();
        float expected = 1.4E-45f;
        test.setTotalPrice(expected);
        assertEquals(expected, test.getTotalPrice(),0.00000000001f);
    }

    public void testSetTotalPrice4() {
         PurchaseOutlineDTO test = new  PurchaseOutlineDTO();
        try {
            float PriceAdultsMin = Integer.parseInt("4.4028235E38f");
            test.setTotalPrice(PriceAdultsMin);

        } catch (RuntimeException e) {
            assertEquals(e.getMessage(), "For input string: \"4.4028235E38f\"");
        }
    }

    public void testSetTotalPrice5() {
         PurchaseOutlineDTO test = new  PurchaseOutlineDTO();
        try {
            float PriceAdultsMin = Integer.parseInt("-4.4028235E38f");
            test.setTotalPrice(PriceAdultsMin);
        } catch (RuntimeException e) {
            assertEquals(e.getMessage(), "For input string: \"-4.4028235E38f\"");
        }
    }
    public void testGetPostal() {
        PurchaseOutlineDTO dto = new PurchaseOutlineDTO();
        String expected = null;
        dto.setPostal(expected);
        assertEquals(expected, dto.getPostal());
    }

    public void testGetPostal2() {
        PurchaseOutlineDTO dto = new PurchaseOutlineDTO();
        String expected = "";
        dto.setPostal(expected);
        assertEquals(expected, dto.getPostal());
    }

    public void testGetPostal3() {
        PurchaseOutlineDTO dto = new PurchaseOutlineDTO();
        String expected = " ";
        dto.setPostal(expected);
        assertEquals(expected, dto.getPostal());
    }

    public void testGetPostal4() {
        PurchaseOutlineDTO dto = new PurchaseOutlineDTO();
        String expected = "　";
        dto.setPostal(expected);
        assertEquals(expected, dto.getPostal());
    }

    public void testGetPostal5() {
        PurchaseOutlineDTO dto = new PurchaseOutlineDTO();
        String expected = "abc123";
        dto.setPostal(expected);
        assertEquals(expected, dto.getPostal());
    }

    public void testGetPostal6() {
        PurchaseOutlineDTO dto = new PurchaseOutlineDTO();
        String expected = "あいう１２３";
        dto.setPostal(expected);
        assertEquals(expected, dto.getPostal());
    }

    public void testGetPostal7() {
        PurchaseOutlineDTO dto = new PurchaseOutlineDTO();
        String expected = "abc123あいう１２３";
        dto.setPostal(expected);
        assertEquals(expected, dto.getPostal());
    }

    public void testGetPostal8() {
        PurchaseOutlineDTO dto = new PurchaseOutlineDTO();
        String expected = "abc123あいう１２３漢字";
        dto.setPostal(expected);
        assertEquals(expected, dto.getPostal());
    }

    public void testSetPostal() {
        PurchaseOutlineDTO dto = new PurchaseOutlineDTO();
        String expected = null;
        dto.setPostal(expected);
        String actual=dto.getPostal();
        assertEquals(expected, actual);
    }

    public void testSetPostal2() {
        PurchaseOutlineDTO dto = new PurchaseOutlineDTO();
        String expected = "";
        dto.setPostal(expected);
        String actual=dto.getPostal();
        assertEquals(expected, actual);
    }

    public void testSetPostal3() {
        PurchaseOutlineDTO dto = new PurchaseOutlineDTO();
        String expected = " ";
        dto.setPostal(expected);
        String actual=dto.getPostal();
        assertEquals(expected, actual);
    }

    public void testSetPostal4() {
        PurchaseOutlineDTO dto = new PurchaseOutlineDTO();
        String expected = "　";
        dto.setPostal(expected);
        String actual=dto.getPostal();
        assertEquals(expected, actual);
    }

    public void testSetPostal5() {
        PurchaseOutlineDTO dto = new PurchaseOutlineDTO();
        String expected = "abc123";
        dto.setPostal(expected);
        String actual=dto.getPostal();
        assertEquals(expected, actual);
    }

    public void testSetPostal6() {
        PurchaseOutlineDTO dto = new PurchaseOutlineDTO();
        String expected = "あいう１２３";
        dto.setPostal(expected);
        String actual=dto.getPostal();
        assertEquals(expected, actual);
    }

    public void testSetPostal7() {
        PurchaseOutlineDTO dto = new PurchaseOutlineDTO();
        String expected = "abc123あいう１２３";
        dto.setPostal(expected);
        String actual=dto.getPostal();
        assertEquals(expected, actual);
    }

    public void testSetPostal8() {
        PurchaseOutlineDTO dto = new PurchaseOutlineDTO();
        String expected = "abc123あいう１２３漢字";
        dto.setPostal(expected);
        String actual=dto.getPostal();
        assertEquals(expected, actual);
    }
    public void testGetAddress() {
        PurchaseOutlineDTO dto = new PurchaseOutlineDTO();
        String expected = null;
        dto.setAddress(expected);
        assertEquals(expected, dto.getAddress());
    }

    public void testGetAddress2() {
        PurchaseOutlineDTO dto = new PurchaseOutlineDTO();
        String expected = "";
        dto.setAddress(expected);
        assertEquals(expected, dto.getAddress());
    }

    public void testGetAddress3() {
        PurchaseOutlineDTO dto = new PurchaseOutlineDTO();
        String expected = " ";
        dto.setAddress(expected);
        assertEquals(expected, dto.getAddress());
    }

    public void testGetAddress4() {
        PurchaseOutlineDTO dto = new PurchaseOutlineDTO();
        String expected = "　";
        dto.setAddress(expected);
        assertEquals(expected, dto.getAddress());
    }

    public void testGetAddress5() {
        PurchaseOutlineDTO dto = new PurchaseOutlineDTO();
        String expected = "abc123";
        dto.setAddress(expected);
        assertEquals(expected, dto.getAddress());
    }

    public void testGetAddress6() {
        PurchaseOutlineDTO dto = new PurchaseOutlineDTO();
        String expected = "あいう１２３";
        dto.setAddress(expected);
        assertEquals(expected, dto.getAddress());
    }

    public void testGetAddress7() {
        PurchaseOutlineDTO dto = new PurchaseOutlineDTO();
        String expected = "abc123あいう１２３";
        dto.setAddress(expected);
        assertEquals(expected, dto.getAddress());
    }

    public void testGetAddress8() {
        PurchaseOutlineDTO dto = new PurchaseOutlineDTO();
        String expected = "abc123あいう１２３漢字";
        dto.setAddress(expected);
        assertEquals(expected, dto.getAddress());
    }

    public void testSetAddress() {
        PurchaseOutlineDTO dto = new PurchaseOutlineDTO();
        String expected = null;
        dto.setAddress(expected);
        String actual=dto.getAddress();
        assertEquals(expected, actual);
    }

    public void testSetAddress2() {
        PurchaseOutlineDTO dto = new PurchaseOutlineDTO();
        String expected = "";
        dto.setAddress(expected);
        String actual=dto.getAddress();
        assertEquals(expected, actual);
    }

    public void testSetAddress3() {
        PurchaseOutlineDTO dto = new PurchaseOutlineDTO();
        String expected = " ";
        dto.setAddress(expected);
        String actual=dto.getAddress();
        assertEquals(expected, actual);
    }

    public void testSetAddress4() {
        PurchaseOutlineDTO dto = new PurchaseOutlineDTO();
        String expected = "　";
        dto.setAddress(expected);
        String actual=dto.getAddress();
        assertEquals(expected, actual);
    }

    public void testSetAddress5() {
        PurchaseOutlineDTO dto = new PurchaseOutlineDTO();
        String expected = "abc123";
        dto.setAddress(expected);
        String actual=dto.getAddress();
        assertEquals(expected, actual);
    }

    public void testSetAddress6() {
        PurchaseOutlineDTO dto = new PurchaseOutlineDTO();
        String expected = "あいう１２３";
        dto.setAddress(expected);
        String actual=dto.getAddress();
        assertEquals(expected, actual);
    }

    public void testSetAddress7() {
        PurchaseOutlineDTO dto = new PurchaseOutlineDTO();
        String expected = "abc123あいう１２３";
        dto.setAddress(expected);
        String actual=dto.getAddress();
        assertEquals(expected, actual);
    }

    public void testSetAddress8() {
        PurchaseOutlineDTO dto = new PurchaseOutlineDTO();
        String expected = "abc123あいう１２３漢字";
        dto.setAddress(expected);
        String actual=dto.getAddress();
        assertEquals(expected, actual);
    }
    public void testIsComplete() {
        PurchaseOutlineDTO test = new PurchaseOutlineDTO();
        boolean expected = true;
        test.setIsComplete(expected);
        boolean actual = test.GetIsComplete();
        assertEquals(expected, actual);
    }

    public void testIsComplete2() {
        PurchaseOutlineDTO test = new PurchaseOutlineDTO();
        boolean expected = false;
        test.setIsComplete(expected);
        boolean actual = test.GetIsComplete();
        assertEquals(expected, actual);
    }

    public void testSetIsComplete() {
        PurchaseOutlineDTO test = new PurchaseOutlineDTO();
        boolean expected = true;
        test.setIsComplete(expected);
        boolean actual = test.GetIsComplete();
        assertEquals(expected, actual);
    }

    public void testSetIsComplete2() {
        PurchaseOutlineDTO test = new PurchaseOutlineDTO();
        boolean expected = false;
        test.setIsComplete(expected);
        boolean actual = test.GetIsComplete();
        assertEquals(expected, actual);
    }
}
