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
<fmt:setBundle basename="com.internousdev.kairakutenichiba.property.login" var="lang" />

<meta charset="utf-8">

<!-- Stylesheet -->

<link rel="stylesheet" type="text/css" href="CSS/login_kato.css">

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
			<div id="loginbox">
				<h1 id="logincenter"><s:text name="lang.login.logintitle"/></h1>


				<p id="idpass">
					<!-- E-mail: -->
					<label for="email"><s:text name="lang.login.mail" /></label>
					<input type="email" class="textbox" size="25">
				</p>



				<p id="idpass">
					<!--password:  -->
					<label for="passwd"><s:text name="lang.login.password" /></label>
					<input type="password" class="textbox" size="25">
				</p>
			</div>

			<br>

			<p id="logincenter">
				<input type="submit" value="LOGIN" class="loginbutton">

			</p>

		</s:form>
	</div>


</body>
</html>