<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="CSS/touroku_enju.css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登録情報</title>
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




<form method="post" ACTION="kakunin_enju.jsp">

<div class="main">

<h1>登録情報</h1>

<table>


<tr>
	<th>以下のフォームにご入力の上、「入力内容の確認画面へ」ボタンをクリックしてください。</th>
	</tr>

<tr>
	<th class="attention"><img src="img/required1.gif" alt="必須" width="26" height="12"> マークの項目は入力必須となります。</tr>
</table>


<table class="border">





<tr>
	<th><label for="name">氏名 </label></th>
	<td class="required"><img src="img/required1.gif" alt="必須" width="26" height="12"></td>
	<td><input type="text" name="name" id="name" size="50"><br>
	<span class="supplement">例） 山田太郎</span></td>
</tr>

<tr>
	<th><label for="name2">氏名 <span class="supplement">（フリガナ）</span></label></th>
	<td class="required"><img src="img/required1.gif" alt="必須" width="26" height="12"></td>
	<td><input type="text" name="name2" id="name2" size="50"><br>
	<span class="supplement">例） ヤマダタロウ</span></td>
</tr>


<tr>
	<th><label for="email">メールアドレス</label></th>
	<td class="required"><img src="img/required1.gif" alt="必須" width="26" height="12"></td>
	<td><input type="text" name="email" id="email" size="50"> <span class="supplement">（半角英数字）</span><br>
	<span class="supplement">ご入力間違いのないようにご注意ください</span></td>
</tr>
<tr>
	<th><label for="tel1">電話番号</label></th>
	<td class="arbitrary"></td>
	<td><input type="text" name="tel1" id="tel1" size="12"> - <input type="text" name="tel2" id="tel2" size="12"> - <input type="text" name="tel3" id="tel3" size="12"> <span class="supplement">（半角数字）</span></td>
</tr>

<tr>
	<th rowspan="3"><label for="zip1">ご住所</label></th>
	<td class="arbitrary"></td>
	<td><label for="zip1">郵便番号</label> <input type="text" name="zip1" id="zip1" size="12"> - <input type="text" name="zip2" id="zip2" size="12"> <span class="supplement">（半角数字）</span></td>
</tr>
<tr>
	<td class="required"><img src="img/required1.gif" alt="必須" width="26" height="12"></td>
	<td><select name="prefecture" id="prefecture">
<option value="">都道府県の選択</option>
<option value="北海道">北海道</option>
<option value="青森県">青森県</option>
<option value="岩手県">岩手県</option>
<option value="宮城県">宮城県</option>
<option value="秋田県">秋田県</option>
<option value="山形県">山形県</option>
<option value="福島県">福島県</option>
<option value="東京都">東京都</option>
<option value="神奈川県">神奈川県</option>
<option value="埼玉県">埼玉県</option>
<option value="千葉県">千葉県</option>
<option value="茨城県">茨城県</option>
<option value="栃木県">栃木県</option>
<option value="群馬県">群馬県</option>
<option value="山梨県">山梨県</option>
<option value="新潟県">新潟県</option>
<option value="長野県">長野県</option>
<option value="富山県">富山県</option>
<option value="石川県">石川県</option>
<option value="福井県">福井県</option>
<option value="愛知県">愛知県</option>
<option value="岐阜県">岐阜県</option>
<option value="静岡県">静岡県</option>
<option value="三重県">三重県</option>
<option value="大阪府">大阪府</option>
<option value="兵庫県">兵庫県</option>
<option value="京都府">京都府</option>
<option value="滋賀県">滋賀県</option>
<option value="奈良県">奈良県</option>
<option value="和歌山県">和歌山県</option>
<option value="鳥取県">鳥取県</option>
<option value="島根県">島根県</option>
<option value="岡山県">岡山県</option>
<option value="広島県">広島県</option>
<option value="山口県">山口県</option>
<option value="徳島県">徳島県</option>
<option value="香川県">香川県</option>
<option value="愛媛県">愛媛県</option>
<option value="高知県">高知県</option>
<option value="福岡県">福岡県</option>
<option value="佐賀県">佐賀県</option>
<option value="長崎県">長崎県</option>
<option value="熊本県">熊本県</option>
<option value="大分県">大分県</option>
<option value="宮崎県">宮崎県</option>
<option value="鹿児島県">鹿児島県</option>
<option value="沖縄県">沖縄県</option>
<option value="その他">その他</option>
</select></td>
</tr>
<tr>
	<td class="arbitrary"></td>
	<td><input type="text" name="address" id="address" size="50"><br>
	<span class="supplement">例） 千代田区大手町1-2-3 ○○ビル10F</span></td>
</tr>


</table>





<div class="btn">
<button type="submit"style="height:35">確認画面へ</button>
<input type="hidden" name="Confirm_Page" value="kakunin_enju.jsp">
</div>
<div class="btn">
<input type="button" value="閉じる" onClick="javascript:window.close();">
</div>
</div>



</form>

</body>
</html>