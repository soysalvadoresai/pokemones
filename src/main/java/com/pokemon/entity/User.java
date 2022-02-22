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
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nameTraineer;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "rol_id")
	private Rol rol;
	
	private String password;
	
	private String username;
	
	private String teamName;

	public User(CreateUserRequest createUserRequest) {
		this.nameTraineer = createUserRequest.getNameTraineer();
		this.password = createUserRequest.getPassword();
		this.username = createUserRequest.getUsername();
		this.teamName = createUserRequest.getTeamName();
	}
	
	
}
