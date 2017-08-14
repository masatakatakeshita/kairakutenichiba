<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ヘルプ：お問い合わせ方法</title>
</head>
<body>
<a href=""></a>
ヘルプ＆カスタマーサービス
<h1>お問い合わせ方法</h1>
カスタマーサービスでは24時間お問い合わせを承っております。<br>
以下の手順でお問い合わせいただくと、お客様のアカウント情報<br>
などをすぐに確認できるため、スムーズなご対応が可能です。


<form method="get" action="help_togashi.jsp">
氏名(必須)
<input type="text" name="氏名">
<br>
氏名(カナ)(必須)
<input type="text" name="氏名(カナ)">
<br>
住所(必須)
〒<input type="text" name="郵便番号" size="10">
<input type="text" name="住所" size="40" placeholder="例)東京都千代田区～">
<br>
連絡先(必須)
<input type="text" name="連絡先">
<br>
メールアドレス(必須)
<input type="text" name="メールアドレス" size="30">
<input type="text" name="メールアドレス" size="30" placeholder="確認のため再度入力">
<br>
お問い合わせ種類(必須)
<select name="お問い合わせ種類">
<option value="お問い合わせ種類">アカウントについて</option>
<option value="お問い合わせ種類">お支払い方法について</option>
<option value="お問い合わせ種類">注文内容について</option>
<option value="お問い合わせ種類">その他</option>
</select>
<br>
お問い合わせ内容(必須)
<textarea name="△" rows="10" cols="50"></textarea>
<br>
<input type="submit" value="送信">
<a href="helplink_togashi.jsp">送信 </a>

</form>
<br><br><br><br>
ヘルプの検索<br>
<input type="text" name="q" size="31" maxlength="255" value="">
<input type="submit" name="btng" value="検索">
<input type="hidden" name="h1" value="ja">
<input type="hidden" name="sitesearch"value="web-officer.com">

</body>
</html>
