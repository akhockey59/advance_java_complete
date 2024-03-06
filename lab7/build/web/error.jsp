<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%@page isErrorPage ="true" %>
        <h1>This is the error page as you put a wrong number so can't be done</h1>
        exception is <%= exception %>
    </body>
</html>
