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
<fmt:setBundle basename="com.internousdev.kairakutenichiba.property.history" var="lang" />

<meta charset="utf-8">
<link rel="stylesheet" type="text/css" href="CSS/history_enju.css">
<title>快楽歴史</title>

</head>
<body>

	<header>
		<s:include value="header.jsp" />
	</header>

<div class="main">
<h1>快楽歴史</h1>
<div class="gif"><img src="img/ninsani02.gif"width="50" height="50"></div>
	<p>こちらには過去に貪った快楽が表示されます</p>
	<div class="search">
</div>

<table>
<tr>
	<td><img class="image" src= "img/1.jpg"></td>
	<td><div class="name"><a href="detail_yamaguchi.jsp">ワンピース 1巻</a></div><br>
		<a href="category_shojidairi.jsp">尾田栄一郎</a><br>
		<a href="category_shojidairi.jsp">集英社</a></td>
			<td>500円</td>
</tr>
<tr>
	<td><img class="image" src= "img/2.jpg"></td>
	<td><div class="name"><a href="detail_yamaguchi.jsp">ワンピース 2巻</a></div><br>
		<a href="category_shojidairi.jsp">尾田栄一郎</a><br>
		<a href="category_shojidairi.jsp">集英社</a></td>
			<td>500円</td>
</tr>
<tr>

</tr>
</table>





<Form class="button"><Input type="button" value="閉じる" onClick="javascript:window.close();"></Form>
</div>

</body>
</html>