package com.hacidoganilbars.app;

import java.util.ArrayList;
import java.util.List;

import com.hacidoganilbars.dao.DAO;
import com.hacidoganilbars.entity.Ogrenci;
import com.hacidoganilbars.entity.Ogretmen;

public class IslemListele {

	public static void main(String[] args) {
		DAO dao = new DAO();

		Ogrenci ogrenci = new Ogrenci();
		dao.getOgrenci();
		

	}

}
