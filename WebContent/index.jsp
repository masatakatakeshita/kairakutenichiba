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

<title>快楽天市場トップ</title>

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


<!-- indexのcssのディレクトリ入れる 階層ごとに../が必要な場合がある。
    本当にディレクトリまでのパスがあっているか確かめる。-->
</head>



<body>
	<!-- header読み込み -->
	<header>
		<s:include value="header.jsp" />
	</header>



	<div id="pagebody"></div>
	<div class="sidebar">

		<div class="sidebar-box">
			<a href="#jump-boy"> <img src="img/item/名探偵コナソ.png" alt="" style="width: 15%">
				 <em class="sbox"> 少年マンガ </em>
				 </a>
		</div>

		<div class="sidebar-box">
			<a href="#jump-girl"> <img src="img/item/僕に届け.png" alt="" style="width: 15%">
				 <em class="sbox"> 少女マンガ </em>
				 </a>
		</div>

		<div class="sidebar-box">
			<a href="#jump-novel"> <img src="img/item/俺の姉が.png" alt="" style="width: 15%">
				 <em class="sbox"> ライトノベル </em>
				 </a>
		</div>

		<div class="sidebar-box">
			<a href="#jump-paperback"> <img src="img/item/メガネ.png" alt="" style="width: 15%">
			<em class="sbox"> 文庫本 </em>
			</a>
		</div>

		<div class="sidebar-box">
			<a href="#jump-magazine"> <img src="img/item/正しい寿司の握り方.png" alt="" style="width: 15%">
				 <em class="sbox"> 雑誌 </em>
				 </a>
		</div>

	</div>




	<div class="slidebox">
		<h1 class="recommend">今月のおすすめ商品</h1>

		<ul class="bxslider">

			<li><a href='<s:url action="GoItemDetailAction" ><s:param name="sortId" >1</s:param></s:url>'><img
					src="img/item/チビモン.png" class="img-responsive"></a></li>
			<li><a href='<s:url action="GoItemDetailAction" ><s:param name="sortId" >15</s:param></s:url>'><img
					src="img/item/ねだめ カンタービレ.png" class="img-responsive"></a></li>
			<li><a href='<s:url action="GoItemDetailAction" ><s:param name="sortId" >11</s:param></s:url>'><img
					src="img/item/ノルウェイの林（上）.png" class="img-responsive"></a></li>
			<li><a href='<s:url action="GoItemDetailAction" ><s:param name="sortId" >12</s:param></s:url>'><img
					src="img/item/ノルウェイの林（下）.png" class="img-responsive"></a></li>
			<li><a href='<s:url action="GoItemDetailAction" ><s:param name="sortId" >2</s:param></s:url>'><img
					src="img/item/メガネ.png" class="img-responsive"></a></li>
			<li><a href='<s:url action="GoItemDetailAction" ><s:param name="sortId" >3</s:param></s:url>'><img
					src="img/item/ライオンの飼育方法.png" class="img-responsive"></a></li>
			<li><a href='<s:url action="GoItemDetailAction" ><s:param name="sortId" >4</s:param></s:url>'><img
					src="img/item/ワイルドフラワー.png" class="img-responsive"></a></li>
			<li><a href='<s:url action="GoItemDetailAction" ><s:param name="sortId" >13</s:param></s:url>'><img
					src="img/item/俺の姉が.png" class="img-responsive"></a></li>
			<li><a href='<s:url action="GoItemDetailAction" ><s:param name="sortId" >5</s:param></s:url>'><img
					src="img/item/快楽店市場の歴史.png" class="img-responsive"></a></li>
			<li><a href='<s:url action="GoItemDetailAction" ><s:param name="sortId" >6</s:param></s:url>'><img
					src="img/item/世界の絶景.png" class="img-responsive"></a></li>
			<li><a href='<s:url action="GoItemDetailAction" ><s:param name="sortId" >7</s:param></s:url>'><img
					src="img/item/正しい寿司の握り方.png" class="img-responsive"></a></li>
			<li><a href='<s:url action="GoItemDetailAction" ><s:param name="sortId" >14</s:param></s:url>'><img
					src="img/item/頭文字C.png" class="img-responsive"></a></li>
			<li><a href='<s:url action="GoItemDetailAction" ><s:param name="sortId" >8</s:param></s:url>'><img
					src="img/item/美しいホネ.png" class="img-responsive"></a></li>
			<li><a href='<s:url action="GoItemDetailAction" ><s:param name="sortId" >10</s:param></s:url>'><img
					src="img/item/僕に届け.png" class="img-responsive"></a></li>
			<li><a href='<s:url action="GoItemDetailAction" ><s:param name="sortId" >9</s:param></s:url>'><img
					src="img/item/名探偵コナソ.png" class="img-responsive"></a></li>

		</ul>
	</div>

	<div id="jump-boy">
		<h2 id="boy">少年マンガ</h2>
		<div class="boy-item">
			<a href='<s:url action="GoItemDetailAction" ><s:param name="sortId" >1</s:param></s:url>'><img
					src="img/item/チビモン.png" class="img"></a>
			<a href='<s:url action="GoItemDetailAction" ><s:param name="sortId" >14</s:param></s:url>'><img
					src="img/item/頭文字C.png" class="img"></a>
			<a href='<s:url action="GoItemDetailAction" ><s:param name="sortId" >9</s:param></s:url>'><img
					src="img/item/名探偵コナソ.png" class="img"></a>
			<a href='#top' class="go-top">▲トップへ</a>
		</div>
	</div>

	<div id="jump-girl">
		<h2 id="girl">少女マンガ</h2>
		<div class="girl-item">
			<a href='<s:url action="GoItemDetailAction" ><s:param name="sortId" >15</s:param></s:url>'><img
					src="img/item/ねだめ カンタービレ.png" class="img"></a>
			<a href='<s:url action="GoItemDetailAction" ><s:param name="sortId" >4</s:param></s:url>'><img
					src="img/item/ワイルドフラワー.png" class="img"></a>
			<a href='<s:url action="GoItemDetailAction" ><s:param name="sortId" >10</s:param></s:url>'><img
					src="img/item/僕に届け.png" class="img"></a>
			<a href='#top' class="go-top">▲トップへ</a>
		</div>
	</div>

	<div id="jump-novel">
		<h2 id="novel">ライトノベル</h2>
		<div class="novel-item">
			<a href='<s:url action="GoItemDetailAction" ><s:param name="sortId" >3</s:param></s:url>'><img
					src="img/item/ライオンの飼育方法.png" class="img"></a>
			<a href='<s:url action="GoItemDetailAction" ><s:param name="sortId" >8</s:param></s:url>'><img
					src="img/item/美しいホネ.png" class="img"></a>
			<a href='<s:url action="GoItemDetailAction" ><s:param name="sortId" >13</s:param></s:url>'><img
					src="img/item/俺の姉が.png" class="img"></a>
			<a href='#top' class="go-top">▲トップへ</a>
		</div>
	</div>

	<div id="jump-paperback">
		<h2 id="paperback">文庫本</h2>
		<div class="paperback-item">
			<a href='<s:url action="GoItemDetailAction" ><s:param name="sortId" >11</s:param></s:url>'><img
					src="img/item/ノルウェイの林（上）.png" class="img"></a>
			<a href='<s:url action="GoItemDetailAction" ><s:param name="sortId" >12</s:param></s:url>'><img
					src="img/item/ノルウェイの林（下）.png" class="img"></a>
			<a href='<s:url action="GoItemDetailAction" ><s:param name="sortId" >2</s:param></s:url>'><img
					src="img/item/メガネ.png" class="img"></a>
		<a href='#top' class="go-top">▲トップへ</a>
		</div>
	</div>

	<div id="jump-magazine">
		<h2 id="magazine">雑誌</h2>
		<div class="magazine-item">
			<a href='<s:url action="GoItemDetailAction" ><s:param name="sortId" >5</s:param></s:url>'><img
					src="img/item/快楽店市場の歴史.png" class="img"></a>
			<a href='<s:url action="GoItemDetailAction" ><s:param name="sortId" >6</s:param></s:url>'><img
					src="img/item/世界の絶景.png" class="img"></a>
			<a href='<s:url action="GoItemDetailAction" ><s:param name="sortId" >7</s:param></s:url>'><img
					src="img/item/正しい寿司の握り方.png" class="img"></a>
		<a href='#top' class="go-top">▲トップへ</a>
		</div>
	</div>


</body>
</html>