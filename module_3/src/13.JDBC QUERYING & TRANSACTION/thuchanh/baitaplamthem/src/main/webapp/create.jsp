<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 29/10/21
  Time: 15:36
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create Form</title>
</head>
<body>
<h1>Create new SinhVien</h1>
<p>
    <c:if test='${requestScope["message"]!= null}'>
        <span class="message">${requestScope["message"]}</span>
    </c:if>
</p>
<p>
    <a href="/sinhvien">Back to SinhVien list</a>
</p>
<form method="post">
    <fieldset>
        <legend>Product information</legend>
        <table>
            <tr>
                <td>HoTen:</td>
                <td><input type="text" name="hoTen"></td>
            </tr>
            <tr>
                <td>GioiTinh:</td>
                <td><input type="text" name="gioiTinh"></td>
            </tr>
            <tr>
                <td>Tuoi:</td>
                <td><input type="text" name="tuoi"></td>
            </tr>
            <tr>
            <tr>
                <td>DiemTrungBinh:</td>
                <td><input type="text" name="diemTrungBinh"></td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" value="Create SinhVien"></td>
            </tr>
        </table>
    </fieldset>
</form>
</body>
</html>