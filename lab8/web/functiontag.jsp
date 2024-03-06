<%-- 
    Document   : functiontag
    Created on : 30-Oct-2023, 10:58:49 pm
    Author     : Aakash
--%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP function tag use</title>
    </head>
    <body>
        <p>to uppercase or lower case</p>
        <c:set var="string" value="welcome To Programming club"/>
        ${fn:toLowerCase(string)}
        ${fn:toUpperCase(string)}
        <br>
        <br>
        <p>Substring functions</p>
        <c:set var="st" value="welcome to marwadi university"/>
        ${fn:substring(st,5,17)}
        <p>replace values </p>
        <c:set var="data" value="aakash qwerty"/>
        <c:set var="string" value="abc pqr 123"/>
        ${fn:replace(data, aakash, sam)}
        ${fn:replace(string, pqr, hello)}
    </body>
</html>
