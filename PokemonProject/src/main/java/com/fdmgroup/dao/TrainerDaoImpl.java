package com.fdmgroup.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.fdmgroup.models.Pokemon;
import com.fdmgroup.models.Trainer;

public class TrainerDaoImpl implements TrainerDao {

	private EntityManagerFactory emf;
	private EntityManager em;
	
	public void openEntityManager() {
		if (!this.emf.isOpen()) {
			this.emf = Persistence.createEntityManagerFactory("PokemonProject");
			this.em = emf.createEntityManager();
		}
	}

	public void closeEntityManager() {
		this.em.close();
		this.emf.close();
	}

	public boolean addTrainer(Trainer trainer) {

		return true;
	}

	public boolean verifyPassword(String username, String password) {
		// TODO Auto-generated method stub
		return false;
	}

	public Trainer getTrainer(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public Trainer getTrainer(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Pokemon> getAllOwnedPokemon(Trainer trainer) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Pokemon> getAllPartyPokemon(Trainer trainer) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Pokemon> getAllStoredPokemon(Trainer trainer) {
		// TODO Auto-generated method stub
		return null;
	}

	public void setMoney(Trainer trainer, double money) {
		// TODO Auto-generated method stub
		
	}
}
