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
                <td><input  type="text" name="employeeId" placeholder="Enter your id"></td>
            </tr>
            <tr> <tr>
            <td>employee Name:</td>
            <td><input type="text" name="employeeName" placeholder="Enter your name"></td>
        </tr>
            <tr>
                <td>position Id:</td>
                <td>
                    <input type="text" name="positionId" id="name" placeholder="Enter your positionId">
                </td>
            </tr>
            <tr>
                <td>degree Id:</td>
                <td>
                    <input type="text" name="degreeId" id="degreeId" placeholder="Enter your degreeId">
                </td>
            </tr>
            <tr>
                <td>division Id:</td>
                <td>
                    <input type="text" name="divisionId" id="divisionId" placeholder="Enter your divisionId">
                </td>
            </tr>
            <tr>
                <td>Birthday:</td>
                <td>
                    <input type="text" name="birthday" id="birthday" placeholder="Enter your birthday">
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
            <tr>
                <td>salary:</td>
                <td>
                    <input type="text" name="salary" id="salary" placeholder="Enter your salary">
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
<div><a href="/employee">Back to List of customer</a></div>

</body>
</html>