package com.hacidoganilbars.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.hacidoganilbars.entity.Calisan;

public class FindingCalisan {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPAtut");
		EntityManager em = emf.createEntityManager();

		Calisan calisan = em.find(Calisan.class, 1);

		System.out.println("ID: " + calisan.getId());
		System.out.println("�sim: " + calisan.getIsim());
		System.out.println("Soy �sim: " + calisan.getSoyIsim());
		System.out.println("G�rev: " + calisan.getGorev());
		System.out.println("Maa�: " + calisan.getMaas());

		em.close();
		emf.close();
	}
}
