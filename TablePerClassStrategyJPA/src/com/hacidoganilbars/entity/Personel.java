package com.hacidoganilbars.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="calisan")
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public @Data class Personel implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String isim;
	
	public Personel( String isim) {
		super();
		this.isim = isim;
	}

	public Personel() {
		super();
	}
	
	
	
	

}
