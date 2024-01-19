<%--
  Created by IntelliJ IDEA.
  User: mmdxiaoxin
  Date: 2023/10/23
  Time: 20:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>表单提交结果</title>
</head>
<body>
<h1>表单提交结果</h1>
<p>姓名: ${name}</p>
<p>性别: ${gender}</p>
<p>年龄: ${age}</p>
<p>爱好:
    <c:forEach items="${hobbies}" var="hobby">
        ${hobby}
    </c:forEach>
</p>
<a href="/exp2/form1.jsp">返回</a>
</body>
</html>

