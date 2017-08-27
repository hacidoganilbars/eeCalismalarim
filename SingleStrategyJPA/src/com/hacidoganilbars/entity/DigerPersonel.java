package com.hacidoganilbars.entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import lombok.Data;

@Entity
@DiscriminatorValue(value="DS")
public @Data class DigerPersonel extends Personel{
	
	@Column(name="alan_uzmanlik")
	String alanUzmanlik;

	public DigerPersonel( String isim, String alanUzmanlik) {
		super(isim);
		this.alanUzmanlik = alanUzmanlik;
	}

	public DigerPersonel() {
		super();
	}
	
	

}
