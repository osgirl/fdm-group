package com.fdmgroup.services;

import java.util.List;

import com.fdmgroup.models.Pokemon;

public interface PokemonService {

	boolean Withdraw(Pokemon pokemon);
	
	boolean deposit(Pokemon pokemon);
	
	boolean swap(Pokemon partyPokemon, Pokemon storagePokemon);
	
	boolean changeOwner(Pokemon pokemon);
	
	List<Pokemon> getAllPokemonFromZone(String zone);
	
}
