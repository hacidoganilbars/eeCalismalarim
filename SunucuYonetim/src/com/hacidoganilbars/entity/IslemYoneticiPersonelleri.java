package com.hacidoganilbars.entity;

import java.util.List;

public class IslemYoneticiPersonelleri {
	public static void main(String[] args) {
		DAO dao = new DAO();
		dao.connection();
		Yonetici yonetici = dao.em.find(Yonetici.class, 5);
		System.out.println(yonetici.getName());
		System.out.println("-----");
		List<Person> personList = yonetici.getPersonList();
		for (int i = 0; i < personList.size(); i++) {
			System.out.println("----ISIM PERSONEL---");
			System.out.println(personList.get(i).getName());
			System.out.println("----PERSONEL ADRES---");
			System.out.println(personList.get(i).getAdres().getName());
		}
	}
}
