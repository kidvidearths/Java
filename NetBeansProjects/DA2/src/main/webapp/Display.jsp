<%-- 
    Document   : Display
    Created on : 22-Apr-2022, 5:31:04 pm
    Author     : RamaReddi
--%>
<jsp:useBean id="reg" class="com.mycompany.da2.Mahbean" scope="session" />
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.*, java.sql.* "%>
<%! String regno; %>
<% Class.forName("com.mysql.cj.jdbc.Driver");
   Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","nihplod3");
   regno=request.getParameter("name");
   Statement st= con.createStatement();
   ResultSet rs = st.executeQuery("SELECT * FROM SCOPE WHERE rno='"+regno+"'");
%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h3><% while(rs.next())
            {%>
            Registration Number: <%out.println(rs.getString("rno"));%> <br>
            Name: <%out.println(rs.getString("name"));%> <br>
            Year of Admission: <%out.println(rs.getString("year"));%> <br>
            Programme Admitted to: <%regno=rs.getString("programme");
                                    out.println(regno);
            } %>
            <jsp:setProperty name="reg" property="regno" value="<%=regno%>" />
        </h3>
        <a href="DeepDisplay.jsp">Find out the HOD of <%=regno%></a>
    </body>
</html>
