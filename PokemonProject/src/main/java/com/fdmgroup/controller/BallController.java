package com.fdmgroup.controller;

import java.io.IOException;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.fdmgroup.models.PokeStats;
import com.fdmgroup.models.Pokemon;
import com.fdmgroup.models.Trainer;


public class BallController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	HttpSession session;
       

    public BallController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	Pokemon encounter = (Pokemon) request.getAttribute("WildPokemon");	
	PokeStats stats = encounter.getName();
	
	int multiplier =  stats.getCatchChance();
	int fleeRate = stats.getFleeChance();
	
	int rnd = new Random().nextInt(101);
	int chance = rnd * multiplier;
	
	Trainer trainer = (Trainer) session.getAttribute("ActiveUser");
	
	if(chance>50) {
		encounter.setTrainerID(trainer);
		response.sendRedirect("caught.jsp");
	}else {
		session.setAttribute("CatchChance", multiplier);
		session.setAttribute("FleeChance", fleeRate);
		response.sendRedirect("wild2.jsp");
	}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
