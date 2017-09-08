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


 <div class="relative">
<img class="photo" src="img/kemono1.jpg">
<img class="center" src="img/1.jpg" alt=""class="absolute" />
</div>

<div class="navi">
<div class="navibox"><h1>ONE PIECE 巻一</h1></div>
<div class="navibox"><p>尾田栄一郎</p></div>
<div class="navibox"><p>集英社</p></div>
</div>
<div class = "clear"></div>


<div class="cart">
<h1>価格</h1>
<div class="price"><p>500円(税込)</p></div>
<a href="cart_jo.jsp"><input type="submit"value="カートに商品を追加"></a>

</div>

<div class = "clear"></div>

<div class="info">
<h1>商品基本情報</h1>
<p>発売日　　：1997年12月</p>
<p>著者　　　：尾田栄一郎</p>
<p>出版社　　：集英社</p>
<p>発行形態　：コミック</p>
<p>ページ数　：207P</p>
<p>ISBNコード：9784088725093</p>
</div>







</body>
</html>