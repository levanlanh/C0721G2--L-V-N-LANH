<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 12/1/2021
  Time: 10:50 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>

  <p>
    <c:if test='${requestScope["message"]!= null}'>
      <span class="message">${requestScope["message"]}</span>
    </c:if>
  </p>
  </body>
</html>
