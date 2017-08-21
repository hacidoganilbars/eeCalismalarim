package com.hacidoganilbars.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity
public @Data class Ogrenci {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	private String isim;
	private String soyIsim;
	private String sinifi;
	
	@ManyToOne
	private Mudur mudur;
	
	@ManyToMany(mappedBy="ogrenciList")
	List<Ogretmen>ogretmenList;

}
