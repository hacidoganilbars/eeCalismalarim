package com.hacidoganilbars.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;

import lombok.Data;


@Entity
@IdClass(TasitId.class)
public @Data class Araba implements Serializable{
	
	@Id
	private int seriNo;

	@Id
	private String marka;

	private String isim;

}
