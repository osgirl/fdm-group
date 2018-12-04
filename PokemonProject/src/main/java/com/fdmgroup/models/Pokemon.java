package com.fdmgroup.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Pokemon")
public class Pokemon {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int pokemonID;
	@ManyToOne
	@JoinColumn(name = "trainerID")
	private Trainer trainerID;
	@ManyToOne
	@JoinColumn(name = "name")
	private PokeStats name;
	@Column(name = "tired", nullable = false)
	private boolean tired;
	@Column(name = "storage", nullable = false)
	private boolean storage;
	@Column(name = "caught", nullable = false)
	private boolean caught;
	
	
	public Pokemon() {
	}
	public Pokemon(int pokemonID, Trainer trainerID, PokeStats name, boolean tired, boolean storage, boolean caught) {
		this.pokemonID = pokemonID;
		this.trainerID = trainerID;
		this.name = name;
		this.tired = tired;
		this.storage = storage;
		this.caught = caught;
	}
	public int getPokemonID() {
		return pokemonID;
	}
	public void setPokemonID(int pokemonID) {
		this.pokemonID = pokemonID;
	}
	public Trainer getTrainerID() {
		return trainerID;
	}
	public void setTrainerID(Trainer trainerID) {
		this.trainerID = trainerID;
	}
	public PokeStats getName() {
		return name;
	}
	public void setName(PokeStats name) {
		this.name = name;
	}
	public boolean isTired() {
		return tired;
	}
	public void setTired(boolean tired) {
		this.tired = tired;
	}
	public boolean isStorage() {
		return storage;
	}
	public void setStorage(boolean storage) {
		this.storage = storage;
	}
	public boolean isCaught() {
		return caught;
	}
	public void setCaught(boolean caught) {
		this.caught = caught;
	}
	
	
}
