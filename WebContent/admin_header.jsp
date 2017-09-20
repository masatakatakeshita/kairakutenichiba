<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>

<head>
<fmt:setBundle basename="com.internousdev.kairakutenichiba.property.adminheader"
	var="lang" />
<meta charset="utf-8">

<link rel="stylesheet" type="text/css" href="CSS/admin_header.css">

<title>admin_header</title>
</head>
<body>
	<header>

		<a href="index.jsp"><img class="logo" src="img/logo.jpg"></a>
		<a href="admin_top_yama.jsp" class="header_btn"><s:text name="lang.adminheader.btn"/></a>
		<a href="admin_customer.jsp" class="header_btn"><s:text name="lang.adminheader.btn"/></a>
		<a href="admin_history_kato.jsp" class="header_btn"<s:text name="lang.adminheader.userbtn"/>></a>
		<a href="admin_item_yama.jsp" class="header_btn"><s:text name="lang.adminheader.Itembtn"/></a>
		<a href="admin_help.jsp" class="header_btn"><s:text name="lang.adminheader.customerbtn"/></a>
		<a href="logout_kato.jsp" class="header_btn"><s:text name="lang.header.logoutbtn"/></a>

	</header>

</body>
</html>