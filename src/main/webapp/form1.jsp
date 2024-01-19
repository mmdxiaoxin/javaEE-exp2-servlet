<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>表单提交</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/form" method="post">
    <label for="name">姓名:</label>
    <input type="text" id="name" name="name" required><br><br>

    <label>性别:</label>
    <input type="radio" id="male" name="gender" value="男"><label for="male">男</label>
    <input type="radio" id="female" name="gender" value="女"><label for="female">女</label><br><br>

    <label for="age">年龄:</label>
    <input type="text" id="age" name="age" required><br><br>

    <label>爱好:</label>
    <input type="checkbox" id="sports" name="hobbies" value="运动"><label for="sports">运动</label>
    <input type="checkbox" id="travel" name="hobbies" value="旅游"><label for="travel">旅游</label>
    <input type="checkbox" id="reading" name="hobbies" value="阅读"><label for="reading">阅读</label>
    <input type="checkbox" id="sport" name="hobbies" value="体育"><label for="sport">体育</label><br><br>

    <input type="submit" value="提交">
</form>
</body>
</html>
