<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
    <!-- ここから国際化 -->
    <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <!-- ここまで国際化 -->

<!DOCTYPE html>
<html>

<head>
<!-- 国際化 ロケールID取得 -->
<fmt:setLocale value="${pageContext.request.locale.language}" />
<!-- 国際化 propertyファイルの場所の定義 -->
<fmt:setBundle basename="com.internousdev.kairakutenichiba.property.payment" var="lang" />

<meta charset="utf-8">
<!--支払い方法確認  -->
<title><s:text name="lang.payment.paymentScreen" /></title>
<link rel="stylesheet" type="text/css" href="CSS/payment_takeshita.css">

</head>

<body>

	<header>
		<s:include value="header.jsp" />
	</header>


<div class="main">
		<!--カード情報の入力  -->
        <h3><s:text name="lang.cardinfo" /></h3>
        <!-- お支払い方法はクレジットカードのみとなります。 -->
        ※<strong><s:text name="lang.attention" /></strong><br/>
        ※半角カナ・全角英数文字は、使用しないでください。<br/>



<div class="shiharai" >
	<table class="nyuuryoku " border="1" >

               <tr>
               <!-- カード会社の選択 　［必須］ -->
           <th><s:text name="lang.payment.cardType" /></th>
           <td><select name="cardselect" id="cardselect">
            <option value="Visa">Visa</option>
            <option value="MasterCard">MasterCard</option>
            <option value="American Express" >American Express</option>
              </select>
           </td>
               </tr>

            <tr>
            <!-- カード番号　［必須］ -->
            <th><s:text name="lang.payment.cardNumber" /><br><s:text name="lang.payment.cardHankaku" /></th>
            <td><input type="text" name="card_no1" maxlength="4" onBlur="singlebyte2(card_no1.value,card_no1)" onkeydown="essentialCcaInquiry()" onkeyup="essentialCcaInquiry()" value="" size="7" class="txtHalf">&nbsp;-&nbsp;<input type="text" name="card_no2" onBlur="singlebyte2(card_no2.value,card_no2)" maxlength="4" onkeydown="essentialCcaInquiry()" onkeyup="essentialCcaInquiry()" value="" size="7" class="txtHalf">&nbsp;-&nbsp;<input type="text" name="card_no3" onBlur="singlebyte2(card_no3.value,card_no3)" maxlength="4" onkeydown="essentialCcaInquiry()" onkeyup="essentialCcaInquiry()" value="" size="7" class="txtHalf">&nbsp;-&nbsp;<input type="text" name="card_no4" onBlur="singlebyte2(card_no4.value,card_no4)" maxlength="4" onkeydown="essentialCcaInquiry()" onkeyup="essentialCcaInquiry()" value="" size="7" class="txtHalf"></td>
            </tr>

            <tr>
            <!-- カード名義(ローマ字)　［必須］ -->
            <th><s:text name="lang.payment.cardHolder" /></th>
            <td><input name="cardname" id="cardname" size="25" maxlength="40" value="" >
            </td>　
            </tr>

            <tr>
            <!-- 有効期限　［必須］ -->
            <th><s:text name="lang.payment.cardDeadline" /></th>
            <td><select name="card_month">
				<option value="">--</option>
				<option value="01" >01</option>
				<option value="02" >02</option>
         		<option value="03" >03</option>
				<option value="04" >04</option>
				<option value="05" >05</option>
				<option value="06" >06</option>
				<option value="07" >07</option>
				<option value="08" >08</option>
				<option value="09" >09</option>
				<option value="10" >10</option>
				<option value="11" >11</option>
				<option value="12" >12</option>
				</select>&nbsp;月/

                <select name="card_year">
				<option value="">--</option>
				<option value="17" >17</option>
				<option value="18" >18</option>
				<option value="19" >19</option>
				<option value="20" >20</option>
				<option value="21" >21</option>
				<option value="22" >22</option>
				<option value="23" >23</option>
				<option value="24" >24</option>
				<option value="25" >25</option>
				<option value="26" >26</option>
				<option value="27" >27</option>
				</select>&nbsp;年</td>
                </tr>

                <tr>
                <th>セキュリティーコード ［必須］</th>
                <td> <input type="password" name="cardsecurity"> </td>
                </tr>

                </table>
                </div>

            <div class="haisousentaku">
            <table class="haisou" border="1" >


  			<h3>配達方法の選択</h3>
            <strong>配送料金・・・宅配便500円(税込)　メール便200円(税込)</strong><br>

              <tr>
            <th>配送方法［必須］</th>
             <td><label><input type="radio" name="haisou"value="宅配便" >宅配便</label>
            <label><input type="radio" name="haisou" value="メール便">メール便</label>
           　</td>
       　    </tr>

            <tr>
            <th>お届け日指定［必須］</th>
            <td><select name="siteibi" id="siteibi">
            <option value="指定なし">指定なし</option>
            <option value="test" >test</option>
            <option value="test" >test</option>
            <option value="test" >test</option>
            <option value="test" >test</option>
            <option value="test" >test</option>
            <option value="test" >test</option>
                </select>
           </td>
                </tr>

             <tr>
            <th>お届け時間指定［必須］</th>
            <td><select name="siteibi" id="siteibi">
            <option value="指定なし">指定なし</option>
            <option value="午前中">午前中</option>
            <option value="12時~14時" >12時~14時</option>
            <option value="14時~16時" >14時~16時</option>
            <option value="16時~18時" >16時~18時</option>
            <option value="18時~20時" >18時~20時</option> <option value="20時~21時" >20時~21時</option>
              </select>
           </td>
                </tr>

            </table>
            </div>



           <p>
           <a href="check_shoji.jsp"><input type="submit" value=内容確認></a>
        　　</p>


    　　　　
    </div>
    </body>
</html>