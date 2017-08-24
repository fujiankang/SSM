<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Ajax请求页面验证</title>
</head>
<script type="text/javascript" src="http://apps.bdimg.com/libs/jquery/2.1.4/jquery.min.js"></script>
<script type="text/javascript">
    $(
        function () {
            $("button").click(function () {
                $.ajax({
                    url:"test/ajax.do",
                    data:{
                        name:"zs",
                        age:23
                    },
                    success:function (data) {
                        var json=eval("("+data+")");
                        alert(json.name+"      "+json.age);
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
