package com.fdmgroup.services;

import java.util.List;

import com.fdmgroup.models.Pokemon;
import com.fdmgroup.models.Trainer;

public interface TrainerService {

	void addTrainer(Trainer trainer);
	
	boolean findUsername(String password);
	
	boolean verifyPassword(String password);
	
	void setMoney(Trainer trainer);
	
	Trainer getTrainer(int id);
	
	Trainer getTrainer(String username);
	
	List<Pokemon> getAllOwnedPokemon(Trainer trainer);
	
	List<Pokemon> getAllPartyPokemon(Trainer trainer);
	
	List<Pokemon> getAllStoredPokemon(Trainer trainer);
	
}
