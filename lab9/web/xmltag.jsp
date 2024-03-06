<%-- 
    Document   : xmltag
    Created on : 31-Oct-2023, 12:49:11 am
    Author     : Aakash
--%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/xml" prefix="x"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<h3>books information and parse and out tag</h3>
<c:import var="bookinfo" url="book.xml" />
<x:parse  xml="${bookinfo}" var="out"/>
<p>first book title<x:out select="$out/books/book[1]/name"/></p>
<p>book author<x:out select="$out/books/book[1]/author"/></p>
<p>second book title<x:out select="$out/books/book[2]/name"/></p>
<p>book author<x:out select="$out/books/book[2]/author"/></p>
<h3>for each :</h3>
<%--<x:forEach select="$out/books/book/name" var="item">
<li><x:out select="item"/></li>
</x:forEach>--%>