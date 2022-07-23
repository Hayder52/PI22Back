package com.example.pi22.entities;

import lombok.Data;

import javax.jws.soap.SOAPBinding;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity

public class Abonnement implements Serializable {

    @EmbeddedId
    private AbonnementId id ;
    private String name ;
    private int dureeParMois;
    @Temporal(TemporalType.DATE)
    private Date dateDebut;

    private Date dateFin ;
    private float prix;
    

    @ManyToOne
    @JoinColumn(name = "user_id",insertable = false,updatable = false)
    private User userAbn;
    @ManyToOne
    @JoinColumn(name = "activite_idd",insertable = false,updatable = false)
    private Activite activite ;
	public AbonnementId getId() {
		return id;
	}
	public void setId(AbonnementId id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDureeParMois() {
		return dureeParMois;
	}
	public void setDureeParMois(int dureeParMois) {
		this.dureeParMois = dureeParMois;
	}
	public Date getDateDebut() {
		return dateDebut;
	}
	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}
	public Date getDateFin() {
		return dateFin;
	}
	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}
	public float getPrix() {
		return prix;
	}
	public void setPrix(float prix) {
		this.prix = prix;
	}
	public User getUserAbn() {
		return userAbn;
	}
	public void setUserAbn(User userAbn) {
		this.userAbn = userAbn;
	}
	public Activite getActivite() {
		return activite;
	}
	public void setActivite(Activite activite) {
		this.activite = activite;
	}


}
