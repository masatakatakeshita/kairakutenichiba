<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html lang="ja">

<head>
<meta charset="utf-8">

<link rel="stylesheet" type="text/css" href="CSS/mypage_enju.css">
<title>マイページ</title>
</head>
<body>

	<header>
		<s:include value="header.jsp" />
	</header>

<!-- アクション -->
    <s:action var="select" name="UserAction" />

<div class="main">

<h1>マイページ</h1>

<p>
<a href="http://localhost:8080/kairakutenichiba/account_enju.jsp" target="_blank" class="list">快楽的登録情報参照</a>
</p>

<p>
<a href="http://localhost:8080/kairakutenichiba/history_enju.jsp" target="_blank" class="list">快楽歴史</a>
</p>
</div>
</body>
</html>