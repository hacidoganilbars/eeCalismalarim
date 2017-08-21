package com.hacidoganilbars.app;

import com.hacidoganilbars.dao.DAO;


public class IslemListele {

	public static void main(String[] args) {
		DAO dao = new DAO();
		
		dao.connection();
		
		dao.ogrList();
		dao.ogrtList();
		dao.mudList();
	

	}

}
