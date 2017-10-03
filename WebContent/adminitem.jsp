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
<s:if test="#session.adminflg != 1">
	<meta http-equiv="refresh" content="0; <s:url action="LoginAction"/>">
</s:if>
<script type="text/javascript">
	window.onunload = function() {};
	history.forward();
</script>
<!-- 国際化 ロケールID取得 -->
<fmt:setLocale value="${pageContext.request.locale.language}" />
<!-- 国際化 propertyファイルの場所の定義 -->
<fmt:setBundle
	basename="com.internousdev.kairakutenichiba.property.adminitem"
	var="lang" />

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title><s:text name="lang.adminitem.title" /></title>
<link rel="stylesheet" type="text/css" href="CSS/adminitem.css">
</head>


<body>
	<header>
		<s:include value="adminheader.jsp" />
	</header>




	<h1>
		<s:text name="lang.adminitem.title" />
	</h1>
	<br>





	<!--
<div align="right" style="padding-right:20%">
 -->
	<!-- 商品追加 -->
	<s:form action="AdminItemInsertAction">
	<s:submit value="%{getText('lang.adminitem.add')}" name="submit" />
	</s:form>


	<!-- 商品一覧 -->
	<h2>
		<s:text name="lang.adminitem.h2" />
	</h2>
	<hr>

	<table border="1" class="table">
		<tr>
			<!-- 商品ID -->
			<th><s:text name="lang.adminitem.itemid" /></th>
			<!-- 商品名 -->
			<th><s:text name="lang.adminitem.name" /></th>
			<!-- カテゴリー -->
			<th><s:text name="lang.adminitem.category" /></th>
			<!-- 発売日 -->
			<th><s:text name="lang.adminitem.release" /></th>
			<!-- 著者 -->
			<th><s:text name="lang.adminitem.author" /></th>
			<!-- 出版社 -->
			<th><s:text name="lang.adminitem.publisher" /></th>
			<!-- 出版形態 -->
			<th><s:text name="lang.adminitem.publicationform" /></th>
			<!-- ページ数 -->
			<th><s:text name="lang.adminitem.pages" /></th>
			<!-- ISBNコード -->
			<th><s:text name="lang.adminitem.isbncode" /></th>
			<!-- 単価 -->
			<th><s:text name="lang.adminitem.price" /></th>
			<!-- 商品詳細 -->
			<th><s:text name="lang.adminitem.itemdetails" /></th>
			<!-- 在庫数 -->
			<th><s:text name="lang.adminitem.stocks" /></th>
			<!-- 売り上げ数 -->
			<th><s:text name="lang.adminitem.sales" /></th>
			<!-- 登録日 -->
			<th><s:text name="lang.adminitem.regday" /></th>
			<!-- 更新日 -->
			<th><s:text name="lang.adminitem.updday" /></th>
			<!-- デリートキー -->
			<th><s:text name="lang.adminitem.delkey" /></th>
			<!-- 商品画像 -->
			<th><s:text name="lang.adminitem.img" /></th>
			<td></td>
		</tr>

		<!-- itemListはDAOで定義された配列オブジェクト -->
		<s:iterator value="itemList">
			<tr>
				<td><s:property value="item_id" /></td>
				<td><s:property value="item_name" /></td>
				<td><s:property value="category" /></td>
				<td><s:property value="release_day" /></td>
				<td><s:property value="author" /></td>
				<td><s:property value="publisher" /></td>
				<td><s:property value="publish_type" /></td>
				<td><s:property value="pages" /></td>
				<td><s:property value="isbn" /></td>
				<td><fmt:formatNumber value="${price}" pattern="###,###,###" /></td>
				<td><s:property value="item_detail" /></td>
				<td><s:property value="stocks" /></td>
				<td><s:property value="sales" /></td>
				<td><s:property value="created_at" /></td>
				<td><s:property value="updated_at" /></td>
				<td><s:property value="is_deleted" /></td>
				<td><img src="<s:property value="item_image"/>" width="50"
					height="50"> <s:property value="item_image" /></td>

				<td><s:form action="AdminItemDeleteAction">
					<s:hidden name="item_id" value="%{item_id}" />
						<s:submit value="%{getText('lang.adminitem.del')}" />
					</s:form></td>
			</tr>
		</s:iterator>

		<!-- 更新 -->

			<s:form action="AdminItemUpdateAction"  theme="simple">
				<td><s:textfield name="item_id" class="updbox"/></td>
				<td><s:textfield name="item_name" class="updbox"/></td>
				<td><s:textfield name="category" class="updbox"/></td>
				<td><s:textfield name="release_day" class="updbox"/></td>
				<td><s:textfield name="author" class="updbox"/></td>
				<td><s:textfield name="publisher" class="updbox"/></td>
				<td><s:textfield name="publish_type" class="updbox"/></td>
				<td><s:textfield name="pages" class="updbox"/></td>
				<td><s:textfield name="isbn" class="updbox"/></td>
				<td><s:textfield name="price" class="updbox"/></td>
				<td><s:textfield name="item_detail" class="updbox"/></td>
				<td><s:textfield name="stocks" class="updbox"/></td>
				<td><s:textfield name="sales" class="updbox"/></td>
				<td><s:textfield name="created_at" class="updbox"/></td>
				<td><s:textfield name="updated_at" class="updbox"/></td>
				<td><s:textfield name="is_deleted" class="updbox"/></td>
				<td><s:textfield name="imgPath" class="updbox"/></td>
				<td><s:submit value="%{getText('lang.adminitem.upd')}" /></td>
			</s:form>
		<!-- 新規登録 -->
		<tr>
			<s:form action="AdminItemInsertAction" theme="simple">
				<td><s:textfield name="item_id" class="regbox"/></td>
				<td><s:textfield name="item_name" class="regbox"/></td>
				<td><s:textfield name="category" class="regbox"/></td>
				<td><s:textfield name="release_day" class="regbox"/></td>
				<td><s:textfield name="author" class="regbox"/></td>
				<td><s:textfield name="publisher" class="regbox"/></td>
				<td><s:textfield name="publish_type" class="regbox"/></td>
				<td><s:textfield name="pages" class="regbox"/></td>
				<td><s:textfield name="isbn" class="regbox"/></td>
				<td><s:textfield name="price" class="regbox"/></td>
				<td><s:textfield name="item_detail" class="regbox"/></td>
				<td><s:textfield name="stocks" class="regbox"/></td>
				<td><s:textfield name="sales" class="regbox"/></td>
				<td><s:textfield name="created_at" class="regbox"/></td>
				<td><s:textfield name="updated_at" class="regbox"/></td>
				<td><s:textfield name="is_deleted" class="regbox"/></td>
				<td><s:textfield name="imgPath" class="regbox"/></td>
				<td><s:submit value="%{getText('lang.adminitem.signup')}" /></td>
			</s:form>

		</tr>
	</table>






</body>
</html>