<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 12/17/2021
  Time: 2:20 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Setting</title>
</head>
<body>
<h3> Language</h3>
<form:form action="setting" method="post" modelAttribute="email">
    <fieldset>
        <table>
            <tr>
                <td>Language :</td>
                <td>
                    <form:select path="language" items="${language}"/>
                </td>
            </tr>
            <tr>
                <td>Page Size :</td>
                <td>
                <td>Show<form:select path="pageSize" items="${pageSize}"/> email per page
                </td>
            </tr>

            <tr>
                <td>Spams filter :</td>
                <td><form:checkbox path="spamsFilters" value="Thư rác"/> Enable spam filter</td>
            </tr>
            <tr>
                <td>Signature :</td>
                <td><form:textarea path="signature"/></td>
            </tr>
            <tr>
                <td></td>
                <td>
                    <button type="submit" onclick="return confirm('Do you want to save?')">Save</button>
                    <button onclick="location.href=''" type="button">Cancel</button>
                </td>

            </tr>
        </table>
    </fieldset>

</form:form>
</body>
</html>
