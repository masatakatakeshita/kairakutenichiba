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
<fmt:setBundle basename="com.internousdev.kairakutenichiba.property.check" var="lang" />

<meta charset="utf-8">
<link rel="stylesheet" type="text/css"  href="CSS/check.css">

<!--購入確認  -->
<title><s:text name="lang.check.title" /></title>
</head>
<body>

	<header>
		<s:include value="header.jsp" />
	</header>
<div class="main">
<!--購入内容の確認  -->
<h1><s:text name="lang.check.check" /></h1>



<table border="1">
    <tr>
    	<!--  -->
        <th><s:text name="" /></th>
        <!--商品名  -->
        <th><s:text name="lang.check.goodsname" /></th>
        <!-- 価格 -->
        <th><s:text name="lang.check.value" /></th>
        <!-- 数量 -->
        <th><s:text name="lang.check.quantitiy" /></th>
    </tr>

    <s:iterator value="">
    <tr>
        <td><s:property value="" /></td>
        <td><s:property value="" /></td>
        <td><s:property value="" /></td>
        <td><s:property value="" /></td>
    </tr>
    </s:iterator>

</table>
<!--お支払い方法  -->
<h3><s:text name="lang.check.payment" /></h3>
<p><!--VISA(ロゴ) カード番号 **** **** **** 1234  -->
<s:text name="lang.check.cardexample" />
</p><!--配送方法  -->
<h3><s:text name="lang.check.deliver" /></h3>
<p><!-- クロネコヤマト -->
<s:text name="lang.check.kuroneko" />
</p><!--お届け先住所 -->
<h3><s:text name="lang.check.address" /></h3>
<p><!--東京都A区B 1-2-3　山田荘101  -->
<s:text name="lang.check.addressex" />
</p>

<!-- 注文を確定する -->
<h4><a href="finish_shoji.jsp"><s:text name="lang.check.decision" /></a></h4>
<!-- *購入手続きされません -->
<div class="a"><s:text name="lang.check.notfinish" /></div> <!-- floatの処理のために順番が前後している。 -->
<!-- カートへ戻る -->
<div class="b"><a href="cart_jo.jsp"><s:text name="lang.check.backtocart" /></a></div> <br>
<!-- *購入手続きされません -->
<div class="a"> <s:text name="" /><s:text name="lang.check.notfinish" /></div>
<!-- 支払い方法の選択へ戻る -->
<div class="b"><a href="shiharai_takeshita.jsp"><s:text name="backtoselect" />支払い方法の選択へ戻る</a></div>

</div>
</body>
</html>