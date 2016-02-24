<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html><head>
	<title>部门设置</title>
    <%@include file="/WEB-INF/jsp/public/commons.jspf" %>
</head>
<body>

<!-- 标题显示 --> 
<div id="Title_bar">
    <div id="Title_bar_Head">
        <div id="Title_Head"></div>
        <div id="Title"><!--页面标题-->
            <img src="${pageContext.request.contextPath }/style/images/title_arrow.gif" border="0" height="13" width="13"> 部门信息
        </div>
        <div id="Title_End"></div>
    </div>
</div>

<!--显示表单内容-->
<div id="MainArea">
    <form action="<c:url value='/DepartmentServlet'/>" method="post">
    	<input type="hidden" name="method" value="${empty editDept.id ? 'add' : 'edit' }">
    	<input type="hidden" name="id" value="${editDept.id }">
        <div class="ItemBlock_Title1"><!-- 信息说明<DIV CLASS="ItemBlock_Title1">
        	<IMG BORDER="0" WIDTH="4" HEIGHT="7" SRC="${pageContext.request.contextPath }/style/blue/images/item_point.gif" /> 部门信息 </DIV>  -->
        </div>
        
        <!-- 表单内容显示 -->
        <div class="ItemBlockBorder">
            <div class="ItemBlock">
                <table class="mainForm" cellpadding="0" cellspacing="0">
                    <tbody><tr><td width="100">上级部门</td>
                        <td><select name="parentId" class="SelectStyle">
                                <option value="0">请选择部门</option>
                                <c:forEach items="${departmentList }" var="department">
	                                <c:choose>
	                                	<c:when test="${editDept.parent.id eq department.id }">
			                                <option value="${department.id }" selected="selected">${department.name }</option>
	                                	</c:when>
	                                	<c:otherwise>
			                                <option value="${department.id }">${department.name }</option>
	                                	</c:otherwise>
	                                </c:choose>
                                </c:forEach>
                            </select>
                        </td>
                    </tr>
                    <tr><td>部门名称</td>
                        <td><input name="name" value="${editDept.name }" class="InputStyle" type="text"> *</td>
                    </tr>
                    <tr><td>职能说明</td>
                        <td><textarea name="description" class="TextareaStyle">${editDept.description }</textarea></td>
                    </tr>
                </tbody></table>
            </div>
        </div>
        
        <!-- 表单操作 -->
        <div id="InputDetailBar">
            <input src="${pageContext.request.contextPath }/style/images/save.png" type="image">
            <a href="javascript:history.go(-1);"><img src="${pageContext.request.contextPath }/style/images/goBack.png"></a>
        </div>
    </form>
</div>

<div class="Description">
	说明：<br>
	1，上级部门的列表是有层次结构的（树形）。<br>
	2，如果是修改：上级部门列表中不能显示当前修改的部门及其子孙部门。因为不能选择自已或自已的子部门作为上级部门。<br>
</div>



</body></html>