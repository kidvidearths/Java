<%-- 
    Document   : kuchbhi
    Created on : 21-Apr-2022, 2:24:09 pm
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
        <jsp:useBean id="num" class="com.mycompany.spaceballs.Student" scope="session" />
        <jsp:setProperty name="num" property="sno"  value="3"/>
        <jsp:getProperty name = "num" property = "sno"/>
    </body>
</html>
