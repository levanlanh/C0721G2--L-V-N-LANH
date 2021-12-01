<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 10/28/2021
  Time: 1:21 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
  <title>Product List</title>
</head>
<body>
<h2>Products management</h2>
<a href="/product?action=create">Create a new product</a>
<a href="/product?action=search">Find product</a>

<table border="1">
  <tr>
    <th>Id</th>
    <th>Product Name</th>
    <th>Price</th>
    <th>Product description</th>
    <th>Producer</th>
    <th>Edit</th>
    <th>Delete</th>

  </tr>
  <c:forEach var="productObj" items="${productList}" >
    <tr>
      <td>${productObj.productId}</td>
      <td>${productObj.productName}</td>
      <td>${productObj.productPrice}</td>
      <td>${productObj.descriptionProduct}</td>
      <td>${productObj.producer}</td>
      <td><a href="/product_servlet?action=edit&productId=${productObj.getProductId()}">edit</a></td>
      <td><a href="/product_servlet?action=delete&productId=${productObj.getProductId()}">delete</a></td>
    </tr>
  </c:forEach>
</table>
</body>
</html>