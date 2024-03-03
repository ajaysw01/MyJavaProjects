<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 
 <%@page import="java.util.Random, java.util.ArrayList, java.io.*" %>
 <%@page session="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1> Jsp tages Demo</h1>

	

	<%!
		int a = 10;
		int b = 10;
		String name = "Ajjubhai";
		
		public int doSum(){
			return a+b;
		}
		
		public String reverse(){
			StringBuffer sb = new StringBuffer(name);
			return sb.reverse().toString();
		}
	%>
	
	<%
	
		out.println("<hr>");
		out.println(a);
		out.println(b);
		out.println("<br>");
		out.println("Sum is :"+doSum());
		out.println("<hr>");
		
	%>
	
	<h1>Sum i s : <%=doSum() %>
		<h1>reverse is : <%=reverse() %>
		
		
<%
out.println("<hr>");

%>

<%@include file="Header.jsp" %>

<%

Random r = new Random();
int n = r.nextInt(10);

%>
<%=n %>
<%
out.println("<hr>");

%>
</body>
</html>