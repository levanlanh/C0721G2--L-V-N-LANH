<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
          rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
          crossorigin="anonymous">
    <link rel="icon" href="https://image.flaticon.com/icons/png/512/458/458625.png" type="image/i-icon"/>
</head>
<body>

<div class="container-fluid bg-light">
    <div class="row bg-light">
        <div class="col-lg-6 text-left">
            <img src="Review-Furama-Resort-Da-Nang-13.jpg" alt="" width="15%" height="100%">
            <h6>Fumara Resort</h6>
        </div>
        <div class="col-lg-6 text-end pt-4">
            <tr>
                <td ><c:out value="${usernameinfo}"/></td>
            </tr>

        </div>
    </div>
</div>
<br>

<nav class="navbar navbar-expand-lg navbar-light bg-light">
    <div class="container-fluid">
        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="/home">Home</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="/employee">Employee</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link active" href="/customer">Customer</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link active" href="/service">Service</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link active" href="/contract">Contract</a>
                </li>
            </ul>
            <form class="d-flex" action="/employee?action=search" method="post">
                <input class="form-control me-2" name="searchName" type="text" placeholder="Search Customer Name" aria-label="Search">
                <button class="btn btn-outline-success" type="submit">Search</button>
            </form>
        </div>
    </div>
</nav>
<br>
<div >
    <button style="margin-left: 20px ; background: aqua ; color: aliceblue " type="button" class="btn btn-light">
        <a href="/employee?action=sort"
           class="text-decoration-none" >Sort</a>
    </button>
</div>


<div class="container-fluid ">
    <div class="row ">
        <div class="col-lg-12 text-left">
            <button style="margin-left: 20px ; background: aqua ; color: aliceblue " type="button" class="btn btn-light">
                <a href="/employee?action=create" class="text-decoration-none">Create Customer</a>
            </button>
        </div>
    </div>
</div>

<div>
    <table class="table">
        <thead>
        <tr>
            <th scope="col">Employee Id</th>
            <th scope="col">Employee Name</th>
            <th scope="col">Position Id</th>
            <th scope="col">Degree Id</th>
            <th scope="col">DiviSion Id</th>
            <th scope="col">Birth Day</th>
            <th scope="col">Id Card</th>
            <th scope="col">Salary</th>
            <th scope="col">Phone</th>
            <th scope="col">Email</th>
            <th scope="col">Address</th>
            <th scope="col">Edit</th>
            <th scope="col">Delete</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="employee" items="${employeeList}">
            <tr>
                <td>${employee.employeeId}</td>
                <td>${employee.employeeName}</td>
                <td>${employee.positionId}</td>
                <td>${employee.degreeId}</td>
                <td>${employee.divisionId}</td>
                <td>${employee.birthday}</td>
                <td>${employee.idCard}</td>
                <td>${employee.salary}</td>
                <td>${employee.phone}</td>
                <td>${employee.email}</td>
                <td>${employee.address}</td>

                <td>
                    <button type="button" class="btn btn-light">
                        <a href="/employee?action=edit&id=${employee.employeeId}"
                           class="text-decoration-none" onclick="return confirm('Do you want to edit ${employee.employeeName} ?')">Edit</a>
                    </button>

                </td>
                <td>
                    <button type="button" class="btn btn-light">
                        <a href="/employee?action=delete&id=${employee.employeeId}"
                           class="text-decoration-none"  onclick="return confirm('Do you want to delete ${employee.employeeName} ?')">Delete</a>
                    </button>

                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>

<br>
<div class="container-fluid">
    <div class="row">
        <div class="col-lg-12 bg-black">
            <br>
            <p class="text-light fs-6">Features and app availability may vary by region.</p>
        </div>
    </div>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
        crossorigin="anonymous"></script>
</body>
</html>