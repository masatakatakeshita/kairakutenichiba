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
<fmt:setBundle basename="com.internousdev.kairakutenichiba.property.account" var="lang" />

<meta charset="utf-8">
<link rel="stylesheet" type="text/css" href="CSS/account.css">

<!-- 快楽的登録情報参照 -->
<title><s:text name="lang.mypage.user" /></title>

</head>
<body>

 	<header>
		<s:include value="header.jsp" />
	</header>



<div class="main">
<!--快楽的登録情報参照  -->
<h1><s:text name="lang.mypage.user" /></h1>

<s:iterator value="UserList">
<table class="border">


<tr>
<!--ふりがな  -->
	<th><s:text name="lang.mypage.word" /></th><th><s:property value = "familyNameKana"/></th>
</tr>

<tr><!--氏名  -->
	<th><s:text name="lang.mypage.name" /></th><th><s:property value = "givenNameKanji" /></th>
</tr>


<tr><!--住所  -->
	<th><s:text name="lang.mypage.address" /></th><th><s:property value = "address" /></th>
</tr>


<tr><!--電話番号  -->
	<th><s:text name="lang.mypage.phonenumber" /></th><th><s:property value = "phoneNumber" /></th>
</tr>


<tr><!--メールアドレス  -->
	<th><s:text name="lang.mypage.mail" /></th><th><s:property value = "phoneEmail" /></th>
</tr>


</table>

<div class="btn">
<h4><a href="index.jsp"><s:text name="lang.cartempty.toppage" /></a></h4>
</div>

</s:iterator>
</div>

</body>
</html>