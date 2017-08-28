<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ヘルプ：お問い合わせ</title>
<link rel="stylesheet" type="text/css" href="CSS/helplink.css">

<link rel="stylesheet" type="text/css" href="CSS/header.css">
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
<script>
var send =0;
if (send =1){
	document.write("送信されました。");
}else{
document.write("送信されませんでした。")
}
</script>
</center>
</body>
</html>