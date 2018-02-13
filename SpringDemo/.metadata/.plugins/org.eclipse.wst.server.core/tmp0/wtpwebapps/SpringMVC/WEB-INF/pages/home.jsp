<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
 <%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"
  %>
  
  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

Hi,How are you? <br>

${message }<br>
<a href ="http://localhost:8080/SpringMVC/Ketaki?dept=abc">Ketaki</a><br>
<a href ="http://localhost:8080/SpringMVC/vibhuti?dept=pqr">vibhuti</a><br>
<a href ="http://localhost:8080/SpringMVC/Pooja">Pooja</a><br>
<a href ="http://localhost:8080/SpringMVC/Nidhi">Nidhi</a><br>



<br>
<br>
<br>


<b>Employee Registration From</b>
<sf:form modelAttribute="employee" method="POST">

ID:<sf:input path="id"/><sf:errors path="id"></sf:errors><br>
Name:<sf:input path="name"/><sf:errors path="name"></sf:errors><br>
Email:<sf:input path="email"/><sf:errors path="email"> </sf:errors><br>
<input type="submit" value="Register"/>
</sf:form>


<h2>List of Employees</h2>
<c:forEach items="${list}" var="e">
${e.id}~ ${e.name}~${e.email}<br>

</c:forEach>

</body>
</html>