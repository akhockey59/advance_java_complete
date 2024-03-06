<%-- 
    Document   : newjsp
    Created on : 02-Dec-2023, 1:45:56 am
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
        <a href="functiontag.jsp">click here for function tags</a>
        <br><br>
        <p>core tag<br>
            <u>out tag</u></p>
        <c:out value="${'welcome to jstl'}" />
        <br><br>
        <p><u>Set and Remove Tag</u></p>
        <c%:set var="income" scope="session" value="${500*4}" />
        <p>before removal value is  </p> <c%:out value="${income}" />
        <c%:remove var="income"/>
        <p> value after removal</p>
        <c%:out value="${income}"/>
        <br><br>
        <p><u>import tags</u></p>
        <c%:import var = "data" url="https://www.youtube.com/watch?v=Qu76Zh1hgcs" />
        <c%:out value="data"/>
        
    </body>
</html>
