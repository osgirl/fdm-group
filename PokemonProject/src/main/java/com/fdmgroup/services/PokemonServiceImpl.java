package com.fdmgroup.services;

import java.util.List;

import com.fdmgroup.dao.PokemonDao;
import com.fdmgroup.dao.PokemonDaoImpl;
import com.fdmgroup.models.Pokemon;

public class PokemonServiceImpl implements PokemonService {

	private PokemonDao pokemonDao;
	
	private PokemonServiceImpl() {
		pokemonDao = new PokemonDaoImpl();
	}

	public boolean Withdraw(Pokemon pokemon) {
		// TODO Auto-generated method stub
		return this.pokemonDao.Withdraw(pokemon);
	}

	public boolean deposit(Pokemon pokemon) {
		// TODO Auto-generated method stub
		return this.pokemonDao.deposit(pokemon);
	}

	public boolean swap(Pokemon partyPokemon, Pokemon storagePokemon) {
		// TODO Auto-generated method stub
		return this.pokemonDao.swap(partyPokemon, storagePokemon);
	}

	public boolean changeOwner(Pokemon pokemon) {
		// TODO Auto-generated method stub
		return this.pokemonDao.changeOwner(pokemon);
	}

	public Pokemon getPokemonFromZone(String zone) {
		// TODO Auto-generated method stub
		return this.pokemonDao.getPokemonFromZone(zone);
	}
}
