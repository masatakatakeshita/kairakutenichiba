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
<fmt:setBundle
	basename="com.internousdev.kairakutenichiba.property.login" var="lang" />

<meta charset="utf-8">

<!-- Stylesheet -->

<link rel="stylesheet" type="text/css" href="CSS/login.css">

<title><s:text name="lang.login.title" /></title>


<!-- Javascripts -->
<script type="text/javascript" src="js/jquery-3.2.1.min.js"></script>


</head>

<body>
	<header>
		<s:include value="header.jsp" />
	</header>

	<div id="login">
		<s:form action="LoginAction" method="post" name="login">

			<h1 id="logincenter">
				<s:text name="lang.login.logintitle" />
			</h1>


			<!-- E-mail: -->
				<s:textfield name="email" size="20" id="email"
					label="%{getText('lang.login.mail')}" />


			<!--password:  -->
				<s:password name="password" size="20" id="passwd"
					label="%{getText('lang.login.password')}" />

			<br>

			<p id="logincenter">
				<s:submit value="%{getText('lang.login.login')}" class="loginbutton" />
			</p>

		</s:form>
	</div>


</body>
</html>