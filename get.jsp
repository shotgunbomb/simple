<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>

<head>
    <title>Java Code Geeks Snippets - Get Request Parameter in JSP Page</title>
</head>

<body>

     <% request.setCharacterEncoding("UTF-8"); %>
    Parameter myparam: <%= request.getParameter("myparam") %>

</body>

