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
<fmt:setBundle basename="com.internousdev.kairakutenichiba.property.adminitem" var="lang" />

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title><s:text name="lang.adminitem.title" /></title>
<link rel="stylesheet" type="text/css" href="CSS/adminitem.css">
</head>


<body>
	<header>
		<s:include value="adminheader.jsp" />
	</header>




	<h1><s:text name="lang.adminitem.title" /></h1>
	<br>




	

<!--
<div align="right" style="padding-right:20%">
 -->
 	<!-- 商品追加 -->
	<s:form action="AdminItemInsertAction">
		<s:submit value="%{getText('lang.admin_item.add')}" name="submit" />
	</s:form>


	<!-- 商品一覧 -->
	<h2><s:text name="lang.adminitem.h2" /></h2>
 	<hr>

	<table border="1">
        <tr>
			<!-- 商品ID -->
            <th><s:text name="lang.adminitem.id" /></th>
			<!-- 商品名 -->
            <th><s:text name="lang.adminitem.name" /></th>
            <!-- カテゴリー -->
            <th><s:text name="lang.adminitem.category" /></th>
            <th>発売日</th>
             <th>著者</th>
              <th>出版社</th>
               <th>出版形態</th>
			 <th>ページ数</th>
			  <th>ISBNコード</th>
			<!-- 単価 -->
           <th><s:text name="lang.adminitem.price" /></th>
            <th>商品詳細</th>
			<!-- 在庫数 -->
            <th><s:text name="lang.adminitem.stocks" /></th>
			<!-- 売り上げ数 -->
            <th><s:text name="lang.adminitem.sales" /></th>
			
			<!-- 登録日 -->
            <th><s:text name="lang.adminitem.regday" /></th>
			<!-- 更新日 -->
            <th><s:text name="lang.adminitem.updday" /></th>
			<!-- デリートキー -->
            <th><s:text name="lang.adminitem.delkey" /></th>
			<!-- 商品画像 -->
            <th><s:text name="lang.adminitem.img" /></th>
            <td ></td>
        </tr>

        <!-- itemListはDAOで定義された配列オブジェクト -->
		<s:iterator value = "itemList">
			<tr>
            	<td><s:property value="item_id" /></td>
            	<td><s:property value="item_name" /></td>
            	<td><s:property value="category" /></td>
            	<td><s:property value="release_day" /></td>
            	<td><s:property value="author" /></td>
            	<td><s:property value="publisher" /></td>
            	<td><s:property value="publish_type" /></td>
            	<td><s:property value="pages" /></td>
            	<td><s:property value="isbn" /></td>
				<td><fmt:formatNumber value="${price}" pattern="###,###,###"/></td>
				<td><s:property value="item_detail" /></td>
				<td><s:property value="stocks" /></td>
				<td><s:property value="sales" /></td>
				<td><s:property value="created_at" /></td>
				<td><s:property value="updated_at" /></td>
				<td><s:property value="is_deleted" /></td>
				<td><img src="<s:property value="item_image"/>" width="50" height="50">
					<s:property value="item_image"/></td>
					
				<td>
				  <s:form action="AdminItemDeleteAction">
                     <s:hidden name="item_id" value="item_id" />
                     <s:submit value="%{getText('lang.admin_item.del')}" name="submit"/>
                  </s:form>
				</td>
			</tr>
		</s:iterator>
		
	    <!-- 更新 -->
	    <tr>
                 <s:form action="AdminItemUpdateAction">
                     <td><s:textfield name="item_id" /></td>
                     <td><s:textfield name="item_name" /></td>
                     <td><s:textfield name="category" /></td>
                     <td><s:textfield name="release_day" /></td>
                     <td><s:textfield name="author" /></td>
                     <td><s:textfield name="publisher" /></td>
                     <td><s:textfield name="publish_type" /> </td>
                     <td><s:textfield name="pages" /></td>
                     <td><s:textfield name="isbn" /></td>
                     <td><s:textfield name="price" /></td>
                     <td><s:textfield name="item_detail" /></td>
                     <td><s:textfield name="stocks" /></td>
                     <td><s:textfield name="sales" /></td>
                     <td><s:textfield name="created_at" /></td>
                     <td><s:textfield name="updated_at" /></td>
                     <td><s:textfield name="is_deleted" /></td>
                     <td><s:textfield name="item_image" /></td>
                     <td><s:submit value="%{getText('lang.admin_item.upd')}" name="submit"/></td>
                 </s:form>
                 </tr>
         <!-- 新規登録 -->
         <tr>        
                 <s:form action="AdminItemInsertAction">
                     <td><s:textfield name="item_id" /></td>
                     <td><s:textfield name="item_name" /></td>
                     <td><s:textfield name="category" /></td>
                     <td><s:textfield name="release_day" /></td>
                     <td><s:textfield name="author" /></td>
                     <td><s:textfield name="publisher" /></td>
                     <td><s:textfield name="publish_type" /> </td>
                     <td><s:textfield name="pages" /></td>
                     <td><s:textfield name="isbn" /></td>
                     <td><s:textfield name="price" /></td>
                     <td><s:textfield name="item_detail" /></td>
                     <td><s:textfield name="stocks" /></td>
                     <td><s:textfield name="sales" /></td>
                     <td><s:textfield name="created_at" /></td>
                     <td><s:textfield name="updated_at" /></td>
                     <td><s:textfield name="is_deleted" /></td>
                     <td><s:textfield name="item_image" /></td>
                     <td><s:submit value="新規登録" name="submit"/></td>
                 </s:form>
                 
         </tr>
	</table>






</body>
</html>