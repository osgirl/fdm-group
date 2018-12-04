package com.fdmgroup.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PokeStats")
public class PokeStats {

	@Id
	private String name;
	@Column(name = "hitPoints", nullable = false)
	private int hitPoints;
	@Column(name = "attack", nullable = false)
	private int attack;
	@Column(name = "defence", nullable = false)
	private int defence;
	@Column(name = "specialAttack", nullable = false)
	private int specialAttack;
	@Column(name = "specialDefence", nullable = false)
	private int specialDefence;
	@Column(name = "speed", nullable = false)
	private int speed;
	@Column(name = "zone", nullable = false)
	private String zone;
	@Column(name = "catchChance", nullable = false)
	private int catchChance;
	@Column(name = "fleeChance", nullable = false)
	private int fleeChance;
	@Column(name = "rarity", nullable = false)
	private String rarity;
	
	
	public PokeStats() {
	}
	public PokeStats(String name, int hitPoints, int attack, int defence, int specialAttack, int specialDefence,
			int speed, String zone, int catchChance, int fleeChance, String rarity) {
		this.name = name;
		this.hitPoints = hitPoints;
		this.attack = attack;
		this.defence = defence;
		this.specialAttack = specialAttack;
		this.specialDefence = specialDefence;
		this.speed = speed;
		this.zone = zone;
		this.catchChance = catchChance;
		this.fleeChance = fleeChance;
		this.rarity = rarity;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHitPoints() {
		return hitPoints;
	}
	public void setHitPoints(int hitPoints) {
		this.hitPoints = hitPoints;
	}
	public int getAttack() {
		return attack;
	}
	public void setAttack(int attack) {
		this.attack = attack;
	}
	public int getDefence() {
		return defence;
	}
	public void setDefence(int defence) {
		this.defence = defence;
	}
	public int getSpecialAttack() {
		return specialAttack;
	}
	public void setSpecialAttack(int specialAttack) {
		this.specialAttack = specialAttack;
	}
	public int getSpecialDefence() {
		return specialDefence;
	}
	public void setSpecialDefence(int specialDefence) {
		this.specialDefence = specialDefence;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public String getZone() {
		return zone;
	}
	public void setZone(String zone) {
		this.zone = zone;
	}
	public int getCatchChance() {
		return catchChance;
	}
	public void setCatchChance(int catchChance) {
		this.catchChance = catchChance;
	}
	public int getFleeChance() {
		return fleeChance;
	}
	public void setFleeChance(int fleeChance) {
		this.fleeChance = fleeChance;
	}
	public String getRarity() {
		return rarity;
	}
	public void setRarity(String rarity) {
		this.rarity = rarity;
	}
}
