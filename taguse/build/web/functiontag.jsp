<%-- 
    Document   : functiontag
    Created on : 02-Dec-2023, 1:46:11 am
    Author     : Aakash
--%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <p><u>to lower case</u></p>
                <c:set var="st" value="welcome to marwadi university"/>
                ${fn:toLowerCase(st)}<br>
        <p><u>to Upper Case</u></p>
                ${fn:toUpperCase(st)}
        <br><br>
        <p><u>substring</u></p>
        <br><br>
        <c:set var="x" value="hey i am using jsp" />
        ${fn:substring(x,5,17)}
        <br><br>
        <p><u>Replace</u></p>
                <c:set var="z" value="my name is aakash" />
                <c:set var="y" value="this file is made by bittu" />
                ${fn:replace(x,"aakash","bitturoy")}

    </body>
</html>
