<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>查询用户</title>
</head>
<body>
<form action="user/selectUserById.do" method="post">
    输入要查询的id: <input type="text" name="id" />
    <button type="submit">提交</button>
</form>
<a href="/user/show">查询全部同学信息</a>
</body>
</html>

