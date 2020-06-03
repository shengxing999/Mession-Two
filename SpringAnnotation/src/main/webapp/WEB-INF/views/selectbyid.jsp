<%--
  Created by IntelliJ IDEA.
  User: wangpeng
  Date: 2020/1/2
  Time: 9:07 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8"%>
<%@ page import="com.wp.sm.beans.User" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>Insert title here</title>
    <style type="text/css">
        .td td{
            width: 100px;
        }
        .table{
            text-align: center;
            margin: 0 auto;
        }
    </style>
</head>
<body>
<%
    User user = ((User)request.getAttribute("user"));
%>

<table class="table">
    <tr class="td">
        <td>ID</td>
        <td>姓名</td>
        <td>qq</td>
<%--        <td style="width: 200px">公司</td>--%>
        <td>职业</td>
        <td>学校</td>
    </tr>
    <%if(user!=null){%>
    <tr class="td">
        <td><%=user.getId()%></td>
        <td><%=user.getName()%></td>
        <td><%=user.getQq()%></td>
        <td><%=user.getJob()%></td>
        <td><%=user.getSchool()%></td>
    </tr>
    <%}else{ %>
    <tr class="td">
        <td style="color: red;">暂无相关数据</td>
    </tr>
    <%} %>
</table>

</body>
</html>

