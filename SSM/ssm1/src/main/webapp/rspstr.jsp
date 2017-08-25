<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>返回值类型为Object，数据类型为字符串</title>
</head>
<script type="text/javascript" src="http://apps.bdimg.com/libs/jquery/2.1.4/jquery.min.js"></script>
<script type="text/javascript">
    $(
        function () {
            $("button").click(function () {
                $.ajax({
                    url:"test/rspstr.do",
                    success:function (data) {
                        alert(data)
                    }
                });
            });
        }
    );
</script>
<body>
<button>提交Ajax请求</button>
</body>
</html>
