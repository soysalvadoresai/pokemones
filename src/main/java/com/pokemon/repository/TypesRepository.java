package com.pokemon.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pokemon.entity.Type;

@Repository

public interface TypesRepository extends JpaRepository<Type, Long> {

}
