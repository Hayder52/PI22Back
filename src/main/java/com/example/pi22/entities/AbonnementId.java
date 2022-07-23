package com.example.pi22.entities;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable

public class AbonnementId implements Serializable {

@Column(name = "user_id")
private Long userId;

@Column(name = "activite_idd")
private Long activiteId;

public Long getUserId() {
	return userId;
}

public void setUserId(Long userId) {
	this.userId = userId;
}

public Long getActiviteId() {
	return activiteId;
}

public void setActiviteId(Long activiteId) {
	this.activiteId = activiteId;
}




}
