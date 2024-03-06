<%-- 
    Document   : newjsp
    Created on : 02-Dec-2023, 11:11:34 am
    Author     : Aakash
--%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <c:import url="https://student.marwadiuniversity.ac.in:553/" var="x"/>
        <c:out value="${x}"/>
    </body>
</html>
