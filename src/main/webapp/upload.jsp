<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>upload</title>
</head>
<body>
<h2>Hello World!</h2>

<form action="upload" method="post" enctype="multipart/form-data" >
    <input type="file" name="file" /><br/>
    <input type="submit" value="上传" /><br/>
</form>
<span>当前IP：<%=request.getRemoteAddr() %></span>
</body>
</html>
