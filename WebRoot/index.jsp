<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body>
		<form action="user" method="post">
			<input type="submit" value="用户添加" />
		</form>
		<form action="user" method="get">
			<input type="submit" value="用户查询" />
		</form>
		<form action="user" method="post">
			<input type="hidden" name="_method" value="put" />
			<input type="submit" value="用户更新" />
		</form>
		<form action="user" method="post">
			<input type="hidden" name="_method" value="delete" />
			<input type="submit" value="用户删除" />
		</form>
	</body>
</html>
