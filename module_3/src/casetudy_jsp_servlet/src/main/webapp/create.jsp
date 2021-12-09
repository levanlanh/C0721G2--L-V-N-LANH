<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create</title>
</head>
<body>
<h1>Create Customer</h1>
<h3>Edit Customer</h3>

<form method="post">
    <fieldset>
        <legend>Information Customer</legend>
        <table>
            <tr>
                <td>Id:</td>
                <td><input type="text" name="customerId" placeholder="Enter your id"></td>
            </tr>
            <tr> <tr>
                <td>CustomerTypeId:</td>
                <td><input type="text" name="customerTypeId" placeholder="Enter your customerTypeId"></td>
            </tr>
            <tr>
                <td>Name:</td>
                <td>
                    <input type="text" name="customerName" id="name" placeholder="Enter your Name">
                </td>
            </tr>
            <tr>
                <td>Birthday:</td>
                <td>
                    <input type="text" name="birthday" id="birthday" placeholder="Enter your birthday">
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
                    <input type="text" name="idCard" id="idCard" placeholder="Enter your idCard">
                </td>
            </tr>
            <tr>
                <td>Phone:</td>
                <td>
                    <input type="text" name="phone" id="phone" placeholder="Enter your phone">
                </td>
            </tr>
            <tr>
                <td>email:</td>
                <td>
                    <input type="text" name="email" id="email" placeholder="Enter your email">
                </td>
            </tr>
                <td>address:</td>
                <td>
                    <input type="text" name="address" id="address" placeholder="Enter your address">
                </td>
            </tr>
                <td><button type="submit">Create</button></td>
            </tr>
        </table>
    </fieldset>
</form>
<div><a href="/customer">Back to List of Student</a></div>

</body>
</html>