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
<fmt:setBundle basename="com.internousdev.kairakutenichiba.property.help" var="lang" />

<meta charset="utf-8">
<!-- ヘルプ：お問い合わせ方法 -->
<title><s:text name="lang.help.title" /></title>


<link rel="stylesheet" type="text/css" href="http://localhost:8080/kairakutenichiba/CSS/help.css">

<link rel="stylesheet" type="text/css"  href="CSS/header.css">



</head>
<body>

	<header>
		<s:include value="header.jsp" />
	</header>

<div id="center">

<a href=""></a>
<!-- ヘルプ＆カスタマーサービス -->
<h1><s:text name="lang.help.helpservice" /></h1>
<!-- お問い合わせ方法 -->
<h2><s:text name="lang.help.howtoask" /></h2>
<p>
<!-- カスタマーサービスでは24時間お問い合わせを承っております。 -->
<s:text name="lang.help.24houravailable" />
<br>
<!-- 以下の手順でお問い合わせいただくと、お客様のアカウント情報 -->
<s:text name="lang.help.youcanaskusthisway" />
<br>
<!-- などをすぐに確認できるため、スムーズなご対応が可能です。 -->
<s:text name="lang.help.canretreateasy" />

</p>




<s:form action="helplink.jsp" id="form2">


<div class="boxA">



<p><!-- 氏名 -->
<span><s:text name="lang.help.name" /><font color="red"><!-- 必須 --><s:text name="lang.help.necessary" /></font></span>
<a class="box1">
<input type="text" name="userName"required autofocus >

</a>
</p>

<br>
<p><!--住所  -->
<span><s:text name="lang.help.streetaddress" /></span>
<a class ="box3">
<!--〒  -->
<s:text name="lang.help.symbol" /><input type="text" name="userAddress" size="10" pattern="\d{3}-?\d{4}"placeholder="123-4567">

</a>
<br>
<a class="box4">
<span>　</span>
<input type="text" name="userAddress" size="30" placeholder="<s:text name="lang.help.addressex" />" ><!-- 例)東京都千代田区～ -->
</a>
</p>
<br>

<p><!-- メールアドレス -->
<span><s:text name="lang.help.mail" />
<font color="red"><!-- (必須) --><s:text name="lang.help.necessary" /></font></span>
<a class="box6">
<input type="email" name="userMail" size="30"required>
</a>
<br>
<span>　</span>
<a class="box7">
<input type="text" name="userMail" size="30"  placeholder="><s:text name="lang.help.typeagain" />"required><!-- 確認のため再度入力 -->
</a>
</p>
<br>
<p>
<!-- お問い合わせ種類 -->
<span><s:text name="lang.help.askcategory" /><font color="red"><!--(必須)  --><s:text name="lang.help.necessary" /></font></span>
<a class="box8">
<select name="category"required>
<!--アカウントについて -->
<option value="<s:text name="lang.help.account" />"  ><s:text name="lang.help.account" /></option>
<!-- お支払い方法について -->
<option value="<s:text name="lang.help.howtopay" />" ><s:text name="lang.help.howtopay" /></option>
<!--  注文内容について-->
<option value="<s:text name ="lang.help.ordercontent"/>" ><s:text name="lang.help.ordercontent" /></option>
<!-- その他 -->
<option value="<s:text name="lang.help.other"/>" ><s:text name="lang.help.other" /></option>
</select>
</a>
</p>
<br>
<p>
<!-- お問い合わせ内容 -->
<span><s:text name="lang.help.askdetail" /><font color="red"><!--(必須)  --><s:text name="lang.help.necessary" /></font></span>
<textarea name="comment" rows="10" cols="50"required></textarea>
<br>
</p>
<p>
<input type="submit" value="<s:text name = "lang.help.return"/>"/>
</p>

</div>




</s:form>


</div>

</body>
</html>

