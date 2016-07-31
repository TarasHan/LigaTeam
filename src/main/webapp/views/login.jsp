<%--
  Created by IntelliJ IDEA.
  User: Yulian Bulbuk
  Date: 04.06.2016
  Time: 13:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form class="form-horizontal" action="/loginprocessing" method="post">
    <form class="form-horizontal" role="form">
        <div class="form-group">
            <label for="inputName" class="col-sm-2 control-label">Name</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="inputName" placeholder="user Name">
            </div>
        </div>

        <div class="form-group">
            <label for="inputPassword" class="col-sm-2 control-label"> Password </label>
            <div class="col-sm-10">
                <input type="password" class="form-control" id="inputPassword" placeholder="Password">
            </div>
        </div>
        <diV class="form-group">
            <div class="col-sm-offset-2 col-sm-10">
                <button type="submit" class="btn btn-default">Submit!</button>
            </diV>
        </div>
    </form>
</form>
</body>
</html>
