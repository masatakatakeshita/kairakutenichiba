<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html lang="ja">

<head>
<meta charset="utf-8">
<link rel="stylesheet" type="text/css" href="CSS/account_enju.css">

<title>快楽的登録情報参照</title>

</head>
<body>

 	<header>
		<s:include value="header.jsp" />
	</header>


<div class="main">

<h1>快楽的登録情報参照</h1>

<table class="border">

<tr>
	<th>氏名</th>
</tr>

<tr>
	<th>メールアドレス</th>
</tr>
<tr>
	<th>ご住所</th>
</tr>

</table>

<div class="btn">
<input type="button" value="閉じる" onClick="javascript:window.close();">
</div>
</div>

</body>
</html>