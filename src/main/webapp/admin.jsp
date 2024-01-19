<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: mmdxiaoxin
  Date: 2023/10/29
  Time: 16:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>admin</title>
</head>
<body>
<h1>Admin页面</h1>
<br/>
<a href="<c:url value="/serv"/>">firstServlet</a>
<br/>
<a href="<c:url value="/servFix"/>">secondServlet</a>
<br/>
<a href="<c:url value="/form1.jsp"/>">form1.jsp</a>
<br/>
<a href="<c:url value="/login.jsp"/>">login.jsp</a>
<br/>
<a href="<c:url value="/stats.jsp"/>">stats.jsp</a>
<br/>
</body>
</html>
