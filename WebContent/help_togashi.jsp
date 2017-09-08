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
<fmt:setBundle basename="com.internousdev.kairakutenichiba.property.help" var="lang" />

<meta charset="utf-8">
<title>ヘルプ：お問い合わせ方法</title>


<link rel="stylesheet" type="text/css" href="http://localhost:8080/kairakutenichiba/CSS/help.css">

<link rel="stylesheet" type="text/css"  href="CSS/header.css">

</head>
<body>

	<header>
		<s:include value="header.jsp" />
	</header>

<div id="center">

<a href=""></a>
<h1>ヘルプ＆カスタマーサービス</h1>
<h2>お問い合わせ方法</h2>
<p>
カスタマーサービスでは24時間お問い合わせを承っております。<br>
以下の手順でお問い合わせいただくと、お客様のアカウント情報<br>
などをすぐに確認できるため、スムーズなご対応が可能です。
</p>




<form action="helplink_togashi.jsp" id="form2">

<div class="boxA">



<p>
<span>氏名(必須)</span>
<a class="box1">
<input type="text" name="氏名">
</a>
</p>

<br>
<p>
<span>住所</span>
<a class ="box3">
〒<input type="text" name="郵便番号" size="10">
</a>
<br>
<a class="box4">
<span>　</span>
<input type="text" name="住所" size="30" placeholder="例)東京都千代田区～" >
</a>
</p>
<br>

<p>
<span>メールアドレス(必須)</span>
<a class="box6">
<input type="text" name="メールアドレス" size="30">
</a>
<br>
<span>　</span>
<a class="box7">
<input type="text" name="メールアドレス" size="30"  placeholder="確認のため再度入力">
</a>
</p>
<br>
<p>
<span>お問い合わせ種類(必須)</span>
<a class="box8">
<select name="お問い合わせ種類">
<option value="お問い合わせ種類">アカウントについて</option>
<option value="お問い合わせ種類">お支払い方法について</option>
<option value="お問い合わせ種類">注文内容について</option>
<option value="お問い合わせ種類">その他</option>
</select>
</a>
</p>
<br>
<p>
<span>お問い合わせ内容(必須)</span>
<textarea name="△" rows="10" cols="50"></textarea>
<br>
</p>
<p>
<input type="submit" value="送信">
</p>

</div>

</form>




<br><br><br>



<br><br><br>


</div>

</body>
</html>

