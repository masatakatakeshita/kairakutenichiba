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
<fmt:setBundle basename="com.internousdev.kairakutenichiba.property.admintop" var="lang" />

<meta charset="utf-8">

<title>><s:text name="lang.admintop.title" /></title>
</head>
<body>

 <header><s:include value="adminheader.jsp" /></header>



	<div class="header">
		<div class="header-logo">
			<h1><s:text name="lang.admintop.h1" /></h1>
		</div>
		<div class="message">
			<h2><s:text name="lang.admintop.title" /></h2>
		</div>



		<div class="menulist">

			<ul>
				<!-- 顧客情報 -->
				<li><a href="admin_customer.jsp"><s:text name="lang.admintop.user" /></a></li>
				<!-- 販売履歴 -->
				<li><a href="admin_history_kato.jsp"><s:text name="lang.admintop.log" /></a></li>
				<!--  商品管理-->
				<li><a href="admin_item_yama.jsp"><s:text name="lang.admintop.item" /></a></li>
				<!--  お問い合わせ-->
				<li><a href="admin_help.jsp"><s:text name="lang.admintop.contact" /></a></li>
				<!--  Log out-->
				<li><a href="logout_kato.jsp"><s:text name="lang.admintop.logout" /></a></li>

			</ul>

		</div>


	</div>
	<!--top  -->
	<a href="index.jsp"><s:text name="lang.admintop.top" /></a>
	<!-- login -->
	<a href="login_kato.jsp"><s:text name="lang.admintop.login" /></a>



</body>
</html>