<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
<title>toppage</title>

<link rel="stylesheet" type="text/css" href="http://yui.yahooapis.com/3.18.1/build/cssreset/cssreset-min.css">
<link rel="stylesheet" type="text/css" href="CSS/header.css,index.css">
    <!-- indexのcssのディレクトリ入れる 階層ごとに../が必要な場合がある。
    本当にディレクトリまでのパスがあっているか確かめる。-->
</head>



<body>


<header>
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
    </select>
     <a href="category_shojidairi.jsp">
    	<input type="text" name="example" autocomplete="off"><input type="submit" value="検索"></a>


    　　　<a href="login_kato.jsp" class="square_btn">ログイン</a>



    　　　<a href="mypage_enju.jsp" class="square_btn">マイページ</a>



    　　　<a href="cart_jo.jsp" class="square_btn">カート</a>

    　　　<a href="help_togashi.jsp" class="square_btn">ヘルプ</a>
</header>

cart
login
mypage
rireki
help
index(toppage)<br>こいつらがリンクとして関連付けした要素群<br>

・後々Javaで検索窓とDBの関連付けを行う。<br>
・宣伝としていくつかの商品をトップページに表示する場合は<br>
    <a href="detail_yamaguchi.jsp">商品詳細</a>



<footer>
<div class="index">
     <a href="index.jsp">トップページに戻る</a></div>
<div class="help">
     <a href="help_togashi.jsp">ヘルプ</a></div>
</footer>
<!--footerのCSS機能しねぇ-->


</body>
</html>