<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Student : Create</title>
</head>
<h1>Student create</h1>
<form:form modelAttribute="student" action="studentcreatesubmit" method="get" id="index-form"> 
	<table id="student-form-table">
		<tr id="student-form-tr">
			<td><form:label path="firstName"></form:label><td>
			<td><form:input path="firstName" /><td>
		</td>
		<tr id="student-form-tr">
			<td><form:label path="lastName"></form:label><td>
			<td><form:input path="lastName" /><td>
		</td>
		<td><input type="submit" value="create"/>
	</table>
</form:form>
</html>