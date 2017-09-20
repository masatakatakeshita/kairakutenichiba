<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>

<head>
　　<!-- 国際化 propertyファイルの場所の定義 -->
<fmt:setBundle basename="com.internousdev.kairakutenichiba.property.adminhistory" var="lang" />

<meta charset="utf-8">


<link rel="stylesheet" type="text/css" href="CSS/admin_history_kato.css">

<!-- 管理者販売履歴 -->
<title><s:text name="lang.adminhistory.toptitle" /></title>
<meta http-equiv="Content-Style-Type" content="text/css">
<meta http-equiv="Content-Script-Type" content="text/javascript">


</head>

<body>
	<header>
		<s:include value="adminheader.jsp" />
	</header>
	<br>
	<br>
	<br>
	<br>
	<br>


	<div class="container">

		<h1> <s:text name="lang.adminhistory.title" /></h1>
		
    <s:form action="AdminHistoryAction">
		<input type="number" name="itemId" size="50" placeholder="ITEM ID" min="0" max="100000">
		<input type="submit" value="検索/Search">
	</s:form>

		<table>
			<tr align="center">

				<!-- （荘司）table表示項目
				<th><s:text name="lang.admin_history.itemid" />販売日</th>
				<th>ユーザID</th>
				<th>商品ID</th>
				<th>商品名</th>
				<th>個数</th>
				<th>価格</th>
				 -->
				 
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
				<td>○月○日</td>
				<td>01</td>
				<td>001</td>
				<td>○ンピース1巻</td>
				<td>1</td>
				<td>500円</td>
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
            <td><s:property value="createdAt" /></td>
 			</s:iterator>
		</tr>


		</table>

	</div>


</body>

</html>