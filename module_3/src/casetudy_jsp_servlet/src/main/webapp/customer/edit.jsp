<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Update</title>
</head>
<body>
<h1>Update Customer</h1>
<h3>Edit Customer</h3>

<form method="post">
    <fieldset>
        <legend>Information Customer</legend>
        <table>
            <tr>
                <td>Id:</td>
                <td><input readonly type="text" name="customerId" value="${customer.getCustomerId()}"></td>
            </tr>
            <tr>
            <tr>
            <td>CustomerTypeId:</td>
            <td><input type="text" name="customerTypeId" value="${customer.getCustomerTypeId()}"></td>
        </tr>
            <tr>
                <td>Name:</td>
                <td>
                    <input type="text" name="customerName" id="name" value="${customer.getCustomerName()}">
                </td>
            </tr>
            <tr>
                <td>Birthday:</td>
                <td>
                    <input type="text" name="birthday" id="birthday" value="${customer.getBirthday()}">
                </td>
            </tr>
            <tr>
                <td>Gender:</td>
                <td>
                    <select name="gender">
                        <option value="Male">Male</option>
                        <option value="Female">Female</option>
                    </select>
                </td>
            </tr>
            <tr>
            <tr>
                <td>IdCard:</td>
                <td>
                    <input type="text" name="idCard" id="idCard" value="${customer.getIdCard()}">
                </td>
            </tr>
            <tr>
                <td>Phone:</td>
                <td>
                    <input type="text" name="phone" id="phone" value="${customer.getPhone()}">
                </td>
            </tr>
            <tr>
                <td>email:</td>
                <td>
                    <input type="text" name="email" id="email" value="${customer.getEmail()}">
                </td>
            </tr>
            <td>address:</td>
            <td>
                <input type="text" name="address" id="address" value="${customer.getAddress()}">
            </td>
            </tr>
            <td><button type="submit">Update</button></td>
            </tr>
        </table>
    </fieldset>
</form>
<div><a href="/customer">Back to List of Customer</a></div>

</body>
</html>