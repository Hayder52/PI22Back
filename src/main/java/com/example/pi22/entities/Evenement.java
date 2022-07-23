package com.example.pi22.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity

public class Evenement implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    private String nomEvent;
    private String duree ;
    private String description;
    private int nbrParticipant;
    @Temporal(TemporalType.DATE)
    private Date dateDebutEvent ;
    @Temporal(TemporalType.DATE)
    private Date dateFinEvent ;

    @JsonIgnore
    @OneToMany(mappedBy = "evenement")
    private Set<Invitation> invitations;

    @JsonIgnore
    @OneToMany(mappedBy = "evenementt")
    private Set<Reservation> reservations;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomEvent() {
		return nomEvent;
	}

	public void setNomEvent(String nomEvent) {
		this.nomEvent = nomEvent;
	}

	public String getDuree() {
		return duree;
	}

	public void setDuree(String duree) {
		this.duree = duree;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getNbrParticipant() {
		return nbrParticipant;
	}

	public void setNbrParticipant(int nbrParticipant) {
		this.nbrParticipant = nbrParticipant;
	}

	public Date getDateDebutEvent() {
		return dateDebutEvent;
	}

	public void setDateDebutEvent(Date dateDebutEvent) {
		this.dateDebutEvent = dateDebutEvent;
	}

	public Date getDateFinEvent() {
		return dateFinEvent;
	}

	public void setDateFinEvent(Date dateFinEvent) {
		this.dateFinEvent = dateFinEvent;
	}

	public Set<Invitation> getInvitations() {
		return invitations;
	}

	public void setInvitations(Set<Invitation> invitations) {
		this.invitations = invitations;
	}

	public Set<Reservation> getReservations() {
		return reservations;
	}

	public void setReservations(Set<Reservation> reservations) {
		this.reservations = reservations;
	}



}
