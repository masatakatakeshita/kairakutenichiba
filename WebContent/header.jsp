<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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

<link rel="stylesheet" type="text/css" href="CSS/header.css">

<title>header</title>
</head>
<body>
	<header>

		<a href="index.jsp"><img class="logo" src="img/logo.jpg"></a>
		<a href="login_kato.jsp" class="header_btn">ログイン</a>
		<a href="mypage_enju.jsp" class="header_btn">マイページ</a>
		<a href="cart_jo.jsp" class="header_btn">カート</a>
		<a href="help_togashi.jsp" class="header_btn">ヘルプ</a>

	</header>

</body>
</html>