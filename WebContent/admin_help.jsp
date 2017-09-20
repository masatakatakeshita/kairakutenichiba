<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>

<head>
<fmt:setBundle basename="com.internousdev.legmina.property.adminhelp" var="lang" />
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
	<p><!-- 検索したいキーワードを入力してください。 -->
		<s:text name="lang.adminhelp.topTitle" /> 
		<br> <input type="text" name="検索" size="30"
			placeholder="キーワードを入力"> <input type="submit" value="検索">
	<p><!-- お問い合わせ一覧 -->
	<s:text name="lang.adminhelp.helplist" />
	<table border="1" cellspacing="0">

		<tr><!--  氏名-->
			<th><s:text name="lang.adminhelp.name" /></th>
			<!--  メールアドレス-->
			<th><s:text name="lang.adminhelp.mail" /></th>
			<!-- 種類 -->
			<th><s:text name="種類" /></th>
			<!--  内容-->
			<th><s:text name="lang.adminhelp.content" /></th>
		</tr>
		<tr><!-- 山田(仮) -->
			<td><s:text name="" /><s:text name="lang.adminhelp.samplename" /></td>
			<!-- sample@gmail.com -->
			<td><s:text name="" /><s:text name="lang.adminhelp.samplemail" /></td>
			<!-- アカウントについて -->
			<td><s:text name="" /><s:text name="lang.adminhelp.account" /></td>
			<!-- ログインできなくなってしまった -->
			<td><s:text name="" /><s:text name="lang.adminhelp.cannotlogin" /><a href="admin_helpdetail.jsp"><s:text name="lang.adminhelp.detail" /></a></td>
		</tr>
		<tr><!--山田  -->
			<td><s:text name="" /><s:text name="lang.adminhelp.sample" /></td>
			<!-- sample2@gmail.com -->
			<td><s:text name="" /><s:text name="lang.adminhelp.sample" /></td>
			<!-- 注文内容について -->
			<td><s:text name="" /><s:text name="lang.adminhelp.sample" /></td>
			<!--  カートに入れた商品がなくなった-->
			<td><s:text name="" /><s:text name="lang.adminhelp.sample" /><a href="admin_helpdetail.jsp"><s:text name="lang.adminhelp.detail" /><!--(詳細)  --></a></td>
		</tr>
	</table>





</body>
</html>