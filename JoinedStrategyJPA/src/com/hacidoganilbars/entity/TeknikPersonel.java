package com.hacidoganilbars.entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

import lombok.Data;

@Entity
@PrimaryKeyJoinColumn(referencedColumnName="id")
@DiscriminatorValue(value="TP")
public @Data class TeknikPersonel extends Personel{

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
