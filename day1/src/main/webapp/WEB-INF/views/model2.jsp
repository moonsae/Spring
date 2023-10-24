<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>

</head>
<body>
<c:forEach var="list" items="${list}">
   ${list}
</c:forEach>
</body>
</html>
