package com.fdmgroup.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.fdmgroup.models.Trade;
import com.fdmgroup.models.Trainer;

public class TradeDaoImpl implements TradeDao {

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

	public List<Trade> listTrades(Trainer trainer) {
		// TODO Auto-generated method stub
		return null;
	}

	public void acceptTrade(Trade trade) {
		// TODO Auto-generated method stub
		
	}

	public void declineTrade(Trade trade) {
		// TODO Auto-generated method stub
		
	}
}
