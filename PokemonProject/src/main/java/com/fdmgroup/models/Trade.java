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
@Table(name = "Trade")
public class Trade {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int tradeID;
	
	@ManyToOne
	@JoinColumn(name = "trainerID")
	private Trainer offerFrom;
	
	@ManyToOne
	@JoinColumn(name = "trainerID")
	private Trainer offterTo;
	
	@ManyToOne
	@JoinColumn(name = "pokemonID")
	private Pokemon pokemonOffer;
	
	@ManyToOne
	@JoinColumn(name = "pokemonID")
	private Pokemon pokemonRequest;

	
	public Trade() {
	}

	public Trade(Trainer offerFrom, Trainer offterTo, Pokemon pokemonOffer, Pokemon pokemonRequest) {
		this.offerFrom = offerFrom;
		this.offterTo = offterTo;
		this.pokemonOffer = pokemonOffer;
		this.pokemonRequest = pokemonRequest;
	}

	public int getTradeID() {
		return tradeID;
	}

	public void setTradeID(int tradeID) {
		this.tradeID = tradeID;
	}

	public Trainer getOfferFrom() {
		return offerFrom;
	}

	public void setOfferFrom(Trainer offerFrom) {
		this.offerFrom = offerFrom;
	}

	public Trainer getOffterTo() {
		return offterTo;
	}

	public void setOffterTo(Trainer offterTo) {
		this.offterTo = offterTo;
	}

	public Pokemon getPokemonOffer() {
		return pokemonOffer;
	}

	public void setPokemonOffer(Pokemon pokemonOffer) {
		this.pokemonOffer = pokemonOffer;
	}

	public Pokemon getPokemonRequest() {
		return pokemonRequest;
	}

	public void setPokemonRequest(Pokemon pokemonRequest) {
		this.pokemonRequest = pokemonRequest;
	}
	
	
}
