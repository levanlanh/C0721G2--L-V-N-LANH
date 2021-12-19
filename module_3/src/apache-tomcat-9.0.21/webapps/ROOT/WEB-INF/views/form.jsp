<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 12/18/2021
  Time: 8:40 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="FORM" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
    <style>
        table {
            border: 1px solid black;
            border-collapse: collapse;
        }
    </style>
</head>
<body>
<h2 style="text-align: center">Tờ Khai Y Tế</h2>
<h4 style="text-align: center">ĐÂY LÀ TÀI LIỆU QUAN TRỌNG, THÔNG TIN CỦA ANH/CHỊ SẼ GIÚP CÁ CƠ QUAN Y TẾ LIÊN LẠC KHI
    CẦN THIẾT ĐỂ PHÒNG CHỐNG DỊCH</h4>
<H6 style="text-align: center;color: red">Khuyến cáo: khai thông tin sai là vi phạm pháp luật </H6>
<form:form action="/result" method="post" modelAttribute="nguoiKhai">
    <table style="font-weight: bold;width: 100%;background-color: aqua">
        <tr>
            <td><form:label path="ten" for="name1"><strong>Họ Và Têm</strong></form:label></td>
        </tr>
        <tr>
            <td><form:input path="ten" id="name1"></form:input></td>
        </tr>
        <tr>
            <td><form:label path="ngaySinh">Năm Sinh</form:label></td>
            <td><form:label path="gioiTinh">Giới Tính</form:label></td>
            <td><form:label path="quocGia">Quốc gia</form:label></td>
        </tr>
        <tr>
            <td><form:input path="ngaySinh" type="date"></form:input></td>
            <td><form:select path="gioiTinh">
                <form:options items="${gioiTinh}"></form:options>
            </form:select></td>
        </tr>
        <tr>
            <td><form:select path="quocGia">
                <form:options items="${quocGia}"></form:options>
            </form:select></td>
            <td></td>
        </tr>
        <tr>
            <td><form:label path="cmnd" for="cmnd">CMND (thẻ căn cước công dân)</form:label></td>
        </tr>
        <tr>
            <td><form:label path="phuongTien" for="phuongTien">Thông tin đi lại: </form:label></td>
        </tr>
        <tr>
            <td><form:label path="soPhuongTien" for="soPhuongTien">Số hiệu phương tiện: </form:label></td>
        </tr>
        <tr>
            <td><form:label path="soGhe" for="soGhe">Số ghế: </form:label></td>
        </tr>
        <tr>
            <td><form:input path="ngayKhoiHanh" id="ngayKhoiHanh" type="date"></form:input></td>
            <td><form:input path="ngayKetThuc" id="ngayKetThuc" type="date"></form:input></td>
        </tr>
        <tr>
            <td>Địa chỉ liên lạc</td>
        </tr>
        <tr>
            <td><form:label path="thanhPho" for="thanhPho"></form:label>Tỉnh/thành phố</td>
            <td><form:label path="huyen" for="huyen"></form:label>Quận/huyện</td>
            <td><form:label path="phuong" for="phuong"></form:label>Phường/xã</td>
            <td></td>
        </tr>
        <td><form:select path="thanhPho" id="thanhPho">
            <form:options items="${thanhPho}"></form:options>
        </form:select></td>
        <td><form:select path="huyen" id="huyen">
            <form:options items="${huyen}"></form:options>
        </form:select></td>
        <td><form:select path="phuong" id="phuong">
            <form:options items="${phuong}"></form:options>
        </form:select></td>
        <tr>
            <td><form:label path="sdt" id="sdt"></form:label>Số điện thoại</td>
            <td><form:label path="email" id="email"></form:label>Email</td>
        </tr>
        <tr>
            <td><form:input path="sdt" id="sdt"></form:input></td>
            <td><form:input path="email" id="email"></form:input></td>
        </tr>
        <tr>
            <td><input type="submit" value="send"></td>
        </tr>
    </table>
    <h3 style="color: red; font-weight: bold"> Dữ liệu bạn cung cấp hoàn toàn bảo mật và chỉ phục vụ cho việc phòng
        chống dịch</h3>
</form:form>

</body>
</html>
