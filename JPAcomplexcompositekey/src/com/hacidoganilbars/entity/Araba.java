package com.hacidoganilbars.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
public @Data class Araba implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="araba_id")
	private int arabaId;
	
	private String marka;
	private String model;

}
