package com.pokemon.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pokemon.entity.Users;

@Repository
public interface UserRepository extends JpaRepository<Users, Long> {

}

