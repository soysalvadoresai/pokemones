package com.pokemon.service;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pokemon.entity.Roles;
import com.pokemon.entity.Users;
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
	
	public Users createUser(CreateUserRequest createUserRequest) {
		Users users = new Users(createUserRequest);
		Roles roles = new Roles();
		roles.setId(createUserRequest.getRol().getId());
		roles.setRol(createUserRequest.getRol().getRol());
		users.getRol();
		return users;
	}

}
