<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html lang="ja">

<head>
<meta charset="utf-8">

<!-- Stylesheet -->
<link rel="stylesheet" type="text/css" href="CSS/header.css">
<link rel="stylesheet" type="text/css" href="CSS/logout_kato.css">

<title>ログアウト</title>
<meta http-equiv="Content-Style-Type" content="text/css">
<meta http-equiv="Content-Script-Type" content="text/javascript">


<!-- Javascripts -->
<script src="js/jquery-3.2.1.min.js"></script>


</head>

<body>
	<header>
		<s:include value="header.jsp" />
	</header>r


	<div id="logout">

		<h1>ログアウトしました</h1>

	</div>

	<div id="relogin">

		<a href="login_kato.jsp">再度ログインする</a>
	</div>

	<div id="linktop">
		<a href="index.jsp">トップページへ</a>
	</div>

	<script>
		//. History API が使えるブラウザかどうかをチェック
		if (window.history && window.history.pushState) {

			//. ブラウザ履歴に１つ追加
			history.pushState("nohb", null, "");
			$(window).on("popstate", function(event) {

				//. このページで「戻る」を実行
				if (!event.originalEvent.state) {

					//. もう一度履歴を操作
					history.pushState("nohb", null, "")
					alert("「トップページへ」からお戻りください。");

					return;
				}
			});
		}
	</script>

</body>
</html>