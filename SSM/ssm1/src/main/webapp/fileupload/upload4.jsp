<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>上传多个文件到应用服务器</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/test/upload4.do" method="POST"
      enctype="multipart/form-data">
    文件1:<input type="file" name="igs"/><br/>
    文件2:<input type="file" name="igs"/><br/>
    文件3:<input type="file" name="igs"/><br/>
          <input type="submit" value="上传"/>
</form>
</body>
</html>
