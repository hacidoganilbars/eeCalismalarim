package com.hacidoganilbars.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;

import lombok.Data;

@Entity
public @Data class Ruhsat1 implements Serializable {

	@Id
	private int ruhsatId;

	@MapsId
	@OneToOne
	@JoinColumn(name = "araba_id")
	private Araba arabaObj;

	@Column(name = "ruhsat_no")
	private String ruhsatNo;

}
