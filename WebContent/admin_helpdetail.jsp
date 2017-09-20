<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
    <!-- ここから国際化 -->
    <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="utf-8">
<!-- 国際化 ロケールID取得 -->
<fmt:setLocale value="${pageContext.request.locale.language}" />
<!-- 国際化 propertyファイルの場所の定義 -->
<fmt:setBundle basename="com.internousdev.kairakutenichiba.property.adminhelpdetail" var="lang" />

<!-- ヘルプ・お問い合わせ管理者 -->
<title><s:text name="lang.adminhelpdetail.title" /></title>
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
	<!--  管理者・問い合わせ内容詳細-->
	<h2><s:text name="lang.adminhelpdetail.detail" /></h2>
	<p>
	<table border="1" cellspacing="0">
		<tr><!--日時  -->
			<td><s:text name="lang.adminhelpdetail.date" /></td>
			<!-- 種類 -->
			<td><s:text name="lang.adminhelpdetail.category" /></td>
			<!-- 名前 -->
			<td><s:text name="lang.adminhelpdetail.name" /></td>
			<!--  メールアドレス-->
			<td><s:text name="lang.adminhelpdetail.mail" /></td>
		</tr>
		<tr><!-- ex:○月○日 -->
			<td<s:property value="" />></td>
			<!-- ex: アカウントについて-->
			<td><s:property value="" /></td>
			<!-- ex:山田(仮) -->
			<td><s:property value="" /></td>
			<!-- ex:sample@gmail.com -->
			<td><s:property value="" /></td>
		</tr>
	</table>
	<!--詳細内容  -->
	<h2><s:text name="lang.adminhelpdetail.detailcontent" /></h2>
	<textarea name="詳細内容" rows="10" cols="50">
	<!--ex;ログインできなくなってしまったのですが、どうすればいいですか？  -->
<s:property value="" />
</textarea>

	<!-- 返信 -->
	<h2><s:text name="lang.adminhelpdetail.return" /></h2>
	<textarea name="返信" rows="10" cols="50">
	<!-- ex:お問い合わせいただきありがとうございます。 -->
<s:property value="" />
</textarea>
	<p>
		<input type="submit" value="返信">
</body>
</html>