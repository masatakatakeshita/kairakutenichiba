<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>

<head>
<fmt:setBundle basename="com.internousdev.legmina.property.admin_header"
	var="lang" />
<meta charset="utf-8">

<link rel="stylesheet" type="text/css" href="CSS/admin_header.css">

<title>admin_header</title>
</head>
<body>
	<header>

		<a href="index.jsp"><img class="logo" src="img/logo.jpg"></a>
		<a href="admin_top_yama.jsp" class="header_btn"><s:text name="lang.admin_header_btn"/></a>
		<a href="admin_customer.jsp" class="header_btn"><s:text name="lang.admin_header_btn"/>顧客情報</a>
		<a href="admin_history_kato.jsp" class="header_btn"<s:text name="lang.admin_header_userbtn"/>>販売履歴</a>
		<a href="admin_item_yama.jsp" class="header_btn"><s:text name="lang.admin_header_Itembtn"/>商品管理</a>
		<a href="admin_help.jsp" class="header_btn"><s:text name="lang.admin_header_customerbtn"/>お問い合わせ</a>
		<a href="logout_kato.jsp" class="header_btn"><s:text name="lang.header_logoutbtn"/>ログアウト</a>

	</header>

</body>
</html>