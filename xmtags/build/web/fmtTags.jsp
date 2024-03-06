<%-- 
    Document   : fmtTags
    Created on : 02-Dec-2023, 11:41:30 am
    Author     : Aakash
--%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h2>fmt:format date</h2>
        <c:set var="x" value="<%=new java.util.Date()%>"/>
        <c:out value="${x}"/>
        <br><br>
        <h2>Formatted Date : </h2>
        <fmt:formatDate type="date" value="${x}"/><br><br>
        <h2>Formate Time</h2>
        <fmt:formatDate type="time" value="${x}" /><br><br>
        <h2>formatted Date</h2>
        <br><br>
        <c:set var="y" value="28-05-2003" />
        <fmt:parseDate value="${y}" var="parsedDate" pattern="dd-mm-yyyy" />
        <c:out value="${parsedDate}" />
        <br><br>
        <h2>Time Zone</h2>
        <c:set var="timezone" value="<%=new java.util.Date() %>"/>
        <fmt:formatDate value="${timezone}" type="both" timeStyle="long" dateStyle="long"/>
        <br><br><a href="xmlTags.jsp">Click here for xml tags</a>
        
        
        
    </body>
</html>
