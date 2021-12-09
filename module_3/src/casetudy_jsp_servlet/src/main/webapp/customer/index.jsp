<%--
  Created by IntelliJ IDEA.
  User: WIN-PRO
  Date: 03/11/2021
  Time: 08:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Furama resort</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
            crossorigin="anonymous"></script>
    <link rel="icon" href="https://image.flaticon.com/icons/png/512/458/458625.png" type="image/i-icon"/>
    <style>
        .menu_top {
            height: 100px;
        }

        .menu {
            background: cornflowerblue;
        }

        .row {
            height: 700px;
        }

        .col-3 {
            background: aliceblue;
        }

        .footer {
            background: lightskyblue;
            height: 100px;
            width: 100%;
            text-align: center;
            font-family: "Bauhaus 93";
            font-size: 30px;
        }

        .container-fluid {
        }
    </style>
</head>
<body>
<div style="width: 100%">
    <div class="menu_top">

        <div><img style="width: 100px;height: 100% ;padding: 15px 10px 10px 10px ;margin-left:50px "
                  src="EF1BBB1C183F473F9164_45059222.jpg"> <a style="margin-left: 1000px ; font-size: 20px;font-family: VnArabia"> lê văn lanh</a>

        </div>

        <div class="menu">
            <nav class="navbar navbar-expand-lg navbar-light bg-light">
                <div class="container-fluid">
                    <a class="navbar-brand" href="index.jsp">Home</a>
                    <button class="navbar-toggler" type="button" data-bs-toggle="collapse"
                            data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent"
                            aria-expanded="false" aria-label="Toggle navigation">
                        <span class="navbar-toggler-icon"></span>
                    </button>
                    <div class="collapse navbar-collapse" id="navbarSupportedContent">
                        <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                            <li class="nav-item">
                                <a class="nav-link active" aria-current="page" href="#">Employee</a>
                            </li>
                            <a class="nav-link disabled">Customer</a>
                            </li>
                            </li>
                            <a class="nav-link disabled">Service</a>
                            </li>
                            </li>
                            <a class="nav-link disabled">Contract</a>
                            </li>
                        </ul>
                        <form class="d-flex">
                            <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
                            <button class="btn btn-outline-success" type="submit">Search</button>
                        </form>
                    </div>
                </div>
            </nav>
        </div>


        <div class="row">
            <div class="col-3">
                <div class="list-group">
                    <a href="#" class="list-group-item list-group-item-action active" aria-current="true">
                        The current link item
                    </a>
                    <a href="/customer" class="list-group-item list-group-item-action">Customer</a>
                    <a href="#" class="list-group-item list-group-item-action">Employee</a>
                    <a href="/service" class="list-group-item list-group-item-action">Service</a>
                    <a class="list-group-item list-group-item-action disabled">Contract</a>
                </div>
            </div>
            <div class="row">
            </div>
        </div>
        <div class="footer">
            CodeGym Da Nang - Nguyen Tat Thanh Street
            Mọi thông tin xin liên hệ SDT : 070356631
        </div>
    </div>
</body>
</html>