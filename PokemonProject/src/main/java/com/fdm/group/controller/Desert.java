package com.fdm.group.controller;

import java.io.IOException;
import java.util.List;
import java.util.Random;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fdmgroup.models.Pokemon;
import com.fdmgroup.services.PokemonService;
import com.fdmgroup.services.PokemonServiceImpl;


public class Desert extends HttpServlet {
	private static final long serialVersionUID = 1L;
	PokemonService service;
       

    public Desert() {
        super();
        this.service = new PokemonServiceImpl();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		List<Pokemon> wild = service.getAllPokemonFromZone("Desert");
		int rnd = new Random().nextInt(wild.size());
		Pokemon encounter = wild.get(rnd);		

		request.setAttribute("WildPokemon",encounter);

		RequestDispatcher dispatcher = request.getRequestDispatcher("");
		dispatcher.forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
