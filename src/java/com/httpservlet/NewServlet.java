/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.httpservlet;

import javax.servlet.http.*;
import java.io.IOException;
import javax.servlet.ServletException;
import java.io.PrintWriter;
public class NewServlet extends HttpServlet{
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        System.out.println("Hey I'm secont servlet");
        
        response.setContentType("text/html");
        
        PrintWriter pw = response.getWriter();
        pw.println("<h1 style='color:red; background-color:black; text-align:center;'>I'm from NewServlet class <br>Hey Your get method is working</h1>");
        
        pw.close();
    }
}
