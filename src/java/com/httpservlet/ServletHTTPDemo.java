/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.httpservlet;


import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import java.io.IOException;
import java.io.PrintWriter;


/**
 *
 * @author nayem
 */
public class ServletHTTPDemo extends HttpServlet{
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
//        print something in console
        System.out.println("Get method is working..............");
        
//        print some thing on web interface
        res.setContentType("text/html");
        PrintWriter pw = res.getWriter();
        pw.println("<h1 style='color:red; background-color:black; text-align:center;'>Hey Your get method is working</h1>");
        pw.close();
    }
}
