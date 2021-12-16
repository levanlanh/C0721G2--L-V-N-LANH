<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 12/16/2021
  Time: 4:52 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
 <h1>Calculation</h1>
  <form method="post">
    <input type="number" name="num1">
    <input type="number" name="num2">
    <br>
    <button name="sign" value="+">Addition(+)</button>
    <button name="sign" value="-">Subtraction(-)</button>
    <button name="sign" value="*">Multiplication(x)</button>
    <button name="sign" value="/">Division(/)</button>
  </form>
  <h2>Result is : ${result} </h2>
  </body>
</html>
