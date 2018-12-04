package com.fdm.group.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.fdmgroup.models.Trainer;
import com.fdmgroup.services.TrainerServiceImpl;


public class TrainerCreationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	TrainerServiceImpl service;
	Trainer trainer;
	HttpSession session;
       

    public TrainerCreationController() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		session = request.getSession();
		service = new TrainerServiceImpl();
		trainer = new Trainer();
		
		String username = request.getParameter("trainerUsername");
		String passWord1 = request.getParameter("trainerPassword1");
		String passWord2 = request.getParameter("trainerPassword2");
		
		List<Trainer> trainer = service.getUser(username);
		
		if(! passWord1.equals(passWord2) || trainer.size() > 0) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("Create-trainer.html");
			dispatcher.forward(request, response);
		}else if(passWord1.equals(passWord2) && trainer.size() == 0){
			trainer.setUsername(username);
			trainer.setPassword(passWord1);
			
			service.addTrainer(trainer);
			session.setAttribute("ActiveUser", trainer);
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("Main-menu.html");
			dispatcher.forward(request,response);
		}
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
