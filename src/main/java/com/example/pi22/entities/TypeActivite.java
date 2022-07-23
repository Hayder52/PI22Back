package com.example.pi22.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

@Entity
@Data
public class TypeActivite implements Serializable{
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	//@GeneratedValue(strategy = GenrationType.IDENTITY)
	
	private Long idFav;
	private String name;
	

	
	@JsonIgnore
	@OneToMany(mappedBy = "typeActivite")
	private Set<Activite> activites;
	
	
	
	

}
