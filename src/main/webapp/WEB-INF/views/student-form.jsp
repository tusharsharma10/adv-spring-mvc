<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Registration form</title>
</head>
<body>

	<form:form action="processForm" modelAttribute="student2">
	FirstName:<form:input path="firstName" />
		<br>
		<br>
	LastName:<form:input path="lastName" />
		<br>
		<br>
		Country:
		<form:select path="country">
			<form:options items="${student2.countryList}" />

		</form:select>
		<br>
		<br>
		<form:radiobuttons path="favLanguage"
			items="${student2.favLanguageList }" />
		
		<br>
		<br>
		Operating Systems:
		Linux&nbsp<form:checkbox path="operatingSystems" value="Linux" />
		MACOS&nbsp<form:checkbox path="operatingSystems" value="MACOS" />
		Windows 10&nbsp<form:checkbox path="operatingSystems" value="Windows10" />

		<br>
		<br>

		<input type="submit" value="Submit Name">
	</form:form>

</body>
</html>