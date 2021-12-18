<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 12/17/2021
  Time: 3:14 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Language: ${email.language}</h1>
<h1>Page Size: ${email.pageSize}</h1>
<h1>Spams Filter:
    <c:if test="${email.spamsFilters != null}">
        ${email.spamsFilters}
    </c:if>
    <c:if test="${email.spamsFilters == null}">
        Diable abc
    </c:if>
</h1>
<h1>Signature: ${email.signature}</h1>
</body>
</html>
