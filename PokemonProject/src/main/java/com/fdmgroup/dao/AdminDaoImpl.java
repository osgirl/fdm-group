package com.fdmgroup.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.fdmgroup.models.Admin;
import com.fdmgroup.models.Trainer;

public class AdminDaoImpl implements AdminDao {

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

	public Admin getAdmin(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	public Trainer getTrainer(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean verifyPassword(String username, String password) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean addTrainer(Trainer trainer) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean removeTrainer(Trainer trainer) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean addAdmin(Admin admin) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean removeAdmin(Admin admin) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean updateTrainer(String username, Trainer trainer) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean updateAdmin(String username, Admin admin) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
