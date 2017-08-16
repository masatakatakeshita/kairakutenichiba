<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css"  href="CSS/cart.css">
<title>買い物かご</title>
</head>
<body>
<h1>以下の商品が買い物かごにはいっています</h1>

	<table class="type01">
		<thead>
		<tr>
			<th scope="col">商品名</th>
			<th scope="col">価格</th>
			<th scope="col">数量</th>
			<th scope="col">小計</th>
			</tr>
		</thead>
		<tbody>
		<tr>
			<th scope="row">ワンピース　1巻</th>
			<th scope="row">500円</th>
			<th scope="row">
			<SELECT NAME="cnt">
<OPTION VALUE="1" selected>1</OPTION>
<OPTION VALUE="2">2</OPTION>
<OPTION VALUE="3">3</OPTION>
<OPTION VALUE="4">4</OPTION>
<OPTION VALUE="5">5</OPTION>
				</SELECT>
			</th>
			<th scope="row">500円</th>
			</tr>
				<tr>
			<th scope="row">ワンピース　2巻</th>
			<th scope="row">500円</th>
			<th scope="row">
			<SELECT NAME="cnt">
<OPTION VALUE="1" selected>1</OPTION>
<OPTION VALUE="2">2</OPTION>
<OPTION VALUE="3">3</OPTION>
<OPTION VALUE="4">4</OPTION>
<OPTION VALUE="5">5</OPTION>
				</SELECT>
			</th>
			<th scope="row">500円</th>
			</tr>
		</tbody>

	<table class="type02">
		<tr>
		<th scope="row">商品合計</th>
		<td>1000円</td></tr>
		</table>

	<table class="type03">
		<tr>
		<th scope="row">送料</th>
		<td>500円</td></tr>
		</table>

	<table class="type04">
		<tr>
		<th scope="row">合計</th>
		<td>1000円</td></tr>
		</table>

</table>
	<span style="position;absolute;margin-left:562px">

		<input type="submit"onclick="location.href='shiharai_takeshita.jsp'" value="購入手続きに進む">

		</span>

		<p>
		まだ買い物を続ける場合は<a href="index.jsp">こちらへ</a></p>
</body>
</html>