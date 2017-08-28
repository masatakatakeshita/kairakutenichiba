<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<link rel="stylesheet" type="text/css" href="CSS/detail_yamaguchi.css">
<link rel="stylesheet" type="text/css" href="CSS/header.css">

<title>商品詳細</title>
</head>
<body>
<header>
 <a href="index.jsp"><img class="logo" src="img/logo.jpg"></a>

　　　
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


    　　　<a href="login_kato.jsp" class="header_btn">ログイン</a>



    　　　<a href="mypage_enju.jsp" class="header_btn">マイページ</a>



    　　　<a href="cart_jo.jsp" class="header_btn">カート</a>

    　　　<a href="help_togashi.jsp" class="header_btn">ヘルプ</a>

</header>
<footer>
Copyright(C) 2017 快楽店市場. All Rights Reserved.
 </footer>

 <div class="aaa">
<img class="photo" src="img/haikei2.jpg">
<div class="navi">
<div class="navibox"><h1>本の名前</h1></div>
<div class="navibox"><p><a href="category_shojidairi.jsp">作者名</a></p>
</div>
<div class="navibox"><p><a href="category_shojidairi.jsp">出版社名</a></p></div>


<div class="navibox1"><p><a href="cart_jo.jsp">カートに入れる</a></p>
</div>
<div class="clear"></div>>
<div class="navibox2"><p><a href="index.jsp">トップページへ戻る</a></p></div>



（同じカテゴリの本何冊か表示できるといいかも）
<p>（本の画像）</p>

</div>
</div>
</body>
</html>