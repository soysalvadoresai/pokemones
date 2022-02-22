package com.pokemon.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pokemon.entity.Rol;

@Repository

public interface RolesRepository extends JpaRepository<Rol, Long>{

}
