<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>

<head>
<fmt:setBundle basename="com.internousdev.legmina.property.admin_help" var="lang" />
<meta charset="utf-8">
<title><s:text name="lang.admin_contact.topTitle" /></title>

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

	<h1><s:text name="lang.admin_contact.h1title" /></h1>
	<p>
		検索したいキーワードを入力してください。 
		<br> <input type="text" name="検索" size="30"
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