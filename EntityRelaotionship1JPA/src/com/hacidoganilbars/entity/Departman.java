package com.hacidoganilbars.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

@Entity
public @Data class Departman {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "departman_id")
	private int departmanId;

	@Column(name = "departman_isim")
	private String departmanIsim;

	@OneToMany(targetEntity = Calisan.class)
	private List calisanList;

	public Departman(int departmanId, String departmanIsim) {
		super();
		this.departmanId = departmanId;
		this.departmanIsim = departmanIsim;
	}

	public Departman() {
		super();
	}

}
