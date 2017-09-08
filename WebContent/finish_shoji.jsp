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
<fmt:setBundle basename="com.internousdev.kairakutenichiba.property.detail" var="lang" />

<meta charset="utf-8">
<link rel="stylesheet" type="text/css"  href="CSS/finish.css">

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