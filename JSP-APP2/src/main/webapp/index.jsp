<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@page errorPage="error_page.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Taglib Directive</title>
</head>
<body>
<h1>Error Handling in jsp</h1>
<%!
	int n1 = 20;
int n2= 10;

%>
<%
int div = n1/n2;

%>
<h2><%=div %></h2>
<%
out.print("<hr>");
%>

<%



%>

</body>
</html>