<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html lang="ja">

<head>

<meta charset="utf-8">


<link rel="stylesheet" type="text/css" href="CSS/admin_history_kato.css">

<title>管理者販売履歴</title>
<meta http-equiv="Content-Style-Type" content="text/css">
<meta http-equiv="Content-Script-Type" content="text/javascript">


</head>

<body>
	<header>
		<s:include value="admin_header.jsp" />
	</header>
	<br>
	<br>
	<br>
	<br>
	<br>


	<div class="container">

		<h1>販売履歴</h1>


		<table>

			<tr align="center">


				<!-- table表示項目 -->

				<th>販売日</th>
				<th>ユーザID</th>
				<th>商品ID</th>
				<th>商品名</th>
				<th>個数</th>
				<th>価格</th>


			</tr>


			<tr>

				<td>○月○日</td>
				<td>01</td>
				<td>001</td>
				<td>○ンピース1巻</td>
				<td>1</td>
				<td>500円</td>

			</tr>





		</table>

	</div>


</body>

</html>