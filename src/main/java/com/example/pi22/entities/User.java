package com.example.pi22.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

import java.util.Set;

@Entity
@Data

public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    private String email;
    @JsonIgnore
    @OneToMany(mappedBy = "userInv")
    private Set<Invitation> invitations;

    @JsonIgnore
    @OneToMany(mappedBy = "userAbn")
    private Set<Abonnement> abonnement;

@OneToMany(mappedBy = "userRes")
    private Set<Reservation> reservations;

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public Set<Invitation> getInvitations() {
	return invitations;
}

public void setInvitations(Set<Invitation> invitations) {
	this.invitations = invitations;
}

public Set<Abonnement> getAbonnement() {
	return abonnement;
}

public void setAbonnement(Set<Abonnement> abonnement) {
	this.abonnement = abonnement;
}

public Set<Reservation> getReservations() {
	return reservations;
}

public void setReservations(Set<Reservation> reservations) {
	this.reservations = reservations;
}




}
