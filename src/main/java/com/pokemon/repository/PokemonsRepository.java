package com.pokemon.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pokemon.entity.Pokemon;

@Repository

public interface PokemonsRepository extends JpaRepository<Pokemon, Long> {

}
