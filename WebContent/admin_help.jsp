<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="utf-8">
<title>ヘルプ・お問い合わせ管理者</title>

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

	<h1>管理者・問い合わせ</h1>
	<p>

		検索したいキーワードを入力してください。 <br> <input type="text" name="検索" size="30"
			placeholder="キーワードを入力"> <input type="submit" value="検索">
	<p>お問い合わせ一覧
	<table border="1" cellspacing="0">

		<tr>
			<th>氏名</th>
			<th>メールアドレス</th>
			<th>種類</th>
			<th>内容</th>
		</tr>
		<tr>
			<td>山田(仮)</td>
			<td>sample@gmail.com</td>
			<td>アカウントについて</td>
			<td>ログインできなくなってしまった<a href="admin_helpdetail.jsp">(詳細)</a></td>
		</tr>
		<tr>
			<td>山田</td>
			<td>sample2@gmail.com</td>
			<td>注文内容について</td>
			<td>カートに入れた商品がなくなった<a href="admin_helpdetail.jsp">(詳細)</a></td>
		</tr>
	</table>





</body>
</html>