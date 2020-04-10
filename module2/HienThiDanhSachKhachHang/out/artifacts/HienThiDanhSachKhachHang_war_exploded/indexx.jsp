<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 21/2/2020
  Time: 11:31 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>c:set example</title>
</head>
<body>
<h2>c:set example</h2>
<c:set scope="request" var="greeting" value="Hello every body" />
Greeting: <c:out value="${greeting}"/>
</body>
</html>
