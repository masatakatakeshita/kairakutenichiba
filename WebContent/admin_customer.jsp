<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html lang="ja">

<head>
<meta charset="utf-8">
<title>管理者画面 顧客情報</title>
<link rel="stylesheet" type="text/css" href="CSS/admin_customer.css">

</head>

<body>
	<header>
		<s:include value="admin_header.jsp" />
	</header>
	<br>
	<br>
	<br>
	<br>
	<br>
	<!--
tr table row 行←横に長い長方形。
td table date セル←長方形の内部データ。小さい四角
-->
	<a href="xxx.html">管理者画面トップ</a>
	<a href="xxx.html"></a>
	<a href="xxx.html"></a>
	<a href="xxx.html"></a>
	<a href="xxx.html"></a>
	<h1>管理者画面 顧客情報</h1>
	<p>
		<input type="text" name="検索" maxlength="40" placeholder="検索">
	</p>
	<p>
		<input type="submit" value="検索">
	</p>
	<table>
		<tr>
			<td>ID</td>
			<td>氏名</td>
			<td>氏名かな</td>
			<td>パスワード</td>
			<td>メールアドレス</td>
			<td>住所</td>
			<td>登録日</td>
			<td>更新日</td>
		</tr>
		<tr>
			<td>1</td>
			<td>john</td>
			<td>ジョン</td>
			<td>password</td>
			<td>john@gmail.com</td>
			<td>地球</td>
			<td>0年1月1日</td>
			<td>明日</td>

		</tr>
	</table>

</body>
</html>
