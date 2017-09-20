<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>

<head>
<fmt:setBundle basename="com.internousdev.kairakutenichiba.property.admin_top" var="lang" />
<meta charset="utf-8">






<title>><s:text name="lang.admin_top.title" /></title>
</head>
<body>

 <header><s:include value="admin_header.jsp" /></header>



	<div class="header">
		<div class="header-logo">
			<h1><s:text name="lang.admin_top.h1" /></h1>
		</div>
		<div class="message">
			<h2><s:text name="lang.admin_top.title" /></h2>
		</div>



		<div class="menulist">

			<ul>
				<!-- 顧客情報 -->
				<li><a href="admin_customer.jsp"><s:text name="lang.admin_top.user" /></a></li>
				<!-- 販売履歴 -->
				<li><a href="admin_history_kato.jsp"><s:text name="lang.admin_top.log" /></a></li>
				<!--  商品管理-->
				<li><a href="admin_item_yama.jsp"><s:text name="lang.admin_top.item" /></a></li>
				<!--  お問い合わせ-->
				<li><a href="admin_help.jsp"><s:text name="lang.admin_top.contact" /></a></li>
				<!--  Log out-->
				<li><a href="logout_kato.jsp"><s:text name="lang.admin_top.logout" /></a></li>

			</ul>

		</div>


	</div>
	<!--top  -->
	<a href="index.jsp"><s:text name="lang.admin_top.top" /></a>
	<!-- login -->
	<a href="login_kato.jsp"><s:text name="lang.admin_top.login" /></a>



</body>
</html>