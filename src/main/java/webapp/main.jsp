<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<%@ page import="org.example.mvc.domain.dto.ResponseUserDTO" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>main</title>
</head>
<body>

<%@ include file="common/header.jsp"%>

<br>
<%!
    private ResponseUserDTO user;
%>
<%
    user = (ResponseUserDTO) session.getAttribute("user");
    if (user == null) {
%>
<div style="text-align: right">
    <form method="post" action="login.hanwha">
        <input type="text" name="id">
        <input type="password" name="pwd">
        <input type="submit" value="login">
        &nbsp;
        <a href="join.encore">JOIN</a>
    </form>
</div>
<%
} else {
%>
<div align = "right">
    <%= user.getName() %>님 환영합니다.
    &nbsp;&nbsp;
    <a href="logout.hanwha">로그아웃</a>

</div>
<%
    }
%>

<hr/>
<ul>
    <li><a href="./select/select.hanwha">전체출력</a></li>
</ul>

<%@ include file="common/footer.jsp"%>

</body>
</html>