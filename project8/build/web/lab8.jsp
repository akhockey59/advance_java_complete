<%-- 
    Document   : lab8
    Created on : 31-Oct-2023, 12:32:52 am
    Author     : Aakash
--%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <a href="functiontag.jsp"> click here for function tag</a>
        <br><br>
        <p>core tags</p>
        <u>out tag</u>
        <c:out value="${'welcome to jstl 3'}"/>
        <br><br>
        <p>Set and remove tag</p>
        <c:set var="income" scope="session" value="${5000 * 4}"/>
        <p>value before removal <c:out value="${income}"/></p>
        <c:remove var="income"/>
        <p>after removal value is <c:out value="${income}"/></p>
        
        <br><ul>import tag</ul>
        <c:import var="data" url="https://www.youtube.com/"/>
        <c:out value="${data}"/>
    </body>
</html>
