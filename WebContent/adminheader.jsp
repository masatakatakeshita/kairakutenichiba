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
<fmt:setBundle basename="com.internousdev.kairakutenichiba.property.adminheader" var="lang" />

<meta charset="utf-8">

<link rel="stylesheet" type="text/css" href="CSS/adminheader.css">

<title>adminheader</title>
</head>
<body>
	<header>

		<a href="index.jsp"><img class="logo" src="img/logo.jpg"></a>
		<a href="admintop.jsp" class="header_btn"><s:text name="lang.adminheader.btn"/></a>
		<a href="admincustomer.jsp" class="header_btn"><s:text name="lang.adminheader.btn"/></a>
		<a href="adminhistory.jsp" class="header_btn"<s:text name="lang.adminheader.userbtn"/>></a>
		<a href="adminitem.jsp" class="header_btn"><s:text name="lang.adminheader.Itembtn"/></a>
		<a href="adminhelp.jsp" class="header_btn"><s:text name="lang.adminheader.customerbtn"/></a>
		<a href="logout.jsp" class="header_btn"><s:text name="lang.header.logoutbtn"/></a>

	</header>

</body>
</html>