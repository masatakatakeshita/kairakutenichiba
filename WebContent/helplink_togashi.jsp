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
<fmt:setBundle basename="com.internousdev.kairakutenichiba.property.helplink" var="lang" />

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