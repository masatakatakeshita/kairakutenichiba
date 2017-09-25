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
<fmt:setBundle basename="com.internousdev.kairakutenichiba.property.adminhelp" var="lang" />

<meta charset="utf-8">
<title><s:text name="lang.adminhelp.topTitle" /></title>

</head>
<body>
	<header>
		<s:include value="adminheader.jsp" />
	</header>
	<br>


	<h1><s:text name="lang.adminhelp.h1title" /></h1>

	<p>
<!-- 	検索バーここから -->
<div class="text-center">
<s:form action="AdminHelpAction">

	<input type="text" name="searchUserName" placeholder="<s:text name="lang.adminhelp.enterName" />" size="30" />

	<select name="searchCategory">
			<option value=""><s:text name="lang.adminhelp.all" /></option>

			<option value="<s:text name="lang.adminhelp.acount" />" ><s:text name="lang.adminhelp.acount" /></option>

            <option value="<s:text name="lang.adminhelp.howtopay" />" ><s:text name="lang.adminhelp.howtopay" /></option>

            <option value="<s:text name="lang.adminhelp.ordercontent" />" ><s:text name="lang.adminhelp.ordercontent" /></option>

			<option value="<s:text name="lang.adminhelp.other" />" ><s:text name="lang.adminhelp.other" /></option>
	</select>

	<select name="searchSort">
			<option value="-1"><s:text name="lang.adminhelp.sortNew" /></option>
			<option value="1" ><s:text name="lang.adminhelp.sortOld" /></option>
	</select>

	<input type="submit" value="<s:text name="lang.adminhelp.search" />" />

</s:form>
</div>
<!-- 	検索バーここまで -->



<s:if test ="displayList != null && !displayList.isEmpty()">
	<div class="text-center"><br>
	<p><s:property value="searchUserName"/> / <s:property value="searchCategory"/> /
		<b><s:property value="selectList.size()"/></b><s:text name="lang.adminhelp.Hits" />
		<br><b><s:property value="currentPage+1"/></b> / <b><s:property value="pageCount"/></b><s:text name="lang.adminhelp.page" /></p>
	</div><br>

<div class="text-center">
<s:iterator value="displayList">
<table class="admin-help-table" border="1" style="table-layout:fixed;width:60%;">

		<tr bgcolor="#cccccc">
			<th><s:text name="lang.adminhelp.userName" /></th>
			<th><s:text name="lang.adminhelp.userMail" /></th>
        </tr>
		<tr align="center" bgcolor="#ffffff">
			<td><s:property value="userName" /></td>
			<td><s:property value="userMail" /></td>
		</tr>

        <tr bgcolor="#cccccc">
			<th><s:text name="lang.adminhelp.category" /></th>
			<th><s:text name="lang.adminhelp.dt" /></th>
		</tr>
		<tr align="center" bgcolor="#ffffff">
            <td><s:property value="category" /></td>
            <td><s:property value="dt" /></td>
        </tr>

        <tr bgcolor="#cccccc">
			<th colspan="2"><s:text name="lang.adminhelp.comment" /></th>
		</tr>
		<tr align="left" bgcolor="#ffffff">
            <td colspan="2"><div class="sc"><s:property value="comment" escape="false" /></div></td>
        </tr>

</table>
</s:iterator>
</div>


<!-- ページネーション -->
<nav class="text-center contents">
				<div class="text-center">
					<ul class="pagination">
						<!-- ページネーション（1ページ目なら） -->
						<s:if test="currentPage==0">
						<li class="disabled"><span>&laquo;</span></li>
						</s:if>

						<!-- 1ページ目以外なら -->
						<s:else>
							<li><a href='<s:url action="AdminHelpAction">
												<s:param name="currentPage" value="currentPage -1"/>
												<s:param name="searchCategory" value="searchCategory"/>
												<s:param name="searchUserName" value="searchUserName"/>
												<s:param name="searchSort" value="searchSort"/>
												</s:url>'>&laquo;
									</a>
							</li>
						</s:else>

						<s:iterator value="arrayPageCount" status="rs">
							<s:if test="%{#rs.index >= currentPage -leftPage && #rs.index <= currentPage +rightPage}">
								<s:if test="Page == #rs.index">
								<li class="disabled"><span><s:property value="#rs.count" /> </span></li>
								</s:if>
							<s:else>
							<li><a href='<s:url action="AdminHelpAction">
												<s:param name="currentPage" value="#rs.index"/>
												<s:param name="searchCategory" value="searchCategory"/>
												<s:param name="searchUserName" value="searchUserName"/>
												<s:param name="searchSort" value="searchSort"/>
												</s:url>'><s:property value="#rs.count" />
									</a>
							</li>
							</s:else>
							</s:if>
						</s:iterator>

						<!-- ページネーション（最終ページなら） -->
						<s:if test="currentPage == pageCount-1">
						<li class="disabled"><span>&raquo;</span></li>
						</s:if>

						<s:elseif test="pageCount == 0">
						<li class="disabled"><span>&raquo;</span></li>
						</s:elseif>

						<!-- 最終ページ以外なら -->
						<s:else>
							<li><a href='<s:url action="AdminHelpAction">
							<s:param name="currentPage" value="currentPage+1"/>
							<s:param name="searchCategory" value="searchCategory"/>
							<s:param name="searchUserName" value="searchUserName"/>
							<s:param name="searchSort" value="searchSort"/>
							</s:url>'>&raquo;</a>
							</li>
						</s:else>
					</ul>

				</div>
</nav>
</s:if>


<s:else><h1><s:text name="lang.adminhelp.display" /></h1></s:else>


</body>
</html>