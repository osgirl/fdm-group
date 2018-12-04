package com.fdmgroup.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.fdmgroup.models.Trainer;
import com.fdmgroup.services.TrainerService;
import com.fdmgroup.services.TrainerServiceImpl;

public class LogInController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	HttpSession session;
	TrainerService service;
       

    public LogInController() {
        super();
        this.service = new TrainerServiceImpl();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String password = request.getParameter("trainerPassword");
		String name = request.getParameter("trainerUsername");
		@SuppressWarnings("unused")
		Boolean result = service.verifyPassword(name,password);
		
		Trainer activeUser = service.getTrainer(name);
		
		if( result = true) {
			session.setAttribute("ActiveUser", activeUser);
			response.sendRedirect("PokemonParty");
		} else {
			response.sendRedirect("trainer-login.html");
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
