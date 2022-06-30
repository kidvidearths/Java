<%-- 
    Document   : DeepDisplay
    Created on : 22-Apr-2022, 10:29:52 pm
    Author     : RamaReddi
--%>

<jsp:useBean id="reg" class="com.mycompany.da2.Mahbean" scope="session" />
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.*, java.sql.* "%>
<%! String regno; %>
<% Class.forName("com.mysql.cj.jdbc.Driver");
   Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","nihplod3");
   regno=reg.getRegno();
   Statement st= con.createStatement();
   ResultSet rs = st.executeQuery("SELECT * FROM PROGRAMME WHERE programme='"+regno+"'");
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h3><% while(rs.next())
            {
            out.println("The HOD of "+regno+" is "+rs.getString("hod"));
            } %>
            <jsp:setProperty name="reg" property="regno" value="<%=regno%>" />
        </h3>
    </body>
</html>
