<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>

</head>
<body>
<c:forEach var="list" items="${list}">
   ${list.id}
   ${list.pw}
</c:forEach>
<!-- item 객체의 getId()호출하는 것 getter 없으면 오류 발생 -->
</body>
</html>
