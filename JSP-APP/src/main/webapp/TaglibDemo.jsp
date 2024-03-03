<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Taglib</title>
</head>
<body>

    <h2>TagLib Directive:</h2>
    <p>It is used when we want to use other tag library in our jsp page.
    such as JSTL (JSP Standard Tag Library) or custom library created by users.
    </p>
    <hr>
    <c:set var="name" value="Ajay wankhde"></c:set>
    <c:out value="${name }"></c:out>

</body>
</html>
