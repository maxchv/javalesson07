<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Hello World</h1>
<form method="post">
    <input name="name"/>
    <input type="submit">
</form>
<%
    if(request.getAttribute("name")!=null) {
        out.println("Your name " + request.getAttribute("name"));
    }
%>
</body>
</html>
