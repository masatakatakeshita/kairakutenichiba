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

<link rel="stylesheet" type="text/css" href="CSS/mypage_enju.css">
<title>マイページ</title>
</head>
<body>

	<header>
		<s:include value="header.jsp" />
	</header>

<!-- アクション -->
    <s:action var="select" name="UserAction" />

<div class="main">

<h1>マイページ</h1>

<p>
<a href="http://localhost:8080/kairakutenichiba/account_enju.jsp" target="_blank" class="list">快楽的登録情報参照</a>
</p>

<p>
<a href="http://localhost:8080/kairakutenichiba/history_enju.jsp" target="_blank" class="list">快楽歴史</a>
</p>
</div>
</body>
</html>