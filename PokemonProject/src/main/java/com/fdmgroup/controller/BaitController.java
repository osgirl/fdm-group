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

public class BaitController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	HttpSession session;

       
    public BaitController() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		Pokemon encounter = (Pokemon) request.getAttribute("WildPokemon");	
		PokeStats stats = encounter.getName();
		
		int catchRate = stats.getCatchChance();
		int multiplier =  stats.getFleeChance();
		
		int rnd = new Random().nextInt(101);
		int chance = rnd * multiplier;
		
		if(chance > 50) {
			response.sendRedirect("Fled.jsp");
		}else {
			multiplier = multiplier - 15;
			catchRate = catchRate - 15;
			
			session.setAttribute("FleeChance",multiplier);
			session.setAttribute("CtahcChance", catchRate);
			response.sendRedirect("wild2.jsp");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
