package com.hacidoganilbars.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.TableGenerator;

import lombok.Data;

@Entity
public @Data class DigerKisiler implements Serializable {
	
	@Id	
	@TableGenerator(name="TABLE GENERATOR",table="id_tablosu",
	pkColumnName="id_tablo_adi",pkColumnValue="diger_kisi_id",valueColumnName="id_degeri",allocationSize=1)
	@GeneratedValue(strategy=GenerationType.TABLE,generator="TABLE GENERATOR")
	int id;
	
	String isim;

}
