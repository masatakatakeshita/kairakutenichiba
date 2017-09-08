<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html lang="ja">

<head>
<meta charset="utf-8">
<title>ヘルプ：お問い合わせ</title>
<link rel="stylesheet" type="text/css" href="CSS/helplink.css">

</head>

<body>

	<header>
		<s:include value="header.jsp" />
	</header>


<div id="center">
<script>
var send =0;
if (send =1){
	document.write("送信されました。");
}else{
document.write("送信されませんでした。")
}
</script>
</div>
</body>
</html>