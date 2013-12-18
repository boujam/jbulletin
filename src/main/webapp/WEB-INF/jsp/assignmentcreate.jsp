<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!-- <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd"> -->
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Assignment create</h1>

<form action="assignmentcreatesubmit" method="get" id="assignment-form">
<h2>Choose a student</h2>
<input type="text" name=student list=student>
	<datalist id=student>
		<c:forEach var="student" items="${allstudents}">
			<option label="${student.firstName}-${student.lastName}" value="${student.id}"></option>
		</c:forEach>
	</datalist>
<h2>Choose a classroom</h2>
<input type=text name=classroom list=classroom>
	<datalist id=classroom>
		<c:forEach var="classroom" items="${allclassrooms}">
			<option label="${classroom.reference}-${classroom.fullReference}" value="${classroom.id}"></option>
		</c:forEach>
	</datalist>
<h2>Add a comment</h2>
<input type="text" name="comment"/>
<input type="submit" value="assign"/>
</form>
</body>
</html>