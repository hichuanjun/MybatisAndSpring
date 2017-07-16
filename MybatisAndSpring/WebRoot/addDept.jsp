<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>添加和修改</title>
<%--
<style type="text/css">
table{
	height:400px;
	width:800px;
	background-color:#963;
	border:1px;
	}
td{
		font-size:200%;
	}
</style>
 --%>
<!-- 引入jQuery包 -->
<script type="text/javascript" src="../js/jquery-1.8.3.min.js"></script>
<script>

</script>

</head>
<body>

	<center>
	${method}
		<form action="../${method}" method="post">
		<table>
		<input type="hidden" id="oldDeptno" name="oldDeptno" value="${dept.deptno}"/>
			<tr><td>请输入部门号</td><td><input id="deptno" name="deptno" value="${dept.deptno}"/></td></tr>
			<tr><td>请输入部门名</td><td><input id="dname" name="dname" value="${dept.dname}"/></td></tr>
			<tr><td>请输入所在地</td><td><input id="loc" name="loc" value="${dept.loc}"/></td></tr>
		</table>
		<button type="submit">确定</button>
		</form>
		
	</center>
	
</body>
</html>