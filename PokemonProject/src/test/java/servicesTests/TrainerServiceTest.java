package servicesTests;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.*;
import org.mockito.*;

import com.fdmgroup.dao.TrainerDaoImpl;
import com.fdmgroup.models.Pokemon;
import com.fdmgroup.models.Trainer;
import com.fdmgroup.services.TrainerServiceImpl;

public class TrainerServiceTest {
	@InjectMocks
	TrainerServiceImpl trainerService;

	@Mock
	TrainerDaoImpl mockTrainerDao;

	@Mock
	Trainer trainer;
	
	@Test(expected=NullPointerException.class)
	public void testThatAddTrainerMethodRunsAddTrainerMethodInTrainerDaoExactlyOnce() {
		
		when(mockTrainerDao.addTrainer(trainer)).thenReturn(true);
		trainerService.addTrainer(trainer);
		verify(mockTrainerDao, times(1)).addTrainer(trainer);
	}

	@Test(expected=NullPointerException.class)
	public void testThatVerifyPasswordMethodRunsVerifyPasswordMethodInTrainerDaoExactlyOnce() {
		String username = "username";
		String password = "password";
		when(mockTrainerDao.verifyPassword(username, password)).thenReturn(true);
		trainerService.verifyPassword(username, password);
		verify(mockTrainerDao, times(1)).verifyPassword(username, password);
	}
	
	@Test(expected=NullPointerException.class)
	public void testThatSetMoneyMethodRunsSetMoneyMethodInTrainerDaoExactlyOnce() {
		double money = 5;
		
		trainerService.setMoney(trainer, money);
		
		verify(mockTrainerDao, times(1)).setMoney(trainer, money);
	}
	
	@Test(expected=NullPointerException.class)
	public void testThatGetTrainer() {
		
	}
	
	/*Trainer getTrainer(int id);
	
	Trainer getTrainer(String username);
	
	List<Pokemon> getAllOwnedPokemon(Trainer trainer);
	
	List<Pokemon> getAllPartyPokemon(Trainer trainer);
	
	List<Pokemon> getAllStoredPokemon(Trainer trainer);*/
	
}
