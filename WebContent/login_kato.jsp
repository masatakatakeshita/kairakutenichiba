<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="ja">

<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css"  href="CSS/header.css">

<title>会員ログイン</title>
<meta http-equiv="Content-Style-Type" content="text/css">
<meta http-equiv="Content-Script-Type" content="text/javascript">


<link rel="stylesheet" type="text/css" href="./CSS/login_kato.css" >
</head>



<body>
<header>

  <a href="index.jsp"><img class="logo" src="img/logo.jpg"></a>

<p>
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
    </p>
</header>
<br>

	<div id="login">
	<form action="https://" method="post" name="login">
	<div id="loginbox">
	<h1 class="logintitle">快楽天会員ログイン</h1>


	<p>
	<span>　　　　ID:</span>
	<input type="text" placeholder="IDを入力してください" class="textbox" size="30">
	</p>



	<p>
	<span>password:</span>
	<input type="password" placeholder="パスワードを入力してください" class="textbox" size="31">
	</p>
	</div>

<br>

	<p>
	<input type="submit" value="ログイン" class="loginbutton">

	</p>

	</form>
	</div>


</body>
</html>