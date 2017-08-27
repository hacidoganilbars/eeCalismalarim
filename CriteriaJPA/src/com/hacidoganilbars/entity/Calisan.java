package com.hacidoganilbars.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
public @Data class Calisan {
	
	@Id
//	@GeneratedValue(strategy=GenerationType.AUTO)
	private int cid;
	
	private String cIsim;
	
	private double ucret;
	
	private String vasif;

	public Calisan(int cid, String cname, double ucret, String vasif) {
		super();
		this.cid = cid;
		this.cIsim = cname;
		this.ucret = ucret;
		this.vasif = vasif;
	}

	public Calisan() {
		super();
	}
	
	

}
