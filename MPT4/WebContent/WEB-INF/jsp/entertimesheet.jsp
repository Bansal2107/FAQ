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
	<h1>BlueBrains Auditing Services Internal Portal - TimeSheet Entry</h1>
	<hr />
	<form:form action="addTimeSheet.htm" method="post"
		modelAttribute="timeSheet">
		<table>
			<tr>
				<td>Employee Id:</td>
				<td><form:input path="empId" />
				    <form:errors path="empId" /></td>
			</tr>
			<tr>
				<td>Time Sheet Date:</td>
				<td><form:input path="timesheetDate" placeholder="dd-MM-yyyy" />
					<form:errors path="timesheetDate" /></td>
			</tr>
			<tr>
				<td>First Hour Activity:</td>
				<td><form:select path="hour1">
						<form:option value="" label="Please Select" />
						<form:options items="${hourList}" />
					</form:select> <form:errors path="hour1" /></td>


			</tr>

			<tr>
				<td>Second Hour Activity:</td>
				<td><form:select path="hour2">
						<form:option value="" label="Please Select" />
						<form:options items="${hourList}" />
					</form:select> <form:errors path="hour2" /></td>
			</tr>

			<tr>
				<td>Third Hour Activity:</td>
				<td><form:select path="hour3">
						<form:option value="" label="Please Select" />
						<form:options items="${hourList}" />
					</form:select> <form:errors path="hour3" /></td>
			</tr>

			<tr>
				<td>Fourth Hour Activity:</td>
				<td><form:select path="hour4">
						<form:option value="" label="Please Select" />
						<form:options items="${hourList}" />
					</form:select> <form:errors path="hour4" /></td>
			</tr>

			<tr>
				<td>Fifth Hour Activity:</td>
				<td><form:select path="hour5">
						<form:option value="" label="Please Select" />
						<form:options items="${hourList}" />
					</form:select> <form:errors path="hour5" /></td>
			</tr>

			<tr>
				<td>Sixth Hour Activity:</td>
				<td><form:select path="hour6">
						<form:option value="" label="Please Select" />
						<form:options items="${hourList}" />
					</form:select> <form:errors path="hour6" /></td>
			</tr>

			<tr>
				<td>Seventh Hour Activity:</td>
				<td><form:select path="hour7">
						<form:option value="" label="Please Select" />
						<form:options items="${hourList}" />
					</form:select> <form:errors path="hour7" /></td>
			</tr>

			<tr>
				<td>Eighth Hour Activity:</td>
				<td><form:select path="hour8">
						<form:option value="" label="Please Select" />
						<form:options items="${hourList}" />
					</form:select> <form:errors path="hour8" /></td>
			</tr>

			<tr>
				<td></td>
				<td><input type="submit" value="Save" /></td>
			</tr>
		</table>
	</form:form>

	<a href="home.htm">Home</a>
</body>
</html>