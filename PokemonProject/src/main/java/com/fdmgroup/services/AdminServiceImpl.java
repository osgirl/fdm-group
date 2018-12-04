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

	public boolean updateTrainer(int id, Trainer trainer) {
		// TODO Auto-generated method stub
		return this.adminDao.updateTrainer(id, trainer);
	}

	public boolean updateAdmin(int id, Admin admin) {
		// TODO Auto-generated method stub
		return this.adminDao.updateAdmin(id, admin);
	}

	public Admin getAdmin(int id) {
		// TODO Auto-generated method stub
		return this.adminDao.getAdmin(id);
	}

	public Admin getAdmin(String username) {
		// TODO Auto-generated method stub
		return this.adminDao.getAdmin(username);
	}

	public Trainer getTrainer(int id) {
		// TODO Auto-generated method stub
		return this.adminDao.getTrainer(id);
	}

	public Trainer getTrainer(String username) {
		// TODO Auto-generated method stub
		return this.adminDao.getTrainer(username);
	}

}
