<html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<body>
<h2>Hello World!</h2>
<img src="${pageContext.request.contextPath}/images/zl.jpg">
<form action="${pageContext.request.contextPath}/test/register.do">
    姓名：<input type="text"  name="name" /><br>
    年龄：<input type="text" name="age"/><br>
    <input type="submit" value="注册">
</form>
</body>
</html>
