<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html lang="ja">

<head>
<meta charset="utf-8">

<!-- Stylesheet -->

<link rel="stylesheet" type="text/css" href="CSS/login_kato.css">

<title>会員ログイン</title>


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
				<h1 id="logincenter">快楽天会員ログイン</h1>


				<p id="idpass">
					<label for="email">E-mail:</label> <input type="email"
						placeholder="※半角英数字" id="email" class="textbox" size="24">
				</p>



				<p id="idpass">
					<label for="passwd">password:</label> <input type="password"
						placeholder="※半角英数字" id="passwd" class="textbox" size="25">
				</p>
			</div>

			<br>

			<p id="logincenter">
				<input type="submit" value="ログイン" class="loginbutton">

			</p>

		</s:form>
	</div>


</body>
</html>