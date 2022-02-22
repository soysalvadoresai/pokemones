package com.pokemon.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pokemon.entity.Roles;

@Repository

public interface RolesRepository extends JpaRepository<Roles, Long>{

}
