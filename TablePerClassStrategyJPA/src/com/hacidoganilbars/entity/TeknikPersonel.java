package com.hacidoganilbars.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

import lombok.Data;

@Entity
public @Data class TeknikPersonel extends Personel {
	
	private String nitelik;
	
	@Column(name="konu_uzmanlik")
	private String konuUzmanlik;

	public TeknikPersonel(String isim, String nitelik, String konuUzmanlik) {
		super(isim);
		this.nitelik = nitelik;
		this.konuUzmanlik = konuUzmanlik;
	}

	public TeknikPersonel() {
		super();
	}
	
	
	

}
