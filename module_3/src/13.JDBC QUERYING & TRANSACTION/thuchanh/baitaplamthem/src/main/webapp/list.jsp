<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>SinhVien Management</title>
    <style>
        table{
            border-collapse: collapse;
        }
    </style>
</head>
<body>
<h1>SinhVien Management</h1>
<p><a href="/sinhvien?notice=create">Create new SinhVien</a></p>
<%-- cách 1 dùng nút bấm với form để sort--%>
<form action="/sinhvien?notice=sort" method="post">
    <button type="submit">Sort</button>
</form>
<%--cách 2 dùng thẻ a khi dùng thẻ a thì mặc định là get--%>
<%--<p><a href="/users?userAction=sort">Sort by Name</a></p>--%>
<form action="/sinhvien?notice=search" method="post">
    <table>
        <tr>
            <td><input type="text" name="country" id="country" placeholder="Enter country "></td>
            <td><button type="submit">Search</button></td>
        </tr>
    </table>
</form>
<h3>List of Users</h3>
<form method="post">
    <table border="1" >
        <tr>
            <th>ID</th>
            <th>HoTen</th>
            <th>GioiTinh</th>
            <th>Tuoi</th>
            <th>DiemTrungBinh</th>
        </tr>
        <c:forEach var="user" items="${sinhVienList}">
            <tr>
                <td>${user.id}</td>
                <td>${user.hoTen}</td>
                <td>${user.gioiTinh}</td>
                <td>${user.tuoi}</td>
                <td>${user.diemTrungBinh}</td>
                <td>
                    <a href="/users?notice=edit&id=${user.getId()}">Edit</a>
                    <a href="/users?notice=delete&id=${user.getId()}">Delete</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</form>

</body>
</html>