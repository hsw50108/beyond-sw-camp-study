<%@ page language="java"
         contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>

<%@ page import="org.example.mvc.model.dao.MariaDao" %>
<%@ page import="org.example.mvc.domain.dto.RequestUserDTO" %>
<%@ page import="org.example.mvc.domain.dto.ResponseUserDTO" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>test</title>
</head>

<body>
<%--jsp 주석  --%>
<%--선언문(변수, 메서드)  --%>
<%!
    private MariaDao dao;
    private RequestUserDTO params;
    private ResponseUserDTO user;
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }
%>
<%--
 scriptlet tag(서블릿의 메서드(doGet | >doPost))
 사용자가 jsp를 호출하게 되면 수행되는 영역
 doGet(httpServletRequest request, HttpServletResponse response)
 --%>

<%
    dao = new MariaDao();
    params = new RequestUserDTO("jslim", "jslim");
    user = dao.loginRow(params);

    setMessage("hello jsp");
    out.print("<div align='center'>");
    out.print(getMessage());
    out.print("</div>");
%>

<%--<%= this.getMessage()%>--%>
<%= user.getName() %> 님 환영합니다.

</body>
</html>
