<%-- 
    Document   : error
    Created on : 29-Oct-2023, 3:38:38 pm
    Author     : Aakash
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%@page isErrorPage="true" %>   
        <h1>Sorry, an error has occurred.</h1>
        Exception: <%= exception %>

    </body>
</html>
