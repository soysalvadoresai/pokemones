package com.pokemon.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pokemon.entity.Types;

@Repository

public interface TypesRepository extends JpaRepository<Types, Long> {

}
