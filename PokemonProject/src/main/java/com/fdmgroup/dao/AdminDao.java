package com.fdmgroup.dao;

import com.fdmgroup.models.Admin;
import com.fdmgroup.models.Trainer;

public interface AdminDao {

	Admin getAdmin(String username);
	
	Trainer getTrainer(String username);

	boolean verifyPassword(String username, String password);

	boolean addTrainer(Trainer trainer);

	boolean removeTrainer(Trainer trainer);

	boolean addAdmin(Admin admin);

	boolean removeAdmin(Admin admin);

	boolean updateTrainer(String username, Trainer trainer);

	boolean updateAdmin(String username, Admin admin);

}
