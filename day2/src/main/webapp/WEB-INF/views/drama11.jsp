
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>드라마 정보 출력</h2>

<c:forEach var="item" items="${dramaList}">
${item.code} 
${item.title} 
${item.actors} 
<br>
</c:forEach>

</body>
</html>