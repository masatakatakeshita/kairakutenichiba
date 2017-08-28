<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css"  href="CSS/cart.css">
<link rel="stylesheet" type="text/css"  href="CSS/header.css">
<title>買い物かご</title>

<script type="text/javascript">
<!--

function keisan(){

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
<th scope="row">ワンピース　1巻</th>
			<th align="right">500円</th>
<th><select name="goods1" onChange="keisan()">
<option>0</option>
<option>1</option>
<option>2</option>
<option>3</option>
<option>4</option>
<option>5</option>
</select></th>
<th><input type="text" name="field1" size="8" valu=""style="text-align:right;"/> 円</th>

	</tr>
<tr>
<th scope="row">ワンピース　2巻</th>
			<th align="right">500円</th>
<th><select name="goods2" onChange="keisan()">
<option>0</option>
<option>1</option>
<option>2</option>
<option>3</option>
<option>4</option>
<option>5</option>
</select></th>
<th><input type="text" name="field2" size="8" valu=""style="text-align:right;"/> 円</th>

	</tr>

<table class="type02">
<th align="right" colspan="3"><strong>合計</strong></th>
	<td><input type="text" name="field_total" size="8" valu=""style="text-align:right;"/> 円</td>



		</table>



</form>
<span style="position;absolute;margin-left:562px">

		<input type="submit"onclick="location.href='shiharai_takeshita.jsp'" value="購入手続きに進む">

		</span>

		<p>
		まだ買い物を続ける場合は<a href="index.jsp">こちらへ</a></p>
</body>
</html>