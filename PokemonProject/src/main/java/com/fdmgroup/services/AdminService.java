package com.fdmgroup.services;

import com.fdmgroup.models.Admin;
import com.fdmgroup.models.Trainer;

public interface AdminService {
	
	Admin getAdmin(String username);
	
	Trainer getTrainer(String username);

	boolean verifyPassword(String password, String username);

	boolean addTrainer(Trainer trainer);

	boolean removeTrainer(Trainer trainer);

	boolean addAdmin(Admin admin);

	boolean removeAdmin(Admin admin);

	boolean updateTrainer(String username, Trainer trainer);
	
	boolean updateAdmin(String Username, Admin admin);
	
}
