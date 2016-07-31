<%--
  Created by IntelliJ IDEA.
  User: Yulian Bulbuk
  Date: 22.05.2016
  Time: 12:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title><tiles:getAsString name="title"/></title>
    <link rel="stylesheet" href=<c:url value="/resources/css/style.css"></c:url>/>
</head>
<body>
<div>
    <tiles:insertAttribute name="header"/>
</div>
<div>
    <tiles:insertAttribute name="menu"/>
</div>
<%--<div class="myClass">--%>
    <tiles:insertAttribute name="body"/>
</div>
<div>
    <tiles:insertAttribute name="footer"/>
</div>
</body>
</html>
