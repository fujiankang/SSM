<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>文件上传到应用服务器</title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/test/upload2.do" method="POST"
          enctype="multipart/form-data">
    文件:<input type="file" name="imgs"/><br/>
        <input type="submit" value="上传"/>
    </form>
</body>
</html>
