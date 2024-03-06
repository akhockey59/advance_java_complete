<%-- 
    Document   : calculation
    Created on : 02-Dec-2023, 12:55:28 am
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
        <%@page errorPage = "error.jsp" %>
        <%
            String a = request.getParameter("n1");
            String b = request.getParameter("n2");
            String operation = request.getParameter("r1");
            int x = Integer.parseInt(a);
            int y = Integer.parseInt(b);
            if(operation.equals("addition")){
            int add = x + y;
            out.println("addition is "+add);
            }
            else if(operation.equals("subtraction")){
            int subtract = x - y;
            out.println("subtraction is "+subtract);
            }
             else if(operation.equals("multiplication")){
            int multiply = x * y;
            out.println("multiplication is "+multiply);
            }
            else if(operation.equals("division")){
            int division = x/y;
            if(x>=y){
            out.println("Division is "+division);
            }
            else{
            out.println("invalid");
            }
            }
            %>
    </body>
</html>
