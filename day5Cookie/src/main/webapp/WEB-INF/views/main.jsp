<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
<meta charset="UTF-8">
	<title>Main</title>
</head>
<body>

<c:if test="${empty sessionScope.sessionId }">
login
</c:if>
<c:if test="${not empty sessionScope.sessionId }">
<a href="/cookie/login/logOut">logout</a>
</c:if>

</body>
</html>
