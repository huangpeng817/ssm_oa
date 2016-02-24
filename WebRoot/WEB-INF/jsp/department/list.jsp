<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html><head>
    <title>部门列表</title>
    <%@include file="/WEB-INF/jsp/public/commons.jspf" %>
</head>
<body>
 
<div id="Title_bar">
    <div id="Title_bar_Head">
        <div id="Title_Head"></div>
        <div id="Title"><!--页面标题-->
            <img src="${pageContext.request.contextPath }/style/images/title_arrow.gif" border="0" height="13" width="13"> 部门管理
        </div>
        <div id="Title_End"></div>
    </div>
</div>

<div id="MainArea">
    <table class="TableStyle" cellpadding="0" cellspacing="0">
       
        <!-- 表头-->
        <thead>
            <tr id="TableTitle" align="center" valign="middle">
            	<td width="150px">部门名称</td>
				<td width="150px">上级部门名称</td>
				<td width="200px">职能说明</td>
				<td>相关操作</td>
            </tr>
        </thead>

		<!--显示数据列表-->
        <tbody id="TableData" class="dataContainer" datakey="departmentList">
			<c:forEach items="${departmentList }" var="department">
        	<tr class="TableDetail1 demodata_record">
				<td><a href="<c:url value='/DepartmentServlet?method=list&parentId=${department.id }'/>">${department.name }</a>&nbsp;</td>
				<td>${department.parent.name }</td>
				<td>${department.description }</td>
				<td><a onclick="return window.confirm('这将删除所有的下级部门，您确定要删除吗？')" href="<c:url value='/DepartmentServlet?method=delete&id=${department.id }&parentId=${parent.id }'/>">删除</a>
					<a href="<c:url value='/DepartmentServlet?method=editUI&id=${department.id }'/>">修改</a>
				</td>
			</tr>
			</c:forEach>
		</tbody>
    </table>
    
    <!-- 其他功能超链接 -->
    <div id="TableTail">
        <div id="TableTail_inside">
            <a href="<c:url value='/DepartmentServlet?method=addUI&pId=${parent.id }'/>"><img src="${pageContext.request.contextPath }/style/images/createNew.png"></a>
            <a href="<c:url value='/DepartmentServlet?method=list&parentId=${parent.parent.id }'/>">返回上一级</a>
        </div>
    </div>
</div>

<!--说明-->	
<div id="Description"> 
	说明：<br>
	1，列表页面只显示一层的（同级的）部门数据，默认显示最顶级的部门列表。<br>
	2，点击部门名称，可以查看此部门相应的下级部门列表。<br>
	3，删除部门时，同时删除此部门的所有下级部门。
</div>



</body></html>