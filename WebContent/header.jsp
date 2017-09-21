<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib prefix="s" uri="/struts-tags" %>
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
<fmt:setBundle basename="com.internousdev.kairakutenichiba.property.header" var="lang" />

<meta charset="utf-8">

<link rel="stylesheet" type="text/css" href="CSS/header.css">

<!--header  -->
<title><s:text name="lang.header.title" /></title>
</head>
<body>
	<header><!-- ログイン状態 -->
	<s:if test="#session.userId != null">
		<!-- トップページ -->
		<a href="index.jsp"><img class="logo" src="img/logo.jpg"></a>
		<!--　ログアウト logout.actionを必須 -->
		<a href="<s:url action="LogoutAction"/>" class="header_btn"><s:text name="lang.header.logout" /></a>
		<!-- マイページ -->
		<a href="mypage_enju.jsp" class="header_btn"><s:text name="lang.header.mypage" /></a>
		<!-- カート -->
		<a href="<s:url action="GoCartAction"/>" class="header_btn"><s:text name="lang.header.cart" /></a>
		<!-- ヘルプ -->
		<a href="help_togashi.jsp" class="header_btn"><s:text name="lang.header.help" /></a>
	</s:if>
	
	<s:else><!-- 非ログイン状態 -->
		<!-- トップページ -->
		<a href="index.jsp"><img class="logo" src="img/logo.jpg"></a>
		<!--ログイン  -->
		<a href="<s:url action="LoginAction"/>" class="header_btn"><s:text name="lang.header.login" /></a>
		<!-- ヘルプ -->
		<a href="help_togashi.jsp" class="header_btn"><s:text name="lang.header.help" /></a>
	</s:else>
	</header>
	
	
<!--
汎用例 
	<header>
		<a href="index.jsp"><img class="logo" src="img/logo.jpg"></a>
		<!--ログイン  -->
		<a href="login_kato.jsp" class="header_btn"><s:text name="lang.header.login" /></a>
		<!-- マイページ -->
		<a href="mypage_enju.jsp" class="header_btn"><s:text name="lang.header.mypage" /></a>
		<!-- カート -->
		<a href="cart_jo.jsp" class="header_btn"><s:text name="lang.header.cart" /></a>
		<!-- ヘルプ -->
		<a href="help_togashi.jsp" class="header_btn"><s:text name="lang.header.help" /></a>
	</header>
 -->

</body>
</html>