<%-- 
    Document   : xmltagactivation
    Created on : 04-Dec-2023, 1:58:19 pm
    Author     : Aakash
--%>
<%@taglib uri="http://java.sun.com/jsp/jstl/xml" prefix="x" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body><h5>
        <c:import var="BookInfo" url="books.xml"/>
        <x:parse xml="${BookInfo}" var="z"/>
        first book name : <x:out select="$z/books/book[1]/name"/><br><br>
        first book author : <x:out select="$z/books/book[1]/author"/><br><br>
        rate of book 1 : <x:out select="$z/books/book[1]/rate"/><br><br>
        Second book name : <x:out select="$z/books/book[2]/name"/><br><br>
        Second book author : <x:out select="$z/books/book[2]/author"/><br><br>
        rate of book 2 : <x:out select="$z/books/book[2]/rate"/><br><br>
        </h5>
    </body>
</html>