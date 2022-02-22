package com.pokemon.request;

import java.util.List;

import com.pokemon.entity.Rol;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateUserRequest {
	
	private Rol rol;
	private String password;
	private String username;
	private String nameTraineer;
	private String teamName;
	
	private String namePokemon;
	private List<String> tipos;
	
}
