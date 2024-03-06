<%-- 
    Document   : function
    Created on : 31-Oct-2023, 12:48:40?am
    Author     : Aakash
--%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<h2>Format Date</h2>
<c:set var="date" value="<%= new java.util.Date()%>"/>

<h3>format time: 
    <fmt:formatDate type="time" value="${date}"/>
</h3>
<h3>
    format time: 
    <fmt:formatDate type="date" value="${date}"/>
</h3>
<br><h2>format date</h2>
<c:set var="date" value="28-07-2003"/>
<fmt:parseDate var="parsedate" value="${date}" pattern="dd-mm-yyyy"/>
<c:out value="${parsedate}"/>
<br><br><h2>fmt: time zone</h2>
<c:set var="date" value="<%= new java.util.Date()%>"/>
<p><b>Date and time zone in indian standard time zone</b></p>
<fmt:formatDate value="${date}" type="both" timeStyle="long" dateStyle="long"/>
<br><br><a href="xmltag.jsp">click here for xml tags</a>
