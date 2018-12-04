package com.fdmgroup.dao;

import java.util.List;

import com.fdmgroup.models.Pokemon;

public interface PokemonDao {


	boolean Withdraw(Pokemon pokemon);
	
	boolean deposit(Pokemon pokemon);
	
	boolean swap(Pokemon partyPokemon, Pokemon storagePokemon);
	
	boolean changeOwner(Pokemon pokemon, int newOwnerID);
	
	List<Pokemon> getAllPokemonFromZone(String zone);
	
}
