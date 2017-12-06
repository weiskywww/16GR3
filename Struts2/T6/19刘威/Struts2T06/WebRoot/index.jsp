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
    
    <title><s:text name="label.title"></s:text></title>
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
	<s:form action="global" method="post" >
		<s:textfield key="global.username" name="user.username"/>
		<s:password key="global.password" name="user.password"/>
		<s:submit key="global.submit" name="global.login"/>
	</s:form>
	
	<s:url id="localeEN" namespace="/" action="local">
		<s:param name="requst_locale">en_US</s:param>
	</s:url>
	<s:url id="localezhCN" namespace="/" action="local">
		<s:param name="requst_locale">zh_CN</s:param>
	</s:url>
	<s:a href="%{localeEN}">English</s:a>
	<s:a href="%{localezhCN}">Chinese</s:a>
  </body>
</html>
