package com.fdmgroup.dao;

import java.util.List;
import java.util.Random;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.fdmgroup.models.PokeStats;
import com.fdmgroup.models.Pokemon;

public class PokemonDaoImpl implements PokemonDao {

	private EntityManagerFactory emf;
	private EntityManager em;

	public void openEntityManager() {
		if (!this.emf.isOpen()) {
			this.emf = Persistence.createEntityManagerFactory("PokemonProject");
			this.em = emf.createEntityManager();
		}
	}

	public void closeEntityManager() {
		this.em.close();
		this.emf.close();
	}

	public boolean Withdraw(Pokemon pokemon) {
		// TODO Auto-generated method stub
		openEntityManager();

		Pokemon pokeUpdate = em.find(Pokemon.class, pokemon.getPokemonID());

		em.getTransaction().begin();

		pokeUpdate.setStorage(false);

		em.getTransaction().commit();
		System.out.println();
		System.out.println("-------");
		System.out.println();
		return true;
	}

	public boolean deposit(Pokemon pokemon) {
		openEntityManager();

		Pokemon pokeUpdate = em.find(Pokemon.class, pokemon.getPokemonID());

		em.getTransaction().begin();

		pokeUpdate.setStorage(true);

		em.getTransaction().commit();
		System.out.println();
		System.out.println("-------");
		System.out.println();
		return true;
	}

	public boolean swap(Pokemon partyPokemon, Pokemon storagePokemon) {
		openEntityManager();

		Pokemon pokeDeposit = em.find(Pokemon.class, partyPokemon.getPokemonID());
		Pokemon pokeWithdraw = em.find(Pokemon.class, storagePokemon.getPokemonID());
		em.getTransaction().begin();

		pokeDeposit.setStorage(true);
		pokeWithdraw.setStorage(false);
		
		em.getTransaction().commit();
		System.out.println();
		System.out.println("-------");
		System.out.println();
		return true;
	}

	public boolean changeOwner(Pokemon pokemon) {
		openEntityManager();

		Pokemon pokeUpdate = em.find(Pokemon.class, pokemon.getPokemonID());

		em.getTransaction().begin();

		pokeUpdate.setTrainerID(pokemon.getTrainerID());
		pokeUpdate.setCaught(pokemon.isCaught());

		em.getTransaction().commit();
		System.out.println();
		System.out.println("-------");
		System.out.println();
		return true;
	}

	public boolean addPokemon(Pokemon pokemon) {
		
		openEntityManager();

		em.getTransaction().begin();

		em.persist(pokemon);

		em.getTransaction().commit();

		System.out.println();
		System.out.println("-------");
		System.out.println();
		return false;
		
	}
	public Pokemon getPokemonFromZone(String zone) {
		List<PokeStats> pokeList;
		
		Query query = em.createQuery("select pokeStats from PokeStats pokeStats where pokeStats.zone=:Zone order by ID", PokeStats.class);
		query.setParameter("Zone", zone);
		pokeList = query.getResultList();
		int rnd = new Random().nextInt(pokeList.size());
		PokeStats selection = pokeList.get(rnd);
		
		Pokemon pokemon = new Pokemon(selection);
		this.addPokemon(pokemon);
		return pokemon;
	}
}
