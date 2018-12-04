package com.fdmgroup.dao;

import java.util.Collections;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.fdmgroup.models.Pokemon;
import com.fdmgroup.models.Trainer;

public class TrainerDaoImpl implements TrainerDao {

	private EntityManagerFactory emf;
	private EntityManager em;
	
	public TrainerDaoImpl() {
		this.emf = Persistence.createEntityManagerFactory("PokemonProject");
		this.em = emf.createEntityManager();
	}
	
	public TrainerDaoImpl(EntityManagerFactory mockEmf, EntityManager mockEm) {
		this.emf = mockEmf;
		this.em = mockEm;
	}

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

	public void addTrainer(Trainer trainer) {
		openEntityManager();
		
		this.em.getTransaction().begin();
		this.em.persist(trainer);
		this.em.getTransaction().commit();
		
		closeEntityManager();
		
	}


	public boolean verifyPassword(String username, String password) {
		openEntityManager();
		Query query = em.createQuery("select trainer from Trainer trainer where trainer.username=:name",Trainer.class);
		query.setParameter("username", username);
		List<Trainer> trainer = query.getResultList();
		String actualPassword = null;
		for(Trainer tempTrainer : trainer)
		{
			actualPassword = tempTrainer.getPassword();
		}
		
		if(actualPassword .equals(password))
		{
			return true;
		}
		else		
		return false;
	}

	public void setMoney(Trainer trainer) {
		
		openEntityManager();
		Trainer tempTrainer = em.find(Trainer.class, trainer);
		
		em.getTransaction().begin();
		tempTrainer.setMoney(trainer.getMoney());
		em.getTransaction().commit();

	}



	public Trainer getTrainer(String username) {
		openEntityManager();
		Query query = em.createQuery("select trainer from Trainer trainer where trainer.username=:username",Trainer.class);
		query.setParameter("username", username);
		List<Trainer> trainer = query.getResultList();
		
		for(Trainer tempTrainer : trainer)
		{
			return tempTrainer;
		}
		
		return null;
		
	}

	public List<Pokemon> getAllOwnedPokemon(Trainer trainer) {
		
		int id = trainer.getTrainerID();
		Query query = em.createQuery("select pokemon from Pokemon pokemon where pokemon.trainerID=:id",Pokemon.class);
		query.setParameter("trainerID", id);
		List<Pokemon> result = query.getResultList();
		return Collections.unmodifiableList(result);
	}

	public List<Pokemon> getAllPartyPokemon(Trainer trainer) {
		int id = trainer.getTrainerID();
		Query query = em.createQuery("select pokemon from Pokemon pokemon where pokemon.trainerID=:id AND pokemon.storage=:false",Pokemon.class);
		query.setParameter("trainerID", id);
		List<Pokemon> result = query.getResultList();
		return Collections.unmodifiableList(result);
		
	}

	public List<Pokemon> getAllStoredPokemon(Trainer trainer) {
		int id = trainer.getTrainerID();
		Query query = em.createQuery("select pokemon from Pokemon pokemon where pokemon.trainerID=:id AND pokemon.storage=:true",Pokemon.class);
		query.setParameter("trainerID", id);
		List<Pokemon> result = query.getResultList();
		return Collections.unmodifiableList(result);
	}


}
