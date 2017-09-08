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
<fmt:setBundle basename="com.internousdev.kairakutenichiba.property.account" var="lang" />

<meta charset="utf-8">
<link rel="stylesheet" type="text/css" href="CSS/account_enju.css">

<title>快楽的登録情報参照</title>

</head>
<body>

 	<header>
		<s:include value="header.jsp" />
	</header>


<div class="main">

<h1>快楽的登録情報参照</h1>

<table class="border">

<tr>
	<th>氏名</th>
</tr>

<tr>
	<th>メールアドレス</th>
</tr>
<tr>
	<th>ご住所</th>
</tr>

</table>

<div class="btn">
<input type="button" value="閉じる" onClick="javascript:window.close();">
</div>
</div>

</body>
</html>