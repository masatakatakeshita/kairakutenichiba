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
<fmt:setBundle
	basename="com.internousdev.kairakutenichiba.property.index" var="lang" />

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!--  快楽天市場トップ-->
<title><s:text name="lang.index.title" /></title>

<link rel="stylesheet" type="text/css"
	href="http://yui.yahooapis.com/3.18.1/build/cssreset/cssreset-min.css">
<!-- <link rel="stylesheet" type="text/css" href="CSS/index.css">  -->
<link rel="stylesheet" href="CSS/jquery.bxslider.css" />
<link rel="stylesheet" type="text/css" href="CSS/index.css">
<link rel="stylesheet" type="text/css" href="CSS/bootstrap.css">



<!-- Javascripts -->

<script src="js/bootstrap.min.js"></script>
<script src="js/jquery-3.2.1.min.js"></script>
<script src="js/jquery.bxslider.min.js"></script>
<script type="text/javascript">
  $(function() {
	    $('.bxslider').bxSlider({
	        minSlides: 4,
	        maxSlides: 4,
	        moveSlides: 1,
	        slideWidth: 150,
	        slideMargin: 5,
	    });
	});



  $(function(){
	   // #で始まるアンカーをクリックした場合に処理
	   $('a[href^=#]').click(function() {
	      // スクロールの速度
	      var speed = 400; // ミリ秒
	      // アンカーの値取得
	      var href= $(this).attr("href");
	      // 移動先を取得
	      var target = $(href == "#" || href == "" ? 'html' : href);
	      // 移動先を数値で取得
	      var position = target.offset().top;
	      // スムーススクロール
	      $('body,html').animate({scrollTop:position}, speed, 'swing');
	      return false;
	   });
	});
  </script>

<s:if test="itemList == null || itemList.isEmpty()">
<meta http-equiv="refresh" content="0; <s:url action="IndexAction"/>">
</s:if>


</head>



<body>
	<!-- header読み込み -->
	<header>
		<s:include value="header.jsp" />
	</header>



	<div id="pagebody"></div>
	<div class="sidebar">

		<div class="sidebar-box">
			<a href="#jump-boy"> <img src="<s:property value="array[1]"/>" alt="" style="width: 15%">
					<!--  少年マンガ  -->
				 <em class="sbox"><s:text name="lang.index.boymanga" /></em>
				 </a>
		</div>

		<div class="sidebar-box">
			<a href="#jump-girl"> <img src="<s:property value="array[2]"/>" alt="" style="width: 15%">
					<!--  少女マンガ  -->
				 <em class="sbox"><s:text name="lang.index.girlmanga" /></em>
				 </a>
		</div>

		<div class="sidebar-box">
			<a href="#jump-novel"> <img src="<s:property value="array[3]"/>" alt="" style="width: 15%">
					<!-- ライトノベル -->
				 <em class="sbox"><s:text name="lang.index.lightnovel" /></em>
				 </a>
		</div>

		<div class="sidebar-box">
			<a href="#jump-paperback"> <img src="<s:property value="array[4]"/>" alt="" style="width: 15%">
					<!--  文庫本  -->
			<em class="sbox"><s:text name="lang.index.novel" /></em>
			</a>
		</div>

		<div class="sidebar-box">
			<a href="#jump-magazine"> <img src="<s:property value="array[5]"/>" alt="" style="width: 15%">
					<!--  雑誌  -->
				 <em class="sbox"><s:text name="lang.index.magazine" /></em>
				 </a>
		</div>

	</div>




	<div class="slidebox">
						<!-- 今月のおすすめ商品 -->
		<h1 class="recommend"><s:text name="lang.index.recommandgoods" /></h1>

		<ul class="bxslider">
		   <s:iterator value = "itemList">
			<li><a href="<s:url action="GoItemDetailAction" ><s:param name="item_id" ><s:property value="item_id"/></s:param></s:url>">
			<img src="<s:property value="item_image"/>" class="img-responsive"></a></li>
           </s:iterator>
		</ul>
    </div>


	<div id="jump-boy">
		<!-- 少年マンガ -->
		<h2 id="boy"><s:text name="lang.index.boymanga" /></h2>
		<div class="boy-item">
		<s:iterator value = "itemListA">
			<a href='<s:url action="GoItemDetailAction" ><s:param name="item_id" ><s:property value="item_id"/></s:param></s:url>'>
			<img src="<s:property value="item_image"/>" class="img"></a>
			</s:iterator>
			<a href='#top' class="go-top"><s:text name="" /></a>
	</div>
    </div>


	<div id="jump-girl">
					<!--少女マンガ  -->
		<h2 id="girl"><s:text name="lang.index.girlmanga" /></h2>
		<div class="girl-item">
		<s:iterator value = "itemListB">
			<a href='<s:url action="GoItemDetailAction" ><s:param name="item_id" ><s:property value="item_id"/></s:param></s:url>'><img
					src="<s:property value="item_image"/>" class="img"></a>
		</s:iterator>
			<a href='#top' class="go-top"><s:text name="" /><s:text name="lang.index.gototop" /></a>

		</div>
	</div>

	<div id="jump-novel">
					<!-- ライトノベル -->
		<h2 id="novel"><s:text name="lang.index.lightnovel" /></h2>
		<div class="novel-item">
		<s:iterator value = "itemListC">
			<a href='<s:url action="GoItemDetailAction" ><s:param name="item_id" ><s:property value="item_id"/></s:param></s:url>'><img
					src="<s:property value="item_image"/>" class="img"></a>
			</s:iterator>
					<!-- ▲トップへ -->
			<a href='#top' class="go-top"><s:text name="lang.index.gototop" /></a>

		</div>
	</div>

	<div id="jump-paperback">
						<!-- 文庫本 -->
		<h2 id="paperback"><s:text name="lang.index.novel" /></h2>
		<div class="paperback-item">
		<s:iterator value = "itemListD">
			<a href='<s:url action="GoItemDetailAction" ><s:param name="item_id" ><s:property value="item_id"/></s:param></s:url>'><img
					src="<s:property value="item_image"/>" class="img"></a>
			</s:iterator>
						<!-- ▲トップへ -->
		<a href='#top' class="go-top"><s:text name="lang.index.gototop" /></a>

		</div>
	</div>

	<div id="jump-magazine">
						<!-- 雑誌 -->
		<h2 id="magazine"><s:text name="lang.index.magazine" /></h2>
		<div class="magazine-item">
		<s:iterator value = "itemListE">
			<a href='<s:url action="GoItemDetailAction" ><s:param name="item_id" ><s:property value="item_id"/></s:param></s:url>'><img
					src="<s:property value="item_image"/>" class="img"></a>
			</s:iterator>
						<!-- ▲トップへ -->
		<a href='#top' class="go-top"><s:text name="lang.index.gototop" /></a>

		</div>
	</div>


</body>
</html>