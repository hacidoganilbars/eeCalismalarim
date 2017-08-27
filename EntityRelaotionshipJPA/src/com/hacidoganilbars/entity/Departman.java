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
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="departman_id")
	private int Id;

	private String isim;

	public Departman(int Id, String isim) {
		super();
		this.Id = Id;
		this.isim = isim;
	}

	public Departman() {
		super();
	}

}