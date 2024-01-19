<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %>
</h1>
<br/>
<a href="<c:url value="/serv"/>">firstServlet</a>
<br/>
<a href="<c:url value="/servFix"/>">secondServlet</a>
<br/>
<a href="<c:url value="/form1.jsp"/>">form1.jsp</a>
<br/>
<a href="<c:url value="/login.jsp"/>">login.jsp</a>
<br/>
</body>
</html>