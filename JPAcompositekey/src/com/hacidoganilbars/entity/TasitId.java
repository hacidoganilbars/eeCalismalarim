package com.hacidoganilbars.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

public class TasitId implements Serializable {

	@Column(name = "seri_numarasi")
	int seriNo;

	String marka;

	public TasitId() {

	}

	public TasitId(int seriNo, String marka) {
		this.seriNo = seriNo;
		this.marka = marka;
	}

	@Override
	public int hashCode() {
		return seriNo + marka.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof TasitId) {
			TasitId tasitId = (TasitId) obj;
			return tasitId.seriNo == this.seriNo && tasitId.marka.equals(this.marka);
		}
		return false;
	}

}
