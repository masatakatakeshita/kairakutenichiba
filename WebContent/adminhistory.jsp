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
<fmt:setBundle basename="com.internousdev.kairakutenichiba.property.adminhistory" var="lang" />

<meta charset="utf-8">


<link rel="stylesheet" type="text/css" href="CSS/adminhistory.css">

<!-- 管理者販売履歴 -->
<title><s:text name="lang.adminhistory.toptitle" /></title>
<meta http-equiv="Content-Style-Type" content="text/css">
<meta http-equiv="Content-Script-Type" content="text/javascript">


</head>

<body>
	<header>
		<s:include value="adminheader.jsp" />
	</header>

	<div class="container">
		<h1> <s:text name="lang.adminhistory.title" /></h1>

    <s:form action="AdminHistoryAction">
		<input type="number" name="itemId" size="50" placeholder="ITEM ID" min="0" max="100000">
		<input type="submit" value="Search">
	</s:form>

	<table>
		<tr align="center">
			<!--商品ID -->
			<th><s:text name="lang.adminhistory.itemid" /></th>
			 <!--商品名  -->
			<th><s:text name="lang.adminhistory.itemname" /></th>
             <!--価格  -->
            <th><s:text name="lang.adminhistory.price" /></th>
             <!--個数 -->
            <th><s:text name="lang.adminhistory.quantities" /></th>
             <!--合計 -->
            <th><s:text name="lang.adminhistory.subtotal" /></th>
             <!--購入日 -->
            <th><s:text name="lang.adminhistory.purchasedate" /></th>
		</tr>

	<tr>
		<!-- 値の挿入 -->
		<s:iterator value="adminhistoryList">
            <td><s:property value="itemId" /></td>
             <!-- 商品名 -->
            <td><s:property value="itemsName" /></td>
            <!-- 価格 -->
            <td>&yen;<fmt:formatNumber value="${price}" /></td>
            <!-- 個数 -->
            <td><s:property value="quantities" /></td>
            <!-- 合計金額 -->
            <td>&yen;<fmt:formatNumber value="${subtotal}"/></td>
            <!-- 購入日 -->
            <td><s:property value="purchase_at" /></td>
 		</s:iterator>
	</tr>
	</table>
	</div>


</body>
</html>