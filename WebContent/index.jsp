<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
<title>toppage</title>

<link rel="stylesheet" type="text/css" href="http://yui.yahooapis.com/3.18.1/build/cssreset/cssreset-min.css">
<link rel="stylesheet" type="text/css" href="CSS/index.css">
    <!-- indexのcssのディレクトリ入れる-->
</head>



<body>
<header background="de281b48e7ff7179dd118b9b260aadac.jpg">
    <h2>
  <a href="index.jsp">快楽天市場</a>
    </h2>
    <select name="検索窓">
        <option value="">カテゴリー1</option>
        <option value="">カテゴリー2</option>
        <option value="">category3</option>
        <option value="">category3</option>
        <option value="">category3</option>
        <option value="">category3</option>
        <option value="">category3</option>
        <input type ="text" placeholder="あとで検索窓に置換します">
    </select>
        <br>
<span class="box">
    <a href="category_shoujidairi.jsp">カテゴリー</a></span>
<span class="box">
    <a href="login_kato.jsp">ログイン</a></span>
<span class="box">
    <a href="mypage_enju.jsp">マイページ</a></span>
<span class="box">
    <a href="rireki_enju.jsp">履歴</a> </span>
<span class="box">
    <a href="cart_jo.jsp">カート</a></span>
<span class="box">
    <a href="cart_jo.jsp">ヘルプ</a></span>
</header>


cart
login
mypage
rireki
help
index(toppage)<br>こいつらがリンクとして関連付けした要素群<br>

・後々Javaで検索窓とDBの関連付けを行う。<br>
・宣伝としていくつかの商品をトップページに表示する場合は<br>
    <a href="detail_shoujidairi.jsp">商品詳細</a>



<footer>
<div class="index">
     <a href="index.jsp">トップページに戻る</a></div>
<div class="help">
     <a href="help_togashi.jsp">ヘルプ</a></div>
</footer>
<!--footerのCSS機能しねぇ-->


</body>
</html>