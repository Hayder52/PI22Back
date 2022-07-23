package com.example.pi22.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
@Entity

public class Reservation implements Serializable {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private int nbrDePlace;
    private Long prixTotale;

    @ManyToOne
    private User userRes;


    @ManyToOne
    private Evenement evenementt;


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public int getNbrDePlace() {
		return nbrDePlace;
	}


	public void setNbrDePlace(int nbrDePlace) {
		this.nbrDePlace = nbrDePlace;
	}


	public Long getPrixTotale() {
		return prixTotale;
	}


	public void setPrixTotale(Long prixTotale) {
		this.prixTotale = prixTotale;
	}


	public User getUserRes() {
		return userRes;
	}


	public void setUserRes(User userRes) {
		this.userRes = userRes;
	}


	public Evenement getEvenementt() {
		return evenementt;
	}


	public void setEvenementt(Evenement evenementt) {
		this.evenementt = evenementt;
	}


}
