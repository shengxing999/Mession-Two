<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改学生信息</title>
</head>
<body>
<h2>编辑学生信息</h2>
<form id="updateForm" action="${pageContext.request.contextPath}/user/update" method="post">
    <input type="hidden" name="_method" value="PUT">
    <input type="hidden" value="${user.id}" name="id"/>
    <table align="center" bgcolor="lightgrey" border="1" cellpadding="0">
        <tr>
            <td>姓名：</td>
            <td><input type="text" value="${user.name}" name="name"/></td>
        </tr>
        <tr>
            <td>创建时间：</td>
            <td><input type="text" value="${user.create_at}" name="create_at"/></td>
        </tr>
        <tr>
            <td>更新时间：</td>
            <td><input type="text" value="${user.update_at}" name="update_at"/></td>
        </tr>
        <tr>
            <td>QQ：</td>
            <td><input type="text" value="${user.qq}" name="qq"/></td>
        </tr>
        <tr>
            <td>职业：</td>
            <td><input type="text" value="${user.job}" name="job"/></td>
        </tr>
        <tr>
            <td>到达日期：</td>
            <td><input type="text" value="${user.arrive_time}" name="arrive_time"/></td>
        </tr>
        <tr>
            <td>学校：</td>
            <td><input type="text" value="${user.school}" name="school"/></td>
        </tr>
        <tr>
            <td>学号：</td>
            <td><input type="text" value="${user.student_id}" name="student_id"/></td>
        </tr>
        <tr>
            <td>日报链接：</td>
            <td><input type="text" value="${user.link}" name="link"/></td>
        </tr>
        <tr>
            <td>期望：</td>
            <td><input type="text" value="${user.wish}" name="wish"/></td>
        </tr>
        <tr>
            <td>了解方式：</td>
            <td><input type="text" value="${user.known_ways}" name="known_ways"/></td>
        </tr>
        <tr>
            <td>师兄：</td>
            <td><input type="text" value="${user.bro}" name="bro"/></td>
        </tr>
            <input type="submit" value="更新"/>
    </table>
</form>
</body>
</html>

