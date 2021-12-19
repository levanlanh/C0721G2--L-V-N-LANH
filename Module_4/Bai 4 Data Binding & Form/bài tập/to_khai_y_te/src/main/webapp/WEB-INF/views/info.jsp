<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 12/19/2021
  Time: 10:18 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        table,th,td{
            border: 1px solid black;
            border-collapse: collapse;
        }
    </style>
</head>
<body>
<h2>Người Khai Thông Tin</h2>
<table style="">
    <tr>
        <Th>Ngày Sinh</Th>
        <Th>Giới Tính</Th>
        <Th>Quốc Gia</Th>
        <Th>CMND</Th>
        <Th>Thông tin đi lại</Th>
        <Th>Số hiệu phương tiện</Th>
        <Th>Số ghế</Th>
    </tr>
    <tr>
        <td>${nguoiKhai.ngaySinh}</td>
        <td>${nguoiKhai.gioiTinh}</td>
        <td>${nguoiKhai.quocGia}</td>
        <td>${nguoiKhai.cmnd}</td>
        <td>${nguoiKhai.phuongTien}</td>
        <td>${nguoiKhai.soPhuongTien}</td>
        <td>${nguoiKhai.soGhe}</td>
    </tr>
    <tr>
        <th>ngày khởi hành</th>
        <th>ngày kết thúc</th>
        <th>Thông tin di chuyển</th>
        <th>Thành phố</th>
        <th>Huyện</th>
        <th>Phường</th>
        <th>số điện thoại</th>
        <th>Email</th>
    </tr>
    <tr>
        <td>${nguoiKhai.ngayKhoiHanh}</td>
        <td>${nguoiKhai.ngayKetThuc}</td>
        <td>${nguoiKhai.thongTinDiChuyem}</td>
        <td>${nguoiKhai.thanhPho}</td>
        <td>${nguoiKhai.huyen}</td>
        <td>${nguoiKhai.phuong}</td>
        <td>${nguoiKhai.sdt}</td>
        <td>${nguoiKhai.email}</td>
    </tr>
</table>
</body>
</html>
