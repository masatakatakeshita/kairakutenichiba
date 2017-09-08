<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html lang="ja">

<head>
<meta charset="utf-8">
<link rel="stylesheet" type="text/css"  href="CSS/finish.css">

<link rel="stylesheet" type="text/css"  href="CSS/header.css">
<title>購入完了</title>
<meta http-equiv="refresh" content="5;index.jsp">
</head>
<body>
	<header>
		<s:include value="header.jsp" />
	</header>

<h1>お買い上げありがとうございました。</h1>
<h3>※5秒後に自動でトップページに戻ります。</h3>

<h4><a href="index.jsp">今すぐトップページへ戻る</a></h4>
</body>
</html>