<%-- 
    Document   : xmlTags
    Created on : 02-Dec-2023, 12:31:51 pm
    Author     : Aakash
--%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h2>Book Information</h2>
        <c:import var="BookInfo" url="books.xml"/>
        <x:parse xml="${BookInfo}" var="o"/>
        <h5>
            First Book Title : <x:out select="$o/books/book[1]/name"/><br>
            Book Price : <x:out select="$o/books/book[1]/rate"/><br>
            book Author: <x:out select="$o/books/book[1]/author"/><br>
            Second Book Title : <x:out select="$o/books/book[2]/name"/><br>
            Book Price : <x:out select="$o/books/book[2]/rate"/><br>
            book Author: <x:out select="$o/books/book[2]/author"/><br>
        </h5>
        <h3>For Each in tags</h3>
        <%-- <x:forEach select="$o/books/book/name" var="item">
        <li> Book Name : <x:out select = "$item" /></li>
</x:forEach>--%>
    </body>
</html>
