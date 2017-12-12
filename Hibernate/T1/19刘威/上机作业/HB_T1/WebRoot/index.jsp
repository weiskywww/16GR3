<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
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
	<div class="wrap">
	<h2>添加用户</h2>
	<s:form action="add!add"  namespace="/"  method="post">
		<s:textfield label="用户名" name="user.uname" required="true"></s:textfield>
		<s:password label="密码" name="user.upassword" required="true"></s:password>
		<s:textfield label="生日" name="user.birthday" required="true"></s:textfield>
		<s:radio label="性别" name="user.sex" list="#{'M':'男','F':'女' }" value="'M'"></s:radio>
		<s:radio label="是否启用" name="user.enable" list="#{0:'否',1:'是' }" value="1"></s:radio>
		<s:submit value="添加"></s:submit>
	</s:form>
</div>
  </body>
</html>
