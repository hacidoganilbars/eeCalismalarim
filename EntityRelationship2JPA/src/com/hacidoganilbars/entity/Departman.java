package com.hacidoganilbars.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
public @Data class Departman {
	
	@Id
	@Column(name="departman_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int departmanId;
	
	@Column(name="dep_isim")
	private String isim;
	

}
