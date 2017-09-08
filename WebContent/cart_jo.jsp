<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
    <!-- ここから国際化 -->
    <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <!-- ここまで国際化 -->

<!DOCTYPE html>
<html>

<head>
<!-- 国際化 ロケールID取得 -->
<fmt:setLocale value="${pageContext.request.locale.language}" />
<!-- 国際化 propertyファイルの場所の定義 -->
<fmt:setBundle basename="com.internousdev.kairakutenichiba.property.cart" var="lang" />

<meta charset="utf-8">
<link rel="stylesheet" type="text/css" href="CSS/cart.css">

<title>買い物かご</title>

<script type="text/javascript">
<!--
	function keisan() {

		// 設定開始

		// ワンピース1巻
		var price1 = document.form1.goods1.selectedIndex * 500; // 単価を設定
		document.form1.field1.value = price1; // 小計を表示

		// ワンピース2巻
		var price2 = document.form1.goods2.selectedIndex * 500; // 単価を設定
		document.form1.field2.value = price2; // 小計を表示

		// 合計を計算
		var total = price1 + price2;

		// 設定終了

		document.form1.field_total.value = total; // 合計を表示

	}
// -->
</script>

</head>
<body>
	<header>
		<s:include value="header.jsp" />
	</header>

	<h1>以下の商品が買い物かごにはいっています</h1>
	<form action="#" name="form1">

		<table class="type01">
			<thead>
				<tr>
					<th scope="col">商品名</th>
					<th scope="col">価格</th>
					<th scope="col">数量</th>
					<th scope="col">小計</th>
				</tr>
			</thead>
			<tr>
				<th scope="row">ワンピース 1巻</th>
				<th align="right">500円</th>
				<th><select name="goods1" onChange="keisan()">
						<option>0</option>
						<option>1</option>
						<option>2</option>
						<option>3</option>
						<option>4</option>
						<option>5</option>
				</select></th>
				<th><input type="text" name="field1" size="8" value=""
					style="text-align: right;" /> 円</th>

			</tr>
			<tr>
				<th scope="row">ワンピース 2巻</th>
				<th align="right">500円</th>
				<th><select name="goods2" onChange="keisan()">
						<option>0</option>
						<option>1</option>
						<option>2</option>
						<option>3</option>
						<option>4</option>
						<option>5</option>
				</select></th>
				<th><input type="text" name="field2" size="8" value=""
					style="text-align: right;" /> 円</th>

			</tr>
		</table>

		<table class="type02">
			<tr>
				<th align="right" colspan="3"><strong>合計</strong></th>
				<td><input type="text" name="field_total" size="8" value=""
					style="text-align: right;" /> 円</td></table>




</form>
<span id="submit">

		<input type="submit" onclick="location.href='shiharai_takeshita.jsp'"
		value="購入手続きに進む">

		</span>

		<p>まだ買い物を続ける場合は<a href="index.jsp">こちらへ</a>
	</p>
</body>
</html>