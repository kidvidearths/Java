<%-- 
    Document   : form
    Created on : 15-Apr-2022, 3:42:49 pm
    Author     : RamaReddi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% RequestDispatcher rd;
        String n=request.getParameter("name");
        String a=request.getParameter("name1");
        if(n.isEmpty() || a.isEmpty())
        {
        rd=request.getRequestDispatcher("input.jsp");
        rd.forward(request, response);
        }
        else
        {
        rd=request.getRequestDispatcher("sucess.jsp");
        rd.forward(request, response);
        }
        %>
    </body>
</html>
