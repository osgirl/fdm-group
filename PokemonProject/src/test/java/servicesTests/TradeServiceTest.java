package servicesTests;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import com.fdmgroup.dao.TradeDaoImpl;
import com.fdmgroup.models.Trade;
import com.fdmgroup.models.Trainer;
import com.fdmgroup.services.TradeServiceImpl;

public class TradeServiceTest {

	@InjectMocks
	TradeServiceImpl tradeService;

	@Mock
	TradeDaoImpl mockTradeDao;

	@Mock
	Trainer trainer;

	@Test(expected=NullPointerException.class)
	public void test() {
		List<Trade> trades = new ArrayList<Trade>();
		when(mockTradeDao.listTrades(trainer)).thenReturn(trades);
		verify(mockTradeDao, times(1)).listTrades(trainer);
	}
}
