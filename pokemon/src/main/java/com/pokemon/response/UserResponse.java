package com.pokemon.response;


import com.pokemon.entity.User;
import com.pokemon.entity.Rol;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UserResponse {
	
private Long id;
	
	
	private String nameTraineer;
	
	private Rol rol;
	
	private String password;
	
	private String username;
	
	private String teamName;
	
	public UserResponse(User user) {
		
		this.nameTraineer = user.getNameTraineer();
		this.rol = user.getRol();
	}
	

}
