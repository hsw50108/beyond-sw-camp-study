<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<%@ page import="org.example.mvc.domain.dto.ResponseUserDTO" %>
<%@ page import="org.example.mvc.domain.dto.ResponseUserDTO" %>

<%@ page import="java.util.List" %>
<%@ page import="java.util.ListIterator" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
</head>
<body>
<%!
    private List<ResponseUserDTO> list;
%>
<%
    list = (List<ResponseUserDTO>) request.getAttribute("list");
    ListIterator<ResponseUserDTO> iter = list.listIterator();
%>

<table>
    <tr>
        <th>아이디</th>
        <th>패스워드</th>
        <th>이름</th>
    </tr>
    <%
        while (iter.hasNext()) {
    %>
    <tr>
        <% ResponseUserDTO data = iter.next(); %>
        <td><%=data.getId()%></td>
        <td><%=data.getPwd()%></td>
        <td><%=data.getName()%></td>
    </tr>
    <%
        }
    %>
</table>
</body>
</html>