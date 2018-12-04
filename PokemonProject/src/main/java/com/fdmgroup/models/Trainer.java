package com.fdmgroup.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Trainer")
public class Trainer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int trainerID;
	@Column(name = "username", nullable = false)
	private String username;
	@Column(name = "password", nullable = false)
	private String password;
	@Column(name = "money", nullable = false)
	private double money;
	
	
	public Trainer() {
	}
	public Trainer(String username, String password, double money) {

		this.username = username;
		this.password = password;
		this.money = money;
	}
	public int getTrainerID() {
		return trainerID;
	}
	public void setTrainerID(int trainerID) {
		this.trainerID = trainerID;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		this.money = money;
	}
	
	
}
