<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="ja">

<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>会員ログイン</title>
<meta http-equiv="Content-Style-Type" content="text/css">
<meta http-equiv="Content-Script-Type" content="text/javascript">
<link rel="stylesheet" href="https://.css" type="text/css" media="all">
</head>


<body onLoad="document.login.userid.focus()" bgcolor="#ffffff" text="#000000" link="#0000ff" alink="#ff0000">

<div id="login">
<form method="post" action="https://" name="login" onSubmit="formParts.logoutCheck();return false;">
<input type="hidden" name="__event" value="login">
<input type="hidden" name="service_id" value="top">
<div id="loginInner">


<h1>会員ログイン</h1>
<ul>

<li id="loginId">
<p class="fomName"style="border:1px solid #ffffff;"><em>
<label for="userid">ユーザID</label>
</em><span>&lt;半角英数字&gt;</span></p>
<input name="u" id="userid" type="text" class="textBox" value="" onFocus="this.style.backgroundColor='#ffecf3'" onBlur="this.style.backgroundColor='#FFFFFF'">
</li>

<li id="loginPw">
<p class="fomName" style="border:1px solid #ffffff;"><em>
<label for="passwd">パスワード</label>
</em><span>&lt;半角英数字&gt;</span></p>
<input name="p" id="passwd" type="password" class="textBox" value="" onFocus="this.style.backgroundColor='#ffecf3'" onBlur="this.style.backgroundColor='#FFFFFF'">
</li>

</ul>
<p>
<input type="hidden" name="pp_version" value="20170213">
<input type="submit" value="ログイン" class="loginButton">
</p>
</div>
</form>
</div>

<h2>まだ会員登録されていない方</h2>
<div id="newEntry">
<form method="post" action="https://grp01.id.rakuten.co.jp/rms/nid/registfwd?service_id=top" name="entry">
<input type="hidden" name="__event" value="ID01_001_002">
<input type="hidden" name="service_id" value="top">
<div class="btnChange">
<p><a href="JavaScript:setAction()" id="entryBtn"><span>新規会員登録して<br>
サービスを利用する</span></a></p>
</div>
</form>
</div>

</body>


</html>