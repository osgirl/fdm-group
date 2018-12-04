package com.fdmgroup.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.fdmgroup.models.Pokemon;
import com.fdmgroup.models.Trainer;
import com.fdmgroup.services.TrainerService;
import com.fdmgroup.services.TrainerServiceImpl;


public class PokemonParty extends HttpServlet {
	private static final long serialVersionUID = 1L;
	HttpSession session;
	TrainerService service;
       
    public PokemonParty() {
        super();
        this.service = new TrainerServiceImpl();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			getParty(request,response);
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}

	private void getParty(HttpServletRequest request, HttpServletResponse response) throws Exception{

		Trainer trainer = (Trainer) session.getAttribute("ActiveUser");
		List<Pokemon> party = service.getAllPartyPokemon(trainer);
		request.setAttribute("Party", party);
		
		RequestDispatcher rd = request.getRequestDispatcher("main-menu.html");
		rd.forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
