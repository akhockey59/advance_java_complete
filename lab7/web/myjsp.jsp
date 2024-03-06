<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%@page errorPage= "error.jsp" %>
        <% 
            String no1 = request.getParameter("n1");
            String no2 = request.getParameter("n2");
            String operation = request.getParameter("s1");
            
            int a = Integer.parseInt(no1);
            int b = Integer.parseInt(no2);
            if(operation.equals("add")){
            int add = a + b;
            out.println("Addition is "+add);
            }
            else if(operation.equals("subtraction")){
            int sub = a- b;
            out.println("Subtraction is "+sub);
            }
            else if(operation.equals("subtraction")){
            int m = a * b;
            out.println("Multiplication is "+m);
            }
             else if(operation.equals("subtraction")){
            int d = a / b;
            if(a>=b){
            out.println("Multiplication is "+d);
            }
            else{
            out.println("this can't be done");
            }
            }
            %>
    </body>
</html>