package com.hacidoganilbars.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.TableGenerator;

import lombok.Data;

@Entity
public @Data class Kisi implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@TableGenerator(name="TABLE GENERATORD",table="id_tablosu",
	pkColumnName="id_tablo_adi",pkColumnValue="diger_kisi_id",valueColumnName="id_degeri",allocationSize=1)
	@GeneratedValue(strategy=GenerationType.TABLE,generator="TABLE GENERATORD")
	private int id;
	
	private String isim;
	
	

}
