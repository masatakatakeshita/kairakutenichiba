<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css"  href="CSS/check.css">
<title>購入確認</title>
</head>
<body>
<h1>購入内容確認ページ</h1>



<table border="5" cellspacing="2"  cellpadding="2">
<tr>
<td><img class="imagea" src= "img/1.jpg"></td>
<td>ワンピース 1巻</td><td>500円</td>
</tr>
<tr>
<td><img class="imageb" src= "img/2.jpg"></td>
<td>ワンピース 2巻</td><td>500円</td>
</tr>
<tr>
<td></td><td>小計</td><td>1,000円</td>
</tr>
</table>

<h3>お支払い方法</h3>
<p>
VISA(ロゴ) カード番号 **** **** **** 1234
</p>
<h3>配送方法</h3>
<p>
クロネコヤマト
</p>
<p>
お届け先住所　東京都A区B 1-2-3　山田荘101
</p>

<h4><a href="finish_shoji.jsp">確認</a></h4>
<div class="a">*購入手続きされません</div> <!-- floatの処理のために順番が前後している。 -->
<div class="b"><a href="cart_jo.jsp">カートへ戻る</a></div> <br>
<div class="a"> *購入手続きされません</div>
<div class="b"><a href="shiharai_takeshita.jsp">支払い方法の選択へ戻る</a></div>
</body>
</html>