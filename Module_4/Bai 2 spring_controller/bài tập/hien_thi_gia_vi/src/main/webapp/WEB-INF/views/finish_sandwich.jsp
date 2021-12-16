<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 12/16/2021
  Time: 4:12 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <h1 style="color: darkslateblue;"> You added spice to the Sandwich :
        <c:forEach var="show" items="${requestScope.spicelist}" >
            ${show}
        </c:forEach>;
    </h1>
</body>
</html>
