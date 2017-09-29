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
        <!-- 小計 -->
        <th><s:text name="lang.check.subtotal" /></th>
    </tr>

    <s:iterator value="cartList">
    <tr>
        <td><s:property value="imgPath" /></td>
        <td><s:property value="itemName" /></td>
        <td><s:property value="priceyen" /></td>
        <td><s:property value="quantities" /></td>
        <td><s:property value="subtotal" /></td>
    </tr>
    </s:iterator>
    
    <tr>
    	
        <th><s:text name="" /></th>
        <th><s:text name="" /></th>
        <th><s:text name="" /></th>
        <th><s:text name="lang.check.total" /></th>
        <th><s:property value="amountAll" /></th>
    </tr>
    

</table>
<!--お支払い方法  -->
<h3><s:text name="lang.check.payment" /></h3>
<p><s:property value="creditType" /><s:property value="str" /></p>
<!--配送方法  -->
<h3><s:text name="lang.check.deliver" /></h3>
<p><s:property value="deliverySelect" /></p>
<!--お届け日時 -->
<h3><s:text name="lang.check.time" /></h3>
<p><s:property value="deliveryMonth" /><s:property value="deliveryTime" /></p>

<!-- 注文を確定する -->
<s:form action="PurchaseCompleteAction">
<s:hidden name="str" value="%{str}" />
<s:hidden name="delivery" value="%{deliverySelect}" />
<h4><s:submit value= "注文完了" ></s:submit></h4>
</s:form>

<!-- *購入手続きされません -->
<div class="a"><s:text name="lang.check.notfinish" /></div> <!-- floatの処理のために順番が前後している。 -->
<!-- カートへ戻る -->
<s:form action="GoCartAction">
<div class="b"><s:submit value="カートへ戻る" /> </div> <br>
	<!-- <s:text name="lang.check.backtocart" /> -->
</s:form>
<!-- *購入手続きされません -->
<div class="a"><s:text name="lang.check.notfinish" /></div>
<!-- 支払い方法の選択へ戻る -->
<s:form action="GoSettlementAction">
<div class="b"><s:submit value="商品選択に戻る" /></div>
		<!--<s:text name="backtoselect" /> -->
</s:form>
</div>
</body>
</html>