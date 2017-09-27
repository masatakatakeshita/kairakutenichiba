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
<fmt:setBundle basename="com.internousdev.kairakutenichiba.property.detail" var="lang" />

<meta charset="utf-8">

<link rel="stylesheet" type="text/css" href="CSS/detail.css">

<!-- 商品詳細 -->
<title><s:text name="lang.detail.title" /></title>
</head>
<body>
	<header>
		<s:include value="header.jsp" />
	</header>


<!-- アクション -->
    <s:action name="GoItemDetailAction" />
    <s:iterator value="displayList">
 <div class="relative">
<img class="center" src="<s:property value="item_image" />"  />

</div>

<div class="navi">
<div class="navibox"><h1><s:property value="item_name" /></h1></div>
<div class="navibox"><p><s:property value="author" /></p></div>
<div class="navibox"><p><s:property value="publisher" /></p></div>
</div>
<div class = "clear"></div>


<div class="cart">
<!--価格 -->
<h1><s:text name="lang.detail.price" /></h1>
<div class="price"><p><s:property value="price" /></p></div>

<div class="button">
<s:form action = "AddToCartAction">
  <s:param name="itemId" ><s:property value="item_id" /></s:param>
  <s:submit value="商品をカートに追加"/>
</s:form>
</div>

</div>

<div class = "clear"></div>

<div class="info">
<!--商品基本情報  -->
<h1><s:text name="lang.detail.baseinfo" /></h1>
<!-- 発売日　　： -->
<p><s:text name="lang.detail.dayonsale" /><s:property value="release_day" /></p>
<!-- 著者　　　： -->
<p><s:text name="lang.detail.author" /><s:property value="author" /></p>
<!-- 出版社　　： -->
<p><s:text name="lang.detail.company" /><s:property value="publisher" /></p>
<!-- 発行形態　： -->
<p><s:text name="lang.detail.waytopublish" /><s:property value="publish_type" /></p>
<!--  ページ数　：-->
<p><s:text name="lang.detail.page" /><s:property value="pages" /></p>
<!-- ISBNコード： -->
<p><s:text name="lang.detail.ISBNcode" /><s:property value="isbn" /></p>
</div>

</s:iterator>






</body>
</html>