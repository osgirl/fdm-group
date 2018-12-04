package com.fdmgroup.dao;

import java.util.List;

import com.fdmgroup.models.Pokemon;
import com.fdmgroup.models.Trainer;

public interface TrainerDao {

	boolean addTrainer(Trainer trainer);
	
	boolean verifyPassword(String username, String password);
	
	void setMoney(Trainer trainer, double money);
	
	Trainer getTrainer(String username);
	
	List<Pokemon> getAllOwnedPokemon(Trainer trainer);
	
	List<Pokemon> getAllPartyPokemon(Trainer trainer);
	
	List<Pokemon> getAllStoredPokemon(Trainer trainer);
	
}
