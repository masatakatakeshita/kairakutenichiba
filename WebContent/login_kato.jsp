<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="ja">

<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>会員ログイン</title>
<meta http-equiv="Content-Style-Type" content="text/css">
<meta http-equiv="Content-Script-Type" content="text/javascript">


<link rel="stylesheet" type="text/css" href="./CSS/login_kato.css" >
</head>



<body>

<br>

	<div id="login">
	<form action="https://" method="post" name="login">
	<div id="loginbox">
	<h1 class="logintitle">快楽天会員ログイン</h1>


	<p>
	<span>　　　　ID:</span>
	<input type="text" placeholder="IDを入力してください" class="textbox" size="30">
	</p>



	<p>
	<span>password:</span>
	<input type="password" placeholder="パスワードを入力してください" class="textbox" size="31">
	</p>
	</div>

<br>

	<p>
	<input type="submit" value="ログイン" class="loginbutton">

	</p>

	</form>
	</div>


</body>
</html>