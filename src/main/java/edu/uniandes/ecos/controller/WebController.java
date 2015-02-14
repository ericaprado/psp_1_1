/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.uniandes.ecos.controller;

import edu.uniandes.ecos.RelativeSize;
import edu.uniandes.ecos.printer.ResultsPrinter;
import java.io.IOException;
import javax.servlet.http.HttpServlet;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.*;

/**
 *
 * @author ASUS-PC
 */
public class WebController extends HttpServlet {
    
    public static void main( String[] args )  throws Exception 
    {
        Server server = new Server(Integer.valueOf(System.getenv("PORT")));
        ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);
        context.setContextPath("/");
        server.setHandler(context);
        context.addServlet(new ServletHolder(new WebController()),"/*");
        server.start();
        server.join();
    
    }
    
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            
        RelativeSize relativeSize = new RelativeSize();
               
        String list1 = "6,6,8.3333,10.3333,12.3333,16.4,20.5,21.75,22.25,23,28.3333,29,55.8";
        String list2 = "7,12,10,12,10,12,12,12,12,8,8,8,20,14,18,12";
        String list3 = "14,8,12.5,2.8333,12.75,26,14.5,6.3333,10.3333,2.7142,5.6,13.5,12.25";
                
        String result = "<HTML>";
               
        result += ResultsPrinter.printWebResults("LOC/Method", relativeSize.getRanges(list1));
        result += ResultsPrinter.printWebResults("Pages/Chapter", relativeSize.getRanges(list2));
        result += ResultsPrinter.printWebResults("Classes PSP", relativeSize.getRanges(list3));
                
        result += "</HTML>";
        
        resp.getWriter().write(result);          
       
    }
}
