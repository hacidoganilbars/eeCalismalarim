package com.hacidoganilbars.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "calisan")
@NamedQuery(query = "Select c from Calisan c Where c.id = :id", name = "find Calisan by id")
public @Data class Calisan {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	private String isim;

	@Column(name = "soy_isim")
	private String soyIsim;

	private String gorev;

	private int maas;

	public Calisan() {

	}

	public Calisan(int maas, String isim, String soyIsim) {
		super();
		this.isim = isim;
		this.soyIsim = soyIsim;
		this.maas = maas;
	}

	public String toString() {
		return "Employee [Id= " + id + "  Ýsim= " + isim + "  Soy_Ýsim= " + soyIsim + "  Görev= " + gorev + "  Maas= "
				+ maas + "]";
	}

}
