<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>BlueBrains Auditing Services Internal Portal-TimeSheets List</h1>
	<hr/>
	<form action="listTimeSheets.htm">
	<p align="center">Enter Employee Id:<input type="text" name="id"/><input type="submit" name="Fetch"/>
	</p>
	</form>
	
<c:if test="${message eq 'N'}">
<p style="background-color:AQUA">
<br/>
No time Sheets Recorded !
</p>
</c:if>
	
	<c:if test="${message eq 'Y'}">

<table border=1 >
<tr><th rowspan=2>EmpID</th><th rowspan=2>Date</th><th colspan=8 align="center">Hour Wise Activities</th></tr>
<tr><td>1st</td><td>2nd</td><td>3rd</td><td>4th</td><td>5th</td><td>6th</td><td>7th</td><td>8th</td></tr>
<c:forEach items="${empList}" var="emp">


<tr><td>${emp.empId}</td><td>${emp.timesheetDate}</td><td>${emp.hour1}</td><td>${emp.hour2}</td><td>${emp.hour3}</td><td>${emp.hour4}</td><td>${emp.hour5}</td><td>${emp.hour6}</td><td>${emp.hour7}</td><td>${emp.hour8}</td></tr>

</c:forEach>
</table>
</c:if>
	
	<br/>
	<a href="home.htm">Home</a>
</body>
</html>