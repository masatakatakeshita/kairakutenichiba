<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>

<head>
<fmt:setBundle basename="com.internousdev.kairakutenichiba.property.admin_item" var="lang" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title><s:text name="lang.admin_item.title" /></title>
</head>


<body>
	<header>
		<s:include value="admin_header.jsp" />
	</header>
	<br>
	<br>
	<br>
	<br>
	<br>



	<h1><s:text name="lang.admin_item.title" /></h1>
	<br>

	<!-- ITEMID検索 -->
    <s:form action="AdminHistoryAction">
		<input type="number" name="itemId" size="50" placeholder="ITEM ID" min="0" max="1000000">
		<input type="submit" value="検索/Search">
	</s:form>
	
	
	<!-- 商品名を入力 -->
      <p><s:text name="lang.admin_item.order" /></p>
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
	<s:form action="GoAdminAddAction">
		<s:submit value="%{getText('lang.admin_item.add')}" name="submit" />
	</s:form>


	<!-- 商品一覧 -->
	<h2><s:text name="lang.admin_item.h2" /></h2>
 	<hr>
 	
	<table border="1">
        <tr>
			<!-- 商品ID -->
            <th><s:text name="lang.admin_item.id" /></th>
			<!-- 商品名 -->
            <th><s:text name="lang.admin_item.name" /></th>
			<!-- 単価 -->
           <th><s:text name="lang.admin_item.price" /></th>
			<!-- 在庫数 -->
            <th><s:text name="lang.admin_item.stocks" /></th>
			<!-- 売り上げ数 -->
            <th><s:text name="lang.admin_item.sales" /></th>
			<!-- カテゴリー -->
            <th><s:text name="lang.admin_item.cate" /></th>
			<!-- 登録日 -->
            <th><s:text name="lang.admin_item.regday" /></th>
			<!-- 更新日 -->
            <th><s:text name="lang.admin_item.updday" /></th>
			<!-- デリートキー -->
            <th><s:text name="lang.admin_item.delkey" /></th>
			<!-- 商品画像 -->
            <th><s:text name="lang.admin_item.img" /></th>
            <td rowspan="4">
            	<!-- 更新 -->
                 <s:form action="GoAdminUpdateAction">
                     <s:hidden name="itemsName"></s:hidden>
                     <s:submit value="%{getText('lang.admin_item.upd')}" name="submit"/>
                 </s:form>
                 <!-- 削除 -->
                 <s:form action="GoAdminDeleteAction">
                     <s:hidden name="itemsName"></s:hidden>
                     <s:submit value="%{getText('lang.admin_item.del')}" name="submit"/>
                 </s:form>
            </td>
        </tr>
        
        <!-- itemListはDAOで定義された配列オブジェクト -->
		<s:iterator value = "itemList">	
			<tr>
            	<td><s:property value="itemId" /></td>
            	<td><s:property value="itemsName" /></td>
				<td><fmt:formatNumber value="${price}" pattern="###,###,###"/></td>
				<td><s:property value="stocks" /></td>
				<td><s:property value="sales" /></td>
				<td><s:property value="sortId" />：<s:property value="itemGenre" /></td>
				<td><s:property value="createdAt" /></td>
				<td><s:property value="updatedAt" /></td>
				<td><s:property value="delKey" /></td>
				<td><img src="<s:property value="imgPath"/>" width="50" height="50">
					<s:property value="imgPath"/></td>
			</tr>
		</s:iterator>
        
	</table>
	
	
        
 <!--   
		<tr>
			<td>少年誌</td>
			<td>ONE PIECE巻1</td>
			<td>100</td>
			<td>500円</td>
			<td><img class="imagea" src="img/1.jpg" width="300" height="400"></td>
			<td>ゴム人間。海賊</td>

		</tr>
		<tr>
			<td>少年誌</td>
			<td>ONE PIECE巻2</td>
			<td>100</td>
			<td>500円</td>
			<td><img class="imagea" src="img/2.jpg" width="300" height="400"></td>
			<td>ゴム人間。海賊</td>

		</tr>
	<br>
	<br>
	<br>
	<br>
	<br>

	<p>
		<a href="detail_yamaguchi.jsp">商品情報を追加する</a>
	</p>

	<p>
		<a href="detail_yamaguchi.jsp">商品情報を編集する</a>
	</p>

	<p>
		<a href="detail_yamaguchi.jsp">商品情報を削除する</a>
	</p>

	<p>
		<a href="detail_yamaguchi.jsp">商品詳細</a>
	</p>
-->   


</body>
</html>