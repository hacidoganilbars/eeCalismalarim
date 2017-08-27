package com.hacidoganilbars.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.Data;

@Entity
public @Data class Ogretmen {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(name = "ogretmen_isim")
	private String isim;

	@Column(name = "ders_konu")
	private String konu;

	@ManyToMany(targetEntity = Sinif.class)
	private Set sinifSet;

	public Ogretmen( int id,String isim, String konu, Set sinifSet) {
		super();
		this.id=id;
		this.isim = isim;
		this.konu = konu;
		this.sinifSet = sinifSet;
	}

	public Ogretmen() {
		super();
	}

}
