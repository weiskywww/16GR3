<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'userAdd.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<link type="text/css" rel="stylesheet" href="css/style.css">
</head>
<body>
	<div class="main">
		<div class="optitle clearfix">
			<div class="title">用户管理&gt;&gt;</div>

		</div>
		<s:form action="AddUser" method="post" namespace="/" enctype="multipart/form-data">
			<s:textfield label="用户姓名" name="user.userName" cssClass="text"/>
			<s:password label="用户密码" name="user.userPassword" cssClass="text"/>
			<s:radio label="性别" name="user.userSex" list="#{'m':'男','s':'女' }" value="m"/>
			<s:textfield label="年龄" name="user.userAge"  cssClass="text"/>
			<s:textfield label="电话" name="user.telephone"  cssClass="text"/>
			<s:textfield label="地址" name="user.address"  cssClass="text"/>
			<s:radio label="权限" name="user.type" list="#{1:'管理员',0:'普通用户' }" value="0"/>
			<s:file label="头像" name="user.pic"></s:file>
			<s:submit value="添加" cssClass="input-button"></s:submit>
		</s:form>
		</div>
		
</body>
</html>