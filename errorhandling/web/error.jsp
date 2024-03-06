<%-- 
    Document   : error
    Created on : 02-Dec-2023, 1:04:27 am
    Author     : Aakash
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%@page isErrorPage = "true" %>
        <h2>sorry an Error has occured in your calculation</h2>
        Exception is <%= exception %>
    </body>
</html>

