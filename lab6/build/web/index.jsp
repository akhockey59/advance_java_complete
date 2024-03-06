<%-- 
    Document   : index
    Created on : 29-Oct-2023, 3:25:41 pm
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
        <%@page errorPage="error.jsp" %>
        <% String num1 = request.getParameter("n1");
           String num2 = request.getParameter("n2");
           String bp = request.getParameter("s1");
          int no1 = Integer.parseInt(num1);
          int no2 = Integer.parseInt(num2);
         if(bp.equals("add")){
         int add = no1 + no2;
         out.println("Addition is "+add);
            }
            else if(bp.equals("subtract")){
            int sub = no1 - no2;
            out.println("Subtraction is "+sub);
            }
            else if(bp.equals("multiply")){
            int m = no1 * no2;
            out.println("Multiplication is "+m);
            }
            else if(bp.equals("divide")){
            int d = no1 / no2;
            if(no1>=no2){
            out.println("Division is :"+d);
             }
             else{
             out.println("error calculating the division");
            }
            }
            %>
    </body>
</html>
