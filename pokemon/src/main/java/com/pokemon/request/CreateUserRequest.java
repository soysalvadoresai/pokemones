package com.pokemon.request;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateUserRequest {
	
	private int rol_id;
	private String password;
	private String username;
	private String name_traineer;
	private String team_name;
	
	private String name_pokemon;
	private List<String> tipos;
	
}
