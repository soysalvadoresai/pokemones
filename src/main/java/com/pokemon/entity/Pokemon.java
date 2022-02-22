package com.pokemon.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import java.util.List;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Entity
@Data
@Getter
@Setter
@Table(name = "Pokemons")
public class Pokemon {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	
	@ManyToMany
	@JoinTable(
			  name = "pokemons_type", 
			  joinColumns = @JoinColumn(name = "id_type"), 
			  inverseJoinColumns = @JoinColumn(name = "id_pokemon"))
	private List<Type> types;
}
