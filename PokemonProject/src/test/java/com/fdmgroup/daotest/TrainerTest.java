package com.fdmgroup.daotest;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;

import com.fdmgroup.dao.TrainerDaoImpl;
import com.fdmgroup.models.Trainer;;

public class TrainerTest {
	
	Trainer mockTrainer;
@InjectMocks TrainerDaoImpl trainerDao;
	EntityManagerFactory mockEmf;
	EntityManager mockEm;
	Persistence mockPersistence;
	
	@Before
	public void setup()
	{
		mockTrainer = mock(Trainer.class);
		mockEmf = mock(EntityManagerFactory.class);
		mockEm = mock(EntityManager.class);
		mockPersistence = mock(Persistence.class);
		trainerDao = new TrainerDaoImpl(mockEmf,mockEm); 
		
	}

	@Test
	public void test_OpenEntityManagerMethod_Calls_CreateEntityManager() 
	{
		trainerDao.openEntityManager();
		verify(mockEmf).createEntityManager();	
	}
	
	@Test
	public void test_AddTrainerMethod_Calls_EntityManagerGetTransactionBegin() {
		trainerDao.addTrainer(mockTrainer);
		verify(mockEm).getTransaction().begin();	
	}
	
	@Test
	public void test_AddTrainerMethod_Calls_EntityManagerPersist()
	{
		trainerDao.addTrainer(mockTrainer);
		verify(mockEm).persist(mockTrainer);
	}
	

}
