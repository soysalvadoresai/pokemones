package com.pokemon.service;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pokemon.repository.PokemonsRepository;
import com.pokemon.repository.RolesRepository;
import com.pokemon.repository.TypesRepository;
import com.pokemon.repository.UserRepository;
import com.pokemon.request.CreateUserRequest;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	TypesRepository typerRepository;
	
	@Autowired
	RolesRepository rolesRepository;
	
	@Autowired
	PokemonsRepository pokemonsRepository;
	
	public User createUser (CreateUserRequest createUserRequest) {
		User user = new User(createUserRequest);
		
		
	}

}
