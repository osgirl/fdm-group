package com.fdmgroup.services;

import com.fdmgroup.dao.PokeStatsDao;
import com.fdmgroup.dao.PokeStatsDaoImpl;
import com.fdmgroup.models.PokeStats;
import com.fdmgroup.models.Pokemon;

public class PokeStatsServiceImpl implements PokeStatsService {

	private PokeStatsDao pokeStatsDao;
	
	public PokeStatsServiceImpl() {
		pokeStatsDao = new PokeStatsDaoImpl();
	}

	public PokeStats getStats(Pokemon pokemon) {
		// TODO Auto-generated method stub
		return null;
	}
}
