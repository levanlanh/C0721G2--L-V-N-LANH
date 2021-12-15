<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit</title>
    <link rel="icon" href="https://image.flaticon.com/icons/png/512/458/458625.png" type="image/i-icon"/>
</head>
<body>
<h1>Create Employee</h1>
<h3>Edit Employee</h3>

<form method="post">
    <fieldset>
        <legend>Information Employee</legend>
        <table>
            <tr>
                <td>Id:</td>
                <td><input  readonly type="text" name="employeeId" value="${employee.getEmployeeId()}"></td>
            </tr>
            <tr> <tr>
            <td>employee Name:</td>
            <td><input type="text" name="employeeName" value="${employee.getEmployeeName()}"></td>
        </tr>
            <tr>
                <td>position Id:</td>
                <td>
                    <input type="text" name="positionId" id="name" value="${employee.getPositionId()}">
                </td>
            </tr>
            <tr>
                <td>degree Id:</td>
                <td>
                    <input type="text" name="degreeId" id="degreeId" value="${employee.getDegreeId()}">
                </td>
            </tr>
            <tr>
                <td>division Id:</td>
                <td>
                    <input type="text" name="divisionId" id="divisionId" value="${employee.getDivisionId()}">
                </td>
            </tr>
            <tr>
                <td>Birthday:</td>
                <td>
                    <input type="text" name="birthday" id="birthday" value="${employee.getBirthday()}">
                </td>
            </tr>
            <tr>
            <tr>
                <td>IdCard:</td>
                <td>
                    <input type="text" name="idCard" id="idCard" value="${employee.getIdCard()}">
                </td>
            </tr>
            <tr>
            <tr>
                <td>salary:</td>
                <td>
                    <input type="text" name="salary" id="salary" value="${employee.getSalary()}">
                </td>
            </tr>
            <tr>
                <td>Phone:</td>
                <td>
                    <input type="text" name="phone" id="phone" value="${employee.getPhone()}">
                </td>
            </tr>
            <tr>
                <td>email:</td>
                <td>
                    <input type="text" name="email" id="email" value="${employee.getEmail()}">
                </td>
            </tr>
            <td>address:</td>
            <td>
                <input type="text" name="address" id="address" value="${employee.getAddress()}">
            </td>
            </tr>
            <td><button type="submit">Edit</button></td>
            </tr>
        </table>
    </fieldset>
</form>
<div><a href="/employee">Back to List of Employee</a></div>

</body>
</html>