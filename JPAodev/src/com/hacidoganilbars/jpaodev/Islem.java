package com.hacidoganilbars.jpaodev;

import java.util.Arrays;

public class Islem {

	public static void main(String[] args) {
		DAO dao = new DAO();
		dao.connection();

		Kullanici kul1 = new Kullanici();
		kul1.setIsim("Ahmet");
		dao.save(kul1);

		Kullanici kul2 = new Kullanici();
		kul2.setIsim("Osman");
		dao.save(kul2);

		Kullanici kul3 = new Kullanici();
		kul3.setIsim("Hatice");
		dao.save(kul3);

		Yonetici yon1 = new Yonetici();
		yon1.setIsim("Hasan Hüseyin");
		yon1.setKullaniciList(Arrays.asList(kul1, kul2, kul3));
		dao.save(yon1);
		kul1.setYonetici(yon1);
		dao.save(kul1);
		kul2.setYonetici(yon1);
		dao.save(kul2);
		kul3.setYonetici(yon1);
		dao.save(kul3);

		yon1 = dao.em.find(Yonetici.class, 4);
		yon1.setIsim("Hacý Doðan Ýlbars");
		dao.save(yon1);
		

	}
}
