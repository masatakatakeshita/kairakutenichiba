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
	<form action="#" name="form1">

		<table class="type01">
			<thead>
				<tr>
					<th scope="col"><s:text name="lang.cart.item_name" /></th>
					<th scope="col"><s:text name="lang.cart.price" /></th>
					<th scope="col"><s:text name="lang.cart.count" /></th>
					<th scope="col"><s:text name="lang.cart.subtotal" /></th>
				</tr>
            </thead>
		</table>
        <table class="type01">

            <td><div class="update">

									<s:form action="CartUpdateAction" id="form01">
									<s:hidden name="cartId" value="%{cartId}" />
									<s:hidden name="itemId" value="%{mId}" />
									<s:hidden name="prevQuantities" value="%{quantities}" />
                                        <div class="form-group">
												<input type="text"  style="width:70px"  class="form-control"  id="${cartId}"
													name="quantities" value="${quantities}" maxlength="2"
													<s:if test="stocks+quantities>=50"> pattern="([1-9])|([0-4][1-9])|(50)" placeholder="1-50"</s:if>
													<s:else>pattern="[1-<s:property value="quantities+stocks"/>]*" placeholder="1-<s:property value="quantities+stocks"/>"</s:else>/>
                                        </div>
                                    </s:form>
                </div>
            </td>

        </table>

		<table class="type02">
			<tr>
				<th align="right" colspan="3"><strong><s:text name="lang.cart.total" /></strong></th>
				<td>
                    	<fmt:formatNumber value="${amountAll}" pattern="###,###,###" />
                    <input type="text" name="field_total" size="8" value=""
                           style="text-align: right;" /><s:text name="lang.cart.yen" /></td></tr></table>




</form>
</div>
<span id="submit">

		<input type="submit" onclick="location.href='payment_takeshita.jsp'"
		value="<s:text name="lang.cart.message4" />">

		</span>

		<p><a href="index.jsp"><s:text name="lang.cart.message3" /></a>
	</p>



</body>
</html>