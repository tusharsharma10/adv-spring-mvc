<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix = "c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Student is confirmed: ${student2.firstName }  ${ student2.lastName} </h1>
<br><br>
<h1>Country: ${student2.country} </h1>
<br><br>
<h1>Student's Favorite language is: ${student2.favLanguage} </h1>
<h1>Student's Favorite OS is/are:</h1>
<ul>
<c:forEach var="temp" items="${student2.operatingSystems}">

<li>${temp}</li><br>

</c:forEach>

</ul>
 </body>
</html>