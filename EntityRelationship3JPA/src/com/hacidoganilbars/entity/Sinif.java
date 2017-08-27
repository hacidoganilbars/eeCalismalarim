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
public @Data class Sinif {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(name="sinif_isim")
	private String sinifIsim;
	
	@ManyToMany(targetEntity=Ogretmen.class)
	private Set ogretmenSet;

	public Sinif(int id,String sinifIsim, Set ogretmenSet) {
		super();
		this.id=id;
		this.sinifIsim = sinifIsim;
		this.ogretmenSet = ogretmenSet;
	}

	public Sinif() {
		super();
	}
	
	
	 
}
