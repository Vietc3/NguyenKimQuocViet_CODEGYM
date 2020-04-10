<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 21/2/2020
  Time: 12:31 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>c:set example</title>
    <style type="text/css">
        table, th, td{
            border-top:1px solid #ccc;
            border-bottom:1px solid #ccc;
        }
        table{
            border-collapse:collapse;
            width:100%;
        }
        th, td{
            text-align:left;
            padding:10px;
        }
    </style>
</head>
<body>
<table>
    <tr>
       <th>
           Danh Sách Khách Hàng
    </tr></th>
    </tr>
    <tr>
        <th>Tên</th>
        <th>Ngày Sinh</th>
        <th>Địa Chỉ</th>
        <th>Ảnh</th>       
    </tr>
    <tr>
        <td>Trần Anh Đức</td>
        <td>03/08/1993</td>
        <td>Cần Thơ</td>
        <td>
            <img src="IMG/xinh.jpg" width="100" height="100">
        </td>
    </tr>
    <tr>
        <td>Kiều Thị Thu Hằng</td>
        <td>04/09/1991</td>
        <td>Vĩnh Long</td>
        <td>
            <img src="IMG/xinh.jpg" width="100" height="100">
        </td>
    </tr>
    <tr>
        <td>Vương Thị Lê Na</td>
        <td>06/10/1991</td>
        <td>Sóc Trăng</td>
        <td>
            <img src="IMG/xinh.jpg" width="100" height="100">
        </td>
    </tr>
    <tr>
        <td>Dương Kim Thương</td>
        <td>16/11/1990</td>
        <td>Trà Vinh</td>
        <td>
            <img src="IMG/xinh.jpg" width="100" height="100">
        </td>
    </tr>
    <tr>
        <td>Mai Đức Hiếu</td>
        <td>18/06/1989</td>
        <td>Hậu Giang</td>
        <td>
            <img src="IMG/xinh.jpg" width="100" height="100">
        </td>
    </tr>
</table>

</body>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</html>