<%--
  Created by IntelliJ IDEA.
  User: mmdxiaoxin
  Date: 2023/10/27
  Time: 21:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>登录页面</title>
</head>
<body>
<h1>登录页面</h1>
<form action="${pageContext.request.contextPath}/loginServlet" method="post">
    <label for="username">账号:</label>
    <input type="text" id="username" name="username" required><br><br>

    <label for="password">密码:</label>
    <input type="password" id="password" name="password" required><br><br>

    <label for="rememberMe">记住账号和密码:</label>
    <input type="checkbox" id="rememberMe" name="rememberMe" value="true">
    <input type="submit" id="submitForm" name="登陆">
</form>
</body>
</html>
