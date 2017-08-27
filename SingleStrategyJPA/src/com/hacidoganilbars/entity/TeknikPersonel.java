package com.hacidoganilbars.entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import lombok.Data;

@Entity
@DiscriminatorValue(value="TS")
public @Data class TeknikPersonel extends Personel {
	
	String nitelik;
	
	@Column(name="konu_uzmanlik")
	String konuUzmanlik;
	
	public TeknikPersonel( String isim, String nitelik, String konuUzmanlik) {
		super( isim);
		this.nitelik = nitelik;
		this.konuUzmanlik = konuUzmanlik;
	}
	public TeknikPersonel() {
		super();

	}
	
	
}
