package com.fdmgroup.services;

import java.util.List;

import com.fdmgroup.dao.TrainerDao;
import com.fdmgroup.dao.TrainerDaoImpl;
import com.fdmgroup.models.Pokemon;
import com.fdmgroup.models.Trainer;

public class TrainerServiceImpl implements TrainerService {
	
	TrainerDao trainerDao;
	
	private TrainerServiceImpl(){
		trainerDao = new TrainerDaoImpl();
	}

	public boolean addTrainer(Trainer trainer) {
		// TODO Auto-generated method stub
		return this.trainerDao.addTrainer(trainer);
	}

	public boolean verifyPassword(String username, String password) {
		// TODO Auto-generated method stub
		return this.trainerDao.verifyPassword(username, password);
	}
	
	public List<Pokemon> getAllOwnedPokemon(Trainer trainer) {
		// TODO Auto-generated method stub
		return this.trainerDao.getAllOwnedPokemon(trainer);
	}

	public List<Pokemon> getAllPartyPokemon(Trainer trainer) {
		// TODO Auto-generated method stub
		return this.trainerDao.getAllPartyPokemon(trainer);
	}

	public List<Pokemon> getAllStoredPokemon(Trainer trainer) {
		// TODO Auto-generated method stub
		return this.trainerDao.getAllStoredPokemon(trainer);
	}

	public Trainer getTrainer(String username) {
		// TODO Auto-generated method stub
		return this.trainerDao.getTrainer(username);
	}

	public void setMoney(Trainer trainer, double money) {
		// TODO Auto-generated method stub
		this.trainerDao.setMoney(trainer, money);
	}

}
