<%--
  Created by IntelliJ IDEA.
  User: Kerol
  Date: 05.06.2016
  Time: 15:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form role="form">
<form action="/createNewUser" method="post">

    <div class="form-group">
        <label for="inputName">Name</label>
        <input type="text" class="form-control" id="inputName" placeholder="Enter name">
    </div>
    <div class="form-group">
        <label for="input LastName">LastName</label>
        <input type="text" class="form-control" id="input LastName" placeholder="Enter LastName">
    </div>
    <div class="form-group">
        <label for="inputNickName">NickName</label>
        <input type="text" class="form-control" id="inputNickName" placeholder="Enter NickName">
    </div>
    <div class="form-group">

    </div>
    <label for="inputPassword">Password</label>
    <input type="password" class="form-control" id="inputPassword" placeholder="Enter Password">
    <div class="form-group">
        <label for="input email">Email</label>
        <input type="text" class="form-control" id="input email" placeholder="Enter Email">

    </div>

    <button type="submit" class="btn btn-danger">Registration</button>
</form>
</form>

</body>
</html>
