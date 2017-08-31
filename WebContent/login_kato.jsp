<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html lang="ja">

<head>
<meta charset=”utf-8”>

<!-- Stylesheet -->
<link rel="stylesheet" type="text/css" href="CSS/header.css">
<link rel="stylesheet" type="text/css" href="CSS/login_kato.css">

<title>会員ログイン</title>
<meta http-equiv="Content-Style-Type" content="text/css">
<meta http-equiv="Content-Script-Type" content="text/javascript">


<!-- Javascripts -->
<script src="js/jquery-3.2.1.min.js"></script>
</head>



<body>
	<header><s:include value="header.jsp" /></header>

	<div id="login">
		<form action="https://" method="post" name="login">
			<div id="loginbox">
				<h1 id = logincenter>快楽天会員ログイン</h1>


				<p id=idpass>
					<span>ID:</span> <input type="text" placeholder="IDを入力してください"
						class="textbox" size="30">
				</p>



				<p id=idpass>
					<span id=idpass>password:</span> <input type="password"
						placeholder="パスワードを入力してください" class="textbox" size="31">
				</p>
			</div>

			<br>

			<p id = logincenter>
				<input type="submit" value="ログイン" class="loginbutton">

			</p>

		</form>
	</div>


</body>
</html>