package com.hacidoganilbars.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import lombok.Data;

@Entity
public @Data class Ogretmen {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int id;
	
	String isim;
	String soyIsim;
	String brans;
	
	
	@ManyToMany(fetch=FetchType.EAGER)
	@JoinTable(name="ogretmen_ogrenci",joinColumns=@JoinColumn(name="ogretmen_id"),
	inverseJoinColumns=@JoinColumn(name="ogrenci_id"))
	List<Ogrenci> ogrenciList;

}
