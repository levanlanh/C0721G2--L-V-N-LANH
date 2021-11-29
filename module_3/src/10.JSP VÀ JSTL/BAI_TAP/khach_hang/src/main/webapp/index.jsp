<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 11/29/2021
  Time: 11:32 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
    <style>
      tr td {
        padding: 30px;
      }
    </style>
  </head>
  <body>
 <h2>Danh Sách Khách Hàng</h2>
  <table border="1" bgcolor="#f5f5dc" style="border: 1px solid aquamarine" >
    <tr>
      <th >STT</th>
      <th>Tên</th>
      <th>Ngày Sinh</th>
      <th>Địa Chỉ</th>
      <th>Ảnh</th>
    </tr>
    <c:forEach var="kh" items="${danhsach}" varStatus="stt">
      <tr>
        <td>${stt.count}</td>
        <td><c:out value="${kh.name}" /> </td>
        <td><c:out value="${kh.dateOfBirth}"/></td>
        <td><c:out value="${kh.address} "/></td>
        <td><img width="80px" height="80px" src="<c:out value="${kh.img}"/>" alt=""></td>
      </tr>
    </c:forEach>
  </table>
  </body>
</html>
