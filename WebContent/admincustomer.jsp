<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
    <!-- ここから国際化 -->
    <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <!-- ここまで国際化 -->

<!DOCTYPE html>
<html>

<head>
<!-- 国際化 ロケールID取得 -->
<fmt:setLocale value="${pageContext.request.locale.language}" />
<!-- 国際化 propertyファイルの場所の定義 -->
<fmt:setBundle basename="com.internousdev.kairakutenichiba.property.admincustomer" var="lang" />

<meta charset="utf-8">
<!-- 顧客情報 -->
<title><s:text name="com.lang.admincustomer.topTitle"/></title>
<link rel="stylesheet" type="text/css" href="CSS/admincustomer.css">

</head>

<body>
	<header>
		<s:include value="adminheader.jsp" />
	</header>
	<br>
	<br>
	<br>
	<br>
	<br>


	<h1>
		<s:text name="lang.admincustomer.topTitle"/>
	</h1>
	<hr>


	<s:form action = "AdminUserAction">
		<s:textfield name="userId" size="50" placeholder="userId" type ="number" min="0" max="100000"/>
		<s:submit value="Search"></s:submit>
	</s:form>
<br>

	<table>
		<tr>
			<!-- ID -->
			<td><s:text name="lang.admincustomer.id"/></td>
			<!-- 氏名 -->
			<td><s:text name="lang.admincustomer.userName"/></td>
			<!-- 性別 -->
			<td><s:text name="lang.admincustomer.Sex"/></td>
			<!-- 生年月日 -->
			<td><s:text name="lang.admincustomer.update"/></td>
			<!-- パスワード -->
			<td><s:text name="lang.admincustomer.password"/></td>
			<!-- メールアドレス -->
			<td><s:text name="lang.admincustomer.email"/></td>
			<!-- 電話番号 -->
			<td><s:text name="lang.admincustomer.PhoneNumber"/></td>
			<!-- 郵便番号-->
			<td><s:text name="lang.admincustomer.postal"/></td>
			<!-- 住所 -->
			<td><s:text name="lang.admincustomer.streetaddress"/></td>
			<!-- 登録日 -->
			<td><s:text name="lang.admincustomer.dt"/></td>
		</tr>

		<tr>
<!-- itemListはDAOで定義された配列オブジェクト -->
			<s:iterator value = "itemList">
<!-- s:property は変数内のvalue(値のこと)をgetするタグ -->
				<td><s:property value="userId" /></td>
				<td><s:property value="familyName" /></td>
				<td><s:property value="sex" /></td>
				<td><s:property value="birthday" /></td>
				<td><s:property value="password" /></td>
				<td><s:property value="phoneNumber" /></td>
				<td><s:property value="phoneEmail" /></td>
				<td><s:property value="postal" /></td>
				<td><s:property value="address" /></td>
				<td><s:property value="registerDay" /></td>
			</s:iterator>
		</tr>
	</table>

</body>
</html>
