package com.fdmgroup.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class PokemonDaoImpl implements PokemonDao {

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
}
