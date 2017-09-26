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
<fmt:setBundle basename="com.internousdev.kairakutenichiba.property.error" var="lang" />

<meta charset="utf-8">
<link rel="stylesheet" type="text/css"  href="CSS/error.css">

<title><s:text name="lang.error.title" /></title>
</head>
<body>
	<header>
		<s:include value="header.jsp" />
	</header>

<h1><s:text name="lang.error.error" /></h1>
 <h1><font size="7"><s:text name="lang.error.error" /></font><img src="img/original.gif" width="150" height="80" alt="GIFアニメーションです" border="0" align="center" hspace="10" vspace="10"></h1>

<h2><font size="5"><s:text name="lang.error.message" /></font></h2>

<h4><a href="index.jsp"><s:text name="lang.error.toppage" /></a></h4>
<h4><a href="help.jsp"><s:text name="lang.error.help" /></a></h4>
</body>
</html>