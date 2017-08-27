
package com.hacidoganilbars.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity
public @Data class Calisan {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "calisan_id")
	private int calisanId;

	private String calisanIsim;

	private int maas;

	private String vasif;

	@ManyToOne
	private Departman departman;

	public Calisan(int calisanId, String calisanIsim, int maas, String vasif) {
		super();
		this.calisanId = calisanId;
		this.calisanIsim = calisanIsim;
		this.maas = maas;
		this.vasif = vasif;
	}

	public Calisan() {
		super();
	}

}