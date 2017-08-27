package com.hacidoganilbars.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Data;

@Entity
public @Data class Calisan {
	
	@Id
	@Column(name="calisan_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int calisanId;
	
	private String isim;
	
	private String vasif;
	
	private int ucret;
	
	@OneToOne
	private Departman departman;

}
