<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<header>
</header>

<footer>
</footer>


<h1>商品管理画面</h1>
<br>

<form action="cgi-bin/example.cgi" method="post">
  <p>検索したいキーワードを入力してください。</p>
  <input type="search" name="search" placeholder="キーワードを入力">
  <input type="submit" name="submit" value="検索">
</form>



<p><h2>商品一覧</h2></p>

<table border="1">

<tr>
<td>カテゴリー</td>
<td>商品名</td>
<td>在庫数</td>
<td>価格</td>
<td>商品画像</td>
<td>商品説明</td>
</tr>

<tr>
<td>少年誌</td>
<td>ONE PIECE巻1</td>
<td>100</td>
<td>500円</td>
<td><img class="imagea" src= "img/1.jpg" width="300" height="400"></td>
<td>ゴム人間。海賊</td>

</tr>

<tr>
<td>少年誌</td>
<td>ONE PIECE巻2</td>
<td>100</td>
<td>500円</td>
<td><img class="imagea" src= "img/2.jpg" width="300" height="400"></td>
<td>ゴム人間。海賊</td>

</tr>


</table>

<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>




<a href="detail_yamaguchi.jsp" ><p>商品情報を追加する</p></a>

<a href="detail_yamaguchi.jsp" ><p>商品情報を編集する</p></a>

<a href="detail_yamaguchi.jsp" ><p>商品情報を削除する</p></a>

<a href="detail_yamaguchi.jsp" >商品詳細</a>






</body>
</html>