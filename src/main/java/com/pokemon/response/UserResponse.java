package com.pokemon.response;



import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import com.pokemon.entity.User;

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
	
	
	private Long rolId;
	private String rol;
	private String password;
	
	private String username;
	
	private String teamName;

	public UserResponse(User user) {
		this.id = user.getId();
		this.nameTraineer = user.getNameTraineer();
		this.rol = user.getRol().getRol();
		this.rolId = user.getRol().getId();
		this.password = user.getPassword();
		this.username = user.getUsername();
		this.teamName = user.getTeamName();
	}
}
