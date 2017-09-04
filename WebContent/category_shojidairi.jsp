<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css"  href="CSS/category.css">

<link rel="stylesheet" type="text/css"  href="CSS/header.css">
<title>カテゴリ別ページ</title>
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

<div class="main">
<h3>"ワンピース"の検索結果</h3>
<table border="5" cellspacing="2"  cellpadding="2">
<tr>
<td><img class="imagea" src= "img/1.jpg"></td>
<td><div class="name"><a href="detail_yamaguchi.jsp">ワンピース 1巻</a></div><br><a href="category_shojidairi.jsp">尾田栄一郎</a><br><a href="category_shojidairi.jsp">集英社</a></td><td>500円</td>
</tr>
<tr>
<td><img class="imageb" src= "img/2.jpg"></td>
<td><div class="name"><a href="detail_yamaguchi.jsp">ワンピース 2巻</a></div><br><a href="category_shojidairi.jsp">尾田栄一郎</a><br><a href="category_shojidairi.jsp">集英社</a></td><td>500円</td>
</tr>
<tr>

</tr>
</table>


<h5><a href="index.jsp">トップページへ戻る</a></h5>
</div>

</body>
</html>