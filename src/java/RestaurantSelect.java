/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.web;

import com.example.model.RestaurantExpert;
import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.*;
import javax.servlet.RequestDispatcher;

/**
 *
 * @author Patras
 */

public class RestaurantSelect extends HttpServlet {

  public void doPost( HttpServletRequest request,
                      HttpServletResponse response)
                      throws IOException, ServletException {

    String c = request.getParameter("type");

    // Now use our Coffee Model above
    RestaurantExpert ce = new RestaurantExpert();

    List result = ce.getTypes(c);

    // Use the below code to debug the program if you get problems
    //response.setContentType("text/html"):
    //PrintWriter out = response.getWriter();
    //out.println("Coffee Selection Advise<br>");

    //Iterator it = result.iterator();
    //while(it.hasNext()) {
    //  out.print("<br>try: " + it.next());
    //}

    // The results will be passed back (as an attribute) to the JSP view
    // The attribute will be a name/value pair, the value in this case will be a List object
    request.setAttribute("styles", result);
    RequestDispatcher view = request.getRequestDispatcher("result.jsp");
    view.forward(request, response);
  }
}