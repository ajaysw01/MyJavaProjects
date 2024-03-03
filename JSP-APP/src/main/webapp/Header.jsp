<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
div{
background-color: red;
color : white
}
</style>
</head>
<body>
<div>
<h1>JSP DEMO APP</h1>
<p>Usages of Directives</p>
</div>


<p>Current Date is  : <%=new Date().toString() %></p>

</body>
</html>