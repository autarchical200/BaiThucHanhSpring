<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
    <title>Chi tiết sản phẩm</title>
</head>
<body>
    <h1>Chi tiết sản phẩm</h1>
    <p>ID: <c:out value="${product.id}" /></p>
    <p>Tên sản phẩm: <c:out value="${product.name}" /></p>
    <p>Giá: <c:out value="${product.price}" /></p>
</body>
</html>
