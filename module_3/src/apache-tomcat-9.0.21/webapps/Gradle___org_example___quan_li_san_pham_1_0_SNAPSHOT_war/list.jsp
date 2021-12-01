<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: WIN-PRO
  Date: 31/10/2021
  Time: 22:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Products</h1>
<a href="">Create new product</a>
<table border="1">
    <tr>
        <td>STT</td>
        <td>ID</td>
        <td>Name</td>
        <td>Description</td>
        <td>Price</td>
        <td>Edit</td>
        <td>Delete</td>
    </tr>
    <c:forEach items="${['product']}" var="product">
        <tr>
            <td><c:out value="${product.id}"/></td>
            <td><c:out value="${product.tenSanPham}"/></td>
            <td><c:out value="${product.gia}"/></td>
            <td><c:out value="${product.moTaSanPham}"/></td>
            <td><c:out value="${product.namSanXuat}"/></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>