package com.pokemon.response;



import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import com.pokemon.entity.Users;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class UserResponse {

	private Long id;
	private String nameTraineer;
	private Long rol_id;
	private String rol;
	private String password;
	
	private String username;
	
	private String teamName;

	public UserResponse(Users user) {
		this.id = user.getId();
		this.nameTraineer = user.getNameTraineer();
		this.rol = user.getRol().getRol();
		this.rol_id = user.getRol().getId();
		this.password = user.getPassword();
		this.username = user.getUsername();
		this.teamName = user.getTeamName();
	}
}
