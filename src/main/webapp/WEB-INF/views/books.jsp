<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:forEach items="${books}" var="book">
		
				<div class="col-md-3 col-xs-3">${book.name}</div>
				<div class="col-md-3 col-xs-3">${book.publishingDate}</div>
				<div class="col-md-3 col-xs-3">${book.author.firstName}</div>
				<div class="col-md-3 col-xs-3">${book.genre.name}</div>

</c:forEach>
</body>
</html>