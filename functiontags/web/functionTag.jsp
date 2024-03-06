<%-- 
    Document   : functionTag
    Created on : 04-Dec-2023, 1:45:15 pm
    Author     : Aakash
--%>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="functions" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <c:set var="x" value="hey bittu how are you"/>
        ${functions:contains(x, "hii")}<br><br>
        ${functions:length(x)}<br><br>
        ${functions:substring(x, 2, 8)}<br><br>
        ${functions:toLowerCase(x)}<br><br>
        <a href="xmltagactivation.jsp">click here to access xmltags</a>
    </body>
</html>
