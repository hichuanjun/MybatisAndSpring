<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<%-- 
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt">http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
--%>
<%@ page import="java.util.*"%>
<%@ page import="com.vo.Dept"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>showdept</title>
<script type="text/javascript" src="../js/json2.js"></script>



</head>
<body>
	<center>  
		<caption>Dept表</caption>
		<table>
		<thead><tr><th>部门号</th><th>部门名</th><th>所在地</th><th>操作</th></tr></thead>
		<tbody>
		<c:forEach var="dept" items="${list}" varStatus="com.vo.Dept">
			<tr>
			<td>${dept.deptno}</td>
			<td>${dept.dname}</td>
			<td>${dept.loc}</td>
			<td>
			<!--问号风格--><a href="delete?deptno=${dept.deptno}">删除</a>
		
			<!-- rest风格<a href="delete/${dept.deptno}">删除</a> -->
				<a href="select/${dept.deptno}">修改</a>
			</td>
			</tr>
		</c:forEach>
		</tbody>
		</table>
		<a href="control/add">添加</a>
		</center>
</body>
</html>