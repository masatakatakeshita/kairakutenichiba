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
<fmt:setBundle basename="com.internousdev.kairakutenichiba.property.history" var="lang" />

<meta charset="utf-8">
<link rel="stylesheet" type="text/css" href="CSS/history.css">
<!-- 快楽歴史 -->
<title><s:text name="lang.history.title" /></title>

</head>
<body>

	<header>
		<s:include value="header.jsp" />
	</header>

<div class="main">
<!-- 快楽歴史 -->
<h1><s:text name="lang.history.title" /></h1>
<div class="gif"><img src="img/ninsani02.gif"width="50" height="50"></div>
	<!--こちらには過去に貪った快楽が表示されます  -->
	<p><s:text name="lang.history.explanation" /></p>
	<div class="search">
</div>


<s:form action="HistoryAction">
<table border="1">    
    <tr>
    	<!-- 商品名 -->
        <th><s:text name="lang.history.name" /></th>
        <!-- 著者名 -->
        <th><s:text name="lang.history.author" /></th>
        <!-- 値段 -->
        <th><s:text name="lang.history.price" /></th>
        <!-- 購入日 -->
        <th><s:text name="lang.history.buyday" /></th>
        <!-- 販売日 -->
        <th><s:text name="lang.history.dayonsale" /></th>
        <!-- 販売個数 -->
        <th><s:text name="lang.history.quantity" /></th>
        
    </tr>
    <s:iterator value="">	<!-- ここitemdtoのarryalist? -->
    <tr>
        <td><s:property value="item_name" /></td>
        <td><s:property value="author" /></td>
        <td><s:property value="price" /></td>
        <td><s:property value="purchased_day" /></td>
        <td><s:property value="release_day" /></td>
        <td><s:property value="quantities" /></td>

    </tr>
    </s:iterator>
</table>
</s:form>



<!-- 
<table>
<tr>
	<td><img class="image" src= "img/1.jpg"></td>
	<td><div class="name"><a href="detail.jsp">ワンピース 1巻</a></div><br>
		<a href="category_shojidairi.jsp">尾田栄一郎</a><br>
		<a href="category_shojidairi.jsp">集英社</a></td>
			<td>500円</td>
</tr>
<tr>
	<td><img class="image" src= "img/2.jpg"></td>
	<td><div class="name"><a href="detail.jsp">ワンピース 2巻</a></div><br>
		<a href="category_shojidairi.jsp">尾田栄一郎</a><br>
		<a href="category_shojidairi.jsp">集英社</a></td>
			<td>500円</td>
</tr>
<tr>

</tr>
</table>
 -->




<Form class="button"><Input type="button" value="閉じる" onClick="javascript:window.close();"></Form>
</div>

</body>
</html>