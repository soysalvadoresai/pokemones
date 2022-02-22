package com.pokemon.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pokemon.entity.Pokemons;

@Repository

public interface PokemonsRepository extends JpaRepository<Pokemons, Long> {

}
