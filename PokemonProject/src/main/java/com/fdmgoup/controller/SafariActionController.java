package com.fdmgoup.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SafariActionController
 */
public class SafariActionController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public SafariActionController() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String rock = request.getParameter("rock");
		request.setAttribute("poop",rock);
		System.out.println(rock);
		RequestDispatcher dp = request.getRequestDispatcher("test.jsp");
		dp.forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
