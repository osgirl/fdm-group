package com.fdmgroup.services;

import com.fdmgroup.models.Admin;
import com.fdmgroup.models.Trainer;

public interface AdminService {

	Admin getAdmin(int id);
	
	Admin getAdmin(String username);
	
	Trainer getTrainer(int id);
	
	Trainer getTrainer(String username);

	boolean verifyPassword(String password, String username);

	boolean addTrainer(Trainer trainer);

	boolean removeTrainer(Trainer trainer);

	boolean addAdmin(Admin admin);

	boolean removeAdmin(Admin admin);

	boolean updateTrainer(int id, Trainer trainer);
	
	boolean updateAdmin(int id, Admin admin);
	
}
