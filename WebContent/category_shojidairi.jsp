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
<fmt:setBundle basename="com.internousdev.kairakutenichiba.property.category" var="lang" />

<meta charset="utf-8">
<link rel="stylesheet" type="text/css"  href="CSS/category.css">


<title>カテゴリ別ページ</title>
</head>
<body>
	<header>
		<s:include value="header.jsp" />
	</header>

<div class="main">
<h3>"ワンピース"の検索結果</h3>
<table border="5" cellspacing="2"  cellpadding="2">
<tr>
<td><img class="imagea" src= "img/1.jpg"></td>
<td><div class="name"><a href="detail_yamaguchi.jsp">ワンピース 1巻</a></div><br><a href="category_shojidairi.jsp">尾田栄一郎</a><br><a href="category_shojidairi.jsp">集英社</a></td><td>500円</td>
</tr>
<tr>
<td><img class="imageb" src= "img/2.jpg"></td>
<td><div class="name"><a href="detail_yamaguchi.jsp">ワンピース 2巻</a></div><br><a href="category_shojidairi.jsp">尾田栄一郎</a><br><a href="category_shojidairi.jsp">集英社</a></td><td>500円</td>
</tr>
<tr>

</tr>
</table>


<h5><a href="index.jsp">トップページへ戻る</a></h5>
</div>

</body>
</html>