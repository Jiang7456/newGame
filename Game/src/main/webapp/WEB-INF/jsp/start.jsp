<%--
  Created by IntelliJ IDEA.
  User: pc
  Date: 2019-08-18
  Time: 11:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>GO!GO!GO!</title>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
    <script>
        function abc() {
            $.ajax({
                    type: "get",
                    url: "/gameStop",
                    data: {
                        stop: true
                    },
                    success(res) {
                        console.log(res)
                    }
                }
            )
        }
    </script>
</head>
<body>
<form action="/game" method="post">
    <table>
        <tr>
            <td>path</td>
            <td>
                <input type="text" name="path">
            </td>
        </tr>

        <tr>
            <td>x</td>
            <td>
                <input type="text" name="x">
            </td>
        </tr>

        <tr>
            <td>y</td>
            <td>
                <input type="text" name="y">
            </td>
        </tr>
        <tr>
            <td>
                <input type="submit" value="提交">
            </td>
            <td>
                    <input type="submit" onclick="abc()" value="终止">
            </td>
        </tr>
    </table>
</form>

<form action="/gameStop">
    <table>
        <tr>
            <td> <input type="submit" value="终止"></td>
        </tr>
    </table>
</form>
</body>
</html>
