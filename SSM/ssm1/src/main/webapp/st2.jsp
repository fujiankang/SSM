<html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<body>
<h2>数据验证</h2>
<form action="${pageContext.request.contextPath}/test/v1.do">
    姓名：<input type="text"  name="name" />${nameErrorMSG}<br>
    成绩：<input type="text" name="score"/>${scoreErrorMSG}<br>
    手机号码：<input type="text" name="mobile"/>${mobileErrorMSG}<br>
    <input type="submit" value="注册">
</form>
</body>
</html>
