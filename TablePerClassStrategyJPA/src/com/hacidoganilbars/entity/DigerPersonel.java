package com.hacidoganilbars.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

import lombok.Data;

@Entity
public @Data class DigerPersonel extends Personel{
	
	@Column(name="alan_uzmanlik")
	private String alanUzmanlik;

	public DigerPersonel(String isim, String alanUzmanlik) {
		super(isim);
		this.alanUzmanlik = alanUzmanlik;
	}

	public DigerPersonel() {
		super();
	}
	
	

}
