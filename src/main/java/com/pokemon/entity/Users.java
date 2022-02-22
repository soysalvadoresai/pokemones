package com.pokemon.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.pokemon.request.CreateUserRequest;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Entity
@Data
@AllArgsConstructor
@Table(name = "users")
public class Users {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	
	private String nameTraineer;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "rol_id")
	private Roles rol;
	private String password;
	
	private String username;
	
	private String teamName;

	public Users(CreateUserRequest createUserRequest) {
		this.nameTraineer = createUserRequest.getName_traineer();
		this.password = createUserRequest.getPassword();
		this.username = createUserRequest.getUsername();
		this.teamName = createUserRequest.getTeam_name();
	}
	
	
}
