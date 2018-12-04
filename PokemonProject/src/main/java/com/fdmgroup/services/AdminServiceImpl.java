package com.fdmgroup.services;

import com.fdmgroup.dao.AdminDao;
import com.fdmgroup.dao.AdminDaoImpl;
import com.fdmgroup.models.Admin;
import com.fdmgroup.models.Trainer;

public class AdminServiceImpl implements AdminService {
	private AdminDao adminDao;

	public AdminServiceImpl() {

		this.adminDao = new AdminDaoImpl();
	}
	public boolean verifyPassword(String username, String password) {
		// TODO Auto-generated method stub
		return this.adminDao.verifyPassword(username, password);
	}

	public boolean addTrainer(Trainer trainer) {
		// TODO Auto-generated method stub
		return this.adminDao.addTrainer(trainer);

	}

	public boolean removeTrainer(Trainer trainer) {
		// TODO Auto-generated method stub
		return this.adminDao.addTrainer(trainer);
	}

	public boolean addAdmin(Admin admin) {
		// TODO Auto-generated method stub
		return this.adminDao.addAdmin(admin);
	}

	public boolean removeAdmin(Admin admin) {
		// TODO Auto-generated method stub
		return this.adminDao.removeAdmin(admin);
	}

	public boolean updateTrainer(String username, Trainer trainer) {
		// TODO Auto-generated method stub
		return this.adminDao.updateTrainer(username, trainer);
	}

	public boolean updateAdmin(String username, Admin admin) {
		// TODO Auto-generated method stub
		return this.adminDao.updateAdmin(username, admin);
	}

	public Admin getAdmin(String username) {
		// TODO Auto-generated method stub
		return this.adminDao.getAdmin(username);
	}

	public Trainer getTrainer(String username) {
		// TODO Auto-generated method stub
		return this.adminDao.getTrainer(username);
	}

}
