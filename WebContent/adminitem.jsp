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
<fmt:setBundle basename="com.internousdev.kairakutenichiba.property.adminitem" var="lang" />

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title><s:text name="lang.adminitem.title" /></title>
<link rel="stylesheet" type="text/css" href="CSS/adminitem.css">
</head>


<body>
	<header>
		<s:include value="adminheader.jsp" />
	</header>




	<h1><s:text name="lang.adminitem.title" /></h1>
	<br>

	<!-- ITEMID検索 -->
    <s:form action="AdminHistoryAction">
		<input type="number" name="itemId" size="50" placeholder="ITEM ID" min="0" max="1000000">
		<input type="submit" value="検索/Search">
	</s:form>


	<!-- 商品名を入力 -->
      <p><s:text name="lang.adminitem.order" /></p>
	<!-- 検索 -->
		<s:form action="AdminItemAction">
			<s:textfield name="itemsName" placeholder="ITEM NAME" />
			<s:submit value="%{getText('lang.admin_item.sarch')}" name="submit" />
		</s:form>
	<!-- 全件表示 -->
	<s:form action="AdminItemAction">
		<s:submit value="%{getText('lang.admin_item.all')}" name="submit" />
	</s:form>
<!--
<div align="right" style="padding-right:20%">
 -->
 	<!-- 商品追加 -->
	<s:form action="AdminItemInsertAction">
		<s:submit value="%{getText('lang.admin_item.add')}" name="submit" />
	</s:form>


	<!-- 商品一覧 -->
	<h2><s:text name="lang.adminitem.h2" /></h2>
 	<hr>

	<table border="1">
        <tr>
			<!-- 商品ID -->
            <th><s:text name="lang.adminitem.id" /></th>
			<!-- 商品名 -->
            <th><s:text name="lang.adminitem.name" /></th>
			<!-- 単価 -->
           <th><s:text name="lang.adminitem.price" /></th>
			<!-- 在庫数 -->
            <th><s:text name="lang.adminitem.stocks" /></th>
			<!-- 売り上げ数 -->
            <th><s:text name="lang.adminitem.sales" /></th>
			<!-- カテゴリー -->
            <th><s:text name="lang.adminitem.cate" /></th>
			<!-- 登録日 -->
            <th><s:text name="lang.adminitem.regday" /></th>
			<!-- 更新日 -->
            <th><s:text name="lang.adminitem.updday" /></th>
			<!-- デリートキー -->
            <th><s:text name="lang.adminitem.delkey" /></th>
			<!-- 商品画像 -->
            <th><s:text name="lang.adminitem.img" /></th>
            <td rowspan="4">
            	<!-- 更新 -->
                 <s:form action="AdminItemUpdateAction">
                     <s:hidden name="item_name"></s:hidden>
                     <s:submit value="%{getText('lang.admin_item.upd')}" name="submit"/>
                 </s:form>
                 <!-- 削除 -->
                 <s:form action="AdminItemDeleteAction">
                     <s:hidden name="item_name"></s:hidden>
                     <s:submit value="%{getText('lang.admin_item.del')}" name="submit"/>
                 </s:form>
            </td>
        </tr>

        <!-- itemListはDAOで定義された配列オブジェクト -->
		<s:iterator value = "itemList">
			<tr>
            	<td><s:property value="item_id" /></td>
            	<td><s:property value="item_name" /></td>
				<td><fmt:formatNumber value="${price}" pattern="###,###,###"/></td>
				<td><s:property value="stocks" /></td>
				<td><s:property value="sales" /></td>
				<td><s:property value="category" /></td>
				<td><s:property value="created_at" /></td>
				<td><s:property value="updated_at" /></td>
				<td><s:property value="is_deleted" /></td>
				<td><img src="<s:property value="item_image"/>" width="50" height="50">
					<s:property value="item_image"/></td>
			</tr>
		</s:iterator>

	</table>






</body>
</html>