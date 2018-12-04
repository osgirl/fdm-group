package com.fdmgroup.services;

import com.fdmgroup.models.PokeStats;
import com.fdmgroup.models.Pokemon;

public interface PokeStatsService {

	PokeStats getStats(Pokemon pokemon);
	
	
}
