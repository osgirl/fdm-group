package com.fdmgroup.services;

import com.fdmgroup.dao.PokeStatsDao;
import com.fdmgroup.dao.PokeStatsDaoImpl;

public class PokeStatsServiceImpl implements PokeStatsService {

	private PokeStatsDao pokeStatsDao;
	
	public PokeStatsServiceImpl() {
		pokeStatsDao = new PokeStatsDaoImpl();
	}
}
