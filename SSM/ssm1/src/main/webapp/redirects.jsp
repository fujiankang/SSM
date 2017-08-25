<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>重定向页面-获取数据</title>
</head>
<body>
<%--姓名=${name}<br>--%>
<%--年龄=${age}--%>
<!--
    param.age的底层执行的是request.getParameter("age")// 此方法获取到的是字符串
    requestScope.age的底层执行的是request.getAttribute("age")//此方法获取到的是整数
-->
姓名=${param.pname}<br>
年龄=${param.page}

</body>
</html>
