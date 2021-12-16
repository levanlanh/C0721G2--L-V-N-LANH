<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 12/16/2021
  Time: 3:46 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Mennu sandwich</title>
  </head>
  <body>
  <h1>Mennu Spice Sanwich</h1>
  <form action="/finish" method="post">
    <input type="checkbox" value="lettuce" name="spice">
    <span>Lettuce</span><br>
    <input type="checkbox" value="tomato" name="spice">
    <span>tomato</span><br>
    <input type="checkbox" value="mustard" name="spice">
    <span>mustard</span><br>
    <input type="checkbox" value="sprouts" name="spice">
    <span>sprouts</span><br>
    <hr>
    <button type="submit" >Save</button>
  </form>
  </body>
</html>
