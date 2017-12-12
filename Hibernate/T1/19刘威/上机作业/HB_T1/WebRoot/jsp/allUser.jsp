<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
.wrap{
	text-align: center;
	margin: 0 auto;
}
table{
	width: 75%;
}
</style>
</head>
<body>
	<a href="jsp/add.jsp">添加用户</a>
	<div class="wrap">
		<h2>用户列表</h2>
		<table border="1px">
			<tr>
				<td>用户ID</td>
				<td>用户姓名</td>
				<td>用户密码</td>
				<td>用户生日</td>
				<td>用户性别</td>
				<td>是否启用</td>
				<td>操作</td>
			</tr>
			<s:iterator value="users" var="user">
				<tr>
					<td>${user.uid }</td>
					<td>${user.uname }</td>
					<td>${user.upassword }</td>
					<td>${user.birthday }</td>
					<td>
						<s:if test='#user.sex == "M"'>
							男
						</s:if>
						<s:else>
							女
						</s:else>
					</td>
					<td>
						<s:if test="#user.enable == 1">
							是
						</s:if>
						<s:else>
							否
						</s:else>
					</td>
					<td>
						<!-- 
						1，先查询当前用户信息，参数id
						2,进入修改页面并设置用户信息
						3,修改提交
						 -->
						<a href="toUpdate?user.uid=${user.uid }">修改</a>
						
						<a href="delete?user.uid=${user.uid}">删除</a>
					</td>
				</tr>
			</s:iterator>
		</table>
	</div>
</body>
</html>