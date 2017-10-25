<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="utf-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%--<jsp:useBean id="products" scope="request" class="java.util.ArrayList"/>--%>
<html>
<head>
    <title>Home Page</title>
</head>
<body>
<c:forEach var="product" items="${products}">
    <div>
        ${product.name}
    </div>
</c:forEach>
</body>
</html>