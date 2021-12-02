<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Delete customer</h1>
<p>
    <a href="/product">Back to product list</a>
</p>
<form method="post">
    <h3>Are you sure?</h3>
    <fieldset>
        <legend>Customer information</legend>
        <table>
            <tr>
                <td>Name: </td>
                <td>${productList.getProductName()}</td>
            </tr>
            <tr>
                <td>Price: </td>
                <td>${productList.getProductPrice()}</td>
            </tr>
            <tr>
                <td>Description: </td>
                <td>${productList.getDescriptionProduct()}</td>
            </tr>
            <tr>
                <td>Manage: </td>
                <td>${productList.getProducer()}</td>
            </tr>
            <tr>
                <td><input type="submit" value="Delete product"></td>
                <td><a href="/product">Back to product list</a></td>
            </tr>
        </table>
    </fieldset>
</body>
</html>