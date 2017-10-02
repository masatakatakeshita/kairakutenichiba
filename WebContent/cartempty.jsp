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
<fmt:setBundle basename="com.internousdev.kairakutenichiba.property.cartempty" var="lang" />

<meta charset="utf-8">

<title><s:text name="lang.cartempty.title" /></title>
<link rel="stylesheet" type="text/css" href="CSS/cartempty.css">

<script src="js/jquery-3.2.1.min.js"></script>
<script src="http://ajax.googleapis.com/ajax/libs/jqueryui/1/jquery-ui.min.js"></script>
<script src="http://ajax.googleapis.com/ajax/libs/jqueryui/1/i18n/jquery.ui.datepicker-ja.min.js"></script>


</head>

<body>
	<header>
		<s:include value="header.jsp" />
</header>

<h1><s:text name="lang.cartempty.h1" /></h1>
<h4><a href="index.jsp"><s:text name="lang.cartempty.toppage" /></a></h4>
</body>
</html>