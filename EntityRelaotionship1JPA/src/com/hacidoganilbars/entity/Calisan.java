package com.hacidoganilbars.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
public @Data class Calisan {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int calisanId;

	private String isim;

	private int ucret;

	private String vasif;

}
