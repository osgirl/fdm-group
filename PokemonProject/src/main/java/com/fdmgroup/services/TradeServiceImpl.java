package com.fdmgroup.services;

import java.util.List;

import com.fdmgroup.dao.TradeDao;
import com.fdmgroup.dao.TradeDaoImpl;
import com.fdmgroup.models.Trade;
import com.fdmgroup.models.Trainer;

public class TradeServiceImpl implements TradeService {

	private TradeDao tradeDao;
	
	public TradeServiceImpl(){
		tradeDao = new TradeDaoImpl();
	}

	public List<Trade> listTrades(Trainer trainer) {
		// TODO Auto-generated method stub
		return this.tradeDao.listTrades(trainer);
	}

	public void acceptTrade(Trade trade) {
		// TODO Auto-generated method stub
		this.tradeDao.acceptTrade(trade);
	}

	public void declineTrade(Trade trade) {
		// TODO Auto-generated method stub
		this.tradeDao.declineTrade(trade);
	}
}
