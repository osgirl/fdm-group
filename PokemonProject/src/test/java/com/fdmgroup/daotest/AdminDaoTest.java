package com.fdmgroup.daotest;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.fdmgroup.dao.AdminDaoImpl;
import com.fdmgroup.models.Admin;

import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import junit.framework.TestCase;

public class AdminDaoTest extends TestCase {

	Admin mockAdmin;
	EntityManagerFactory mockEmf;
	EntityManager mockEm;
	Persistence mockPersistence;
	AdminDaoImpl adminDao;
	
	@Before
	public void setup()
	{
		mockPersistence = mock(Persistence.class);
		mockEmf = mock(EntityManagerFactory.class);
		mockEm = mock(EntityManager.class);
		mockAdmin = mock(Admin.class);
		adminDao = new AdminDaoImpl(mockEmf, mockEm);
	}
	

	
}
