package com.login;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String nom= req.getParameter("nom");
		String prenom= req.getParameter("prenom");
		
		if(prenom.equals("hanaa") && nom.equals("harmouch"))
		{
			resp.sendRedirect("accueil.jsp");
		}
		else
		{
		resp.sendRedirect("login.jsp");	
		}
		
		
	}

	

}
