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
<fmt:setBundle basename="com.internousdev.kairakutenichiba.property.check" var="lang" />

<meta charset="utf-8">
<link rel="stylesheet" type="text/css"  href="CSS/check.css">

<title>購入確認</title>
</head>
<body>

	<header>
		<s:include value="header.jsp" />
	</header>
<div class="main">
<h1>購入内容の確認</h1>



<table border="1">
    <tr>
        <th></th>
        <th>商品名</th>
        <th>価格</th>
        <th>数量</th>
    </tr>

    <s:iterator value="">
    <tr>
        <td><s:property value="" /></td>
        <td><s:property value="" /></td>
        <td><s:property value="" /></td>
        <td><s:property value="" /></td>
    </tr>
    </s:iterator>

</table>

<h3>お支払い方法</h3>
<p>
VISA(ロゴ) カード番号 **** **** **** 1234
</p>
<h3>配送方法</h3>
<p>
クロネコヤマト
</p>
<h3>お届け先住所</h3>
<p>
東京都A区B 1-2-3　山田荘101
</p>

<h4><a href="finish_shoji.jsp">注文を確定する。</a></h4>
<div class="a">*購入手続きされません</div> <!-- floatの処理のために順番が前後している。 -->
<div class="b"><a href="cart_jo.jsp">カートへ戻る</a></div> <br>
<div class="a"> *購入手続きされません</div>
<div class="b"><a href="shiharai_takeshita.jsp">支払い方法の選択へ戻る</a></div>

</div>
</body>
</html>