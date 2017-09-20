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
<fmt:setBundle basename="com.internousdev.kairakutenichiba.property.mypage" var="lang" />

<meta charset="utf-8">

<link rel="stylesheet" type="text/css" href="CSS/mypage_enju.css">
<!-- マイページ-->
<title><s:text name="lang.mypage.title" /></title>
</head>
<body>

	<header>
		<s:include value="header.jsp" />
	</header>

<!-- アクション -->
    <s:action var="select" name="MyPageAction" />

<div class="main">
<!-- マイページ -->
<h1><s:text name="lang.mypage.title" /></h1>

<p>
<!-- 快楽的登録情報参照-->
<a href="http://localhost:8080/kairakutenichiba/account_enju.jsp" target="_blank" class="list"><s:text name="lang.mypage.info" /></a>
</p>

<p>
<!-- 快楽歴史 -->
<a href="http://localhost:8080/kairakutenichiba/history_enju.jsp" target="_blank" class="list"><s:text name="lang.mypage.history" /></a>
</p>
</div>
</body>
</html>