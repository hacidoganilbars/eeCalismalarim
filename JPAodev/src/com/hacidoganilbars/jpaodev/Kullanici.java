package com.hacidoganilbars.jpaodev;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.UniqueConstraint;

import lombok.Data;

@Entity
public @Data class Kullanici {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	private String isim;
	
	@ManyToOne
	private Yonetici yonetici;

}
