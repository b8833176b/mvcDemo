<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>欢迎</title>
</head>
<body>
<h2>Hello World!</h2>

<form action="login">
    <%--<spring:message code="username" />--%>
    <input id="username" name="username" type="text" /><br/>
    <%--<spring:message code="password" />--%>
    <input id="password" name="password" type="password" /><br/>
    <input type="submit" />
</form>
<span>当前IP：<%=request.getRemoteAddr() %></span>
</body>
</html>
