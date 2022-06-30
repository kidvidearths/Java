package com.example.hehe;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;



@WebServlet(name = "add", value = "/add")
public class add extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        PrintWriter pp= response.getWriter();
        pp.println("<html>");
        pp.println("<body>");
        pp.println("hello");
        pp.println("</body>");
        pp.println("</html>");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        processRequest(request,response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        processRequest(request,response);
    }
}
