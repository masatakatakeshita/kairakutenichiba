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

<link rel="stylesheet" type="text/css" href="CSS/detail_yamaguchi.css">


<title>商品詳細</title>
</head>
<body>
	<header>
		<s:include value="header.jsp" />
	</header>

<!-- アクション -->
    <s:action name="GoItemDetailAction" />
 <div class="relative">

<img class="center" src=<s:property value="imgPath" /> alt=""class="absolute" />
</div>

<div class="navi">
<div class="navibox"><h1><s:property value="item_name" /></h1></div>
<div class="navibox"><p><s:property value="author" /></p></div>
<div class="navibox"><p><s:property value="publisher" /></p></div>
</div>
<div class = "clear"></div>


<div class="cart">
<h1>価格</h1>
<div class="price"><p><s:property value="price" /></p></div>

<s:form action = "AddToCartAction">
 <s:submit value="商品をカートに追加"/>
</s:form>

</div>

<div class = "clear"></div>

<div class="info">
<h1>商品基本情報</h1>
<p>発売日　　：<s:property value="release_day" /></p>
<p>著者　　　：<s:property value="author" /></p>
<p>出版社　　：<s:property value="publisher" /></p>
<p>発行形態　：<s:property value="publish_type" /></p>
<p>ページ数　：<s:property value="pages" /></p>
<p>ISBNコード：<s:property value="isbn" /></p>
</div>







</body>
</html>