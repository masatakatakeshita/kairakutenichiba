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
<fmt:setBundle basename="com.internousdev.kairakutenichiba.property.cart" var="lang" />

<meta charset="utf-8">
<link rel="stylesheet" type="text/css" href="CSS/cart.css">

<title><s:text name="lang.cart.title" /></title>

</head>





<body>
	<header>
		<s:include value="header.jsp" />
	</header>
	<div class="container">
		<h1><s:text name="lang.cart.message" /></h1>
	</div>

		<!-- カートの中身を表示するテーブル -->

					<table class="type01">
						<tr>
							<th class="text-center" style="width: 25%;"><s:text
									name="lang.cart.item_name" /></th>
							<th class="text-center" style="width: 25%;"><s:text
									name="lang.cart.price" /></th>
							<th class="text-center" style="width: 25%;"><s:text
									name="lang.cart.count" /></th>
							<th class="text-center" style="width: 25%;"><s:text
									name="lang.cart.subtotal" /></th>
						</tr>
					</table>

					<!-- ここからイテレート -->
					<table class="type01">
						<s:iterator value="cartList">
							<tr>
								<td style="width: 25%;"><s:property value="item_name" /></td>
								<td style="width: 25%;">
									<div class="col-xs-5"></div> <s:form action="CartUpdateAction">
										<s:select
											list="{\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\"}"
											name="quantities" Value="%{quantities}"
											onChange="this.form.submit()" />
									</s:form>
								</td>
								<td style="width: 25%;"><fmt:formatNumber
										value="${unit_price}" pattern="###,###,###" />actionからひっぱる(小計？)
									</td>
								<td style="width: 25%;"><s:form action="CartDeleteAction">
										<button type="submit" class="btn btn-danger">
											<s:text name="lang.cart.delete" />
										</button>
									</s:form></td>
							</tr>
						</s:iterator>
					</table>
					<!-- ここまでイテレート -->
		<table class="type02">
			<tr>
				<th align="right" colspan="3"><strong><s:text name="lang.cart.total" /></strong></th>
				<td>
                    	<fmt:formatNumber value="${amountAll}" pattern="###,###,###" />
                    <s:text name="lang.cart.yen" /></td></tr></table>
<span id="submit">
		<input type="submit" onclick="location.href='payment_takeshita.jsp'"
		value="<s:text name="lang.cart.message4" />">

		</span>

		<p><a href="index.jsp"><s:text name="lang.cart.message3" /></a>
	</p>

<script>
		if (window.history && window.history.pushState) {

			history.pushState("nohb", null, "");
			$(window).on("popstate", function(event) {

				if (!event.originalEvent.state) {

					history.pushState("nohb", null, "")
					alert("画面最上部のヘッター又は画面中央部ボタンからお戻り下さい。");

					return;
				}
			});
		}
	</script>


</body>
</html>