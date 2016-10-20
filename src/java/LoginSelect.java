package com.example.web;

import com.example.model.LoginExpert;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.uthldap.Uthldap;

/**
 *
 * @author Rania
 */
public class LoginSelect extends HttpServlet {
    public void doPost( HttpServletRequest request,
                      HttpServletResponse response)
                      throws IOException, ServletException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");
        
        String name;

        Uthldap ldap = new Uthldap(username,password);
        
        if(ldap.auth()){
         HttpSession session = request.getSession();
         session.setAttribute("username", username);
         name = ldap.getName();
         request.setAttribute("username", name);
         RequestDispatcher view = request.getRequestDispatcher("result1.jsp");
         view.forward(request, response); 

        }
        else{
            RequestDispatcher view = request.getRequestDispatcher("wrong.jsp");
            view.forward(request, response); 
        }


        

  }
}
