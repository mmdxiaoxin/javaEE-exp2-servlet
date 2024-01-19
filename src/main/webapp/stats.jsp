<%--
  Created by IntelliJ IDEA.
  User: mmdxiaoxin
  Date: 2023/10/29
  Time: 17:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>生命周期事件</title>
</head>
<body>
<p>当前应用启动时间：<%=application.getAttribute("StartDate") %>
</p>
<p>当前在线人数：<%=application.getAttribute("sessionCnt") %>
</p>
<p>处理请求数：<%=application.getAttribute("reqcnt") %>
</p>
</body>
</html>

