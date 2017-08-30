<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>消息类型转换</title>
</head>
<body>
<form action="/test/dbind2.do">
   周数：<input type="text"  name="week" value="${week}"/><span>${weekErr}</span><br>
    日期:<input type="text" name="date" value="${date}"/><span>${dateErr}</span><br>
    <input type="submit" value="查询">
</form>
</body>
</html>
