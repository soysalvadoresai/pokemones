package com.pokemon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pokemon.entity.Rol;
import com.pokemon.entity.User;
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
	
	public User createUser(CreateUserRequest createUserRequest) {
		User users = new User(createUserRequest);
		Rol roles = new Rol();
		roles.setId(createUserRequest.getRol().getId());
		roles.setRol(createUserRequest.getRol().getRol());
		users.getRol();
		
		
		return users;
	}

}
