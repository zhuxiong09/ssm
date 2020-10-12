<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8" isELIgnored="false"%>
 <%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>购物车</title>
<link type="text/css" rel="stylesheet" href="css/style.css" />
</head>
<html>
<body>
<h2>查询所有学生!</h2>
<table >

                <tr>
                    <td >id</td>
                    <td >学生编码</td>
                    <td >学生姓名</td>
                    <td >学生年纪</td>
                    <td >学生地址</td>
                </tr>

 </table>
 <table >
            <c:forEach var="stus" items="${students}">
                <tr>
                    <td >${stus.id}</td>
                    <td >${stus.stuNum}</td>
                    <td >${stus.stuName}</td>
                    <td >${stus.gradeID}</td>
                    <td >${stus.address}</td>
                </tr>
            </c:forEach>
 </table>

</body>
</html>
