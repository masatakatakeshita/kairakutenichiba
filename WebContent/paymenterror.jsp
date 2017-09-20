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
<fmt:setBundle basename="com.internousdev.kairakutenichiba.property.paymenterror" var="lang" />

<meta charset="utf-8">
<link rel="stylesheet" type="text/css"  href="CSS/finish.css">

<title><s:text name="lang.paymenterror.title" /></title>
</head>
<body>
	<header>
		<s:include value="header.jsp" />
	</header>

<h1>
<s:if test="whaterror==1">
<s:text name="lang.paymenterror.securitycode" />
</s:if>
<s:if test="whaterror==2">
<s:text name="lang.paymenterror.year" />
</s:if>
<s:if test="whaterror==3">
<s:text name="lang.paymenterror.month" />
</s:if>
<s:if test="whaterror==4">
<s:text name="lang.paymenterror.number" />
</s:if>
<s:if test="whaterror==5">
<s:text name="lang.paymenterror.name" />
</s:if>



</h1>

<h4><a href="index.jsp"><s:text name="lang.paymenterror.payment" /></a></h4>
</body>
</html>