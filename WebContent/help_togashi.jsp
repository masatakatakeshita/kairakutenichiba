<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ヘルプ：お問い合わせ方法</title>


<link rel="stylesheet" type="text/css" href="http://localhost:8080/kairakutenichiba/CSS/help.css">

<link rel="stylesheet" type="text/css"  href="CSS/header.css">

</head>
<body>

<header>

  <a href="index.jsp"><img class="logo" src="img/logo.jpg"></a>
　　　



    　　　<a href="login_kato.jsp" class="header_btn">ログイン</a>



    　　　<a href="mypage_enju.jsp" class="header_btn">マイページ</a>



    　　　<a href="cart_jo.jsp" class="header_btn">カート</a>

    　　　<a href="help_togashi.jsp" class="header_btn">ヘルプ</a>

</header>

<center>

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
<div class="box1"></div>
<div class="box2"></div>
<div class="box3"></div>


<p>
<span>氏名(必須)</span>
<box1>
<input type="text" name="氏名">
</box1>
</p>

<br>
<p>
<span>氏名(カナ)(必須)</span>
<box2>
<input type="text" name="氏名(カナ)">
</box2>
</p>
<br>
<p>
<span>住所(必須)</span>
<box3>
〒<input type="text" name="郵便番号" size="10">
</box3>
<br>
<box4>
<span>　</span>
<input type="text" name="住所" size="30" placeholder="例)東京都千代田区～" >
</box4>
</p>
<br>
<p>
<span>連絡先(必須)</span>
<box5>
<input type="text" name="連絡先">
</box5>
</p>
<br>
<p>
<span>メールアドレス(必須)</span>
<box6>
<input type="text" name="メールアドレス" size="30">
</box6>
<br>
<span>　</span>
<box7>
<input type="text" name="メールアドレス" size="30"  placeholder="確認のため再度入力">
</box7>
</p>
<br>
<p>
<span>お問い合わせ種類(必須)</span>
<box8>
<select name="お問い合わせ種類">
<option value="お問い合わせ種類">アカウントについて</option>
<option value="お問い合わせ種類">お支払い方法について</option>
<option value="お問い合わせ種類">注文内容について</option>
<option value="お問い合わせ種類">その他</option>
</select>
</box8>
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


</center>

</body>
</html>

