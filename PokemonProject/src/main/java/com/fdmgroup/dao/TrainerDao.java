package com.fdmgroup.dao;

import java.util.List;

import com.fdmgroup.models.Pokemon;
import com.fdmgroup.models.Trainer;

public interface TrainerDao {

	void addTrainer(Trainer trainer);
	
	boolean verifyPassword(String password, String username);
	
	void setMoney(Trainer trainer);
		
	Trainer getTrainer(String username);
	
	List<Pokemon> getAllOwnedPokemon(Trainer trainer);
	
	List<Pokemon> getAllPartyPokemon(Trainer trainer);
	
	List<Pokemon> getAllStoredPokemon(Trainer trainer);
	
}
