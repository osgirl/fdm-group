package com.fdmgroup.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.fdmgroup.models.Pokemon;

public class PokemonDaoImpl implements PokemonDao {

	private EntityManagerFactory emf;
	private EntityManager em;
	
	public void openEntityManager() {
		if (!this.emf.isOpen()) {
			this.emf = Persistence.createEntityManagerFactory("mydb");
			this.em = emf.createEntityManager();
		}
	}

	public void closeEntityManager() {
		this.em.close();
		this.emf.close();
	}

	public boolean Withdraw(Pokemon pokemon) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean deposit(Pokemon pokemon) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean swap(Pokemon partyPokemon, Pokemon storagePokemon) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean changeOwner(Pokemon pokemon, int newOwnerID) {
		// TODO Auto-generated method stub
		return false;
	}

	public List<Pokemon> getAllPokemonFromZone(String zone) {
		// TODO Auto-generated method stub
		return null;
	}
}
