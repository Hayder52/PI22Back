package com.example.pi22.entities;

import lombok.Data;

import javax.jws.soap.SOAPBinding;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity

public class Invitation implements Serializable {

    @EmbeddedId
    private InvitationId id_Inv ;
    private String descptionInv ;
    @Temporal(TemporalType.DATE)
    private Date dateInvitation ;

    @ManyToOne
    @JoinColumn(name ="user_id",insertable = false,updatable = false)
    private User userInv ;

    @ManyToOne
    @JoinColumn(name="event_id",insertable = false,updatable = false)
    private Evenement evenement ;

	public InvitationId getId_Inv() {
		return id_Inv;
	}

	public void setId_Inv(InvitationId id_Inv) {
		this.id_Inv = id_Inv;
	}

	public String getDescptionInv() {
		return descptionInv;
	}

	public void setDescptionInv(String descptionInv) {
		this.descptionInv = descptionInv;
	}

	public Date getDateInvitation() {
		return dateInvitation;
	}

	public void setDateInvitation(Date dateInvitation) {
		this.dateInvitation = dateInvitation;
	}

	public User getUserInv() {
		return userInv;
	}

	public void setUserInv(User userInv) {
		this.userInv = userInv;
	}

	public Evenement getEvenement() {
		return evenement;
	}

	public void setEvenement(Evenement evenement) {
		this.evenement = evenement;
	}
    


}
