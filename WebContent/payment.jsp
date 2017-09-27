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
<link rel="stylesheet" type="text/css" href="CSS/payment.css">

<script src="js/jquery-3.2.1.min.js"></script>
<script src="http://ajax.googleapis.com/ajax/libs/jqueryui/1/jquery-ui.min.js"></script>
<script src="http://ajax.googleapis.com/ajax/libs/jqueryui/1/i18n/jquery.ui.datepicker-ja.min.js"></script>
<link rel="stylesheet" href="http://ajax.googleapis.com/ajax/libs/jqueryui/1/themes/redmond/jquery-ui.css" >
<script>
  $(function() {
	  jQuery( '#datepicker' ) . datepicker( {
		  minDate: '1d',
		  maxDate: '+10m',
	   } );

    $("#datepicker").datepicker();
    $("#datepicker").datepicker("option", "showOn", 'both');
  });

  $(function() {
      var now = new Date();
      var year = now.getFullYear();

      for(var i=year;i<=(year+10);i++){
      $("#year").append('<option value="'+i+'">' +i+ '</option>');
        }
        });

</script>


</head>

<body>

	<header>
		<s:include value="header.jsp" />
</header>


<div class="main">
		<!--カード情報の入力  -->
        <h3><s:text name="lang.payment.cardinfo" /></h3>
        <!-- お支払い方法はクレジットカードのみとなります。 -->
        ※<strong> <s:text name="lang.payment.howtopay" /></strong><br/>
        ※<!-- 半角カナ・全角英数文字は、使用しないでください。 -->
        <s:text name="lang.payment.attention" /><br>
        <br/>


<s:form action="PaymentAction">
<div class="shiharai" >
	<table class="nyuuryoku " border="1" >

               <tr>
               <!-- カード会社の選択 　［必須］ -->
           <th><s:text name="lang.payment.cardType" /></th>
           <td><select name="creditType" id="cardselect" required>
            <option value="1">Visa</option>
            <option value="2">MasterCard</option>
            <option value="3">American Express</option>
              </select>
           </td>
               </tr>

            <tr>
            <!-- カード番号　［必須］ -->
            <th><s:text name="lang.payment.cardNumber" /></th>
            <td><input type="text" name="creditNumber" maxlength="4" onBlur="singlebyte2(card_no1.value,card_no1)" onkeydown="essentialCcaInquiry()" onkeyup="essentialCcaInquiry()" value="" size="7" class="txtHalf" required>&nbsp;-&nbsp; <input type="text" name="card_no2" onBlur="singlebyte2(card_no2.value,card_no2)" maxlength="4" onkeydown="essentialCcaInquiry()" onkeyup="essentialCcaInquiry()" value="" size="7" class="txtHalf" required>&nbsp;-&nbsp;<input type="text" name="card_no3" onBlur="singlebyte2(card_no3.value,card_no3)" maxlength="4" onkeydown="essentialCcaInquiry()" onkeyup="essentialCcaInquiry()" value="" size="7" class="txtHalf" required>&nbsp;-&nbsp;<input type="text" name="card_no4" onBlur="singlebyte2(card_no4.value,card_no4)" maxlength="4" onkeydown="essentialCcaInquiry()" onkeyup="essentialCcaInquiry()" value="" size="7" class="txtHalf" required></td>
            </tr>

            <tr>
            <!-- カード名義(ローマ字)　［必須］ -->
            <th><s:text name="lang.payment.cardHolder" /></th>
            <td><input name="nameHolder" id="nameHolder" size="25" maxlength="40" value="" required >
            </td>　
            </tr>

            <tr>
            <!-- 有効期限　［必須］ -->
            <th><s:text name="lang.payment.cardDeadline" /></th>
            <td><select name="expirationMonth" required>
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

                <select id="year" name="expirationYear" required>
				<option value="">--</option>
				</select>&nbsp;年</td>
                </tr>


                <tr>
                <!-- セキュリティーコード ［必須］ -->
                <th><s:text name="lang.payment.security" /></th>
                <td> <input type="password" name="securityCode" maxlength="4" required> </td>
                </tr>

                </table>
                </div>

            <div class="haisousentaku">


			<!-- 配達方法の選択 -->
  			<h3><s:text name="lang.payment.deliverselect" /></h3>
  			<!-- 配送料金・・・宅配便500円(税込)　メール便200円(税込) -->
            <strong><s:text name="lang.payment.delivercost" /></strong>
            <br>

            <table class="haisou" border="1" >

              <tr>
              <!-- 配送方法[必須] -->
            <th><s:text name="lang.payment.deliver" /></th>

            <!-- 宅配便 -->
             <td><label><input type="radio" name="deliverySelect"value="宅配便" checked="checked"><s:text name="lang.payment.bike" /></label>
            <!-- メール便 -->
            <label><input type="radio" name="deliverySelect" value="メール便"><s:text name="lang.payment.mail" /></label>
           　</td>

       　    </tr>


            <tr>
            <!-- お届け日指定［必須］ -->
            <th><s:text name="lang.payment.date" /></th>
            <td> 日付を選択<input type="text" name="deliveryMonth" class="form_text-small" id="datepicker" required>

            </td>
            </tr>


             <tr>
             <!--お届け時間指定［必須］ -->
            <th><s:text name="lang.payment.time" /></th>
            <td><select name="deliveryTime" id="deliveryTime" required>
            <option value="指定なし">指定なし</option>
            <option value="午前中">午前中</option>
            <option value="12時~14時" >12時~14時</option>
            <option value="14時~16時" >14時~16時</option>
            <option value="16時~18時" >16時~18時</option>
            <option value="18時~20時" >18時~20時</option>
            <option value="20時~21時" >20時~21時</option>
              </select>
           </td>
                </tr>

            </table>
            </div>



           <p>
           <a href="check.jsp"><input type="submit" value=内容確認></a>
        　　</p>


</s:form>

    　　　　
    </div>
    </body>
</html>