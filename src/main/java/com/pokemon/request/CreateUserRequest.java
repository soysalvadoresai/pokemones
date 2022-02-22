package com.pokemon.request;

import java.util.List;

import com.pokemon.entity.Roles;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateUserRequest {
	
	private Roles rol;
	private String password;
	private String username;
	private String name_traineer;
	private String team_name;
	
	private String name_pokemon;
	private List<String> tipos;
	
}
