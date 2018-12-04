package com.fdmgroup.services;

import java.util.List;

import com.fdmgroup.models.Trade;
import com.fdmgroup.models.Trainer;

public interface TradeService {

	List<Trade> listTrades(Trainer trainer);
	
	void acceptTrade(Trade trade);
	
	void declineTrade(Trade trade);
	
	
}
